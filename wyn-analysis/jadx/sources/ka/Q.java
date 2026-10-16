package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class Q extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final Q DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile Parser<Q> PARSER;
    private Internal.ProtobufList<String> fieldPaths_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Q q4 = new Q();
        DEFAULT_INSTANCE = q4;
        GeneratedMessageLite.registerDefaultInstance(Q.class, q4);
    }

    public static void b(Q q4, String str) {
        q4.getClass();
        str.getClass();
        Internal.ProtobufList<String> protobufList = q4.fieldPaths_;
        if (!protobufList.isModifiable()) {
            q4.fieldPaths_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        q4.fieldPaths_.add(str);
    }

    public static Q c() {
        return DEFAULT_INSTANCE;
    }

    public static P f() {
        return (P) DEFAULT_INSTANCE.createBuilder();
    }

    public final String d(int i5) {
        return this.fieldPaths_.get(i5);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (O.f39358a[methodToInvoke.ordinal()]) {
            case 1:
                return new Q();
            case 2:
                return new P(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Q> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Q.class) {
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

    public final int e() {
        return this.fieldPaths_.size();
    }
}
