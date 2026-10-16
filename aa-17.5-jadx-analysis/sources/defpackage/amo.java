package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class amo extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ amq b;
    int c;
    affs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amo(amq amqVar, afck afckVar) {
        super(afckVar);
        this.b = amqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(BitmapDescriptorFactory.HUE_RED, this);
    }
}
