package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.projection.gearhead.companion.ParallaxHeader;

/* loaded from: classes.dex */
public final class wzh extends ca {
    final /* synthetic */ ParallaxHeader c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzh(ParallaxHeader parallaxHeader) {
        super(null);
        this.c = parallaxHeader;
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        View childAt = recyclerView.getChildAt(0);
        ParallaxHeader parallaxHeader = this.c;
        int iMax = childAt == parallaxHeader ? Math.max(-childAt.getTop(), 0) : childAt.getHeight();
        if (parallaxHeader.a != iMax) {
            parallaxHeader.a = iMax;
            parallaxHeader.requestLayout();
        }
    }
}
