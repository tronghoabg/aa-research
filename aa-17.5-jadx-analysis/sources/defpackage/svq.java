package defpackage;

/* loaded from: classes.dex */
public final class svq implements swa {
    public final Object a = new Object();
    public final svr b;

    public svq(svr svrVar) {
        this.b = svrVar;
    }

    @Override // defpackage.swa
    public final void a(svz svzVar) {
        if (((swe) svzVar).c) {
            synchronized (this.a) {
            }
            new shd(this, 5, null).run();
        }
    }
}
