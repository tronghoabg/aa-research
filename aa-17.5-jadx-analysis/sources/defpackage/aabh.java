package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aabh extends tqp implements zvh {
    public static final abfi a = abfi.WORLD_ENCODING_LAT_LNG_DOUBLE;
    static final List b;
    public final zvi c;
    public final aacl d;
    public final zrt e;
    public final int f;
    public final aabf g;
    public boolean h;
    public boolean i;
    public final twq j;
    public final abnr k;
    private final Executor l;
    private final abnp m;

    static {
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Float fValueOf2 = Float.valueOf(1.0f);
        b = Arrays.asList(fValueOf, fValueOf, fValueOf2, fValueOf, fValueOf2, fValueOf2, fValueOf, fValueOf2);
    }

    public aabh(twq twqVar, zvi zviVar, int i) {
        aabf aabfVar = new aabf(twqVar);
        Executor executorB = zrz.b();
        aacl aaclVar = aacl.b;
        zrt zrtVar = zrt.a;
        zkt.n(twqVar, "phoenixGoogleMap");
        this.j = twqVar;
        this.c = zviVar;
        this.f = i;
        this.g = aabfVar;
        this.l = executorB;
        zkt.n(aaclVar, "multiZoomStyleFactoryPhoenix");
        this.d = aaclVar;
        zkt.n(zrtVar, "uiThreadChecker");
        this.e = zrtVar;
        this.h = false;
        this.i = false;
        this.k = (abnr) abax.a.n();
        this.m = abdx.a.n();
    }

    private static LatLng f(too tooVar, too tooVar2, double d) {
        too tooVarM = tooVar.m(tooVar2);
        tooVarM.z(-d);
        tooVarM.y(tooVar2);
        return new LatLng(tooVarM.a(), tooVarM.b());
    }

    @Override // defpackage.tqq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.l.execute(new aabr(this, 1));
    }

    public final float c() {
        zvi zviVar = this.c;
        return zviVar.h() ? zviVar.b() : BitmapDescriptorFactory.HUE_RED;
    }

    public final tqq d() {
        if (this.c.g()) {
            return this;
        }
        return null;
    }

    public final void e() {
        int i;
        int i2;
        int i3;
        double[] dArr;
        zvi zviVar = this.c;
        LatLngBounds latLngBoundsF = zviVar.f();
        LatLng position = zviVar.getPosition();
        double bearing = zviVar.getBearing();
        zkt.n(latLngBoundsF, "bounds");
        zkt.n(position, "anchor");
        if (bearing == 0.0d) {
            LatLng latLng = latLngBoundsF.northeast;
            double d = latLng.latitude;
            LatLng latLng2 = latLngBoundsF.southwest;
            double d2 = latLng2.latitude;
            double d3 = latLng2.longitude;
            double d4 = latLng.longitude;
            if (d3 > d4 && d4 == -180.0d) {
                d4 = 180.0d;
            }
            dArr = new double[]{d, d3, d, d4, d2, d4, d2, d3};
            i2 = 2;
            i3 = 0;
            i = 1;
        } else {
            LatLng latLng3 = latLngBoundsF.northeast;
            too tooVarL = too.l(latLng3.latitude, latLng3.longitude);
            LatLng latLng4 = latLngBoundsF.southwest;
            i = 1;
            too tooVarL2 = too.l(latLng4.latitude, latLng4.longitude);
            too tooVarL3 = too.l(latLngBoundsF.northeast.latitude, latLngBoundsF.southwest.longitude);
            i2 = 2;
            i3 = 0;
            too tooVarL4 = too.l(latLngBoundsF.southwest.latitude, latLngBoundsF.northeast.longitude);
            too tooVarL5 = too.l(position.latitude, position.longitude);
            double radians = Math.toRadians(bearing);
            LatLng latLngF = f(tooVarL, tooVarL5, radians);
            LatLng latLngF2 = f(tooVarL2, tooVarL5, radians);
            LatLng latLngF3 = f(tooVarL3, tooVarL5, radians);
            LatLng latLngF4 = f(tooVarL4, tooVarL5, radians);
            dArr = new double[]{latLngF3.latitude, latLngF3.longitude, latLngF.latitude, latLngF.longitude, latLngF4.latitude, latLngF4.longitude, latLngF2.latitude, latLngF2.longitude};
        }
        abnp abnpVar = this.m;
        abms abmsVarG = tss.g(dArr);
        abnpVar.t();
        abdx abdxVar = (abdx) abnpVar.b;
        abdx abdxVar2 = abdx.a;
        abmsVarG.getClass();
        abdxVar.b |= i;
        abdxVar.c = abmsVarG;
        abnpVar.t();
        abdx abdxVar3 = (abdx) abnpVar.b;
        abdxVar3.b |= i2;
        abdxVar3.f = 4;
        abnpVar.t();
        abdx abdxVar4 = (abdx) abnpVar.b;
        abdxVar4.b |= 8;
        abdxVar4.j = i3;
        abnpVar.t();
        ((abdx) abnpVar.b).e = abnn.a;
        List list = b;
        abnpVar.t();
        abdx abdxVar5 = (abdx) abnpVar.b;
        abdxVar5.b();
        abmc.i(list, abdxVar5.e);
        abnr abnrVar = this.k;
        abnrVar.t();
        abax abaxVar = (abax) abnrVar.b;
        abdx abdxVar6 = (abdx) abnpVar.q();
        abax abaxVar2 = abax.a;
        abdxVar6.getClass();
        abaxVar.c = abdxVar6;
        abaxVar.b |= i;
    }
}
