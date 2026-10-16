package defpackage;

/* loaded from: classes2.dex */
final class akfo {
    public final long a;
    public final akcl b;
    akfo c;
    private String d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;

    public akfo(akcl akclVar, long j) {
        this.a = j;
        this.b = akclVar;
    }

    public final int a(long j) {
        akfo akfoVar = this.c;
        if (akfoVar != null && j >= akfoVar.a) {
            return akfoVar.a(j);
        }
        int i = this.e;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int iA = this.b.a(this.a);
        this.e = iA;
        return iA;
    }

    public final int b(long j) {
        akfo akfoVar = this.c;
        if (akfoVar != null && j >= akfoVar.a) {
            return akfoVar.b(j);
        }
        int i = this.f;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int iC = this.b.c(this.a);
        this.f = iC;
        return iC;
    }

    public final String c(long j) {
        akfo akfoVar = this.c;
        if (akfoVar != null && j >= akfoVar.a) {
            return akfoVar.c(j);
        }
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strG = this.b.g(this.a);
        this.d = strG;
        return strG;
    }
}
