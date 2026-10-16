package androidx.compose.material;

import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {
    private final Map<T, Float> anchors;

    public MapDraggableAnchors(Map<T, Float> map) {
        this.anchors = map;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public T closestAnchor(float f2, boolean z) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f3 = z ? fFloatValue - f2 : f2 - fFloatValue;
                if (f3 < 0.0f) {
                    f3 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f4 = z ? fFloatValue2 - f2 : f2 - fFloatValue2;
                    if (f4 < 0.0f) {
                        f4 = Float.POSITIVE_INFINITY;
                    }
                    int iCompare = Float.compare(f3, f4);
                    if (iCompare > 0) {
                        f3 = f4;
                    }
                    if (iCompare > 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapDraggableAnchors) {
            return x.n(this.anchors, ((MapDraggableAnchors) obj).anchors);
        }
        return false;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public int getSize() {
        return this.anchors.size();
    }

    @Override // androidx.compose.material.DraggableAnchors
    public boolean hasAnchorFor(T t) {
        return this.anchors.containsKey(t);
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float maxAnchor() {
        Float fL = i.L(this.anchors.values());
        if (fL != null) {
            return fL.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float minAnchor() {
        Float fM = i.M(this.anchors.values());
        if (fM != null) {
            return fM.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float positionOf(T t) {
        Float f2 = this.anchors.get(t);
        if (f2 != null) {
            return f2.floatValue();
        }
        return Float.NaN;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }

    @Override // androidx.compose.material.DraggableAnchors
    public T closestAnchor(float f2) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f2 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f2 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    int iCompare = Float.compare(fAbs, fAbs2);
                    if (iCompare > 0) {
                        fAbs = fAbs2;
                    }
                    if (iCompare > 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }
}
