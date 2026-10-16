package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dqd extends defpackage.dpx implements defpackage.dql {
    protected final defpackage.dqh al;
    public final java.util.ArrayList am;
    public final int an;

    public dqd(defpackage.dqh dqhVar, int i) {
        super(dqhVar);
        this.am = new java.util.ArrayList();
        this.al = dqhVar;
        this.an = i;
    }

    @Override // defpackage.dpx, defpackage.dqe
    public final defpackage.dqv b() {
        return x();
    }

    public defpackage.dra x() {
        return null;
    }

    public final void y() {
        super.e();
    }

    public final void z(java.lang.Object... objArr) {
        java.util.Collections.addAll(this.am, objArr);
    }

    @Override // defpackage.dpx, defpackage.dqe
    public void e() {
    }
}
