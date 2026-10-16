package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes4.dex */
public final class N1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final N1 DEFAULT_INSTANCE;
    private static volatile Parser<N1> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp commitTime_;
    private String streamId_ = "";
    private ByteString streamToken_ = ByteString.EMPTY;
    private Internal.ProtobufList<Q1> writeResults_ = GeneratedMessageLite.emptyProtobufList();

    static {
        N1 n12 = new N1();
        DEFAULT_INSTANCE = n12;
        GeneratedMessageLite.registerDefaultInstance(N1.class, n12);
    }

    public static N1 c() {
        return DEFAULT_INSTANCE;
    }

    public final Timestamp b() {
        Timestamp timestamp = this.commitTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public final ByteString d() {
        return this.streamToken_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (L1.f39357a[methodToInvoke.ordinal()]) {
            case 1:
                return new N1();
            case 2:
                return new M1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "streamId_", "streamToken_", "writeResults_", Q1.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<N1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (N1.class) {
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

    public final Q1 e(int i5) {
        return this.writeResults_.get(i5);
    }

    public final int f() {
        return this.writeResults_.size();
    }
}
