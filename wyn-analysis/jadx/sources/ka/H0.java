package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class H0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ALIAS_FIELD_NUMBER = 7;
    public static final int AVG_FIELD_NUMBER = 3;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final H0 DEFAULT_INSTANCE;
    private static volatile Parser<H0> PARSER = null;
    public static final int SUM_FIELD_NUMBER = 2;
    private Object operator_;
    private int operatorCase_ = 0;
    private String alias_ = "";

    static {
        H0 h02 = new H0();
        DEFAULT_INSTANCE = h02;
        GeneratedMessageLite.registerDefaultInstance(H0.class, h02);
    }

    public static void b(H0 h02, E0 e02) {
        h02.getClass();
        e02.getClass();
        h02.operator_ = e02;
        h02.operatorCase_ = 1;
    }

    public static void c(H0 h02, G0 g02) {
        h02.getClass();
        g02.getClass();
        h02.operator_ = g02;
        h02.operatorCase_ = 2;
    }

    public static void d(H0 h02, B0 b02) {
        h02.getClass();
        b02.getClass();
        h02.operator_ = b02;
        h02.operatorCase_ = 3;
    }

    public static void e(H0 h02, String str) {
        h02.getClass();
        str.getClass();
        h02.alias_ = str;
    }

    public static C0 f() {
        return (C0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3284z0.f39442a[methodToInvoke.ordinal()]) {
            case 1:
                return new H0();
            case 2:
                return new C0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", E0.class, G0.class, B0.class, "alias_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<H0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (H0.class) {
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
