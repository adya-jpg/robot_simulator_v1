# robot starts at (0,0), can move up, down, left, right within a 5x5 grid.
robot_position = [0, 0]

# simple 5x5 grid.
grid_size = 5

# loop, taking user input for movement commands.
while True:
    command = input("enter command (up/down/left/right/quit): ")()
    
    if command == "quit":
        break
    elif command == "up":
        if robot_position[1] < grid_size - 1:
            robot_position[1] += 1
    elif command == "down":
        if robot_position[1] > 0:
            robot_position[1] -= 1
    elif command == "left":
        if robot_position[0] > 0:
            robot_position[0] -= 1
    elif command == "right":
        if robot_position[0] < grid_size - 1:
            robot_position[0] += 1
    else:
        print("Invalid command.")
    
    print(f"Robot is now at: {robot_position}")
