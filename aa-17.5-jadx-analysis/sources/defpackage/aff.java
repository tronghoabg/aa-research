package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class aff extends afde implements afeg {
    /* synthetic */ float a;

    public aff(afck afckVar) {
        super(2, afckVar);
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aff affVar = new aff(afckVar);
        affVar.a = ((Number) obj).floatValue();
        return affVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        return Boolean.valueOf(this.a > BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aff) b(Float.valueOf(((Number) obj).floatValue()), (afck) obj2)).hT(afak.a);
    }
}
