package androidx.collection;

import java.lang.reflect.Array;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    static <T> T[] resizeForToArray(T[] tArr, int i2) {
        int length = tArr.length;
        if (length < i2) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
