package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.n1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3258n1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3258n1 DEFAULT_INSTANCE;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<C3258n1> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        C3258n1 c3258n1 = new C3258n1();
        DEFAULT_INSTANCE = c3258n1;
        GeneratedMessageLite.registerDefaultInstance(C3258n1.class, c3258n1);
    }

    public static void a(C3258n1 c3258n1, C3240h1 c3240h1) {
        c3258n1.getClass();
        c3240h1.getClass();
        c3258n1.queryType_ = c3240h1;
        c3258n1.queryTypeCase_ = 2;
    }

    public static void c(C3258n1 c3258n1, String str) {
        c3258n1.getClass();
        str.getClass();
        c3258n1.parent_ = str;
    }

    public static C3258n1 d() {
        return DEFAULT_INSTANCE;
    }

    public static C3255m1 g() {
        return (C3255m1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3243i1.f39420a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3258n1();
            case 2:
                return new C3255m1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", C3240h1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3258n1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3258n1.class) {
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

    public final String e() {
        return this.parent_;
    }

    public final C3240h1 f() {
        return this.queryTypeCase_ == 2 ? (C3240h1) this.queryType_ : C3240h1.h();
    }
}
