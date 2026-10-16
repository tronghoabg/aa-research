package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class Y0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CLIENT_ERROR_FIELD_NUMBER = 2;
    private static final Y0 DEFAULT_INSTANCE;
    private static volatile Parser<Y0> PARSER = null;
    public static final int SERVER_ERROR_FIELD_NUMBER = 1;
    private int errorTypeCase_ = 0;
    private Object errorType_;

    static {
        Y0 y02 = new Y0();
        DEFAULT_INSTANCE = y02;
        GeneratedMessageLite.registerDefaultInstance(Y0.class, y02);
    }

    public static void a(Y0 y02, V0 v0) {
        y02.getClass();
        v0.getClass();
        y02.errorType_ = v0;
        y02.errorTypeCase_ = 2;
    }

    public static void b(Y0 y02, X0 x02) {
        y02.getClass();
        x02.getClass();
        y02.errorType_ = x02;
        y02.errorTypeCase_ = 1;
    }

    public static S0 d() {
        return (S0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L0.f28322a[methodToInvoke.ordinal()]) {
            case 1:
                return new Y0();
            case 2:
                return new S0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"errorType_", "errorTypeCase_", X0.class, V0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Y0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Y0.class) {
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
