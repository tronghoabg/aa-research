package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lg extends com.google.v.du<lg, lf> implements com.google.v.fj {
    private static final lg DEFAULT_INSTANCE;
    public static final int IS_MOVABLE_POST_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<lg> PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 1;
    public static final int SIGN_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isMovablePost_;
    private com.google.k.a.a.b.bw segment_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<ld> sign_ = emptyProtobufList();

    static {
        lg lgVar = new lg();
        DEFAULT_INSTANCE = lgVar;
        com.google.v.du.registerDefaultInstance(lg.class, lgVar);
    }

    private lg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSign(Iterable<? extends ld> iterable) {
        ensureSignIsMutable();
        com.google.v.c.addAll(iterable, this.sign_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSign(int i2, ld ldVar) {
        Objects.requireNonNull(ldVar);
        ensureSignIsMutable();
        this.sign_.add(i2, ldVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMovablePost() {
        this.bitField0_ &= -3;
        this.isMovablePost_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegment() {
        this.segment_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSign() {
        this.sign_ = emptyProtobufList();
    }

    private void ensureSignIsMutable() {
        com.google.v.eo<ld> eoVar = this.sign_;
        if (eoVar.c()) {
            return;
        }
        this.sign_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static lg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.segment_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.segment_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static lf newBuilder() {
        return (lf) DEFAULT_INSTANCE.createBuilder();
    }

    public static lg parseDelimitedFrom(InputStream inputStream) {
        return (lg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lg parseFrom(com.google.v.v vVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSign(int i2) {
        ensureSignIsMutable();
        this.sign_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMovablePost(boolean z) {
        this.bitField0_ |= 2;
        this.isMovablePost_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.segment_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSign(int i2, ld ldVar) {
        Objects.requireNonNull(ldVar);
        ensureSignIsMutable();
        this.sign_.set(i2, ldVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003\u001b", new Object[]{"bitField0_", "segment_", "isMovablePost_", "sign_", ld.class});
            case 3:
                return new lg();
            case 4:
                return new lf(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<lg> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (lg.class) {
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

    public boolean getIsMovablePost() {
        return this.isMovablePost_;
    }

    public com.google.k.a.a.b.bw getSegment() {
        com.google.k.a.a.b.bw bwVar = this.segment_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public ld getSign(int i2) {
        return this.sign_.get(i2);
    }

    public int getSignCount() {
        return this.sign_.size();
    }

    public List<ld> getSignList() {
        return this.sign_;
    }

    public le getSignOrBuilder(int i2) {
        return this.sign_.get(i2);
    }

    public List<? extends le> getSignOrBuilderList() {
        return this.sign_;
    }

    public boolean hasIsMovablePost() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSegment() {
        return (this.bitField0_ & 1) != 0;
    }

    public static lf newBuilder(lg lgVar) {
        return (lf) DEFAULT_INSTANCE.createBuilder(lgVar);
    }

    public static lg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lg parseFrom(com.google.v.z zVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSign(ld ldVar) {
        Objects.requireNonNull(ldVar);
        ensureSignIsMutable();
        this.sign_.add(ldVar);
    }

    public static lg parseFrom(InputStream inputStream) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lg parseFrom(ByteBuffer byteBuffer) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lg parseFrom(byte[] bArr) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
