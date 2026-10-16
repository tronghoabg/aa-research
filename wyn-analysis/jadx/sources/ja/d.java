package ja;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import ka.C3240h1;

/* loaded from: classes4.dex */
public final class d extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final d DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<d> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.registerDefaultInstance(d.class, dVar);
    }

    public static void b(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.parent_ = str;
    }

    public static void c(d dVar, C3240h1 c3240h1) {
        dVar.getClass();
        c3240h1.getClass();
        dVar.queryType_ = c3240h1;
        dVar.queryTypeCase_ = 2;
    }

    public static void d(d dVar, c cVar) {
        dVar.getClass();
        dVar.limitType_ = cVar.getNumber();
    }

    public static b h() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static d i(byte[] bArr) {
        return (d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3097a.f38692a[methodToInvoke.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", C3240h1.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<d> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (d.class) {
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

    public final c e() {
        int i5 = this.limitType_;
        c cVar = i5 != 0 ? i5 != 1 ? null : c.LAST : c.FIRST;
        return cVar == null ? c.UNRECOGNIZED : cVar;
    }

    public final String f() {
        return this.parent_;
    }

    public final C3240h1 g() {
        return this.queryTypeCase_ == 2 ? (C3240h1) this.queryType_ : C3240h1.h();
    }
}
