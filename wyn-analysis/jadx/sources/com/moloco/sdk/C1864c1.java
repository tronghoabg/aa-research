package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.c1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1864c1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1864c1 DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 2;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile Parser<C1864c1> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int initStatusCase_ = 0;
    private Object initStatus_;
    private long latencyMs_;

    static {
        C1864c1 c1864c1 = new C1864c1();
        DEFAULT_INSTANCE = c1864c1;
        GeneratedMessageLite.registerDefaultInstance(C1864c1.class, c1864c1);
    }

    public static void a(C1864c1 c1864c1, Y0 y02) {
        c1864c1.getClass();
        y02.getClass();
        c1864c1.initStatus_ = y02;
        c1864c1.initStatusCase_ = 2;
    }

    public static void b(C1864c1 c1864c1, long j8) {
        c1864c1.bitField0_ |= 1;
        c1864c1.latencyMs_ = j8;
    }

    public static void c(C1864c1 c1864c1, C1858a1 c1858a1) {
        c1864c1.getClass();
        c1858a1.getClass();
        c1864c1.initStatus_ = c1858a1;
        c1864c1.initStatusCase_ = 1;
    }

    public static C1861b1 e() {
        return (C1861b1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L0.f28322a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1864c1();
            case 2:
                return new C1861b1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဃ\u0000", new Object[]{"initStatus_", "initStatusCase_", "bitField0_", C1858a1.class, Y0.class, "latencyMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1864c1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1864c1.class) {
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
