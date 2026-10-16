package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends com.google.v.du<h, g> implements i {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 6;
    public static final int COMPONENT_FIELD_NUMBER = 2;
    public static final int CROSS_STREET_FIELD_NUMBER = 5;
    private static final h DEFAULT_INSTANCE;
    public static final int IS_PRIMARY_ADDRESS_FIELD_NUMBER = 12;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 12208774;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<h> PARSER = null;
    public static final int PARTIAL_DENORMALIZATION_FIELD_NUMBER = 11;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 10;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 8;
    public static final com.google.v.ds<com.google.w.n.a.b, h> messageSetExtension;
    private int bitField0_;
    private boolean isPrimaryAddress_;
    private ce metadata_;
    private h partialDenormalization_;
    private com.google.w.n.a.b temporaryData_;
    private byte memoizedIsInitialized = 2;
    private String templateId_ = "";
    private com.google.v.eo<l> component_ = emptyProtobufList();
    private com.google.v.eo<o> addressLines_ = emptyProtobufList();
    private com.google.v.eo<l> crossStreet_ = emptyProtobufList();

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.v.du.registerDefaultInstance(h.class, hVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, h.class);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddressLines(int i2, o oVar) {
        Objects.requireNonNull(oVar);
        ensureAddressLinesIsMutable();
        this.addressLines_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAddressLines(Iterable<? extends o> iterable) {
        ensureAddressLinesIsMutable();
        com.google.v.c.addAll(iterable, this.addressLines_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllComponent(Iterable<? extends l> iterable) {
        ensureComponentIsMutable();
        com.google.v.c.addAll(iterable, this.component_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCrossStreet(Iterable<? extends l> iterable) {
        ensureCrossStreetIsMutable();
        com.google.v.c.addAll(iterable, this.crossStreet_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addComponent(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureComponentIsMutable();
        this.component_.add(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrossStreet(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureCrossStreetIsMutable();
        this.crossStreet_.add(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressLines() {
        this.addressLines_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComponent() {
        this.component_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrossStreet() {
        this.crossStreet_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPrimaryAddress() {
        this.bitField0_ &= -9;
        this.isPrimaryAddress_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartialDenormalization() {
        this.partialDenormalization_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemplateId() {
        this.bitField0_ &= -2;
        this.templateId_ = getDefaultInstance().getTemplateId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureAddressLinesIsMutable() {
        com.google.v.eo<o> eoVar = this.addressLines_;
        if (eoVar.c()) {
            return;
        }
        this.addressLines_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureComponentIsMutable() {
        com.google.v.eo<l> eoVar = this.component_;
        if (eoVar.c()) {
            return;
        }
        this.component_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureCrossStreetIsMutable() {
        com.google.v.eo<l> eoVar = this.crossStreet_;
        if (eoVar.c()) {
            return;
        }
        this.crossStreet_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static h getDefaultInstance() {
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
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePartialDenormalization(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.partialDenormalization_;
        if (hVar2 != null && hVar2 != getDefaultInstance()) {
            g gVarNewBuilder = newBuilder(hVar2);
            gVarNewBuilder.mergeFrom((g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.partialDenormalization_ = hVar;
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
        this.bitField0_ |= 2;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(com.google.v.v vVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAddressLines(int i2) {
        ensureAddressLinesIsMutable();
        this.addressLines_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeComponent(int i2) {
        ensureComponentIsMutable();
        this.component_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCrossStreet(int i2) {
        ensureCrossStreetIsMutable();
        this.crossStreet_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressLines(int i2, o oVar) {
        Objects.requireNonNull(oVar);
        ensureAddressLinesIsMutable();
        this.addressLines_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComponent(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureComponentIsMutable();
        this.component_.set(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossStreet(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureCrossStreetIsMutable();
        this.crossStreet_.set(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPrimaryAddress(boolean z) {
        this.bitField0_ |= 8;
        this.isPrimaryAddress_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartialDenormalization(h hVar) {
        Objects.requireNonNull(hVar);
        this.partialDenormalization_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemplateId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.templateId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemplateIdBytes(com.google.v.v vVar) {
        this.templateId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0002Ǵ\b\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002\fဇ\u0003Ǵဉ\u0004", new Object[]{"bitField0_", "component_", l.class, "crossStreet_", l.class, "addressLines_", o.class, "temporaryData_", "templateId_", "partialDenormalization_", "isPrimaryAddress_", "metadata_"});
            case 3:
                return new h();
            case 4:
                return new g(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<h> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (h.class) {
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

    public o getAddressLines(int i2) {
        return this.addressLines_.get(i2);
    }

    public int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    public List<o> getAddressLinesList() {
        return this.addressLines_;
    }

    public p getAddressLinesOrBuilder(int i2) {
        return this.addressLines_.get(i2);
    }

    public List<? extends p> getAddressLinesOrBuilderList() {
        return this.addressLines_;
    }

    public l getComponent(int i2) {
        return this.component_.get(i2);
    }

    public int getComponentCount() {
        return this.component_.size();
    }

    public List<l> getComponentList() {
        return this.component_;
    }

    public m getComponentOrBuilder(int i2) {
        return this.component_.get(i2);
    }

    public List<? extends m> getComponentOrBuilderList() {
        return this.component_;
    }

    @Deprecated
    public l getCrossStreet(int i2) {
        return this.crossStreet_.get(i2);
    }

    @Deprecated
    public int getCrossStreetCount() {
        return this.crossStreet_.size();
    }

    @Deprecated
    public List<l> getCrossStreetList() {
        return this.crossStreet_;
    }

    @Deprecated
    public m getCrossStreetOrBuilder(int i2) {
        return this.crossStreet_.get(i2);
    }

    @Deprecated
    public List<? extends m> getCrossStreetOrBuilderList() {
        return this.crossStreet_;
    }

    public boolean getIsPrimaryAddress() {
        return this.isPrimaryAddress_;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public h getPartialDenormalization() {
        h hVar = this.partialDenormalization_;
        return hVar == null ? getDefaultInstance() : hVar;
    }

    public String getTemplateId() {
        return this.templateId_;
    }

    public com.google.v.v getTemplateIdBytes() {
        return com.google.v.v.s(this.templateId_);
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public boolean hasIsPrimaryAddress() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPartialDenormalization() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTemplateId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 2) != 0;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(com.google.v.z zVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddressLines(o oVar) {
        Objects.requireNonNull(oVar);
        ensureAddressLinesIsMutable();
        this.addressLines_.add(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addComponent(l lVar) {
        Objects.requireNonNull(lVar);
        ensureComponentIsMutable();
        this.component_.add(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrossStreet(l lVar) {
        Objects.requireNonNull(lVar);
        ensureCrossStreetIsMutable();
        this.crossStreet_.add(lVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
