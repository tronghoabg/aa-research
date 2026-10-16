package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ajkn implements ajkc {
    public static final ajhv a;
    public final ajia b;
    public final ajkb c;
    public int d;
    public final ajki e;
    public final ajiy f;

    static {
        ajhv ajhvVar = ajhv.a;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        strArr.getClass();
        int length = strArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, length);
        int length2 = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            if (strArr2[i2] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = afyh.k(strArr[i2]).toString();
        }
        int iO = affa.o(0, strArr2.length - 1, 2);
        if (iO >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                ahdw.e(str);
                ahdw.f(str2, str);
                if (i == iO) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        a = new ajhv(strArr2);
    }

    public ajkn(ajia ajiaVar, ajkb ajkbVar, ajiy ajiyVar) {
        ajiyVar.getClass();
        this.b = ajiaVar;
        this.c = ajkbVar;
        this.f = ajiyVar;
        this.e = new ajki(ajiyVar.b);
    }

    private static final boolean l(ajif ajifVar) {
        return afyh.R("chunked", ajifVar.a("Transfer-Encoding"));
    }

    @Override // defpackage.ajkc
    public final long a(ajif ajifVar) {
        if (!ajkd.b(ajifVar)) {
            return 0L;
        }
        if (l(ajifVar)) {
            return -1L;
        }
        return ajis.a(ajifVar);
    }

    @Override // defpackage.ajkc
    public final ajkb b() {
        return this.c;
    }

    @Override // defpackage.ajkc
    public final /* synthetic */ ajob c() {
        return this.f;
    }

    @Override // defpackage.ajkc
    public final ajoc d(ajif ajifVar) {
        if (!ajkd.b(ajifVar)) {
            return j(ajifVar.a.a, 0L);
        }
        if (l(ajifVar)) {
            ajid ajidVar = ajifVar.a;
            int i = this.d;
            if (i != 4) {
                throw new IllegalStateException(a.bp(i, "state: "));
            }
            ajhx ajhxVar = ajidVar.a;
            this.d = 5;
            return new ajkk(this, ajhxVar);
        }
        long jA = ajis.a(ajifVar);
        if (jA != -1) {
            return j(ajifVar.a.a, jA);
        }
        ajid ajidVar2 = ajifVar.a;
        int i2 = this.d;
        if (i2 != 4) {
            throw new IllegalStateException(a.bp(i2, "state: "));
        }
        ajhx ajhxVar2 = ajidVar2.a;
        this.d = 5;
        this.c.h();
        return new ajkm(this, ajhxVar2);
    }

    @Override // defpackage.ajkc
    public final void e() {
        this.c.g();
    }

    @Override // defpackage.ajkc
    public final void f() throws IOException {
        this.f.c.flush();
    }

    @Override // defpackage.ajkc
    public final void g(ajid ajidVar) throws IOException {
        Proxy.Type type = this.c.a().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(ajidVar.b);
        sb.append(' ');
        if (ajidVar.c() || type != Proxy.Type.HTTP) {
            sb.append(aheh.b(ajidVar.a));
        } else {
            sb.append(ajidVar.a);
        }
        sb.append(" HTTP/1.1");
        k(ajidVar.c, sb.toString());
    }

    @Override // defpackage.ajkc
    public final boolean h() {
        return this.d == 6;
    }

    @Override // defpackage.ajkc
    public final ajie i() throws IOException {
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(a.bp(i, "state: "));
        }
        try {
            ajki ajkiVar = this.e;
            ajkh ajkhVarA = aheh.a(ajkiVar.a());
            ajie ajieVar = new ajie();
            ajieVar.a = ajkhVarA.a;
            int i2 = ajkhVarA.b;
            ajieVar.b = i2;
            ajieVar.c = ajkhVarA.c;
            ajieVar.b(ajkiVar.b());
            if (i2 != 100 && (i2 < 102 || i2 >= 200)) {
                this.d = 4;
                return ajieVar;
            }
            this.d = 3;
            return ajieVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.c.a().a.h.e()), e);
        }
    }

    public final ajoc j(ajhx ajhxVar, long j) {
        int i = this.d;
        if (i != 4) {
            throw new IllegalStateException(a.bp(i, "state: "));
        }
        this.d = 5;
        return new ajkl(this, ajhxVar, j);
    }

    public final void k(ajhv ajhvVar, String str) throws IOException {
        int i = this.d;
        if (i != 0) {
            throw new IllegalStateException(a.bp(i, "state: "));
        }
        ajmz ajmzVar = this.f.c;
        ajmzVar.Z(str);
        ajmzVar.Z("\r\n");
        int iA = ajhvVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            ajmzVar.Z(ahdw.b(ajhvVar, i2));
            ajmzVar.Z(": ");
            ajmzVar.Z(ahdw.c(ajhvVar, i2));
            ajmzVar.Z("\r\n");
        }
        ajmzVar.Z("\r\n");
        this.d = 1;
    }
}
