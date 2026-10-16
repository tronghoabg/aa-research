package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class j1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BG_TS_MS_FIELD_NUMBER = 1;
    private static final j1 DEFAULT_INSTANCE;
    private static volatile Parser<j1> PARSER;
    private long bgTsMs_;

    static {
        j1 j1Var = new j1();
        DEFAULT_INSTANCE = j1Var;
        GeneratedMessageLite.registerDefaultInstance(j1.class, j1Var);
    }

    public static void a(j1 j1Var, long j8) {
        j1Var.bgTsMs_ = j8;
    }

    public static i1 c() {
        return (i1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new j1();
            case 2:
                return new i1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"bgTsMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<j1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (j1.class) {
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
