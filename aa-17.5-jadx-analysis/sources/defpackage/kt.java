package defpackage;

import android.support.v7.widget.RecyclerView;

/* loaded from: classes2.dex */
final class kt extends ca {
    final /* synthetic */ kv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(kv kvVar) {
        super(null);
        this.c = kvVar;
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        kv kvVar = this.c;
        int iComputeVerticalScrollRange = kvVar.l.computeVerticalScrollRange();
        int i3 = kvVar.k;
        kvVar.m = iComputeVerticalScrollRange - i3 > 0 && i3 >= kvVar.a;
        int iComputeHorizontalScrollRange = kvVar.l.computeHorizontalScrollRange();
        int i4 = kvVar.j;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= kvVar.a;
        kvVar.n = z;
        if (kvVar.m) {
            float f = i3;
            kvVar.e = (int) ((f * (iComputeVerticalScrollOffset + (f / 2.0f))) / iComputeVerticalScrollRange);
            kvVar.d = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        } else if (!z) {
            if (kvVar.o != 0) {
                kvVar.e(0);
                return;
            }
            return;
        }
        if (kvVar.n) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i4;
            kvVar.h = (int) ((f3 * (f2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            kvVar.g = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = kvVar.o;
        if (i5 == 0 || i5 == 1) {
            kvVar.e(1);
        }
    }
}
