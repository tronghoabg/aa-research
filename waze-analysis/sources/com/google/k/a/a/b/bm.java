package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bm extends com.google.v.du<bm, bk> implements com.google.v.fj {
    public static final int BIZBUILDER_REFERENCE_FIELD_NUMBER = 9;
    private static final bm DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 7;
    public static final int OPENING_HOURS_FIELD_NUMBER = 13;
    private static volatile com.google.v.fo<bm> PARSER = null;
    public static final int PRICE_INFO_FIELD_NUMBER = 10;
    public static final int ROUTING_DESTINATION_FIELD_NUMBER = 15;
    public static final int SERVICE_AREA_FIELD_NUMBER = 14;
    public static final int TELEPHONE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private bj bizbuilderReference_;
    private kj hours_;
    private com.google.k.a.a.ge openingHours_;
    private com.google.k.a.a.iv priceInfo_;
    private bw routingDestination_;
    private com.google.k.a.a.ky serviceArea_;
    private byte memoizedIsInitialized = 2;
    private int type_ = 241;
    private com.google.v.eo<jj> telephone_ = emptyProtobufList();

    static {
        bm bmVar = new bm();
        DEFAULT_INSTANCE = bmVar;
        com.google.v.du.registerDefaultInstance(bm.class, bmVar);
    }

    private bm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTelephone(Iterable<? extends jj> iterable) {
        ensureTelephoneIsMutable();
        com.google.v.c.addAll(iterable, this.telephone_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTelephone(int i2, jj jjVar) {
        Objects.requireNonNull(jjVar);
        ensureTelephoneIsMutable();
        this.telephone_.add(i2, jjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizbuilderReference() {
        this.bizbuilderReference_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpeningHours() {
        this.openingHours_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceInfo() {
        this.priceInfo_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingDestination() {
        this.routingDestination_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceArea() {
        this.serviceArea_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTelephone() {
        this.telephone_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 241;
    }

    private void ensureTelephoneIsMutable() {
        com.google.v.eo<jj> eoVar = this.telephone_;
        if (eoVar.c()) {
            return;
        }
        this.telephone_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBizbuilderReference(bj bjVar) {
        Objects.requireNonNull(bjVar);
        bj bjVar2 = this.bizbuilderReference_;
        if (bjVar2 != null && bjVar2 != bj.getDefaultInstance()) {
            bi biVarNewBuilder = bj.newBuilder(bjVar2);
            biVarNewBuilder.mergeFrom((bi) bjVar);
            bjVar = biVarNewBuilder.buildPartial();
        }
        this.bizbuilderReference_ = bjVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHours(kj kjVar) {
        Objects.requireNonNull(kjVar);
        kj kjVar2 = this.hours_;
        if (kjVar2 != null && kjVar2 != kj.getDefaultInstance()) {
            ki kiVarNewBuilder = kj.newBuilder(kjVar2);
            kiVarNewBuilder.mergeFrom((ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.hours_ = kjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOpeningHours(com.google.k.a.a.ge geVar) {
        Objects.requireNonNull(geVar);
        com.google.k.a.a.ge geVar2 = this.openingHours_;
        if (geVar2 != null && geVar2 != com.google.k.a.a.ge.getDefaultInstance()) {
            com.google.k.a.a.gd gdVarNewBuilder = com.google.k.a.a.ge.newBuilder(geVar2);
            gdVarNewBuilder.mergeFrom((com.google.k.a.a.gd) geVar);
            geVar = gdVarNewBuilder.buildPartial();
        }
        this.openingHours_ = geVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriceInfo(com.google.k.a.a.iv ivVar) {
        Objects.requireNonNull(ivVar);
        com.google.k.a.a.iv ivVar2 = this.priceInfo_;
        if (ivVar2 != null && ivVar2 != com.google.k.a.a.iv.getDefaultInstance()) {
            com.google.k.a.a.iu iuVarNewBuilder = com.google.k.a.a.iv.newBuilder(ivVar2);
            iuVarNewBuilder.mergeFrom((com.google.k.a.a.iu) ivVar);
            ivVar = iuVarNewBuilder.buildPartial();
        }
        this.priceInfo_ = ivVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingDestination(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.routingDestination_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.routingDestination_ = bwVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServiceArea(com.google.k.a.a.ky kyVar) {
        Objects.requireNonNull(kyVar);
        com.google.k.a.a.ky kyVar2 = this.serviceArea_;
        if (kyVar2 != null && kyVar2 != com.google.k.a.a.ky.getDefaultInstance()) {
            com.google.k.a.a.kx kxVarNewBuilder = com.google.k.a.a.ky.newBuilder(kyVar2);
            kxVarNewBuilder.mergeFrom((com.google.k.a.a.kx) kyVar);
            kyVar = kxVarNewBuilder.buildPartial();
        }
        this.serviceArea_ = kyVar;
        this.bitField0_ |= 32;
    }

    public static bk newBuilder() {
        return (bk) DEFAULT_INSTANCE.createBuilder();
    }

    public static bm parseDelimitedFrom(InputStream inputStream) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(com.google.v.v vVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTelephone(int i2) {
        ensureTelephoneIsMutable();
        this.telephone_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizbuilderReference(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.bizbuilderReference_ = bjVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.hours_ = kjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpeningHours(com.google.k.a.a.ge geVar) {
        Objects.requireNonNull(geVar);
        this.openingHours_ = geVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceInfo(com.google.k.a.a.iv ivVar) {
        Objects.requireNonNull(ivVar);
        this.priceInfo_ = ivVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingDestination(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.routingDestination_ = bwVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceArea(com.google.k.a.a.ky kyVar) {
        Objects.requireNonNull(kyVar);
        this.serviceArea_ = kyVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTelephone(int i2, jj jjVar) {
        Objects.requireNonNull(jjVar);
        ensureTelephoneIsMutable();
        this.telephone_.set(i2, jjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bl blVar) {
        this.type_ = blVar.getNumber();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0001\u0005\u0001᠌\u0000\u0002Л\u0007ဉ\u0001\tဉ\u0003\nᐉ\u0004\rᐉ\u0002\u000eᐉ\u0005\u000fᐉ\u0006", new Object[]{"bitField0_", "type_", c.f11208l, "telephone_", jj.class, "hours_", "bizbuilderReference_", "priceInfo_", "openingHours_", "serviceArea_", "routingDestination_"});
            case 3:
                return new bm();
            case 4:
                return new bk(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<bm> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (bm.class) {
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

    public bj getBizbuilderReference() {
        bj bjVar = this.bizbuilderReference_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public kj getHours() {
        kj kjVar = this.hours_;
        return kjVar == null ? kj.getDefaultInstance() : kjVar;
    }

    public com.google.k.a.a.ge getOpeningHours() {
        com.google.k.a.a.ge geVar = this.openingHours_;
        return geVar == null ? com.google.k.a.a.ge.getDefaultInstance() : geVar;
    }

    public com.google.k.a.a.iv getPriceInfo() {
        com.google.k.a.a.iv ivVar = this.priceInfo_;
        return ivVar == null ? com.google.k.a.a.iv.getDefaultInstance() : ivVar;
    }

    public bw getRoutingDestination() {
        bw bwVar = this.routingDestination_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public com.google.k.a.a.ky getServiceArea() {
        com.google.k.a.a.ky kyVar = this.serviceArea_;
        return kyVar == null ? com.google.k.a.a.ky.getDefaultInstance() : kyVar;
    }

    public jj getTelephone(int i2) {
        return this.telephone_.get(i2);
    }

    public int getTelephoneCount() {
        return this.telephone_.size();
    }

    public List<jj> getTelephoneList() {
        return this.telephone_;
    }

    public jk getTelephoneOrBuilder(int i2) {
        return this.telephone_.get(i2);
    }

    public List<? extends jk> getTelephoneOrBuilderList() {
        return this.telephone_;
    }

    @Deprecated
    public bl getType() {
        bl blVarA = bl.a(this.type_);
        return blVarA == null ? bl.TYPE_UNDEFINED : blVarA;
    }

    public boolean hasBizbuilderReference() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasHours() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOpeningHours() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPriceInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRoutingDestination() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasServiceArea() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bk newBuilder(bm bmVar) {
        return (bk) DEFAULT_INSTANCE.createBuilder(bmVar);
    }

    public static bm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bm parseFrom(com.google.v.z zVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTelephone(jj jjVar) {
        Objects.requireNonNull(jjVar);
        ensureTelephoneIsMutable();
        this.telephone_.add(jjVar);
    }

    public static bm parseFrom(InputStream inputStream) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(ByteBuffer byteBuffer) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bm parseFrom(byte[] bArr) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
