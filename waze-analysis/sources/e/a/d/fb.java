package e.a.d;

import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fb extends e.a.bl {

    /* renamed from: a, reason: collision with root package name */
    e.a.bt f46915a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fp f46916b;

    /* synthetic */ fb(fp fpVar) {
        Objects.requireNonNull(fpVar);
        this.f46916b = fpVar;
    }

    @Override // e.a.bl
    public final e.a.j a() {
        return this.f46916b.T;
    }

    @Override // e.a.bl
    public final /* bridge */ /* synthetic */ e.a.bq b(e.a.bi biVar) {
        fp fpVar = this.f46916b;
        fpVar.f46951d.d();
        com.google.d.b.an.v(!fpVar.N, "Channel is being terminated");
        return new g(fpVar, biVar);
    }

    @Override // e.a.bl
    public final e.a.el c() {
        return this.f46916b.f46951d;
    }

    @Override // e.a.bl
    public final ScheduledExecutorService d() {
        return this.f46916b.q;
    }

    @Override // e.a.bl
    public final void e() {
        e.a.el elVar = this.f46916b.f46951d;
        elVar.d();
        elVar.execute(new fa(this));
    }

    @Override // e.a.bl
    public final void f(e.a.w wVar, e.a.br brVar) {
        fp fpVar = this.f46916b;
        fpVar.f46951d.d();
        com.google.d.b.an.C(wVar, "newState");
        com.google.d.b.an.C(brVar, "newPicker");
        if (this != fpVar.F || fpVar.G) {
            return;
        }
        fpVar.an(brVar);
        if (wVar != e.a.w.f47855e) {
            fpVar.T.b(2, "Entering {0} state with picker: {1}", wVar, brVar);
            fpVar.A.a(wVar);
        }
    }
}
