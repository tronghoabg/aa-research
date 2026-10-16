package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akgo {
    public final long a;
    public final defpackage.akdl b;
    defpackage.akgo c;
    private java.lang.String d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;

    public akgo(defpackage.akdl akdlVar, long j) {
        this.a = j;
        this.b = akdlVar;
    }

    public final int a(long j) {
        defpackage.akgo akgoVar = this.c;
        if (akgoVar != null && j >= akgoVar.a) {
            return akgoVar.a(j);
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
        defpackage.akgo akgoVar = this.c;
        if (akgoVar != null && j >= akgoVar.a) {
            return akgoVar.b(j);
        }
        int i = this.f;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int iC = this.b.c(this.a);
        this.f = iC;
        return iC;
    }

    public final java.lang.String c(long j) {
        defpackage.akgo akgoVar = this.c;
        if (akgoVar != null && j >= akgoVar.a) {
            return akgoVar.c(j);
        }
        java.lang.String str = this.d;
        if (str != null) {
            return str;
        }
        java.lang.String strG = this.b.g(this.a);
        this.d = strG;
        return strG;
    }
}
