package defpackage;

import com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class nbp extends afda {
    public /* synthetic */ Object a;
    final /* synthetic */ SlidingViewSwitcher b;
    public int c;
    public nbo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbp(SlidingViewSwitcher slidingViewSwitcher, afck afckVar) {
        super(afckVar);
        this.b = slidingViewSwitcher;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, BitmapDescriptorFactory.HUE_RED, this);
    }
}
