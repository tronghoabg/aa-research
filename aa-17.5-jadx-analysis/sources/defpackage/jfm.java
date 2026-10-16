package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class jfm {
    private static final yph b = yph.c("CAR.RemoteListenerSet");
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final String c;

    public jfm(String str) {
        this.c = str;
    }

    private final rzh d(IBinder iBinder) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
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

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, jfl] */
    public final void a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            rzh rzhVar = (rzh) it.next();
            try {
                rzhVar.c.a(obj);
            } catch (TransactionTooLargeException e) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s: failed to notify one or more listeners because value (%s) was too large", this.c, obj), e);
            } catch (RemoteException e2) {
                ((ype) ((ype) ((ype) b.h()).p(e2)).ai(1998)).R("%s: Unrecoverable RemoteException notifying listener %s with value %s", this.c, rzhVar.c, obj);
                rzhVar.binderDied();
            }
        }
    }

    public final void b(IInterface iInterface) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        synchronized (copyOnWriteArrayList) {
            IBinder iBinderAsBinder = iInterface.asBinder();
            rzh rzhVarD = d(iBinderAsBinder);
            if (rzhVarD != null) {
                copyOnWriteArrayList.remove(rzhVarD);
                iBinderAsBinder.unlinkToDeath(rzhVarD, 0);
            }
        }
    }

    public final boolean c(IInterface iInterface, jfl jflVar) {
        synchronized (this.a) {
            IBinder iBinderAsBinder = iInterface.asBinder();
            rzh rzhVarD = d(iBinderAsBinder);
            if (rzhVarD != null) {
                Object obj = rzhVarD.c;
                if (jflVar.equals(obj)) {
                    return true;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s: Can't register listener %s: host is already associated with listener %s", this.c, jflVar, obj));
            }
            rzh rzhVar = new rzh(this, iBinderAsBinder, jflVar, 1);
            try {
                iBinderAsBinder.linkToDeath(rzhVar, 0);
                this.a.add(rzhVar);
                return true;
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) b.h()).p(e)).ai(1999)).M("%s: RemoteException setting death recipient for listener %s", this.c, jflVar);
                return false;
            }
        }
    }
}
