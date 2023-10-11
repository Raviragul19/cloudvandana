const prompt = require('prompt-sync')();

const n = parseInt(prompt('Enter the number of elements:'));
const arr = [];

for (let i = 0; i < n; i++) {
    const element = parseInt(prompt(`Enter element ${i + 1}:`));
    arr.push(element);
}

bubbleSort(arr);
console.log('Sorted array:', arr);

function bubbleSort(arr) {
    const len = arr.length;
    for (let i = 0; i < len; i++) {
        for (let j = 0; j < len - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap elements if they are in the wrong order
                const temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
