package defpackage;

import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes2.dex */
final class ioo extends ioc {
    @Override // defpackage.ioc
    protected final ing a(inz inzVar, iob iobVar, int i, boolean z) {
        ing ingVarC;
        if (z && (ingVarC = c()) != null) {
            ((ype) ioq.E.l().ai((char) 833)).y("getCarActivityManager - returning existing CAM: %s", ingVarC);
            return ingVarC;
        }
        ing ingVarB = b();
        if (ingVarB == null) {
            ((ype) ioq.E.l().ai(831)).S("getCarActivityManager(startInfo:%s, cams:%s, layer:%d, fromHistory:%b)", inzVar, iobVar, Integer.valueOf(i), Boolean.valueOf(z));
            return new ioq(iobVar, this, iobVar.j(CarDisplayId.a), inzVar);
        }
        woy.aa(this.e.size() == 1, "Multiple CAM instances in one CarActivityTask is not supported");
        woy.aa(inzVar.a.equals(ingVarB.d), "Root CAM must have same ComponentName");
        ((ype) ioq.E.l().ai((char) 832)).y("getCarActivityManager - returning root CAM: %s", ingVarB);
        return ingVarB;
    }
}
