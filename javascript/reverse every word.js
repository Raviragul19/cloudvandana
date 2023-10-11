const prompt = require("prompt-sync")();
const inputText = prompt("Enter input text: ");

const words = inputText.split(' '); // Split the input sentence into words
const reversedWords = words.map(word => reverseWord(word)); // Reverse each word
const reversedSentence = reversedWords.join(' '); // Join the reversed words back into a sentence
console.log(`Reversed sentence: ${reversedSentence}`);

function reverseWord(word) {
  let reversed = '';
  for (let i = word.length - 1; i >= 0; i--) {
    reversed += word[i];
  }
  return reversed;
}
