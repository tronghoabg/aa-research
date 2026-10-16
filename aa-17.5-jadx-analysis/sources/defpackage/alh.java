package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class alh implements aqf {
    public static final cdt g = new cdt(new abp(2), new ajc(6));
    public float c;
    private final bym i;
    private final bym j;
    private final byd k;
    public final byd d = new ParcelableSnapshotMutableIntState(0);
    public final byd e = new ParcelableSnapshotMutableIntState(0);
    public final bwq a = new ParcelableSnapshotMutableState(false, bxp.c);
    public final asf b = new asg();
    public final byd f = new ParcelableSnapshotMutableIntState(Alert.DURATION_SHOW_INDEFINITELY);
    private final aqf h = new anj(new acm(this, 11));

    public alh(int i) {
        this.k = new ParcelableSnapshotMutableIntState(i);
        alg algVar = new alg(this, 1);
        lah lahVar = byj.a;
        this.i = new bvk(algVar, null);
        this.j = new bvk(new alg(this, 0), null);
    }

    @Override // defpackage.aqf
    public final float a(float f) {
        return this.h.a(f);
    }

    public final int b() {
        return this.f.e();
    }

    public final int c() {
        return this.k.e();
    }

    public final int d() {
        return this.d.e();
    }

    @Override // defpackage.aqf
    public final Object e(akq akqVar, afeg afegVar, afck afckVar) {
        Object objE = this.h.e(akqVar, afegVar, afckVar);
        return objE == afcr.a ? objE : afak.a;
    }

    public final void f(int i) {
        this.k.h(i);
    }

    @Override // defpackage.aqf
    public final boolean g() {
        return ((Boolean) this.j.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean h() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    @Override // defpackage.aqf
    public final boolean i() {
        return this.h.i();
    }
}
