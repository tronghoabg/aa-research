package com.google.d.l;

import com.google.d.b.an;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final b f7959a = new b(new int[0]);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f7960b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7961c;

    private b(int[] iArr, int i2) {
        this.f7960b = iArr;
        this.f7961c = i2;
    }

    public static b d(int[] iArr) {
        int length = iArr.length;
        return length == 0 ? f7959a : new b(Arrays.copyOf(iArr, length));
    }

    public static b e() {
        return f7959a;
    }

    public static b h() {
        return new b(new int[]{0, 2, 1});
    }

    public static b i() {
        return new b(new int[]{0, 2, 1, 3, 4});
    }

    public static b j() {
        return new b(new int[]{0, 2, 1, 5, 3, 4});
    }

    public static b k(int... iArr) {
        an.m(true, "the total number of elements must fit in an int");
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return new b(iArr2);
    }

    public static c l(int i2) {
        an.o(i2 >= 0, "Invalid initialCapacity: %s", i2);
        return new c(i2, null);
    }

    public final int a(int i2) {
        an.A(i2, this.f7961c);
        return this.f7960b[i2];
    }

    public final int b() {
        return this.f7961c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i2 = this.f7961c;
        if (i2 != bVar.f7961c) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (a(i3) != bVar.a(i3)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f7961c == 0;
    }

    public final int[] g() {
        return Arrays.copyOfRange(this.f7960b, 0, this.f7961c);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f7961c; i3++) {
            i2 = (i2 * 31) + this.f7960b[i3];
        }
        return i2;
    }

    Object readResolve() {
        return f() ? f7959a : this;
    }

    public final String toString() {
        if (f()) {
            return "[]";
        }
        int i2 = this.f7961c;
        StringBuilder sb = new StringBuilder(i2 * 5);
        sb.append('[');
        int[] iArr = this.f7960b;
        sb.append(iArr[0]);
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(", ");
            sb.append(iArr[i3]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        return this.f7961c < this.f7960b.length ? new b(g()) : this;
    }

    /* synthetic */ b(int[] iArr, int i2, byte[] bArr) {
        this(iArr, i2);
    }

    private b(int[] iArr) {
        this(iArr, iArr.length);
    }
}
