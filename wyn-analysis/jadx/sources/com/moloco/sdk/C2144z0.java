package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2144z0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int APP_BACKGROUND_TRACKING_URL_FIELD_NUMBER = 3;
    public static final int APP_FOREGROUND_TRACKING_URL_FIELD_NUMBER = 4;
    private static final C2144z0 DEFAULT_INSTANCE;
    public static final int EVENT_COLLECTION_ENABLED_FIELD_NUMBER = 1;
    public static final int MREF_COLLECTION_ENABLED_FIELD_NUMBER = 2;
    private static volatile Parser<C2144z0> PARSER;
    private String appBackgroundTrackingUrl_ = "";
    private String appForegroundTrackingUrl_ = "";
    private boolean eventCollectionEnabled_;
    private boolean mrefCollectionEnabled_;

    static {
        C2144z0 c2144z0 = new C2144z0();
        DEFAULT_INSTANCE = c2144z0;
        GeneratedMessageLite.registerDefaultInstance(C2144z0.class, c2144z0);
    }

    public static C2144z0 d() {
        return DEFAULT_INSTANCE;
    }

    public final String b() {
        return this.appBackgroundTrackingUrl_;
    }

    public final String c() {
        return this.appForegroundTrackingUrl_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new C2144z0();
            case 2:
                return new C2142y0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"eventCollectionEnabled_", "mrefCollectionEnabled_", "appBackgroundTrackingUrl_", "appForegroundTrackingUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C2144z0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C2144z0.class) {
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

    public final boolean e() {
        return this.eventCollectionEnabled_;
    }

    public final boolean f() {
        return this.mrefCollectionEnabled_;
    }
}
