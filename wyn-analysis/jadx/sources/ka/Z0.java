package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class Z0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
    private static final Z0 DEFAULT_INSTANCE;
    public static final int FIELD_FILTER_FIELD_NUMBER = 2;
    private static volatile Parser<Z0> PARSER = null;
    public static final int UNARY_FILTER_FIELD_NUMBER = 3;
    private int filterTypeCase_ = 0;
    private Object filterType_;

    static {
        Z0 z02 = new Z0();
        DEFAULT_INSTANCE = z02;
        GeneratedMessageLite.registerDefaultInstance(Z0.class, z02);
    }

    public static void a(Z0 z02, U0 u02) {
        z02.getClass();
        u02.getClass();
        z02.filterType_ = u02;
        z02.filterTypeCase_ = 2;
    }

    public static void b(Z0 z02, C3237g1 c3237g1) {
        z02.getClass();
        c3237g1.getClass();
        z02.filterType_ = c3237g1;
        z02.filterTypeCase_ = 3;
    }

    public static void d(Z0 z02, Q0 q02) {
        z02.getClass();
        q02.getClass();
        z02.filterType_ = q02;
        z02.filterTypeCase_ = 1;
    }

    public static Z0 f() {
        return DEFAULT_INSTANCE;
    }

    public static X0 j() {
        return (X0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new Z0();
            case 2:
                return new X0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", Q0.class, U0.class, C3237g1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Z0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Z0.class) {
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

    public final Q0 e() {
        return this.filterTypeCase_ == 1 ? (Q0) this.filterType_ : Q0.d();
    }

    public final U0 g() {
        return this.filterTypeCase_ == 2 ? (U0) this.filterType_ : U0.e();
    }

    public final Y0 h() {
        int i5 = this.filterTypeCase_;
        if (i5 == 0) {
            return Y0.f39395d;
        }
        if (i5 == 1) {
            return Y0.f39392a;
        }
        if (i5 == 2) {
            return Y0.f39393b;
        }
        if (i5 != 3) {
            return null;
        }
        return Y0.f39394c;
    }

    public final C3237g1 i() {
        return this.filterTypeCase_ == 3 ? (C3237g1) this.filterType_ : C3237g1.d();
    }
}
