package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class D1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final D1 DEFAULT_INSTANCE;
    public static final int H_FIELD_NUMBER = 2;
    private static volatile Parser<D1> PARSER = null;
    public static final int W_FIELD_NUMBER = 1;
    private float h_;
    private float w_;

    static {
        D1 d12 = new D1();
        DEFAULT_INSTANCE = d12;
        GeneratedMessageLite.registerDefaultInstance(D1.class, d12);
    }

    public static void a(D1 d12, float f10) {
        d12.h_ = f10;
    }

    public static void b(D1 d12, float f10) {
        d12.w_ = f10;
    }

    public static C1 d() {
        return (C1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new D1();
            case 2:
                return new C1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"w_", "h_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<D1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (D1.class) {
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
