package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
public final class mhm implements mhf {
    private static final yph a = yph.c("GH.Preflight.Req.TOS");

    static final ono g() {
        mfo mfoVar = ((mfp) ((mfm) mki.a.i(mfm.class)).a()).c;
        mfoVar.getClass();
        return new ono(mfoVar.a);
    }

    @Override // defpackage.mhf
    public final int a() {
        return 1;
    }

    @Override // defpackage.mhf
    public final Fragment b() {
        return new mgh();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.mhf
    public final void c() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 4951)).y("Resolving requirement. isMet=%b", Boolean.valueOf(e()));
        ono onoVarG = g();
        onoVarG.g("car_tos_main", 1);
        onoVarG.g("car_tos_data", 2);
        onoVarG.g("car_tos_safety", 1);
        if (dup.c(mki.a.c, "android.permission.READ_CALENDAR") != 0) {
            ((ype) yphVar.l().ai((char) 4950)).u("Calendar permission not granted");
        } else {
            ((ype) yphVar.l().ai((char) 4949)).u("Recording calendar acknowledgement");
            mdh.b();
        }
        yph yphVar2 = kwo.a;
        if (((kwo) mki.a.i(kwo.class)).f()) {
            kwo kwoVar = (kwo) mki.a.i(kwo.class);
            yph yphVar3 = kwo.a;
            ((ype) ((ype) yphVar3.f()).ai((char) 3428)).u("Work profile acknowledged via FRX");
            if (!kwoVar.f()) {
                throw new IllegalStateException();
            }
            mko mkoVarA = ((mkq) mki.a.i(mkq.class)).a();
            if ((!acxa.a.gu().aU() || mkoVarA.d.contains("key_work_profile_support")) ? mkoVarA.b.contains("key_work_profile_support") : mkoVarA.b.contains("key_work_profile_support")) {
                ((ype) ((ype) yphVar3.f()).ai((char) 3430)).u("Work profile setting already has value; not updating");
                return;
            }
            ((ype) ((ype) yphVar3.f()).ai((char) 3429)).u("Enabling work profile setting due to acknowledgement");
            mkoVarA.a("key_work_profile_support", true);
            ((ohs) mki.a.i(ohs.class)).F(rrc.h(yxy.FRX, yzz.WORK_PROFILE_FRX_PERMISSION_ACKNOWLEDGEMENT, yzy.BA).l());
        }
    }

    @Override // defpackage.mhf
    public final boolean d() {
        return true;
    }

    @Override // defpackage.mhf
    public final boolean e() {
        ono onoVarG = g();
        boolean zD = onoVarG.d();
        boolean zB = onoVarG.b();
        boolean z = false;
        if (zD && zB) {
            z = true;
        }
        ((ype) a.l().ai(4947)).R("requirementMet:%b, isTosAccepted:%b, isDataNoticeAccepted:%b", Boolean.valueOf(z), Boolean.valueOf(zD), Boolean.valueOf(zB));
        return z;
    }

    @Override // defpackage.mhf
    public final boolean f(mgl mglVar, wyd wydVar) {
        ((ype) a.l().ai((char) 4948)).y("maybeHandleEvent: %s", mglVar.name());
        if (mglVar != mgl.f) {
            return false;
        }
        wydVar.n(this);
        return true;
    }
}
