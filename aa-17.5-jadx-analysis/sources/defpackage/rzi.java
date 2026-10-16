package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class rzi {
    public static final ypf a = ols.R("CAR.RemoteListenerSet");
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final String c = "CarAudioService";

    public final rzh a(IBinder iBinder) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            rzh rzhVar = (rzh) it.next();
            woy.Z(rzhVar.a() == copyOnWriteArrayList);
            synchronized (rzhVar.a()) {
                if (rzhVar.a.equals(iBinder)) {
                    return rzhVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, qvn] */
    public final void b(Object obj) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            rzh rzhVar = (rzh) it.next();
            try {
                ((ykd) rzhVar.c).a.e((byte[]) obj);
            } catch (TransactionTooLargeException e) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s: failed to notify one or more listeners because value (%s) was too large", this.c, obj), e);
            } catch (RemoteException e2) {
                a.h().p(e2).ai(8577).R("%s: Unrecoverable RemoteException notifying listener %s with value %s", this.c, rzhVar.c, obj);
                rzhVar.binderDied();
            }
        }
    }
}
