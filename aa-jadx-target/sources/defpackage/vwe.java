package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vwe extends defpackage.vwa implements defpackage.vsw {
    public final defpackage.zhw a;
    public final defpackage.vmh b;
    public final defpackage.aclm c;
    public final defpackage.vsu d;
    public final defpackage.vwk e;
    private final boolean f;
    private final defpackage.vvz g;

    public vwe(defpackage.wde wdeVar, defpackage.vvz vvzVar, defpackage.zhw zhwVar, defpackage.aclm aclmVar, defpackage.vwk vwkVar, defpackage.vmh vmhVar, defpackage.afak afakVar, java.util.concurrent.Executor executor, defpackage.xyn xynVar) {
        new java.util.concurrent.atomic.AtomicReference(defpackage.vvv.a);
        new j$.util.concurrent.ConcurrentHashMap();
        this.g = vvzVar;
        this.b = vmhVar;
        this.d = wdeVar.d(executor, aclmVar, afakVar);
        this.a = zhwVar;
        this.c = aclmVar;
        this.e = vwkVar;
        this.f = ((java.lang.Boolean) xynVar.d(java.lang.Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.vwa
    public final void a() {
        defpackage.vvy vvyVar = new defpackage.vvy() { // from class: vwc
            @Override // defpackage.vvy
            public final void a(int i, java.lang.String str) {
                defpackage.vwe vweVar = this.a;
                if (!vweVar.b.a) {
                    vweVar.a.execute(new defpackage.zim(new defpackage.vwb(vweVar, i, str, 0)));
                } else {
                    if (defpackage.zhn.a != null) {
                        return;
                    }
                    new defpackage.zhn();
                }
            }
        };
        defpackage.vvz vvzVar = this.g;
        vvzVar.g = vvyVar;
        if (vvzVar.f.getAndSet(true)) {
            return;
        }
        vvzVar.b.execute(new defpackage.zim(new defpackage.vtx(vvzVar, 4)));
    }

    @Override // defpackage.vsw
    public final void k() {
        if (this.f) {
            a();
        }
    }
}
