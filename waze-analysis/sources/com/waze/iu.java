package com.waze;

import com.waze.NativeManager;
import com.waze.gw.Gateway;
import com.waze.jni.protos.EtaLabelRequest;
import com.waze.jni.protos.EtaLabelResponse;
import com.waze.jni.protos.GetCurrencyStringRequest;
import com.waze.jni.protos.GetCurrencyStringResponse;
import com.waze.jni.protos.LoadAutoCompleteVenueRequest;
import com.waze.jni.protos.LoadAutoCompleteVenueResponse;
import com.waze.jni.protos.MessageBoxIconProto;
import com.waze.jni.protos.NotificationMessage;
import com.waze.jni.protos.QuestionProto;
import com.waze.jni.protos.RtAlertsThumbsUpDataProto;
import com.waze.jni.protos.VenueCategoryGroups;
import com.waze.jni.protos.VenueOrPlace;
import com.waze.jni.protos.WazeApplicationInfo;
import com.waze.jni.protos.map.MapPopupNativeInfo;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class iu {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void BeepClosed$default(iu iuVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: BeepClosed");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        iuVar.BeepClosed(i2, lVar);
    }

    static final h.ab BeepClosed$lambda$0(iu iuVar, int i2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).BeepClosedNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void CloseAllPopups$default(iu iuVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: CloseAllPopups");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        iuVar.CloseAllPopups(i2, lVar);
    }

    static final h.ab CloseAllPopups$lambda$0(iu iuVar, int i2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).CloseAllPopupsNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void ConnectivityChanged$default(iu iuVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ConnectivityChanged");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.ConnectivityChanged(z, lVar);
    }

    static final h.ab ConnectivityChanged$lambda$0(iu iuVar, boolean z) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).ConnectivityChangedNTV(z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void DeleteAccount$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: DeleteAccount");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.DeleteAccount(lVar);
    }

    static final h.ab DeleteAccount$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).DeleteAccountNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void GetSocialIsFirstTime$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: GetSocialIsFirstTime");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.GetSocialIsFirstTime(lVar);
    }

    static final Boolean GetSocialIsFirstTime$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        return Boolean.valueOf(((NativeManager) iuVar).GetSocialIsFirstTimeNTV());
    }

    static final void OpenParkingSearchJNI$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).OpenParkingSearch();
    }

    public static /* synthetic */ void PopupShown$default(iu iuVar, int i2, int i3, int i4, int i5, h.g.a.l lVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: PopupShown");
        }
        if ((i6 & 16) != 0) {
            lVar = null;
        }
        iuVar.PopupShown(i2, i3, i4, i5, lVar);
    }

    static final h.ab PopupShown$lambda$0(iu iuVar, int i2, int i3, int i4, int i5) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).PopupShownNTV(i2, i3, i4, i5);
        return null;
    }

    static final void RoadClosureArrowSelectedJNI$lambda$0(iu iuVar, int i2, int i3, int i4) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).RoadClosureArrowSelected(i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void SetExternalApp$default(iu iuVar, int i2, String str, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: SetExternalApp");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        iuVar.SetExternalApp(i2, str, lVar);
    }

    static final h.ab SetExternalApp$lambda$0(iu iuVar, int i2, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).SetExternalAppNTV(i2, str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void SetExternalDisplay$default(iu iuVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: SetExternalDisplay");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        iuVar.SetExternalDisplay(i2, lVar);
    }

    static final h.ab SetExternalDisplay$lambda$0(iu iuVar, int i2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).SetExternalDisplayNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void SetSocialIsFirstTime$default(iu iuVar, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: SetSocialIsFirstTime");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.SetSocialIsFirstTime(z, lVar);
    }

    static final h.ab SetSocialIsFirstTime$lambda$0(iu iuVar, boolean z) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).SetSocialIsFirstTimeNTV(z);
        return null;
    }

    static final void ShowEncouragementJNI$lambda$0(iu iuVar, QuestionProto questionProto) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).ShowEncouragement(questionProto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void SilentLogOut$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: SilentLogOut");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.SilentLogOut(lVar);
    }

    static final h.ab SilentLogOut$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).SilentLogOutNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void StopFollow$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: StopFollow");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.StopFollow(lVar);
    }

    static final h.ab StopFollow$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).StopFollowNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void UploadProfileImage$default(iu iuVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: UploadProfileImage");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.UploadProfileImage(str, lVar);
    }

    static final h.ab UploadProfileImage$lambda$0(iu iuVar, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).UploadProfileImageNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void auditReportConsentBumpAgreeClicked$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: auditReportConsentBumpAgreeClicked");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.auditReportConsentBumpAgreeClicked(lVar);
    }

    static final h.ab auditReportConsentBumpAgreeClicked$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).auditReportConsentBumpAgreeClickedNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void calendarRequestAccess$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calendarRequestAccess");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.calendarRequestAccess(lVar);
    }

    static final h.ab calendarRequestAccess$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).calendarRequestAccessNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void cancelMySosAlert$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelMySosAlert");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.cancelMySosAlert(lVar);
    }

    static final h.ab cancelMySosAlert$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).cancelMySosAlertNTV();
        return null;
    }

    public static /* synthetic */ void editTextDialogCallback$default(iu iuVar, String str, long j2, long j3, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: editTextDialogCallback");
        }
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        iuVar.editTextDialogCallback(str, j2, j3, lVar);
    }

    static final h.ab editTextDialogCallback$lambda$0(iu iuVar, String str, long j2, long j3) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).editTextDialogCallbackNTV(str, j2, j3);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchAutocompleteVenue$default(iu iuVar, LoadAutoCompleteVenueRequest loadAutoCompleteVenueRequest, CompletableDeferred completableDeferred, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAutocompleteVenue");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        iuVar.fetchAutocompleteVenue(loadAutoCompleteVenueRequest, completableDeferred, lVar);
    }

    static final h.ab fetchAutocompleteVenue$lambda$0(iu iuVar, LoadAutoCompleteVenueRequest loadAutoCompleteVenueRequest, CompletableDeferred completableDeferred) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).fetchAutocompleteVenueNTV(loadAutoCompleteVenueRequest != null ? loadAutoCompleteVenueRequest.toByteArray() : null, completableDeferred);
        return null;
    }

    static final void getCurrencyStringJNI$lambda$0(iu iuVar, GetCurrencyStringRequest getCurrencyStringRequest) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).getCurrencyString(getCurrencyStringRequest);
    }

    static final void getETALabelJNI$lambda$0(iu iuVar, EtaLabelRequest etaLabelRequest) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).getETALabel(etaLabelRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleDeepLink$default(iu iuVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleDeepLink");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.handleDeepLink(str, lVar);
    }

    static final Boolean handleDeepLink$lambda$0(iu iuVar, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        return Boolean.valueOf(((NativeManager) iuVar).handleDeepLinkNTV(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleDeepLinkImmediate$default(iu iuVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleDeepLinkImmediate");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.handleDeepLinkImmediate(str, lVar);
    }

    static final Boolean handleDeepLinkImmediate$lambda$0(iu iuVar, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        return Boolean.valueOf(((NativeManager) iuVar).handleDeepLinkImmediateNTV(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadServerEnv$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadServerEnv");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.loadServerEnv(lVar);
    }

    static final String loadServerEnv$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        return ((NativeManager) iuVar).loadServerEnvNTV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logAppLaunchAnalytics$default(iu iuVar, String str, String str2, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logAppLaunchAnalytics");
        }
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        iuVar.logAppLaunchAnalytics(str, str2, i2, lVar);
    }

    static final h.ab logAppLaunchAnalytics$lambda$0(iu iuVar, String str, String str2, int i2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).logAppLaunchAnalyticsNTV(str, str2, i2);
        return null;
    }

    static final void navigateFromDeepLinkJNI$lambda$0(iu iuVar, VenueOrPlace venueOrPlace, boolean z) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).navigateFromDeepLink(venueOrPlace, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void notifyOrientationChanged$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyOrientationChanged");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.notifyOrientationChanged(lVar);
    }

    static final h.ab notifyOrientationChanged$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).notifyOrientationChangedNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAppBackground$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAppBackground");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.onAppBackground(lVar);
    }

    static final h.ab onAppBackground$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        NativeManager nativeManager = (NativeManager) iuVar;
        if (Gateway.shouldPreventShutdown()) {
            return null;
        }
        nativeManager.onAppBackgroundNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAppForeground$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAppForeground");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.onAppForeground(lVar);
    }

    static final h.ab onAppForeground$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).onAppForegroundNTV();
        return null;
    }

    static final void onAutocompleteVenueLoadedJNI$lambda$0(iu iuVar, LoadAutoCompleteVenueResponse loadAutoCompleteVenueResponse, Object obj) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).onAutocompleteVenueLoaded(loadAutoCompleteVenueResponse, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onETALabelGenerated$default(iu iuVar, EtaLabelResponse etaLabelResponse, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onETALabelGenerated");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.onETALabelGenerated(etaLabelResponse, lVar);
    }

    static final h.ab onETALabelGenerated$lambda$0(iu iuVar, EtaLabelResponse etaLabelResponse) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).onETALabelGeneratedNTV(etaLabelResponse != null ? etaLabelResponse.toByteArray() : null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onGetCurrencyString$default(iu iuVar, GetCurrencyStringResponse getCurrencyStringResponse, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onGetCurrencyString");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.onGetCurrencyString(getCurrencyStringResponse, lVar);
    }

    static final h.ab onGetCurrencyString$lambda$0(iu iuVar, GetCurrencyStringResponse getCurrencyStringResponse) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).onGetCurrencyStringNTV(getCurrencyStringResponse != null ? getCurrencyStringResponse.toByteArray() : null);
        return null;
    }

    static final void onLogoutJNI$lambda$0(iu iuVar, boolean z) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).onLogout(z);
    }

    static final void onNativeLayerShutDownJNI$lambda$0(iu iuVar, boolean z) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).onNativeLayerShutDown(z);
    }

    static final void onSearchCategoryGroupsChangedJNI$lambda$0(iu iuVar, VenueCategoryGroups venueCategoryGroups) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).onSearchCategoryGroupsChanged(venueCategoryGroups);
    }

    static final void onUserCredentialsChangedJNI$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).onUserCredentialsChanged();
    }

    static final void openBeepPopupJNI$lambda$0(iu iuVar, RtAlertsThumbsUpDataProto rtAlertsThumbsUpDataProto, String str, int i2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).openBeepPopup(rtAlertsThumbsUpDataProto, str, i2);
    }

    static final void openExternalBrowserJNI$lambda$0(iu iuVar, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).openExternalBrowser(str);
    }

    static final void openFavoritesJNI$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).openFavorites();
    }

    static final void openInternalBrowserFromJniJNI$lambda$0(iu iuVar, String str, String str2, long j2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).openInternalBrowserFromJni(str, str2, j2);
    }

    static final void openPoiJNI$lambda$0(iu iuVar, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).openPoi(str);
    }

    static final void openProgressIconPopupJNI$lambda$0(iu iuVar, String str, MessageBoxIconProto messageBoxIconProto) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).openProgressIconPopup(str, messageBoxIconProto);
    }

    static final void preparePoiJNI$lambda$0(iu iuVar, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).preparePoi(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void randomUserMsg$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: randomUserMsg");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.randomUserMsg(lVar);
    }

    static final Boolean randomUserMsg$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        return Boolean.valueOf(((NativeManager) iuVar).randomUserMsgNTV());
    }

    static final void reloadPlatformStringsJNI$lambda$0(iu iuVar, String str, String str2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).reloadPlatformStrings(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportAlertPopupAction$default(iu iuVar, int i2, String str, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportAlertPopupAction");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        iuVar.reportAlertPopupAction(i2, str, lVar);
    }

    static final h.ab reportAlertPopupAction$lambda$0(iu iuVar, int i2, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).reportAlertPopupActionNTV(i2, str);
        return null;
    }

    public static /* synthetic */ void requestCalendarAccessCallback$default(iu iuVar, long j2, long j3, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestCalendarAccessCallback");
        }
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        iuVar.requestCalendarAccessCallback(j2, j3, z, lVar);
    }

    static final h.ab requestCalendarAccessCallback$lambda$0(iu iuVar, long j2, long j3, boolean z) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).requestCalendarAccessCallbackNTV(j2, j3, z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void resetEvents$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetEvents");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.resetEvents(lVar);
    }

    static final h.ab resetEvents$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).resetEventsNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void restorePoiFocus$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: restorePoiFocus");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.restorePoiFocus(lVar);
    }

    static final h.ab restorePoiFocus$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).restorePoiFocusNTV();
        return null;
    }

    static final void saveDestinationAsQuestionDataJNI$lambda$0(iu iuVar, double d2, double d3, String str, String str2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).saveDestinationAsQuestionData(d2, d3, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendThumbsDown$default(iu iuVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendThumbsDown");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        iuVar.sendThumbsDown(i2, lVar);
    }

    static final h.ab sendThumbsDown$lambda$0(iu iuVar, int i2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).sendThumbsDownNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendThumbsUp$default(iu iuVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendThumbsUp");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        iuVar.sendThumbsUp(i2, lVar);
    }

    static final h.ab sendThumbsUp$lambda$0(iu iuVar, int i2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).sendThumbsUpNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDebugToolsMenu$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDebugToolsMenu");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.showDebugToolsMenu(lVar);
    }

    static final h.ab showDebugToolsMenu$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).showDebugToolsMenuNTV();
        return null;
    }

    static final void showDetailsPopupJNI$lambda$0(iu iuVar, int i2, int i3, int i4, MapPopupNativeInfo.DetailsPopupInfo detailsPopupInfo) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).showDetailsPopup(i2, i3, i4, detailsPopupInfo);
    }

    static final void showNotificationMessageJNI$lambda$0(iu iuVar, NotificationMessage notificationMessage) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).showNotificationMessage(notificationMessage);
    }

    static final void startAutoDriveJNI$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).startAutoDrive();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateClientInfo$default(iu iuVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateClientInfo");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.updateClientInfo(str, lVar);
    }

    static final h.ab updateClientInfo$lambda$0(iu iuVar, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).updateClientInfoNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void venueAddImage$default(iu iuVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: venueAddImage");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        iuVar.venueAddImage(str, lVar);
    }

    static final h.ab venueAddImage$lambda$0(iu iuVar, String str) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).venueAddImageNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void venueDeleteImage$default(iu iuVar, String str, String str2, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: venueDeleteImage");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        iuVar.venueDeleteImage(str, str2, lVar);
    }

    static final h.ab venueDeleteImage$lambda$0(iu iuVar, String str, String str2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).venueDeleteImageNTV(str, str2);
        return null;
    }

    public static /* synthetic */ void venueFlag$default(iu iuVar, String str, int i2, String str2, String str3, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: venueFlag");
        }
        if ((i3 & 16) != 0) {
            lVar = null;
        }
        iuVar.venueFlag(str, i2, str2, str3, lVar);
    }

    static final h.ab venueFlag$lambda$0(iu iuVar, String str, int i2, String str2, String str3) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).venueFlagNTV(str, i2, str2, str3);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void venueFlagImage$default(iu iuVar, String str, String str2, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: venueFlagImage");
        }
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        iuVar.venueFlagImage(str, str2, i2, lVar);
    }

    static final h.ab venueFlagImage$lambda$0(iu iuVar, String str, String str2, int i2) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).venueFlagImageNTV(str, str2, i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void venueGet$default(iu iuVar, String str, int i2, boolean z, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: venueGet");
        }
        if ((i3 & 8) != 0) {
            lVar = null;
        }
        iuVar.venueGet(str, i2, z, lVar);
    }

    static final h.ab venueGet$lambda$0(iu iuVar, String str, int i2, boolean z) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).venueGetNTV(str, i2, z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void venueProviderGetCategoryGroups$default(iu iuVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: venueProviderGetCategoryGroups");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        iuVar.venueProviderGetCategoryGroups(lVar);
    }

    static final byte[] venueProviderGetCategoryGroups$lambda$0(iu iuVar) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        return ((NativeManager) iuVar).venueProviderGetCategoryGroupsNTV();
    }

    static final void venueProviderGetCategoryGroups$lambda$1(h.g.a.l lVar, byte[] bArr) {
        VenueCategoryGroups venueCategoryGroups = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                venueCategoryGroups = (VenueCategoryGroups) VenueCategoryGroups.parser().c(bArr);
            } catch (com.google.v.eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(venueCategoryGroups);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void venueSearch$default(iu iuVar, int i2, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: venueSearch");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        iuVar.venueSearch(i2, i3, lVar);
    }

    static final h.ab venueSearch$lambda$0(iu iuVar, int i2, int i3) {
        h.g.b.x.d(iuVar, "null cannot be cast to non-null type com.waze.NativeManager");
        ((NativeManager) iuVar).venueSearchNTV(i2, i3);
        return null;
    }

    public void BeepClosed(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new id(this, i2, 2), lVar != null ? new Cif(lVar, 15) : null);
    }

    public void CloseAllPopups(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new id(this, i2, 0), lVar != null ? new bb(lVar, 20) : null);
    }

    public void ConnectivityChanged(boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ic(this, z, 0), lVar != null ? new bb(lVar, 19) : null);
    }

    public void DeleteAccount(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 9), lVar != null ? new Cif(lVar, 13) : null);
    }

    public void GetSocialIsFirstTime(h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 13), lVar != null ? new il(lVar, 3) : null);
    }

    public void InitializeNativeManager(WazeApplicationInfo wazeApplicationInfo) {
        ((NativeManager) this).InitializeNativeManagerNTV(wazeApplicationInfo != null ? wazeApplicationInfo.toByteArray() : null);
    }

    protected final void OpenParkingSearchJNI() {
        NativeManager.runMainThreadTask(new ig(this, 2));
    }

    protected final boolean PlatformUrlHandlerJNI(String str) {
        return ((NativeManager) this).PlatformUrlHandler(str);
    }

    public void PopupShown(final int i2, final int i3, final int i4, final int i5, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.im
            @Override // com.waze.hw
            public final Object a() {
                iu.PopupShown$lambda$0(this.f24623a, i2, i3, i4, i5);
                return null;
            }
        }, lVar != null ? new il(lVar, 2) : null);
    }

    protected final void RoadClosureArrowSelectedJNI(final int i2, final int i3, final int i4) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.iq
            @Override // java.lang.Runnable
            public final void run() {
                iu.RoadClosureArrowSelectedJNI$lambda$0(this.f24815a, i2, i3, i4);
            }
        });
    }

    public void SetExternalApp(int i2, String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ij(this, i2, str, 1), lVar != null ? new Cif(lVar, 0) : null);
    }

    public void SetExternalDisplay(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new id(this, i2, 4), lVar != null ? new Cif(lVar, 19) : null);
    }

    public void SetSocialIsFirstTime(boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ic(this, z, 2), lVar != null ? new il(lVar, 8) : null);
    }

    protected final void ShowEncouragementJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "proto");
        try {
            NativeManager.runMainThreadTask(new bl(this, (QuestionProto) QuestionProto.parser().c(bArr), 18));
        } catch (com.google.v.eu unused) {
        }
    }

    public void SilentLogOut(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 14), lVar != null ? new il(lVar, 5) : null);
    }

    public void StopFollow(h.g.a.l<? super h.ab, h.ab> lVar) {
        int i2 = 8;
        NativeManager.runNativeTask(new ba(this, i2), lVar != null ? new Cif(lVar, i2) : null);
    }

    public void UploadProfileImage(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, str, 4), lVar != null ? new Cif(lVar, 5) : null);
    }

    public void auditReportConsentBumpAgreeClicked(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 11), lVar != null ? new il(lVar, 0) : null);
    }

    public boolean calendarAuthUndetermined() {
        return ((NativeManager) this).calendarAuthUndeterminedNTV();
    }

    public boolean calendarAuthorized() {
        return ((NativeManager) this).calendarAuthorizedNTV();
    }

    public void calendarRequestAccess(h.g.a.l<? super h.ab, h.ab> lVar) {
        int i2 = 7;
        NativeManager.runNativeTask(new ba(this, i2), lVar != null ? new Cif(lVar, i2) : null);
    }

    public void cancelMySosAlert(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 16), lVar != null ? new il(lVar, 6) : null);
    }

    public NativeManager.HOVPermitDescriptor[] configGetHOVPermitDescriptors() {
        return ((NativeManager) this).configGetHOVPermitDescriptorsNTV();
    }

    public void editTextDialogCallback(final String str, final long j2, final long j3, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.is
            @Override // com.waze.hw
            public final Object a() {
                iu.editTextDialogCallback$lambda$0(this.f24824a, str, j2, j3);
                return null;
            }
        }, lVar != null ? new il(lVar, 13) : null);
    }

    public void fetchAutocompleteVenue(LoadAutoCompleteVenueRequest loadAutoCompleteVenueRequest, CompletableDeferred<com.waze.av.b.n> completableDeferred, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ie(this, loadAutoCompleteVenueRequest, completableDeferred, 1), lVar != null ? new bb(lVar, 16) : null);
    }

    protected final String generateUUIDJNI() {
        return ((NativeManager) this).generateUUID();
    }

    protected final byte[] getClientInfoProtobufJNI() {
        return ((NativeManager) this).getClientInfoProtobuf();
    }

    protected final void getCurrencyStringJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "request");
        try {
            NativeManager.runMainThreadTask(new bl(this, (GetCurrencyStringRequest) GetCurrencyStringRequest.parser().c(bArr), 16));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void getETALabelJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "request");
        try {
            NativeManager.runMainThreadTask(new bl(this, (EtaLabelRequest) EtaLabelRequest.parser().c(bArr), 12));
        } catch (com.google.v.eu unused) {
        }
    }

    public String getEncImagePath(String str) {
        String encImagePathNTV = ((NativeManager) this).getEncImagePathNTV(str);
        h.g.b.x.e(encImagePathNTV, "getEncImagePathNTV(...)");
        return encImagePathNTV;
    }

    public String getServerEnv() {
        return ((NativeManager) this).getServerEnvNTV();
    }

    public void handleDeepLink(String str, h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, str, 7), lVar != null ? new Cif(lVar, 11) : null);
    }

    public void handleDeepLinkImmediate(String str, h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, str, 5), lVar != null ? new Cif(lVar, 6) : null);
    }

    public boolean isCsvSimulatorActive() {
        return ((NativeManager) this).isCsvSimulatorActiveNTV();
    }

    protected final boolean isMainActivityJNI() {
        return ((NativeManager) this).isMainActivity();
    }

    public boolean isNear() {
        return ((NativeManager) this).isNearNTV();
    }

    public void loadServerEnv(h.g.a.l<? super String, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 4), lVar != null ? new bb(lVar, 18) : null);
    }

    public void logAppLaunchAnalytics(String str, String str2, int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ir(this, str, str2, i2, 1), lVar != null ? new Cif(lVar, 10) : null);
    }

    protected final void navigateFromDeepLinkJNI(byte[] bArr, final boolean z) {
        h.g.b.x.f(bArr, "venueOrPlace");
        try {
            final VenueOrPlace venueOrPlace = (VenueOrPlace) VenueOrPlace.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.ih
                @Override // java.lang.Runnable
                public final void run() {
                    iu.navigateFromDeepLinkJNI$lambda$0(this.f24605a, venueOrPlace, z);
                }
            });
        } catch (com.google.v.eu unused) {
        }
    }

    public void notifyOrientationChanged(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 18), lVar != null ? new il(lVar, 10) : null);
    }

    public void onAppBackground(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 6), lVar != null ? new Cif(lVar, 3) : null);
    }

    public void onAppForeground(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 12), lVar != null ? new il(lVar, 1) : null);
    }

    protected final void onAutocompleteVenueLoadedJNI(byte[] bArr, Object obj) {
        h.g.b.x.f(bArr, "responseProto");
        try {
            NativeManager.runMainThreadTask(new ft(this, (LoadAutoCompleteVenueResponse) LoadAutoCompleteVenueResponse.parser().c(bArr), obj, 4));
        } catch (com.google.v.eu unused) {
        }
    }

    public void onETALabelGenerated(EtaLabelResponse etaLabelResponse, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, etaLabelResponse, 3), lVar != null ? new Cif(lVar, 4) : null);
    }

    public void onGetCurrencyString(GetCurrencyStringResponse getCurrencyStringResponse, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, getCurrencyStringResponse, 9), lVar != null ? new Cif(lVar, 14) : null);
    }

    protected final void onLogoutJNI(boolean z) {
        NativeManager.runMainThreadTask(new gl(this, z, 4));
    }

    protected final void onNativeLayerShutDownJNI(boolean z) {
        NativeManager.runMainThreadTask(new gl(this, z, 3));
    }

    protected final void onProfileResetJNI() {
        ((NativeManager) this).onProfileReset();
    }

    protected final void onProfileUpdatedJNI(byte[] bArr) {
        ((NativeManager) this).onProfileUpdated(bArr);
    }

    protected final void onSearchCategoryGroupsChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "categoryGroups");
        try {
            NativeManager.runMainThreadTask(new bl(this, (VenueCategoryGroups) VenueCategoryGroups.parser().c(bArr), 13));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onUserCredentialsChangedJNI() {
        NativeManager.runMainThreadTask(new ig(this, 0));
    }

    protected final void openBeepPopupJNI(byte[] bArr, String str, int i2) {
        h.g.b.x.f(bArr, "thumbsUpDataProto");
        try {
            NativeManager.runMainThreadTask(new fw(this, (RtAlertsThumbsUpDataProto) RtAlertsThumbsUpDataProto.parser().c(bArr), str, i2, 2));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void openExternalBrowserJNI(String str) {
        h.g.b.x.f(str, "url");
        NativeManager.runMainThreadTask(new bl(this, str, 17));
    }

    protected final void openFavoritesJNI() {
        NativeManager.runMainThreadTask(new ig(this, 3));
    }

    protected final void openInternalBrowserFromJniJNI(String str, String str2, long j2) {
        h.g.b.x.f(str, "aTitle");
        h.g.b.x.f(str2, "aUrl");
        NativeManager.runMainThreadTask(new ii(this, str, str2, j2, 0));
    }

    protected final void openPoiJNI(String str) {
        NativeManager.runMainThreadTask(new bl(this, str, 14));
    }

    protected final void openProgressIconPopupJNI(String str, int i2) {
        MessageBoxIconProto messageBoxIconProtoForNumber = MessageBoxIconProto.forNumber(i2);
        if (messageBoxIconProtoForNumber == null) {
            messageBoxIconProtoForNumber = MessageBoxIconProto.UNRECOGNIZED;
        }
        NativeManager.runMainThreadTask(new ft(this, str, messageBoxIconProtoForNumber, 5));
    }

    protected final void preparePoiJNI(String str) {
        NativeManager.runMainThreadTask(new bl(this, str, 15));
    }

    public void randomUserMsg(h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 17), lVar != null ? new il(lVar, 7) : null);
    }

    protected final void reloadPlatformStringsJNI(String str, String str2) {
        NativeManager.runMainThreadTask(new ft(this, str, str2, 3));
    }

    public void reportAlertPopupAction(int i2, String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ij(this, i2, str, 0), lVar != null ? new Cif(lVar, 18) : null);
    }

    public void requestCalendarAccessCallback(final long j2, final long j3, final boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.ib
            @Override // com.waze.hw
            public final Object a() {
                iu.requestCalendarAccessCallback$lambda$0(this.f24442a, j2, j3, z);
                return null;
            }
        }, lVar != null ? new bb(lVar, 17) : null);
    }

    public void resetEvents(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 19), lVar != null ? new il(lVar, 12) : null);
    }

    public void restorePoiFocus(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 10), lVar != null ? new Cif(lVar, 16) : null);
    }

    protected final void saveDestinationAsQuestionDataJNI(final double d2, final double d3, final String str, final String str2) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.io
            @Override // java.lang.Runnable
            public final void run() {
                iu.saveDestinationAsQuestionDataJNI$lambda$0(this.f24804a, d2, d3, str, str2);
            }
        });
    }

    public void sendThumbsDown(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new id(this, i2, 3), lVar != null ? new Cif(lVar, 17) : null);
    }

    public void sendThumbsUp(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new id(this, i2, 1), lVar != null ? new bb(lVar, 15) : null);
    }

    public void setAndroidAutoMode(boolean z) {
        ((NativeManager) this).setAndroidAutoModeNTV(z);
    }

    public void showDebugToolsMenu(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 5), lVar != null ? new Cif(lVar, 1) : null);
    }

    protected final void showDetailsPopupJNI(int i2, int i3, int i4, byte[] bArr) {
        h.g.b.x.f(bArr, "popupNativeInfo");
        try {
            NativeManager.runMainThreadTask(new ip(this, i2, i3, i4, (MapPopupNativeInfo.DetailsPopupInfo) MapPopupNativeInfo.DetailsPopupInfo.parser().c(bArr), 0));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void showNotificationMessageJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "notificationMessage");
        try {
            NativeManager.runMainThreadTask(new bl(this, (NotificationMessage) NotificationMessage.parser().c(bArr), 11));
        } catch (com.google.v.eu unused) {
        }
    }

    public String speedUnit() {
        String strSpeedUnitNTV = ((NativeManager) this).speedUnitNTV();
        h.g.b.x.e(strSpeedUnitNTV, "speedUnitNTV(...)");
        return strSpeedUnitNTV;
    }

    protected final void startAutoDriveJNI() {
        NativeManager.runMainThreadTask(new ig(this, 1));
    }

    public void stopNavigation() {
        ((NativeManager) this).stopNavigationNTV();
    }

    public void stopTripServerNavigation() {
        ((NativeManager) this).stopTripServerNavigationNTV();
    }

    public void updateClientInfo(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, str, 8), lVar != null ? new Cif(lVar, 12) : null);
    }

    public void venueAddImage(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new gg(this, str, 6), lVar != null ? new Cif(lVar, 9) : null);
    }

    public void venueDeleteImage(String str, String str2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ie(this, str, str2, 0), lVar != null ? new Cif(lVar, 2) : null);
    }

    public void venueFlag(final String str, final int i2, final String str2, final String str3, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.it
            @Override // com.waze.hw
            public final Object a() {
                iu.venueFlag$lambda$0(this.f24828a, str, i2, str2, str3);
                return null;
            }
        }, lVar != null ? new bb(lVar, 14) : null);
    }

    public void venueFlagImage(String str, String str2, int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ir(this, str, str2, i2, 0), lVar != null ? new il(lVar, 11) : null);
    }

    public void venueGet(final String str, final int i2, final boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.ik
            @Override // com.waze.hw
            public final Object a() {
                iu.venueGet$lambda$0(this.f24617a, str, i2, z);
                return null;
            }
        }, lVar != null ? new Cif(lVar, 20) : null);
    }

    public void venueProviderGetCategoryGroups(h.g.a.l<? super VenueCategoryGroups, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, 15), new il(lVar, 9));
    }

    public void venueSearch(int i2, int i3, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new in(this, i2, i3, 0), lVar != null ? new il(lVar, 4) : null);
    }

    public final void venueProviderGetCategoryGroups() {
        venueProviderGetCategoryGroups$default(this, null, 1, null);
    }

    public final void calendarRequestAccess() {
        calendarRequestAccess$default(this, null, 1, null);
    }

    public final void SetExternalApp(int i2, String str) {
        SetExternalApp$default(this, i2, str, null, 4, null);
    }

    public final void StopFollow() {
        StopFollow$default(this, null, 1, null);
    }

    public final void UploadProfileImage(String str) {
        UploadProfileImage$default(this, str, null, 2, null);
    }

    public final void handleDeepLinkImmediate(String str) {
        handleDeepLinkImmediate$default(this, str, null, 2, null);
    }

    public final void onAppBackground() {
        onAppBackground$default(this, null, 1, null);
    }

    public final void onETALabelGenerated(EtaLabelResponse etaLabelResponse) {
        onETALabelGenerated$default(this, etaLabelResponse, null, 2, null);
    }

    public final void showDebugToolsMenu() {
        showDebugToolsMenu$default(this, null, 1, null);
    }

    public final void venueDeleteImage(String str, String str2) {
        venueDeleteImage$default(this, str, str2, null, 4, null);
    }

    public final void venueGet(String str, int i2, boolean z) {
        venueGet$default(this, str, i2, z, null, 8, null);
    }

    public final void venueSearch(int i2, int i3) {
        venueSearch$default(this, i2, i3, null, 4, null);
    }

    public final void BeepClosed(int i2) {
        BeepClosed$default(this, i2, null, 2, null);
    }

    public final void CloseAllPopups(int i2) {
        CloseAllPopups$default(this, i2, null, 2, null);
    }

    public final void ConnectivityChanged(boolean z) {
        ConnectivityChanged$default(this, z, null, 2, null);
    }

    public final void GetSocialIsFirstTime() {
        GetSocialIsFirstTime$default(this, null, 1, null);
    }

    public final void SetExternalDisplay(int i2) {
        SetExternalDisplay$default(this, i2, null, 2, null);
    }

    public final void SetSocialIsFirstTime(boolean z) {
        SetSocialIsFirstTime$default(this, z, null, 2, null);
    }

    public final void SilentLogOut() {
        SilentLogOut$default(this, null, 1, null);
    }

    public final void auditReportConsentBumpAgreeClicked() {
        auditReportConsentBumpAgreeClicked$default(this, null, 1, null);
    }

    public final void cancelMySosAlert() {
        cancelMySosAlert$default(this, null, 1, null);
    }

    public final void fetchAutocompleteVenue(LoadAutoCompleteVenueRequest loadAutoCompleteVenueRequest, CompletableDeferred<com.waze.av.b.n> completableDeferred) {
        fetchAutocompleteVenue$default(this, loadAutoCompleteVenueRequest, completableDeferred, null, 4, null);
    }

    public final void handleDeepLink(String str) {
        handleDeepLink$default(this, str, null, 2, null);
    }

    public final void loadServerEnv() {
        loadServerEnv$default(this, null, 1, null);
    }

    public final void onAppForeground() {
        onAppForeground$default(this, null, 1, null);
    }

    public final void randomUserMsg() {
        randomUserMsg$default(this, null, 1, null);
    }

    public final void reportAlertPopupAction(int i2, String str) {
        reportAlertPopupAction$default(this, i2, str, null, 4, null);
    }

    public final void sendThumbsDown(int i2) {
        sendThumbsDown$default(this, i2, null, 2, null);
    }

    public final void sendThumbsUp(int i2) {
        sendThumbsUp$default(this, i2, null, 2, null);
    }

    public final void venueAddImage(String str) {
        venueAddImage$default(this, str, null, 2, null);
    }

    public final void DeleteAccount() {
        DeleteAccount$default(this, null, 1, null);
    }

    public final void notifyOrientationChanged() {
        notifyOrientationChanged$default(this, null, 1, null);
    }

    public final void onGetCurrencyString(GetCurrencyStringResponse getCurrencyStringResponse) {
        onGetCurrencyString$default(this, getCurrencyStringResponse, null, 2, null);
    }

    public final void resetEvents() {
        resetEvents$default(this, null, 1, null);
    }

    public final void restorePoiFocus() {
        restorePoiFocus$default(this, null, 1, null);
    }

    public final void updateClientInfo(String str) {
        updateClientInfo$default(this, str, null, 2, null);
    }

    public final void PopupShown(int i2, int i3, int i4, int i5) {
        PopupShown$default(this, i2, i3, i4, i5, null, 16, null);
    }

    public final void editTextDialogCallback(String str, long j2, long j3) {
        editTextDialogCallback$default(this, str, j2, j3, null, 8, null);
    }

    public final void requestCalendarAccessCallback(long j2, long j3, boolean z) {
        requestCalendarAccessCallback$default(this, j2, j3, z, null, 8, null);
    }

    public final void logAppLaunchAnalytics(String str, String str2, int i2) {
        logAppLaunchAnalytics$default(this, str, str2, i2, null, 8, null);
    }

    public final void venueFlag(String str, int i2, String str2, String str3) {
        venueFlag$default(this, str, i2, str2, str3, null, 16, null);
    }

    public final void venueFlagImage(String str, String str2, int i2) {
        venueFlagImage$default(this, str, str2, i2, null, 8, null);
    }
}
