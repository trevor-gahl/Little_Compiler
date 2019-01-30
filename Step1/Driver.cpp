#include <iostream>
#include <fstream>

//#include "antlr4-runtime/antlr4-runtime.h"
#include "antlr4-runtime/LittleLexer.h"
#include "antlr4-runtime/LittleParser.h"

using namespace std;
using namespace antlr4;

int main(int argc, const char* argv[]){
    std::ifstream stream;
    stream.open("input.micro");

    ANTLRInputStream input(stream);
    LittleLexer lexer(&input);
    CommonTokenStream tokens(&lexer);
    
    ofstream outfile;
    outfile.open("output.micro");
    outfile << (&tokens);
    outfile.close;

    return 0;
}