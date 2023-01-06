 /*
  Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. 
  If the "compressed" string would not become smaller than the original string, your method should return the original string.
 */

#include <iostream>
 
string compress(const string &s)
{
    string ns{};
    char last = s[0];
    unsigned count = 1;
    for (int i = 1; i <= s.size(); i++) {
        if (i != s.size() && s[i] == last)
            count++;
        else {
            ns += last;
            ns.append(to_string(count));
            count = 1;
            last = s[i];
        }
    }
    if (ns.size() < s.size()) {
        return ns;
    } else {
        return s;
    }
}
 
int main(int argc, char *argv[])
{
    string s = "aabccddddccaaaaaaaaaaaaaaaaaaaaaaaaaaacaaa";
    cout << compress(s) << endl;
    return 0;
}
