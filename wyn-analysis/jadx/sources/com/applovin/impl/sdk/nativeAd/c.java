package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.i5;
import org.json.JSONArray;
import t.InterfaceC4035a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC4035a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23146b;

    public /* synthetic */ c(Object obj, int i5) {
        this.f23145a = i5;
        this.f23146b = obj;
    }

    @Override // t.InterfaceC4035a
    public final Object apply(Object obj) {
        switch (this.f23145a) {
            case 0:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getCustomTabsNavigationAbortedPostbacks$6((i5) obj);
            case 1:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getOpenMeasurementVerificationScriptResources$10((JSONArray) obj);
            case 2:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getDirectClickTrackingPostbacks$9((i5) obj);
            case 3:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getCustomTabsNavigationFinishedPostbacks$4((i5) obj);
            case 4:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getCustomTabsNavigationFailedPostbacks$5((i5) obj);
            case 5:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getCustomTabsHeaders$2((i5) obj);
            case 6:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getCustomTabsTabShownPostbacks$7((i5) obj);
            case 7:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getCustomTabsTabHiddenPostbacks$8((i5) obj);
            case 8:
                return ((AppLovinNativeAdImpl) this.f23146b).lambda$getCustomTabsNavigationStartedPostbacks$3((i5) obj);
            default:
                return AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$11((c) this.f23146b, (i5) obj);
        }
    }
}
