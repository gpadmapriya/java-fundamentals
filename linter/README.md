### Linter
Reads a javascript file and generates an error message when a line does not end in a semicolon.
Sample error message - "Line 3: Missing semicolon."
- An error is not shown if the line in the input file is empty.
- An error is not shown if the line ends with an opening curly brace {
- An error is not shown if the line ends with an closing curly brace }
- An error is not shown if the line contains if or else