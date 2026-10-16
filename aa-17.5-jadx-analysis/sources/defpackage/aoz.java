package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class aoz extends afda {
    float a;
    /* synthetic */ Object b;
    final /* synthetic */ apc c;
    int d;
    affu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoz(apc apcVar, afck afckVar) {
        super(afckVar);
        this.c = apcVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this);
    }
}
