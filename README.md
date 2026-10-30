# Rubik's Cube Simulator

A command-line Rubik's cube in Java. It starts from a scrambled cube and lets you turn the whole cube or spin the front face, printing an unfolded view after every move.

```
	W Y R
	B W R          top
	B O W

B Y Y 	W O G 	W B G     left · front · right
O B W 	Y O O 	B G O
G G Y 	O R B 	R B O

	G R Y
	Y Y B          bottom
	O W G

	B B O
	W R Y          back
	O B Y
```

## Run

```bash
javac *.java
java RoobikRunner
```

Commands: `right`, `left`, `up`, `down` turn the whole cube; `CW` and `CCW` spin the front face; `done` exits.

## Design

- `RoobikFace` holds the nine stickers of one face and rotates them clockwise or counterclockwise.
- `RoobikCube` holds six faces and moves them between positions when the cube turns.
- `RoobikRunner` reads commands and prints the cube.

Every move has an inverse (`right`/`left`, `up`/`down`, `CW`/`CCW`), and four quarter turns return the cube to where it started.

This was an early object-oriented programming project. Turning a single face does not move the edge stickers of the neighboring faces, so it models cube orientation rather than full Rubik's-cube moves.
