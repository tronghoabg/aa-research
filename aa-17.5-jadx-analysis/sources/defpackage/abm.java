package defpackage;

/* loaded from: classes.dex */
public final class abm<S> extends acv {
    public agb a;
    public bym b;
    public abk c;
    public cuo d;
    public cuo e;
    public long f = 0;
    public long g = 0;
    private final afec h = new aai(this, 6);
    private final afec i = new aai(this, 7);
    private long j = -9223372034707292160L;

    public abm(agb agbVar, bym bymVar, abk abkVar) {
        this.a = agbVar;
        this.b = bymVar;
        this.c = abkVar;
    }

    public final long a(long j) {
        long j2 = this.j;
        return a.j(j2, -9223372034707292160L) ? j : j2;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        long j2;
        cuo cuoVarV = ctoVar.v(j);
        if (ctsVar.eM()) {
            j2 = (cuoVarV.a << 32) | (cuoVarV.b & 4294967295L);
        } else {
            agb agbVar = this.a;
            if (agbVar == null) {
                j2 = (cuoVarV.a << 32) | (cuoVarV.b & 4294967295L);
                this.j = j2;
            } else {
                long j3 = (cuoVarV.b & 4294967295L) | (cuoVarV.a << 32);
                bym bymVarB = agbVar.b(new abl(this, j3, 1), null, null, new abl(this, j3, 0));
                this.c.e = bymVarB;
                j2 = ((dlq) bymVarB.a()).a;
                this.j = ((dlq) bymVarB.a()).a;
            }
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (4294967295L & j2);
        if (ctsVar.eM()) {
            this.d = cuoVarV;
            this.f = j2;
            return ctsVar.eK(i, i2, afbf.a, this.h);
        }
        this.e = cuoVarV;
        this.g = j2;
        return ctsVar.eK(i, i2, afbf.a, this.i);
    }

    @Override // defpackage.cfx
    public final void em() {
        this.j = -9223372034707292160L;
    }
}
