package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asr extends com.google.v.du<asr, asq> implements com.google.v.fj {
    private static final asr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<asr> PARSER = null;
    public static final int UCOMM_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private bmq ucommInfo_;

    static {
        asr asrVar = new asr();
        DEFAULT_INSTANCE = asrVar;
        com.google.v.du.registerDefaultInstance(asr.class, asrVar);
    }

    private asr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUcommInfo() {
        this.ucommInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static asr getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static asq newBuilder() {
        return (asq) DEFAULT_INSTANCE.createBuilder();
    }

    public static asr parseDelimitedFrom(InputStream inputStream) {
        return (asr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asr parseFrom(com.google.v.v vVar) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<asr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "ucommInfo_"});
        }
        if (iOrdinal == 3) {
            return new asr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new asq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<asr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (asr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bmq getUcommInfo() {
        bmq bmqVar = this.ucommInfo_;
        return bmqVar == null ? bmq.getDefaultInstance() : bmqVar;
    }

    public boolean hasUcommInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static asq newBuilder(asr asrVar) {
        return (asq) DEFAULT_INSTANCE.createBuilder(asrVar);
    }

    public static asr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static asr parseFrom(com.google.v.z zVar) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static asr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static asr parseFrom(InputStream inputStream) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asr parseFrom(ByteBuffer byteBuffer) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static asr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static asr parseFrom(byte[] bArr) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static asr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (asr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
