package defpackage;

/* loaded from: classes.dex */
final class bgo implements dnt {
    private final dnt a;
    private dlq b;
    private dlr c;
    private dlq d;
    private dlo e;

    public bgo(dnt dntVar) {
        this.a = dntVar;
    }

    @Override // defpackage.dnt
    public final long a(dlp dlpVar, long j, dlr dlrVar, long j2) {
        dlq dlqVar;
        dlq dlqVar2;
        dlo dloVar = this.e;
        if (dloVar != null && (dlqVar = this.b) != null && a.j(dlqVar.a, j) && this.c == dlrVar && (dlqVar2 = this.d) != null && a.j(dlqVar2.a, j2)) {
            return dloVar.a;
        }
        long jA = this.a.a(dlpVar, j, dlrVar, j2);
        this.b = new dlq(j);
        this.c = dlrVar;
        this.d = new dlq(j2);
        this.e = new dlo(jA);
        return jA;
    }
}
