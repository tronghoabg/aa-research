package defpackage;

/* loaded from: classes.dex */
public final class cuh extends cfx implements cxs {
    public afec a;
    public long b = -9223372034707292160L;

    public cuh(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cxs
    public final void et(long j) {
        if (this.b == j) {
            return;
        }
        this.a.invoke(new dlq(j));
        this.b = j;
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return true;
    }
}
