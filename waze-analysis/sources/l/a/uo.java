package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class uo extends com.google.v.du<uo, um> implements com.google.v.fj {
    private static final uo DEFAULT_INSTANCE;
    public static final int ENCOURAGEMENT_INFO_FIELD_NUMBER = 4;
    public static final int IMAGE_NAME_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<uo> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int UCOMM_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private uj encouragementInfo_;
    private String imageName_ = "";
    private int type_;
    private bmq ucommInfo_;

    static {
        uo uoVar = new uo();
        DEFAULT_INSTANCE = uoVar;
        com.google.v.du.registerDefaultInstance(uo.class, uoVar);
    }

    private uo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementInfo() {
        this.encouragementInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageName() {
        this.imageName_ = getDefaultInstance().getImageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUcommInfo() {
        this.ucommInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static uo getDefaultInstance() {
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

    public static um newBuilder() {
        return (um) DEFAULT_INSTANCE.createBuilder();
    }

    public static uo parseDelimitedFrom(InputStream inputStream) {
        return (uo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uo parseFrom(com.google.v.v vVar) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<uo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementInfo(uj ujVar) {
        Objects.requireNonNull(ujVar);
        this.encouragementInfo_ = ujVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageName(String str) {
        Objects.requireNonNull(str);
        this.imageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.imageName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(un unVar) {
        this.type_ = unVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ\u0004ဉ\u0001", new Object[]{"bitField0_", "ucommInfo_", "type_", "imageName_", "encouragementInfo_"});
        }
        if (iOrdinal == 3) {
            return new uo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new um(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<uo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (uo.class) {
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

    @Deprecated
    public String getImageName() {
        return this.imageName_;
    }

    @Deprecated
    public com.google.v.v getImageNameBytes() {
        return com.google.v.v.s(this.imageName_);
    }

    @Deprecated
    public un getType() {
        int i2 = this.type_;
        un unVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : un.ETA_POPUP : un.ETA_CARD : un.TYPE_UNSPECIFIED;
        return unVar == null ? un.UNRECOGNIZED : unVar;
    }

    @Deprecated
    public int getTypeValue() {
        return this.type_;
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

    public static um newBuilder(uo uoVar) {
        return (um) DEFAULT_INSTANCE.createBuilder(uoVar);
    }

    public static uo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static uo parseFrom(com.google.v.z zVar) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static uo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static uo parseFrom(InputStream inputStream) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uo parseFrom(ByteBuffer byteBuffer) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static uo parseFrom(byte[] bArr) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static uo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (uo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
