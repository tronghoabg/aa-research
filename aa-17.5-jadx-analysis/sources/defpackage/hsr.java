package defpackage;

/* loaded from: classes2.dex */
final class hsr implements icz {
    final /* synthetic */ hss a;
    private final ido b;

    public hsr(hss hssVar, ido idoVar) {
        this.a = hssVar;
        this.b = idoVar;
    }

    @Override // defpackage.icz
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                ido idoVar = this.b;
                for (ief iefVar : ify.e(idoVar.a)) {
                    if (!iefVar.l() && !iefVar.k()) {
                        iefVar.c();
                        if (idoVar.c) {
                            idoVar.b.add(iefVar);
                        } else {
                            iefVar.b();
                        }
                    }
                }
            }
        }
    }
}
