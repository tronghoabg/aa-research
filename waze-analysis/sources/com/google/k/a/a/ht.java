package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ht extends com.google.v.du<ht, hp> implements hu {
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 4;
    private static final ht DEFAULT_INSTANCE;
    public static final int JOB_METADATA_FIELD_NUMBER = 6;
    public static final int MEDIA_FIELD_NUMBER = 2;
    public static final int NAME_INFO_FIELD_NUMBER = 1;
    public static final int OFFERED_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<ht> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 3;
    public static final int PRICE_FORMAT_FIELD_NUMBER = 7;
    public static final int RANKING_HINT_FIELD_NUMBER = 8;
    private int bitField0_;
    private ho callToAction_;
    private int offered_;
    private int priceFormat_;
    private com.google.k.a.a.b.fe price_;
    private float rankingHint_;
    private Object typeSpecificMetadata_;
    private int typeSpecificMetadataCase_ = 0;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<iz> nameInfo_ = emptyProtobufList();
    private com.google.v.eo<is> media_ = emptyProtobufList();

    static {
        ht htVar = new ht();
        DEFAULT_INSTANCE = htVar;
        com.google.v.du.registerDefaultInstance(ht.class, htVar);
    }

    private ht() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMedia(Iterable<? extends is> iterable) {
        ensureMediaIsMutable();
        com.google.v.c.addAll(iterable, this.media_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNameInfo(Iterable<? extends iz> iterable) {
        ensureNameInfoIsMutable();
        com.google.v.c.addAll(iterable, this.nameInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMedia(int i2, is isVar) {
        Objects.requireNonNull(isVar);
        ensureMediaIsMutable();
        this.media_.add(i2, isVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(i2, izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallToAction() {
        this.callToAction_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobMetadata() {
        if (this.typeSpecificMetadataCase_ == 6) {
            this.typeSpecificMetadataCase_ = 0;
            this.typeSpecificMetadata_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedia() {
        this.media_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameInfo() {
        this.nameInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffered() {
        this.bitField0_ &= -9;
        this.offered_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceFormat() {
        this.bitField0_ &= -3;
        this.priceFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRankingHint() {
        this.bitField0_ &= -17;
        this.rankingHint_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeSpecificMetadata() {
        this.typeSpecificMetadataCase_ = 0;
        this.typeSpecificMetadata_ = null;
    }

    private void ensureMediaIsMutable() {
        com.google.v.eo<is> eoVar = this.media_;
        if (eoVar.c()) {
            return;
        }
        this.media_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureNameInfoIsMutable() {
        com.google.v.eo<iz> eoVar = this.nameInfo_;
        if (eoVar.c()) {
            return;
        }
        this.nameInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ht getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCallToAction(ho hoVar) {
        Objects.requireNonNull(hoVar);
        ho hoVar2 = this.callToAction_;
        if (hoVar2 != null && hoVar2 != ho.getDefaultInstance()) {
            hl hlVarNewBuilder = ho.newBuilder(hoVar2);
            hlVarNewBuilder.mergeFrom((hl) hoVar);
            hoVar = hlVarNewBuilder.buildPartial();
        }
        this.callToAction_ = hoVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJobMetadata(ik ikVar) {
        Objects.requireNonNull(ikVar);
        if (this.typeSpecificMetadataCase_ == 6 && this.typeSpecificMetadata_ != ik.getDefaultInstance()) {
            ij ijVarNewBuilder = ik.newBuilder((ik) this.typeSpecificMetadata_);
            ijVarNewBuilder.mergeFrom((ij) ikVar);
            ikVar = ijVarNewBuilder.buildPartial();
        }
        this.typeSpecificMetadata_ = ikVar;
        this.typeSpecificMetadataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrice(com.google.k.a.a.b.fe feVar) {
        Objects.requireNonNull(feVar);
        com.google.k.a.a.b.fe feVar2 = this.price_;
        if (feVar2 != null && feVar2 != com.google.k.a.a.b.fe.getDefaultInstance()) {
            com.google.k.a.a.b.fc fcVarNewBuilder = com.google.k.a.a.b.fe.newBuilder(feVar2);
            fcVarNewBuilder.mergeFrom((com.google.k.a.a.b.fc) feVar);
            feVar = fcVarNewBuilder.buildPartial();
        }
        this.price_ = feVar;
        this.bitField0_ |= 1;
    }

    public static hp newBuilder() {
        return (hp) DEFAULT_INSTANCE.createBuilder();
    }

    public static ht parseDelimitedFrom(InputStream inputStream) {
        return (ht) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ht parseFrom(com.google.v.v vVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ht> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMedia(int i2) {
        ensureMediaIsMutable();
        this.media_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNameInfo(int i2) {
        ensureNameInfoIsMutable();
        this.nameInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallToAction(ho hoVar) {
        Objects.requireNonNull(hoVar);
        this.callToAction_ = hoVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobMetadata(ik ikVar) {
        Objects.requireNonNull(ikVar);
        this.typeSpecificMetadata_ = ikVar;
        this.typeSpecificMetadataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedia(int i2, is isVar) {
        Objects.requireNonNull(isVar);
        ensureMediaIsMutable();
        this.media_.set(i2, isVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameInfo(int i2, iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.set(i2, izVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffered(hq hqVar) {
        this.offered_ = hqVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(com.google.k.a.a.b.fe feVar) {
        Objects.requireNonNull(feVar);
        this.price_ = feVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceFormat(hr hrVar) {
        this.priceFormat_ = hrVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankingHint(float f2) {
        this.bitField0_ |= 16;
        this.rankingHint_ = f2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0002\u0001\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004ᐉ\u0002\u0005᠌\u0003\u0006<\u0000\u0007᠌\u0001\bခ\u0004", new Object[]{"typeSpecificMetadata_", "typeSpecificMetadataCase_", "bitField0_", "nameInfo_", iz.class, "media_", is.class, "price_", "callToAction_", "offered_", ha.f11890g, ik.class, "priceFormat_", ha.f11891h, "rankingHint_"});
            case 3:
                return new ht();
            case 4:
                return new hp(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ht> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ht.class) {
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

    public ho getCallToAction() {
        ho hoVar = this.callToAction_;
        return hoVar == null ? ho.getDefaultInstance() : hoVar;
    }

    public ik getJobMetadata() {
        return this.typeSpecificMetadataCase_ == 6 ? (ik) this.typeSpecificMetadata_ : ik.getDefaultInstance();
    }

    public is getMedia(int i2) {
        return this.media_.get(i2);
    }

    public int getMediaCount() {
        return this.media_.size();
    }

    public List<is> getMediaList() {
        return this.media_;
    }

    public it getMediaOrBuilder(int i2) {
        return this.media_.get(i2);
    }

    public List<? extends it> getMediaOrBuilderList() {
        return this.media_;
    }

    public iz getNameInfo(int i2) {
        return this.nameInfo_.get(i2);
    }

    public int getNameInfoCount() {
        return this.nameInfo_.size();
    }

    public List<iz> getNameInfoList() {
        return this.nameInfo_;
    }

    public ja getNameInfoOrBuilder(int i2) {
        return this.nameInfo_.get(i2);
    }

    public List<? extends ja> getNameInfoOrBuilderList() {
        return this.nameInfo_;
    }

    public hq getOffered() {
        hq hqVarA = hq.a(this.offered_);
        return hqVarA == null ? hq.OFFERED_UNSPECIFIED : hqVarA;
    }

    public com.google.k.a.a.b.fe getPrice() {
        com.google.k.a.a.b.fe feVar = this.price_;
        return feVar == null ? com.google.k.a.a.b.fe.getDefaultInstance() : feVar;
    }

    public hr getPriceFormat() {
        hr hrVarA = hr.a(this.priceFormat_);
        return hrVarA == null ? hr.PRICE_FORMAT_DEFAULT : hrVarA;
    }

    public float getRankingHint() {
        return this.rankingHint_;
    }

    public hs getTypeSpecificMetadataCase() {
        int i2 = this.typeSpecificMetadataCase_;
        if (i2 == 0) {
            return hs.f11953b;
        }
        if (i2 != 6) {
            return null;
        }
        return hs.f11952a;
    }

    public boolean hasCallToAction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasJobMetadata() {
        return this.typeSpecificMetadataCase_ == 6;
    }

    public boolean hasOffered() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPriceFormat() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRankingHint() {
        return (this.bitField0_ & 16) != 0;
    }

    public static hp newBuilder(ht htVar) {
        return (hp) DEFAULT_INSTANCE.createBuilder(htVar);
    }

    public static ht parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ht) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ht parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ht parseFrom(com.google.v.z zVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ht parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMedia(is isVar) {
        Objects.requireNonNull(isVar);
        ensureMediaIsMutable();
        this.media_.add(isVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNameInfo(iz izVar) {
        Objects.requireNonNull(izVar);
        ensureNameInfoIsMutable();
        this.nameInfo_.add(izVar);
    }

    public static ht parseFrom(InputStream inputStream) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ht parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ht parseFrom(ByteBuffer byteBuffer) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ht parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ht parseFrom(byte[] bArr) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ht parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
