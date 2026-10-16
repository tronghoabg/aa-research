package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class aach implements aaej {
    private static final String f = "aach";
    public final aaet a;
    public final zrt b;
    public final aaev c;
    public zwv d;
    public boolean e;

    public aach(aaet aaetVar) {
        zrt zrtVar = zrt.a;
        this.e = false;
        zkt.n(aaetVar, "uiThreadWorldModelState");
        this.a = aaetVar;
        zkt.n(zrtVar, "uiThreadChecker");
        this.b = zrtVar;
        this.c = null;
        this.d = null;
    }

    public static final LatLng e(aaem aaemVar, double d, double d2) {
        zrq zrqVar = (zrq) aaemVar.g();
        LatLng latLngE = aaemVar.e(((float) d) - (zrqVar.a / 2.0f), (((float) d2) - (zrqVar.b / 2.0f)) - 70.0f, false);
        if (latLngE == null) {
            String str = f;
            if (zrn.e(str, 3)) {
                Log.d(str, "Failed to raycast [" + d + "," + d2 + "] for " + aaemVar.toString());
                return null;
            }
        }
        return latLngE;
    }

    private final void f(zwv zwvVar, double d, double d2) {
        aacf aacfVar = new aacf(d, d2);
        this.c.d(aacfVar);
        LatLng latLng = aacfVar.a;
        if (latLng != null) {
            zwvVar.q(latLng);
        }
    }

    public final void a(zwv zwvVar, double d, double d2) {
        aaet aaetVar = this.a;
        if (aaetVar == null) {
            return;
        }
        zrq zrqVar = (zrq) aaetVar.k();
        LatLng latLngI = aaetVar.i(((float) d) - (zrqVar.a / 2.0f), (((float) d2) - (zrqVar.b / 2.0f)) - 70.0f, false);
        if (latLngI != null) {
            zwvVar.q(latLngI);
            return;
        }
        String str = f;
        if (zrn.e(str, 3)) {
            Log.d(str, "Failed to raycast [" + d + "," + d2 + "] for " + aaetVar.toString());
        }
    }

    @Override // defpackage.aaej
    @ResultIgnorabilityUnspecified
    public final boolean b(double d, double d2) {
        aach aachVar;
        this.b.a();
        if (this.d == null) {
            return false;
        }
        if (this.e) {
            boolean zL = addm.l();
            zwv zwvVar = this.d;
            if (zL) {
                aachVar = this;
                aachVar.f(zwvVar, d, d2);
            } else {
                aachVar = this;
                aachVar.a(zwvVar, d, d2);
            }
        } else {
            aachVar = this;
        }
        zwv zwvVar2 = aachVar.d;
        zwvVar2.b.d(zwvVar2);
        aachVar.d = null;
        return true;
    }

    @Override // defpackage.aaej
    @ResultIgnorabilityUnspecified
    public final boolean c(double d, double d2) {
        aach aachVar;
        this.b.a();
        if (this.d == null) {
            return false;
        }
        this.e = true;
        boolean zL = addm.l();
        zwv zwvVar = this.d;
        if (zL) {
            aachVar = this;
            aachVar.f(zwvVar, d, d2);
        } else {
            aachVar = this;
            aachVar.a(zwvVar, d, d2);
        }
        zwv zwvVar2 = aachVar.d;
        vhb vhbVar = zwvVar2.b.j;
        if (vhbVar != null) {
            try {
                vhbVar.e(zwvVar2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        return true;
    }

    @Override // defpackage.aaej
    @ResultIgnorabilityUnspecified
    public final void d() {
        this.b.a();
        zwv zwvVar = this.d;
        if (zwvVar == null) {
            return;
        }
        zwvVar.b.d(zwvVar);
        this.d = null;
    }

    public aach(aaev aaevVar) {
        this.e = false;
        this.c = aaevVar;
        this.a = null;
        this.b = zrt.a;
        this.d = null;
    }
}
