package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class L extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CCPA_FIELD_NUMBER = 1;
    public static final int COPPA_FIELD_NUMBER = 3;
    private static final L DEFAULT_INSTANCE;
    public static final int GDPR_FIELD_NUMBER = 2;
    private static volatile Parser<L> PARSER = null;
    public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
    public static final int US_PRIVACY_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean ccpa_;
    private boolean coppa_;
    private boolean gdpr_;
    private String usPrivacy_ = "";
    private String tcfConsentString_ = "";

    static {
        L l10 = new L();
        DEFAULT_INSTANCE = l10;
        GeneratedMessageLite.registerDefaultInstance(L.class, l10);
    }

    public static void a(L l10, boolean z2) {
        l10.bitField0_ |= 1;
        l10.ccpa_ = z2;
    }

    public static void b(L l10, boolean z2) {
        l10.bitField0_ |= 4;
        l10.coppa_ = z2;
    }

    public static void c(L l10, boolean z2) {
        l10.bitField0_ |= 2;
        l10.gdpr_ = z2;
    }

    public static void d(L l10, String str) {
        l10.getClass();
        l10.bitField0_ |= 16;
        l10.tcfConsentString_ = str;
    }

    public static void e(L l10, String str) {
        l10.getClass();
        str.getClass();
        l10.bitField0_ |= 8;
        l10.usPrivacy_ = str;
    }

    public static K g() {
        return (K) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new L();
            case 2:
                return new K(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<L> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (L.class) {
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
}
