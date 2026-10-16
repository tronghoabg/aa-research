package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.IntervalList;
import h.a.ac;
import h.a.i;
import h.g.a.l;
import h.g.b.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {
    public static final int $stable = 8;
    private final ArrayList<Bucket> buckets;
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    /* compiled from: WazeSource */
    final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxCurrentLineSpan(int i2) {
            maxCurrentLineSpan = i2;
        }

        public void setMaxLineSpan(int i2) {
            maxLineSpan = i2;
        }
    }

    /* compiled from: WazeSource */
    public final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i2, List<GridItemSpan> list) {
            this.firstItemIndex = i2;
            this.spans = list;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.gridContent = lazyGridIntervalContent;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        int i2 = 0;
        arrayList.add(new Bucket(i2, i2, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = ac.f47967a;
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt(getTotalSize() / this.slotsPerLine)) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i2) {
        if (i2 == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(GridItemSpan.m2895boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        ArrayList arrayList2 = arrayList;
        this.previousDefaultSpans = arrayList2;
        return arrayList2;
    }

    static final int getLineIndexOfItem$lambda$1(int i2, Bucket bucket) {
        return bucket.getFirstItemIndex() - i2;
    }

    private final void invalidateCache() {
        this.buckets.clear();
        int i2 = 0;
        this.buckets.add(new Bucket(i2, i2, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int getLineIndexOfItem(final int i2) {
        int i3;
        int i4 = 0;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i2 >= getTotalSize()) {
            InlineClassHelperKt.throwIllegalArgumentException("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans$foundation()) {
            return i2 / this.slotsPerLine;
        }
        ArrayList<Bucket> arrayList = this.buckets;
        int iAG = i.aG(arrayList, arrayList.size(), new l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(LazyGridSpanLayoutProvider.getLineIndexOfItem$lambda$1(i2, (LazyGridSpanLayoutProvider.Bucket) obj));
            }
        });
        if (iAG < 0) {
            iAG = (-iAG) - 2;
        }
        int bucketSize = getBucketSize() * iAG;
        int firstItemIndex = this.buckets.get(iAG).getFirstItemIndex();
        if (firstItemIndex > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i5 = 0;
        while (true) {
            i3 = this.slotsPerLine;
            if (firstItemIndex >= i2) {
                break;
            }
            int i6 = firstItemIndex + 1;
            int iSpanOf = spanOf(firstItemIndex, i3 - i5);
            i5 += iSpanOf;
            int i7 = this.slotsPerLine;
            if (i5 >= i7) {
                bucketSize++;
                i5 = i5 == i7 ? 0 : iSpanOf;
            }
            if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                this.buckets.add(new Bucket(i6 - (i5 <= 0 ? 0 : 1), i4, 2, null));
            }
            firstItemIndex = i6;
        }
        return i5 + spanOf(i2, i3 - i5) > this.slotsPerLine ? bucketSize + 1 : bucketSize;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i2) {
        if (i2 != this.slotsPerLine) {
            this.slotsPerLine = i2;
            invalidateCache();
        }
    }

    public final int spanOf(int i2, int i3) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i3);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> interval = this.gridContent.getIntervals().get(i2);
        return GridItemSpan.m2899getCurrentLineSpanimpl(interval.getValue().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i2 - interval.getStartIndex())).m2902unboximpl());
    }

    /* compiled from: WazeSource */
    final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public /* synthetic */ Bucket(int i2, int i3, int i4, o oVar) {
            this(i2, (i4 & 2) != 0 ? 0 : i3);
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public Bucket(int i2, int i3) {
            this.firstItemIndex = i2;
            this.firstItemKnownSpan = i3;
        }
    }
}
