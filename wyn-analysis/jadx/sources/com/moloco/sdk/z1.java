package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class z1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CARRIER_FIELD_NUMBER = 2;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
    private static final z1 DEFAULT_INSTANCE;
    private static volatile Parser<z1> PARSER;
    private String carrier_ = "";
    private int connectionType_;

    static {
        z1 z1Var = new z1();
        DEFAULT_INSTANCE = z1Var;
        GeneratedMessageLite.registerDefaultInstance(z1.class, z1Var);
    }

    public static void a(z1 z1Var, String str) {
        z1Var.getClass();
        z1Var.carrier_ = str;
    }

    public static void b(z1 z1Var, y1 y1Var) {
        z1Var.getClass();
        z1Var.connectionType_ = y1Var.getNumber();
    }

    public static x1 d() {
        return (x1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new z1();
            case 2:
                return new x1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"connectionType_", "carrier_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<z1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (z1.class) {
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
