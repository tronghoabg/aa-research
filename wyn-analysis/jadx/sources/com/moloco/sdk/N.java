package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class N extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final N DEFAULT_INSTANCE;
    public static final int INITIALIZED_FIELD_NUMBER = 1;
    private static volatile Parser<N> PARSER;
    private int bitField0_;
    private boolean initialized_;

    static {
        N n10 = new N();
        DEFAULT_INSTANCE = n10;
        GeneratedMessageLite.registerDefaultInstance(N.class, n10);
    }

    public static void a(N n10, boolean z2) {
        n10.bitField0_ |= 1;
        n10.initialized_ = z2;
    }

    public static M c() {
        return (M) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new N();
            case 2:
                return new M(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "initialized_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<N> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (N.class) {
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
