package com.google.e.a.k;

import com.google.e.a.f.a.e;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8763a;

    private a(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f8763a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static a b(byte[] bArr) {
        if (bArr != null) {
            return d(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a d(byte[] bArr, int i2) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i2 > length) {
            i2 = length;
        }
        return new a(bArr, i2);
    }

    public final int a() {
        return this.f8763a.length;
    }

    public final byte[] c() {
        byte[] bArr = this.f8763a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f8763a, this.f8763a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8763a);
    }

    public final String toString() {
        return "Bytes(" + e.b(this.f8763a) + ")";
    }
}
