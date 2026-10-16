package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class bbw extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ bbx b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbw(bbx bbxVar, afck afckVar) {
        super(afckVar);
        this.b = bbxVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, BitmapDescriptorFactory.HUE_RED, this);
    }
}
