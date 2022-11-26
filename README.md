# Java-File-Handling
To read or write on the file is nothing but a file handling.
## File I/O classes:
### i)	File Class
### ii)	FileReader Class
### iii)	FileWriter Class
### iv)	BufferedWriter
### v)	Buffered Reader
### vi)	PrintWriter

## File Class Constructor:
### i)	File f = new File (String name); //create file object
### ii)	File f = new File (String directory, String name); //create file with directory
### iii)	File f = new File (previous file obj ref, String name); //create file with the help of previous directory

#### Some Important File Method
1)	Boolean, f.creatNewFile()
2)	Boolean, f.exists()
3)	Boolean, f.mkdir()
4)	Boolean, f.isFile()
5)	Boolean, f.isDirectory()
6)	String [], f.list()
7)	Long, f.length()
