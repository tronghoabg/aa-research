package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctb implements defpackage.cub, defpackage.csz {
    private final /* synthetic */ defpackage.csz a;
    private final defpackage.dlz b;

    public ctb(defpackage.csz cszVar, defpackage.dlz dlzVar) {
        this.a = cszVar;
        this.b = dlzVar;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlu
    public final float dE(long j) {
        return this.a.dE(j);
    }

    @Override // defpackage.dlo
    public final float dF(float f) {
        return this.a.dF(f);
    }

    @Override // defpackage.dlo
    public final float dG(int i) {
        return this.a.dG(i);
    }

    @Override // defpackage.dlo
    public final float dH(long j) {
        return this.a.dH(j);
    }

    @Override // defpackage.dlo
    public final float dI(float f) {
        return this.a.dI(f);
    }

    @Override // defpackage.dlo
    public final int dM(long j) {
        return this.a.dM(j);
    }

    @Override // defpackage.dlo
    public final int dN(float f) {
        return this.a.dN(f);
    }

    @Override // defpackage.dlo
    public final long dO(long j) {
        return this.a.dO(j);
    }

    @Override // defpackage.dlo
    public final long dP(long j) {
        return this.a.dP(j);
    }

    @Override // defpackage.dlu
    public final long dQ(float f) {
        return this.a.dQ(f);
    }

    @Override // defpackage.dlo
    public final long dR(float f) {
        return this.a.dR(f);
    }

    @Override // defpackage.cub
    public final /* synthetic */ defpackage.ctz dS(int i, int i2, java.util.Map map, defpackage.affc affcVar) {
        return dT(i, i2, map, null, affcVar);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dT(int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.affc affcVar2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.csc.c(defpackage.a.bz(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.cta(i, i2, map, affcVar);
    }

    @Override // defpackage.csz
    public final boolean dU() {
        return this.a.dU();
    }

    @Override // defpackage.csz
    public final defpackage.dlz p() {
        return this.b;
    }
}
