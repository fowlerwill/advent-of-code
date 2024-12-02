<?php

$input = file_get_contents('php://stdin', 'r') ?? die("No input provided\n");

$stringmap = [
  'one' => 1,
  '1' => 1,
  'two' => 2,
  '2' => 2,
  'three' => 3,
  '3' => 3,
  'four' => 4,
  '4' => 4,
  'five' => 5,
  '5' => 5,
  'six' => 6,
  '6' => 6,
  'seven' => 7,
  '7' => 7,
  'eight' => 8,
  '8' => 8,
  'nine' => 9,
  '9' => 9,
];
$as_words = implode('|', array_keys($stringmap));
$pt_two_total = 0;

foreach(explode("\n", $input) as $line) {
  echo "Line: {$line}\n";
  $matches = [];
  preg_match_all("/({$as_words})?/", $line, $matches);
  $first = @array_shift(array_filter($matches[0], fn($item) => !!$item));

  $lol = strrev($as_words);
  preg_match_all("/({$lol})?/", strrev($line), $matches);
  $last = strrev(@array_shift(array_filter($matches[0], fn($item) => !!$item)));

  echo "First: {$first}, Last: {$last}\n";
  $lineval = intval("{$stringmap[$first]}{$stringmap[$last]}");
  echo "Lineval: {$lineval}\n";
  
  $pt_two_total += $lineval;
}
echo "Part 2 Total: {$pt_two_total}\n";