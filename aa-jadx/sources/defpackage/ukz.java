package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ukz {
    public final int b;
    public final int c;
    public final float d;
    public final int[] e;
    public final int f;
    public final int g;
    public final float h;
    public defpackage.utb i;
    public defpackage.utb j;
    public defpackage.utb k;
    public final float l;
    public final float m;
    private static final int[] n = new int[0];
    public static final defpackage.ukz a = new defpackage.ukz(0, 1.0f, new int[0], com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);

    public ukz(int i, int i2, float f, int[] iArr, float f2, defpackage.utb utbVar, float f3, float f4, defpackage.utb utbVar2, defpackage.utb utbVar3) {
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = iArr;
        this.h = f2;
        this.l = f3;
        this.m = f4;
        this.i = utbVar;
        this.j = utbVar2;
        this.k = utbVar3;
        int i3 = 1;
        if (iArr.length != 0) {
            int iD = 0;
            for (int i4 : iArr) {
                iD = iD == 0 ? i4 : iD;
                if (i4 > 0) {
                    iD = defpackage.vab.d(iD, i4);
                }
            }
            if (iD != 0) {
                i3 = iD;
            }
        }
        this.g = i3;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        this.f = i5;
    }

    public static defpackage.ukz a(defpackage.abfv abfvVar, defpackage.abgn abgnVar) {
        defpackage.utb utbVar = defpackage.utb.a;
        return b(abfvVar, abgnVar, utbVar, utbVar, utbVar);
    }

    public static defpackage.ukz b(defpackage.abfv abfvVar, defpackage.abgn abgnVar, defpackage.utb utbVar, defpackage.utb utbVar2, defpackage.utb utbVar3) {
        defpackage.utb utbVar4;
        defpackage.utb utbVar5 = utbVar == null ? defpackage.utb.a : utbVar;
        defpackage.utb utbVar6 = utbVar2 == null ? defpackage.utb.a : utbVar2;
        defpackage.utb utbVar7 = utbVar3 == null ? defpackage.utb.a : utbVar3;
        int i = abfvVar.c;
        if ((abfvVar.b & 128) != 0) {
            i = -1;
        }
        int i2 = i;
        float fQ = defpackage.qsp.Q(abfvVar.e);
        int[] iArr = n;
        if (abfvVar.f.size() > 0) {
            iArr = new int[abfvVar.f.size()];
            for (int i3 = 0; i3 < abfvVar.f.size(); i3++) {
                iArr[i3] = abfvVar.f.e(i3);
            }
        }
        int[] iArr2 = iArr;
        float fQ2 = defpackage.qsp.Q(abfvVar.g);
        float fQ3 = defpackage.qsp.Q(abfvVar.i);
        float fQ4 = defpackage.qsp.Q(abfvVar.j);
        defpackage.utb utbVar8 = defpackage.utb.a;
        defpackage.utb utbVar9 = (utbVar5 != utbVar8 || (abfvVar.b & 128) == 0) ? utbVar5 : new defpackage.utb(abfvVar.h, defpackage.utc.WRAP_T);
        if (utbVar6 != utbVar8 || (abfvVar.b & 2048) == 0) {
            utbVar4 = utbVar6;
        } else {
            defpackage.abcq abcqVar = abfvVar.k;
            if (abcqVar == null) {
                abcqVar = defpackage.abcq.a;
            }
            utbVar4 = new defpackage.utb(defpackage.ulq.a(abcqVar.c, (abcqVar.b & 2) != 0, abcqVar.d, abgnVar), defpackage.utc.NO_WRAP);
        }
        if (utbVar7 == utbVar8 && (abfvVar.b & 4096) != 0) {
            defpackage.abcq abcqVar2 = abfvVar.l;
            if (abcqVar2 == null) {
                abcqVar2 = defpackage.abcq.a;
            }
            utbVar7 = new defpackage.utb(defpackage.ulq.a(abcqVar2.c, (abcqVar2.b & 2) != 0, abcqVar2.d, abgnVar), defpackage.utc.NO_WRAP);
        }
        return new defpackage.ukz(i2, (abfvVar.b & 4) != 0 ? abfvVar.d : i2, fQ, iArr2, fQ2, utbVar9, fQ3, fQ4, utbVar4, utbVar7);
    }

    public final boolean c() {
        return this.e.length > 0;
    }

    public final boolean d() {
        if (this.d > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return (android.graphics.Color.alpha(this.b) <= 0 && android.graphics.Color.alpha(this.c) <= 0 && this.i.a() && this.j.a() && this.k.a()) ? false : true;
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.ukz)) {
            return false;
        }
        defpackage.ukz ukzVar = (defpackage.ukz) obj;
        if (this.b != ukzVar.b || this.c != ukzVar.c || !java.util.Arrays.equals(this.e, ukzVar.e)) {
            return false;
        }
        if (java.lang.Float.floatToIntBits(this.h) == java.lang.Float.floatToIntBits(ukzVar.h) && this.j.equals(ukzVar.j) && this.k.equals(ukzVar.k) && this.i.equals(ukzVar.i)) {
            return java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(ukzVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b + 31) * 31) + this.c) * 31) + java.util.Arrays.hashCode(this.e)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Stroke{color=");
        int i = this.b;
        sb.append(java.lang.Integer.toHexString(i));
        int i2 = this.c;
        if (i != i2) {
            sb.append(", endColor=");
            sb.append(java.lang.Integer.toHexString(i2));
        }
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", offset=");
        sb.append(this.h);
        sb.append(", dashes=");
        sb.append(java.util.Arrays.toString(this.e));
        if (!this.i.a()) {
            sb.append(", stampTextureKey=");
            sb.append(this.i);
        }
        if (!this.j.a()) {
            sb.append(", startCapMaskTextureKey=");
            sb.append(this.j);
        }
        if (!this.k.a()) {
            sb.append(", endCapMaskTextureKey=");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ukz(int i, float f, int[] iArr, float f2) {
        defpackage.utb utbVar = defpackage.utb.a;
        this(i, i, f, iArr, f2, utbVar, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, utbVar, utbVar);
    }
}
