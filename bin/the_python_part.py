import subprocess


# cmd to run bash script
print("Hello I am Python")
cmd = "./python_to_java.sh"
to_bash = ['bash',cmd]

subprocess.call(to_bash)