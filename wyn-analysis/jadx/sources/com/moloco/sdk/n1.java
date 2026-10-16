package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class n1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final n1 DEFAULT_INSTANCE;
    private static volatile Parser<n1> PARSER = null;
    public static final int POS_FIELD_NUMBER = 2;
    public static final int SIZE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private B1 pos_;
    private D1 size_;
    private int type_;

    static {
        n1 n1Var = new n1();
        DEFAULT_INSTANCE = n1Var;
        GeneratedMessageLite.registerDefaultInstance(n1.class, n1Var);
    }

    public static void a(n1 n1Var, B1 b12) {
        n1Var.getClass();
        n1Var.pos_ = b12;
    }

    public static void b(n1 n1Var, D1 d12) {
        n1Var.getClass();
        n1Var.size_ = d12;
    }

    public static void c(n1 n1Var, m1 m1Var) {
        n1Var.getClass();
        n1Var.type_ = m1Var.getNumber();
    }

    public static l1 e() {
        return (l1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC1867d1.f28483a[methodToInvoke.ordinal()]) {
            case 1:
                return new n1();
            case 2:
                return new l1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"type_", "pos_", "size_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<n1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (n1.class) {
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
