package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adnd {
    public java.lang.Object[] d;
    public int e;
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adnd.class.getName());
    public static final defpackage.adrs f = new defpackage.adrs();
    public static final admv b = new defpackage.advd(1);
    static final defpackage.yuv c = defpackage.yuv.d.f();

    public adnd(int i, java.lang.Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    public static byte[] i(java.io.InputStream inputStream) {
        try {
            return defpackage.yux.c(inputStream);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("failure reading serialized stream", e);
        }
    }

    private final int k() {
        java.lang.Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void l(int i) {
        java.lang.Object[] objArr = new java.lang.Object[i];
        if (!o()) {
            java.lang.System.arraycopy(this.d, 0, objArr, 0, a());
        }
        this.d = objArr;
    }

    private final void m(int i, byte[] bArr) {
        this.d[i + i] = bArr;
    }

    private final void n(int i, java.lang.Object obj) {
        if (this.d instanceof byte[][]) {
            l(k());
        }
        this.d[i + i + 1] = obj;
    }

    private final boolean o() {
        return this.e == 0;
    }

    public final int a() {
        int i = this.e;
        return i + i;
    }

    public final java.lang.Object b(defpackage.admy admyVar) {
        admx admxVarA;
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!java.util.Arrays.equals(admyVar.b, h(i)));
        java.lang.Object objC = c(i);
        if (objC instanceof byte[]) {
            return admyVar.a((byte[]) objC);
        }
        adna adnaVar = (adna) objC;
        return (!admyVar.c() || (admxVarA = adna.a(admyVar)) == null) ? admyVar.a(adnaVar.c()) : admxVarA.b(adnaVar.b());
    }

    public final java.lang.Object c(int i) {
        return this.d[i + i + 1];
    }

    public final void d(defpackage.admy admyVar) {
        if (o()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (!java.util.Arrays.equals(admyVar.b, h(i2))) {
                m(i, h(i2));
                n(i, c(i2));
                i++;
            }
        }
        java.util.Arrays.fill(this.d, i + i, a(), (java.lang.Object) null);
        this.e = i;
    }

    public final void e(defpackage.adnd adndVar) {
        if (adndVar.o()) {
            return;
        }
        int iK = k() - a();
        if (o() || iK < adndVar.a()) {
            l(a() + adndVar.a());
        }
        java.lang.System.arraycopy(adndVar.d, 0, this.d, a(), adndVar.a());
        this.e += adndVar.e;
    }

    public final void f(defpackage.admy admyVar, java.lang.Object obj) {
        admyVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == k()) {
            int iA = a();
            l(java.lang.Math.max(iA + iA, 8));
        }
        m(this.e, admyVar.b);
        boolean zC = admyVar.c();
        int i = this.e;
        if (zC) {
            admx admxVarA = adna.a(admyVar);
            admxVarA.getClass();
            n(i, new adna(admxVarA, obj));
        } else {
            this.d[i + i + 1] = admyVar.b(obj);
        }
        this.e++;
    }

    public final boolean g(defpackage.admy admyVar) {
        for (int i = 0; i < this.e; i++) {
            if (java.util.Arrays.equals(admyVar.b, h(i))) {
                return true;
            }
        }
        return false;
    }

    public final byte[] h(int i) {
        return (byte[]) this.d[i + i];
    }

    public final byte[] j(int i) {
        java.lang.Object objC = c(i);
        return objC instanceof byte[] ? (byte[]) objC : ((adna) objC).c();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            java.lang.String str = new java.lang.String(h(i), java.nio.charset.StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.i(j(i)));
            } else {
                sb.append(new java.lang.String(j(i), java.nio.charset.StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public adnd() {
    }

    public adnd(byte[]... bArr) {
        this(bArr.length >> 1, bArr);
    }
}
