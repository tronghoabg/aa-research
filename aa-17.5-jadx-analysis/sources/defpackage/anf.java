package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class anf {
    public final float[] a;
    public final int b;
    private final List c;

    public anf(List list, float[] fArr) {
        this.c = list;
        this.a = fArr;
        if (list.size() != fArr.length) {
            asl.c("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + woy.dc(fArr));
        }
        this.b = fArr.length;
    }

    public final float a(Object obj) {
        int iIndexOf = this.c.indexOf(obj);
        afec afecVar = amm.b;
        if (iIndexOf >= 0) {
            float[] fArr = this.a;
            if (iIndexOf < fArr.length) {
                return fArr[iIndexOf];
            }
        }
        return ((Number) afecVar.invoke(Integer.valueOf(iIndexOf))).floatValue();
    }

    public final Object b(float f) {
        int i = 0;
        float f2 = Float.POSITIVE_INFINITY;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                break;
            }
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                f2 = fAbs;
            }
            if (fAbs <= f2) {
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.c.get(i2);
    }

    public final Object c(float f, boolean z) {
        int i = 0;
        int i2 = 0;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = -1;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                break;
            }
            float f3 = fArr[i];
            int i4 = i2 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < BitmapDescriptorFactory.HUE_RED) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                f2 = f4;
            }
            if (f4 <= f2) {
                i3 = i2;
            }
            i++;
            i2 = i4;
        }
        if (i3 == -1) {
            return null;
        }
        return this.c.get(i3);
    }

    public final boolean d(Object obj) {
        return this.c.indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anf)) {
            return false;
        }
        anf anfVar = (anf) obj;
        return affa.f(this.c, anfVar.c) && Arrays.equals(this.a, anfVar.a) && this.b == anfVar.b;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + Arrays.hashCode(this.a)) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            List list = this.c;
            float[] fArr = this.a;
            sb.append(woy.bI(list, i) + "=" + ((i < 0 || i >= fArr.length) ? ((Number) amm.b.invoke(Integer.valueOf(i))).floatValue() : fArr[i]));
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
