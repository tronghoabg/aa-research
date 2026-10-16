package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fa extends com.google.v.du<fa, ez> implements fb {
    private static final fa DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<fa> PARSER = null;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 15;
    public static final int VERTEX_FIELD_NUMBER = 1;
    private int bitField0_;
    private ce metadata_;
    private com.google.w.n.a.b temporaryData_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<es> vertex_ = emptyProtobufList();

    static {
        fa faVar = new fa();
        DEFAULT_INSTANCE = faVar;
        com.google.v.du.registerDefaultInstance(fa.class, faVar);
    }

    private fa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVertex(Iterable<? extends es> iterable) {
        ensureVertexIsMutable();
        com.google.v.c.addAll(iterable, this.vertex_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVertex(int i2, es esVar) {
        Objects.requireNonNull(esVar);
        ensureVertexIsMutable();
        this.vertex_.add(i2, esVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVertex() {
        this.vertex_ = emptyProtobufList();
    }

    private void ensureVertexIsMutable() {
        com.google.v.eo<es> eoVar = this.vertex_;
        if (eoVar.c()) {
            return;
        }
        this.vertex_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.temporaryData_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.temporaryData_ = bVar;
        this.bitField0_ |= 2;
    }

    public static ez newBuilder() {
        return (ez) DEFAULT_INSTANCE.createBuilder();
    }

    public static fa parseDelimitedFrom(InputStream inputStream) {
        return (fa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fa parseFrom(com.google.v.v vVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVertex(int i2) {
        ensureVertexIsMutable();
        this.vertex_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVertex(int i2, es esVar) {
        Objects.requireNonNull(esVar);
        ensureVertexIsMutable();
        this.vertex_.set(i2, esVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001Ǵ\u0003\u0000\u0001\u0002\u0001Л\u000fᐉ\u0001Ǵဉ\u0000", new Object[]{"bitField0_", "vertex_", es.class, "temporaryData_", "metadata_"});
            case 3:
                return new fa();
            case 4:
                return new ez(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<fa> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (fa.class) {
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

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public es getVertex(int i2) {
        return this.vertex_.get(i2);
    }

    public int getVertexCount() {
        return this.vertex_.size();
    }

    public List<es> getVertexList() {
        return this.vertex_;
    }

    public et getVertexOrBuilder(int i2) {
        return this.vertex_.get(i2);
    }

    public List<? extends et> getVertexOrBuilderList() {
        return this.vertex_;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ez newBuilder(fa faVar) {
        return (ez) DEFAULT_INSTANCE.createBuilder(faVar);
    }

    public static fa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fa parseFrom(com.google.v.z zVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVertex(es esVar) {
        Objects.requireNonNull(esVar);
        ensureVertexIsMutable();
        this.vertex_.add(esVar);
    }

    public static fa parseFrom(InputStream inputStream) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fa parseFrom(ByteBuffer byteBuffer) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fa parseFrom(byte[] bArr) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
