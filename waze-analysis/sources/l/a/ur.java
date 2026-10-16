package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ur extends com.google.v.du<ur, up> implements com.google.v.fj {
    private static final ur DEFAULT_INSTANCE;
    public static final int ENCOURAGEMENT_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ur> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int UCOMM_INFO_FIELD_NUMBER = 2;
    private int bitField0_;
    private uj encouragementInfo_;
    private int reason_;
    private bmq ucommInfo_;

    static {
        ur urVar = new ur();
        DEFAULT_INSTANCE = urVar;
        com.google.v.du.registerDefaultInstance(ur.class, urVar);
    }

    private ur() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncouragementInfo() {
        this.encouragementInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUcommInfo() {
        this.ucommInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static ur getDefaultInstance() {
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

    public static up newBuilder() {
        return (up) DEFAULT_INSTANCE.createBuilder();
    }

    public static ur parseDelimitedFrom(InputStream inputStream) {
        return (ur) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ur parseFrom(com.google.v.v vVar) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ur> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncouragementInfo(uj ujVar) {
        Objects.requireNonNull(ujVar);
        this.encouragementInfo_ = ujVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(uq uqVar) {
        this.reason_ = uqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "reason_", "ucommInfo_", "encouragementInfo_"});
        }
        if (iOrdinal == 3) {
            return new ur();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new up(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ur> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ur.class) {
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

    public uq getReason() {
        uq uqVar;
        switch (this.reason_) {
            case 0:
                uqVar = uq.REASON_UNSPECIFIED;
                break;
            case 1:
                uqVar = uq.ENCOURAGEMENT_SHOWN;
                break;
            case 2:
                uqVar = uq.NAVIGATING;
                break;
            case 3:
                uqVar = uq.NO_IMAGE;
                break;
            case 4:
                uqVar = uq.POPUP_SHOWN;
                break;
            case 5:
                uqVar = uq.RESUMING_NAV_POPUP;
                break;
            case 6:
                uqVar = uq.IN_CAR_PROJECTED_CONNECTED;
                break;
            case 7:
                uqVar = uq.DEEPLINK;
                break;
            case 8:
                uqVar = uq.BAD_PARAMS;
                break;
            case 9:
                uqVar = uq.FLAG_TO_PROTO_MISMATCH;
                break;
            default:
                uqVar = null;
                break;
        }
        return uqVar == null ? uq.UNRECOGNIZED : uqVar;
    }

    public int getReasonValue() {
        return this.reason_;
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

    public static up newBuilder(ur urVar) {
        return (up) DEFAULT_INSTANCE.createBuilder(urVar);
    }

    public static ur parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ur) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ur parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ur parseFrom(com.google.v.z zVar) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ur parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ur parseFrom(InputStream inputStream) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ur parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ur parseFrom(ByteBuffer byteBuffer) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ur parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ur parseFrom(byte[] bArr) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ur parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
