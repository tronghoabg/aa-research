package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class gjd extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ gje b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjd(gje gjeVar, afck afckVar) {
        super(afckVar);
        this.b = gjeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(BitmapDescriptorFactory.HUE_RED, this);
    }
}
