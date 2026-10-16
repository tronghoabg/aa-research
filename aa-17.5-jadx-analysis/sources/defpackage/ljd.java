package defpackage;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
public final /* synthetic */ class ljd implements svs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.svs
    public final void a(svz svzVar) {
        int i = this.b;
        int i2 = 1;
        if (i == 0) {
            Location location = (Location) svzVar.e();
            Object obj = this.a;
            ((liy) obj).c(location);
            stf stfVar = new stf(100, 1000L);
            stfVar.e(1000L);
            LocationRequest locationRequestA = stfVar.a();
            ljf ljfVar = (ljf) obj;
            ljfVar.e = new lje(ljfVar);
            str strVar = ljfVar.f;
            lje ljeVar = ljfVar.e;
            Looper looperMyLooper = strVar.g;
            if (looperMyLooper == null) {
                looperMyLooper = Looper.myLooper();
                spu.ax(looperMyLooper, "invalid null looper");
            }
            smr smrVarH = uqw.H(ljeVar, looperMyLooper, ste.class.getSimpleName());
            stq stqVar = new stq(strVar, smrVarH, new stn(i2));
            qoq qoqVar = new qoq(stqVar, locationRequestA, 5);
            smx smxVar = new smx();
            smxVar.a = qoqVar;
            smxVar.b = stqVar;
            smxVar.c = smrVarH;
            smxVar.f = 2435;
            strVar.x(smxVar.a());
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.a.run();
                return;
            }
            if (i == 3) {
                this.a.run();
                return;
            } else {
                if (svzVar.g()) {
                    return;
                }
                Object obj2 = this.a;
                Exception excD = svzVar.d();
                excD.getClass();
                ((nok) obj2).d(excD);
                return;
            }
        }
        yph yphVar = ldw.a;
        boolean zG = svzVar.g();
        Object obj3 = this.a;
        if (zG) {
            ((dnw) obj3).b(null);
            return;
        }
        if (((swe) svzVar).c) {
            ((dnw) obj3).c();
            return;
        }
        if (svzVar.d() == null) {
            ((dnw) obj3).d(new Exception("Unknown failure"));
        } else {
            Exception excD2 = svzVar.d();
            excD2.getClass();
            ((dnw) obj3).d(excD2);
        }
    }
}
