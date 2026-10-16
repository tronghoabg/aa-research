package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ank {
    public final float[] a;
    public final int b;
    private final java.util.List c;

    public ank(java.util.List list, float[] fArr) {
        this.c = list;
        this.a = fArr;
        if (list.size() != fArr.length) {
            defpackage.asq.c("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + defpackage.afga.bW(fArr));
        }
        this.b = fArr.length;
    }

    public final float a(java.lang.Object obj) {
        int iIndexOf = this.c.indexOf(obj);
        defpackage.affc affcVar = defpackage.amr.b;
        if (iIndexOf >= 0) {
            float[] fArr = this.a;
            if (iIndexOf < fArr.length) {
                return fArr[iIndexOf];
            }
        }
        return ((java.lang.Number) affcVar.invoke(java.lang.Integer.valueOf(iIndexOf))).floatValue();
    }

    public final java.lang.Object b(float f) {
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
            float fAbs = java.lang.Math.abs(f - fArr[i]);
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

    public final java.lang.Object c(float f, boolean z) {
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
            if (f4 < 0.0f) {
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

    public final boolean d(java.lang.Object obj) {
        return this.c.indexOf(obj) != -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ank)) {
            return false;
        }
        defpackage.ank ankVar = (defpackage.ank) obj;
        return defpackage.afga.f(this.c, ankVar.c) && java.util.Arrays.equals(this.a, ankVar.a) && this.b == ankVar.b;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + java.util.Arrays.hashCode(this.a)) * 31) + this.b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            java.util.List list = this.c;
            float[] fArr = this.a;
            sb.append(defpackage.afga.aC(list, i) + "=" + ((i < 0 || i >= fArr.length) ? ((java.lang.Number) defpackage.amr.b.invoke(java.lang.Integer.valueOf(i))).floatValue() : fArr[i]));
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
