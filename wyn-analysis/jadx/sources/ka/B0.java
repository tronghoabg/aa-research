package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class B0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final B0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile Parser<B0> PARSER;
    private int bitField0_;
    private W0 field_;

    static {
        B0 b02 = new B0();
        DEFAULT_INSTANCE = b02;
        GeneratedMessageLite.registerDefaultInstance(B0.class, b02);
    }

    public static void b(B0 b02, W0 w02) {
        b02.getClass();
        w02.getClass();
        b02.field_ = w02;
        b02.bitField0_ |= 1;
    }

    public static A0 c() {
        return (A0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3284z0.f39442a[methodToInvoke.ordinal()]) {
            case 1:
                return new B0();
            case 2:
                return new A0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<B0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (B0.class) {
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
