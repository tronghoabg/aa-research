package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1969s0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BID_TOKEN_URL_FIELD_NUMBER = 2;
    private static final C1969s0 DEFAULT_INSTANCE;
    private static volatile Parser<C1969s0> PARSER;
    private String bidTokenUrl_ = "";

    static {
        C1969s0 c1969s0 = new C1969s0();
        DEFAULT_INSTANCE = c1969s0;
        GeneratedMessageLite.registerDefaultInstance(C1969s0.class, c1969s0);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1969s0();
            case 2:
                return new C1967r0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"bidTokenUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1969s0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1969s0.class) {
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
