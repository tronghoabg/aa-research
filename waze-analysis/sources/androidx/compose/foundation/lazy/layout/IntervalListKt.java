package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntervalListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> mutableVector, int i2) {
        int size = mutableVector.getSize() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = ((size - i3) / 2) + i3;
            int startIndex = mutableVector.content[i4].getStartIndex();
            if (startIndex != i2) {
                if (startIndex < i2) {
                    i3 = i4 + 1;
                    if (i2 < mutableVector.content[i3].getStartIndex()) {
                    }
                } else {
                    size = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
