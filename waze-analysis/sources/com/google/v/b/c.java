package com.google.v.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class c {
    protected c() {
        throw new UnsupportedOperationException("A DslProxy should never be instantiated");
    }

    public static void a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("The object is expected to be not null");
        }
    }
}
