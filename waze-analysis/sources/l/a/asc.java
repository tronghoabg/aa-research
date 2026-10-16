package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class asc extends com.google.v.du<asc, asa> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int DEEPLINK_URL_FIELD_NUMBER = 3;
    private static final asc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<asc> PARSER = null;
    public static final int PROMOTIONAL_CHIP_INFO_FIELD_NUMBER = 2;
    private int action_;
    private int bitField0_;
    private String deeplinkUrl_ = "";
    private ase promotionalChipInfo_;

    static {
        asc ascVar = new asc();
        DEFAULT_INSTANCE = ascVar;
        com.google.v.du.registerDefaultInstance(asc.class, ascVar);
    }

    private asc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeeplinkUrl() {
        this.deeplinkUrl_ = getDefaultInstance().getDeeplinkUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionalChipInfo() {
        this.promotionalChipInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static asc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromotionalChipInfo(ase aseVar) {
        Objects.requireNonNull(aseVar);
        ase aseVar2 = this.promotionalChipInfo_;
        if (aseVar2 != null && aseVar2 != ase.getDefaultInstance()) {
            asd asdVarNewBuilder = ase.newBuilder(aseVar2);
            asdVarNewBuilder.mergeFrom((asd) aseVar);
            aseVar = asdVarNewBuilder.buildPartial();
        }
        this.promotionalChipInfo_ = aseVar;
        this.bitField0_ |= 1;
    }

    public static asa newBuilder() {
        return (asa) DEFAULT_INSTANCE.createBuilder();
    }

    public static asc parseDelimitedFrom(InputStream inputStream) {
        return (asc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asc parseFrom(com.google.v.v vVar) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<asc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(asb asbVar) {
        this.action_ = asbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplinkUrl(String str) {
        Objects.requireNonNull(str);
        this.deeplinkUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplinkUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deeplinkUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionalChipInfo(ase aseVar) {
        Objects.requireNonNull(aseVar);
        this.promotionalChipInfo_ = aseVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "action_", "promotionalChipInfo_", "deeplinkUrl_"});
        }
        if (iOrdinal == 3) {
            return new asc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new asa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<asc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (asc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public asb getAction() {
        int i2 = this.action_;
        asb asbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : asb.CLOSE : asb.CTA : asb.PROMOTIONAL_CHIP_ACTION_UNSPECIFIED;
        return asbVar == null ? asb.UNRECOGNIZED : asbVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getDeeplinkUrl() {
        return this.deeplinkUrl_;
    }

    public com.google.v.v getDeeplinkUrlBytes() {
        return com.google.v.v.s(this.deeplinkUrl_);
    }

    public ase getPromotionalChipInfo() {
        ase aseVar = this.promotionalChipInfo_;
        return aseVar == null ? ase.getDefaultInstance() : aseVar;
    }

    public boolean hasPromotionalChipInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static asa newBuilder(asc ascVar) {
        return (asa) DEFAULT_INSTANCE.createBuilder(ascVar);
    }

    public static asc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static asc parseFrom(com.google.v.z zVar) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static asc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static asc parseFrom(InputStream inputStream) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static asc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static asc parseFrom(ByteBuffer byteBuffer) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static asc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static asc parseFrom(byte[] bArr) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static asc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (asc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
