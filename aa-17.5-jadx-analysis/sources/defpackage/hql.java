package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class hql implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    private final Object d;

    public hql(Handler handler, Callable callable, dzg dzgVar, int i) {
        this.a = i;
        this.d = callable;
        this.c = dzgVar;
        this.b = handler;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        hqx hqxVar;
        acjs acjsVarCall;
        if (this.a != 0) {
            try {
                acjsVarCall = ((dwi) this.d).call();
            } catch (Exception unused) {
                acjsVarCall = null;
            }
            ((Handler) this.b).post(new af(this.c, acjsVarCall, 19, (char[]) null));
            return;
        }
        Object obj = this.b;
        hqt hqtVar = (hqt) obj;
        if (hqtVar.k()) {
            hqtVar.h("canceled-at-delivery");
            return;
        }
        scz sczVar = (scz) this.c;
        if (sczVar.d()) {
            hqtVar.g(sczVar.d);
        } else {
            synchronized (hqtVar.e) {
                hqxVar = ((hqt) obj).f;
            }
            if (hqxVar != null) {
                hqxVar.a((hrc) sczVar.e);
            }
        }
        boolean z = ((scz) this.c).b;
        Object obj2 = this.b;
        if (z) {
            ((hqt) obj2).e("intermediate-response");
        } else {
            ((hqt) obj2).h("done");
        }
        ?? r5 = this.d;
        if (r5 != 0) {
            r5.run();
        }
    }

    public hql(hqt hqtVar, scz sczVar, Runnable runnable, int i) {
        this.a = i;
        this.b = hqtVar;
        this.c = sczVar;
        this.d = runnable;
    }
}
