package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class K0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int AD_SERVER_URL_FIELD_NUMBER = 6;
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BID_TOKEN_CONFIG_FIELD_NUMBER = 12;
    public static final int CONFIGS_FIELD_NUMBER = 16;
    public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 7;
    public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 3;
    public static final int CRASH_REPORTING_CONFIG_FIELD_NUMBER = 15;
    private static final K0 DEFAULT_INSTANCE;
    public static final int DIRECT_ADS_CONFIG_FIELD_NUMBER = 18;
    public static final int EVENT_COLLECTION_CONFIG_FIELD_NUMBER = 11;
    public static final int EXPERIMENTAL_FEATURE_FLAGS_FIELD_NUMBER = 13;
    public static final int GEO_FIELD_NUMBER = 10;
    public static final int ILRD_CONFIG_FIELD_NUMBER = 17;
    public static final int OPERATIONAL_METRICS_CONFIG_FIELD_NUMBER = 14;
    private static volatile Parser<K0> PARSER = null;
    public static final int PLATFORM_ID_FIELD_NUMBER = 8;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 2;
    public static final int RESOLVED_REGION_FIELD_NUMBER = 5;
    public static final int VERIFY_BANNER_VISIBLE_FIELD_NUMBER = 9;
    private C1969s0 bidTokenConfig_;
    private C1863c0 configs_;
    private C1975v0 crashReportingConfig_;
    private C1979x0 directAdsConfig_;
    private C2144z0 eventCollectionConfig_;
    private D0 geo_;
    private G0 ilrdConfig_;
    private I0 operationalMetricsConfig_;
    private int resolvedRegion_;
    private boolean verifyBannerVisible_;
    private String appId_ = "";
    private String publisherId_ = "";
    private String countryIso3Code_ = "";
    private Internal.ProtobufList<C1966q0> adUnits_ = GeneratedMessageLite.emptyProtobufList();
    private String adServerUrl_ = "";
    private String countryIso2Code_ = "";
    private String platformId_ = "";
    private Internal.ProtobufList<B0> experimentalFeatureFlags_ = GeneratedMessageLite.emptyProtobufList();

    static {
        K0 k02 = new K0();
        DEFAULT_INSTANCE = k02;
        GeneratedMessageLite.registerDefaultInstance(K0.class, k02);
    }

    public static K0 o(byte[] bArr) {
        return (K0) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final String b() {
        return this.appId_;
    }

    public final C1863c0 c() {
        C1863c0 c1863c0 = this.configs_;
        return c1863c0 == null ? C1863c0.c() : c1863c0;
    }

    public final String d() {
        return this.countryIso2Code_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new K0();
            case 2:
                return new C1971t0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\t\u000b\t\f\t\r\u001b\u000e\t\u000f\t\u0010\t\u0011\t\u0012\t", new Object[]{"appId_", "publisherId_", "countryIso3Code_", "adUnits_", C1966q0.class, "resolvedRegion_", "adServerUrl_", "countryIso2Code_", "platformId_", "verifyBannerVisible_", "geo_", "eventCollectionConfig_", "bidTokenConfig_", "experimentalFeatureFlags_", B0.class, "operationalMetricsConfig_", "crashReportingConfig_", "configs_", "ilrdConfig_", "directAdsConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<K0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (K0.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C2144z0 e() {
        C2144z0 c2144z0 = this.eventCollectionConfig_;
        return c2144z0 == null ? C2144z0.d() : c2144z0;
    }

    public final Internal.ProtobufList f() {
        return this.experimentalFeatureFlags_;
    }

    public final G0 g() {
        G0 g02 = this.ilrdConfig_;
        return g02 == null ? G0.b() : g02;
    }

    public final I0 h() {
        I0 i02 = this.operationalMetricsConfig_;
        return i02 == null ? I0.b() : i02;
    }

    public final String i() {
        return this.publisherId_;
    }

    public final boolean j() {
        return this.verifyBannerVisible_;
    }

    public final boolean k() {
        return this.configs_ != null;
    }

    public final boolean l() {
        return this.eventCollectionConfig_ != null;
    }

    public final boolean m() {
        return this.ilrdConfig_ != null;
    }

    public final boolean n() {
        return this.operationalMetricsConfig_ != null;
    }
}
