package e.a.h;

import com.google.d.b.an;
import e.a.cm;
import e.a.ee;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends com.waze.uid.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f47771a;

    /* synthetic */ f(g gVar) {
        Objects.requireNonNull(gVar);
        this.f47771a = gVar;
    }

    @Override // com.waze.uid.f
    public final void a(ee eeVar, cm cmVar) {
        an.v(a.a.g(this.f47771a.f47773b, new ad(eeVar)), "ClientCall already closed");
    }

    @Override // com.waze.uid.f
    public final void h(Object obj) {
        g gVar = this.f47771a;
        an.v(gVar.f47773b.get() == null, "ClientCall already closed");
        gVar.f47772a.add(obj);
    }
}
