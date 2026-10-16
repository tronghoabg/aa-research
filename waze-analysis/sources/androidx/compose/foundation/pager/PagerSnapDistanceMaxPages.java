package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    public static final int $stable = 0;
    private final int pagesLimit;

    public PagerSnapDistanceMaxPages(int i2) {
        this.pagesLimit = i2;
    }

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public int calculateTargetPage(int i2, int i3, float f2, int i4, int i5) {
        long j2 = i2;
        long j3 = this.pagesLimit;
        long j4 = j2 - j3;
        if (j4 < 0) {
            j4 = 0;
        }
        long j5 = j2 + j3;
        if (j5 > SieveCacheKt.NodeLinkMask) {
            j5 = 2147483647L;
        }
        return n.j(i3, (int) j4, (int) j5);
    }

    public boolean equals(Object obj) {
        return (obj instanceof PagerSnapDistanceMaxPages) && this.pagesLimit == ((PagerSnapDistanceMaxPages) obj).pagesLimit;
    }

    public int hashCode() {
        return this.pagesLimit;
    }
}
