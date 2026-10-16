package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class kkh extends eqj {
    private static final yph l = yph.c("GH.CarPropertyStateLD");
    public final kjz a;
    public aivh j;
    public final aitx h = ahni.b(mkm.a.b().plus(new aiwh(null)));
    public final ArrayDeque i = new ArrayDeque();
    public final long k = 2000;
    private final ajmd m = new ajmd(this);

    public kkh(kjz kjzVar) {
        this.a = kjzVar;
    }

    public final void a(kkf kkfVar) {
        aivh aivhVar;
        ArrayDeque arrayDeque = this.i;
        synchronized (arrayDeque) {
            if (!arrayDeque.isEmpty()) {
                if ((kkfVar instanceof kkc) && affa.f(((kkc) kkfVar).a, arrayDeque.peekFirst())) {
                    arrayDeque.removeFirst();
                    if (arrayDeque.isEmpty() && (aivhVar = this.j) != null) {
                        aivhVar.s(null);
                    }
                    return;
                }
                ((ype) l.h()).R("Unexpected property state update for %s. Expected %s, got %s. Clearing optimistic data.", this.a.a, arrayDeque.peekFirst(), kkfVar);
                arrayDeque.clear();
                aivh aivhVar2 = this.j;
                if (aivhVar2 != null) {
                    aivhVar2.s(null);
                }
            }
            j(kkfVar);
        }
    }

    @Override // defpackage.eqj
    protected final void c() {
        kjq kjqVarA = kjq.a.a();
        ajmd ajmdVar = this.m;
        ajmdVar.getClass();
        kjz kjzVar = this.a;
        kjzVar.getClass();
        khc.u(new wci("GH.CarControlManager", yzz.CAR_CONTROLS, yzy.Mi, "Car not connected when registering car property state listener.", new Object[0]), new ah((Object) kjqVarA, (Object) ajmdVar, (Object) kjzVar, 13, (byte[]) null));
    }

    @Override // defpackage.eqj
    protected final void d() {
        kjq kjqVarA = kjq.a.a();
        ajmd ajmdVar = this.m;
        ajmdVar.getClass();
        if (kio.b().q()) {
            khc.u(new wci("GH.CarControlManager", yzz.CAR_CONTROLS, yzy.Mj, "Car not connected when unregistering car property state listener.", new Object[0]), new hgl(kjqVarA, ajmdVar, 19));
        }
        synchronized (this.i) {
            aivh aivhVar = this.j;
            if (aivhVar != null) {
                aivhVar.s(null);
            }
        }
    }
}
