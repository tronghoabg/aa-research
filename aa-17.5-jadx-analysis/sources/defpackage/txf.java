package defpackage;

/* loaded from: classes3.dex */
public final class txf implements ujx {
    public int a = 255;
    public final ukf b;

    public txf() {
        ujf ujfVar = ujf.c;
        uje ujeVar = new uje();
        ujeVar.e = false;
        ujeVar.f = false;
        ujeVar.t = -1;
        this.b = ukf.k(new ujf(ujeVar), false);
    }

    @Override // defpackage.ujx
    public final ukf c(int i) {
        throw null;
    }

    @Override // defpackage.ujx
    public final ukf d(int i, aekf aekfVar) {
        throw null;
    }

    @Override // defpackage.ujx
    public final ukf i(long j) {
        throw null;
    }

    @Override // defpackage.ujx
    public final ukf j(int i) {
        ukf ukfVar = this.b;
        synchronized (ukfVar) {
        }
        return ukfVar;
    }
}
