package com.example.vocab_mcp_server;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;

@Service
public class VocabService {
    String filePath = "/Users/abipriya/Documents/vocab-mcp-server/data/vocab.txt";

    @Tool(name = "getRandomVocab", description = "Get a random vocabulary from the list")
    public String getRandomVocab() {
        Random random = new Random();
        List<String> vocabList;
        try {
            vocabList = Files.readAllLines(Paths.get(filePath))
                    .stream()
                    .toList();
        } catch (IOException e) {
            return "Failed: Exception occurred while fetching a random vocabulary from the file. " + e.getMessage();
        }
        return vocabList.get(random.nextInt(vocabList.size()));
    }

    @Tool(name = "addVocab", description = "Add a new vocabulary to the list")
    public String addVocab(String vocabulary) {
        if (vocabulary.isEmpty()) {
            return "Failed: Invalid vocabulary to add";
        }
        try {
            Files.writeString(Paths.get(filePath), System.lineSeparator() + vocabulary, StandardOpenOption.APPEND);
        } catch (IOException e) {
            return "Failed: Exception occurred while writing the new vocabulary to file. " + e.getMessage();
        }
        return "Success: Added the new vocabulary";
    }

}
