package u9;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import ka.C3252l1;
import ka.C3258n1;

/* loaded from: classes4.dex */
public final class j extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final j DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile Parser<j> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private Timestamp snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private ByteString resumeToken_ = ByteString.EMPTY;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        GeneratedMessageLite.registerDefaultInstance(j.class, jVar);
    }

    public static void b(j jVar, C3258n1 c3258n1) {
        jVar.getClass();
        c3258n1.getClass();
        jVar.targetType_ = c3258n1;
        jVar.targetTypeCase_ = 5;
    }

    public static void c(j jVar, C3252l1 c3252l1) {
        jVar.getClass();
        c3252l1.getClass();
        jVar.targetType_ = c3252l1;
        jVar.targetTypeCase_ = 6;
    }

    public static void d(j jVar, Timestamp timestamp) {
        jVar.getClass();
        timestamp.getClass();
        jVar.lastLimboFreeSnapshotVersion_ = timestamp;
        jVar.bitField0_ |= 2;
    }

    public static void e(j jVar) {
        jVar.lastLimboFreeSnapshotVersion_ = null;
        jVar.bitField0_ &= -3;
    }

    public static void f(j jVar, int i5) {
        jVar.targetId_ = i5;
    }

    public static void g(j jVar, Timestamp timestamp) {
        jVar.getClass();
        timestamp.getClass();
        jVar.snapshotVersion_ = timestamp;
        jVar.bitField0_ |= 1;
    }

    public static void h(j jVar, ByteString byteString) {
        jVar.getClass();
        byteString.getClass();
        jVar.resumeToken_ = byteString;
    }

    public static void i(j jVar, long j8) {
        jVar.lastListenSequenceNumber_ = j8;
    }

    public static h r() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static j s(byte[] bArr) {
        return (j) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (g.f46739a[methodToInvoke.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", C3258n1.class, C3252l1.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<j> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (j.class) {
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

    public final C3252l1 j() {
        return this.targetTypeCase_ == 6 ? (C3252l1) this.targetType_ : C3252l1.c();
    }

    public final Timestamp k() {
        Timestamp timestamp = this.lastLimboFreeSnapshotVersion_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public final long l() {
        return this.lastListenSequenceNumber_;
    }

    public final C3258n1 m() {
        return this.targetTypeCase_ == 5 ? (C3258n1) this.targetType_ : C3258n1.d();
    }

    public final ByteString n() {
        return this.resumeToken_;
    }

    public final Timestamp o() {
        Timestamp timestamp = this.snapshotVersion_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public final int p() {
        return this.targetId_;
    }

    public final i q() {
        int i5 = this.targetTypeCase_;
        if (i5 == 0) {
            return i.f46742c;
        }
        if (i5 == 5) {
            return i.f46740a;
        }
        if (i5 != 6) {
            return null;
        }
        return i.f46741b;
    }
}
