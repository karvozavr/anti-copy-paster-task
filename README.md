# Anti-CopyPaster task

Author: Dmitrii Abramov.

This plugin shows alert message when user pastes text to the editor:

![screenshot](images/alert.png)

This plugin is based on code of another my plugin for __Partial Extract Method Refactoring__ task. For the most technical details see https://github.com/karvozavr/ast-info-plugin.

## Implemntation details 

### AST by selection 

https://github.com/karvozavr/ast-info-plugin

### Copypaste alert message 

Alert message is created using Messages API of Intellij platform. 

Paste event processing is implemented by extending Intellij extension point `CopyPastePreProcessor`.
