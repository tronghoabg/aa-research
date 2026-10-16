package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class Z extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
    private static final Z DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    public static final int INCREMENT_FIELD_NUMBER = 3;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 5;
    private static volatile Parser<Z> PARSER = null;
    public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
    public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
    private Object transformType_;
    private int transformTypeCase_ = 0;
    private String fieldPath_ = "";

    static {
        Z z2 = new Z();
        DEFAULT_INSTANCE = z2;
        GeneratedMessageLite.registerDefaultInstance(Z.class, z2);
    }

    public static void b(Z z2, C3235g c3235g) {
        z2.getClass();
        c3235g.getClass();
        z2.transformType_ = c3235g;
        z2.transformTypeCase_ = 6;
    }

    public static void c(Z z2, String str) {
        z2.getClass();
        str.getClass();
        z2.fieldPath_ = str;
    }

    public static void d(Z z2, C3235g c3235g) {
        z2.getClass();
        c3235g.getClass();
        z2.transformType_ = c3235g;
        z2.transformTypeCase_ = 7;
    }

    public static void e(Z z2) {
        Y y10 = Y.REQUEST_TIME;
        z2.getClass();
        z2.transformType_ = Integer.valueOf(y10.getNumber());
        z2.transformTypeCase_ = 2;
    }

    public static void f(Z z2, C1 c12) {
        z2.getClass();
        c12.getClass();
        z2.transformType_ = c12;
        z2.transformTypeCase_ = 3;
    }

    public static X m() {
        return (X) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (V.f39386a[methodToInvoke.ordinal()]) {
            case 1:
                return new Z();
            case 2:
                return new X(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", C1.class, C1.class, C1.class, C3235g.class, C3235g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Z> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Z.class) {
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

    public final C3235g g() {
        return this.transformTypeCase_ == 6 ? (C3235g) this.transformType_ : C3235g.e();
    }

    public final String h() {
        return this.fieldPath_;
    }

    public final C1 i() {
        return this.transformTypeCase_ == 3 ? (C1) this.transformType_ : C1.p();
    }

    public final C3235g j() {
        return this.transformTypeCase_ == 7 ? (C3235g) this.transformType_ : C3235g.e();
    }

    public final Y k() {
        int i5 = this.transformTypeCase_;
        Y y10 = Y.SERVER_VALUE_UNSPECIFIED;
        if (i5 == 2) {
            int iIntValue = ((Integer) this.transformType_).intValue();
            if (iIntValue != 0) {
                y10 = iIntValue != 1 ? null : Y.REQUEST_TIME;
            }
            if (y10 == null) {
                return Y.UNRECOGNIZED;
            }
        }
        return y10;
    }

    public final int l() {
        int i5 = this.transformTypeCase_;
        if (i5 == 0) {
            return 7;
        }
        switch (i5) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }
}
