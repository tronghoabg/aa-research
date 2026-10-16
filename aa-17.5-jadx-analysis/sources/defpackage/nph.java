package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class nph extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ npi b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nph(npi npiVar, afck afckVar) {
        super(afckVar);
        this.b = npiVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objH = this.b.h(BitmapDescriptorFactory.HUE_RED, this);
        return objH == afcr.a ? objH : new aezw(objH);
    }
}
