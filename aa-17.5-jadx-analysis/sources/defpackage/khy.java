package defpackage;

import android.os.Parcelable;
import com.google.android.apps.auto.components.calendar.model.AutoValue_CalendarReminder;
import com.google.android.apps.auto.components.calendar.model.CrossProfileCalendarStore_Bundler;
import com.google.android.apps.auto.components.car.info.StartingProcessInfo;
import com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper$Core;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.media.repository.suggestion.AppBrowserMediaSuggestionPayload;
import com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload;
import com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher;
import com.google.android.apps.auto.components.system.transcription.TranscriptionFragment;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.apps.auto.sdk.ui.FloatingActionButton;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.parcelablewrappers.ParcelableList;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.aang.AccountWithAppRestrictionState;
import com.google.android.gms.auth.aang.AppRestrictionState;

/* loaded from: classes.dex */
public final class khy implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public khy(int i) {
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
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khy.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CrossProfileCalendarStore_Bundler[i];
            case 1:
                return new AutoValue_CalendarReminder[i];
            case 2:
                return new StartingProcessInfo[i];
            case 3:
                return new CarInfoWrapper$Core[i];
            case 4:
                return new AaPlaybackState.AaCustomAction[i];
            case 5:
                return new AppBrowserMediaSuggestionPayload[i];
            case 6:
                return new AssistantMediaSuggestionPlaybackPayload[i];
            case 7:
                return new SlidingViewSwitcher.SavedState[i];
            case 8:
                return new TranscriptionFragment.PendingTranscriptionState[i];
            case 9:
                return new PhoneCall[i];
            case 10:
                return new CarCall[i];
            case 11:
                return new CarCall.Details[i];
            case 12:
                return new FloatingActionButton.SavedState[i];
            case 13:
                return new BundlerType[i];
            case 14:
                return new ParcelableList[i];
            case 15:
                return new FlexboxLayout.LayoutParams[i];
            case 16:
                return new FlexboxLayoutManager.LayoutParams[i];
            case 17:
                return new FlexboxLayoutManager.SavedState[i];
            case 18:
                return new TokenData[i];
            case 19:
                return new AppRestrictionState[i];
            default:
                return new AccountWithAppRestrictionState[i];
        }
    }
}
