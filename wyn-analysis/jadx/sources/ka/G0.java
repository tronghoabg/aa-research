package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class G0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final G0 DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile Parser<G0> PARSER;
    private int bitField0_;
    private W0 field_;

    static {
        G0 g02 = new G0();
        DEFAULT_INSTANCE = g02;
        GeneratedMessageLite.registerDefaultInstance(G0.class, g02);
    }

    public static void b(G0 g02, W0 w02) {
        g02.getClass();
        w02.getClass();
        g02.field_ = w02;
        g02.bitField0_ |= 1;
    }

    public static F0 c() {
        return (F0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3284z0.f39442a[methodToInvoke.ordinal()]) {
            case 1:
                return new G0();
            case 2:
                return new F0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<G0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (G0.class) {
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
