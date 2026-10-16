package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asz extends com.google.v.du<asz, asy> implements com.google.v.fj {
    private static final asz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<asz> PARSER = null;
    public static final int UCOMM_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private bmq ucommInfo_;

    static {
        asz aszVar = new asz();
        DEFAULT_INSTANCE = aszVar;
        com.google.v.du.registerDefaultInstance(asz.class, aszVar);
    }

    private asz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUcommInfo() {
        this.ucommInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static asz getDefaultInstance() {
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

    public static asy newBuilder() {
        return (asy) DEFAULT_INSTANCE.createBuilder();
    }

    public static asz parseDelimitedFrom(InputStream inputStream) {
        return (asz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asz parseFrom(com.google.v.v vVar) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<asz> parser() {
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
            return new asz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new asy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<asz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (asz.class) {
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

    public static asy newBuilder(asz aszVar) {
        return (asy) DEFAULT_INSTANCE.createBuilder(aszVar);
    }

    public static asz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static asz parseFrom(com.google.v.z zVar) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static asz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static asz parseFrom(InputStream inputStream) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asz parseFrom(ByteBuffer byteBuffer) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static asz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static asz parseFrom(byte[] bArr) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static asz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (asz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
