package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class X0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final X0 DEFAULT_INSTANCE;
    private static volatile Parser<X0> PARSER = null;
    public static final int SERVER_HTTP_STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int serverHttpStatus_;

    static {
        X0 x02 = new X0();
        DEFAULT_INSTANCE = x02;
        GeneratedMessageLite.registerDefaultInstance(X0.class, x02);
    }

    public static void a(X0 x02, int i5) {
        x02.bitField0_ |= 1;
        x02.serverHttpStatus_ = i5;
    }

    public static W0 c() {
        return (W0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L0.f28322a[methodToInvoke.ordinal()]) {
            case 1:
                return new X0();
            case 2:
                return new W0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "serverHttpStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<X0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (X0.class) {
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
