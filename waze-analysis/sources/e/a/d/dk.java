package e.a.d;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class dk extends e {

    /* renamed from: a, reason: collision with root package name */
    private static final e.a.bb f46807a;

    /* renamed from: b, reason: collision with root package name */
    private static final e.a.ch f46808b;

    /* renamed from: c, reason: collision with root package name */
    private e.a.ee f46809c;

    /* renamed from: d, reason: collision with root package name */
    private e.a.cm f46810d;

    /* renamed from: e, reason: collision with root package name */
    private Charset f46811e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f46812f;

    static {
        dj djVar = new dj(0);
        f46807a = djVar;
        f46808b = e.a.bc.b(":status", djVar);
    }

    protected dk(int i2, jt jtVar, kc kcVar, e.a.h hVar) {
        super(i2, jtVar, kcVar, hVar);
        this.f46811e = StandardCharsets.UTF_8;
    }

    private static Charset C(e.a.cm cmVar) {
        String str = (String) cmVar.e(dh.f46797g);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void D(e.a.cm cmVar) {
        cmVar.g(f46808b);
        cmVar.g(e.a.bd.f46480b);
        cmVar.g(e.a.bd.f46479a);
    }

    private static final e.a.ee E(e.a.cm cmVar) {
        char cCharAt;
        Integer num = (Integer) cmVar.e(f46808b);
        if (num == null) {
            return e.a.ee.f47410j.g("Missing HTTP status code");
        }
        String str = (String) cmVar.e(dh.f46797g);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        e.a.ee eeVarA = dh.a(num.intValue());
        return str == null ? eeVarA.c("missing content-type in response headers") : eeVarA.c("invalid content-type: ".concat(str));
    }

    protected final void w(ho hoVar, boolean z) {
        e.a.ee eeVar = this.f46809c;
        if (eeVar != null) {
            Charset charset = this.f46811e;
            int i2 = hr.f47109a;
            com.google.d.b.an.C(charset, "charset");
            int iF = hoVar.f();
            byte[] bArr = new byte[iF];
            hoVar.j(bArr, 0, iF);
            this.f46809c = eeVar.c("DATA-----------------------------\n".concat(new String(bArr, charset)));
            hoVar.close();
            if (this.f46809c.i().length() > 1000 || z) {
                z(this.f46809c, this.f46810d);
                return;
            }
            return;
        }
        if (!this.f46812f) {
            hoVar.close();
            z(e.a.ee.f47410j.g("headers not received before payload"), new e.a.cm());
            return;
        }
        int iF2 = hoVar.f();
        k(hoVar);
        if (z) {
            if (iF2 > 0) {
                this.f46809c = e.a.ee.f47410j.g("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f46809c = e.a.ee.f47410j.g("Received unexpected EOS on empty DATA frame from server");
            }
            e.a.cm cmVar = new e.a.cm();
            this.f46810d = cmVar;
            o(this.f46809c, false, cmVar);
        }
    }

    protected final void x(e.a.cm cmVar) {
        e.a.ee eeVar = this.f46809c;
        if (eeVar != null) {
            this.f46809c = eeVar.c("headers: ".concat(cmVar.toString()));
            return;
        }
        try {
            if (this.f46812f) {
                this.f46809c = e.a.ee.f47410j.g("Received headers twice");
            } else {
                Integer num = (Integer) cmVar.e(f46808b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f46812f = true;
                    e.a.ee eeVarE = E(cmVar);
                    this.f46809c = eeVarE;
                    if (eeVarE != null) {
                        this.f46809c = eeVarE.c("headers: ".concat(cmVar.toString()));
                        this.f46810d = cmVar;
                        this.f46811e = C(cmVar);
                        return;
                    }
                    D(cmVar);
                    l(cmVar);
                }
            }
            e.a.ee eeVar2 = this.f46809c;
            if (eeVar2 != null) {
                this.f46809c = eeVar2.c("headers: ".concat(cmVar.toString()));
                this.f46810d = cmVar;
                this.f46811e = C(cmVar);
            }
        } catch (Throwable th) {
            e.a.ee eeVar3 = this.f46809c;
            if (eeVar3 != null) {
                this.f46809c = eeVar3.c("headers: ".concat(cmVar.toString()));
                this.f46810d = cmVar;
                this.f46811e = C(cmVar);
            }
            throw th;
        }
    }

    protected final void y(e.a.cm cmVar) {
        e.a.ee eeVarC;
        e.a.ee eeVarE = this.f46809c;
        if (eeVarE == null && !this.f46812f) {
            eeVarE = E(cmVar);
            this.f46809c = eeVarE;
            if (eeVarE != null) {
                this.f46810d = cmVar;
            }
        }
        if (eeVarE != null) {
            e.a.ee eeVarC2 = eeVarE.c("trailers: ".concat(cmVar.toString()));
            this.f46809c = eeVarC2;
            z(eeVarC2, this.f46810d);
            return;
        }
        e.a.ee eeVar = (e.a.ee) cmVar.e(e.a.bd.f46480b);
        if (eeVar != null) {
            eeVarC = eeVar.g((String) cmVar.e(e.a.bd.f46479a));
        } else if (this.f46812f) {
            eeVarC = e.a.ee.f47403c.g("missing GRPC status in response");
        } else {
            Integer num = (Integer) cmVar.e(f46808b);
            eeVarC = (num != null ? dh.a(num.intValue()) : e.a.ee.f47410j.g("missing HTTP status code")).c("missing GRPC status, inferred error from HTTP status code");
        }
        D(cmVar);
        m(cmVar, eeVarC);
    }

    protected abstract void z(e.a.ee eeVar, e.a.cm cmVar);
}
