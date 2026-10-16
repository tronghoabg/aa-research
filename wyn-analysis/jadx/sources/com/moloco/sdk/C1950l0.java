package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1950l0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int AD_FORMAT_FIELD_NUMBER = 1;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
    private static final C1950l0 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int MAX_AD_UNIT_ID_FIELD_NUMBER = 4;
    public static final int NETWORK_NAME_FIELD_NUMBER = 5;
    private static volatile Parser<C1950l0> PARSER = null;
    public static final int REVENUE_FIELD_NUMBER = 6;
    public static final int THIRD_PARTY_AD_PLACEMENT_ID_FIELD_NUMBER = 7;
    public static final int USER_SEGMENT_FIELD_NUMBER = 8;
    private double revenue_;
    private String adFormat_ = "";
    private String countryCode_ = "";
    private String id_ = "";
    private String maxAdUnitId_ = "";
    private String networkName_ = "";
    private String thirdPartyAdPlacementId_ = "";
    private String userSegment_ = "";

    static {
        C1950l0 c1950l0 = new C1950l0();
        DEFAULT_INSTANCE = c1950l0;
        GeneratedMessageLite.registerDefaultInstance(C1950l0.class, c1950l0);
    }

    public static void a(C1950l0 c1950l0, String str) {
        c1950l0.getClass();
        c1950l0.adFormat_ = str;
    }

    public static void b(C1950l0 c1950l0, String str) {
        c1950l0.getClass();
        c1950l0.countryCode_ = str;
    }

    public static void c(C1950l0 c1950l0, String str) {
        c1950l0.getClass();
        c1950l0.id_ = str;
    }

    public static void d(C1950l0 c1950l0, String str) {
        c1950l0.getClass();
        c1950l0.maxAdUnitId_ = str;
    }

    public static void e(C1950l0 c1950l0, String str) {
        c1950l0.getClass();
        c1950l0.networkName_ = str;
    }

    public static void f(C1950l0 c1950l0, double d3) {
        c1950l0.revenue_ = d3;
    }

    public static void g(C1950l0 c1950l0, String str) {
        c1950l0.getClass();
        c1950l0.thirdPartyAdPlacementId_ = str;
    }

    public static void h(C1950l0 c1950l0, String str) {
        c1950l0.getClass();
        c1950l0.userSegment_ = str;
    }

    public static C1948k0 k() {
        return (C1948k0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1866d0.f28482a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1950l0();
            case 2:
                return new C1948k0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0000\u0007Ȉ\bȈ", new Object[]{"adFormat_", "countryCode_", "id_", "maxAdUnitId_", "networkName_", "revenue_", "thirdPartyAdPlacementId_", "userSegment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1950l0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1950l0.class) {
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

    public final String j() {
        return this.adFormat_;
    }
}
