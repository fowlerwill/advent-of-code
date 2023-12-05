<?php

$input = file_get_contents('php://stdin', 'r') ?? die("No input provided\n");

$lines = explode("\n", $input);
$total = 0;
foreach($lines as $line) {
  $matches = [];
  preg_match_all('/\d/', $line, $matches);
  echo "Line: {$line}\n";
  $first = array_shift($matches[0]);
  $last = array_pop($matches[0]) ?? $first;
  echo "First: {$first}, Last: {$last}\n";
  $lineval = intval("{$first}{$last}");
  echo "Lineval: {$lineval}\n";
  $total += $lineval;
}
echo "Part 1 Total: {$total}\n";
