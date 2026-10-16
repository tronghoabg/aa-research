package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ct extends com.google.v.du<ct, cs> implements com.google.v.fj {
    public static final int ADMINISTERED_BY_FIELD_NUMBER = 1;
    public static final int CLAIMANT_FIELD_NUMBER = 2;
    private static final ct DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ct> PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String administeredBy_ = "";
    private com.google.v.eo<com.google.k.a.a.b.bw> claimant_ = emptyProtobufList();

    static {
        ct ctVar = new ct();
        DEFAULT_INSTANCE = ctVar;
        com.google.v.du.registerDefaultInstance(ct.class, ctVar);
    }

    private ct() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClaimant(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureClaimantIsMutable();
        com.google.v.c.addAll(iterable, this.claimant_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClaimant(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureClaimantIsMutable();
        this.claimant_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdministeredBy() {
        this.bitField0_ &= -2;
        this.administeredBy_ = getDefaultInstance().getAdministeredBy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClaimant() {
        this.claimant_ = emptyProtobufList();
    }

    private void ensureClaimantIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.claimant_;
        if (eoVar.c()) {
            return;
        }
        this.claimant_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cs newBuilder() {
        return (cs) DEFAULT_INSTANCE.createBuilder();
    }

    public static ct parseDelimitedFrom(InputStream inputStream) {
        return (ct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ct parseFrom(com.google.v.v vVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeClaimant(int i2) {
        ensureClaimantIsMutable();
        this.claimant_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdministeredBy(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.administeredBy_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdministeredByBytes(com.google.v.v vVar) {
        this.administeredBy_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClaimant(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureClaimantIsMutable();
        this.claimant_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"bitField0_", "administeredBy_", "claimant_", com.google.k.a.a.b.bw.class});
            case 3:
                return new ct();
            case 4:
                return new cs(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ct> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ct.class) {
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

    public String getAdministeredBy() {
        return this.administeredBy_;
    }

    public com.google.v.v getAdministeredByBytes() {
        return com.google.v.v.s(this.administeredBy_);
    }

    public com.google.k.a.a.b.bw getClaimant(int i2) {
        return this.claimant_.get(i2);
    }

    public int getClaimantCount() {
        return this.claimant_.size();
    }

    public List<com.google.k.a.a.b.bw> getClaimantList() {
        return this.claimant_;
    }

    public com.google.k.a.a.b.bx getClaimantOrBuilder(int i2) {
        return this.claimant_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getClaimantOrBuilderList() {
        return this.claimant_;
    }

    public boolean hasAdministeredBy() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cs newBuilder(ct ctVar) {
        return (cs) DEFAULT_INSTANCE.createBuilder(ctVar);
    }

    public static ct parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ct parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ct parseFrom(com.google.v.z zVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ct parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClaimant(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureClaimantIsMutable();
        this.claimant_.add(bwVar);
    }

    public static ct parseFrom(InputStream inputStream) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ct parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ct parseFrom(ByteBuffer byteBuffer) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ct parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ct parseFrom(byte[] bArr) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ct parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ct) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
