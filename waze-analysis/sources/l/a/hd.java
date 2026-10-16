package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hd extends com.google.v.du<hd, hc> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int BANNER_INFO_FIELD_NUMBER = 1;
    private static final hd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hd> PARSER = null;
    public static final int URL_FIELD_NUMBER = 3;
    private int action_;
    private hg bannerInfo_;
    private int bitField0_;
    private String url_ = "";

    static {
        hd hdVar = new hd();
        DEFAULT_INSTANCE = hdVar;
        com.google.v.du.registerDefaultInstance(hd.class, hdVar);
    }

    private hd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerInfo() {
        this.bannerInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static hd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBannerInfo(hg hgVar) {
        Objects.requireNonNull(hgVar);
        hg hgVar2 = this.bannerInfo_;
        if (hgVar2 != null && hgVar2 != hg.getDefaultInstance()) {
            hf hfVarNewBuilder = hg.newBuilder(hgVar2);
            hfVarNewBuilder.mergeFrom((hf) hgVar);
            hgVar = hfVarNewBuilder.buildPartial();
        }
        this.bannerInfo_ = hgVar;
        this.bitField0_ |= 1;
    }

    public static hc newBuilder() {
        return (hc) DEFAULT_INSTANCE.createBuilder();
    }

    public static hd parseDelimitedFrom(InputStream inputStream) {
        return (hd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hd parseFrom(com.google.v.v vVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(hb hbVar) {
        this.action_ = hbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerInfo(hg hgVar) {
        Objects.requireNonNull(hgVar);
        this.bannerInfo_ = hgVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.url_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003Ȉ", new Object[]{"bitField0_", "bannerInfo_", "action_", "url_"});
        }
        if (iOrdinal == 3) {
            return new hd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hb getAction() {
        int i2 = this.action_;
        hb hbVar = i2 != 0 ? i2 != 1 ? null : hb.BANNER_CLICKED : hb.ACTION_UNSPECIFIED;
        return hbVar == null ? hb.UNRECOGNIZED : hbVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public hg getBannerInfo() {
        hg hgVar = this.bannerInfo_;
        return hgVar == null ? hg.getDefaultInstance() : hgVar;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public boolean hasBannerInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hc newBuilder(hd hdVar) {
        return (hc) DEFAULT_INSTANCE.createBuilder(hdVar);
    }

    public static hd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hd parseFrom(com.google.v.z zVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hd parseFrom(InputStream inputStream) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hd parseFrom(ByteBuffer byteBuffer) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hd parseFrom(byte[] bArr) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
