package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asp extends com.google.v.du<asp, aso> implements com.google.v.fj {
    public static final int BUTTON_NAME_FIELD_NUMBER = 2;
    private static final asp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<asp> PARSER = null;
    public static final int UCOMM_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private String buttonName_ = "";
    private bmq ucommInfo_;

    static {
        asp aspVar = new asp();
        DEFAULT_INSTANCE = aspVar;
        com.google.v.du.registerDefaultInstance(asp.class, aspVar);
    }

    private asp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonName() {
        this.buttonName_ = getDefaultInstance().getButtonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUcommInfo() {
        this.ucommInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static asp getDefaultInstance() {
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

    public static aso newBuilder() {
        return (aso) DEFAULT_INSTANCE.createBuilder();
    }

    public static asp parseDelimitedFrom(InputStream inputStream) {
        return (asp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asp parseFrom(com.google.v.v vVar) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<asp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonName(String str) {
        Objects.requireNonNull(str);
        this.buttonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.buttonName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "ucommInfo_", "buttonName_"});
        }
        if (iOrdinal == 3) {
            return new asp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aso(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<asp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (asp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getButtonName() {
        return this.buttonName_;
    }

    public com.google.v.v getButtonNameBytes() {
        return com.google.v.v.s(this.buttonName_);
    }

    public bmq getUcommInfo() {
        bmq bmqVar = this.ucommInfo_;
        return bmqVar == null ? bmq.getDefaultInstance() : bmqVar;
    }

    public boolean hasUcommInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aso newBuilder(asp aspVar) {
        return (aso) DEFAULT_INSTANCE.createBuilder(aspVar);
    }

    public static asp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static asp parseFrom(com.google.v.z zVar) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static asp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static asp parseFrom(InputStream inputStream) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asp parseFrom(ByteBuffer byteBuffer) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static asp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static asp parseFrom(byte[] bArr) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static asp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (asp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
