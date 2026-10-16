package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wtm extends android.util.Property {
    public wtm(java.lang.Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        int i = defpackage.wtn.f;
        return java.lang.Float.valueOf(((defpackage.wtn) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.wtn wtnVar = (defpackage.wtn) obj;
        float fFloatValue = ((java.lang.Float) obj2).floatValue();
        wtnVar.e = fFloatValue;
        java.util.List list = wtnVar.k;
        ((defpackage.wtf) list.get(0)).a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        defpackage.wtf wtfVar = (defpackage.wtf) list.get(0);
        defpackage.wtf wtfVar2 = (defpackage.wtf) list.get(1);
        defpackage.epc epcVar = wtnVar.a;
        float fH = defpackage.wtn.h((int) (fFloatValue * 333.0f), 0, 667);
        float interpolation = epcVar.getInterpolation(fH);
        wtfVar2.a = interpolation;
        wtfVar.b = interpolation;
        defpackage.wtf wtfVar3 = (defpackage.wtf) list.get(1);
        defpackage.wtf wtfVar4 = (defpackage.wtf) list.get(2);
        float interpolation2 = epcVar.getInterpolation(fH + 0.49925038f);
        wtfVar4.a = interpolation2;
        wtfVar3.b = interpolation2;
        ((defpackage.wtf) list.get(2)).b = 1.0f;
        if (wtnVar.d && ((defpackage.wtf) list.get(1)).b < 1.0f) {
            ((defpackage.wtf) list.get(2)).c = ((defpackage.wtf) list.get(1)).c;
            ((defpackage.wtf) list.get(1)).c = ((defpackage.wtf) list.get(0)).c;
            ((defpackage.wtf) list.get(0)).c = wtnVar.b.e[wtnVar.c];
            wtnVar.d = false;
        }
        wtnVar.j.invalidateSelf();
    }
}
