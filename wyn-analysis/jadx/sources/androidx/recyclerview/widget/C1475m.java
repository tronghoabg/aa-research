package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475m extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1478p f18920a;

    public C1475m(C1478p c1478p) {
        this.f18920a = c1478p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1478p c1478p = this.f18920a;
        int iComputeVerticalScrollRange = c1478p.f18951s.computeVerticalScrollRange();
        int i11 = c1478p.f18950r;
        int i12 = iComputeVerticalScrollRange - i11;
        int i13 = c1478p.f18934a;
        c1478p.f18952t = i12 > 0 && i11 >= i13;
        int iComputeHorizontalScrollRange = c1478p.f18951s.computeHorizontalScrollRange();
        int i14 = c1478p.f18949q;
        boolean z2 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i13;
        c1478p.f18953u = z2;
        boolean z10 = c1478p.f18952t;
        if (!z10 && !z2) {
            if (c1478p.f18954v != 0) {
                c1478p.d(0);
                return;
            }
            return;
        }
        if (z10) {
            float f10 = i11;
            c1478p.f18944l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            c1478p.k = Math.min(i11, (i11 * i11) / iComputeVerticalScrollRange);
        }
        if (c1478p.f18953u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i14;
            c1478p.f18947o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            c1478p.f18946n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = c1478p.f18954v;
        if (i15 == 0 || i15 == 1) {
            c1478p.d(1);
        }
    }
}
