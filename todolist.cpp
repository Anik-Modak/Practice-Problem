#include<bits/stdc++.h>
#include <cstdlib>
#include <fstream>

using namespace std;

string path;
ofstream the_path(path.c_str(), ios::out);

void clean_buffer() {
    cin.clear();
    cin.sync();
}

void addItems(int amount_items) {

    clean_buffer();
    ofstream add(path.c_str(), ios::app);
    string item;
    getchar();
    for(int i = 1; i <= amount_items; i++) {
        cout << "Enter item # " <<i<<" ";
        getline(cin, item);
        add << item << endl;
    }
    add.close();
    cout << endl;
}

int menu() {

    int choice;
    cout << "\t The Menu\n" << endl;
    cout << "[1] - Show To Do list." << endl;
    cout << "[2] - Add new items to To Do list." << endl;
    cout << "[3] - Remove items from To Do list." << endl;
    cout << "[4] - Exit the program." << endl;
    cin >> choice; cout << endl;
    return choice;
}

bool showList() {

    cout << "\t The To Do List\n" << endl;
    string line;
    ifstream show(path.c_str(), ios::in);
    getline(show, line);
    if(show.eof()) {
        cout << "\t*To Do list is empty.*" << endl;
        cout << "\t**********************" << endl;
        return 1;
    }
    for(int i = 1; !show.eof(); i++) {
        cout << i << "." << " " << line << endl;
        getline(show, line);
    }
    return 0;
}

void removeItems() {

    cout << "\t Remove an Item\n" << endl;
    bool check = showList();
    if (check == true) {
        cout << endl;
        cout << "There are no items to remove." << endl;
        exit(1);
    }

    clean_buffer();
    ifstream fin(path.c_str(), ios::in);

    clean_buffer();
    int item,element=1;
    cout << "Item number which u delet #: ";
    cin >> item;

    ofstream temp;
    temp.open("temp.txt");
    string line;
    while (getline(fin,line)){
        if (element != item){
            temp << line << endl;
        }
        element++;
    }
    fin.close();
    temp.close();
    remove(path.c_str());
    rename("temp.txt",path.c_str());
}

int main()
{
    cout << "Enter your file Name: ";
    cin >> path;
    bool working = true;
    cout << "Welcome to To-Do list program!\n" << endl;
    int choice;
    do {
        int choice = menu();
        switch(choice) {

            case 1:
                showList();
                break;
            case 2:
                int amount;
                cout << "\t Add New Items\n" << endl;
                cout << "Enter how many items do you want to add: ";
                clean_buffer();
                cin >> amount;
                addItems(amount);
                break;
            case 3:
                removeItems();
                break;
            case 4:
                cout << "Have a nice day!" << endl;
                working = false;
                break;
            default:
                cout << "Input was invaild Try again or "<< "\nenter 4 to exit." << endl;
                bool working = true;

        }
    } while (working == true);

    return 0;
}
