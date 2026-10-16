package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
final class akff implements Comparable {
    akcf a;
    int b;
    String c;
    Locale d;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(akff akffVar) {
        akcf akcfVar = akffVar.a;
        int iA = akfh.a(this.a.s(), akcfVar.s());
        return iA != 0 ? iA : akfh.a(this.a.q(), akcfVar.q());
    }

    final long b(long j, boolean z) {
        String str = this.c;
        akcf akcfVar = this.a;
        long j2 = str == null ? akcfVar.j(j, this.b) : akcfVar.i(j, str, this.d);
        return z ? this.a.g(j2) : j2;
    }

    final void c(akcf akcfVar, int i) {
        this.a = akcfVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }
}
