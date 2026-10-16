package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class h1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final h1 DEFAULT_INSTANCE;
    private static volatile Parser<h1> PARSER;

    static {
        h1 h1Var = new h1();
        DEFAULT_INSTANCE = h1Var;
        GeneratedMessageLite.registerDefaultInstance(h1.class, h1Var);
    }

    public static g1 b() {
        return (g1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new h1();
            case 2:
                return new g1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (h1.class) {
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
