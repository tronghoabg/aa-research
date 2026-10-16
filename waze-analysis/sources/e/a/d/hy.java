package e.a.d;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f47127a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iw f47128b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f47129c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Future f47130d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f47131e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Future f47132f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ iy f47133g;

    hy(iy iyVar, Collection collection, iw iwVar, boolean z, Future future, boolean z2, Future future2) {
        this.f47127a = collection;
        this.f47128b = iwVar;
        this.f47129c = z;
        this.f47130d = future;
        this.f47131e = z2;
        this.f47132f = future2;
        Objects.requireNonNull(iyVar);
        this.f47133g = iyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.a.ee eeVar;
        for (iw iwVar : this.f47127a) {
            if (iwVar != this.f47128b) {
                iwVar.f47186a.c(iy.f47196g);
            }
        }
        if (this.f47129c) {
            Future future = this.f47130d;
            if (future != null) {
                future.cancel(false);
            }
            if (!this.f47131e) {
                iy iyVar = this.f47133g;
                if (iyVar.z.decrementAndGet() == Integer.MIN_VALUE) {
                    iyVar.f47205l.execute(new hx(this));
                }
            }
        }
        Future future2 = this.f47132f;
        if (future2 != null) {
            future2.cancel(false);
        }
        iy iyVar2 = this.f47133g;
        fo foVar = iyVar2.f47202f.f46898b.L;
        synchronized (foVar.f46940a) {
            foVar.f46941b.remove(iyVar2);
            if (foVar.f46941b.isEmpty()) {
                eeVar = foVar.f46942c;
                foVar.f46941b = new HashSet();
            } else {
                eeVar = null;
            }
        }
        if (eeVar != null) {
            foVar.f46943d.K.t(eeVar);
        }
    }
}
