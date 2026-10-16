package com.google.l.b.a;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends com.google.l.d.b {

    /* renamed from: b, reason: collision with root package name */
    private static final Reader f12289b = new k();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12290c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private Object[] f12291d;

    /* renamed from: e, reason: collision with root package name */
    private int f12292e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f12293f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f12294g;

    public l(com.google.l.i iVar) {
        super(f12289b);
        this.f12291d = new Object[32];
        this.f12292e = 0;
        this.f12293f = new String[32];
        this.f12294g = new int[32];
        D(iVar);
    }

    private final String A(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.f12292e;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.f12291d;
            Object obj = objArr[i2];
            if (obj instanceof com.google.l.g) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    int i4 = this.f12294g[i2];
                    if (z && i4 > 0 && (i2 == i3 - 1 || i2 == i3 - 2)) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                }
            } else if ((obj instanceof com.google.l.l) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append('.');
                String str = this.f12293f[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    private final String B() {
        return " at path ".concat(e());
    }

    private final String C(boolean z) {
        E(5);
        Map.Entry entry = (Map.Entry) ((Iterator) y()).next();
        String str = (String) entry.getKey();
        this.f12293f[this.f12292e - 1] = true != z ? str : "<skipped>";
        D(entry.getValue());
        return str;
    }

    private final void D(Object obj) {
        int i2 = this.f12292e;
        Object[] objArr = this.f12291d;
        if (i2 == objArr.length) {
            int i3 = i2 + i2;
            this.f12291d = Arrays.copyOf(objArr, i3);
            this.f12294g = Arrays.copyOf(this.f12294g, i3);
            this.f12293f = (String[]) Arrays.copyOf(this.f12293f, i3);
        }
        Object[] objArr2 = this.f12291d;
        int i4 = this.f12292e;
        this.f12292e = i4 + 1;
        objArr2[i4] = obj;
    }

    private final void E(int i2) {
        if (r() == i2) {
            return;
        }
        throw new IllegalStateException("Expected " + com.waze.c.c.e.c(i2) + " but was " + com.waze.c.c.e.c(r()) + B());
    }

    private final Object y() {
        return this.f12291d[this.f12292e - 1];
    }

    private final Object z() {
        Object[] objArr = this.f12291d;
        int i2 = this.f12292e - 1;
        this.f12292e = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    @Override // com.google.l.d.b
    public final double a() throws IOException {
        int iR = r();
        if (iR != 7 && iR != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + com.waze.c.c.e.c(iR) + B());
        }
        double dB = ((com.google.l.n) y()).b();
        if (!w() && (Double.isNaN(dB) || Double.isInfinite(dB))) {
            throw new com.google.l.d.d("JSON forbids NaN and infinities: " + dB);
        }
        z();
        int i2 = this.f12292e;
        if (i2 > 0) {
            int[] iArr = this.f12294g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dB;
    }

    @Override // com.google.l.d.b
    public final int b() throws IOException {
        int iR = r();
        if (iR != 7 && iR != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + com.waze.c.c.e.c(iR) + B());
        }
        int iA = ((com.google.l.n) y()).a();
        z();
        int i2 = this.f12292e;
        if (i2 > 0) {
            int[] iArr = this.f12294g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iA;
    }

    @Override // com.google.l.d.b
    public final long c() throws IOException {
        int iR = r();
        if (iR != 7 && iR != 6) {
            throw new IllegalStateException("Expected NUMBER but was " + com.waze.c.c.e.c(iR) + B());
        }
        com.google.l.n nVar = (com.google.l.n) y();
        long jLongValue = nVar.k() ? nVar.d().longValue() : Long.parseLong(nVar.c());
        z();
        int i2 = this.f12292e;
        if (i2 > 0) {
            int[] iArr = this.f12294g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jLongValue;
    }

    @Override // com.google.l.d.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12291d = new Object[]{f12290c};
        this.f12292e = 1;
    }

    final com.google.l.i d() throws IOException {
        int iR = r();
        if (iR != 5 && iR != 2 && iR != 4 && iR != 10) {
            com.google.l.i iVar = (com.google.l.i) y();
            o();
            return iVar;
        }
        throw new IllegalStateException("Unexpected " + com.waze.c.c.e.c(iR) + " when reading a JsonElement.");
    }

    @Override // com.google.l.d.b
    public final String e() {
        return A(false);
    }

    @Override // com.google.l.d.b
    public final String f() {
        return A(true);
    }

    @Override // com.google.l.d.b
    public final String g() {
        return C(false);
    }

    @Override // com.google.l.d.b
    public final String h() throws IOException {
        int iR = r();
        if (iR != 6 && iR != 7) {
            throw new IllegalStateException("Expected STRING but was " + com.waze.c.c.e.c(iR) + B());
        }
        String strC = ((com.google.l.n) z()).c();
        int i2 = this.f12292e;
        if (i2 > 0) {
            int[] iArr = this.f12294g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return strC;
    }

    @Override // com.google.l.d.b
    public final void i() {
        E(1);
        D(((com.google.l.g) y()).iterator());
        this.f12294g[this.f12292e - 1] = 0;
    }

    @Override // com.google.l.d.b
    public final void j() {
        E(3);
        D(((com.google.l.l) y()).b().iterator());
    }

    @Override // com.google.l.d.b
    public final void k() {
        E(2);
        z();
        z();
        int i2 = this.f12292e;
        if (i2 > 0) {
            int[] iArr = this.f12294g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.l.d.b
    public final void l() {
        E(4);
        this.f12293f[this.f12292e - 1] = null;
        z();
        z();
        int i2 = this.f12292e;
        if (i2 > 0) {
            int[] iArr = this.f12294g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.l.d.b
    public final void m() {
        E(9);
        z();
        int i2 = this.f12292e;
        if (i2 > 0) {
            int[] iArr = this.f12294g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void n() {
        E(5);
        Map.Entry entry = (Map.Entry) ((Iterator) y()).next();
        D(entry.getValue());
        D(new com.google.l.n((String) entry.getKey()));
    }

    @Override // com.google.l.d.b
    public final void o() throws IOException {
        int iR = r() - 1;
        if (iR == 1) {
            k();
            return;
        }
        if (iR != 9) {
            if (iR == 3) {
                l();
                return;
            }
            if (iR == 4) {
                C(true);
                return;
            }
            z();
            int i2 = this.f12292e;
            if (i2 > 0) {
                int[] iArr = this.f12294g;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    @Override // com.google.l.d.b
    public final boolean p() throws IOException {
        int iR = r();
        return (iR == 4 || iR == 2 || iR == 10) ? false : true;
    }

    @Override // com.google.l.d.b
    public final boolean q() {
        E(8);
        boolean zI = ((com.google.l.n) z()).i();
        int i2 = this.f12292e;
        if (i2 > 0) {
            int[] iArr = this.f12294g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zI;
    }

    @Override // com.google.l.d.b
    public final int r() throws com.google.l.d.d {
        if (this.f12292e == 0) {
            return 10;
        }
        Object objY = y();
        if (objY instanceof Iterator) {
            boolean z = this.f12291d[this.f12292e - 2] instanceof com.google.l.l;
            Iterator it = (Iterator) objY;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            D(it.next());
            return r();
        }
        if (objY instanceof com.google.l.l) {
            return 3;
        }
        if (objY instanceof com.google.l.g) {
            return 1;
        }
        if (objY instanceof com.google.l.n) {
            com.google.l.n nVar = (com.google.l.n) objY;
            if (nVar.l()) {
                return 6;
            }
            if (nVar.j()) {
                return 8;
            }
            if (nVar.k()) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objY instanceof com.google.l.k) {
            return 9;
        }
        if (objY == f12290c) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new com.google.l.d.d("Custom JsonElement subclass " + objY.getClass().getName() + " is not supported");
    }

    @Override // com.google.l.d.b
    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(B());
    }
}
