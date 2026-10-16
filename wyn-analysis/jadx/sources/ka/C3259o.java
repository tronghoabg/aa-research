package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: ka.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3259o extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3259o DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile Parser<C3259o> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        C3259o c3259o = new C3259o();
        DEFAULT_INSTANCE = c3259o;
        GeneratedMessageLite.registerDefaultInstance(C3259o.class, c3259o);
    }

    public static C3259o b() {
        return DEFAULT_INSTANCE;
    }

    public final H c() {
        return this.resultCase_ == 1 ? (H) this.result_ : H.e();
    }

    public final String d() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3250l.f39422a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3259o();
            case 2:
                return new C3253m(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", H.class, "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3259o> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3259o.class) {
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

    public final Timestamp e() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public final int f() {
        int i5 = this.resultCase_;
        if (i5 == 0) {
            return 3;
        }
        int i10 = 1;
        if (i5 != 1) {
            i10 = 2;
            if (i5 != 2) {
                return 0;
            }
        }
        return i10;
    }
}
