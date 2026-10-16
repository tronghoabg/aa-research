package com.google.d.l;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f7970a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 10; i2++) {
            bArr[i2 + 48] = (byte) i2;
        }
        for (int i3 = 0; i3 < 26; i3++) {
            byte b2 = (byte) (i3 + 10);
            bArr[i3 + 65] = b2;
            bArr[i3 + 97] = b2;
        }
        f7970a = bArr;
    }

    static int a(char c2) {
        if (c2 < 128) {
            return f7970a[c2];
        }
        return -1;
    }
}
