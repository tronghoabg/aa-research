package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1958p0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1958p0 DEFAULT_INSTANCE;
    private static volatile Parser<C1958p0> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        C1958p0 c1958p0 = new C1958p0();
        DEFAULT_INSTANCE = c1958p0;
        GeneratedMessageLite.registerDefaultInstance(C1958p0.class, c1958p0);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1952m0.f29795a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1958p0();
            case 2:
                return new C1956o0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1958p0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1958p0.class) {
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
