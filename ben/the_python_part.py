import subprocess


if __name__ == "__main__":

    print("Hello I am Python")

    # build command
    cmd = "./python_to_java.sh"

    # create a list of strings for shell script
    to_bash = ['bash',cmd]

    # run shell
    subprocess.call(to_bash)