package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gcv {
    public static final defpackage.gcv a;
    public static final defpackage.gcv b;
    public final boolean c;
    public final int d;
    public final defpackage.gib e;
    private final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        defpackage.gib gibVar = null;
        a = new defpackage.gcv(false, 0 == true ? 1 : 0, gibVar, 15);
        b = new defpackage.gcv(true, 0 == true ? 1 : 0, gibVar, 14);
    }

    public /* synthetic */ gcv(boolean z, int i, defpackage.gib gibVar, int i2) {
        if ((i2 & 4) != 0) {
            gibVar = defpackage.gib.c;
            gibVar.getClass();
        }
        int i3 = i2 & 2;
        int i4 = i2 & 1;
        i = i3 != 0 ? 0 : i;
        boolean z2 = 1 == ((z ? 1 : 0) & (i4 ^ 1));
        gibVar.getClass();
        this.c = z2;
        this.d = i;
        this.e = gibVar;
        this.f = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gcv)) {
            return false;
        }
        defpackage.gcv gcvVar = (defpackage.gcv) obj;
        if (this.c != gcvVar.c || this.d != gcvVar.d || !defpackage.afga.f(this.e, gcvVar.e)) {
            return false;
        }
        boolean z = gcvVar.f;
        return true;
    }

    public final int hashCode() {
        return (((((defpackage.a.e(this.c) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + defpackage.a.e(false);
    }

    public final java.lang.String toString() {
        return "CarTextOptions(allowClickableSpans=" + this.c + ", maxImages=" + this.d + ", colorSpanConstraints=" + this.e + ", replaceNewLineBreaks=false)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gcv() {
        this(false, 0 == true ? 1 : 0, null, 15);
    }
}
