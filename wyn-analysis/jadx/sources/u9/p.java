package u9;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import ka.G1;

/* loaded from: classes4.dex */
public final class p extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final p DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile Parser<p> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private Timestamp localWriteTime_;
    private Internal.ProtobufList<G1> writes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<G1> baseWrites_ = GeneratedMessageLite.emptyProtobufList();

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        GeneratedMessageLite.registerDefaultInstance(p.class, pVar);
    }

    public static void b(p pVar, int i5) {
        pVar.batchId_ = i5;
    }

    public static void c(p pVar, G1 g12) {
        pVar.getClass();
        g12.getClass();
        Internal.ProtobufList<G1> protobufList = pVar.baseWrites_;
        if (!protobufList.isModifiable()) {
            pVar.baseWrites_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        pVar.baseWrites_.add(g12);
    }

    public static void d(p pVar, G1 g12) {
        pVar.getClass();
        g12.getClass();
        Internal.ProtobufList<G1> protobufList = pVar.writes_;
        if (!protobufList.isModifiable()) {
            pVar.writes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        pVar.writes_.add(g12);
    }

    public static void e(p pVar, Timestamp timestamp) {
        pVar.getClass();
        timestamp.getClass();
        pVar.localWriteTime_ = timestamp;
        pVar.bitField0_ |= 1;
    }

    public static o l() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static p m(ByteString byteString) {
        return (p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static p n(byte[] bArr) {
        return (p) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (n.f46745a[methodToInvoke.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new o(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", G1.class, "localWriteTime_", "baseWrites_", G1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (p.class) {
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

    public final G1 f(int i5) {
        return this.baseWrites_.get(i5);
    }

    public final int g() {
        return this.baseWrites_.size();
    }

    public final int h() {
        return this.batchId_;
    }

    public final Timestamp i() {
        Timestamp timestamp = this.localWriteTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public final G1 j(int i5) {
        return this.writes_.get(i5);
    }

    public final int k() {
        return this.writes_.size();
    }
}
