package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1975v0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1975v0 DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    private static volatile Parser<C1975v0> PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private boolean enabled_;
    private String url_ = "";

    static {
        C1975v0 c1975v0 = new C1975v0();
        DEFAULT_INSTANCE = c1975v0;
        GeneratedMessageLite.registerDefaultInstance(C1975v0.class, c1975v0);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1975v0();
            case 2:
                return new C1973u0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"enabled_", "url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1975v0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1975v0.class) {
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
