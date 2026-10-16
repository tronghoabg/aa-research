package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class N0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final N0 DEFAULT_INSTANCE;
    private static volatile Parser<N0> PARSER;
    private boolean allDescendants_;
    private String collectionId_ = "";

    static {
        N0 n02 = new N0();
        DEFAULT_INSTANCE = n02;
        GeneratedMessageLite.registerDefaultInstance(N0.class, n02);
    }

    public static void b(N0 n02, String str) {
        n02.getClass();
        str.getClass();
        n02.collectionId_ = str;
    }

    public static void c(N0 n02) {
        n02.allDescendants_ = true;
    }

    public static M0 f() {
        return (M0) DEFAULT_INSTANCE.createBuilder();
    }

    public final boolean d() {
        return this.allDescendants_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new N0();
            case 2:
                return new M0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<N0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (N0.class) {
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
        return this.collectionId_;
    }
}
