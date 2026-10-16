package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ann implements defpackage.apw {
    final /* synthetic */ defpackage.ano a;

    public ann(defpackage.ano anoVar) {
        this.a = anoVar;
    }

    @Override // defpackage.apw
    public final float a(float f) {
        if (java.lang.Float.isNaN(f)) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        defpackage.ano anoVar = this.a;
        float fFloatValue = ((java.lang.Number) anoVar.a.invoke(java.lang.Float.valueOf(f))).floatValue();
        anoVar.d.b(java.lang.Boolean.valueOf(fFloatValue > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
        anoVar.e.b(java.lang.Boolean.valueOf(fFloatValue < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED));
        return fFloatValue;
    }
}
