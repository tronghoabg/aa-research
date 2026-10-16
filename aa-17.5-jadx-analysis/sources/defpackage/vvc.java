package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class vvc implements vqa {
    final /* synthetic */ ackk a;
    final /* synthetic */ zgt b;
    public final /* synthetic */ vve c;

    public vvc(vve vveVar, ackk ackkVar, zgt zgtVar) {
        this.a = ackkVar;
        this.b = zgtVar;
        this.c = vveVar;
    }

    @Override // defpackage.vqa
    public final void g(vky vkyVar) {
        vve vveVar = this.c;
        vveVar.g.a(3, vkyVar.a);
        vveVar.a();
        long jLongValue = ((Long) this.a.a()).longValue();
        vveVar.i = this.b.schedule(new unj(this, vkyVar, 12, null), jLongValue, TimeUnit.SECONDS);
    }

    @Override // defpackage.vqa
    public final void j(vky vkyVar) {
        vve vveVar = this.c;
        vveVar.g.a(4, vkyVar.a);
        vveVar.a();
        vveVar.h = this.b.schedule(new jpx(this, vkyVar, 20, (byte[]) null), 10L, TimeUnit.SECONDS);
    }
}
