package ka;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: ka.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3214A extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final C3214A DEFAULT_INSTANCE;
    private static volatile Parser<C3214A> PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp commitTime_;
    private Internal.ProtobufList<Q1> writeResults_ = GeneratedMessageLite.emptyProtobufList();

    static {
        C3214A c3214a = new C3214A();
        DEFAULT_INSTANCE = c3214a;
        GeneratedMessageLite.registerDefaultInstance(C3214A.class, c3214a);
    }

    public static C3214A c() {
        return DEFAULT_INSTANCE;
    }

    public final Timestamp b() {
        Timestamp timestamp = this.commitTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public final Q1 d(int i5) {
        return this.writeResults_.get(i5);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3281y.f39441a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3214A();
            case 2:
                return new C3283z(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "writeResults_", Q1.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3214A> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3214A.class) {
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

    public final int e() {
        return this.writeResults_.size();
    }
}
