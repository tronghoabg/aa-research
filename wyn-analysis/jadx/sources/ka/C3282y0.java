package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: ka.y0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3282y0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3282y0 DEFAULT_INSTANCE;
    private static volatile Parser<C3282y0> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp readTime_;
    private C3226d result_;
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        C3282y0 c3282y0 = new C3282y0();
        DEFAULT_INSTANCE = c3282y0;
        GeneratedMessageLite.registerDefaultInstance(C3282y0.class, c3282y0);
    }

    public static C3282y0 b() {
        return DEFAULT_INSTANCE;
    }

    public final C3226d c() {
        C3226d c3226d = this.result_;
        return c3226d == null ? C3226d.c() : c3226d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3278w0.f39440a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3282y0();
            case 2:
                return new C3280x0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "result_", "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3282y0> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3282y0.class) {
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
