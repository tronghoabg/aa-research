package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
public final class mhk implements mhf {
    private static final yph a = yph.c("GH.Preflight.Req.NLS");

    @Override // defpackage.mhf
    public final int a() {
        return 3;
    }

    @Override // defpackage.mhf
    public final Fragment b() {
        return new mfy();
    }

    @Override // defpackage.mhf
    public final void c() {
        ((ype) ((ype) a.f()).ai((char) 4941)).y("Resolving requirement. isMet=%b", Boolean.valueOf(e()));
    }

    @Override // defpackage.mhf
    public final boolean d() {
        return true;
    }

    @Override // defpackage.mhf
    public final boolean e() {
        return ((mdo) mki.a.i(mdo.class)).a().d();
    }

    @Override // defpackage.mhf
    public final boolean f(mgl mglVar, wyd wydVar) {
        ((ype) a.l().ai((char) 4940)).y("maybeHandleEvent: %s", mglVar.name());
        if (mglVar != mgl.i) {
            return false;
        }
        ebf.j().F(rrc.h(yxy.FRX, yzz.PREFLIGHT_NOTIFICATION_LISTENER, yzy.ce).l());
        wydVar.n(this);
        return true;
    }
}
