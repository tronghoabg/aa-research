package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3242i0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C3242i0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile Parser<C3242i0> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private String database_ = "";

    static {
        C3242i0 c3242i0 = new C3242i0();
        DEFAULT_INSTANCE = c3242i0;
        GeneratedMessageLite.registerDefaultInstance(C3242i0.class, c3242i0);
    }

    public static MapFieldLite b(C3242i0 c3242i0) {
        if (!c3242i0.labels_.isMutable()) {
            c3242i0.labels_ = c3242i0.labels_.mutableCopy();
        }
        return c3242i0.labels_;
    }

    public static void c(C3242i0 c3242i0, String str) {
        c3242i0.getClass();
        str.getClass();
        c3242i0.database_ = str;
    }

    public static void d(C3242i0 c3242i0, C3261o1 c3261o1) {
        c3242i0.getClass();
        c3261o1.getClass();
        c3242i0.targetChange_ = c3261o1;
        c3242i0.targetChangeCase_ = 2;
    }

    public static void e(C3242i0 c3242i0, int i5) {
        c3242i0.targetChangeCase_ = 3;
        c3242i0.targetChange_ = Integer.valueOf(i5);
    }

    public static C3242i0 f() {
        return DEFAULT_INSTANCE;
    }

    public static C3236g0 g() {
        return (C3236g0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3233f0.f39409a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3242i0();
            case 2:
                return new C3236g0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", C3261o1.class, "labels_", AbstractC3239h0.f39418a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3242i0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3242i0.class) {
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
