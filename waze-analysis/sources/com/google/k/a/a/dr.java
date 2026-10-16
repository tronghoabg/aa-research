package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dr extends com.google.v.du<dr, dq> implements com.google.v.fj {
    private static final dr DEFAULT_INSTANCE;
    public static final int DERIVED_FROM_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<dr> PARSER = null;
    public static final int REPLACED_BY_FIELD_NUMBER = 2;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> derivedFrom_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.b.bw> replacedBy_ = emptyProtobufList();

    static {
        dr drVar = new dr();
        DEFAULT_INSTANCE = drVar;
        com.google.v.du.registerDefaultInstance(dr.class, drVar);
    }

    private dr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDerivedFrom(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureDerivedFromIsMutable();
        com.google.v.c.addAll(iterable, this.derivedFrom_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReplacedBy(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureReplacedByIsMutable();
        com.google.v.c.addAll(iterable, this.replacedBy_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDerivedFrom(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureDerivedFromIsMutable();
        this.derivedFrom_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReplacedBy(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureReplacedByIsMutable();
        this.replacedBy_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDerivedFrom() {
        this.derivedFrom_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplacedBy() {
        this.replacedBy_ = emptyProtobufList();
    }

    private void ensureDerivedFromIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.derivedFrom_;
        if (eoVar.c()) {
            return;
        }
        this.derivedFrom_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureReplacedByIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.replacedBy_;
        if (eoVar.c()) {
            return;
        }
        this.replacedBy_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static dr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dq newBuilder() {
        return (dq) DEFAULT_INSTANCE.createBuilder();
    }

    public static dr parseDelimitedFrom(InputStream inputStream) {
        return (dr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dr parseFrom(com.google.v.v vVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDerivedFrom(int i2) {
        ensureDerivedFromIsMutable();
        this.derivedFrom_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReplacedBy(int i2) {
        ensureReplacedByIsMutable();
        this.replacedBy_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDerivedFrom(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureDerivedFromIsMutable();
        this.derivedFrom_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplacedBy(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureReplacedByIsMutable();
        this.replacedBy_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"derivedFrom_", com.google.k.a.a.b.bw.class, "replacedBy_", com.google.k.a.a.b.bw.class});
            case 3:
                return new dr();
            case 4:
                return new dq(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<dr> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (dr.class) {
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

    public com.google.k.a.a.b.bw getDerivedFrom(int i2) {
        return this.derivedFrom_.get(i2);
    }

    public int getDerivedFromCount() {
        return this.derivedFrom_.size();
    }

    public List<com.google.k.a.a.b.bw> getDerivedFromList() {
        return this.derivedFrom_;
    }

    public com.google.k.a.a.b.bx getDerivedFromOrBuilder(int i2) {
        return this.derivedFrom_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getDerivedFromOrBuilderList() {
        return this.derivedFrom_;
    }

    public com.google.k.a.a.b.bw getReplacedBy(int i2) {
        return this.replacedBy_.get(i2);
    }

    public int getReplacedByCount() {
        return this.replacedBy_.size();
    }

    public List<com.google.k.a.a.b.bw> getReplacedByList() {
        return this.replacedBy_;
    }

    public com.google.k.a.a.b.bx getReplacedByOrBuilder(int i2) {
        return this.replacedBy_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getReplacedByOrBuilderList() {
        return this.replacedBy_;
    }

    public static dq newBuilder(dr drVar) {
        return (dq) DEFAULT_INSTANCE.createBuilder(drVar);
    }

    public static dr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dr parseFrom(com.google.v.z zVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDerivedFrom(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureDerivedFromIsMutable();
        this.derivedFrom_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReplacedBy(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureReplacedByIsMutable();
        this.replacedBy_.add(bwVar);
    }

    public static dr parseFrom(InputStream inputStream) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dr parseFrom(ByteBuffer byteBuffer) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dr parseFrom(byte[] bArr) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
