package defpackage;

import java.io.IOException;
import java.util.zip.InflaterInputStream;

/* loaded from: classes.dex */
public final class wbh {
    public static final wbh a = new wbh(wbg.a, wbb.a);
    public final wbg b;
    public final wbb c;

    private wbh(wbg wbgVar, wbb wbbVar) {
        wbgVar.getClass();
        this.b = wbgVar;
        this.c = wbbVar;
    }

    public static wbh b(abmw abmwVar, boolean z) throws IOException {
        wbg wbgVarA;
        abmv abmvVar = (abmv) abmwVar;
        int iJ = abmvVar.j();
        if (iJ > 1) {
            throw new abon(a.bn(iJ, "Unsupported version: ", ". Current version is: 1"));
        }
        abmvVar.j();
        int iF = abmwVar.f(abmvVar.k());
        abnv abnvVarC = abnv.C(wbb.a, abmwVar, abnj.a);
        abnv.U(abnvVarC);
        wbb wbbVar = (wbb) abnvVarC;
        abmwVar.D(iF);
        wbe wbeVar = new wbe();
        try {
            if (z) {
                int iF2 = abmwVar.f(((abmv) abmwVar).k());
                try {
                    wbgVarA = wbg.a(new abmv(new InflaterInputStream(new wbd(abmwVar), wbeVar.a, 4096)));
                    wbeVar.a.reset();
                    int iD = abmwVar.d();
                    if (iD > 0) {
                        abmwVar.E(iD);
                    }
                    abmwVar.D(iF2);
                } finally {
                }
            } else {
                wbeVar.a.setInput(abmwVar.I());
                try {
                    wbgVarA = wbg.a(new abmv(new wbc(wbeVar)));
                } finally {
                }
            }
            wbeVar.close();
            return new wbh(wbgVarA, wbbVar);
        } catch (Throwable th) {
            try {
                wbeVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long a() {
        return this.c.e;
    }

    public final String c() {
        return this.c.d;
    }

    public final String d() {
        return this.c.b;
    }
}
