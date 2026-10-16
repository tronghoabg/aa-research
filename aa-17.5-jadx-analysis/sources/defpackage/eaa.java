package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
final class eaa {
    private final String a;
    private final int c;
    private final int d;
    private final float b = 1.0f;
    private final int e = 0;
    private final int f = 0;
    private final int g = 0;
    private final float h = 1.0f;

    public eaa(String str, int i, int i2) {
        this.a = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaa)) {
            return false;
        }
        eaa eaaVar = (eaa) obj;
        if (!Objects.equals(this.a, eaaVar.a) || this.c != eaaVar.c || this.d != eaaVar.d) {
            return false;
        }
        float f = eaaVar.b;
        int i = eaaVar.e;
        int i2 = eaaVar.f;
        int i3 = eaaVar.g;
        float f2 = eaaVar.h;
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        Integer numValueOf = Integer.valueOf(this.c);
        Integer numValueOf2 = Integer.valueOf(this.d);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(str, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.a.hashCode()) + " displayWidth=" + this.c + " displayHeight=" + this.d + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
