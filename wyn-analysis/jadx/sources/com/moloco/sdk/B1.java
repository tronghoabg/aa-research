package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class B1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final B1 DEFAULT_INSTANCE;
    private static volatile Parser<B1> PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private float x_;
    private float y_;

    static {
        B1 b12 = new B1();
        DEFAULT_INSTANCE = b12;
        GeneratedMessageLite.registerDefaultInstance(B1.class, b12);
    }

    public static void a(B1 b12, float f10) {
        b12.x_ = f10;
    }

    public static void b(B1 b12, float f10) {
        b12.y_ = f10;
    }

    public static A1 d() {
        return (A1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new B1();
            case 2:
                return new A1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<B1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (B1.class) {
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
