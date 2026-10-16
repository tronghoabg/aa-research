package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
final class vba extends admv {
    final /* synthetic */ vbd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vba(adqq adqqVar, vbd vbdVar) {
        super(adqqVar);
        this.a = vbdVar;
    }

    @Override // defpackage.adqq
    public final void a(adnq adnqVar, admc admcVar) {
        vbd vbdVar = this.a;
        synchronized (vbdVar.a) {
            if (!vbdVar.c) {
                vbdVar.c = true;
                vbc vbcVar = vbdVar.b;
                if (vbcVar == null) {
                    vvu vvuVar = vbdVar.d;
                    vvuVar.p = adnqVar.p.r;
                    vla.a().d(vvuVar);
                } else {
                    synchronized (vbcVar.a) {
                        vvu vvuVar2 = vbcVar.b;
                        int i = vbcVar.d;
                        int i2 = vbcVar.e;
                        vvuVar2.c = SystemClock.elapsedRealtime() - vvuVar2.a;
                        vvuVar2.d = i;
                        vvuVar2.e = i2;
                        vvuVar2.p = adnqVar.p.r;
                        vla.a().d(vvuVar2);
                        vbcVar.c = true;
                    }
                }
            }
        }
        this.f.a(adnqVar, admcVar);
    }
}
