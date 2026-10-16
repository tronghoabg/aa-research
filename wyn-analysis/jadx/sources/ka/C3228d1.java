package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* renamed from: ka.d1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3228d1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3228d1 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    private static volatile Parser<C3228d1> PARSER;
    private Internal.ProtobufList<W0> fields_ = GeneratedMessageLite.emptyProtobufList();

    static {
        C3228d1 c3228d1 = new C3228d1();
        DEFAULT_INSTANCE = c3228d1;
        GeneratedMessageLite.registerDefaultInstance(C3228d1.class, c3228d1);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3228d1();
            case 2:
                return new C3225c1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", W0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3228d1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3228d1.class) {
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
