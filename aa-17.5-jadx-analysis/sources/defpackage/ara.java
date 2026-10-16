package defpackage;

/* loaded from: classes.dex */
public final class ara {
    public final long a;
    public final long b;
    public final boolean c;

    public ara(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final ara a(ara araVar) {
        long jAi = a.ai(this.a, araVar.a);
        long jMax = Math.max(this.b, araVar.b);
        boolean z = true;
        if (!this.c && !araVar.c) {
            z = false;
        }
        return new ara(jAi, jMax, z);
    }
}
