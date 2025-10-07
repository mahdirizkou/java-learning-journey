# ☕ INTRODUCING JAVA

Java is a **high-level, object-oriented programming language** used to build all kinds of applications — from mobile apps (like Android apps) and web applications to desktop software, games, and enterprise systems.

##  Presentation JAVA :

### Architecture du langage JAVA: 

```text
+------------------------------------+
|   source code (file.java)          |
+------------------------------------+
            ↓
+------------------------------------+   
|    javac (java compiler)           |
+------------------------------------+
  javac convert source code to bytecode     
            ↓
+------------------------------------+   
|    jvm (java virtual machine)      |
+------------------------------------+
translate bytecode into host machine code
```
#### deeper Architecture: 
```text
+------------------------------------+
|   Java Application / Source Code   |
+------------------------------------+
                ↓
+------------------------------------+
|     Java Development Kit (JDK)     |
|   └── Compiler (javac)             |
|   └── Tools & Libraries (JRE)      |
+------------------------------------+
                ↓
+------------------------------------+
|   Java Virtual Machine (JVM)       |
|   └── Class Loader                 |
|   └── Bytecode Verifier            |
|   └── Interpreter / JIT Compiler   |
|   └── Runtime Data Areas           |
+------------------------------------+
                ↓
+------------------------------------+
|     Operating System + Hardware    |
+------------------------------------+
```
### Basic concepts: 

- #### JDK (Java Development Kit):

The JDK is the complete package used by developers.
It includes:
    - Compiler (javac) – converts .java source code into .class bytecode.
    - JRE (Java Runtime Environment) – contains libraries and JVM to run programs.
    - Development tools – for debugging, monitoring, etc.

- #### JRE (Java Runtime Environment):

The JRE provides everything you need to run Java programs:
    - JVM (Java Virtual Machine)
    - Core Libraries (e.g., java.lang, java.util)
    - Runtime files.

- #### JVM (Java Virtual Machine):

It executes Java bytecode and makes Java platform-independent.
JVM main components:

    1. Class Loader → Loads .class files into memory.

    2. Bytecode Verifier → Ensures no unsafe code (security).

    3. Interpreter / JIT Compiler → Converts bytecode into native machine code.

    4. Runtime Data Areas → Memory areas like:

         - Heap (for objects)

         - Stack (for methods)

         - Method Area (for class info)

         - PC Register and Native Method Stack
