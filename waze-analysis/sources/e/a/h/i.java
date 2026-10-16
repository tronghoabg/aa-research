package e.a.h;

import com.google.d.b.an;
import e.a.cm;
import e.a.ee;
import e.a.eh;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f47774a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f47775b;

    i(j jVar) {
        Objects.requireNonNull(jVar);
        this.f47774a = jVar;
        this.f47775b = false;
    }

    @Override // com.waze.uid.f
    public final void a(ee eeVar, cm cmVar) {
        an.v(!this.f47775b, "ClientCall already closed");
        boolean zL = eeVar.l();
        j jVar = this.f47774a;
        if (zL) {
            jVar.f47776a.add(jVar);
        } else {
            jVar.f47776a.add(new eh(eeVar, cmVar));
        }
        this.f47775b = true;
    }

    @Override // e.a.h.m
    final void c() {
        this.f47774a.f47778c.c(1);
    }

    @Override // com.waze.uid.f
    public final void h(Object obj) {
        an.v(!this.f47775b, "ClientCall already closed");
        this.f47774a.f47776a.add(obj);
    }

    @Override // com.waze.uid.f
    public final void u(cm cmVar) {
    }
}
