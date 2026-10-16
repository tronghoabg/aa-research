package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes4.dex */
public final class Q1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final Q1 DEFAULT_INSTANCE;
    private static volatile Parser<Q1> PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Internal.ProtobufList<C1> transformResults_ = GeneratedMessageLite.emptyProtobufList();
    private Timestamp updateTime_;

    static {
        Q1 q12 = new Q1();
        DEFAULT_INSTANCE = q12;
        GeneratedMessageLite.registerDefaultInstance(Q1.class, q12);
    }

    public final C1 b(int i5) {
        return this.transformResults_.get(i5);
    }

    public final int c() {
        return this.transformResults_.size();
    }

    public final Timestamp d() {
        Timestamp timestamp = this.updateTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (O1.f39359a[methodToInvoke.ordinal()]) {
            case 1:
                return new Q1();
            case 2:
                return new P1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", C1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Q1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Q1.class) {
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
