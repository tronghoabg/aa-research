package e.a.d;

import j$.util.Objects;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f46826a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eh f46827b;

    dt(eh ehVar, List list) {
        this.f46826a = list;
        Objects.requireNonNull(ehVar);
        this.f46827b = ehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ge geVar;
        eh ehVar = this.f46827b;
        SocketAddress socketAddressB = ehVar.m.b();
        eb ebVar = ehVar.m;
        List list = this.f46826a;
        ebVar.e(list);
        ehVar.n = list;
        e.a.w wVarA = ehVar.w.a();
        e.a.w wVar = e.a.w.f47852b;
        if ((wVarA != wVar && ehVar.w.a() != e.a.w.f47851a) || ehVar.m.h(socketAddressB)) {
            geVar = null;
        } else if (ehVar.w.a() == wVar) {
            geVar = ehVar.v;
            ehVar.v = null;
            ehVar.m.d();
            eh.A(ehVar, e.a.w.f47854d);
        } else {
            ehVar.u.t(e.a.ee.f47411k.g("InternalSubchannel closed pending transport due to address change"));
            ehVar.u = null;
            ehVar.m.d();
            eh.E(ehVar);
            geVar = null;
        }
        if (geVar != null) {
            if (ehVar.q != null) {
                ehVar.r.t(e.a.ee.f47411k.g("InternalSubchannel closed transport early due to address change"));
                ehVar.q.a();
                ehVar.q = null;
                ehVar.r = null;
            }
            ehVar.r = geVar;
            ehVar.q = ehVar.f46877l.a(new ds(this), 5L, TimeUnit.SECONDS, ehVar.f46870e);
        }
    }
}
