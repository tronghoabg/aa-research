package defpackage;

/* loaded from: classes2.dex */
public final class dpc {
    public final String a;
    public int b;
    public float c;
    private final int d;

    public dpc(dpc dpcVar) {
        this.b = Integer.MIN_VALUE;
        this.c = Float.NaN;
        this.a = dpcVar.a;
        this.d = dpcVar.d;
        this.b = dpcVar.b;
        this.c = dpcVar.c;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.d;
        String strConcat = strValueOf.concat(":");
        if (i != 901) {
            return strConcat.concat("#".concat(String.valueOf("00000000".concat(String.valueOf(Integer.toHexString(this.b))).substring(r3.length() - 8))));
        }
        return strConcat + this.c;
    }

    public dpc(String str, float f) {
        this.b = Integer.MIN_VALUE;
        this.a = str;
        this.d = 901;
        this.c = f;
    }

    public dpc(String str, int i) {
        this.c = Float.NaN;
        this.a = str;
        this.d = 902;
        this.b = i;
    }
}
