package defpackage;

import com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class nbr extends afda {
    float a;
    /* synthetic */ Object b;
    final /* synthetic */ nbu c;
    int d;
    nbu e;
    SlidingViewSwitcher f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbr(nbu nbuVar, afck afckVar) {
        super(afckVar);
        this.c = nbuVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(BitmapDescriptorFactory.HUE_RED, this);
    }
}
