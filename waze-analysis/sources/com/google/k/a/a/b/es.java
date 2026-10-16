package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class es extends com.google.v.du<es, er> implements et {
    private static final es DEFAULT_INSTANCE;
    public static final int LAT_E7_FIELD_NUMBER = 1;
    public static final int LNG_E7_FIELD_NUMBER = 2;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 14827556;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<es> PARSER = null;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 15;
    public static final com.google.v.ds<com.google.w.n.a.b, es> messageSetExtension;
    private int bitField0_;
    private int latE7_;
    private int lngE7_;
    private byte memoizedIsInitialized = 2;
    private ce metadata_;
    private com.google.w.n.a.b temporaryData_;

    static {
        es esVar = new es();
        DEFAULT_INSTANCE = esVar;
        com.google.v.du.registerDefaultInstance(es.class, esVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, es.class);
    }

    private es() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatE7() {
        this.bitField0_ &= -2;
        this.latE7_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLngE7() {
        this.bitField0_ &= -3;
        this.lngE7_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -9;
    }

    public static es getDefaultInstance() {
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
        this.bitField0_ |= 4;
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
        this.bitField0_ |= 8;
    }

    public static er newBuilder() {
        return (er) DEFAULT_INSTANCE.createBuilder();
    }

    public static es parseDelimitedFrom(InputStream inputStream) {
        return (es) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static es parseFrom(com.google.v.v vVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<es> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatE7(int i2) {
        this.bitField0_ |= 1;
        this.latE7_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLngE7(int i2) {
        this.bitField0_ |= 2;
        this.lngE7_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 8;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001Ǵ\u0004\u0000\u0000\u0003\u0001ᔆ\u0000\u0002ᔆ\u0001\u000fᐉ\u0003Ǵဉ\u0002", new Object[]{"bitField0_", "latE7_", "lngE7_", "temporaryData_", "metadata_"});
            case 3:
                return new es();
            case 4:
                return new er(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<es> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (es.class) {
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

    public int getLatE7() {
        return this.latE7_;
    }

    public int getLngE7() {
        return this.lngE7_;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public boolean hasLatE7() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLngE7() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 8) != 0;
    }

    public static er newBuilder(es esVar) {
        return (er) DEFAULT_INSTANCE.createBuilder(esVar);
    }

    public static es parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (es) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static es parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static es parseFrom(com.google.v.z zVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static es parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static es parseFrom(InputStream inputStream) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static es parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static es parseFrom(ByteBuffer byteBuffer) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static es parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static es parseFrom(byte[] bArr) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static es parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
