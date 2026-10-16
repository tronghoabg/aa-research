package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dpk {
    public final java.lang.String a;
    public int b;
    public float c;
    private final int d;

    public dpk(defpackage.dpk dpkVar) {
        this.b = Integer.MIN_VALUE;
        this.c = Float.NaN;
        this.a = dpkVar.a;
        this.d = dpkVar.d;
        this.b = dpkVar.b;
        this.c = dpkVar.c;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        int i = this.d;
        java.lang.String strConcat = strValueOf.concat(":");
        if (i != 901) {
            java.lang.String strConcat2 = "00000000".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(this.b)));
            return strConcat.concat("#".concat(java.lang.String.valueOf(strConcat2.substring(strConcat2.length() - 8))));
        }
        return strConcat + this.c;
    }

    public dpk(java.lang.String str, float f) {
        this.b = Integer.MIN_VALUE;
        this.a = str;
        this.d = 901;
        this.c = f;
    }

    public dpk(java.lang.String str, int i) {
        this.c = Float.NaN;
        this.a = str;
        this.d = 902;
        this.b = i;
    }
}
