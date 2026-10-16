package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmq extends com.google.v.du<bmq, bmp> implements com.google.v.fj {
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 1;
    private static final bmq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bmq> PARSER = null;
    public static final int UCOMM_ID_FIELD_NUMBER = 2;
    private String campaignName_ = "";
    private String ucommId_ = "";

    static {
        bmq bmqVar = new bmq();
        DEFAULT_INSTANCE = bmqVar;
        com.google.v.du.registerDefaultInstance(bmq.class, bmqVar);
    }

    private bmq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignName() {
        this.campaignName_ = getDefaultInstance().getCampaignName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUcommId() {
        this.ucommId_ = getDefaultInstance().getUcommId();
    }

    public static bmq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bmp newBuilder() {
        return (bmp) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmq parseDelimitedFrom(InputStream inputStream) {
        return (bmq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmq parseFrom(com.google.v.v vVar) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignName(String str) {
        Objects.requireNonNull(str);
        this.campaignName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.campaignName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUcommId(String str) {
        Objects.requireNonNull(str);
        this.ucommId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUcommIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ucommId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"campaignName_", "ucommId_"});
        }
        if (iOrdinal == 3) {
            return new bmq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bmp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCampaignName() {
        return this.campaignName_;
    }

    public com.google.v.v getCampaignNameBytes() {
        return com.google.v.v.s(this.campaignName_);
    }

    public String getUcommId() {
        return this.ucommId_;
    }

    public com.google.v.v getUcommIdBytes() {
        return com.google.v.v.s(this.ucommId_);
    }

    public static bmp newBuilder(bmq bmqVar) {
        return (bmp) DEFAULT_INSTANCE.createBuilder(bmqVar);
    }

    public static bmq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmq parseFrom(com.google.v.z zVar) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmq parseFrom(InputStream inputStream) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmq parseFrom(ByteBuffer byteBuffer) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmq parseFrom(byte[] bArr) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
