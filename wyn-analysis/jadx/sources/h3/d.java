package h3;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import com.google.android.gms.ads.MobileAds;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i5) {
        super(topicsManager);
        this.f36048b = i5;
    }

    @Override // h3.g
    public GetTopicsRequest a(C2773a request) {
        switch (this.f36048b) {
            case 1:
                AbstractC3340k.e(request, "request");
                GetTopicsRequest getTopicsRequestBuild = e.h().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(request.f36043a).build();
                AbstractC3340k.d(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild;
            default:
                return super.a(request);
        }
    }
}
