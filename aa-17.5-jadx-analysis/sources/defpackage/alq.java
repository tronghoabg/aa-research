package defpackage;

/* loaded from: classes.dex */
public final class alq implements dnt {
    private final afdr a;

    public alq(afdr afdrVar) {
        this.a = afdrVar;
    }

    @Override // defpackage.dnt
    public final long a(dlp dlpVar, long j, dlr dlrVar, long j2) {
        long j3 = ((dlo) this.a.invoke()).a;
        return (ca.aV(dlpVar.c + dlo.b(j3), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (ca.aV(dlpVar.b + dlo.a(j3), (int) (j2 >> 32), (int) (j >> 32), dlrVar == dlr.a) << 32);
    }
}
