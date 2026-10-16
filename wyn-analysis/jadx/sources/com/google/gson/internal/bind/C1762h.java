package com.google.gson.internal.bind;

import A.AbstractC0213f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import ra.C3962a;

/* renamed from: com.google.gson.internal.bind.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1762h extends C3962a {

    /* renamed from: t, reason: collision with root package name */
    public static final C1761g f27456t = new C1761g();

    /* renamed from: u, reason: collision with root package name */
    public static final Object f27457u = new Object();

    /* renamed from: p, reason: collision with root package name */
    public Object[] f27458p;

    /* renamed from: q, reason: collision with root package name */
    public int f27459q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f27460r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f27461s;

    @Override // ra.C3962a
    public final String B() {
        return o0(true);
    }

    @Override // ra.C3962a
    public final boolean D() {
        int iE0 = e0();
        return (iE0 == 4 || iE0 == 2 || iE0 == 10) ? false : true;
    }

    @Override // ra.C3962a
    public final boolean Q() {
        n0(8);
        boolean zA = ((la.s) s0()).a();
        int i5 = this.f27459q;
        if (i5 > 0) {
            int[] iArr = this.f27461s;
            int i10 = i5 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return zA;
    }

    @Override // ra.C3962a
    public final double V() throws ra.c {
        int iE0 = e0();
        if (iE0 != 7 && iE0 != 6) {
            throw new IllegalStateException("Expected " + pd.f.s(7) + " but was " + pd.f.s(iE0) + p0());
        }
        double dE = ((la.s) r0()).e();
        if (this.f44697o != 1 && (Double.isNaN(dE) || Double.isInfinite(dE))) {
            throw new ra.c("JSON forbids NaN and infinities: " + dE);
        }
        s0();
        int i5 = this.f27459q;
        if (i5 > 0) {
            int[] iArr = this.f27461s;
            int i10 = i5 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return dE;
    }

    @Override // ra.C3962a
    public final int W() {
        int iE0 = e0();
        if (iE0 != 7 && iE0 != 6) {
            throw new IllegalStateException("Expected " + pd.f.s(7) + " but was " + pd.f.s(iE0) + p0());
        }
        la.s sVar = (la.s) r0();
        int iIntValue = sVar.f40209a instanceof Number ? sVar.f().intValue() : Integer.parseInt(sVar.c());
        s0();
        int i5 = this.f27459q;
        if (i5 > 0) {
            int[] iArr = this.f27461s;
            int i10 = i5 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return iIntValue;
    }

    @Override // ra.C3962a
    public final long X() {
        int iE0 = e0();
        if (iE0 != 7 && iE0 != 6) {
            throw new IllegalStateException("Expected " + pd.f.s(7) + " but was " + pd.f.s(iE0) + p0());
        }
        la.s sVar = (la.s) r0();
        long jLongValue = sVar.f40209a instanceof Number ? sVar.f().longValue() : Long.parseLong(sVar.c());
        s0();
        int i5 = this.f27459q;
        if (i5 > 0) {
            int[] iArr = this.f27461s;
            int i10 = i5 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return jLongValue;
    }

    @Override // ra.C3962a
    public final String Y() {
        return q0(false);
    }

    @Override // ra.C3962a
    public final void a() {
        n0(1);
        t0(((la.m) r0()).f40206a.iterator());
        this.f27461s[this.f27459q - 1] = 0;
    }

    @Override // ra.C3962a
    public final void a0() {
        n0(9);
        s0();
        int i5 = this.f27459q;
        if (i5 > 0) {
            int[] iArr = this.f27461s;
            int i10 = i5 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // ra.C3962a
    public final void b() {
        n0(3);
        t0(((na.j) ((la.r) r0()).f40208a.entrySet()).iterator());
    }

    @Override // ra.C3962a
    public final String c0() {
        int iE0 = e0();
        if (iE0 != 6 && iE0 != 7) {
            throw new IllegalStateException("Expected " + pd.f.s(6) + " but was " + pd.f.s(iE0) + p0());
        }
        String strC = ((la.s) s0()).c();
        int i5 = this.f27459q;
        if (i5 > 0) {
            int[] iArr = this.f27461s;
            int i10 = i5 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return strC;
    }

    @Override // ra.C3962a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27458p = new Object[]{f27457u};
        this.f27459q = 1;
    }

    @Override // ra.C3962a
    public final int e0() {
        if (this.f27459q == 0) {
            return 10;
        }
        Object objR0 = r0();
        if (objR0 instanceof Iterator) {
            boolean z2 = this.f27458p[this.f27459q - 2] instanceof la.r;
            Iterator it = (Iterator) objR0;
            if (!it.hasNext()) {
                return z2 ? 4 : 2;
            }
            if (z2) {
                return 5;
            }
            t0(it.next());
            return e0();
        }
        if (objR0 instanceof la.r) {
            return 3;
        }
        if (objR0 instanceof la.m) {
            return 1;
        }
        if (objR0 instanceof la.s) {
            Serializable serializable = ((la.s) objR0).f40209a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objR0 instanceof la.q) {
            return 9;
        }
        if (objR0 == f27457u) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new ra.c("Custom JsonElement subclass " + objR0.getClass().getName() + " is not supported");
    }

    @Override // ra.C3962a
    public final void i() {
        n0(2);
        s0();
        s0();
        int i5 = this.f27459q;
        if (i5 > 0) {
            int[] iArr = this.f27461s;
            int i10 = i5 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override // ra.C3962a
    public final void k0() {
        int iF = AbstractC0213f.f(e0());
        if (iF == 1) {
            i();
            return;
        }
        if (iF != 9) {
            if (iF == 3) {
                o();
                return;
            }
            if (iF == 4) {
                q0(true);
                return;
            }
            s0();
            int i5 = this.f27459q;
            if (i5 > 0) {
                int[] iArr = this.f27461s;
                int i10 = i5 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
        }
    }

    public final void n0(int i5) {
        if (e0() == i5) {
            return;
        }
        throw new IllegalStateException("Expected " + pd.f.s(i5) + " but was " + pd.f.s(e0()) + p0());
    }

    @Override // ra.C3962a
    public final void o() {
        n0(4);
        this.f27460r[this.f27459q - 1] = null;
        s0();
        s0();
        int i5 = this.f27459q;
        if (i5 > 0) {
            int[] iArr = this.f27461s;
            int i10 = i5 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    public final String o0(boolean z2) {
        StringBuilder sb2 = new StringBuilder("$");
        int i5 = 0;
        while (true) {
            int i10 = this.f27459q;
            if (i5 >= i10) {
                return sb2.toString();
            }
            Object[] objArr = this.f27458p;
            Object obj = objArr[i5];
            if (obj instanceof la.m) {
                i5++;
                if (i5 < i10 && (objArr[i5] instanceof Iterator)) {
                    int i11 = this.f27461s[i5];
                    if (z2 && i11 > 0 && (i5 == i10 - 1 || i5 == i10 - 2)) {
                        i11--;
                    }
                    sb2.append('[');
                    sb2.append(i11);
                    sb2.append(']');
                }
            } else if ((obj instanceof la.r) && (i5 = i5 + 1) < i10 && (objArr[i5] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f27460r[i5];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i5++;
        }
    }

    public final String p0() {
        return " at path " + o0(false);
    }

    public final String q0(boolean z2) {
        n0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) r0()).next();
        String str = (String) entry.getKey();
        this.f27460r[this.f27459q - 1] = z2 ? "<skipped>" : str;
        t0(entry.getValue());
        return str;
    }

    public final Object r0() {
        return this.f27458p[this.f27459q - 1];
    }

    public final Object s0() {
        Object[] objArr = this.f27458p;
        int i5 = this.f27459q - 1;
        this.f27459q = i5;
        Object obj = objArr[i5];
        objArr[i5] = null;
        return obj;
    }

    public final void t0(Object obj) {
        int i5 = this.f27459q;
        Object[] objArr = this.f27458p;
        if (i5 == objArr.length) {
            int i10 = i5 * 2;
            this.f27458p = Arrays.copyOf(objArr, i10);
            this.f27461s = Arrays.copyOf(this.f27461s, i10);
            this.f27460r = (String[]) Arrays.copyOf(this.f27460r, i10);
        }
        Object[] objArr2 = this.f27458p;
        int i11 = this.f27459q;
        this.f27459q = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // ra.C3962a
    public final String toString() {
        return C1762h.class.getSimpleName() + p0();
    }

    @Override // ra.C3962a
    public final String y() {
        return o0(false);
    }
}
