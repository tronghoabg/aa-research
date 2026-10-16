package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akgf implements java.lang.Comparable {
    defpackage.akdf a;
    int b;
    java.lang.String c;
    java.util.Locale d;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.akgf akgfVar) {
        defpackage.akdf akdfVar = akgfVar.a;
        int iA = defpackage.akgh.a(this.a.s(), akdfVar.s());
        return iA != 0 ? iA : defpackage.akgh.a(this.a.q(), akdfVar.q());
    }

    final long b(long j, boolean z) {
        java.lang.String str = this.c;
        defpackage.akdf akdfVar = this.a;
        long j2 = str == null ? akdfVar.j(j, this.b) : akdfVar.i(j, str, this.d);
        return z ? this.a.g(j2) : j2;
    }

    final void c(defpackage.akdf akdfVar, int i) {
        this.a = akdfVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }
}
