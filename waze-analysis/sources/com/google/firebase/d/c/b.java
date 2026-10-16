package com.google.firebase.d.c;

import h.g.b.x;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.au;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f9839a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9840b;

    public b(List list) {
        x.f(list, "routes");
        this.f9840b = list;
    }

    public final f a() {
        return new a(this.f9839a, (e) this.f9840b);
    }

    public final void b(int i2) {
        this.f9839a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List c() {
        return this.f9840b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final au d() {
        if (!e()) {
            throw new NoSuchElementException();
        }
        ?? r0 = this.f9840b;
        int i2 = this.f9839a;
        this.f9839a = i2 + 1;
        return (au) r0.get(i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final boolean e() {
        return this.f9839a < this.f9840b.size();
    }

    public final int f(int i2) {
        return ((int[]) this.f9840b)[i2];
    }

    public final int g() {
        if ((this.f9839a & 2) != 0) {
            return ((int[]) this.f9840b)[1];
        }
        return -1;
    }

    public final int h() {
        if ((this.f9839a & 128) != 0) {
            return ((int[]) this.f9840b)[7];
        }
        return 65535;
    }

    public final int i() {
        if ((this.f9839a & 16) != 0) {
            return ((int[]) this.f9840b)[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int j(int i2) {
        return (this.f9839a & 32) != 0 ? ((int[]) this.f9840b)[5] : i2;
    }

    public final int k() {
        return Integer.bitCount(this.f9839a);
    }

    public final boolean l(int i2) {
        return (this.f9839a & (1 << i2)) != 0;
    }

    public final void m(int i2, int i3) {
        if (i2 < 0 || i2 >= 10) {
            return;
        }
        this.f9839a = (1 << i2) | this.f9839a;
        ((int[]) this.f9840b)[i2] = i3;
    }

    public final void n(b bVar) {
        x.f(bVar, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (bVar.l(i2)) {
                m(i2, bVar.f(i2));
            }
        }
    }

    public b() {
        this.f9840b = e.f9842a;
    }

    public b(byte[] bArr) {
        this.f9840b = new int[10];
    }
}
