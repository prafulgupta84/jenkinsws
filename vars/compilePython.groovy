import static eu.inuits.PythonCompiler.*

def call (String directory = '.') {
    echo("Compiling ${directory}")
    compileDirectory(this, directory)
}

#def call(String directory = '.') {  
#  sh """find ${directory} -name '*.py' -print0 |  xargs -0 -t -L 1 python2 -m py_compile"""
#}
