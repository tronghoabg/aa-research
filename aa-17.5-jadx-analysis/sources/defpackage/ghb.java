package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class ghb extends afde implements afeh {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ ghc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghb(ghc ghcVar, afck afckVar) {
        super(3, afckVar);
        this.c = ghcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gim, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        ghc ghcVar = this.c;
        boolean z = this.a;
        ?? r0 = this.b;
        ghcVar.f = z;
        boolean z2 = false;
        if (!z) {
            ((ynz) ghc.a.e().o(ypi.a, "CarApp.H.Dis").ai(49)).u("Content moderation is not enabled not showing speedbump.");
            ghcVar.e = false;
        } else if (affa.f(r0, ghcVar.d)) {
            ((ynz) ghc.a.e().o(ypi.a, "CarApp.H.Dis").ai(48)).u("Event was the same as the most recent event.");
            z2 = ghcVar.e;
        } else {
            ghcVar.d = r0;
            ggv ggvVar = ghcVar.c;
            wer.c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime > ggvVar.d) {
                ggvVar.a(ggvVar.c + ((jElapsedRealtime - r7) / ggvVar.b), jElapsedRealtime);
            }
            float f = ggvVar.c;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            yob yobVar = ggv.a;
            yop yopVarE = yobVar.e();
            yos yosVar = ypi.a;
            ((ynz) yopVarE.o(yosVar, "CarApp.H.Dis").ai(43)).R("Requesting: %d, Stored: %f/%f", 1, Float.valueOf(ggvVar.c), Float.valueOf(6.0f));
            if (f <= 1.0f) {
                ggvVar.a(BitmapDescriptorFactory.HUE_RED, jElapsedRealtime2 + 600);
                ((ynz) ghc.a.e().o(yosVar, "CarApp.H.Dis").ai(47)).u("Speedbump triggered from SpeedbumpService.");
                geu geuVar = ghcVar.b;
                geuVar.k().d(gnr.b(22, ((gmh) geuVar.d()).a));
                wer.c();
                ggvVar.a(6.0f, SystemClock.elapsedRealtime());
                ghcVar.e = true;
                z2 = true;
            } else {
                if (jElapsedRealtime2 >= ggvVar.d || !ggvVar.e) {
                    ggvVar.a(f - 1.0f, jElapsedRealtime2 + 600);
                    ((ynz) yobVar.e().o(yosVar, "CarApp.H.Dis").ai(44)).ac(ggvVar.c, ggvVar.e);
                    ggvVar.e = true;
                } else {
                    ggvVar.a(f, jElapsedRealtime2 + 600);
                    ggvVar.e = false;
                    ((ynz) yobVar.e().o(yosVar, "CarApp.H.Dis").ai(45)).u("Used up free secondary permit");
                }
                ((ynz) ghc.a.e().o(yosVar, "CarApp.H.Dis").ai(46)).y("Permit acquired successfully for %s.", r0);
                z2 = false;
                ghcVar.e = false;
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ghb ghbVar = new ghb(this.c, (afck) obj3);
        ghbVar.a = zBooleanValue;
        ghbVar.b = (gim) obj2;
        return ghbVar.hT(afak.a);
    }
}
