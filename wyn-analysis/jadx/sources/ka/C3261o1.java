package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* renamed from: ka.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3261o1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final C3261o1 DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile Parser<C3261o1> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private Int32Value expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static {
        C3261o1 c3261o1 = new C3261o1();
        DEFAULT_INSTANCE = c3261o1;
        GeneratedMessageLite.registerDefaultInstance(C3261o1.class, c3261o1);
    }

    public static void b(C3261o1 c3261o1, C3258n1 c3258n1) {
        c3261o1.getClass();
        c3258n1.getClass();
        c3261o1.targetType_ = c3258n1;
        c3261o1.targetTypeCase_ = 2;
    }

    public static void c(C3261o1 c3261o1, C3252l1 c3252l1) {
        c3261o1.getClass();
        c3252l1.getClass();
        c3261o1.targetType_ = c3252l1;
        c3261o1.targetTypeCase_ = 3;
    }

    public static void d(C3261o1 c3261o1, ByteString byteString) {
        c3261o1.getClass();
        byteString.getClass();
        c3261o1.resumeTypeCase_ = 4;
        c3261o1.resumeType_ = byteString;
    }

    public static void e(C3261o1 c3261o1, Timestamp timestamp) {
        c3261o1.getClass();
        timestamp.getClass();
        c3261o1.resumeType_ = timestamp;
        c3261o1.resumeTypeCase_ = 11;
    }

    public static void f(C3261o1 c3261o1, int i5) {
        c3261o1.targetId_ = i5;
    }

    public static void g(C3261o1 c3261o1, Int32Value int32Value) {
        c3261o1.getClass();
        int32Value.getClass();
        c3261o1.expectedCount_ = int32Value;
        c3261o1.bitField0_ |= 1;
    }

    public static C3246j1 h() {
        return (C3246j1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3243i1.f39420a[methodToInvoke.ordinal()]) {
            case 1:
                return new C3261o1();
            case 2:
                return new C3246j1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0001\u0002\f\u0007\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", C3258n1.class, C3252l1.class, "targetId_", "once_", Timestamp.class, "expectedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<C3261o1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (C3261o1.class) {
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
