package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class css implements cts, csq {
    private final /* synthetic */ csq a;
    private final dlr b;

    public css(csq csqVar, dlr dlrVar) {
        this.a = csqVar;
        this.b = dlrVar;
    }

    @Override // defpackage.dlg
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlg
    public final float eA(float f) {
        return this.a.eA(f);
    }

    @Override // defpackage.dlg
    public final int eE(long j) {
        return this.a.eE(j);
    }

    @Override // defpackage.dlg
    public final int eF(float f) {
        return this.a.eF(f);
    }

    @Override // defpackage.dlg
    public final long eG(long j) {
        return this.a.eG(j);
    }

    @Override // defpackage.dlg
    public final long eH(long j) {
        return this.a.eH(j);
    }

    @Override // defpackage.dlm
    public final long eI(float f) {
        return this.a.eI(f);
    }

    @Override // defpackage.dlg
    public final long eJ(float f) {
        return this.a.eJ(f);
    }

    @Override // defpackage.cts
    public final /* synthetic */ ctq eK(int i, int i2, Map map, afec afecVar) {
        return eL(i, i2, map, null, afecVar);
    }

    @Override // defpackage.cts
    public final ctq eL(int i, int i2, Map map, afec afecVar, afec afecVar2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            crt.c(a.bB(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new csr(i, i2, map, afecVar);
    }

    @Override // defpackage.csq
    public final boolean eM() {
        return this.a.eM();
    }

    @Override // defpackage.dlm
    public final float ew(long j) {
        return this.a.ew(j);
    }

    @Override // defpackage.dlg
    public final float ex(float f) {
        return this.a.ex(f);
    }

    @Override // defpackage.dlg
    public final float ey(int i) {
        return this.a.ey(i);
    }

    @Override // defpackage.dlg
    public final float ez(long j) {
        return this.a.ez(j);
    }

    @Override // defpackage.csq
    public final dlr p() {
        return this.b;
    }
}
