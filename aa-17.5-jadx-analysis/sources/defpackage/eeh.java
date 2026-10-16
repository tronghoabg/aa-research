package defpackage;

import android.os.Parcelable;
import androidx.core.telecom.extensions.Capability;
import androidx.core.widget.NestedScrollView;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SeekBarPreference;
import androidx.preference.TwoStatePreference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.versionedparcelable.ParcelImpl;
import coil.memory.MemoryCache$Key;
import com.android.personalcontext.ace.client.prototype.clientaction.FullScreenRequestParams;
import com.android.personalcontext.ace.client.prototype.clientaction.ShareLiveLocationParams;
import com.android.personalcontext.ace.client.prototype.clientaction.SharePhotoParams;
import com.android.personalcontext.ace.client.prototype.clientaction.ShowCardsParams;
import com.android.personalcontext.ace.client.prototype.clientaction.TextPasteParams;
import com.android.personalcontext.ace.client.prototype.clientaction.UnknownParams;
import com.android.personalcontext.ace.client.prototype.richcard.RichCardError;
import com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber;
import com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarEvent;

/* loaded from: classes2.dex */
public final class eeh implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public eeh(int i) {
        this.a = i;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeh.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new NestedScrollView.SavedState[i];
            case 1:
                return new Capability[i];
            case 2:
                return new EditTextPreference.SavedState[i];
            case 3:
                return new ListPreference.SavedState[i];
            case 4:
                return new MultiSelectListPreference.SavedState[i];
            case 5:
                return new Preference.BaseSavedState[i];
            case 6:
                return new PreferenceGroup.SavedState[i];
            case 7:
                return new SeekBarPreference.SavedState[i];
            case 8:
                return new TwoStatePreference.SavedState[i];
            case 9:
                return new SwipeRefreshLayout.SavedState[i];
            case 10:
                return new ParcelImpl[i];
            case 11:
                return new MemoryCache$Key[i];
            case 12:
                return new FullScreenRequestParams[i];
            case 13:
                return new ShareLiveLocationParams[i];
            case 14:
                return new SharePhotoParams[i];
            case 15:
                return new ShowCardsParams[i];
            case 16:
                return new TextPasteParams[i];
            case 17:
                return new UnknownParams[i];
            case 18:
                return new RichCardError[i];
            case 19:
                return new CalendarEventPhoneNumber[i];
            default:
                return new AutoValue_CalendarEvent[i];
        }
    }
}
