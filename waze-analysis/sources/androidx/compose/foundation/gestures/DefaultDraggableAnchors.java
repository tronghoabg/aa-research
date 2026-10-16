package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import h.a.c;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {
    private final float[] anchors;
    private final List<T> keys;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableAnchors(List<? extends T> list, float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        if (list.size() != fArr.length) {
            InlineClassHelperKt.throwIllegalArgumentException("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + c.U(fArr));
        }
        this.size = fArr.length;
    }

    private final float maxOrNaN(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int iX = c.x(fArr);
        if (iX > 0) {
            int i2 = 1;
            while (true) {
                fMax = Math.max(fMax, fArr[i2]);
                if (i2 == iX) {
                    break;
                }
                i2++;
            }
        }
        return fMax;
    }

    private final float minOrNaN(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int iX = c.x(fArr);
        if (iX > 0) {
            int i2 = 1;
            while (true) {
                fMin = Math.min(fMin, fArr[i2]);
                if (i2 == iX) {
                    break;
                }
                i2++;
            }
        }
        return fMin;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T anchorAt(int i2) {
        return (T) i.S(this.keys, i2);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float f2, boolean z) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        float f3 = Float.POSITIVE_INFINITY;
        int i4 = -1;
        while (i2 < length) {
            float f4 = fArr[i2];
            int i5 = i3 + 1;
            float f5 = z ? f4 - f2 : f2 - f4;
            if (f5 < 0.0f) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if (f5 <= f3) {
                f3 = f5;
            }
            if (f5 <= f3) {
                i4 = i3;
            }
            i2++;
            i3 = i5;
        }
        if (i4 == -1) {
            return null;
        }
        return this.keys.get(i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) obj;
        return x.n(this.keys, defaultDraggableAnchors.keys) && Arrays.equals(this.anchors, defaultDraggableAnchors.anchors) && getSize() == defaultDraggableAnchors.getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasPositionFor(T t) {
        return this.keys.indexOf(t) != -1;
    }

    public int hashCode() {
        return (((this.keys.hashCode() * 31) + Arrays.hashCode(this.anchors)) * 31) + getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxPosition() {
        return maxOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minPosition() {
        return minOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionAt(int i2) {
        l lVar = AnchoredDraggableKt.GetOrNan;
        if (i2 >= 0) {
            float[] fArr = this.anchors;
            if (i2 < fArr.length) {
                return fArr[i2];
            }
        }
        return ((Number) lVar.invoke(Integer.valueOf(i2))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T t) {
        int iIndexOf = this.keys.indexOf(t);
        l lVar = AnchoredDraggableKt.GetOrNan;
        if (iIndexOf >= 0) {
            float[] fArr = this.anchors;
            if (iIndexOf < fArr.length) {
                return fArr[iIndexOf];
            }
        }
        return ((Number) lVar.invoke(Integer.valueOf(iIndexOf))).floatValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(anchorAt(i2));
            sb2.append('=');
            sb2.append(positionAt(i2));
            sb.append(sb2.toString());
            if (i2 < getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        return sb.toString();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float f2) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i2 = 0;
        float f3 = Float.POSITIVE_INFINITY;
        int i3 = -1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = i4 + 1;
            float fAbs = Math.abs(f2 - fArr[i2]);
            if (fAbs <= f3) {
                f3 = fAbs;
            }
            if (fAbs <= f3) {
                i3 = i4;
            }
            i2++;
            i4 = i5;
        }
        if (i3 == -1) {
            return null;
        }
        return this.keys.get(i3);
    }
}
