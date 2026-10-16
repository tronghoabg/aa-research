package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bcq extends defpackage.ajo {
    public boolean i;
    public defpackage.affc j;
    public final defpackage.afer k;

    public bcq(boolean z, defpackage.ask askVar, defpackage.akr akrVar, boolean z2, defpackage.affc affcVar) {
        super(askVar, akrVar, false, z2, null, null, new defpackage.bcp(affcVar, z, 0));
        this.i = z;
        this.j = affcVar;
        this.k = new defpackage.bav(this, 7);
    }

    @Override // defpackage.aiw
    public final void f(defpackage.dek dekVar) {
        defpackage.cgo cgoVar;
        dekVar.a(defpackage.def.M, this.i ? defpackage.det.a : defpackage.det.b);
        dekVar.a(defpackage.def.s, defpackage.cgr.c);
        if (this.i) {
            cgoVar = defpackage.wf.a;
            if (cgoVar == null) {
                cgoVar = new defpackage.cgo(a$.ExternalSyntheticApiModelOutline1.m(true));
                defpackage.wf.a = cgoVar;
            }
        } else {
            cgoVar = defpackage.wf.b;
            if (cgoVar == null) {
                cgoVar = new defpackage.cgo(a$.ExternalSyntheticApiModelOutline1.m(false));
                defpackage.wf.b = cgoVar;
            }
        }
        if (cgoVar != null) {
            dekVar.a(defpackage.def.t, cgoVar);
        }
        dekVar.a(defpackage.ddy.h, new defpackage.ddn(null, new defpackage.bbs(this, 4)));
    }
}
