package com.google.d.g;

import androidx.compose.foundation.style.StylePropertiesKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f7878a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7879b = 0;

    f() {
    }

    public abstract int a();

    public abstract int b();

    abstract boolean c(f fVar);

    public abstract byte[] d();

    byte[] e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (b() == fVar.b() && c(fVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrE = e();
        int i2 = bArrE[0] & 255;
        for (int i3 = 1; i3 < bArrE.length; i3++) {
            i2 |= (bArrE[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    public final String toString() {
        byte[] bArrE = e();
        int length = bArrE.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArrE) {
            char[] cArr = f7878a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & StylePropertiesKt.RightId]);
        }
        return sb.toString();
    }
}
