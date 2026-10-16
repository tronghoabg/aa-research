package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: com.moloco.sdk.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1871f extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C1871f DEFAULT_INSTANCE;
    public static final int ENABLE_DBT_FIELD_NUMBER = 1;
    private static volatile Parser<C1871f> PARSER;
    private boolean enableDbt_;

    static {
        C1871f c1871f = new C1871f();
        DEFAULT_INSTANCE = c1871f;
        GeneratedMessageLite.registerDefaultInstance(C1871f.class, c1871f);
    }

    public static C1871f b() {
        return DEFAULT_INSTANCE;
    }

    public final boolean c() {
        return this.enableDbt_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1856a.f28333a[methodToInvoke.ordinal()]) {
            case 1:
                return new C1871f();
            case 2:
                return new C1868e(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"enableDbt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C1871f> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C1871f.class) {
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
