package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes.dex */
public final class C extends C1487z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f18760b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(q0 q0Var, Context context, int i5) {
        super(context);
        this.f18759a = i5;
        this.f18760b = q0Var;
    }

    @Override // androidx.recyclerview.widget.C1487z
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        switch (this.f18759a) {
        }
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C1487z
    public int calculateTimeForScrolling(int i5) {
        switch (this.f18759a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i5));
            default:
                return super.calculateTimeForScrolling(i5);
        }
    }

    @Override // androidx.recyclerview.widget.C1487z, androidx.recyclerview.widget.i0
    public final void onTargetFound(View view, j0 j0Var, g0 g0Var) {
        switch (this.f18759a) {
            case 0:
                D d3 = (D) this.f18760b;
                int[] iArrCalculateDistanceToFinalSnap = d3.calculateDistanceToFinalSnap(d3.mRecyclerView.getLayoutManager(), view);
                int i5 = iArrCalculateDistanceToFinalSnap[0];
                int i10 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i5), Math.abs(i10)));
                if (iCalculateTimeForDeceleration > 0) {
                    g0Var.b(i5, i10, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                    break;
                }
                break;
            default:
                q0 q0Var = this.f18760b;
                RecyclerView recyclerView = q0Var.mRecyclerView;
                if (recyclerView != null) {
                    int[] iArrCalculateDistanceToFinalSnap2 = q0Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
                    int i11 = iArrCalculateDistanceToFinalSnap2[0];
                    int i12 = iArrCalculateDistanceToFinalSnap2[1];
                    int iCalculateTimeForDeceleration2 = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
                    if (iCalculateTimeForDeceleration2 > 0) {
                        g0Var.b(i11, i12, this.mDecelerateInterpolator, iCalculateTimeForDeceleration2);
                        break;
                    }
                }
                break;
        }
    }
}
