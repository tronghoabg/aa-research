package com.google.v;

import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ep {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12912a;

    static {
        byte[] bArr = new byte[0];
        f12912a = bArr;
        ByteBuffer.wrap(bArr);
        z.R(bArr);
    }

    static int a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static int b() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
