package com.google.d.l;

import com.google.d.b.an;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final d f7964a = new d(new long[0]);

    /* renamed from: b, reason: collision with root package name */
    private final long[] f7965b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7966c;

    private d(long[] jArr, int i2) {
        this.f7965b = jArr;
        this.f7966c = i2;
    }

    public static c c(int i2) {
        an.o(true, "Invalid initialCapacity: %s", i2);
        return new c(i2);
    }

    public static d e(long[] jArr) {
        int length = jArr.length;
        return length == 0 ? f7964a : new d(Arrays.copyOf(jArr, length));
    }

    public final int a() {
        return this.f7966c;
    }

    public final long b(int i2) {
        an.A(i2, this.f7966c);
        return this.f7965b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i2 = this.f7966c;
        if (i2 != dVar.f7966c) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (b(i3) != dVar.b(i3)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f7966c == 0;
    }

    public final int hashCode() {
        int iB = 1;
        for (int i2 = 0; i2 < this.f7966c; i2++) {
            iB = (iB * 31) + a.a.b(this.f7965b[i2]);
        }
        return iB;
    }

    Object readResolve() {
        return f() ? f7964a : this;
    }

    public final String toString() {
        if (f()) {
            return "[]";
        }
        int i2 = this.f7966c;
        StringBuilder sb = new StringBuilder(i2 * 5);
        sb.append('[');
        long[] jArr = this.f7965b;
        sb.append(jArr[0]);
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(", ");
            sb.append(jArr[i3]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        long[] jArr = this.f7965b;
        int i2 = this.f7966c;
        return i2 < jArr.length ? new d(Arrays.copyOfRange(jArr, 0, i2)) : this;
    }

    /* synthetic */ d(long[] jArr, int i2, byte[] bArr) {
        this(jArr, i2);
    }

    private d(long[] jArr) {
        this(jArr, jArr.length);
    }
}
