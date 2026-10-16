package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class khx extends kho {
    public static final yph a = yph.c("GH.CPCalendarStoreMgr");
    private gms b;

    public static kho f() {
        return Build.VERSION.SDK_INT >= 30 ? (kho) mki.a.i(khx.class) : kho.e();
    }

    public static final eqj g(eqj eqjVar) {
        eql eqlVar = new eql();
        eqlVar.r(eqjVar, new hlg(eqlVar, 18));
        return eqlVar;
    }

    @Override // defpackage.kho
    public final eqj a(eqj eqjVar) {
        return Build.VERSION.SDK_INT < 30 ? super.a(eqjVar) : eqy.c(eqjVar, new kaa(this, 12));
    }

    @Override // defpackage.kho
    public final eqj b(eqj eqjVar) {
        return Build.VERSION.SDK_INT < 30 ? super.b(eqjVar) : eqy.c(eqjVar, new kaa(this, 13));
    }

    @Override // defpackage.kho
    public final eqj c(eqj eqjVar, eqj eqjVar2) {
        return Build.VERSION.SDK_INT < 30 ? super.c(eqjVar, eqjVar2) : eqy.c(tby.z(eqjVar, eqjVar2), new kaa(this, 11));
    }

    public final gms h() {
        gms gmsVar = this.b;
        if (gmsVar != null) {
            return gmsVar;
        }
        gms gmsVar2 = new gms(kwo.b().d, (byte[]) null);
        this.b = gmsVar2;
        return gmsVar2;
    }
}
