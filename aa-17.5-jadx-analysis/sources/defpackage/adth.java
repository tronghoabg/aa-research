package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class adth implements adsj {
    public final adsj a;
    public volatile boolean b;
    public List c = new ArrayList();

    public adth(adsj adsjVar) {
        this.a = adsjVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.adsj
    public final void a(adnq adnqVar, adsi adsiVar, admc admcVar) {
        b(new adtg(this, adnqVar, adsiVar, admcVar, 0));
    }

    @Override // defpackage.adsj
    public final void c(admc admcVar) {
        b(new adsy(this, admcVar, 11));
    }

    @Override // defpackage.adzy
    public final void d(adzx adzxVar) {
        if (this.b) {
            this.a.d(adzxVar);
        } else {
            b(new adsy(this, adzxVar, 10, (char[]) null));
        }
    }

    @Override // defpackage.adzy
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new adpo(this, 14, null));
        }
    }
}
