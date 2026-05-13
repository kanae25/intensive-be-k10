# Student Grades Calculator

## Task Description

### Input:
- Enter Average point of Mathematics
- Enter Average point of English
- Enter Average point of Literature

### Grading Scale:
- Grade F: < 5
- Grade D: >= 5
- Grade C: >= 6
- Grade B: >= 7
- Grade A: >= 8
- Grade S: >= 9

### Calculation Rules:

1. **Calculate Student Grade** based on the average point of 3 subjects

2. **Minimum Grade Rule**: 
   - Student AVERAGE Grade would be bigger than the minimum subject's grade by 1 grade
   - Example: Average Point: 8.5 (A) but English Point is 5 (D) -> Student's grade is C

3. **Fail Subject Rule**:
   - If there is one FAIL subject -> Student FAIL

### Output:
- Print grade of all subjects
- Print Average of all subjects (rounded to 2 digits) and Grade of student
- Print corresponding message based on final grade:
  - **S** -> print excellent student
  - **A** -> print good student
  - **B** -> print normal student
  - **C** -> print average student
  - **D** -> print not bad student
  - **F** -> print fail student

### Example:
```
Math: 10
Literature: 10
English: 5 (D) -> Average: 8.33 (A) -> Print "good student" (difference: 3 grades) -> downgrade to C
```