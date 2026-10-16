package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class adxq implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ adye b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Future d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Future f;
    final /* synthetic */ adyg g;

    public adxq(adyg adygVar, Collection collection, adye adyeVar, boolean z, Future future, boolean z2, Future future2) {
        this.a = collection;
        this.b = adyeVar;
        this.c = z;
        this.d = future;
        this.e = z2;
        this.f = future2;
        this.g = adygVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adnq adnqVar;
        for (adye adyeVar : this.a) {
            if (adyeVar != this.b) {
                adyeVar.a.c(adyg.c);
            }
        }
        if (this.c) {
            Future future = this.d;
            if (future != null) {
                future.cancel(false);
            }
            if (!this.e) {
                adyg adygVar = this.g;
                if (adygVar.u.decrementAndGet() == Integer.MIN_VALUE) {
                    adygVar.h.execute(new aduy(this, 18));
                }
            }
        }
        Future future2 = this.f;
        if (future2 != null) {
            future2.cancel(false);
        }
        adyg adygVar2 = this.g;
        advu advuVar = adygVar2.E.b.y;
        synchronized (advuVar.a) {
            advuVar.b.remove(adygVar2);
            if (advuVar.b.isEmpty()) {
                adnqVar = advuVar.c;
                advuVar.b = new HashSet();
            } else {
                adnqVar = null;
            }
        }
        if (adnqVar != null) {
            advuVar.d.x.q(adnqVar);
        }
    }
}
