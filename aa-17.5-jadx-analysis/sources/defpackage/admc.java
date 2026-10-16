package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class admc {
    public Object[] d;
    public int e;
    public static final Logger a = Logger.getLogger(admc.class.getName());
    public static final adqs f = new adqs();
    public static final adlu b = new adud(1);
    static final ytq c = ytq.d.f();

    public admc(int i, Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    public static byte[] i(InputStream inputStream) {
        try {
            return yts.c(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    private final int k() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void l(int i) {
        Object[] objArr = new Object[i];
        if (!o()) {
            System.arraycopy(this.d, 0, objArr, 0, a());
        }
        this.d = objArr;
    }

    private final void m(int i, byte[] bArr) {
        this.d[i + i] = bArr;
    }

    private final void n(int i, Object obj) {
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

    public final Object b(adlx adlxVar) {
        adlw adlwVarA;
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(adlxVar.b, h(i)));
        Object objC = c(i);
        if (objC instanceof byte[]) {
            return adlxVar.a((byte[]) objC);
        }
        adlz adlzVar = (adlz) objC;
        return (!adlxVar.c() || (adlwVarA = adlz.a(adlxVar)) == null) ? adlxVar.a(adlzVar.c()) : adlwVarA.b(adlzVar.b());
    }

    public final Object c(int i) {
        return this.d[i + i + 1];
    }

    public final void d(adlx adlxVar) {
        if (o()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (!Arrays.equals(adlxVar.b, h(i2))) {
                m(i, h(i2));
                n(i, c(i2));
                i++;
            }
        }
        Arrays.fill(this.d, i + i, a(), (Object) null);
        this.e = i;
    }

    public final void e(admc admcVar) {
        if (admcVar.o()) {
            return;
        }
        int iK = k() - a();
        if (o() || iK < admcVar.a()) {
            l(a() + admcVar.a());
        }
        System.arraycopy(admcVar.d, 0, this.d, a(), admcVar.a());
        this.e += admcVar.e;
    }

    public final void f(adlx adlxVar, Object obj) {
        adlxVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == k()) {
            int iA = a();
            l(Math.max(iA + iA, 8));
        }
        m(this.e, adlxVar.b);
        boolean zC = adlxVar.c();
        int i = this.e;
        if (zC) {
            adlw adlwVarA = adlz.a(adlxVar);
            adlwVarA.getClass();
            n(i, new adlz(adlwVarA, obj));
        } else {
            this.d[i + i + 1] = adlxVar.b(obj);
        }
        this.e++;
    }

    public final boolean g(adlx adlxVar) {
        for (int i = 0; i < this.e; i++) {
            if (Arrays.equals(adlxVar.b, h(i))) {
                return true;
            }
        }
        return false;
    }

    public final byte[] h(int i) {
        return (byte[]) this.d[i + i];
    }

    public final byte[] j(int i) {
        Object objC = c(i);
        return objC instanceof byte[] ? (byte[]) objC : ((adlz) objC).c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(h(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.i(j(i)));
            } else {
                sb.append(new String(j(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public admc() {
    }

    public admc(byte[]... bArr) {
        this(bArr.length >> 1, bArr);
    }
}
