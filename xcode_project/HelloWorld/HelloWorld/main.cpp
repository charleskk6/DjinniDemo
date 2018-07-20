//
//  main.cpp
//  HelloWorld
//
//  Created by Charles SO on 20/7/2018.
//  Copyright © 2018 charlesso. All rights reserved.
//

#include <iostream>
#include "hello_world_impl.hpp"

using namespace std;
using namespace helloworld;

int main(int argc, const char * argv[]) {
    HelloWorldImpl hw = HelloWorldImpl();
    string myString = hw.get_hello_world();
    cout << myString << "\n";
    return 0;
}

