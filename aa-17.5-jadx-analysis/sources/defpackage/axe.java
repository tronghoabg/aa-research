package defpackage;

/* loaded from: classes.dex */
public final class axe implements azh {
    public final axd a;
    public final bii b;
    public final smv c;
    private final axr d;

    public axe(axr axrVar, axd axdVar, bii biiVar, smv smvVar) {
        this.d = axrVar;
        this.a = axdVar;
        this.b = biiVar;
        this.c = smvVar;
    }

    @Override // defpackage.azh
    public final int a(Object obj) {
        return this.c.b(obj);
    }

    @Override // defpackage.azh
    public final int b() {
        return this.a.d();
    }

    @Override // defpackage.azh
    public final Object c(int i) {
        os osVarB = this.a.a.b(i);
        return ((ayw) osVarB.c).b().invoke(Integer.valueOf(i - osVarB.a));
    }

    @Override // defpackage.azh
    public final Object d(int i) {
        Object objC = this.c.c(i);
        return objC == null ? this.a.e(i) : objC;
    }

    @Override // defpackage.azh
    public final void e(int i, Object obj, bux buxVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-462424778);
        int i5 = 2;
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
            awx.m(obj, i, this.d.m, bxc.i(-824725566, true, new ati(this, i, i5), buxVarC), buxVarC, ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 3072);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bbe(this, i, obj, i2, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof axe) {
            return affa.f(this.a, ((axe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
