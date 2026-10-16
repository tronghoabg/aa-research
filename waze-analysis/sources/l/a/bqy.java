package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqy extends com.google.v.du<bqy, bqx> implements com.google.v.fj {
    private static final bqy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bqy> PARSER = null;
    public static final int WALKING_MODE_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private bra walkingModeInfo_;

    static {
        bqy bqyVar = new bqy();
        DEFAULT_INSTANCE = bqyVar;
        com.google.v.du.registerDefaultInstance(bqy.class, bqyVar);
    }

    private bqy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingModeInfo() {
        this.walkingModeInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static bqy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWalkingModeInfo(bra braVar) {
        Objects.requireNonNull(braVar);
        bra braVar2 = this.walkingModeInfo_;
        if (braVar2 != null && braVar2 != bra.getDefaultInstance()) {
            bqz bqzVarNewBuilder = bra.newBuilder(braVar2);
            bqzVarNewBuilder.mergeFrom((bqz) braVar);
            braVar = bqzVarNewBuilder.buildPartial();
        }
        this.walkingModeInfo_ = braVar;
        this.bitField0_ |= 1;
    }

    public static bqx newBuilder() {
        return (bqx) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqy parseDelimitedFrom(InputStream inputStream) {
        return (bqy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqy parseFrom(com.google.v.v vVar) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingModeInfo(bra braVar) {
        Objects.requireNonNull(braVar);
        this.walkingModeInfo_ = braVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "walkingModeInfo_"});
        }
        if (iOrdinal == 3) {
            return new bqy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bra getWalkingModeInfo() {
        bra braVar = this.walkingModeInfo_;
        return braVar == null ? bra.getDefaultInstance() : braVar;
    }

    public boolean hasWalkingModeInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bqx newBuilder(bqy bqyVar) {
        return (bqx) DEFAULT_INSTANCE.createBuilder(bqyVar);
    }

    public static bqy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqy parseFrom(com.google.v.z zVar) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqy parseFrom(InputStream inputStream) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqy parseFrom(ByteBuffer byteBuffer) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqy parseFrom(byte[] bArr) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
