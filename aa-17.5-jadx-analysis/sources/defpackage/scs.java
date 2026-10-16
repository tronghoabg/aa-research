package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Process;

/* loaded from: classes2.dex */
public final class scs extends scn implements IBinder.DeathRecipient {
    private final IBinder a;
    private final urg b;

    public scs(IBinder iBinder, urg urgVar) {
        this.b = urgVar;
        this.a = iBinder;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        rrd.b("CAR.MISC", null, "Remote process died before validation");
        this.a.unlinkToDeath(this, 0);
        this.b.e(false);
    }

    @Override // defpackage.sco
    public final void e() {
        this.a.unlinkToDeath(this, 0);
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        boolean z = callingUid == iMyUid;
        if (!z) {
            rrd.d(5, "CAR.MISC", null, "Calling uid [%d] does not match current process uid [%d]", Integer.valueOf(callingUid), Integer.valueOf(iMyUid));
        }
        this.b.e(z);
    }
}
