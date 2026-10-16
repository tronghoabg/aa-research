package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hta implements defpackage.idi {
    final /* synthetic */ defpackage.htb a;
    private final defpackage.idx b;

    public hta(defpackage.htb htbVar, defpackage.idx idxVar) {
        this.a = htbVar;
        this.b = idxVar;
    }

    @Override // defpackage.idi
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                defpackage.idx idxVar = this.b;
                for (defpackage.ien ienVar : defpackage.igg.e(idxVar.a)) {
                    if (!ienVar.l() && !ienVar.k()) {
                        ienVar.c();
                        if (idxVar.c) {
                            idxVar.b.add(ienVar);
                        } else {
                            ienVar.b();
                        }
                    }
                }
            }
        }
    }
}
