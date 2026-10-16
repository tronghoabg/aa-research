package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abt<S> extends defpackage.adc {
    public defpackage.agi a;
    public defpackage.bys b;
    public defpackage.abr c;
    public defpackage.cux d;
    public defpackage.cux e;
    public long f = 0;
    public long g = 0;
    private final defpackage.affc h = new defpackage.aap(this, 6);
    private final defpackage.affc i = new defpackage.aap(this, 7);
    private long j = -9223372034707292160L;

    public abt(defpackage.agi agiVar, defpackage.bys bysVar, defpackage.abr abrVar) {
        this.a = agiVar;
        this.b = bysVar;
        this.c = abrVar;
    }

    public final long a(long j) {
        long j2 = this.j;
        return defpackage.a.i(j2, -9223372034707292160L) ? j : j2;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        long j2;
        defpackage.cux cuxVarV = ctxVar.v(j);
        if (cubVar.dU()) {
            j2 = (((long) cuxVarV.a) << 32) | (((long) cuxVarV.b) & 4294967295L);
        } else {
            defpackage.agi agiVar = this.a;
            if (agiVar == null) {
                j2 = (((long) cuxVarV.a) << 32) | (((long) cuxVarV.b) & 4294967295L);
                this.j = j2;
            } else {
                long j3 = (((long) cuxVarV.b) & 4294967295L) | (((long) cuxVarV.a) << 32);
                defpackage.bys bysVarB = agiVar.b(new defpackage.abs(this, j3, 1), null, null, new defpackage.abs(this, j3, 0));
                this.c.e = bysVarB;
                j2 = ((defpackage.dly) bysVarB.a()).a;
                this.j = ((defpackage.dly) bysVarB.a()).a;
            }
        }
        int i = (int) (j2 >> 32);
        int i2 = (int) (4294967295L & j2);
        if (cubVar.dU()) {
            this.d = cuxVarV;
            this.f = j2;
            return cubVar.dS(i, i2, defpackage.afcf.a, this.h);
        }
        this.e = cuxVarV;
        this.g = j2;
        return cubVar.dS(i, i2, defpackage.afcf.a, this.i);
    }

    @Override // defpackage.cge
    public final void du() {
        this.j = -9223372034707292160L;
    }
}
