# 📚 Vocabulary MCP Server

A simple and lightweight MCP (Model Context Protocol) server for managing your personal vocabulary collection.

## ✨ Features

- **Add Words**: Build your personal vocabulary database
- **Random Practice**: Get random words for practice sessions
- **Local Storage**: All data stays on your machine
- **MCP Compatible**: Works seamlessly with Claude and other MCP clients

## 🚀 Quick Start

```bash
# Clone the repository
git clone https://github.com/abipriya-rajendran/vocab-mcp-server.git
cd vocab-mcp-server

# Install dependencies
mvn clean install

# Package into a jar file
mvn clean compile package
```

## 🛠️ Claude desktop configuration
```json
{
  "mcpServers": {
    "Vocab server": {
      "command": "java",
      "args": [
        "-jar",
        "/Users/your-path/vocab-mcp-server/target/vocab-mcp-server-0.0.1-SNAPSHOT.jar"
      ]
    }
  }
}

```

## 🎯 Usage

### Add a new word
<img width="835" height="480" alt="image" src="https://github.com/user-attachments/assets/4f915edf-c64c-4072-a568-20f9d45d48dc" />


### Get a random word for practice along with the meaning and simple sentences to practice
<img width="825" height="756" alt="image" src="https://github.com/user-attachments/assets/cd41ff3a-9eb9-477a-906f-bfc7b307674f" />


## 📝 Perfect For

- Language learners expanding their vocabulary
- Students preparing for standardized tests
- Anyone building a personal word collection
- Practice sessions with spaced repetition
