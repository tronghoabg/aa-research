package defpackage;

/* loaded from: classes3.dex */
public final class twh implements tyz {
    public final int a;
    private final abcy b;
    private final gjv c;

    public twh(int i, gjv gjvVar) {
        this.a = i;
        this.c = gjvVar;
        abnp abnpVarN = abcy.a.n();
        abnpVarN.t();
        abcy abcyVar = (abcy) abnpVarN.b;
        abcyVar.b |= 1;
        abcyVar.c = i;
        this.b = (abcy) abnpVarN.q();
    }

    @Override // defpackage.tqo
    public final int a() {
        return -1;
    }

    @Override // defpackage.tqo
    public final abcy b() {
        return this.b;
    }

    @Override // defpackage.tqo
    public final void c(Runnable runnable) {
        ((tyn) this.c.a).b(runnable);
    }

    @Override // defpackage.tyz
    public final boolean l(tqo tqoVar, boolean z) {
        return tqoVar instanceof twh;
    }
}
