#include <jni.h>

// empty

extern "C"
JNIEXPORT void JNICALL
Java_com_example_myapplication_MainActivity_ConvertRGBtoGray(JNIEnv *env, jobject thiz,
                                                             jlong mat_addr_input,
                                                             jlong mat_addr_result) {
    // TODO: implement ConvertRGBtoGray()
}