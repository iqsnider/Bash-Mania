use std::process::Command;

fn main() {
    println!("\nHello, I am rust");

    Command::new("./a.out").spawn();
}

