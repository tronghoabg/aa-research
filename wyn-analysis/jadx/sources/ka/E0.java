package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class E0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final E0 DEFAULT_INSTANCE;
    private static volatile Parser<E0> PARSER = null;
    public static final int UP_TO_FIELD_NUMBER = 1;
    private int bitField0_;
    private Int64Value upTo_;

    static {
        E0 e02 = new E0();
        DEFAULT_INSTANCE = e02;
        GeneratedMessageLite.registerDefaultInstance(E0.class, e02);
    }

    public static E0 b() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3284z0.f39442a[methodToInvoke.ordinal()]) {
            case 1:
                return new E0();
            case 2:
                return new D0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "upTo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<E0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (E0.class) {
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
