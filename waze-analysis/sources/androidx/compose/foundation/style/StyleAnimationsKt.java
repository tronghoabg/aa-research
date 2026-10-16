package androidx.compose.foundation.style;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleAnimationsKt {
    private static final void forEachBitOf(long j2, l<? super Integer, ab> lVar) {
        while (j2 != 0) {
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
            lVar.invoke(Integer.valueOf(iNumberOfTrailingZeros));
            j2 ^= 1 << iNumberOfTrailingZeros;
        }
    }

    private static final void forEachSetPropertyId(long j2, int i2, l<? super Integer, ab> lVar) {
        while (j2 != 0) {
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
            lVar.invoke(Integer.valueOf(iNumberOfTrailingZeros));
            j2 ^= 1 << iNumberOfTrailingZeros;
        }
        while (i2 != 0) {
            int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i2);
            lVar.invoke(Integer.valueOf(iNumberOfTrailingZeros2 + 50));
            i2 ^= 1 << iNumberOfTrailingZeros2;
        }
    }

    private static final void forEachBitOf(int i2, l<? super Integer, ab> lVar) {
        while (i2 != 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
            lVar.invoke(Integer.valueOf(iNumberOfTrailingZeros));
            i2 ^= 1 << iNumberOfTrailingZeros;
        }
    }
}
