package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class f1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final f1 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<f1> PARSER = null;
    public static final int VER_FIELD_NUMBER = 2;
    private String id_ = "";
    private String ver_ = "";

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        GeneratedMessageLite.registerDefaultInstance(f1.class, f1Var);
    }

    public static void a(f1 f1Var, String str) {
        f1Var.getClass();
        f1Var.id_ = str;
    }

    public static void b(f1 f1Var, String str) {
        f1Var.getClass();
        f1Var.ver_ = str;
    }

    public static C1870e1 d() {
        return (C1870e1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new f1();
            case 2:
                return new C1870e1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"id_", "ver_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<f1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (f1.class) {
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
