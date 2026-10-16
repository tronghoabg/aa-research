package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kt extends com.google.v.du<kt, ks> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final kt DEFAULT_INSTANCE;
    public static final int FROM_NODE_FIELD_NUMBER = 2;
    public static final int LEVEL_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<kt> PARSER = null;
    public static final int TO_NODE_FIELD_NUMBER = 3;
    private int action_;
    private int bitField0_;
    private long fromNode_;
    private long level_;
    private long toNode_;

    static {
        kt ktVar = new kt();
        DEFAULT_INSTANCE = ktVar;
        com.google.v.du.registerDefaultInstance(kt.class, ktVar);
    }

    private kt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -2;
        this.fromNode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.bitField0_ &= -5;
        this.level_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNode() {
        this.bitField0_ &= -3;
        this.toNode_ = 0L;
    }

    public static kt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ks newBuilder() {
        return (ks) DEFAULT_INSTANCE.createBuilder();
    }

    public static kt parseDelimitedFrom(InputStream inputStream) {
        return (kt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kt parseFrom(com.google.v.v vVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(kr krVar) {
        this.action_ = krVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(long j2) {
        this.bitField0_ |= 1;
        this.fromNode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(long j2) {
        this.bitField0_ |= 4;
        this.level_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNode(long j2) {
        this.bitField0_ |= 2;
        this.toNode_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002တ\u0000\u0003တ\u0001\u0004ဂ\u0002", new Object[]{"bitField0_", "action_", "fromNode_", "toNode_", "level_"});
        }
        if (iOrdinal == 3) {
            return new kt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ks(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public kr getAction() {
        int i2 = this.action_;
        kr krVar = i2 != 0 ? i2 != 1 ? null : kr.SELECTED : kr.ACTION_UNSPECIFIED;
        return krVar == null ? kr.UNRECOGNIZED : krVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public long getFromNode() {
        return this.fromNode_;
    }

    public long getLevel() {
        return this.level_;
    }

    public long getToNode() {
        return this.toNode_;
    }

    public boolean hasFromNode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLevel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasToNode() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ks newBuilder(kt ktVar) {
        return (ks) DEFAULT_INSTANCE.createBuilder(ktVar);
    }

    public static kt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kt parseFrom(com.google.v.z zVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kt parseFrom(InputStream inputStream) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kt parseFrom(ByteBuffer byteBuffer) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kt parseFrom(byte[] bArr) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
