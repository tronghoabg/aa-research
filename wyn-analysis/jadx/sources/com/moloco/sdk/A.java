package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class A extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final A DEFAULT_INSTANCE;
    private static volatile Parser<A> PARSER = null;
    public static final int UTCOFFSET_FIELD_NUMBER = 1;
    private int bitField0_;
    private int utcoffset_;

    static {
        A a5 = new A();
        DEFAULT_INSTANCE = a5;
        GeneratedMessageLite.registerDefaultInstance(A.class, a5);
    }

    public static void a(A a5, int i5) {
        a5.bitField0_ |= 1;
        a5.utcoffset_ = i5;
    }

    public static C2143z c() {
        return (C2143z) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new A();
            case 2:
                return new C2143z(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "utcoffset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<A> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (A.class) {
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
