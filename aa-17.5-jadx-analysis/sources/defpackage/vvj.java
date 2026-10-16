package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class vvj extends vvf implements vsa {
    public final zgt a;
    public final vll b;
    public final ackk c;
    public final vry d;
    public final vvp e;
    private final boolean f;
    private final vve g;

    public vvj(wci wciVar, vve vveVar, zgt zgtVar, ackk ackkVar, vvp vvpVar, vll vllVar, aezk aezkVar, Executor executor, xxh xxhVar) {
        new AtomicReference(vva.a);
        new ConcurrentHashMap();
        this.g = vveVar;
        this.b = vllVar;
        this.d = wciVar.d(executor, ackkVar, aezkVar);
        this.a = zgtVar;
        this.c = ackkVar;
        this.e = vvpVar;
        this.f = ((Boolean) xxhVar.d(false)).booleanValue();
    }

    @Override // defpackage.vvf
    public final void a() {
        vvd vvdVar = new vvd() { // from class: vvh
            @Override // defpackage.vvd
            public final void a(int i, String str) {
                vvj vvjVar = this.a;
                if (!vvjVar.b.a) {
                    vvjVar.a.execute(new zhk(new vvg(vvjVar, i, str, 0)));
                } else {
                    if (zgk.a != null) {
                        return;
                    }
                    new zgk();
                }
            }
        };
        vve vveVar = this.g;
        vveVar.g = vvdVar;
        if (vveVar.f.getAndSet(true)) {
            return;
        }
        vveVar.b.execute(new zhk(new vtb(vveVar, 4)));
    }

    @Override // defpackage.vsa
    public final void k() {
        if (this.f) {
            a();
        }
    }
}
