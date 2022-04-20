cmake_minimum_required(VERSION 3.21)
project(hellojni C)

set(CMAKE_C_STANDARD 99)

include_directories(D:\\Java8\\jdk1.8.0_131\\include)
include_directories(D:\\Java8\\jdk1.8.0_131\\include\\win32)
link_directories(D:\\Java8\\jdk1.8.0_131\\lib)

add_library(hellojni SHARED library.c)
