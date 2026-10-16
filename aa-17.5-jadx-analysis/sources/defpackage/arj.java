package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class arj extends afda {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ arn c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arj(arn arnVar, afck afckVar) {
        super(afckVar);
        this.c = arnVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
