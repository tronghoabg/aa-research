package defpackage;

/* loaded from: classes2.dex */
final class ajef extends ajbv {
    public final lds c;

    public ajef(long j, ajef ajefVar, int i) {
        super(j, ajefVar, i);
        this.c = new lds(ajee.f);
    }

    @Override // defpackage.ajbv
    public final int a() {
        return ajee.f;
    }

    @Override // defpackage.ajbv
    public final void k(int i) {
        lds ldsVar = this.c;
        ldsVar.m(i).c(ajee.e);
        r();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
