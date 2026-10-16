package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class adrb {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adrb.class.getName());
    public static final defpackage.adrq c = new defpackage.adrq();
    protected final android.os.IBinder b;

    protected adrb(android.os.IBinder iBinder) {
        this.b = iBinder;
    }

    public static defpackage.adrb b(android.os.IBinder iBinder, java.util.concurrent.Executor executor) {
        return iBinder instanceof android.os.Binder ? new defpackage.adqz(iBinder, executor) : new defpackage.adra(iBinder);
    }

    public abstract void a(int i, defpackage.adrf adrfVar) throws android.os.RemoteException;

    protected final boolean c(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
