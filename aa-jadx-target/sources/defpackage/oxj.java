package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oxj extends defpackage.ijv implements android.os.IInterface {
    public oxj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.nav.INavigationProvider");
    }

    public final defpackage.oxm e() throws android.os.RemoteException {
        defpackage.oxm oxmVar;
        android.os.Parcel parcelFq = fq(5, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            oxmVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.nav.state.INavigationStateManager");
            oxmVar = iInterfaceQueryLocalInterface instanceof defpackage.oxm ? (defpackage.oxm) iInterfaceQueryLocalInterface : new defpackage.oxm(strongBinder);
        }
        parcelFq.recycle();
        return oxmVar;
    }

    public final defpackage.oxp f() throws android.os.RemoteException {
        defpackage.oxp oxpVar;
        android.os.Parcel parcelFq = fq(6, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            oxpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.nav.suggestion.INavigationSuggestionManager");
            oxpVar = iInterfaceQueryLocalInterface instanceof defpackage.oxp ? (defpackage.oxp) iInterfaceQueryLocalInterface : new defpackage.oxp(strongBinder);
        }
        parcelFq.recycle();
        return oxpVar;
    }
}
