package defpackage;

/* loaded from: classes3.dex */
public final class tvq extends umb {
    protected boolean a;
    private final tvr b;

    public tvq(tvr tvrVar, utf utfVar) {
        super(utfVar);
        this.a = false;
        this.b = tvrVar;
    }

    @Override // defpackage.umb, defpackage.utj, defpackage.uth
    public final void H(uth uthVar, uth uthVar2, usy usyVar) {
        if (!this.a) {
            super.H(uthVar, uthVar2, usyVar);
            return;
        }
        ((umb) this).g = new tvp(1);
        super.H(uthVar, uthVar2, usyVar);
        this.o = true;
        ((umb) this).g = new tvp(0);
        super.H(uthVar, uthVar2, usyVar);
        ((umb) this).g = new tvp(1);
    }

    @Override // defpackage.utj, defpackage.uth
    public final void b(long j) {
        this.b.z();
    }
}
