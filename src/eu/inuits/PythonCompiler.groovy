package eu.inuits
class PythonCompiler {
static def compileDirectory(script, directory)	{
script.sh """find ${directory} -name '*.py' \
 -print0 | xargs -0 -t -L 1 python -m py_compile"""
}
}

