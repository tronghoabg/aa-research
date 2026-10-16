package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.RadioProgramInfo;

/* loaded from: classes2.dex */
final class ikm implements zge {
    final /* synthetic */ zgp a;
    final /* synthetic */ long b;
    final /* synthetic */ ikp c;

    public ikm(ikp ikpVar, zgp zgpVar, long j) {
        this.a = zgpVar;
        this.b = j;
        this.c = ikpVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        ((ype) ((ype) ikp.a.h()).ai((char) 177)).u("Failed to extract RadioProgramInfo for onProgramInfoUpdate");
        this.c.p(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, qye] */
    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ikp ikpVar = this.c;
        RadioProgramInfo radioProgramInfo = (RadioProgramInfo) obj;
        if (!ikpVar.c) {
            ((ype) ikp.a.l().ai((char) 179)).u("Car no longer connected");
            ikp.B(radioProgramInfo);
            ikpVar.p(this.a);
            return;
        }
        synchronized (ikpVar.e) {
            long j = this.b;
            if (j < ikpVar.g) {
                ((ype) ((ype) ikp.a.h()).ai(178)).G("Discarding out-of-order programInfo update (seq=%d, latest=%d)", j, ikpVar.g);
                ikp.B(radioProgramInfo);
                ikpVar.p(this.a);
                return;
            }
            ikpVar.g = j;
            RadioProgramInfo radioProgramInfo2 = ikpVar.j;
            ikpVar.j = radioProgramInfo;
            Boolean bool = ikpVar.i;
            boolean z = true;
            boolean z2 = bool != null && bool.booleanValue();
            Boolean bool2 = ikpVar.m;
            if (bool2 == null || !bool2.booleanValue()) {
                z = false;
            }
            if (ikpVar.c) {
                yfq yfqVarI = ikpVar.i();
                int size = yfqVarI.size();
                for (int i = 0; i < size; i++) {
                    ikf ikfVar = (ikf) yfqVarI.get(i);
                    if (!ikpVar.c) {
                        break;
                    }
                    try {
                        ikfVar.a.g(radioProgramInfo, z2, z);
                    } catch (RemoteException e) {
                        ((ype) ((ype) ((ype) ikp.a.h()).p(e)).ai((char) 186)).u("Error calling onProgramInfoUpdate()");
                    }
                }
            }
            if (radioProgramInfo2 != null) {
                ikp.B(radioProgramInfo2);
            }
            this.c.p(this.a);
        }
    }
}
