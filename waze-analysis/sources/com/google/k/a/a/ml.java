package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ml extends com.google.v.du<ml, mk> implements com.google.v.fj {
    private static final ml DEFAULT_INSTANCE;
    public static final int INTERSECTION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ml> PARSER;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> intersection_ = emptyProtobufList();

    static {
        ml mlVar = new ml();
        DEFAULT_INSTANCE = mlVar;
        com.google.v.du.registerDefaultInstance(ml.class, mlVar);
    }

    private ml() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIntersection(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureIntersectionIsMutable();
        com.google.v.c.addAll(iterable, this.intersection_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIntersection(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIntersectionIsMutable();
        this.intersection_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntersection() {
        this.intersection_ = emptyProtobufList();
    }

    private void ensureIntersectionIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.intersection_;
        if (eoVar.c()) {
            return;
        }
        this.intersection_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ml getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static mk newBuilder() {
        return (mk) DEFAULT_INSTANCE.createBuilder();
    }

    public static ml parseDelimitedFrom(InputStream inputStream) {
        return (ml) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ml parseFrom(com.google.v.v vVar) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ml> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIntersection(int i2) {
        ensureIntersectionIsMutable();
        this.intersection_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntersection(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIntersectionIsMutable();
        this.intersection_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"intersection_", com.google.k.a.a.b.bw.class});
            case 3:
                return new ml();
            case 4:
                return new mk(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ml> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ml.class) {
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

    public com.google.k.a.a.b.bw getIntersection(int i2) {
        return this.intersection_.get(i2);
    }

    public int getIntersectionCount() {
        return this.intersection_.size();
    }

    public List<com.google.k.a.a.b.bw> getIntersectionList() {
        return this.intersection_;
    }

    public com.google.k.a.a.b.bx getIntersectionOrBuilder(int i2) {
        return this.intersection_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getIntersectionOrBuilderList() {
        return this.intersection_;
    }

    public static mk newBuilder(ml mlVar) {
        return (mk) DEFAULT_INSTANCE.createBuilder(mlVar);
    }

    public static ml parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ml) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ml parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ml parseFrom(com.google.v.z zVar) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ml parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIntersection(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIntersectionIsMutable();
        this.intersection_.add(bwVar);
    }

    public static ml parseFrom(InputStream inputStream) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ml parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ml parseFrom(ByteBuffer byteBuffer) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ml parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ml parseFrom(byte[] bArr) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ml parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ml) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
