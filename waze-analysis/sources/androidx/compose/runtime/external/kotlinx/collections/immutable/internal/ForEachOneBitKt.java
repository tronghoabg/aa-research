package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i2, p<? super Integer, ? super Integer, ab> pVar) {
        int i3 = 0;
        while (i2 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i2);
            pVar.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i3));
            i2 ^= iLowestOneBit;
            i3++;
        }
    }
}
