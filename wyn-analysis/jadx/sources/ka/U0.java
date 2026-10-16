package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class U0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final U0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    public static final int OP_FIELD_NUMBER = 2;
    private static volatile Parser<U0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private W0 field_;
    private int op_;
    private C1 value_;

    static {
        U0 u02 = new U0();
        DEFAULT_INSTANCE = u02;
        GeneratedMessageLite.registerDefaultInstance(U0.class, u02);
    }

    public static void b(U0 u02, W0 w02) {
        u02.getClass();
        w02.getClass();
        u02.field_ = w02;
        u02.bitField0_ |= 1;
    }

    public static void c(U0 u02, T0 t02) {
        u02.getClass();
        u02.op_ = t02.getNumber();
    }

    public static void d(U0 u02, C1 c12) {
        u02.getClass();
        c12.getClass();
        u02.value_ = c12;
        u02.bitField0_ |= 2;
    }

    public static U0 e() {
        return DEFAULT_INSTANCE;
    }

    public static S0 i() {
        return (S0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new U0();
            case 2:
                return new S0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<U0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (U0.class) {
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

    public final W0 f() {
        W0 w02 = this.field_;
        return w02 == null ? W0.c() : w02;
    }

    public final T0 g() {
        T0 t02;
        switch (this.op_) {
            case 0:
                t02 = T0.OPERATOR_UNSPECIFIED;
                break;
            case 1:
                t02 = T0.LESS_THAN;
                break;
            case 2:
                t02 = T0.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                t02 = T0.GREATER_THAN;
                break;
            case 4:
                t02 = T0.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                t02 = T0.EQUAL;
                break;
            case 6:
                t02 = T0.NOT_EQUAL;
                break;
            case 7:
                t02 = T0.ARRAY_CONTAINS;
                break;
            case 8:
                t02 = T0.IN;
                break;
            case 9:
                t02 = T0.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                t02 = T0.NOT_IN;
                break;
            default:
                t02 = null;
                break;
        }
        return t02 == null ? T0.UNRECOGNIZED : t02;
    }

    public final C1 h() {
        C1 c12 = this.value_;
        return c12 == null ? C1.p() : c12;
    }
}
