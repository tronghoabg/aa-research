package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class D0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CITY_FIELD_NUMBER = 6;
    public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 2;
    public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 1;
    private static final D0 DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 3;
    public static final int LONGITUDE_FIELD_NUMBER = 4;
    private static volatile Parser<D0> PARSER = null;
    public static final int REGION_FIELD_NUMBER = 7;
    public static final int ZIP_CODE_FIELD_NUMBER = 5;
    private float latitude_;
    private float longitude_;
    private String countryIso3Code_ = "";
    private String countryIso2Code_ = "";
    private String zipCode_ = "";
    private String city_ = "";
    private String region_ = "";

    static {
        D0 d02 = new D0();
        DEFAULT_INSTANCE = d02;
        GeneratedMessageLite.registerDefaultInstance(D0.class, d02);
    }

    public final String b() {
        return this.city_;
    }

    public final String c() {
        return this.countryIso2Code_;
    }

    public final String d() {
        return this.countryIso3Code_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new D0();
            case 2:
                return new C0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"countryIso3Code_", "countryIso2Code_", "latitude_", "longitude_", "zipCode_", "city_", "region_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<D0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (D0.class) {
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

    public final float e() {
        return this.latitude_;
    }

    public final float f() {
        return this.longitude_;
    }

    public final String g() {
        return this.zipCode_;
    }
}
