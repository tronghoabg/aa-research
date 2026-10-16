package defpackage;

import android.support.v4.app.Fragment;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class mhi implements mhf {
    private static final yph a = yph.c("GH.Preflight.Req.Car");
    private final Set b = new HashSet();

    static final boolean g() {
        mfo mfoVar = ((mfp) ((mfm) mki.a.i(mfm.class)).a()).c;
        mfoVar.getClass();
        CarInfoInternal carInfoInternal = mfoVar.e;
        boolean z = carInfoInternal.p;
        ((ype) a.l().ai(4932)).R("isCarAuthorized=%b, isKnown=%b, isProjectionAllowed=%b", Boolean.valueOf(z), Boolean.valueOf(carInfoInternal.o), Boolean.valueOf(carInfoInternal.p));
        return z;
    }

    @Override // defpackage.mhf
    public final int a() {
        return 4;
    }

    @Override // defpackage.mhf
    public final Fragment b() {
        return new mgh();
    }

    @Override // defpackage.mhf
    public final void c() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 4935)).y("Resolving requirement. isMet=%b", Boolean.valueOf(e()));
        if (g()) {
            ((ype) yphVar.l().ai((char) 4931)).u("Car already allowed, skip adding to allow list");
            return;
        }
        mfo mfoVar = ((mfp) ((mfm) mki.a.i(mfm.class)).a()).c;
        mfoVar.getClass();
        jlo jloVar = new jlo(mki.a.c);
        CarInfoInternal carInfoInternal = mfoVar.e;
        try {
            jloVar.l(carInfoInternal);
            jloVar.o(carInfoInternal, true);
            carInfoInternal.o = true;
            ((ype) ((ype) yphVar.f()).ai(4930)).u("Added car to Allowed Cars list.");
            jloVar.close();
        } catch (Throwable th) {
            try {
                jloVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mhf
    public final boolean d() {
        return true;
    }

    @Override // defpackage.mhf
    public final boolean e() {
        boolean zG = g();
        if (zG) {
            Set set = this.b;
            yzy yzyVar = yzy.uB;
            if (set.add(yzyVar)) {
                ((ohs) mki.a.i(ohs.class)).f(rrc.h(yxy.FRX, yzz.PREFLIGHT_AUTHORIZE_CAR, yzyVar));
            }
        }
        ((ype) a.l().ai((char) 4933)).y("isMet:%b", Boolean.valueOf(zG));
        return zG;
    }

    @Override // defpackage.mhf
    public final boolean f(mgl mglVar, wyd wydVar) {
        ((ype) a.l().ai((char) 4934)).y("maybeHandleEvent: %s", mglVar.name());
        if (mglVar != mgl.g) {
            return false;
        }
        wydVar.n(this);
        return true;
    }
}
