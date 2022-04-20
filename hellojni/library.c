#include "hellojni.h"
#include <jni.h>
#include <jni_md.h>

#include <stdio.h>

JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv *env, jobject obj, jstring name) {
    const char *str = (*env)->GetStringUTFChars(env, name, 0);
    printf("Hello, %s!", str);
}
