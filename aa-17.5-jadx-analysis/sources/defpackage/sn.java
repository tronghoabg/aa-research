package defpackage;

import androidx.car.app.media.CarAudioCallbackDelegate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class sn {
    public static int c;
    public final Object a;
    public Object b;

    public sn(drj drjVar) {
        this.b = null;
        this.a = new ArrayList();
        c++;
        this.b = drjVar;
    }

    public final long a(drb drbVar, long j) {
        drj drjVar = drbVar.d;
        if (drjVar instanceof drf) {
            return j;
        }
        List list = drbVar.j;
        int size = list.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            dqz dqzVar = (dqz) list.get(i);
            if (dqzVar instanceof drb) {
                drb drbVar2 = (drb) dqzVar;
                if (drbVar2.d != drjVar) {
                    jMin = Math.min(jMin, a(drbVar2, drbVar2.e + j));
                }
            }
        }
        if (drbVar != drjVar.i) {
            return jMin;
        }
        long jA = drjVar.a();
        long j2 = j - jA;
        return Math.min(Math.min(jMin, a(drjVar.h, j2)), j2 - r10.e);
    }

    public final long b(drb drbVar, long j) {
        drj drjVar = drbVar.d;
        if (drjVar instanceof drf) {
            return j;
        }
        List list = drbVar.j;
        int size = list.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            dqz dqzVar = (dqz) list.get(i);
            if (dqzVar instanceof drb) {
                drb drbVar2 = (drb) dqzVar;
                if (drbVar2.d != drjVar) {
                    jMax = Math.max(jMax, b(drbVar2, drbVar2.e + j));
                }
            }
        }
        if (drbVar != drjVar.h) {
            return jMax;
        }
        long jA = drjVar.a();
        long j2 = j + jA;
        return Math.max(Math.max(jMax, b(drjVar.i, j2)), j2 - r10.e);
    }

    public sn(sj sjVar) {
        this.a = CarAudioCallbackDelegate.create(sjVar);
    }
}
