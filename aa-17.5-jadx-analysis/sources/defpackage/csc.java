package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public final class csc implements cts, csq {
    public final cwx a;
    public csa b;
    public boolean c;

    public csc(cwx cwxVar, csa csaVar) {
        this.a = cwxVar;
        this.b = csaVar;
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
        return f * this.a.a();
    }

    @Override // defpackage.dlg
    public final int eE(long j) {
        return Math.round(dlf.k(this.a, j));
    }

    @Override // defpackage.dlg
    public final int eF(float f) {
        return dlf.l(this.a, f);
    }

    @Override // defpackage.dlg
    public final long eG(long j) {
        return dlf.m(this.a, j);
    }

    @Override // defpackage.dlg
    public final long eH(long j) {
        return dlf.n(this.a, j);
    }

    @Override // defpackage.dlm
    public final long eI(float f) {
        return dln.d(this.a, f);
    }

    @Override // defpackage.dlg
    public final long eJ(float f) {
        cwx cwxVar = this.a;
        return dln.d(cwxVar, (f / cwxVar.a()) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.cts
    public final ctq eK(int i, int i2, Map map, afec afecVar) {
        return this.a.eL(i, i2, map, null, afecVar);
    }

    @Override // defpackage.cts
    public final ctq eL(int i, int i2, Map map, afec afecVar, afec afecVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            crt.c(a.bB(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new csb(i, i2, map, afecVar, afecVar2, this);
    }

    @Override // defpackage.csq
    public final boolean eM() {
        return false;
    }

    @Override // defpackage.dlm
    public final float ew(long j) {
        return dln.c(this.a, j);
    }

    @Override // defpackage.dlg
    public final float ex(float f) {
        return (f / this.a.a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ey(int i) {
        return (i / this.a.a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final float ez(long j) {
        return dlf.k(this.a, j);
    }

    @Override // defpackage.csq
    public final dlr p() {
        return this.a.p();
    }
}
