package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pwg {
    public final defpackage.pwh a = new defpackage.pwh();
    public final defpackage.tmy b;
    public long c;
    public int d;

    public pwg(defpackage.tmy tmyVar) {
        this.b = tmyVar;
    }

    public final void a(int i, boolean z) {
        this.d = i - ((int) this.c);
        this.b.a();
        defpackage.pwh pwhVar = this.a;
        long j = pwhVar.b;
        long j2 = this.d;
        pwhVar.b = j + j2;
        pwhVar.d++;
        if (z) {
            pwhVar.c += j2;
            pwhVar.e++;
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
