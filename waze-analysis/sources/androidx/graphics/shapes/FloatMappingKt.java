package androidx.graphics.shapes;

import androidx.collection.FloatList;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.aj;
import h.g.b.x;
import h.k.n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FloatMappingKt {
    public static final float linearMap(FloatList floatList, FloatList floatList2, float f2) {
        x.f(floatList, "xValues");
        x.f(floatList2, "yValues");
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid progress: " + f2);
        }
        Iterator<Integer> it = n.u(0, floatList._size).iterator();
        while (it.hasNext()) {
            int iNextInt = ((aj) it).nextInt();
            int i2 = iNextInt + 1;
            if (progressInRange(f2, floatList.get(iNextInt), floatList.get(i2 % floatList._size))) {
                int i3 = i2 % floatList._size;
                float fPositiveModulo = Utils.positiveModulo(floatList.get(i3) - floatList.get(iNextInt), 1.0f);
                return Utils.positiveModulo(floatList2.get(iNextInt) + (Utils.positiveModulo(floatList2.get(i3) - floatList2.get(iNextInt), 1.0f) * (fPositiveModulo < 0.001f ? 0.5f : Utils.positiveModulo(f2 - floatList.get(iNextInt), 1.0f) / fPositiveModulo)), 1.0f);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final float progressDistance(float f2, float f3) {
        float fAbs = Math.abs(f2 - f3);
        return Math.min(fAbs, 1.0f - fAbs);
    }

    public static final boolean progressInRange(float f2, float f3, float f4) {
        return f4 >= f3 ? f3 <= f2 && f2 <= f4 : f2 >= f3 || f2 <= f4;
    }

    public static final void validateProgress(FloatList floatList) {
        x.f(floatList, TtmlNode.TAG_P);
        float fLast = floatList.last();
        int i2 = floatList._size;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            float f2 = floatList.get(i3);
            if (f2 < 0.0f || f2 >= 1.0f) {
                throw new IllegalArgumentException("FloatMapping - Progress outside of range: ".concat(FloatList.joinToString$default(floatList, null, null, null, 0, null, 31, null)));
            }
            if (progressDistance(f2, fLast) <= 1.0E-4f) {
                throw new IllegalArgumentException("FloatMapping - Progress repeats a value: ".concat(FloatList.joinToString$default(floatList, null, null, null, 0, null, 31, null)));
            }
            if (f2 < fLast && (i4 = i4 + 1) > 1) {
                throw new IllegalArgumentException("FloatMapping - Progress wraps more than once: ".concat(FloatList.joinToString$default(floatList, null, null, null, 0, null, 31, null)));
            }
            i3++;
            fLast = f2;
            floatList = floatList;
        }
    }
}
