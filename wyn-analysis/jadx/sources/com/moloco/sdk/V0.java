package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class V0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_FAILURE_TYPE_FIELD_NUMBER = 1;
    private static final V0 DEFAULT_INSTANCE;
    private static volatile Parser<V0> PARSER;
    private int bitField0_;
    private int clientFailureType_;

    static {
        V0 v0 = new V0();
        DEFAULT_INSTANCE = v0;
        GeneratedMessageLite.registerDefaultInstance(V0.class, v0);
    }

    public static void a(V0 v0, U0 u02) {
        v0.getClass();
        v0.clientFailureType_ = u02.getNumber();
        v0.bitField0_ |= 1;
    }

    public static T0 c() {
        return (T0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L0.f28322a[methodToInvoke.ordinal()]) {
            case 1:
                return new V0();
            case 2:
                return new T0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "clientFailureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<V0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (V0.class) {
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
