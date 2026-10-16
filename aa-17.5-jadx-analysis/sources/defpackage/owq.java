package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;

/* loaded from: classes.dex */
public abstract class owq extends ijo implements owr {
    public owq() {
        super("com.google.android.apps.auto.sdk.nav.suggestion.INavigationSuggestionCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        NavigationSuggestion[] navigationSuggestionArr = (NavigationSuggestion[]) parcel.createTypedArray(NavigationSuggestion.CREATOR);
        ijp.d(parcel);
        a(navigationSuggestionArr);
        return true;
    }
}
