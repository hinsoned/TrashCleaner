# TrashCleaner

**TrashCleaner** is a small Java utility that moves all `.jpg` and `.png` files from your Desktop to the system Trash/Recycle Bin. I initially developed it as I am an avid Anki user (for now) and take a lot of screanshots that clutter my desktop but serve no long-term purpose. 

---

## Features
- Moves top-level Desktop `.jpg` and `.png` files to Trash.  
- Prints each file name as it’s moved.  
- Works on Windows, macOS, and Linux desktops that support Java’s Desktop API.  

---

## Requirements
- Java JDK 11 or higher  
- Desktop environment with Trash/Recycle Bin support

---

### Compile
```bash
javac MoveImagesToTrash.java
