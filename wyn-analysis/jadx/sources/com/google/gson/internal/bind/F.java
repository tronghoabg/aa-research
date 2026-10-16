package com.google.gson.internal.bind;

import ra.C3962a;
import ra.C3963b;

/* loaded from: classes4.dex */
public class F extends la.z {
    @Override // la.z
    public final Object b(C3962a c3962a) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
    }
}
