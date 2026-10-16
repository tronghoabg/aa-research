package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class lja extends liy {
    private static final yph d = yph.c("GH.CarLocationProvider");
    private final roj e;
    private final ljb f;

    public lja(roj rojVar) throws qrz {
        ljb ljbVar = new ljb(this, 1, null);
        this.f = ljbVar;
        woy.aa(l(rojVar), "Can't create unsupported CarLocationProvider.");
        this.e = rojVar;
        try {
            rojVar.f(ljbVar, 10, 0);
        } catch (qrz unused) {
            ((ype) ((ype) d.h()).ai((char) 3974)).u("Car location sensor not available when car is not connected.");
        }
    }

    static boolean l(roj rojVar) throws qrz {
        return rojVar != null && rojVar.d(10);
    }

    @Override // defpackage.liy
    protected final yyv b(Float f) {
        return (f == null || f.floatValue() == BitmapDescriptorFactory.HUE_RED) ? yyv.CAR_LOCATION_PROVIDER_NULL_SPEED : yyv.CAR_LOCATION_PROVIDER_HAS_SPEED;
    }

    @Override // defpackage.liz
    public final void i() {
        super.i();
        this.e.b(this.f);
    }
}
