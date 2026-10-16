package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class oxn extends defpackage.ijw implements oxo {
    public oxn() {
        super("com.google.android.apps.auto.sdk.nav.suggestion.INavigationSuggestionCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion[] navigationSuggestionArr = (com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion[]) parcel.createTypedArray(com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion.CREATOR);
        defpackage.ijx.d(parcel);
        a(navigationSuggestionArr);
        return true;
    }
}
