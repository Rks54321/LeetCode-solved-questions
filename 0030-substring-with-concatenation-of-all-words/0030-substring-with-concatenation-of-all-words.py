from collections import Counter

class Solution:
    def findSubstring(self, s, words):
        if not s or not words:
            return []

        word_len = len(words[0])
        total_words = len(words)
        window_size = word_len * total_words

        word_count = Counter(words)
        result = []

        # Try all starting offsets
        for i in range(word_len):
            left = i
            count = 0
            window_map = {}

            for right in range(i, len(s) - word_len + 1, word_len):
                word = s[right:right + word_len]

                if word in word_count:
                    window_map[word] = window_map.get(word, 0) + 1
                    count += 1

                    # If freq exceeds, shrink window
                    while window_map[word] > word_count[word]:
                        left_word = s[left:left + word_len]
                        window_map[left_word] -= 1
                        left += word_len
                        count -= 1

                    # If all words matched
                    if count == total_words:
                        result.append(left)

                else:
                    # Reset window
                    window_map.clear()
                    count = 0
                    left = right + word_len

        return result
        