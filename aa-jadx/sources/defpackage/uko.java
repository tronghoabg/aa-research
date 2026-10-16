package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uko {
    public long a = -1;
    public int b = -1;
    public int c = 0;

    public final defpackage.ukp a() {
        return new defpackage.ukp(this.a, this.b, this.c);
    }

    public final void b(boolean z, long j, boolean z2, int i, defpackage.abeb abebVar) {
        if (true != z) {
            j = -1;
        }
        this.a = j;
        if (true != z2) {
            i = -1;
        }
        this.b = i;
        this.c = (abebVar.b & 1) != 0 ? abebVar.c : 0;
    }
}
