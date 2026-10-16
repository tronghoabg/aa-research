package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ug extends com.google.v.du<ug, ue> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 3;
    private static final ug DEFAULT_INSTANCE;
    public static final int ENCOURAGEMENT_INFO_FIELD_NUMBER = 6;
    public static final int IMAGE_NAME_FIELD_NUMBER = 4;
    public static final int OPT_OUT_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<ug> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int UCOMM_INFO_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private uj encouragementInfo_;
    private String imageName_ = "";
    private boolean optOut_;
    private int type_;
    private bmq ucommInfo_;

    static {
        ug ugVar = new ug();
        DEFAULT_INSTANCE = ugVar;
        com.google.v.du.registerDefaultInstance(ug.class, ugVar);
    }

    private ug() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementInfo() {
        this.encouragementInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageName() {
        this.imageName_ = getDefaultInstance().getImageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptOut() {
        this.bitField0_ &= -3;
        this.optOut_ = false;
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

    public static ug getDefaultInstance() {
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
        this.bitField0_ |= 4;
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

    public static ue newBuilder() {
        return (ue) DEFAULT_INSTANCE.createBuilder();
    }

    public static ug parseDelimitedFrom(InputStream inputStream) {
        return (ug) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ug parseFrom(com.google.v.v vVar) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ug> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ud udVar) {
        this.action_ = udVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementInfo(uj ujVar) {
        Objects.requireNonNull(ujVar);
        this.encouragementInfo_ = ujVar;
        this.bitField0_ |= 4;
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
    public void setOptOut(boolean z) {
        this.bitField0_ |= 2;
        this.optOut_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(uf ufVar) {
        this.type_ = ufVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f\u0004Ȉ\u0005ဇ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "ucommInfo_", "type_", "action_", "imageName_", "optOut_", "encouragementInfo_"});
        }
        if (iOrdinal == 3) {
            return new ug();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ue(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ug> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ug.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ud getAction() {
        ud udVar;
        switch (this.action_) {
            case 0:
                udVar = ud.ACTION_UNSPECIFIED;
                break;
            case 1:
                udVar = ud.PRIMARY;
                break;
            case 2:
                udVar = ud.SECONDARY;
                break;
            case 3:
                udVar = ud.CARD;
                break;
            case 4:
                udVar = ud.PRIMARY_LINK;
                break;
            case 5:
                udVar = ud.SECONDARY_LINK;
                break;
            case 6:
                udVar = ud.BACK;
                break;
            case 7:
                udVar = ud.TAP_BACKGROUND;
                break;
            case 8:
                udVar = ud.X;
                break;
            default:
                udVar = null;
                break;
        }
        return udVar == null ? ud.UNRECOGNIZED : udVar;
    }

    public int getActionValue() {
        return this.action_;
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

    public boolean getOptOut() {
        return this.optOut_;
    }

    @Deprecated
    public uf getType() {
        int i2 = this.type_;
        uf ufVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : uf.ETA_POPUP : uf.ETA_CARD : uf.TYPE_UNSPECIFIED;
        return ufVar == null ? uf.UNRECOGNIZED : ufVar;
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
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOptOut() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUcommInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ue newBuilder(ug ugVar) {
        return (ue) DEFAULT_INSTANCE.createBuilder(ugVar);
    }

    public static ug parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ug) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ug parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ug parseFrom(com.google.v.z zVar) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ug parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ug parseFrom(InputStream inputStream) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ug parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ug parseFrom(ByteBuffer byteBuffer) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ug parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ug parseFrom(byte[] bArr) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ug parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ug) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
