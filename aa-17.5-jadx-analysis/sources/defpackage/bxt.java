package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class bxt implements aitx, bxq {
    public static final afco a = new bup();
    public final afco b;
    public final afco c;
    private final Object d = this;
    private volatile afco e;

    public bxt(afco afcoVar, afco afcoVar2) {
        this.b = afcoVar;
        this.c = afcoVar2;
    }

    @Override // defpackage.aitx
    public final afco c() {
        afco afcoVarPlus = this.e;
        if (afcoVarPlus == null || afcoVarPlus == a) {
            afco afcoVar = this.b;
            cff cffVar = (cff) afcoVar.get(cff.a);
            afco bxsVar = cffVar != null ? new bxs(CoroutineExceptionHandler.c, cffVar, this) : afcp.a;
            synchronized (this.d) {
                afco afcoVar2 = this.e;
                if (afcoVar2 == null) {
                    afcoVarPlus = afcoVar.plus(new aivj((aivh) afcoVar.get(aivh.d))).plus(this.c).plus(bxsVar);
                } else if (afcoVar2 == a) {
                    aivj aivjVar = new aivj((aivh) afcoVar.get(aivh.d));
                    aivjVar.s(new bvr());
                    afcoVarPlus = afcoVar.plus(aivjVar).plus(this.c).plus(bxsVar);
                } else {
                    afcoVarPlus = afcoVar2;
                }
                this.e = afcoVarPlus;
            }
        }
        afcoVarPlus.getClass();
        return afcoVarPlus;
    }

    public final void d() {
        synchronized (this.d) {
            afco afcoVar = this.e;
            if (afcoVar == null) {
                this.e = a;
            } else {
                affx.e(afcoVar, new bvr());
            }
        }
    }

    @Override // defpackage.bxq
    public final void eW() {
        d();
    }

    @Override // defpackage.bxq
    public final void eX() {
        d();
    }

    @Override // defpackage.bxq
    public final void eo() {
    }
}
