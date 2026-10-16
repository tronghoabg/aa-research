package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bw extends com.google.v.du<bw, bv> implements bx {
    public static final int CELL_ID_FIELD_NUMBER = 1;
    private static final bw DEFAULT_INSTANCE;
    public static final int FPRINT_FIELD_NUMBER = 2;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 13258261;
    private static volatile com.google.v.fo<bw> PARSER = null;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 3;
    public static final com.google.v.ds<com.google.w.n.a.b, bw> messageSetExtension;
    private int bitField0_;
    private long cellId_;
    private long fprint_;
    private byte memoizedIsInitialized = 2;
    private com.google.w.n.a.b temporaryData_;

    static {
        bw bwVar = new bw();
        DEFAULT_INSTANCE = bwVar;
        com.google.v.du.registerDefaultInstance(bw.class, bwVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, bw.class);
    }

    private bw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCellId() {
        this.bitField0_ &= -2;
        this.cellId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFprint() {
        this.bitField0_ &= -3;
        this.fprint_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -5;
    }

    public static bw getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 4;
    }

    public static bv newBuilder() {
        return (bv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bw parseDelimitedFrom(InputStream inputStream) {
        return (bw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bw parseFrom(com.google.v.v vVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCellId(long j2) {
        this.bitField0_ |= 1;
        this.cellId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFprint(long j2) {
        this.bitField0_ |= 2;
        this.fprint_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "cellId_", "fprint_", "temporaryData_"});
            case 3:
                return new bw();
            case 4:
                return new bv(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<bw> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (bw.class) {
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

    public long getCellId() {
        return this.cellId_;
    }

    public long getFprint() {
        return this.fprint_;
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public boolean hasCellId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFprint() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bv newBuilder(bw bwVar) {
        return (bv) DEFAULT_INSTANCE.createBuilder(bwVar);
    }

    public static bw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bw parseFrom(com.google.v.z zVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bw parseFrom(InputStream inputStream) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bw parseFrom(ByteBuffer byteBuffer) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bw parseFrom(byte[] bArr) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
