package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class D extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public A f18761a;

    /* renamed from: b, reason: collision with root package name */
    public A f18762b;

    public static int a(View view, B b5) {
        return ((b5.c(view) / 2) + b5.e(view)) - ((b5.l() / 2) + b5.k());
    }

    public static View b(V v2, B b5) {
        int childCount = v2.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (b5.l() / 2) + b5.k();
        int i5 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = v2.getChildAt(i10);
            int iAbs = Math.abs(((b5.c(childAt) / 2) + b5.e(childAt)) - iL);
            if (iAbs < i5) {
                view = childAt;
                i5 = iAbs;
            }
        }
        return view;
    }

    public final B c(V v2) {
        A a5 = this.f18762b;
        if (a5 == null || a5.f18756a != v2) {
            this.f18762b = new A(v2, 0);
        }
        return this.f18762b;
    }

    @Override // androidx.recyclerview.widget.q0
    public final int[] calculateDistanceToFinalSnap(V v2, View view) {
        int[] iArr = new int[2];
        if (v2.canScrollHorizontally()) {
            iArr[0] = a(view, c(v2));
        } else {
            iArr[0] = 0;
        }
        if (v2.canScrollVertically()) {
            iArr[1] = a(view, d(v2));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.q0
    public final i0 createScroller(V v2) {
        if (v2 instanceof h0) {
            return new C(this, this.mRecyclerView.getContext(), 0);
        }
        return null;
    }

    public final B d(V v2) {
        A a5 = this.f18761a;
        if (a5 == null || a5.f18756a != v2) {
            this.f18761a = new A(v2, 1);
        }
        return this.f18761a;
    }

    @Override // androidx.recyclerview.widget.q0
    public final View findSnapView(V v2) {
        if (v2.canScrollVertically()) {
            return b(v2, d(v2));
        }
        if (v2.canScrollHorizontally()) {
            return b(v2, c(v2));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.q0
    public final int findTargetSnapPosition(V v2, int i5, int i10) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = v2.getItemCount();
        if (itemCount != 0) {
            View view = null;
            B bD = v2.canScrollVertically() ? d(v2) : v2.canScrollHorizontally() ? c(v2) : null;
            if (bD != null) {
                int childCount = v2.getChildCount();
                boolean z2 = false;
                int i11 = Integer.MAX_VALUE;
                int i12 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = v2.getChildAt(i13);
                    if (childAt != null) {
                        int iA = a(childAt, bD);
                        if (iA <= 0 && iA > i12) {
                            view2 = childAt;
                            i12 = iA;
                        }
                        if (iA >= 0 && iA < i11) {
                            view = childAt;
                            i11 = iA;
                        }
                    }
                }
                boolean z10 = !v2.canScrollHorizontally() ? i10 <= 0 : i5 <= 0;
                if (z10 && view != null) {
                    return v2.getPosition(view);
                }
                if (!z10 && view2 != null) {
                    return v2.getPosition(view2);
                }
                if (z10) {
                    view = view2;
                }
                if (view != null) {
                    int position = v2.getPosition(view);
                    int itemCount2 = v2.getItemCount();
                    if ((v2 instanceof h0) && (pointFComputeScrollVectorForPosition = ((h0) v2).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFComputeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        z2 = true;
                    }
                    int i14 = position + (z2 == z10 ? -1 : 1);
                    if (i14 >= 0 && i14 < itemCount) {
                        return i14;
                    }
                }
            }
        }
        return -1;
    }
}
