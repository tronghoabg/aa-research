package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfp extends com.google.v.du<bfp, bfo> implements com.google.v.fj {
    private static final bfp DEFAULT_INSTANCE;
    public static final int EXITS_COUNT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bfp> PARSER = null;
    public static final int ROADSHIELDS_COUNT_FIELD_NUMBER = 2;
    private int bitField0_;
    private long exitsCount_;
    private long roadshieldsCount_;

    static {
        bfp bfpVar = new bfp();
        DEFAULT_INSTANCE = bfpVar;
        com.google.v.du.registerDefaultInstance(bfp.class, bfpVar);
    }

    private bfp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitsCount() {
        this.bitField0_ &= -2;
        this.exitsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadshieldsCount() {
        this.bitField0_ &= -3;
        this.roadshieldsCount_ = 0L;
    }

    public static bfp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bfo newBuilder() {
        return (bfo) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfp parseDelimitedFrom(InputStream inputStream) {
        return (bfp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfp parseFrom(com.google.v.v vVar) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitsCount(long j2) {
        this.bitField0_ |= 1;
        this.exitsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadshieldsCount(long j2) {
        this.bitField0_ |= 2;
        this.roadshieldsCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "exitsCount_", "roadshieldsCount_"});
        }
        if (iOrdinal == 3) {
            return new bfp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bfo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getExitsCount() {
        return this.exitsCount_;
    }

    public long getRoadshieldsCount() {
        return this.roadshieldsCount_;
    }

    public boolean hasExitsCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoadshieldsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bfo newBuilder(bfp bfpVar) {
        return (bfo) DEFAULT_INSTANCE.createBuilder(bfpVar);
    }

    public static bfp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfp parseFrom(com.google.v.z zVar) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfp parseFrom(InputStream inputStream) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfp parseFrom(ByteBuffer byteBuffer) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfp parseFrom(byte[] bArr) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
