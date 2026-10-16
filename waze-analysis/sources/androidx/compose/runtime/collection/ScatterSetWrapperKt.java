package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import h.ab;
import h.g.a.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScatterSetWrapperKt {
    public static final boolean fastAny(Set<? extends Object> set, l<Object, Boolean> lVar) {
        if (!(set instanceof ScatterSetWrapper)) {
            Set<? extends Object> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (lVar.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        ScatterSet set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
        Object[] objArr = set$runtime.elements;
        long[] jArr = set$runtime.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 < i5) {
                            if ((255 & j2) < 128 && lVar.invoke(objArr[(i2 << 3) + i4]).booleanValue()) {
                                return true;
                            }
                            j2 >>= 8;
                            i4++;
                        } else if (i5 != 8) {
                            return false;
                        }
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public static final <T> void fastForEach(Set<? extends T> set, l<? super T, ab> lVar) {
        int i2;
        if (!(set instanceof ScatterSetWrapper)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            return;
        }
        ScatterSet<T> set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
        Object[] objArr = set$runtime.elements;
        long[] jArr = set$runtime.metadata;
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
                        lVar.invoke(objArr[(i3 << 3) + i5]);
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

    public static final <T> Set<T> wrapIntoSet(ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
