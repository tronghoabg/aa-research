package defpackage;

/* loaded from: classes.dex */
public final class bbf implements azh {
    public final ayx a;
    public final bbk b = bbk.a;
    private final bbt c;
    private final smv d;

    public bbf(bbt bbtVar, ayx ayxVar, smv smvVar) {
        this.c = bbtVar;
        this.a = ayxVar;
        this.d = smvVar;
    }

    @Override // defpackage.azh
    public final int a(Object obj) {
        return this.d.b(obj);
    }

    @Override // defpackage.azh
    public final int b() {
        return this.a.d();
    }

    @Override // defpackage.azh
    public final /* synthetic */ Object c(int i) {
        return null;
    }

    @Override // defpackage.azh
    public final Object d(int i) {
        Object objC = this.d.c(i);
        return objC == null ? this.a.e(i) : objC;
    }

    @Override // defpackage.azh
    public final void e(int i, Object obj, bux buxVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-1201380429);
        if (i4 == 0) {
            i3 = (true != buxVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.E(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.C(this) ? 128 : 256;
        }
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            awx.m(obj, i, this.c.w, bxc.i(1142237095, true, new ati(this, i, 4), buxVarC), buxVarC, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 3072);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bbe(this, i, obj, i2, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bbf) {
            return affa.f(this.a, ((bbf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
