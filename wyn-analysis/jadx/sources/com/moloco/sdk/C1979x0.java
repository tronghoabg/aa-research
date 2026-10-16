package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.x0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1979x0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1979x0 DEFAULT_INSTANCE;
    private static volatile Parser<C1979x0> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private String url_ = "";

    static {
        C1979x0 c1979x0 = new C1979x0();
        DEFAULT_INSTANCE = c1979x0;
        GeneratedMessageLite.registerDefaultInstance(C1979x0.class, c1979x0);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1979x0();
            case 2:
                return new C1977w0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1979x0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1979x0.class) {
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
