
clean:
	@echo "Cleaning..."
	rm -rf out/*

compile: clean
	@echo "Compiling..."
	javac -d out *.java 

part1: compile
	@echo "Running..."
	java -cp out PartOne

part2: compile
	@echo "Running..."
	java -cp out PartTwo