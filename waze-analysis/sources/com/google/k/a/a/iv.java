package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class iv extends com.google.v.du<iv, iu> implements com.google.v.fj {
    private static final iv DEFAULT_INSTANCE;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 49520153;
    private static volatile com.google.v.fo<iv> PARSER = null;
    public static final int PRICE_LIST_FIELD_NUMBER = 2;
    public static final int PRICE_LIST_URL_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final com.google.v.ds<com.google.w.n.a.b, iv> messageSetExtension;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.kw> priceListUrl_ = emptyProtobufList();
    private com.google.v.eo<jc> priceList_ = emptyProtobufList();
    private ix status_;

    static {
        iv ivVar = new iv();
        DEFAULT_INSTANCE = ivVar;
        com.google.v.du.registerDefaultInstance(iv.class, ivVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, iv.class);
    }

    private iv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriceList(Iterable<? extends jc> iterable) {
        ensurePriceListIsMutable();
        com.google.v.c.addAll(iterable, this.priceList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriceListUrl(Iterable<? extends com.google.k.a.a.b.kw> iterable) {
        ensurePriceListUrlIsMutable();
        com.google.v.c.addAll(iterable, this.priceListUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriceList(int i2, jc jcVar) {
        Objects.requireNonNull(jcVar);
        ensurePriceListIsMutable();
        this.priceList_.add(i2, jcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriceListUrl(int i2, com.google.k.a.a.b.kw kwVar) {
        Objects.requireNonNull(kwVar);
        ensurePriceListUrlIsMutable();
        this.priceListUrl_.add(i2, kwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceList() {
        this.priceList_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceListUrl() {
        this.priceListUrl_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void ensurePriceListIsMutable() {
        com.google.v.eo<jc> eoVar = this.priceList_;
        if (eoVar.c()) {
            return;
        }
        this.priceList_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePriceListUrlIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.kw> eoVar = this.priceListUrl_;
        if (eoVar.c()) {
            return;
        }
        this.priceListUrl_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static iv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(ix ixVar) {
        Objects.requireNonNull(ixVar);
        ix ixVar2 = this.status_;
        if (ixVar2 != null && ixVar2 != ix.getDefaultInstance()) {
            iw iwVarNewBuilder = ix.newBuilder(ixVar2);
            iwVarNewBuilder.mergeFrom((iw) ixVar);
            ixVar = iwVarNewBuilder.buildPartial();
        }
        this.status_ = ixVar;
        this.bitField0_ |= 1;
    }

    public static iu newBuilder() {
        return (iu) DEFAULT_INSTANCE.createBuilder();
    }

    public static iv parseDelimitedFrom(InputStream inputStream) {
        return (iv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iv parseFrom(com.google.v.v vVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<iv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePriceList(int i2) {
        ensurePriceListIsMutable();
        this.priceList_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePriceListUrl(int i2) {
        ensurePriceListUrlIsMutable();
        this.priceListUrl_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceList(int i2, jc jcVar) {
        Objects.requireNonNull(jcVar);
        ensurePriceListIsMutable();
        this.priceList_.set(i2, jcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceListUrl(int i2, com.google.k.a.a.b.kw kwVar) {
        Objects.requireNonNull(kwVar);
        ensurePriceListUrlIsMutable();
        this.priceListUrl_.set(i2, kwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ix ixVar) {
        Objects.requireNonNull(ixVar);
        this.status_ = ixVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဉ\u0000", new Object[]{"bitField0_", "priceListUrl_", com.google.k.a.a.b.kw.class, "priceList_", jc.class, "status_"});
            case 3:
                return new iv();
            case 4:
                return new iu(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<iv> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (iv.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public jc getPriceList(int i2) {
        return this.priceList_.get(i2);
    }

    public int getPriceListCount() {
        return this.priceList_.size();
    }

    public List<jc> getPriceListList() {
        return this.priceList_;
    }

    public jd getPriceListOrBuilder(int i2) {
        return this.priceList_.get(i2);
    }

    public List<? extends jd> getPriceListOrBuilderList() {
        return this.priceList_;
    }

    public com.google.k.a.a.b.kw getPriceListUrl(int i2) {
        return this.priceListUrl_.get(i2);
    }

    public int getPriceListUrlCount() {
        return this.priceListUrl_.size();
    }

    public List<com.google.k.a.a.b.kw> getPriceListUrlList() {
        return this.priceListUrl_;
    }

    public com.google.k.a.a.b.kx getPriceListUrlOrBuilder(int i2) {
        return this.priceListUrl_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.kx> getPriceListUrlOrBuilderList() {
        return this.priceListUrl_;
    }

    public ix getStatus() {
        ix ixVar = this.status_;
        return ixVar == null ? ix.getDefaultInstance() : ixVar;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static iu newBuilder(iv ivVar) {
        return (iu) DEFAULT_INSTANCE.createBuilder(ivVar);
    }

    public static iv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static iv parseFrom(com.google.v.z zVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static iv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriceList(jc jcVar) {
        Objects.requireNonNull(jcVar);
        ensurePriceListIsMutable();
        this.priceList_.add(jcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriceListUrl(com.google.k.a.a.b.kw kwVar) {
        Objects.requireNonNull(kwVar);
        ensurePriceListUrlIsMutable();
        this.priceListUrl_.add(kwVar);
    }

    public static iv parseFrom(InputStream inputStream) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iv parseFrom(ByteBuffer byteBuffer) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static iv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static iv parseFrom(byte[] bArr) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static iv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
