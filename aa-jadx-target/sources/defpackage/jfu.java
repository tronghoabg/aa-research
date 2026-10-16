package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jfu {
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.RemoteListenerSet");
    public final java.util.concurrent.CopyOnWriteArrayList a = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.lang.String c;

    public jfu(java.lang.String str) {
        this.c = str;
    }

    private final sad d(android.os.IBinder iBinder) {
        java.util.concurrent.CopyOnWriteArrayList<sad> copyOnWriteArrayList = this.a;
        for (sad sadVar : copyOnWriteArrayList) {
            defpackage.ysr.bj(sadVar.a() == copyOnWriteArrayList);
            synchronized (sadVar.a()) {
                if (sadVar.a.equals(iBinder)) {
                    return sadVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, jft] */
    public final void a(java.lang.Object obj) {
        for (sad sadVar : this.a) {
            try {
                sadVar.c.a(obj);
            } catch (android.os.TransactionTooLargeException e) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s: failed to notify one or more listeners because value (%s) was too large", this.c, obj), e);
            } catch (android.os.RemoteException e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e2)).ai(1998)).R("%s: Unrecoverable RemoteException notifying listener %s with value %s", this.c, sadVar.c, obj);
                sadVar.binderDied();
            }
        }
    }

    public final void b(android.os.IInterface iInterface) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        synchronized (copyOnWriteArrayList) {
            android.os.IBinder iBinderAsBinder = iInterface.asBinder();
            sad sadVarD = d(iBinderAsBinder);
            if (sadVarD != null) {
                copyOnWriteArrayList.remove(sadVarD);
                iBinderAsBinder.unlinkToDeath(sadVarD, 0);
            }
        }
    }

    public final boolean c(android.os.IInterface iInterface, jft jftVar) {
        synchronized (this.a) {
            android.os.IBinder iBinderAsBinder = iInterface.asBinder();
            sad sadVarD = d(iBinderAsBinder);
            if (sadVarD != null) {
                java.lang.Object obj = sadVarD.c;
                if (jftVar.equals(obj)) {
                    return true;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s: Can't register listener %s: host is already associated with listener %s", this.c, jftVar, obj));
            }
            sad sadVar = new sad(this, iBinderAsBinder, jftVar, 1);
            try {
                iBinderAsBinder.linkToDeath(sadVar, 0);
                this.a.add(sadVar);
                return true;
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e)).ai(1999)).M("%s: RemoteException setting death recipient for listener %s", this.c, jftVar);
                return false;
            }
        }
    }
}
