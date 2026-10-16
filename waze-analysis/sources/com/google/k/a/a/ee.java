package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ee extends com.google.v.du<ee, ed> implements com.google.v.fj {
    private static final ee DEFAULT_INSTANCE;
    public static final int EXCLUDES_GEOMETRY_OF_FIELD_NUMBER = 2;
    public static final int INCLUDES_GEOMETRY_OF_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ee> PARSER;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> includesGeometryOf_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.b.bw> excludesGeometryOf_ = emptyProtobufList();

    static {
        ee eeVar = new ee();
        DEFAULT_INSTANCE = eeVar;
        com.google.v.du.registerDefaultInstance(ee.class, eeVar);
    }

    private ee() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExcludesGeometryOf(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureExcludesGeometryOfIsMutable();
        com.google.v.c.addAll(iterable, this.excludesGeometryOf_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIncludesGeometryOf(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureIncludesGeometryOfIsMutable();
        com.google.v.c.addAll(iterable, this.includesGeometryOf_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludesGeometryOf(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureExcludesGeometryOfIsMutable();
        this.excludesGeometryOf_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncludesGeometryOf(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIncludesGeometryOfIsMutable();
        this.includesGeometryOf_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExcludesGeometryOf() {
        this.excludesGeometryOf_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludesGeometryOf() {
        this.includesGeometryOf_ = emptyProtobufList();
    }

    private void ensureExcludesGeometryOfIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.excludesGeometryOf_;
        if (eoVar.c()) {
            return;
        }
        this.excludesGeometryOf_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureIncludesGeometryOfIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.includesGeometryOf_;
        if (eoVar.c()) {
            return;
        }
        this.includesGeometryOf_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ee getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ed newBuilder() {
        return (ed) DEFAULT_INSTANCE.createBuilder();
    }

    public static ee parseDelimitedFrom(InputStream inputStream) {
        return (ee) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ee parseFrom(com.google.v.v vVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ee> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExcludesGeometryOf(int i2) {
        ensureExcludesGeometryOfIsMutable();
        this.excludesGeometryOf_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIncludesGeometryOf(int i2) {
        ensureIncludesGeometryOfIsMutable();
        this.includesGeometryOf_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExcludesGeometryOf(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureExcludesGeometryOfIsMutable();
        this.excludesGeometryOf_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludesGeometryOf(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIncludesGeometryOfIsMutable();
        this.includesGeometryOf_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"includesGeometryOf_", com.google.k.a.a.b.bw.class, "excludesGeometryOf_", com.google.k.a.a.b.bw.class});
            case 3:
                return new ee();
            case 4:
                return new ed(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ee> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ee.class) {
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

    public com.google.k.a.a.b.bw getExcludesGeometryOf(int i2) {
        return this.excludesGeometryOf_.get(i2);
    }

    public int getExcludesGeometryOfCount() {
        return this.excludesGeometryOf_.size();
    }

    public List<com.google.k.a.a.b.bw> getExcludesGeometryOfList() {
        return this.excludesGeometryOf_;
    }

    public com.google.k.a.a.b.bx getExcludesGeometryOfOrBuilder(int i2) {
        return this.excludesGeometryOf_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getExcludesGeometryOfOrBuilderList() {
        return this.excludesGeometryOf_;
    }

    public com.google.k.a.a.b.bw getIncludesGeometryOf(int i2) {
        return this.includesGeometryOf_.get(i2);
    }

    public int getIncludesGeometryOfCount() {
        return this.includesGeometryOf_.size();
    }

    public List<com.google.k.a.a.b.bw> getIncludesGeometryOfList() {
        return this.includesGeometryOf_;
    }

    public com.google.k.a.a.b.bx getIncludesGeometryOfOrBuilder(int i2) {
        return this.includesGeometryOf_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getIncludesGeometryOfOrBuilderList() {
        return this.includesGeometryOf_;
    }

    public static ed newBuilder(ee eeVar) {
        return (ed) DEFAULT_INSTANCE.createBuilder(eeVar);
    }

    public static ee parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ee) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ee parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ee parseFrom(com.google.v.z zVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ee parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludesGeometryOf(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureExcludesGeometryOfIsMutable();
        this.excludesGeometryOf_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIncludesGeometryOf(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIncludesGeometryOfIsMutable();
        this.includesGeometryOf_.add(bwVar);
    }

    public static ee parseFrom(InputStream inputStream) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ee parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ee parseFrom(ByteBuffer byteBuffer) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ee parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ee parseFrom(byte[] bArr) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ee parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
