package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xad extends defpackage.ca {
    final /* synthetic */ com.google.android.projection.gearhead.companion.ParallaxHeader c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xad(com.google.android.projection.gearhead.companion.ParallaxHeader parallaxHeader) {
        super(null);
        this.c = parallaxHeader;
    }

    @Override // defpackage.ca
    public final void q(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        android.view.View childAt = recyclerView.getChildAt(0);
        com.google.android.projection.gearhead.companion.ParallaxHeader parallaxHeader = this.c;
        int iMax = childAt == parallaxHeader ? java.lang.Math.max(-childAt.getTop(), 0) : childAt.getHeight();
        if (parallaxHeader.a != iMax) {
            parallaxHeader.a = iMax;
            parallaxHeader.requestLayout();
        }
    }
}
