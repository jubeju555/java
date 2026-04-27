# VS Code Environment — Extensions & Variables

This folder holds workspace-scoped VS Code settings. Below is a quick reference for every recommended extension, what it does, and the key environment variables it injects at runtime.

---

## Extension Groups

### Java

| Extension ID | Purpose |
|---|---|
| `vscjava.vscode-java-pack` | Meta-pack that bundles the core Java extensions |
| `vscjava.vscode-maven` | Maven project management and lifecycle commands |
| `vscjava.vscode-gradle` | Gradle project management and lifecycle commands |
| `vscjava.vscode-java-debug` | JDWP-based debugger for Java |
| `vscjava.vscode-java-test` | JUnit / TestNG test runner |

**Key environment variables set by `vscjava.vscode-java-debug`:**

| Variable | Description |
|---|---|
| `VSCODE_JDWP_ADAPTER_ENDPOINTS` | Colon-separated list of debug-adapter endpoint sockets (usually a single entry in local dev) |
| `VSCODE_JAVA_EXEC` | Path to the JDK `java` binary used for debugging |
| `PATH` | Prepends the no-config helper scripts directory |

---

### Git / Version Control

| Extension ID | Purpose |
|---|---|
| `eamodio.gitlens` | Rich Git history, blame, and GitKraken CLI integration |

**Key environment variables set by `vscode.git` (built-in) and `eamodio.gitlens`:**

| Variable | Description |
|---|---|
| `GIT_ASKPASS` | Path to the VS Code Git credential-helper script |
| `VSCODE_GIT_ASKPASS_NODE` | Node.js binary used by the credential helper |
| `VSCODE_GIT_IPC_HANDLE` | Unix socket path for Git ↔ VS Code IPC |
| `GK_GL_ADDR` | TCP address for the GitKraken (`GK`) ↔ GitLens (`GL`) CLI integration |
| `GK_GL_PATH` | Path to the GitLens (`GL`) IPC server socket used by the GitKraken (`GK`) CLI |

---

### AI / Copilot

| Extension ID | Purpose |
|---|---|
| `GitHub.copilot` | Inline AI code completions |
| `GitHub.copilot-chat` | Conversational AI chat panel |

**Key environment variables set by `GitHub.copilot-chat`:**

| Variable | Description |
|---|---|
| `PATH` | Prepends Copilot debug-command helpers and the GitHub CLI |

---

### Python

| Extension ID | Purpose |
|---|---|
| `ms-python.python` | Python language support, linting, and REPL |

**Key environment variables set by `ms-python.python`:**

| Variable | Description |
|---|---|
| `PYTHONSTARTUP` | Path to the shell-integration startup script |
| `PYTHON_BASIC_REPL` | Set to `1` to use the built-in basic REPL instead of the native terminal REPL |

---

## Modifying This Configuration

- **Add an extension**: append its ID to the matching group in `extensions.json` and document any new variables it exposes in this file.
- **Remove an extension**: delete its ID from `extensions.json` and remove the corresponding rows from this file.
- **Override a variable**: add a workspace-level entry to `.vscode/settings.json`; do not hard-code paths here.
- All changes are tracked by Git — commit and push so teammates get the same environment automatically.
