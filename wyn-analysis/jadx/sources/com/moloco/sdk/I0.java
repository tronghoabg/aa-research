package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class I0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final I0 DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    private static volatile Parser<I0> PARSER = null;
    public static final int POLLING_INTERVAL_SECONDS_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 2;
    private boolean enabled_;
    private int pollingIntervalSeconds_;
    private String url_ = "";

    static {
        I0 i02 = new I0();
        DEFAULT_INSTANCE = i02;
        GeneratedMessageLite.registerDefaultInstance(I0.class, i02);
    }

    public static I0 b() {
        return DEFAULT_INSTANCE;
    }

    public final int c() {
        return this.pollingIntervalSeconds_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new I0();
            case 2:
                return new H0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004", new Object[]{"enabled_", "url_", "pollingIntervalSeconds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<I0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (I0.class) {
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

    public final String getUrl() {
        return this.url_;
    }
}
