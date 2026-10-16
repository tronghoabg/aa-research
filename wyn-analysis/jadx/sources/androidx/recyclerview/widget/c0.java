package androidx.recyclerview.widget;

import Va.M6;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.C3115b;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18835a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18836b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18837c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18838d;

    /* renamed from: e, reason: collision with root package name */
    public int f18839e;

    /* renamed from: f, reason: collision with root package name */
    public int f18840f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f18841g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f18842h;

    public c0(RecyclerView recyclerView) {
        this.f18842h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f18835a = arrayList;
        this.f18836b = null;
        this.f18837c = new ArrayList();
        this.f18838d = DesugarCollections.unmodifiableList(arrayList);
        this.f18839e = 2;
        this.f18840f = 2;
    }

    public static void d(ViewGroup viewGroup, boolean z2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt, true);
            }
        }
        if (z2) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    public final void a(m0 m0Var, boolean z2) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(m0Var);
        View view = m0Var.itemView;
        RecyclerView recyclerView = this.f18842h;
        o0 o0Var = recyclerView.mAccessibilityDelegate;
        if (o0Var != null) {
            n0 n0Var = o0Var.f18929e;
            k1.S.m(view, n0Var instanceof n0 ? (C3115b) n0Var.f18926e.remove(view) : null);
        }
        if (z2) {
            if (recyclerView.mRecyclerListeners.size() > 0) {
                recyclerView.mRecyclerListeners.get(0).getClass();
                throw new ClassCastException();
            }
            I i5 = recyclerView.mAdapter;
            if (i5 != null) {
                i5.onViewRecycled(m0Var);
            }
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.d(m0Var);
            }
        }
        m0Var.mBindingAdapter = null;
        m0Var.mOwnerRecyclerView = null;
        b0 b0VarC = c();
        b0VarC.getClass();
        int itemViewType = m0Var.getItemViewType();
        ArrayList arrayList = b0VarC.a(itemViewType).f18820a;
        if (((C1463a0) b0VarC.f18830a.get(itemViewType)).f18821b <= arrayList.size()) {
            return;
        }
        m0Var.resetInternal();
        arrayList.add(m0Var);
    }

    public final int b(int i5) {
        RecyclerView recyclerView = this.f18842h;
        if (i5 >= 0 && i5 < recyclerView.mState.b()) {
            return !recyclerView.mState.f18900g ? i5 : recyclerView.mAdapterHelper.f(i5, 0);
        }
        StringBuilder sbL = pd.f.l(i5, "invalid position ", ". State item count is ");
        sbL.append(recyclerView.mState.b());
        sbL.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public final b0 c() {
        if (this.f18841g == null) {
            b0 b0Var = new b0();
            b0Var.f18830a = new SparseArray();
            b0Var.f18831b = 0;
            this.f18841g = b0Var;
        }
        return this.f18841g;
    }

    public final void e() {
        ArrayList arrayList = this.f18837c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            C1479q c1479q = this.f18842h.mPrefetchRegistry;
            int[] iArr = c1479q.f18963c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1479q.f18964d = 0;
        }
    }

    public final void f(int i5) {
        ArrayList arrayList = this.f18837c;
        a((m0) arrayList.get(i5), true);
        arrayList.remove(i5);
    }

    public final void g(View view) {
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f18842h;
        if (zIsTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        h(childViewHolderInt);
        if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
            return;
        }
        recyclerView.mItemAnimator.d(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(androidx.recyclerview.widget.m0 r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c0.h(androidx.recyclerview.widget.m0):void");
    }

    public final void i(View view) {
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f18842h;
        if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f18836b == null) {
                this.f18836b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f18836b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(M6.m(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.f18835a.add(childViewHolderInt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.m0 j(int r30, long r31) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c0.j(int, long):androidx.recyclerview.widget.m0");
    }

    public final void k(m0 m0Var) {
        if (m0Var.mInChangeScrap) {
            this.f18836b.remove(m0Var);
        } else {
            this.f18835a.remove(m0Var);
        }
        m0Var.mScrapContainer = null;
        m0Var.mInChangeScrap = false;
        m0Var.clearReturnedFromScrapFlag();
    }

    public final void l() {
        V v2 = this.f18842h.mLayout;
        this.f18840f = this.f18839e + (v2 != null ? v2.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f18837c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f18840f; size--) {
            f(size);
        }
    }
}
