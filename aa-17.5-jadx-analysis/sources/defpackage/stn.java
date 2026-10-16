package defpackage;

import android.os.RemoteException;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* loaded from: classes2.dex */
public final /* synthetic */ class stn implements stp {
    private final /* synthetic */ int a;

    public /* synthetic */ stn(int i) {
        this.a = i;
    }

    @Override // defpackage.stp
    public final void a(sua suaVar, smp smpVar, boolean z, nok nokVar) throws RemoteException {
        if (this.a == 0) {
            suaVar.J(smpVar, z, nokVar);
            return;
        }
        aat aatVar = suaVar.a;
        synchronized (aatVar) {
            stb stbVar = (stb) aatVar.remove(smpVar);
            if (stbVar == null) {
                nokVar.e(false);
                return;
            }
            stbVar.a.b().a();
            if (!z) {
                nokVar.e(true);
            } else if (suaVar.H(ssw.j)) {
                ((stl) suaVar.v()).f(LocationReceiver.b(null, stbVar, "ILocationListener@" + System.identityHashCode(stbVar)), new stv(true, nokVar));
            } else {
                ((stl) suaVar.v()).g(new LocationRequestUpdateData(2, null, stbVar, null, null, new stw(true, nokVar), null));
            }
        }
    }
}
