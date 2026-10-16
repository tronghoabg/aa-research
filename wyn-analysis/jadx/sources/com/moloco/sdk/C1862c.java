package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1862c extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1862c DEFAULT_INSTANCE;
    private static volatile Parser<C1862c> PARSER;

    static {
        C1862c c1862c = new C1862c();
        DEFAULT_INSTANCE = c1862c;
        GeneratedMessageLite.registerDefaultInstance(C1862c.class, c1862c);
    }

    public static C1859b b() {
        return (C1859b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1862c();
            case 2:
                return new C1859b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1862c> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1862c.class) {
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
