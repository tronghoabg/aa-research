package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.g1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3237g1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3237g1 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile Parser<C3237g1> PARSER;
    private int op_;
    private int operandTypeCase_ = 0;
    private Object operandType_;

    static {
        C3237g1 c3237g1 = new C3237g1();
        DEFAULT_INSTANCE = c3237g1;
        GeneratedMessageLite.registerDefaultInstance(C3237g1.class, c3237g1);
    }

    public static void b(C3237g1 c3237g1, EnumC3234f1 enumC3234f1) {
        c3237g1.getClass();
        c3237g1.op_ = enumC3234f1.getNumber();
    }

    public static void c(C3237g1 c3237g1, W0 w02) {
        c3237g1.getClass();
        w02.getClass();
        c3237g1.operandType_ = w02;
        c3237g1.operandTypeCase_ = 2;
    }

    public static C3237g1 d() {
        return DEFAULT_INSTANCE;
    }

    public static C3231e1 g() {
        return (C3231e1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3237g1();
            case 2:
                return new C3231e1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", W0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3237g1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3237g1.class) {
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

    public final W0 e() {
        return this.operandTypeCase_ == 2 ? (W0) this.operandType_ : W0.c();
    }

    public final EnumC3234f1 f() {
        int i5 = this.op_;
        EnumC3234f1 enumC3234f1 = i5 != 0 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? null : EnumC3234f1.IS_NOT_NULL : EnumC3234f1.IS_NOT_NAN : EnumC3234f1.IS_NULL : EnumC3234f1.IS_NAN : EnumC3234f1.OPERATOR_UNSPECIFIED;
        return enumC3234f1 == null ? EnumC3234f1.UNRECOGNIZED : enumC3234f1;
    }
}
