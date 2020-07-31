+--------------------+----------------------+-------------+--------------+-----------------------------------------+
| Name               | Role                 | Consumable? | Resolveable? | Description                             |
+--------------------+----------------------+-------------+--------------+-----------------------------------------+
| api                | Declaring            |      no     |      no      | This is where you should declare        |
|                    | API                  |             |              | dependencies which are transitively     |
|                    | dependencies         |             |              | exported to consumers, for compile.     |
+--------------------+----------------------+-------------+--------------+-----------------------------------------+
| implementation     | Declaring            |      no     |      no      | This is where you should                |
|                    | implementation       |             |              | declare dependencies which are          |
|                    | dependencies         |             |              | purely internal and not                 |
|                    |                      |             |              | meant to be exposed to consumers.       |
+--------------------+----------------------+-------------+--------------+-----------------------------------------+
| compileOnly        | Declaring compile    |     yes     |      yes     | This is where you should                |
|                    | only                 |             |              | declare dependencies                    |
|                    | dependencies         |             |              | which are only required                 |
|                    |                      |             |              | at compile time, but should             |
|                    |                      |             |              | not leak into the runtime.              |
|                    |                      |             |              | This typically includes dependencies    |
|                    |                      |             |              | which are shaded when found at runtime. |
+--------------------+----------------------+-------------+--------------+-----------------------------------------+
| runtimeOnly        | Declaring            |      no     |      no      | This is where you should                |
|                    | runtime              |             |              | declare dependencies which              |
|                    | dependencies         |             |              | are only required at runtime,           |
|                    |                      |             |              | and not at compile time.                |
+--------------------+----------------------+-------------+--------------+-----------------------------------------+
| testImplementation | Test dependencies    |      no     |      no      | This is where you                       |
|                    |                      |             |              | should declare dependencies             |
|                    |                      |             |              | which are used to compile tests.        |
+--------------------+----------------------+-------------+--------------+-----------------------------------------+
| testCompileOnly    | Declaring test       |     yes     |      yes     | This is where you should                |
|                    | compile only         |             |              | declare dependencies                    |
|                    | dependencies         |             |              | which are only required                 |
|                    |                      |             |              | at test compile time,                   |
|                    |                      |             |              | but should not leak into the runtime.   |
|                    |                      |             |              | This typically includes dependencies    |
|                    |                      |             |              | which are shaded when found at runtime. |
+--------------------+----------------------+-------------+--------------+-----------------------------------------+
| testRuntimeOnly    | Declaring test       |      no     |      no      | This is where you should                |
|                    | runtime dependencies |             |              | declare dependencies which              |
|                    |                      |             |              | are only required at test               |
|                    |                      |             |              | runtime, and not at test compile time.  |
+--------------------+----------------------+-------------+--------------+-----------------------------------------+