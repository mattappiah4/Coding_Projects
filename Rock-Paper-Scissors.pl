sub conv($){
	my($first) = @_;
	if ($first == 0){$out = "Rock";}
	elsif ($first == 1){$out="Paper";}
	else {$out = "Scissors";}	
	return($out);
	
}
sub judge($$){
	my($p1, $p2) = @_;
	return "Tie" if $p1==$p2;
	
	if (($p1==0&&$p2==2) ||
		($p1==1&&$p2==0) ||
		($p1==2&&$p2==1))
		{
			return "Player";
		} else {
			return "Computer";
		}
}

my @history;
my $player_wins = 0;
my $computer_wins = 0;
my $ties = 0;

do{
	print "====== Menu ======\n";
	print "1: Play game \n";
	print "2: Display game history \n";
	print "3: Show overall score \n";
	print "4: Quit\n\n";
	$in=<STDIN>;
	chomp($in);
	
		if ($in == 1){ 
		print "Enter 0=Rock, 1=Paper, 2=Scissors: ";
		my $player = <STDIN>;
		chomp($player);
		
		my$computer = int(rand(3));
		
		my $result = judge($player, $computer);
		print "You chose ", conv($player), "\n";
		print "Computer chose ", conv($computer), "\n";
		print "Result: $result wins!\n\n\n";
		
		$result = judge($player, $computer);
		
		push @history, "You: ".conv($player)." | Computer: ".conv($computer). " | Result: $result";
		
		$player_wins++	if $result eq "Player";
		$computer_wins++	if $result eq "Computer";
		$ties++	if $result eq "Tie";
		}
	elsif ($in == 2){
		print "=== Game History ===\n\n";
		if (@history){
			print "$_\n" for @history;
		} else {
			print "No games played.\n\n\n";
		}
		}
	elsif ($in == 3) {
		print "=== Score ===\n\n";
		print "Player: $player_wins\n";
		print "Computer: $computer_wins\n";
		print "Ties: $ties\n\n\n";
		}
}while ($in != 4);
print "Good bye! \n";