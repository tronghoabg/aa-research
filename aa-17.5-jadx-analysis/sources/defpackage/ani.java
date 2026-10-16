package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ani implements apr {
    final /* synthetic */ anj a;

    public ani(anj anjVar) {
        this.a = anjVar;
    }

    @Override // defpackage.apr
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        anj anjVar = this.a;
        float fFloatValue = ((Number) anjVar.a.invoke(Float.valueOf(f))).floatValue();
        anjVar.d.b(Boolean.valueOf(fFloatValue > BitmapDescriptorFactory.HUE_RED));
        anjVar.e.b(Boolean.valueOf(fFloatValue < BitmapDescriptorFactory.HUE_RED));
        return fFloatValue;
    }
}
