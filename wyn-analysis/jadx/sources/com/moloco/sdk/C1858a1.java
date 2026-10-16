package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.a1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1858a1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1858a1 DEFAULT_INSTANCE;
    private static volatile Parser<C1858a1> PARSER;

    static {
        C1858a1 c1858a1 = new C1858a1();
        DEFAULT_INSTANCE = c1858a1;
        GeneratedMessageLite.registerDefaultInstance(C1858a1.class, c1858a1);
    }

    public static Z0 b() {
        return (Z0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L0.f28322a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1858a1();
            case 2:
                return new Z0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1858a1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1858a1.class) {
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
