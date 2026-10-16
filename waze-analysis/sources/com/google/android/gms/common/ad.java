package com.google.android.gms.common;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad {
    static int a(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    static int b(int i2) {
        int[] iArrB = com.google.android.gms.identitycredentials.a.k.b();
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArrB[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    public static final com.google.android.gms.auth.a.b.f c(Context context) {
        h.g.b.x.f(context, "context");
        return new com.google.android.gms.auth.a.b.a.e(context);
    }
}
