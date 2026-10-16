package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class drk extends defpackage.drj {
    public int m;

    public drk(defpackage.drr drrVar) {
        super(drrVar);
        this.l = true != (drrVar instanceof defpackage.dro) ? 3 : 2;
    }

    @Override // defpackage.drj
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((defpackage.drh) it.next()).f();
        }
    }
}
