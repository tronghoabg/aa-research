package ka;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;

/* loaded from: classes4.dex */
public final class s1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final s1 DEFAULT_INSTANCE;
    private static volatile Parser<s1> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Ha.c cause_;
    private Timestamp readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private Internal.IntList targetIds_ = GeneratedMessageLite.emptyIntList();
    private ByteString resumeToken_ = ByteString.EMPTY;

    static {
        s1 s1Var = new s1();
        DEFAULT_INSTANCE = s1Var;
        GeneratedMessageLite.registerDefaultInstance(s1.class, s1Var);
    }

    public static s1 c() {
        return DEFAULT_INSTANCE;
    }

    public final Ha.c b() {
        Ha.c cVar = this.cause_;
        return cVar == null ? Ha.c.c() : cVar;
    }

    public final Timestamp d() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (AbstractC3264p1.f39426a[methodToInvoke.ordinal()]) {
            case 1:
                return new s1();
            case 2:
                return new C3267q1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<s1> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (s1.class) {
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

    public final ByteString e() {
        return this.resumeToken_;
    }

    public final r1 f() {
        int i5 = this.targetChangeType_;
        r1 r1Var = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? null : r1.RESET : r1.CURRENT : r1.REMOVE : r1.ADD : r1.NO_CHANGE;
        return r1Var == null ? r1.UNRECOGNIZED : r1Var;
    }

    public final int g() {
        return this.targetIds_.size();
    }

    public final Internal.IntList h() {
        return this.targetIds_;
    }
}
