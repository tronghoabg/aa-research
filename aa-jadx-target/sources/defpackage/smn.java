package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class smn {
    public final int c;
    public boolean d = false;
    public boolean e = false;

    public smn(int i) {
        this.c = i;
    }

    public static com.google.android.gms.common.api.Status j(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void f(com.google.android.gms.common.api.Status status);

    public abstract void g(java.lang.Exception exc);

    public abstract void h(defpackage.snb snbVar) throws android.os.DeadObjectException;

    public abstract void i(defpackage.rkq rkqVar, boolean z);
}
