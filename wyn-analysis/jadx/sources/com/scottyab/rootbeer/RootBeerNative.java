package com.scottyab.rootbeer;

import Fe.b;

/* loaded from: classes4.dex */
public class RootBeerNative {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f32666a;

    static {
        try {
            System.loadLibrary("toolChecker");
            f32666a = true;
        } catch (UnsatisfiedLinkError e7) {
            b.u(e7);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z2);
}
