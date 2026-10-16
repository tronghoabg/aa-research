package androidx.recyclerview.widget;

import java.util.Arrays;

/* renamed from: androidx.recyclerview.widget.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479q implements T {

    /* renamed from: a, reason: collision with root package name */
    public int f18961a;

    /* renamed from: b, reason: collision with root package name */
    public int f18962b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f18963c;

    /* renamed from: d, reason: collision with root package name */
    public int f18964d;

    public final void a(int i5, int i10) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.f18964d;
        int i12 = i11 * 2;
        int[] iArr = this.f18963c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f18963c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.f18963c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f18963c;
        iArr4[i12] = i5;
        iArr4[i12 + 1] = i10;
        this.f18964d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f18964d = 0;
        int[] iArr = this.f18963c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        V v2 = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || v2 == null || !v2.isItemPrefetchEnabled()) {
            return;
        }
        if (z2) {
            if (!recyclerView.mAdapterHelper.g()) {
                v2.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            v2.collectAdjacentPrefetchPositions(this.f18961a, this.f18962b, recyclerView.mState, this);
        }
        int i5 = this.f18964d;
        if (i5 > v2.mPrefetchMaxCountObserved) {
            v2.mPrefetchMaxCountObserved = i5;
            v2.mPrefetchMaxObservedInInitialPrefetch = z2;
            recyclerView.mRecycler.l();
        }
    }
}
