package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class hu extends com.google.v.du<hu, ht> implements com.google.v.fj {
    private static final hu DEFAULT_INSTANCE;
    public static final int IMAGE_BASE_URL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<hu> PARSER = null;
    public static final int PARTNER_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.v.eo<hx> partner_ = emptyProtobufList();
    private String imageBaseUrl_ = "";

    static {
        hu huVar = new hu();
        DEFAULT_INSTANCE = huVar;
        com.google.v.du.registerDefaultInstance(hu.class, huVar);
    }

    private hu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPartner(Iterable<? extends hx> iterable) {
        ensurePartnerIsMutable();
        com.google.v.c.addAll(iterable, this.partner_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPartner(int i2, hx hxVar) {
        Objects.requireNonNull(hxVar);
        ensurePartnerIsMutable();
        this.partner_.add(i2, hxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageBaseUrl() {
        this.bitField0_ &= -2;
        this.imageBaseUrl_ = getDefaultInstance().getImageBaseUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartner() {
        this.partner_ = emptyProtobufList();
    }

    private void ensurePartnerIsMutable() {
        com.google.v.eo<hx> eoVar = this.partner_;
        if (eoVar.c()) {
            return;
        }
        this.partner_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ht newBuilder() {
        return (ht) DEFAULT_INSTANCE.createBuilder();
    }

    public static hu parseDelimitedFrom(InputStream inputStream) {
        return (hu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hu parseFrom(com.google.v.v vVar) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePartner(int i2) {
        ensurePartnerIsMutable();
        this.partner_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBaseUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.imageBaseUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBaseUrlBytes(com.google.v.v vVar) {
        this.imageBaseUrl_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartner(int i2, hx hxVar) {
        Objects.requireNonNull(hxVar);
        ensurePartnerIsMutable();
        this.partner_.set(i2, hxVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"bitField0_", "partner_", hx.class, "imageBaseUrl_"});
        }
        if (iOrdinal == 3) {
            return new hu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ht(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getImageBaseUrl() {
        return this.imageBaseUrl_;
    }

    public com.google.v.v getImageBaseUrlBytes() {
        return com.google.v.v.s(this.imageBaseUrl_);
    }

    public hx getPartner(int i2) {
        return this.partner_.get(i2);
    }

    public int getPartnerCount() {
        return this.partner_.size();
    }

    public List<hx> getPartnerList() {
        return this.partner_;
    }

    public hy getPartnerOrBuilder(int i2) {
        return this.partner_.get(i2);
    }

    public List<? extends hy> getPartnerOrBuilderList() {
        return this.partner_;
    }

    public boolean hasImageBaseUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ht newBuilder(hu huVar) {
        return (ht) DEFAULT_INSTANCE.createBuilder(huVar);
    }

    public static hu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hu parseFrom(com.google.v.z zVar) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPartner(hx hxVar) {
        Objects.requireNonNull(hxVar);
        ensurePartnerIsMutable();
        this.partner_.add(hxVar);
    }

    public static hu parseFrom(InputStream inputStream) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hu parseFrom(ByteBuffer byteBuffer) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hu parseFrom(byte[] bArr) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
