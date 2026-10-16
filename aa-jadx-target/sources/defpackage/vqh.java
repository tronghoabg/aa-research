package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vqh {
    private static final int[] h = new int[0];
    private static final java.lang.String[] i = new java.lang.String[0];
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final int[] e;
    public final java.lang.String[] f;
    public final defpackage.vqg g;

    public vqh(java.lang.String str, java.lang.String str2, int i2, long j, int[] iArr, java.lang.String[] strArr, defpackage.vqg vqgVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.a = j;
        this.e = iArr;
        this.f = strArr;
        this.g = vqgVar;
    }

    public static boolean a(java.lang.Object obj) {
        return obj == null || (obj instanceof defpackage.vqq);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.vqh)) {
            return false;
        }
        defpackage.vqh vqhVar = (defpackage.vqh) obj;
        return j$.util.Objects.equals(this.b, vqhVar.b) && j$.util.Objects.equals(this.c, vqhVar.c) && this.d == vqhVar.d && this.a == vqhVar.a && java.util.Arrays.equals(this.e, vqhVar.e) && java.util.Arrays.equals(this.f, vqhVar.f) && j$.util.Objects.equals(this.g, vqhVar.g);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c, java.lang.Integer.valueOf(this.d), java.lang.Long.valueOf(this.a), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.e)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.f)), this.g});
    }

    public vqh(java.lang.String str, java.lang.String str2, int i2, long j, defpackage.vqg vqgVar) {
        this(str, str2, i2, j, h, i, vqgVar);
    }
}
