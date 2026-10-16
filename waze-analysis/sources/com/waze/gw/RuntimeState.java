package com.waze.gw;

import android.content.Context;

/* loaded from: classes10.dex */
final class RuntimeState {
    private static final boolean LOADED;
    private static volatile int state;

    private static native int n(Context context);

    static {
        boolean z;
        try {
            System.loadLibrary("wzaux");
            z = true;
        } catch (Throwable th) {
            z = false;
        }
        LOADED = z;
        if (!z) {
            state = -1;
        }
    }

    private RuntimeState() {
    }

    static boolean a(Context context) {
        int i2 = state;
        if (i2 != 0) {
            return i2 > 0;
        }
        if (!LOADED || context == null) {
            return false;
        }
        try {
            int iN = n(context);
            if (iN != 0) {
                state = iN > 0 ? 1 : -1;
            }
            return iN > 0;
        } catch (Throwable th) {
            return false;
        }
    }
}
