package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: ka.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3276v0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3276v0 DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<C3276v0> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    static {
        C3276v0 c3276v0 = new C3276v0();
        DEFAULT_INSTANCE = c3276v0;
        GeneratedMessageLite.registerDefaultInstance(C3276v0.class, c3276v0);
    }

    public static void b(C3276v0 c3276v0, String str) {
        c3276v0.getClass();
        str.getClass();
        c3276v0.parent_ = str;
    }

    public static void c(C3276v0 c3276v0, J0 j02) {
        c3276v0.getClass();
        j02.getClass();
        c3276v0.queryType_ = j02;
        c3276v0.queryTypeCase_ = 2;
    }

    public static C3276v0 d() {
        return DEFAULT_INSTANCE;
    }

    public static C3274u0 e() {
        return (C3274u0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3272t0.f39437a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3276v0();
            case 2:
                return new C3274u0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004=\u0001\u0005<\u0001\u0006<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", J0.class, z1.class, Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3276v0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3276v0.class) {
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
