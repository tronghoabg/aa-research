package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3279x extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final C3279x DEFAULT_INSTANCE;
    private static volatile Parser<C3279x> PARSER = null;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private Internal.ProtobufList<G1> writes_ = GeneratedMessageLite.emptyProtobufList();
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        C3279x c3279x = new C3279x();
        DEFAULT_INSTANCE = c3279x;
        GeneratedMessageLite.registerDefaultInstance(C3279x.class, c3279x);
    }

    public static void b(C3279x c3279x, String str) {
        c3279x.getClass();
        str.getClass();
        c3279x.database_ = str;
    }

    public static void c(C3279x c3279x, G1 g12) {
        c3279x.getClass();
        g12.getClass();
        Internal.ProtobufList<G1> protobufList = c3279x.writes_;
        if (!protobufList.isModifiable()) {
            c3279x.writes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        c3279x.writes_.add(g12);
    }

    public static C3279x d() {
        return DEFAULT_INSTANCE;
    }

    public static C3277w e() {
        return (C3277w) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3275v.f39439a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3279x();
            case 2:
                return new C3277w(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\n", new Object[]{"database_", "writes_", G1.class, "transaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3279x> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3279x.class) {
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
