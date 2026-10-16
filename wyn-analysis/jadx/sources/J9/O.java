package J9;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* loaded from: classes4.dex */
public final class O extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final O DEFAULT_INSTANCE;
    private static volatile Parser<O> PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    static {
        O o7 = new O();
        DEFAULT_INSTANCE = o7;
        GeneratedMessageLite.registerDefaultInstance(O.class, o7);
    }

    public static void b(O o7, long j8) {
        o7.value_ = j8;
    }

    public static void c(O o7) {
        o7.value_ = 0L;
    }

    public static void d(O o7, long j8) {
        o7.startTimeEpoch_ = j8;
    }

    public static O e() {
        return DEFAULT_INSTANCE;
    }

    public static N g() {
        return (N) DEFAULT_INSTANCE.createBuilder();
    }

    public static N h(O o7) {
        return (N) DEFAULT_INSTANCE.createBuilder(o7);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (M.f5892a[methodToInvoke.ordinal()]) {
            case 1:
                return new O();
            case 2:
                return new N(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<O> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (O.class) {
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

    public final long f() {
        return this.startTimeEpoch_;
    }

    public final long getValue() {
        return this.value_;
    }
}
