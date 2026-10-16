package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntIntMapKt;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.h.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class CacheWindowLogic {
    public static final int $stable = 8;
    private final LazyLayoutCacheWindow cacheWindow;
    private final boolean enableInitialPrefetch;
    private boolean hasUpdatedVisibleItemsOnce;
    private final MutableIntSet indicesToRemove;
    private int itemsCount;
    private int prefetchWindowEndExtraSpace;
    private int prefetchWindowEndLine;
    private final MutableIntObjectMap<List<LazyLayoutPrefetchState.PrefetchHandle>> prefetchWindowHandles;
    private int prefetchWindowStartExtraSpace;
    private int prefetchWindowStartLine;
    private float previousPassDelta;
    private int previousPassItemCount;
    private boolean shouldRefillWindow;
    private final MutableIntIntMap windowCache;
    private final MutableIntObjectMap<CachedItem> windowCacheWithItems;

    public CacheWindowLogic(LazyLayoutCacheWindow lazyLayoutCacheWindow, boolean z) {
        this.cacheWindow = lazyLayoutCacheWindow;
        this.enableInitialPrefetch = z;
        this.prefetchWindowHandles = IntObjectMapKt.mutableIntObjectMapOf();
        this.indicesToRemove = IntSetKt.mutableIntSetOf();
        this.windowCache = IntIntMapKt.mutableIntIntMapOf();
        this.windowCacheWithItems = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousPassItemCount = -1;
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = Integer.MIN_VALUE;
    }

    private final void cachePrefetchedItem(int i2, int i3) {
        this.windowCacheWithItems.set(i2, updateOrCreateCachedItem(i2, i3, CachedItem.NoKey));
        if (i2 > this.prefetchWindowEndLine) {
            this.prefetchWindowEndLine = i2;
            this.prefetchWindowEndExtraSpace -= i3;
        } else if (i2 < this.prefetchWindowStartLine) {
            this.prefetchWindowStartLine = i2;
            this.prefetchWindowStartExtraSpace -= i3;
        }
    }

    private final void cacheVisibleItemsInfo(int i2, Object obj, int i3) {
        if (this.windowCacheWithItems.containsKey(i2)) {
            CachedItem cachedItem = this.windowCacheWithItems.get(i2);
            if (cachedItem == null) {
                x.g();
            }
            int mainAxisSize = cachedItem.getMainAxisSize();
            CachedItem cachedItem2 = this.windowCacheWithItems.get(i2);
            if (cachedItem2 == null) {
                x.g();
            }
            Object key = cachedItem2.getKey();
            if (mainAxisSize != i3 || !x.n(key, obj)) {
                this.shouldRefillWindow = true;
            }
        }
        this.windowCacheWithItems.set(i2, updateOrCreateCachedItem(i2, i3, obj));
        this.prefetchWindowStartLine = Math.min(this.prefetchWindowStartLine, i2);
        this.prefetchWindowEndLine = Math.max(this.prefetchWindowEndLine, i2);
        List<LazyLayoutPrefetchState.PrefetchHandle> listRemove = this.prefetchWindowHandles.remove(i2);
        if (listRemove != null) {
            int size = listRemove.size();
            for (int i4 = 0; i4 < size; i4++) {
                listRemove.get(i4).cancel();
            }
        }
    }

    private final void cacheVisibleItemsInfoWithoutFix(int i2, int i3) {
        if (this.windowCache.containsKey(i2) && this.windowCache.get(i2) != i3) {
            this.shouldRefillWindow = true;
        }
        this.windowCache.set(i2, i3);
        this.prefetchWindowStartLine = Math.min(this.prefetchWindowStartLine, i2);
        this.prefetchWindowEndLine = Math.max(this.prefetchWindowEndLine, i2);
        List<LazyLayoutPrefetchState.PrefetchHandle> listRemove = this.prefetchWindowHandles.remove(i2);
        if (listRemove != null) {
            int size = listRemove.size();
            for (int i4 = 0; i4 < size; i4++) {
                listRemove.get(i4).cancel();
            }
        }
    }

    private final void fillCacheWindowBackward(CacheWindowScope cacheWindowScope, float f2) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            int iCalculateBehindWindow = density != null ? lazyLayoutCacheWindow.calculateBehindWindow(density, mainAxisViewportSize) : 0;
            this.itemsCount = cacheWindowScope.getTotalItemsCount();
            onKeepAround(cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), iCalculateBehindWindow, f2, cacheWindowScope.getTotalItemsCount());
        }
    }

    private final void fillCacheWindowForward(CacheWindowScope cacheWindowScope, float f2) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            int iCalculateAheadWindow = density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, mainAxisViewportSize) : 0;
            onPrefetchForward(cacheWindowScope, cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), iCalculateAheadWindow, cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), f2, f2 <= 0.0f);
        }
    }

    private final int getItemSizeOrPrefetch(final CacheWindowScope cacheWindowScope, int i2, boolean z) {
        List<LazyLayoutPrefetchState.PrefetchHandle> list;
        List<LazyLayoutPrefetchState.PrefetchHandle> list2;
        if (this.windowCacheWithItems.containsKey(i2)) {
            CachedItem cachedItem = this.windowCacheWithItems.get(i2);
            if (cachedItem == null) {
                x.g();
            }
            return cachedItem.getMainAxisSize();
        }
        int i3 = 0;
        if (this.prefetchWindowHandles.containsKey(i2)) {
            if (z && (list2 = this.prefetchWindowHandles.get(i2)) != null) {
                int size = list2.size();
                while (i3 < size) {
                    list2.get(i3).markAsUrgent();
                    i3++;
                }
            }
            return -1;
        }
        this.prefetchWindowHandles.set(i2, cacheWindowScope.schedulePrefetch(i2, new p() { // from class: androidx.compose.foundation.lazy.layout.CacheWindowLogic$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return CacheWindowLogic.getItemSizeOrPrefetch$lambda$4(this.f$0, cacheWindowScope, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }));
        if (z && (list = this.prefetchWindowHandles.get(i2)) != null) {
            int size2 = list.size();
            while (i3 < size2) {
                list.get(i3).markAsUrgent();
                i3++;
            }
        }
        return -1;
    }

    static final ab getItemSizeOrPrefetch$lambda$4(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i2, int i3) {
        cacheWindowLogic.onItemPrefetched(cacheWindowScope, i2, i3);
        return ab.f48028a;
    }

    private final void onDatasetChanged(CacheWindowScope cacheWindowScope) {
        this.shouldRefillWindow = true;
        if (cacheWindowScope.getHasVisibleItems()) {
            int i2 = this.prefetchWindowStartLine;
            if (i2 < 0) {
                i2 = 0;
            }
            this.prefetchWindowStartLine = i2;
            int lastLineIndex = cacheWindowScope.getLastLineIndex();
            if (lastLineIndex != -1) {
                int i3 = this.prefetchWindowEndLine;
                if (i3 <= lastLineIndex) {
                    lastLineIndex = i3;
                }
                this.prefetchWindowEndLine = lastLineIndex;
            }
            if (this.previousPassDelta <= 0.0f) {
                removeOutOfBoundsItems(cacheWindowScope.getLastVisibleLineIndex(), this.itemsCount - 1);
            } else {
                removeOutOfBoundsItems(0, cacheWindowScope.getFirstVisibleLineIndex());
            }
        }
    }

    private final void onItemPrefetched(CacheWindowScope cacheWindowScope, int i2, int i3) {
        cachePrefetchedItem(i2, i3);
        scheduleNextItemIfNeeded(cacheWindowScope);
        traceWindowInfo();
    }

    private final void onKeepAround(int i2, int i3, int i4, int i5, int i6, float f2, int i7) {
        int i8;
        int i9;
        if (f2 <= 0.0f) {
            this.prefetchWindowStartExtraSpace = i6 - i5;
            this.prefetchWindowStartLine = i2;
            while (this.prefetchWindowStartExtraSpace > 0 && (i9 = this.prefetchWindowStartLine) > 0 && this.windowCacheWithItems.containsKey(i9 - 1)) {
                CachedItem cachedItem = this.windowCacheWithItems.get(this.prefetchWindowStartLine - 1);
                if (cachedItem == null) {
                    x.g();
                }
                this.prefetchWindowStartLine--;
                this.prefetchWindowStartExtraSpace -= cachedItem.getMainAxisSize();
            }
            removeOutOfBoundsItems(0, this.prefetchWindowStartLine - 1);
            return;
        }
        int i10 = i7 - 1;
        this.prefetchWindowEndExtraSpace = i6 - i4;
        this.prefetchWindowEndLine = i3;
        while (this.prefetchWindowEndExtraSpace > 0 && (i8 = this.prefetchWindowEndLine) < i10 && this.windowCacheWithItems.containsKey(i8 + 1)) {
            CachedItem cachedItem2 = this.windowCacheWithItems.get(this.prefetchWindowEndLine + 1);
            if (cachedItem2 == null) {
                x.g();
            }
            int mainAxisSize = cachedItem2.getMainAxisSize();
            this.prefetchWindowEndLine++;
            this.prefetchWindowEndExtraSpace -= mainAxisSize;
        }
        removeOutOfBoundsItems(this.prefetchWindowEndLine + 1, i10);
    }

    private final void onPrefetchForward(CacheWindowScope cacheWindowScope, int i2, int i3, int i4, int i5, int i6, float f2, boolean z) {
        int i7;
        float fSignum = Math.signum(f2);
        float fSignum2 = Math.signum(this.previousPassDelta);
        if (!z) {
            int i8 = i4 - i6;
            if (fSignum != fSignum2 || this.shouldRefillWindow) {
                this.prefetchWindowStartExtraSpace = i8;
                this.prefetchWindowStartLine = i2;
            } else {
                int iB = this.prefetchWindowStartExtraSpace + a.b(Math.abs(f2));
                if (iB <= i8) {
                    i8 = iB;
                }
                this.prefetchWindowStartExtraSpace = i8;
            }
            while (this.prefetchWindowStartExtraSpace > 0 && (i7 = this.prefetchWindowStartLine) > 0) {
                int itemSizeOrPrefetch = getItemSizeOrPrefetch(cacheWindowScope, this.prefetchWindowStartLine - 1, i7 + (-1) == i2 + (-1) && f2 != 0.0f && Math.abs(f2) >= ((float) i6));
                if (itemSizeOrPrefetch == -1) {
                    return;
                }
                this.prefetchWindowStartLine--;
                this.prefetchWindowStartExtraSpace -= itemSizeOrPrefetch;
            }
            return;
        }
        int i9 = i4 - i5;
        if (fSignum != fSignum2 || this.shouldRefillWindow) {
            this.prefetchWindowEndExtraSpace = i9;
            this.prefetchWindowEndLine = i3;
        } else {
            int iB2 = this.prefetchWindowEndExtraSpace + a.b(Math.abs(f2));
            if (iB2 <= i9) {
                i9 = iB2;
            }
            this.prefetchWindowEndExtraSpace = i9;
        }
        while (this.prefetchWindowEndExtraSpace > 0 && cacheWindowScope.getLastIndexInLine(this.prefetchWindowEndLine) != -1 && cacheWindowScope.getLastIndexInLine(this.prefetchWindowEndLine) < this.itemsCount - 1) {
            int itemSizeOrPrefetch2 = getItemSizeOrPrefetch(cacheWindowScope, this.prefetchWindowEndLine + 1, this.prefetchWindowEndLine + 1 == i3 + 1 && f2 != 0.0f && Math.abs(f2) >= ((float) i5));
            if (itemSizeOrPrefetch2 == -1) {
                return;
            }
            this.prefetchWindowEndLine++;
            this.prefetchWindowEndExtraSpace -= itemSizeOrPrefetch2;
        }
    }

    private final void refillWindow(CacheWindowScope cacheWindowScope, boolean z) {
        if (cacheWindowScope.getHasVisibleItems()) {
            int mainAxisViewportSize = cacheWindowScope.getMainAxisViewportSize();
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            onPrefetchForward(cacheWindowScope, cacheWindowScope.getFirstVisibleLineIndex(), cacheWindowScope.getLastVisibleLineIndex(), density != null ? lazyLayoutCacheWindow.calculateAheadWindow(density, mainAxisViewportSize) : 0, cacheWindowScope.getMainAxisExtraSpaceEnd(), cacheWindowScope.getMainAxisExtraSpaceStart(), 0.0f, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void removeOutOfBoundsItems(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.CacheWindowLogic.removeOutOfBoundsItems(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void scheduleNextItemIfNeeded(final androidx.compose.foundation.lazy.layout.CacheWindowScope r4) {
        /*
            r3 = this;
            float r0 = r3.previousPassDelta
            float r0 = java.lang.Math.signum(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = -1
            if (r0 > 0) goto L15
            int r0 = r3.prefetchWindowEndExtraSpace
            if (r0 <= 0) goto L27
            int r0 = r3.prefetchWindowEndLine
            int r0 = r0 + 1
            goto L28
        L15:
            float r0 = r3.previousPassDelta
            float r0 = java.lang.Math.signum(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L27
            int r0 = r3.prefetchWindowStartExtraSpace
            if (r0 <= 0) goto L27
            int r0 = r3.prefetchWindowStartLine
            int r0 = r0 + r2
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 <= 0) goto L46
            int r1 = r4.getLastIndexInLine(r0)
            if (r1 == r2) goto L46
            int r1 = r4.getLastIndexInLine(r0)
            int r2 = r3.itemsCount
            if (r1 >= r2) goto L46
            androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle>> r1 = r3.prefetchWindowHandles
            androidx.compose.foundation.lazy.layout.CacheWindowLogic$$ExternalSyntheticLambda1 r2 = new androidx.compose.foundation.lazy.layout.CacheWindowLogic$$ExternalSyntheticLambda1
            r2.<init>()
            java.util.List r3 = r4.schedulePrefetch(r0, r2)
            r1.set(r0, r3)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.CacheWindowLogic.scheduleNextItemIfNeeded(androidx.compose.foundation.lazy.layout.CacheWindowScope):void");
    }

    static final ab scheduleNextItemIfNeeded$lambda$1(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i2, int i3) {
        cacheWindowLogic.onItemPrefetched(cacheWindowScope, i2, i3);
        return ab.f48028a;
    }

    private final void traceWindowInfo() {
        AndroidTrace_androidKt.traceValue("prefetchWindowStartExtraSpace", this.prefetchWindowStartExtraSpace);
        AndroidTrace_androidKt.traceValue("prefetchWindowEndExtraSpace", this.prefetchWindowEndExtraSpace);
        AndroidTrace_androidKt.traceValue("prefetchWindowStartIndex", this.prefetchWindowStartLine);
        AndroidTrace_androidKt.traceValue("prefetchWindowEndIndex", this.prefetchWindowEndLine);
    }

    private final CachedItem updateOrCreateCachedItem(int i2, int i3, Object obj) {
        CachedItem cachedItem = this.windowCacheWithItems.get(i2);
        if (cachedItem == null) {
            return new CachedItem(obj, i3);
        }
        cachedItem.setMainAxisSize(i3);
        cachedItem.setKey(obj);
        return cachedItem;
    }

    public final int getPrefetchWindowEndLine$foundation() {
        return this.prefetchWindowEndLine;
    }

    public final int getPrefetchWindowStartLine$foundation() {
        return this.prefetchWindowStartLine;
    }

    public final boolean hasValidBounds() {
        return (this.prefetchWindowStartLine == Integer.MAX_VALUE || this.prefetchWindowEndLine == Integer.MIN_VALUE) ? false : true;
    }

    public final void onScroll(CacheWindowScope cacheWindowScope, float f2) {
        traceWindowInfo();
        fillCacheWindowBackward(cacheWindowScope, f2);
        fillCacheWindowForward(cacheWindowScope, f2);
        this.previousPassDelta = f2;
        traceWindowInfo();
    }

    public final void onVisibleItemsUpdated(CacheWindowScope cacheWindowScope) {
        if (!this.hasUpdatedVisibleItemsOnce && this.enableInitialPrefetch) {
            LazyLayoutCacheWindow lazyLayoutCacheWindow = this.cacheWindow;
            Density density = cacheWindowScope.getDensity();
            if (density != null && lazyLayoutCacheWindow.calculateAheadWindow(density, cacheWindowScope.getMainAxisViewportSize()) != 0) {
                this.shouldRefillWindow = true;
            }
            this.hasUpdatedVisibleItemsOnce = true;
        }
        int i2 = this.previousPassItemCount;
        if (i2 != -1 && i2 != cacheWindowScope.getTotalItemsCount()) {
            onDatasetChanged(cacheWindowScope);
        }
        this.itemsCount = cacheWindowScope.getTotalItemsCount();
        if (cacheWindowScope.getHasVisibleItems()) {
            int visibleLineCount = cacheWindowScope.getVisibleLineCount();
            for (int i3 = 0; i3 < visibleLineCount; i3++) {
                int visibleItemLine = cacheWindowScope.getVisibleItemLine(i3);
                Object visibleLineKey = cacheWindowScope.getVisibleLineKey(i3);
                int visibleItemSize = cacheWindowScope.getVisibleItemSize(i3);
                if (visibleItemLine != -1) {
                    cacheVisibleItemsInfo(visibleItemLine, visibleLineKey, visibleItemSize);
                }
            }
            if (this.shouldRefillWindow) {
                refillWindow(cacheWindowScope, this.previousPassDelta <= 0.0f);
                this.shouldRefillWindow = false;
            }
        } else {
            resetStrategy();
        }
        this.previousPassItemCount = cacheWindowScope.getTotalItemsCount();
    }

    public final void resetStrategy() {
        int i2;
        this.prefetchWindowStartLine = Integer.MAX_VALUE;
        this.prefetchWindowEndLine = Integer.MIN_VALUE;
        this.prefetchWindowStartExtraSpace = 0;
        this.prefetchWindowEndExtraSpace = 0;
        this.shouldRefillWindow = false;
        this.windowCache.clear();
        this.windowCacheWithItems.clear();
        MutableIntObjectMap<List<LazyLayoutPrefetchState.PrefetchHandle>> mutableIntObjectMap = this.prefetchWindowHandles;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = mutableIntObjectMap.keys[i6];
                        List list = (List) mutableIntObjectMap.values[i6];
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            ((LazyLayoutPrefetchState.PrefetchHandle) list.get(i8)).cancel();
                        }
                        mutableIntObjectMap.removeValueAt(i6);
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public /* synthetic */ CacheWindowLogic(LazyLayoutCacheWindow lazyLayoutCacheWindow, boolean z, int i2, o oVar) {
        this(lazyLayoutCacheWindow, z | (!((i2 & 2) == 0)));
    }
}
