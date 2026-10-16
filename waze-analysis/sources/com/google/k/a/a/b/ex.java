package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ex extends com.google.v.du<ex, ew> implements ey {
    public static final int BASE_METERS_FIELD_NUMBER = 2;
    public static final int CELL_ID_FIELD_NUMBER = 4;
    private static final ex DEFAULT_INSTANCE;
    public static final int ENCODED_FIELD_NUMBER = 5;
    public static final int HEIGHT_METERS_FIELD_NUMBER = 3;
    public static final int LOOP_FIELD_NUMBER = 1;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 5464057;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<ex> PARSER = null;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 15;
    public static final int UNSUITABLE_FOR_DISPLAY_FIELD_NUMBER = 6;
    public static final com.google.v.ds<com.google.w.n.a.b, ex> messageSetExtension;
    private float baseMeters_;
    private int bitField0_;
    private long cellId_;
    private float heightMeters_;
    private ce metadata_;
    private com.google.w.n.a.b temporaryData_;
    private boolean unsuitableForDisplay_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<fa> loop_ = emptyProtobufList();
    private com.google.v.v encoded_ = com.google.v.v.f13054a;

    static {
        ex exVar = new ex();
        DEFAULT_INSTANCE = exVar;
        com.google.v.du.registerDefaultInstance(ex.class, exVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, ex.class);
    }

    private ex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLoop(Iterable<? extends fa> iterable) {
        ensureLoopIsMutable();
        com.google.v.c.addAll(iterable, this.loop_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLoop(int i2, fa faVar) {
        Objects.requireNonNull(faVar);
        ensureLoopIsMutable();
        this.loop_.add(i2, faVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseMeters() {
        this.bitField0_ &= -3;
        this.baseMeters_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCellId() {
        this.bitField0_ &= -9;
        this.cellId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncoded() {
        this.bitField0_ &= -2;
        this.encoded_ = getDefaultInstance().getEncoded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeightMeters() {
        this.bitField0_ &= -5;
        this.heightMeters_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoop() {
        this.loop_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnsuitableForDisplay() {
        this.bitField0_ &= -17;
        this.unsuitableForDisplay_ = false;
    }

    private void ensureLoopIsMutable() {
        com.google.v.eo<fa> eoVar = this.loop_;
        if (eoVar.c()) {
            return;
        }
        this.loop_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ex getDefaultInstance() {
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
        this.bitField0_ |= 32;
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
        this.bitField0_ |= 64;
    }

    public static ew newBuilder() {
        return (ew) DEFAULT_INSTANCE.createBuilder();
    }

    public static ex parseDelimitedFrom(InputStream inputStream) {
        return (ex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ex parseFrom(com.google.v.v vVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ex> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLoop(int i2) {
        ensureLoopIsMutable();
        this.loop_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseMeters(float f2) {
        this.bitField0_ |= 2;
        this.baseMeters_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCellId(long j2) {
        this.bitField0_ |= 8;
        this.cellId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncoded(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 1;
        this.encoded_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeightMeters(float f2) {
        this.bitField0_ |= 4;
        this.heightMeters_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoop(int i2, fa faVar) {
        Objects.requireNonNull(faVar);
        ensureLoopIsMutable();
        this.loop_.set(i2, faVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnsuitableForDisplay(boolean z) {
        this.bitField0_ |= 16;
        this.unsuitableForDisplay_ = z;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001Ǵ\b\u0000\u0001\u0002\u0001Л\u0002ခ\u0001\u0003ခ\u0002\u0004ဃ\u0003\u0005ည\u0000\u0006ဇ\u0004\u000fᐉ\u0006Ǵဉ\u0005", new Object[]{"bitField0_", "loop_", fa.class, "baseMeters_", "heightMeters_", "cellId_", "encoded_", "unsuitableForDisplay_", "temporaryData_", "metadata_"});
            case 3:
                return new ex();
            case 4:
                return new ew(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ex> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ex.class) {
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

    public float getBaseMeters() {
        return this.baseMeters_;
    }

    @Deprecated
    public long getCellId() {
        return this.cellId_;
    }

    public com.google.v.v getEncoded() {
        return this.encoded_;
    }

    public float getHeightMeters() {
        return this.heightMeters_;
    }

    @Deprecated
    public fa getLoop(int i2) {
        return this.loop_.get(i2);
    }

    @Deprecated
    public int getLoopCount() {
        return this.loop_.size();
    }

    @Deprecated
    public List<fa> getLoopList() {
        return this.loop_;
    }

    @Deprecated
    public fb getLoopOrBuilder(int i2) {
        return this.loop_.get(i2);
    }

    @Deprecated
    public List<? extends fb> getLoopOrBuilderList() {
        return this.loop_;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public boolean getUnsuitableForDisplay() {
        return this.unsuitableForDisplay_;
    }

    public boolean hasBaseMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasCellId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEncoded() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHeightMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasUnsuitableForDisplay() {
        return (this.bitField0_ & 16) != 0;
    }

    public static ew newBuilder(ex exVar) {
        return (ew) DEFAULT_INSTANCE.createBuilder(exVar);
    }

    public static ex parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ex) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ex parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ex parseFrom(com.google.v.z zVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ex parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLoop(fa faVar) {
        Objects.requireNonNull(faVar);
        ensureLoopIsMutable();
        this.loop_.add(faVar);
    }

    public static ex parseFrom(InputStream inputStream) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ex parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ex parseFrom(ByteBuffer byteBuffer) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ex parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ex parseFrom(byte[] bArr) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ex parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ex) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
