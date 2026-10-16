package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3218a0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3218a0 DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile Parser<C3218a0> PARSER;
    private String document_ = "";
    private Internal.ProtobufList<Z> fieldTransforms_ = GeneratedMessageLite.emptyProtobufList();

    static {
        C3218a0 c3218a0 = new C3218a0();
        DEFAULT_INSTANCE = c3218a0;
        GeneratedMessageLite.registerDefaultInstance(C3218a0.class, c3218a0);
    }

    public static C3218a0 b() {
        return DEFAULT_INSTANCE;
    }

    public final Internal.ProtobufList c() {
        return this.fieldTransforms_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (V.f39386a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3218a0();
            case 2:
                return new W(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", Z.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3218a0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3218a0.class) {
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
