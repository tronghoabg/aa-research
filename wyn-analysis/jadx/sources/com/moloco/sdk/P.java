package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class P extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final P DEFAULT_INSTANCE;
    public static final int JSON_CONFIG_FIELD_NUMBER = 1;
    private static volatile Parser<P> PARSER;
    private int bitField0_;
    private String jsonConfig_ = "";

    static {
        P p10 = new P();
        DEFAULT_INSTANCE = p10;
        GeneratedMessageLite.registerDefaultInstance(P.class, p10);
    }

    public static void a(P p10, String str) {
        p10.getClass();
        str.getClass();
        p10.bitField0_ |= 1;
        p10.jsonConfig_ = str;
    }

    public static O c() {
        return (O) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new P();
            case 2:
                return new O(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "jsonConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<P> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (P.class) {
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
