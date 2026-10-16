package androidx.media3.extractor;

import com.google.d.b.an;
import com.google.d.l.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ChunkIndexMerger {
    private final Map<Long, ChunkIndex> chunkMap = new LinkedHashMap();

    public void add(ChunkIndex chunkIndex) {
        long[] jArr = chunkIndex.timesUs;
        if (jArr.length <= 0 || this.chunkMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.chunkMap.put(Long.valueOf(chunkIndex.timesUs[0]), chunkIndex);
    }

    public void clear() {
        this.chunkMap.clear();
    }

    public ChunkIndex merge() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ChunkIndex chunkIndex : this.chunkMap.values()) {
            arrayList.add(chunkIndex.sizes);
            arrayList2.add(chunkIndex.offsets);
            arrayList3.add(chunkIndex.durationsUs);
            arrayList4.add(chunkIndex.timesUs);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int i2 = (int) length;
        an.p(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i3, length2);
            i3 += length2;
        }
        return new ChunkIndex(iArr3, j.f((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), j.f((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), j.f((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int size() {
        return this.chunkMap.size();
    }
}
