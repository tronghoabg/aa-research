package com.bytedance.adsdk.ugeno.ivm;

import java.util.Collection;

/* loaded from: classes.dex */
public class moa {
    public static int uef(boolean z2, int i5, int i10) {
        if (i10 == 0 || !z2) {
            return i5;
        }
        int i11 = i5 - 512;
        int iAbs = Math.abs(i11) % i10;
        return (i11 >= 0 || iAbs == 0) ? iAbs : i10 - iAbs;
    }

    public static boolean uef(int i5, Collection<?> collection) {
        return i5 >= 0 && i5 < collection.size();
    }
}
