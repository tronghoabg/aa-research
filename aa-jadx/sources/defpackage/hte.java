package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hte {
    public final java.lang.String a;
    public final long[] b;
    public boolean c;
    final /* synthetic */ defpackage.htg d;
    public defpackage.nch e;

    public hte(defpackage.htg htgVar, java.lang.String str) {
        this.d = htgVar;
        str.getClass();
        this.a = str;
        this.b = new long[htgVar.d];
    }

    public static final java.io.IOException d(java.lang.String[] strArr) throws java.io.IOException {
        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(java.util.Arrays.toString(strArr))));
    }

    public final java.lang.String a() throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                return sb.toString();
            }
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
            i = 1;
        }
    }

    public final java.io.File c() {
        return new java.io.File(this.d.a, this.a.concat(".0.tmp"));
    }

    public final java.io.File e() {
        return new java.io.File(this.d.a, this.a + ".0");
    }
}
