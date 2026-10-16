package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotIdArrayBuilder {
    public static final int $stable = 8;
    private final MutableLongList list;

    public SnapshotIdArrayBuilder(long[] jArr) {
        MutableLongList mutableLongList;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new MutableLongList(jArrCopyOf.length);
            mutableLongList.addAll(mutableLongList._size, jArrCopyOf);
        } else {
            mutableLongList = new MutableLongList(0, 1, null);
        }
        this.list = mutableLongList;
    }

    public final void add(long j2) {
        this.list.add(j2);
    }

    public final long[] toArray() {
        MutableLongList mutableLongList = this.list;
        int i2 = mutableLongList._size;
        if (i2 == 0) {
            return null;
        }
        long[] jArr = new long[i2];
        long[] jArr2 = mutableLongList.content;
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = jArr2[i3];
        }
        return jArr;
    }
}
