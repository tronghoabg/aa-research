package com.google.d.l;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int f7962a = 0;

    /* renamed from: b, reason: collision with root package name */
    private Object f7963b;

    c(int i2) {
        this.f7963b = new long[i2];
    }

    public final d a() {
        if (this.f7962a == 0) {
            return d.f7964a;
        }
        return new d((long[]) this.f7963b, this.f7962a, null);
    }

    public final void b(long j2) {
        int i2 = this.f7962a + 1;
        long[] jArr = (long[]) this.f7963b;
        int length = jArr.length;
        if (i2 > length) {
            this.f7963b = Arrays.copyOf(jArr, j.t(length, i2));
        }
        Object obj = this.f7963b;
        int i3 = this.f7962a;
        ((long[]) obj)[i3] = j2;
        this.f7962a = i3 + 1;
    }

    public final b c() {
        if (this.f7962a == 0) {
            return b.f7959a;
        }
        return new b((int[]) this.f7963b, this.f7962a, null);
    }

    public final void d(int i2) {
        int i3 = this.f7962a + 1;
        int[] iArr = (int[]) this.f7963b;
        int length = iArr.length;
        if (i3 > length) {
            this.f7963b = Arrays.copyOf(iArr, j.t(length, i3));
        }
        Object obj = this.f7963b;
        int i4 = this.f7962a;
        ((int[]) obj)[i4] = i2;
        this.f7962a = i4 + 1;
    }

    c(int i2, byte[] bArr) {
        this.f7963b = new int[i2];
    }
}
