package defpackage;

/* loaded from: classes2.dex */
public final class pvn {
    public final pvo a = new pvo();
    public final tmb b;
    public long c;
    public int d;

    public pvn(tmb tmbVar) {
        this.b = tmbVar;
    }

    public final void a(int i, boolean z) {
        this.d = i - ((int) this.c);
        this.b.a();
        pvo pvoVar = this.a;
        long j = pvoVar.b;
        long j2 = this.d;
        pvoVar.b = j + j2;
        pvoVar.d++;
        if (z) {
            pvoVar.c += j2;
            pvoVar.e++;
        }
    }

    public final void b(long j) {
        this.b.a();
        this.a.a += j - this.c;
    }

    public final void c(long j) {
        this.c = j;
        this.b.a();
    }
}
