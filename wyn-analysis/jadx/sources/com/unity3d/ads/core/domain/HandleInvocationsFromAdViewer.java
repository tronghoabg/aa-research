package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.network.model.RequestType;
import ef.C2527k;
import ff.AbstractC2640A;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "invoke", "", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", HandleInvocationsFromAdViewer.KEY_AD_DATA, HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {

    @NotNull
    public static final String KEY_ACTION = "action";

    @NotNull
    public static final String KEY_AD_DATA = "adData";

    @NotNull
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";

    @NotNull
    public static final String KEY_AD_REFRESH_INVALIDATION_REASON = "invalidationReason";

    @NotNull
    public static final String KEY_AD_STRING = "adString";

    @NotNull
    public static final String KEY_AD_TYPE = "type";

    @NotNull
    public static final String KEY_AD_UNIT_ID = "adUnitId";

    @NotNull
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";

    @NotNull
    public static final String KEY_DOWNLOAD_URL = "url";

    @NotNull
    public static final String KEY_EXTRAS = "extras";

    @NotNull
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";

    @NotNull
    public static final String KEY_IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";

    @NotNull
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";

    @NotNull
    public static final String KEY_LOAD_OPTIONS = "loadOptions";

    @NotNull
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";

    @NotNull
    public static final String KEY_OMID = "openMeasurement";

    @NotNull
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";

    @NotNull
    public static final String KEY_OMJS_SESSION = "sessionFilePath";

    @NotNull
    public static final String KEY_OM_PARTNER = "partnerName";

    @NotNull
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";

    @NotNull
    public static final String KEY_OM_VERSION = "version";

    @NotNull
    public static final String KEY_PACKAGE_NAME = "packageName";

    @NotNull
    public static final String KEY_PLACEMENT_ID = "placementId";

    @NotNull
    public static final String KEY_PLACEMENT_NAME = "placementName";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";

    @NotNull
    public static final String KEY_QUERY_ID = "queryId";

    @NotNull
    public static final String KEY_TRACKING_TOKEN = "trackingToken";

    @NotNull
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";

    @NotNull
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements tf.a {
        final /* synthetic */ String $adDataObject;
        final /* synthetic */ String $adDataRefreshTokenObject;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ String $impressionConfigObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, AdObject adObject) {
            super(0);
            this.$adDataObject = str;
            this.$impressionConfigObject = str2;
            this.$adDataRefreshTokenObject = str3;
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            IServicesRegistry registry = HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry();
            I i5 = H.f39741a;
            return CommonAdViewerExposedFunctionsKt.m277getAdContextyLuu4LI((AndroidGetAdPlayerContext) registry.getService("", i5.getOrCreateKotlinClass(AndroidGetAdPlayerContext.class)), this.$adDataObject, this.$impressionConfigObject, this.$adDataRefreshTokenObject, (IsOMActivated) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", i5.getOrCreateKotlinClass(IsOMActivated.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$10, reason: invalid class name */
    public static final class AnonymousClass10 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.writeStorage();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$11, reason: invalid class name */
    public static final class AnonymousClass11 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.readStorage();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$12, reason: invalid class name */
    public static final class AnonymousClass12 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        public AnonymousClass12() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.deleteStorage();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$13, reason: invalid class name */
    public static final class AnonymousClass13 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.clearStorage();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$14, reason: invalid class name */
    public static final class AnonymousClass14 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        public AnonymousClass14() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getKeysStorage();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$15, reason: invalid class name */
    public static final class AnonymousClass15 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        public AnonymousClass15() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getStorage();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$16, reason: invalid class name */
    public static final class AnonymousClass16 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        public AnonymousClass16() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.setStorage();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$17, reason: invalid class name */
    public static final class AnonymousClass17 extends AbstractC3343n implements tf.a {
        public AnonymousClass17() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$18, reason: invalid class name */
    public static final class AnonymousClass18 extends AbstractC3343n implements tf.a {
        public AnonymousClass18() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$19, reason: invalid class name */
    public static final class AnonymousClass19 extends AbstractC3343n implements tf.a {
        public AnonymousClass19() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements tf.a {
        public AnonymousClass2() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$20, reason: invalid class name */
    public static final class AnonymousClass20 extends AbstractC3343n implements tf.a {
        public AnonymousClass20() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$21, reason: invalid class name */
    public static final class AnonymousClass21 extends AbstractC3343n implements tf.a {
        public AnonymousClass21() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$22, reason: invalid class name */
    public static final class AnonymousClass22 extends AbstractC3343n implements tf.a {
        public AnonymousClass22() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$23, reason: invalid class name */
    public static final class AnonymousClass23 extends AbstractC3343n implements tf.a {
        public AnonymousClass23() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$24, reason: invalid class name */
    public static final class AnonymousClass24 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass24(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(CampaignRepository.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$25, reason: invalid class name */
    public static final class AnonymousClass25 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass25(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(Refresh.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$26, reason: invalid class name */
    public static final class AnonymousClass26 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass26(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(CampaignRepository.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$27, reason: invalid class name */
    public static final class AnonymousClass27 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass27(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.updateTrackingToken(this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$28, reason: invalid class name */
    public static final class AnonymousClass28 extends AbstractC3343n implements tf.a {
        public AnonymousClass28() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$29, reason: invalid class name */
    public static final class AnonymousClass29 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass29(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SendDiagnosticEvent.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3343n implements tf.a {
        public AnonymousClass3() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$30, reason: invalid class name */
    public static final class AnonymousClass30 extends AbstractC3343n implements tf.a {
        public AnonymousClass30() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$31, reason: invalid class name */
    public static final class AnonymousClass31 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass31(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            IServicesRegistry registry = HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry();
            I i5 = H.f39741a;
            return CommonAdViewerExposedFunctionsKt.download((CacheFile) registry.getService("", i5.getOrCreateKotlinClass(CacheFile.class)), this.$adObject, (SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", i5.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$32, reason: invalid class name */
    public static final class AnonymousClass32 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass32(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.downloadWithProgress((CacheFile) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(CacheFile.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$33, reason: invalid class name */
    public static final class AnonymousClass33 extends AbstractC3343n implements tf.a {
        public AnonymousClass33() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(GetIsFileCache.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$34, reason: invalid class name */
    public static final class AnonymousClass34 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass34(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(AndroidOmInteraction.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$35, reason: invalid class name */
    public static final class AnonymousClass35 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass35(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(OmFinishSession.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$36, reason: invalid class name */
    public static final class AnonymousClass36 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass36(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(OmImpressionOccurred.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$37, reason: invalid class name */
    public static final class AnonymousClass37 extends AbstractC3343n implements tf.a {
        public AnonymousClass37() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(GetOmData.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$38, reason: invalid class name */
    public static final class AnonymousClass38 extends AbstractC3343n implements tf.a {
        public AnonymousClass38() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(AndroidAttribution.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$39, reason: invalid class name */
    public static final class AnonymousClass39 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass39(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(AndroidAttribution.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$4, reason: invalid class name */
    public static final class AnonymousClass4 extends AbstractC3343n implements tf.a {
        public AnonymousClass4() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$40, reason: invalid class name */
    public static final class AnonymousClass40 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass40(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(AndroidAttribution.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$41, reason: invalid class name */
    public static final class AnonymousClass41 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass41(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.loadScarAd((LoadScarAd) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(LoadScarAd.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$42, reason: invalid class name */
    public static final class AnonymousClass42 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass42 INSTANCE = new AnonymousClass42();

        public AnonymousClass42() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.showScarAd();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$43, reason: invalid class name */
    public static final class AnonymousClass43 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass43(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$44, reason: invalid class name */
    public static final class AnonymousClass44 extends AbstractC3343n implements tf.a {
        public AnonymousClass44() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$45, reason: invalid class name */
    public static final class AnonymousClass45 extends AbstractC3343n implements tf.a {
        public AnonymousClass45() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$46, reason: invalid class name */
    public static final class AnonymousClass46 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass46(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(LoadOfferwallAd.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$47, reason: invalid class name */
    public static final class AnonymousClass47 extends AbstractC3343n implements tf.a {
        public static final AnonymousClass47 INSTANCE = new AnonymousClass47();

        public AnonymousClass47() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$48, reason: invalid class name */
    public static final class AnonymousClass48 extends AbstractC3343n implements tf.a {
        public AnonymousClass48() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(GetIsOfferwallAdReady.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$49, reason: invalid class name */
    public static final class AnonymousClass49 extends AbstractC3343n implements tf.a {
        public AnonymousClass49() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$5, reason: invalid class name */
    public static final class AnonymousClass5 extends AbstractC3343n implements tf.a {
        public AnonymousClass5() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$50, reason: invalid class name */
    public static final class AnonymousClass50 extends AbstractC3343n implements tf.a {
        public AnonymousClass50() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$51, reason: invalid class name */
    public static final class AnonymousClass51 extends AbstractC3343n implements tf.a {
        public AnonymousClass51() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$52, reason: invalid class name */
    public static final class AnonymousClass52 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass52(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.setOpportunityTTL(this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$53, reason: invalid class name */
    public static final class AnonymousClass53 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass53(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getExtra((SessionRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(SessionRepository.class)), this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$6, reason: invalid class name */
    public static final class AnonymousClass6 extends AbstractC3343n implements tf.a {
        public AnonymousClass6() {
            super(0);
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$7, reason: invalid class name */
    public static final class AnonymousClass7 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ HandleInvocationsFromAdViewer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AdObject adObject, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
            super(0);
            this.$adObject = adObject;
            this.this$0 = handleInvocationsFromAdViewer;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.openUrl(this.$adObject, (HandleOpenUrl) this.this$0.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(HandleOpenUrl.class)));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$8, reason: invalid class name */
    public static final class AnonymousClass8 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.setOrientation(this.$adObject);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$9, reason: invalid class name */
    public static final class AnonymousClass9 extends AbstractC3343n implements tf.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // tf.a
        @NotNull
        public final ExposedFunction invoke() {
            return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) HandleInvocationsFromAdViewer.this.getServiceProvider().getRegistry().getService("", H.f39741a.getOrCreateKotlinClass(GetOperativeEventApi.class)), this.$adObject);
        }
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final Map<String, tf.a> invoke(@NotNull String adData, @NotNull String adDataRefreshToken, @NotNull String impressionConfig, @NotNull AdObject adObject) {
        AbstractC3340k.e(adData, "adData");
        AbstractC3340k.e(adDataRefreshToken, "adDataRefreshToken");
        AbstractC3340k.e(impressionConfig, "impressionConfig");
        AbstractC3340k.e(adObject, "adObject");
        return AbstractC2640A.R(new C2527k(ExposedFunctionLocation.GET_AD_CONTEXT, new AnonymousClass1(AdData.m244constructorimpl(adData), ImpressionConfig.m258constructorimpl(impressionConfig), AdDataRefreshToken.m251constructorimpl(adDataRefreshToken), adObject)), new C2527k(ExposedFunctionLocation.GET_CONNECTION_TYPE, new AnonymousClass2()), new C2527k(ExposedFunctionLocation.GET_DEVICE_VOLUME, new AnonymousClass3()), new C2527k(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new AnonymousClass4()), new C2527k(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new AnonymousClass5()), new C2527k(ExposedFunctionLocation.GET_SCREEN_WIDTH, new AnonymousClass6()), new C2527k(ExposedFunctionLocation.OPEN_URL, new AnonymousClass7(adObject, this)), new C2527k(ExposedFunctionLocation.SET_ORIENTATION, new AnonymousClass8(adObject)), new C2527k(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new AnonymousClass9(adObject)), new C2527k(ExposedFunctionLocation.STORAGE_WRITE, AnonymousClass10.INSTANCE), new C2527k(ExposedFunctionLocation.STORAGE_READ, AnonymousClass11.INSTANCE), new C2527k(ExposedFunctionLocation.STORAGE_DELETE, AnonymousClass12.INSTANCE), new C2527k(ExposedFunctionLocation.STORAGE_CLEAR, AnonymousClass13.INSTANCE), new C2527k(ExposedFunctionLocation.STORAGE_GET_KEYS, AnonymousClass14.INSTANCE), new C2527k(ExposedFunctionLocation.STORAGE_GET, AnonymousClass15.INSTANCE), new C2527k(ExposedFunctionLocation.STORAGE_SET, AnonymousClass16.INSTANCE), new C2527k(ExposedFunctionLocation.GET_PRIVACY_FSM, new AnonymousClass17()), new C2527k(ExposedFunctionLocation.SET_PRIVACY_FSM, new AnonymousClass18()), new C2527k(ExposedFunctionLocation.GET_PRIVACY, new AnonymousClass19()), new C2527k(ExposedFunctionLocation.SET_PRIVACY, new AnonymousClass20()), new C2527k(ExposedFunctionLocation.GET_ALLOWED_PII, new AnonymousClass21()), new C2527k(ExposedFunctionLocation.SET_ALLOWED_PII, new AnonymousClass22()), new C2527k(ExposedFunctionLocation.GET_SESSION_TOKEN, new AnonymousClass23()), new C2527k(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new AnonymousClass24(adObject)), new C2527k(ExposedFunctionLocation.REFRESH_AD_DATA, new AnonymousClass25(adObject)), new C2527k(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new AnonymousClass26(adObject)), new C2527k(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new AnonymousClass27(adObject)), new C2527k(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new AnonymousClass28()), new C2527k(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new AnonymousClass29(adObject)), new C2527k(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new AnonymousClass30()), new C2527k(ExposedFunctionLocation.DOWNLOAD, new AnonymousClass31(adObject)), new C2527k(ExposedFunctionLocation.DOWNLOAD_WITH_PROGRESS, new AnonymousClass32(adObject)), new C2527k(ExposedFunctionLocation.IS_FILE_CACHED, new AnonymousClass33()), new C2527k(ExposedFunctionLocation.OM_START_SESSION, new AnonymousClass34(adObject)), new C2527k(ExposedFunctionLocation.OM_FINISH_SESSION, new AnonymousClass35(adObject)), new C2527k(ExposedFunctionLocation.OM_IMPRESSION, new AnonymousClass36(adObject)), new C2527k(ExposedFunctionLocation.OM_GET_DATA, new AnonymousClass37()), new C2527k(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new AnonymousClass38()), new C2527k(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new AnonymousClass39(adObject)), new C2527k(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new AnonymousClass40(adObject)), new C2527k(ExposedFunctionLocation.LOAD_SCAR_AD, new AnonymousClass41(adObject)), new C2527k(ExposedFunctionLocation.SHOW_SCAR_AD, AnonymousClass42.INSTANCE), new C2527k(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new AnonymousClass43(adObject)), new C2527k(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new AnonymousClass44()), new C2527k(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new AnonymousClass45()), new C2527k(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new AnonymousClass46(adObject)), new C2527k(ExposedFunctionLocation.SHOW_OFFERWALL_AD, AnonymousClass47.INSTANCE), new C2527k(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new AnonymousClass48()), new C2527k(ExposedFunctionLocation.REQUEST_GET, new AnonymousClass49()), new C2527k(ExposedFunctionLocation.REQUEST_POST, new AnonymousClass50()), new C2527k(ExposedFunctionLocation.REQUEST_HEAD, new AnonymousClass51()), new C2527k(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new AnonymousClass52(adObject)), new C2527k(ExposedFunctionLocation.GET_EXTRA, new AnonymousClass53(adObject)));
    }
}
