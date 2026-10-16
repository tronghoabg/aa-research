package defpackage;

import android.view.VelocityTracker;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class mwr extends afda {
    float a;
    /* synthetic */ Object b;
    final /* synthetic */ mwu c;
    int d;
    VelocityTracker e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwr(mwu mwuVar, afck afckVar) {
        super(afckVar);
        this.c = mwuVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
