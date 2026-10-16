package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dt extends com.google.v.du<dt, ds> implements com.google.v.fj {
    private static final dt DEFAULT_INSTANCE;
    public static final int DUPLICATE_OF_FIELD_NUMBER = 2;
    public static final int FORWARDED_ID_FIELD_NUMBER = 1;
    public static final int INACTIVE_DUPLICATE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<dt> PARSER = null;
    public static final int REPLACED_BY_FIELD_NUMBER = 4;
    public static final int TRANSITIVELY_DUPLICATE_OF_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.google.k.a.a.b.bw duplicateOf_;
    private com.google.k.a.a.b.bw forwardedId_;
    private com.google.k.a.a.b.ca replacedBy_;
    private com.google.k.a.a.b.bw transitivelyDuplicateOf_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> inactiveDuplicate_ = emptyProtobufList();

    static {
        dt dtVar = new dt();
        DEFAULT_INSTANCE = dtVar;
        com.google.v.du.registerDefaultInstance(dt.class, dtVar);
    }

    private dt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInactiveDuplicate(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureInactiveDuplicateIsMutable();
        com.google.v.c.addAll(iterable, this.inactiveDuplicate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInactiveDuplicate(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureInactiveDuplicateIsMutable();
        this.inactiveDuplicate_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuplicateOf() {
        this.duplicateOf_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForwardedId() {
        this.forwardedId_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInactiveDuplicate() {
        this.inactiveDuplicate_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplacedBy() {
        this.replacedBy_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransitivelyDuplicateOf() {
        this.transitivelyDuplicateOf_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureInactiveDuplicateIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.inactiveDuplicate_;
        if (eoVar.c()) {
            return;
        }
        this.inactiveDuplicate_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static dt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDuplicateOf(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.duplicateOf_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.duplicateOf_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeForwardedId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.forwardedId_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.forwardedId_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReplacedBy(com.google.k.a.a.b.ca caVar) {
        Objects.requireNonNull(caVar);
        com.google.k.a.a.b.ca caVar2 = this.replacedBy_;
        if (caVar2 != null && caVar2 != com.google.k.a.a.b.ca.getDefaultInstance()) {
            com.google.k.a.a.b.bz bzVarNewBuilder = com.google.k.a.a.b.ca.newBuilder(caVar2);
            bzVarNewBuilder.mergeFrom((com.google.k.a.a.b.bz) caVar);
            caVar = bzVarNewBuilder.buildPartial();
        }
        this.replacedBy_ = caVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransitivelyDuplicateOf(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.transitivelyDuplicateOf_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.transitivelyDuplicateOf_ = bwVar;
        this.bitField0_ |= 4;
    }

    public static ds newBuilder() {
        return (ds) DEFAULT_INSTANCE.createBuilder();
    }

    public static dt parseDelimitedFrom(InputStream inputStream) {
        return (dt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dt parseFrom(com.google.v.v vVar) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInactiveDuplicate(int i2) {
        ensureInactiveDuplicateIsMutable();
        this.inactiveDuplicate_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuplicateOf(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.duplicateOf_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForwardedId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.forwardedId_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInactiveDuplicate(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureInactiveDuplicateIsMutable();
        this.inactiveDuplicate_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplacedBy(com.google.k.a.a.b.ca caVar) {
        Objects.requireNonNull(caVar);
        this.replacedBy_ = caVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransitivelyDuplicateOf(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.transitivelyDuplicateOf_ = bwVar;
        this.bitField0_ |= 4;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л", new Object[]{"bitField0_", "forwardedId_", "duplicateOf_", "transitivelyDuplicateOf_", "replacedBy_", "inactiveDuplicate_", com.google.k.a.a.b.bw.class});
            case 3:
                return new dt();
            case 4:
                return new ds(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<dt> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (dt.class) {
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

    public com.google.k.a.a.b.bw getDuplicateOf() {
        com.google.k.a.a.b.bw bwVar = this.duplicateOf_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public com.google.k.a.a.b.bw getForwardedId() {
        com.google.k.a.a.b.bw bwVar = this.forwardedId_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public com.google.k.a.a.b.bw getInactiveDuplicate(int i2) {
        return this.inactiveDuplicate_.get(i2);
    }

    public int getInactiveDuplicateCount() {
        return this.inactiveDuplicate_.size();
    }

    public List<com.google.k.a.a.b.bw> getInactiveDuplicateList() {
        return this.inactiveDuplicate_;
    }

    public com.google.k.a.a.b.bx getInactiveDuplicateOrBuilder(int i2) {
        return this.inactiveDuplicate_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getInactiveDuplicateOrBuilderList() {
        return this.inactiveDuplicate_;
    }

    @Deprecated
    public com.google.k.a.a.b.ca getReplacedBy() {
        com.google.k.a.a.b.ca caVar = this.replacedBy_;
        return caVar == null ? com.google.k.a.a.b.ca.getDefaultInstance() : caVar;
    }

    public com.google.k.a.a.b.bw getTransitivelyDuplicateOf() {
        com.google.k.a.a.b.bw bwVar = this.transitivelyDuplicateOf_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public boolean hasDuplicateOf() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasForwardedId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasReplacedBy() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTransitivelyDuplicateOf() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ds newBuilder(dt dtVar) {
        return (ds) DEFAULT_INSTANCE.createBuilder(dtVar);
    }

    public static dt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dt parseFrom(com.google.v.z zVar) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInactiveDuplicate(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureInactiveDuplicateIsMutable();
        this.inactiveDuplicate_.add(bwVar);
    }

    public static dt parseFrom(InputStream inputStream) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dt parseFrom(ByteBuffer byteBuffer) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dt parseFrom(byte[] bArr) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
