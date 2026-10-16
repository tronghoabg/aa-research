package defpackage;

import android.app.KeyguardManager;
import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
public final class mhl implements mhf {
    private static final yph a = yph.c("GH.Preflight.Req.PLock");

    private static void g(yzy yzyVar) {
        ((ohs) mki.a.i(ohs.class)).F(rrc.h(yxy.FRX, yzz.PREFLIGHT, yzyVar).l());
    }

    @Override // defpackage.mhf
    public final int a() {
        return 2;
    }

    @Override // defpackage.mhf
    public final Fragment b() {
        return new mgk();
    }

    @Override // defpackage.mhf
    public final void c() {
        ((ype) ((ype) a.f()).ai((char) 4946)).y("Resolving requirement. isMet=%b", Boolean.valueOf(e()));
    }

    @Override // defpackage.mhf
    public final boolean d() {
        return false;
    }

    @Override // defpackage.mhf
    public final boolean e() {
        mfo mfoVar = ((mfp) ((mfm) mki.a.i(mfm.class)).a()).c;
        mfoVar.getClass();
        if (mfoVar.b) {
            ((ype) ((ype) a.f()).ai((char) 4944)).u("Unlock already required during FRX");
            g(yzy.um);
            return true;
        }
        if (mkp.a()) {
            ((ype) ((ype) a.f()).ai((char) 4943)).u("connectionAllowedWhileLocked is enabled");
            g(yzy.uk);
            return true;
        }
        if (mfoVar.k.d()) {
            g(yzy.un);
            return true;
        }
        KeyguardManager keyguardManager = (KeyguardManager) mki.a.c.getSystemService("keyguard");
        keyguardManager.getClass();
        boolean zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
        ((ype) ((ype) a.f()).ai((char) 4942)).y("isLocked:%b", Boolean.valueOf(zIsKeyguardLocked));
        if (zIsKeyguardLocked) {
            return false;
        }
        g(yzy.ul);
        return true;
    }

    @Override // defpackage.mhf
    public final boolean f(mgl mglVar, wyd wydVar) {
        ((ype) a.l().ai((char) 4945)).y("maybeHandleEvent: %s", mglVar.name());
        if (mglVar != mgl.h) {
            return false;
        }
        wydVar.n(this);
        return true;
    }
}
