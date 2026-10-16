package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ca extends com.google.v.du<ca, bz> implements com.google.v.fj {
    private static final ca DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 16709385;
    private static volatile com.google.v.fo<ca> PARSER;
    public static final com.google.v.ds<com.google.w.n.a.b, ca> messageSetExtension;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> id_ = emptyProtobufList();

    static {
        ca caVar = new ca();
        DEFAULT_INSTANCE = caVar;
        com.google.v.du.registerDefaultInstance(ca.class, caVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, ca.class);
    }

    private ca() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllId(Iterable<? extends bw> iterable) {
        ensureIdIsMutable();
        com.google.v.c.addAll(iterable, this.id_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addId(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIdIsMutable();
        this.id_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = emptyProtobufList();
    }

    private void ensureIdIsMutable() {
        com.google.v.eo<bw> eoVar = this.id_;
        if (eoVar.c()) {
            return;
        }
        this.id_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ca getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bz newBuilder() {
        return (bz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ca parseDelimitedFrom(InputStream inputStream) {
        return (ca) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ca parseFrom(com.google.v.v vVar) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ca> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeId(int i2) {
        ensureIdIsMutable();
        this.id_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIdIsMutable();
        this.id_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0001\u0003Л", new Object[]{"id_", bw.class});
            case 3:
                return new ca();
            case 4:
                return new bz(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ca> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ca.class) {
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

    public bw getId(int i2) {
        return this.id_.get(i2);
    }

    public int getIdCount() {
        return this.id_.size();
    }

    public List<bw> getIdList() {
        return this.id_;
    }

    public bx getIdOrBuilder(int i2) {
        return this.id_.get(i2);
    }

    public List<? extends bx> getIdOrBuilderList() {
        return this.id_;
    }

    public static bz newBuilder(ca caVar) {
        return (bz) DEFAULT_INSTANCE.createBuilder(caVar);
    }

    public static ca parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ca) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ca parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ca parseFrom(com.google.v.z zVar) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ca parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureIdIsMutable();
        this.id_.add(bwVar);
    }

    public static ca parseFrom(InputStream inputStream) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ca parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ca parseFrom(ByteBuffer byteBuffer) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ca parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ca parseFrom(byte[] bArr) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ca parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ca) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
