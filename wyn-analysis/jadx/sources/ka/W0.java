package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class W0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final W0 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 2;
    private static volatile Parser<W0> PARSER;
    private String fieldPath_ = "";

    static {
        W0 w02 = new W0();
        DEFAULT_INSTANCE = w02;
        GeneratedMessageLite.registerDefaultInstance(W0.class, w02);
    }

    public static void b(W0 w02, String str) {
        w02.getClass();
        str.getClass();
        w02.fieldPath_ = str;
    }

    public static W0 c() {
        return DEFAULT_INSTANCE;
    }

    public static V0 e() {
        return (V0) DEFAULT_INSTANCE.createBuilder();
    }

    public final String d() {
        return this.fieldPath_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (K0.f39355a[methodToInvoke.ordinal()]) {
            case 1:
                return new W0();
            case 2:
                return new V0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<W0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (W0.class) {
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
