package defpackage;

import android.os.IBinder;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zhy implements xyc {
    private final adnf a;
    private final adoi b;
    private boolean c;

    public zhy(adnf adnfVar, adoi adoiVar, eqa eqaVar) {
        this.a = adnfVar;
        this.b = adoiVar;
        ept lifecycle = eqaVar.getLifecycle();
        if (((eqc) lifecycle).e == eps.a) {
            ((adzg) adnfVar).b();
        } else {
            lifecycle.c(new erc(adnfVar, 11));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.xyc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized IBinder gu() {
        if (!this.c) {
            try {
                this.c = true;
                adnf adnfVar = this.a;
                synchronized (((adzg) adnfVar).o) {
                    woy.aa(!((adzg) adnfVar).j, "Already started");
                    woy.aa(!((adzg) adnfVar).k, "Shutting down");
                    ((adzg) adnfVar).n.d(new adza((adzg) adnfVar));
                    ?? A = ((adzg) adnfVar).d.a();
                    A.getClass();
                    ((adzg) adnfVar).e = A;
                    ((adzg) adnfVar).j = true;
                }
            } catch (IOException e) {
                ((ynz) ((ynz) ((ynz) zhz.a.g()).p(e)).ai(10288)).y("Unable to start server %s", this.a);
            }
        }
        return this.b.a;
    }
}
