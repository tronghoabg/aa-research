package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class arm extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ arn b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arm(arn arnVar, afck afckVar) {
        super(afckVar);
        this.b = arnVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
