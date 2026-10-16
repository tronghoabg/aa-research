package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class E extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final E DEFAULT_INSTANCE;
    public static final int IMP_COUNTS_FIELD_NUMBER = 4;
    public static final int LAST_IMP_TS_FIELD_NUMBER = 2;
    private static volatile Parser<E> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_START_TS_FIELD_NUMBER = 3;
    private D impCounts_;
    private long lastImpTs_;
    private String sessionId_ = "";
    private long sessionStartTs_;

    static {
        E e7 = new E();
        DEFAULT_INSTANCE = e7;
        GeneratedMessageLite.registerDefaultInstance(E.class, e7);
    }

    public static void a(E e7, D d3) {
        e7.getClass();
        d3.getClass();
        e7.impCounts_ = d3;
    }

    public static void b(E e7, long j8) {
        e7.lastImpTs_ = j8;
    }

    public static void c(E e7, String str) {
        e7.getClass();
        str.getClass();
        e7.sessionId_ = str;
    }

    public static void d(E e7, long j8) {
        e7.sessionStartTs_ = j8;
    }

    public static B f() {
        return (B) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new E();
            case 2:
                return new B(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\t", new Object[]{"sessionId_", "lastImpTs_", "sessionStartTs_", "impCounts_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<E> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (E.class) {
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
