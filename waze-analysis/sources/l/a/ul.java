package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ul extends com.google.v.du<ul, uk> implements com.google.v.fj {
    private static final ul DEFAULT_INSTANCE;
    public static final int ENCOURAGEMENT_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ul> PARSER = null;
    public static final int UCOMM_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private uj encouragementInfo_;
    private bmq ucommInfo_;

    static {
        ul ulVar = new ul();
        DEFAULT_INSTANCE = ulVar;
        com.google.v.du.registerDefaultInstance(ul.class, ulVar);
    }

    private ul() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementInfo() {
        this.encouragementInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUcommInfo() {
        this.ucommInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static ul getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEncouragementInfo(uj ujVar) {
        Objects.requireNonNull(ujVar);
        uj ujVar2 = this.encouragementInfo_;
        if (ujVar2 != null && ujVar2 != uj.getDefaultInstance()) {
            uh uhVarNewBuilder = uj.newBuilder(ujVar2);
            uhVarNewBuilder.mergeFrom((uh) ujVar);
            ujVar = uhVarNewBuilder.buildPartial();
        }
        this.encouragementInfo_ = ujVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUcommInfo(bmq bmqVar) {
        Objects.requireNonNull(bmqVar);
        bmq bmqVar2 = this.ucommInfo_;
        if (bmqVar2 != null && bmqVar2 != bmq.getDefaultInstance()) {
            bmp bmpVarNewBuilder = bmq.newBuilder(bmqVar2);
            bmpVarNewBuilder.mergeFrom((bmp) bmqVar);
            bmqVar = bmpVarNewBuilder.buildPartial();
        }
        this.ucommInfo_ = bmqVar;
        this.bitField0_ |= 1;
    }

    public static uk newBuilder() {
        return (uk) DEFAULT_INSTANCE.createBuilder();
    }

    public static ul parseDelimitedFrom(InputStream inputStream) {
        return (ul) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ul parseFrom(com.google.v.v vVar) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ul> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementInfo(uj ujVar) {
        Objects.requireNonNull(ujVar);
        this.encouragementInfo_ = ujVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUcommInfo(bmq bmqVar) {
        Objects.requireNonNull(bmqVar);
        this.ucommInfo_ = bmqVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "ucommInfo_", "encouragementInfo_"});
        }
        if (iOrdinal == 3) {
            return new ul();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new uk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ul> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ul.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public uj getEncouragementInfo() {
        uj ujVar = this.encouragementInfo_;
        return ujVar == null ? uj.getDefaultInstance() : ujVar;
    }

    public bmq getUcommInfo() {
        bmq bmqVar = this.ucommInfo_;
        return bmqVar == null ? bmq.getDefaultInstance() : bmqVar;
    }

    public boolean hasEncouragementInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUcommInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static uk newBuilder(ul ulVar) {
        return (uk) DEFAULT_INSTANCE.createBuilder(ulVar);
    }

    public static ul parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ul) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ul parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ul parseFrom(com.google.v.z zVar) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ul parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ul parseFrom(InputStream inputStream) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ul parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ul parseFrom(ByteBuffer byteBuffer) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ul parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ul parseFrom(byte[] bArr) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ul parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ul) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
