package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class adtb extends adqq {
    public volatile boolean a;
    public volatile adnq b;
    public List c;
    public final adqq d;
    private final adtc e;

    public adtb(adtc adtcVar, adqq adqqVar) {
        super(null, null);
        this.c = new ArrayList();
        this.e = adtcVar;
        this.d = adqqVar;
    }

    private final void ba(Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    private final void bb(Throwable th, String str) {
        this.b = adnq.c.d(th).e(str);
        this.e.i(str, th);
    }

    @Override // defpackage.adqq
    public final void a(adnq adnqVar, admc admcVar) {
        ba(new uze(this, adnqVar, admcVar, 12, (int[]) null));
    }

    @Override // defpackage.adqq
    public final void be(admc admcVar) {
        if (this.a) {
            k(admcVar);
        } else {
            ba(new adsy(this, admcVar, 3));
        }
    }

    @Override // defpackage.adqq
    public final void g(Object obj) {
        if (this.a) {
            l(obj);
        } else {
            ba(new adsy(this, obj, 4, (char[]) null));
        }
    }

    @Override // defpackage.adqq
    public final void h() {
        if (this.a) {
            o();
        } else {
            ba(new adpo(this, 5, null));
        }
    }

    public final void k(admc admcVar) {
        if (this.b != null) {
            return;
        }
        try {
            this.d.be(admcVar);
        } catch (Throwable th) {
            bb(th, "Failed to read headers");
        }
    }

    public final void l(Object obj) {
        if (this.b != null) {
            return;
        }
        try {
            this.d.g(obj);
        } catch (Throwable th) {
            bb(th, "Failed to read message.");
        }
    }

    public final void o() {
        if (this.b != null) {
            return;
        }
        try {
            this.d.h();
        } catch (Throwable th) {
            bb(th, "Failed to call onReady.");
        }
    }
}
