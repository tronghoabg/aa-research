package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f18234f = new j0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f18235a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f18236b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f18237c;

    /* renamed from: d, reason: collision with root package name */
    public int f18238d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18239e;

    public j0(int i5, int[] iArr, Object[] objArr, boolean z2) {
        this.f18235a = i5;
        this.f18236b = iArr;
        this.f18237c = objArr;
        this.f18239e = z2;
    }

    public static j0 b() {
        return new j0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iY;
        int iA;
        int iU;
        int i5 = this.f18238d;
        if (i5 != -1) {
            return i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18235a; i11++) {
            int i12 = this.f18236b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f18237c[i11]).getClass();
                    iU = C1393j.u(i13);
                } else if (i14 == 2) {
                    iU = C1393j.r(i13, (C1390g) this.f18237c[i11]);
                } else if (i14 == 3) {
                    iY = C1393j.y(i13) * 2;
                    iA = ((j0) this.f18237c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(A.b());
                    }
                    ((Integer) this.f18237c[i11]).getClass();
                    iU = C1393j.t(i13);
                }
                i10 = iU + i10;
            } else {
                long jLongValue = ((Long) this.f18237c[i11]).longValue();
                iY = C1393j.y(i13);
                iA = C1393j.A(jLongValue);
            }
            i10 = iA + iY + i10;
        }
        this.f18238d = i10;
        return i10;
    }

    public final void c(int i5, Object obj) {
        if (!this.f18239e) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.f18235a;
        int[] iArr = this.f18236b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f18236b = Arrays.copyOf(iArr, i11);
            this.f18237c = Arrays.copyOf(this.f18237c, i11);
        }
        int[] iArr2 = this.f18236b;
        int i12 = this.f18235a;
        iArr2[i12] = i5;
        this.f18237c[i12] = obj;
        this.f18235a = i12 + 1;
    }

    public final void d(J j8) {
        if (this.f18235a == 0) {
            return;
        }
        j8.getClass();
        for (int i5 = 0; i5 < this.f18235a; i5++) {
            int i10 = this.f18236b[i5];
            Object obj = this.f18237c[i5];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            C1393j c1393j = (C1393j) j8.f18144a;
            if (i12 == 0) {
                c1393j.U(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                c1393j.K(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                j8.a(i11, (C1390g) obj);
            } else if (i12 == 3) {
                c1393j.R(i11, 3);
                ((j0) obj).d(j8);
                c1393j.R(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(A.b());
                }
                c1393j.I(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i5 = this.f18235a;
        if (i5 == j0Var.f18235a) {
            int[] iArr = this.f18236b;
            int[] iArr2 = j0Var.f18236b;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.f18237c;
                    Object[] objArr2 = j0Var.f18237c;
                    int i11 = this.f18235a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f18235a;
        int i10 = (527 + i5) * 31;
        int[] iArr = this.f18236b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i5; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f18237c;
        int i14 = this.f18235a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
