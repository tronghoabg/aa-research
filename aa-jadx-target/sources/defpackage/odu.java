package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class odu extends defpackage.ocx {
    final /* synthetic */ defpackage.odw b;

    public odu(defpackage.odw odwVar) {
        this.b = odwVar;
    }

    @Override // defpackage.ocx
    public final int a() {
        defpackage.ctc ctcVar = this.b.c;
        if (ctcVar != null) {
            return (int) (ctcVar.h() & 4294967295L);
        }
        return 0;
    }

    @Override // defpackage.ocx
    public final int b() {
        defpackage.ctc ctcVar = this.b.c;
        if (ctcVar != null) {
            return (int) (ctcVar.h() >> 32);
        }
        return 0;
    }

    @Override // defpackage.ocx
    public final android.content.Context c() {
        return (android.content.Context) defpackage.cjv.y(this.b, defpackage.daj.b);
    }

    @Override // defpackage.ocx
    public final android.graphics.Point d() {
        defpackage.ctc ctcVar = this.b.c;
        if (ctcVar != null) {
            defpackage.cji cjiVar = new defpackage.cji(ctcVar.k(0L));
            if ((((cjiVar.a & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
                cjiVar = null;
            }
            if (cjiVar != null) {
                long j = cjiVar.a;
                return new android.graphics.Point((int) java.lang.Float.intBitsToFloat((int) (j >> 32)), (int) java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
        return new android.graphics.Point(0, 0);
    }

    @Override // defpackage.ocx
    public final void e(java.lang.Runnable runnable) {
        defpackage.odw odwVar = this.b;
        if (odwVar.c == null) {
            odwVar.d.add(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.ocx
    public final void h(java.lang.Runnable runnable) {
        ((android.view.View) defpackage.cjv.y(this.b, defpackage.daj.f)).post(runnable);
    }

    @Override // defpackage.ocx
    public final void i() {
        defpackage.odw odwVar = this.b;
        if (odwVar.A) {
            defpackage.mw.w(odwVar);
        } else {
            ((defpackage.yqj) defpackage.odw.a.h()).u("Tooltip anchor not attached, unable to request focus");
        }
    }

    @Override // defpackage.ocx
    public final void f() {
    }

    @Override // defpackage.ocx
    public final void g() {
    }
}
