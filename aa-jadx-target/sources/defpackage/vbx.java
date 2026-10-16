package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vbx extends defpackage.adnw {
    final /* synthetic */ defpackage.vca a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbx(defpackage.adrq adrqVar, defpackage.vca vcaVar) {
        super(adrqVar);
        this.a = vcaVar;
    }

    @Override // defpackage.adrq
    public final void a(defpackage.ador adorVar, defpackage.adnd adndVar) {
        defpackage.vca vcaVar = this.a;
        synchronized (vcaVar.a) {
            if (!vcaVar.c) {
                vcaVar.c = true;
                defpackage.vbz vbzVar = vcaVar.b;
                if (vbzVar == null) {
                    defpackage.vwp vwpVar = vcaVar.d;
                    vwpVar.p = adorVar.p.r;
                    defpackage.vlw.a().d(vwpVar);
                } else {
                    synchronized (vbzVar.a) {
                        defpackage.vwp vwpVar2 = vbzVar.b;
                        int i = vbzVar.d;
                        int i2 = vbzVar.e;
                        vwpVar2.c = android.os.SystemClock.elapsedRealtime() - vwpVar2.a;
                        vwpVar2.d = i;
                        vwpVar2.e = i2;
                        vwpVar2.p = adorVar.p.r;
                        defpackage.vlw.a().d(vwpVar2);
                        vbzVar.c = true;
                    }
                }
            }
        }
        this.f.a(adorVar, adndVar);
    }
}
