package defpackage;

/* loaded from: classes3.dex */
public final class ujt {
    public long a = -1;
    public int b = -1;
    public int c = 0;

    public final uju a() {
        return new uju(this.a, this.b, this.c);
    }

    public final void b(boolean z, long j, boolean z2, int i, abcy abcyVar) {
        if (true != z) {
            j = -1;
        }
        this.a = j;
        if (true != z2) {
            i = -1;
        }
        this.b = i;
        this.c = (abcyVar.b & 1) != 0 ? abcyVar.c : 0;
    }
}
