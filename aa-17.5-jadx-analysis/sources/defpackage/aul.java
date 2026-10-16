package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public final class aul implements cts {
    final /* synthetic */ cts a;

    public aul(cts ctsVar) {
        this.a = ctsVar;
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
    public final /* synthetic */ float eA(float f) {
        return f * a();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        return Math.round(dlf.k(this, j));
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f) {
        return dlf.l(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ long eI(float f) {
        return dln.d(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return dln.d(this, (f / a()) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.cts
    public final /* synthetic */ ctq eK(int i, int i2, Map map, afec afecVar) {
        return bzi.A(this, i, i2, map, null, afecVar);
    }

    @Override // defpackage.cts
    public final /* synthetic */ ctq eL(int i, int i2, Map map, afec afecVar, afec afecVar2) {
        return bzi.A(this, i, i2, map, afecVar, afecVar2);
    }

    @Override // defpackage.csq
    public final /* synthetic */ boolean eM() {
        return false;
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f) {
        return (f / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    @Override // defpackage.csq
    public final dlr p() {
        return this.a.p();
    }
}
