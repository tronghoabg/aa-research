package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
final class ioi extends jhd {
    final /* synthetic */ ioj a;

    public ioi(ioj iojVar) {
        this.a = iojVar;
    }

    @Override // defpackage.jhe
    public final String a() {
        return "FallbackWindow";
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void b(jhf jhfVar) {
        ioj iojVar = this.a;
        iojVar.y.K(iojVar.F, true);
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void c(jhf jhfVar, Rect rect) {
        ioj iojVar = this.a;
        iojVar.H = rect;
        raw rawVar = iojVar.G;
        if (rawVar != null) {
            rawVar.B(rect);
        }
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void d(jhf jhfVar) {
        this.a.M();
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void e(jhf jhfVar, int i, int i2) {
        ioj iojVar = this.a;
        if (iojVar.G == null) {
            iojVar.N();
        }
    }
}
