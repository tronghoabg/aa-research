package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gearhead.service.SharedService;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class qjp implements IBinder.DeathRecipient {
    public final IBinder a;
    public final mjz b;

    public qjp(mjz mjzVar, IBinder iBinder) throws RemoteException {
        this.b = mjzVar;
        this.a = iBinder;
        try {
            iBinder.linkToDeath(this, 0);
            mjzVar.a.add(this);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) SharedService.a.g()).p(e)).ai((char) 7400)).u("Remote process maybe died");
            throw e;
        }
    }

    public final void a(int i) {
        ((ype) SharedService.a.l().ai((char) 7401)).y("Posting event %s", new zjd(zjc.a, Integer.valueOf(i)));
        szp.u(new hhx(this, i, 20));
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(int i) {
        if (!this.b.a.remove(this)) {
            return false;
        }
        a(i);
        return true;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        b(2);
        olm.d().b();
    }
}
