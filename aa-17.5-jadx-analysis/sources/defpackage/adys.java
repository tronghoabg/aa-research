package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class adys implements adzk {
    public final adyt a;
    private final adjj b;
    private final adqs c;

    public adys(adyt adytVar, adqs adqsVar, adjj adjjVar) {
        this.a = adytVar;
        this.c = adqsVar;
        this.b = adjjVar;
        adjjVar.d(new adyr(this, 0), zfq.a);
    }

    @Override // defpackage.adzk
    public final void a(adnq adnqVar) {
        int i = aeeb.a;
        adyt adytVar = this.a;
        adks adksVar = null;
        try {
            if (adnqVar.g()) {
                this.c.c();
            } else {
                adytVar.c = true;
                this.c.b();
                adnq adnqVarE = adnq.c.e("RPC cancelled");
                adlx adlxVar = adkr.a;
                adksVar = new adks(adnqVarE);
            }
        } finally {
            this.b.j(null);
        }
    }

    @Override // defpackage.adzk
    public final void b() {
        int i = aeeb.a;
        if (this.a.c) {
            return;
        }
        this.c.d();
    }

    @Override // defpackage.adzy
    public final void d(adzx adzxVar) throws IOException {
        int i = aeeb.a;
        adyt adytVar = this.a;
        if (adytVar.c) {
            adue.f(adzxVar);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamG = adzxVar.g();
                if (inputStreamG == null) {
                    return;
                }
                try {
                    this.c.e(adytVar.a.d.b(inputStreamG));
                    inputStreamG.close();
                } finally {
                }
            } catch (Throwable th) {
                adue.f(adzxVar);
                xyg.c(th);
                throw new RuntimeException(th);
            }
        }
    }

    @Override // defpackage.adzy
    public final void e() {
        int i = aeeb.a;
        if (this.a.c) {
            return;
        }
        this.c.f();
    }
}
