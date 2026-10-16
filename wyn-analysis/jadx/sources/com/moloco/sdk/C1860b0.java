package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1860b0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1860b0 DEFAULT_INSTANCE;
    private static volatile Parser<C1860b0> PARSER;

    static {
        C1860b0 c1860b0 = new C1860b0();
        DEFAULT_INSTANCE = c1860b0;
        GeneratedMessageLite.registerDefaultInstance(C1860b0.class, c1860b0);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (S.f28323a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1860b0();
            case 2:
                return new C1857a0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1860b0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1860b0.class) {
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
