package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ihi implements java.lang.Cloneable {
    final float a;
    final int b;

    public ihi(float f) {
        this.b = 1;
        this.a = f;
    }

    public final float a(defpackage.iji ijiVar) {
        if (this.b != 9) {
            return c(ijiVar);
        }
        defpackage.igw igwVarB = ijiVar.b();
        if (igwVarB == null) {
            return this.a;
        }
        float f = igwVarB.c;
        float f2 = igwVarB.d;
        float f3 = this.a;
        return (f == f2 ? f3 * f : f3 * ((float) (java.lang.Math.sqrt((f * f) + (f2 * f2)) / 1.414213562373095d))) / 100.0f;
    }

    public final float b(defpackage.iji ijiVar, float f) {
        return this.b == 9 ? (this.a * f) / 100.0f : c(ijiVar);
    }

    public final float c(defpackage.iji ijiVar) {
        float f;
        switch (this.b - 1) {
            case 1:
                return this.a * ijiVar.a();
            case 2:
                return this.a * (ijiVar.d.d.getTextSize() / 2.0f);
            case 3:
                return this.a * 96.0f;
            case 4:
                f = 2.54f;
                return (this.a * 96.0f) / f;
            case 5:
                f = 25.4f;
                return (this.a * 96.0f) / f;
            case 6:
                f = 72.0f;
                return (this.a * 96.0f) / f;
            case 7:
                f = 6.0f;
                return (this.a * 96.0f) / f;
            case 8:
                defpackage.igw igwVarB = ijiVar.b();
                if (igwVarB != null) {
                    return (this.a * igwVarB.c) / 100.0f;
                }
            default:
                return this.a;
        }
    }

    public final float d(defpackage.iji ijiVar) {
        if (this.b != 9) {
            return c(ijiVar);
        }
        defpackage.igw igwVarB = ijiVar.b();
        float f = this.a;
        return igwVarB == null ? f : (f * igwVarB.d) / 100.0f;
    }

    public final boolean e() {
        return this.a < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean f() {
        return this.a == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public final float g() {
        float f;
        int i = this.b - 1;
        if (i == 3) {
            return this.a * 96.0f;
        }
        if (i == 4) {
            f = 2.54f;
        } else if (i == 5) {
            f = 25.4f;
        } else if (i == 6) {
            f = 72.0f;
        } else {
            if (i != 7) {
                return this.a;
            }
            f = 6.0f;
        }
        return (this.a * 96.0f) / f;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        switch (i) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            default:
                str = "percent";
                break;
        }
        return java.lang.String.valueOf(strValueOf).concat(str);
    }

    public ihi(float f, int i) {
        this.a = f;
        this.b = i;
    }
}
