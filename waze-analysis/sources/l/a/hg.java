package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hg extends com.google.v.du<hg, hf> implements com.google.v.fj {
    public static final int BANNER_SOURCE_FIELD_NUMBER = 4;
    private static final hg DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<hg> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    private int bannerSource_;
    private int bitField0_;
    private long index_;
    private String id_ = "";
    private String text_ = "";

    static {
        hg hgVar = new hg();
        DEFAULT_INSTANCE = hgVar;
        com.google.v.du.registerDefaultInstance(hg.class, hgVar);
    }

    private hg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerSource() {
        this.bannerSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static hg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hf newBuilder() {
        return (hf) DEFAULT_INSTANCE.createBuilder();
    }

    public static hg parseDelimitedFrom(InputStream inputStream) {
        return (hg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hg parseFrom(com.google.v.v vVar) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerSource(he heVar) {
        this.bannerSource_ = heVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerSourceValue(int i2) {
        this.bannerSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(long j2) {
        this.bitField0_ |= 1;
        this.index_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.text_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"bitField0_", "index_", "id_", "text_", "bannerSource_"});
        }
        if (iOrdinal == 3) {
            return new hg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public he getBannerSource() {
        int i2 = this.bannerSource_;
        he heVar = i2 != 0 ? i2 != 1 ? null : he.MAIN_MENU : he.BANNER_SOURCE_UNSPECIFIED;
        return heVar == null ? he.UNRECOGNIZED : heVar;
    }

    public int getBannerSourceValue() {
        return this.bannerSource_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public long getIndex() {
        return this.index_;
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hf newBuilder(hg hgVar) {
        return (hf) DEFAULT_INSTANCE.createBuilder(hgVar);
    }

    public static hg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hg parseFrom(com.google.v.z zVar) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hg parseFrom(InputStream inputStream) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hg parseFrom(ByteBuffer byteBuffer) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hg parseFrom(byte[] bArr) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
