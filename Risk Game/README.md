Risk Game

This is a game of conquer and strategy in which the player need to claim all the available territories to win

This game has 2 maps Egypt and America

Player 1 can be a human or an AI while player 2 can only be an AI

Available AIs are

	-Completely passive agent : play style chooses a state from the players  territory with the fewest army number then adds the additional army number to it.
	
	-Aggressive agent : play style chooses a state from the players  territory with the most army number then adds the additional army number to it, and then attacks the state with the most army number in its adjacent state list. 
	
	-Nearly passive agent : play style gets state from the players  territory with the least army number then adds the additional army number to it, and then attacks the state with the least army number in its adjacent state list. 
	
	-Greedy agent:
		
		- for(int j=0;j<parent.adjacentlist.size();j++): after executing this for loop get all states adjacent to territory states able to attack(different color and less army number).

		- PriorityQueue<State> arr = new PriorityQueue<>(new Comparator<State>()): this priority queue contain comparator compares states.heuristic when removing from this queue it returns state with highest state heuristic.

		- for(int i=0;i<childofstate.size();i++): this for loop iterates on childofstate array list then calculate heuristic in each state in this array

		-heauristic = number of adjacent states which doesn’t have same color(doesn’t belong to the same player)

		-attack the child with most heuristic poped from the queue (since the greedy idea is to conquer the biggest amount of the map) attack this state with territorial state with highest army number.
	
	-AStar agent :
		
		- for(int j=0;j<parent.adjacentlist.size();j++): after executing this for loop get all states adjacent to territory states able to attack(different color and less army number).
		
		- PriorityQueue<State> arr = new PriorityQueue<>(new Comparator<State>()): this priority queue contain comparator compares states.function when removing from this queue it returns state with highest state function.
		
		- for(int i=0;i<childofstate.size();i++): this for loop iterates on childofstate array list then calculate function in each state in this array
		
		-function = heuristic + gofn
		
		-heauristic = number of adjacent states which doesn’t have same color(doesn’t belong to the same player)
		
		-gofn= number of times a given state has been attacked in a game session
		
		-attack the child with most heuristic poped from the queue (since the greedy idea is to conquer the biggest amount of the map) attack this state with territorial state with highest army number.
	
	-Minimax agent :
		
		-getChild function:given a list of states of players territory this function returns all available next moves.ex: input=[27,23]  output=[[27,23,16],[27,23,26],[27,23,21],etc..] output has no duplicates and all states are viable states to be attacked next
		
		-play style: calls  Minimax function then arrange the players territory lists according to this function’s algorithm
		
		-minimax function: loops around depth and goal state in order to get leaf node’s heuristics  separates its idea into 2 ways of thinking first way is chooses the children with max heuristic the other chooses the children with min heuristic, a Boolean (maxPlayer) determines which way of thinking is applied, after recursion Boolean is changed allowing  for the opposing idea to be applied [we also added alpha/beta pruning to the minimax function to decrease number of nodes evaluated by minimax].
