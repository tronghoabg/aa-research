package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class y1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final y1 DEFAULT_INSTANCE;
    private static volatile Parser<y1> PARSER = null;
    public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
    private ByteString retryTransaction_ = ByteString.EMPTY;

    static {
        y1 y1Var = new y1();
        DEFAULT_INSTANCE = y1Var;
        GeneratedMessageLite.registerDefaultInstance(y1.class, y1Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (t1.f39438a[methodToInvoke.ordinal()]) {
            case 1:
                return new y1();
            case 2:
                return new x1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<y1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (y1.class) {
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
