package defpackage;

/* loaded from: classes.dex */
public final class bjw implements dnt {
    private final cfn a;
    private final bjy b;
    private long c = 0;

    public bjw(cfn cfnVar, bjy bjyVar) {
        this.a = cfnVar;
        this.b = bjyVar;
    }

    @Override // defpackage.dnt
    public final long a(dlp dlpVar, long j, dlr dlrVar, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return dlo.d(dlo.d(dlpVar.d(), dlf.s(jA)), this.a.a(j2, 0L, dlrVar));
    }
}
