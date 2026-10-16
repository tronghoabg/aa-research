package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.logging.Level;

/* loaded from: classes3.dex */
final class adov implements adps {
    static final adov a = new adov();

    @Override // defpackage.adps
    public final boolean a(int i, Parcel parcel) {
        if (i == 1 && parcel.readInt() > 0) {
            IBinder strongBinder = parcel.readStrongBinder();
            try {
                adqf adqfVarC = adqf.c();
                try {
                    adqfVarC.a().writeInt(0);
                    strongBinder.transact(2, adqfVarC.a(), null, 1);
                    adqfVarC.close();
                } finally {
                }
            } catch (RemoteException e) {
                adow.a.logp(Level.WARNING, "io.grpc.binder.internal.BinderServer$GoAwayHandler", "handleTransaction", "Couldn't reply to post-shutdown() SETUP_TRANSPORT.", (Throwable) e);
            }
        }
        return false;
    }
}
