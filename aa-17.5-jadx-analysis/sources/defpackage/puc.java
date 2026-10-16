package defpackage;

/* loaded from: classes2.dex */
final class puc {
    private static final yfy a;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(pvh.class, new vky("HttpRequest"));
        yfuVar.e(aakk.class, new vky("GetContributorZoneContentRequest"));
        yfuVar.e(aalq.class, new vky("GetPlacePreviewRequest"));
        yfuVar.e(aalw.class, new vky("GetSearchResultPreviewRequest"));
        yfuVar.e(aami.class, new vky("GetTransitAttributeQuestionsRequest"));
        yfuVar.e(aamj.class, new vky("GetTransitPolylinesRequest"));
        yfuVar.e(aape.class, new vky("SearchTransitStationsRequest"));
        yfuVar.e(aaqk.class, new vky("TransitStationRequest"));
        yfuVar.e(abgh.class, new vky("PaintParameterRequest"));
        yfuVar.e(acbj.class, new vky("AppStartRequestProto"));
        yfuVar.e(accs.class, new vky("GunsRegisterDeviceRequestProto"));
        yfuVar.e(aaom.class, new vky("PassiveAssistRequestProto"));
        yfuVar.e(abgj.class, new vky("PaintRequest"));
        yfuVar.e(acfz.class, new vky("TactileUpdateAliasRequestProto"));
        yfuVar.e(aapz.class, new vky("TactilePlaceDetailsRequestProto"));
        yfuVar.e(acgc.class, new vky("TactileDirectionsRequestProto"));
        yfuVar.e(aapr.class, new vky("TactileLocationDetailsRequestProto"));
        yfuVar.e(acge.class, new vky("TactilePhotoRequestProto"));
        yfuVar.e(acgf.class, new vky("TactileSearchRequestProto"));
        yfuVar.e(acgg.class, new vky("TactileSuggestRequestProto"));
        yfuVar.e(acgm.class, new vky("TodoListRequestProto"));
        yfuVar.e(aard.class, new vky("UserInfoRequest"));
        yfuVar.e(achv.class, new vky("ResourceRequestProto"));
        yfuVar.e(aciz.class, new vky("SyncRequestProto"));
        yfuVar.e(aakt.class, new vky("GetEvTripWaypointsRequest"));
        a = yfuVar.d(true);
    }

    static vky a(Class cls) {
        vky vkyVar = (vky) a.get(cls);
        return vkyVar == null ? vky.c(null, cls) : vkyVar;
    }
}
