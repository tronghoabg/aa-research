package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class w1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ADAPTER_VER_FIELD_NUMBER = 2;
    public static final int CORE_VER_FIELD_NUMBER = 1;
    private static final w1 DEFAULT_INSTANCE;
    private static volatile Parser<w1> PARSER;
    private String coreVer_ = "";
    private String adapterVer_ = "";

    static {
        w1 w1Var = new w1();
        DEFAULT_INSTANCE = w1Var;
        GeneratedMessageLite.registerDefaultInstance(w1.class, w1Var);
    }

    public static void a(w1 w1Var) {
        w1Var.getClass();
        w1Var.coreVer_ = BuildConfig.SDK_VERSION_NAME;
    }

    public static v1 c() {
        return (v1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new w1();
            case 2:
                return new v1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"coreVer_", "adapterVer_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<w1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (w1.class) {
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
