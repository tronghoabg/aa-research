package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asv extends com.google.v.du<asv, asu> implements com.google.v.fj {
    private static final asv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<asv> PARSER = null;
    public static final int UCOMM_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private bmq ucommInfo_;

    static {
        asv asvVar = new asv();
        DEFAULT_INSTANCE = asvVar;
        com.google.v.du.registerDefaultInstance(asv.class, asvVar);
    }

    private asv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUcommInfo() {
        this.ucommInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static asv getDefaultInstance() {
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

    public static asu newBuilder() {
        return (asu) DEFAULT_INSTANCE.createBuilder();
    }

    public static asv parseDelimitedFrom(InputStream inputStream) {
        return (asv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asv parseFrom(com.google.v.v vVar) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<asv> parser() {
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
            return new asv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new asu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<asv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (asv.class) {
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

    public static asu newBuilder(asv asvVar) {
        return (asu) DEFAULT_INSTANCE.createBuilder(asvVar);
    }

    public static asv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static asv parseFrom(com.google.v.z zVar) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static asv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static asv parseFrom(InputStream inputStream) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asv parseFrom(ByteBuffer byteBuffer) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static asv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static asv parseFrom(byte[] bArr) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static asv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (asv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
