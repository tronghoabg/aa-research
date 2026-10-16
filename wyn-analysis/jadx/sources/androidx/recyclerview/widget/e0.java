package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e0 extends K {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f18851b;

    public e0(RecyclerView recyclerView) {
        this.f18851b = recyclerView;
    }

    public final void a() {
        boolean z2 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.f18851b;
        if (!z2 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = k1.S.f38779a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // androidx.recyclerview.widget.K
    public final void onChanged() {
        RecyclerView recyclerView = this.f18851b;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f18899f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.K
    public final void onItemRangeChanged(int i5, int i10, Object obj) {
        RecyclerView recyclerView = this.f18851b;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1464b c1464b = recyclerView.mAdapterHelper;
        if (i10 < 1) {
            c1464b.getClass();
            return;
        }
        ArrayList arrayList = c1464b.f18825b;
        arrayList.add(c1464b.h(4, i5, i10, obj));
        c1464b.f18829f |= 4;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.K
    public final void onItemRangeInserted(int i5, int i10) {
        RecyclerView recyclerView = this.f18851b;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1464b c1464b = recyclerView.mAdapterHelper;
        if (i10 < 1) {
            c1464b.getClass();
            return;
        }
        ArrayList arrayList = c1464b.f18825b;
        arrayList.add(c1464b.h(1, i5, i10, null));
        c1464b.f18829f |= 1;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.K
    public final void onItemRangeMoved(int i5, int i10, int i11) {
        RecyclerView recyclerView = this.f18851b;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1464b c1464b = recyclerView.mAdapterHelper;
        c1464b.getClass();
        if (i5 == i10) {
            return;
        }
        ArrayList arrayList = c1464b.f18825b;
        arrayList.add(c1464b.h(8, i5, i10, null));
        c1464b.f18829f |= 8;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.K
    public final void onItemRangeRemoved(int i5, int i10) {
        RecyclerView recyclerView = this.f18851b;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1464b c1464b = recyclerView.mAdapterHelper;
        if (i10 < 1) {
            c1464b.getClass();
            return;
        }
        ArrayList arrayList = c1464b.f18825b;
        arrayList.add(c1464b.h(2, i5, i10, null));
        c1464b.f18829f |= 2;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.K
    public final void onStateRestorationPolicyChanged() {
        I i5;
        RecyclerView recyclerView = this.f18851b;
        if (recyclerView.mPendingSavedState == null || (i5 = recyclerView.mAdapter) == null || !i5.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
