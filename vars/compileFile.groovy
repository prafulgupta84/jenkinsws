import eu.inuits.FileCompiler

def call (String project) {
fc = new FileCompiler(this, project)
fc.analyze('requirement.txt')
fc.analyze('setup.py')
}

