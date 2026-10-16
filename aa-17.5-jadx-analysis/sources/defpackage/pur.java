package defpackage;

import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pur {
    public static final ygr a = ygr.t("com.google.maps.gmm.AddressDataFeedbackRequest", "aail", "aaio", "com.google.maps.gmm.CallAskMapsAgentRequest", "aaip", "aaiq", "aaiv", "aaiw", "com.google.maps.gmm.CreateLocationAlertRequest", "aaix", "aaiz", "com.google.maps.gmm.CreateShareableUrlRequest", "aaja", "aajb", "aajc", "aajd", "aajf", "aajg", "com.google.maps.gmm.DeleteLocationAlertRequest", "aajh", "aaji", "aajk", "aajl", "aajm", "com.google.maps.gmm.DeleteSearchHistorySuggestRequest", "aajn", "aajo", "com.google.maps.gmm.DeleteUserFactualEditRequest", "aajp", "com.google.maps.gmm.DisambiguateMapEditIntentRequest", "aajq", "aajr", "aajs", "com.google.maps.gmm.EditCreatorProfileRequest", "com.google.maps.gmm.EditMerchantMediaItemRequest", "aajt", "aaju", "aajv", "aajw", "aajx", "aajz", "com.google.maps.gmm.GetAddressEditingCountryMetadataRequest", "aaka", "aakb", "aakc", "com.google.maps.gmm.GetBuildingEntranceEditingDataRequest", "aakd", "aake", "aakf", "aakg", "aakh", "aaki", "aakj", "aakk", "aakl", "aakm", "com.google.maps.gmm.GetCreatorProfileRequest", "aakn", "aako", "aakr", "aaks", "aakt", "aakv", "aakw", "com.google.maps.gmm.GetFacadesByS2CellsRequest", "aakx", "aaky", "aakz", "aala", "aald", "com.google.maps.gmm.GetKnowBeforeYouGoSummariesRequest", "aale", "aalf", "aalg", "aalh", "aali", "com.google.maps.gmm.GetMidTripUgcImpactRequest", "aalj", "aalk", "aalm", "aalp", "com.google.maps.gmm.GetPlaceInsightsRequest", "com.google.maps.gmm.GetPostTripQuestionsRequest", "aals", "com.google.maps.gmm.GetRiddlerFamiliarPlacesRequest", "aalu", "aalv", "aaly", "aalz", "aama", "aamb", "aamc", "aamd", "aame", "aamf", "aamg", "aamh", "aami", "aamj", "aamk", "aaml", "aamm", "aamn", "aamo", "aamp", "com.google.maps.gmm.GetUserMotivationContentRequest", "aamq", "aamr", "aams", "com.google.maps.gmm.ListAddressEditingChildSubregionsRequest", "com.google.maps.gmm.ListAddressEditingCountriesRequest", "aamw", "aamx", "aamy", "aamz", "aana", "aanb", "aand", "aane", "aanf", "aang", "aanh", "aani", "aanj", "com.google.maps.gmm.ListRiddlerQuestionsDeidentifiedRequest", "com.google.maps.gmm.ListRiddlerQuestionsRequest", "aank", "aanl", "aanm", "aano", "aanp", "aanr", "aans", "aant", "aanv", "aanz", "aaoa", "aaob", "com.google.maps.gmm.LocationSharingUploadLocationRequest", "aaoh", "com.google.maps.gmm.OfflineGetDataViewRequest", "aaol", "com.google.maps.gmm.PhotoVoteRequest", "aaor", "aaot", "aaou", "aaov", "aaow", "aaox", "aaoz", "aapa", "com.google.maps.gmm.ReportTransitIncidentRequest", "aapb", "aape", "aapf", "aapg", "com.google.maps.gmm.SendPostTripNotificationRequest", "aaph", "com.google.maps.gmm.StartBulkDeleteContributionsRequest", "aapk", "aapl", "aapm", "com.google.maps.gmm.SuggestEditByChatRequest", "aaps", "aapt", "aaqa", "aaqf", "aaqg", "com.google.maps.gmm.TransitLinesRequest", "aaql", "aaqm", "aaqo", "aaqp", "aaqq", "aaqr", "aaqs", "com.google.maps.gmm.UpdateLocationAlertRequest", "aaqt", "aaqu", "aaqv", "aaqw", "aaqx", "aaqy", "aaqz", "aara", "aarb", "aarc", "aare", "aarf", "aarg", "aarh", "aari", "com.google.maps.gmm.WritePostTripAnswerRequest", "com.google.wireless.googlenav.proto.AliasStickerRequestProto", "accg", "aced", "com.google.wireless.googlenav.proto.OfflineGetRegionSizeRequest$OfflineGetRegionSizeRequestProto", "com.google.wireless.googlenav.proto.RiddlerFollowOnRequest$RiddlerFollowOnRequestProto", "acfq", "acfz", "acge", "acgn", "acgp", "com.google.wireless.googlenav.proto.UserContributionsRequest$UserContributionsRequestProto", "com.google.wireless.googlenav.proto.UserPrefsReadRequest$UserPrefsReadRequestProto", "com.google.wireless.googlenav.proto.UserPrefsWriteRequest$UserPrefsWriteRequestProto");
    public volatile ygr b;
    public volatile ygr c;
    public volatile WeakReference d;
    public final aezk e;

    static {
        yfy.r(new AbstractMap.SimpleImmutableEntry("acbj", "google.internal.mothership.maps.mobilemaps.v1.MobileMapsService"));
        ygr.t("aany", "acbg", "acck", "acdl", "acfu", "acgd", "achm", "achp", "achv", "aciz", "acjb", "acjf");
        new ymp("acgc");
    }

    public pur(aezk aezkVar) {
        yly ylyVar = yly.a;
        this.b = ylyVar;
        this.c = ylyVar;
        this.d = new WeakReference(null);
        this.e = aezkVar;
    }

    public static ygr a(aaoi aaoiVar) {
        ygp ygpVar = new ygp();
        Iterator<T> it = new abof(aaoiVar.c, aaoi.a).iterator();
        while (it.hasNext()) {
            ygpVar.c(lws.H((accb) it.next()));
        }
        return ygpVar.g();
    }
}
