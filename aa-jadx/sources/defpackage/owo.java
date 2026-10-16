package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class owo extends defpackage.ijv implements android.os.IInterface {
    public owo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IMenuAdapter");
    }

    public final com.google.android.apps.auto.sdk.MenuItem e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        com.google.android.apps.auto.sdk.MenuItem menuItem = (com.google.android.apps.auto.sdk.MenuItem) defpackage.ijx.a(parcelFq, com.google.android.apps.auto.sdk.MenuItem.CREATOR);
        parcelFq.recycle();
        return menuItem;
    }

    public final void f(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bundle);
        fr(9, parcelFp);
    }
}
