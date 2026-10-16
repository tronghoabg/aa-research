package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.C1487z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.V;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.q0;
import com.google.android.gms.common.api.f;

/* loaded from: classes3.dex */
public class uef extends q0 {

    /* renamed from: oa, reason: collision with root package name */
    private B f25451oa;
    private B uef;
    private RecyclerView yo;

    private B oa(V v2) {
        B b5 = this.f25451oa;
        if (b5 == null || b5.f18756a != v2) {
            this.f25451oa = new A(v2, 0);
        }
        return this.f25451oa;
    }

    @Override // androidx.recyclerview.widget.q0
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        this.yo = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.q0
    public int[] calculateDistanceToFinalSnap(V v2, View view) {
        int[] iArr = {0, 0};
        if (v2.canScrollHorizontally()) {
            iArr[0] = uef(view, oa(v2));
            return iArr;
        }
        if (v2.canScrollVertically()) {
            iArr[1] = uef(view, uef(v2));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.q0
    public i0 createScroller(V v2) {
        if (v2 instanceof h0) {
            return new C1487z(this.yo.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.uef.1
                @Override // androidx.recyclerview.widget.C1487z
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.C1487z
                public int calculateTimeForScrolling(int i5) {
                    return Math.min(100, super.calculateTimeForScrolling(i5));
                }

                @Override // androidx.recyclerview.widget.C1487z, androidx.recyclerview.widget.i0
                public void onTargetFound(View view, j0 j0Var, g0 g0Var) {
                    uef uefVar = uef.this;
                    int[] iArrCalculateDistanceToFinalSnap = uefVar.calculateDistanceToFinalSnap(uefVar.yo.getLayoutManager(), view);
                    int i5 = iArrCalculateDistanceToFinalSnap[0];
                    int i10 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i5), Math.abs(i10)));
                    if (iCalculateTimeForDeceleration > 0) {
                        g0Var.b(i5, i10, this.mDecelerateInterpolator, iCalculateTimeForDeceleration);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.q0
    public View findSnapView(V v2) {
        int childCount = v2.getChildCount();
        View view = null;
        if (childCount != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) v2;
            if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1) {
                B bUef = uef(v2);
                int i5 = f.API_PRIORITY_OTHER;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayoutManager.getChildAt(i10);
                    int iAbs = Math.abs(bUef.e(childAt));
                    if (iAbs < i5) {
                        view = childAt;
                        i5 = iAbs;
                    }
                }
                return view;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.q0
    public int findTargetSnapPosition(V v2, int i5, int i10) {
        View viewFindSnapView = findSnapView(v2);
        int i11 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = v2.getPosition(viewFindSnapView);
        if (v2.canScrollVertically()) {
            i11 = i10 < 0 ? position - 1 : position + 1;
        }
        return Math.min(v2.getItemCount() - 1, Math.max(i11, 0));
    }

    private int uef(View view, B b5) {
        int iE = b5.e(view);
        return iE >= b5.k() / 2 ? iE - b5.k() : iE;
    }

    private B uef(V v2) {
        B b5 = this.uef;
        if (b5 == null || b5.f18756a != v2) {
            this.uef = new A(v2, 1);
        }
        return this.uef;
    }
}
