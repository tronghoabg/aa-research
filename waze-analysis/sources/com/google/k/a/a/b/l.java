package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends com.google.v.du<l, j> implements m {
    private static final l DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 5;
    public static final int FEATURE_TYPE_FIELD_NUMBER = 4;
    public static final int INDEX_FIELD_NUMBER = 7;
    public static final int PARSED_NAME_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<l> PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 6;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 15;
    public static final int TEXT_AFFIX_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private bw featureId_;
    private int featureType_;
    private int index_;
    private r range_;
    private com.google.w.n.a.b temporaryData_;
    private byte memoizedIsInitialized = 2;
    private int type_ = 17;
    private com.google.v.eo<eh> parsedName_ = emptyProtobufList();
    private com.google.v.eo<jm> textAffix_ = emptyProtobufList();

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        com.google.v.du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParsedName(Iterable<? extends eh> iterable) {
        ensureParsedNameIsMutable();
        com.google.v.c.addAll(iterable, this.parsedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTextAffix(Iterable<? extends jm> iterable) {
        ensureTextAffixIsMutable();
        com.google.v.c.addAll(iterable, this.textAffix_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParsedName(int i2, eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureParsedNameIsMutable();
        this.parsedName_.add(i2, ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTextAffix(int i2, jm jmVar) {
        Objects.requireNonNull(jmVar);
        ensureTextAffixIsMutable();
        this.textAffix_.add(i2, jmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureId() {
        this.featureId_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureType() {
        this.bitField0_ &= -3;
        this.featureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -33;
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParsedName() {
        this.parsedName_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRange() {
        this.range_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextAffix() {
        this.textAffix_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 17;
    }

    private void ensureParsedNameIsMutable() {
        com.google.v.eo<eh> eoVar = this.parsedName_;
        if (eoVar.c()) {
            return;
        }
        this.parsedName_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTextAffixIsMutable() {
        com.google.v.eo<jm> eoVar = this.textAffix_;
        if (eoVar.c()) {
            return;
        }
        this.textAffix_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.featureId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.featureId_ = bwVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRange(r rVar) {
        Objects.requireNonNull(rVar);
        r rVar2 = this.range_;
        if (rVar2 != null && rVar2 != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.range_ = rVar;
        this.bitField0_ |= 8;
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
        this.bitField0_ |= 16;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParsedName(int i2) {
        ensureParsedNameIsMutable();
        this.parsedName_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTextAffix(int i2) {
        ensureTextAffixIsMutable();
        this.textAffix_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.featureId_ = bwVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureType(int i2) {
        this.bitField0_ |= 2;
        this.featureType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.bitField0_ |= 32;
        this.index_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParsedName(int i2, eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureParsedNameIsMutable();
        this.parsedName_.set(i2, ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRange(r rVar) {
        Objects.requireNonNull(rVar);
        this.range_ = rVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextAffix(int i2, jm jmVar) {
        Objects.requireNonNull(jmVar);
        ensureTextAffixIsMutable();
        this.textAffix_.set(i2, jmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(k kVar) {
        this.type_ = kVar.getNumber();
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"bitField0_", "type_", c.f11199c, "parsedName_", eh.class, "featureType_", "featureId_", "range_", "index_", "textAffix_", jm.class, "temporaryData_"});
            case 3:
                return new l();
            case 4:
                return new j(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<l> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (l.class) {
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

    public bw getFeatureId() {
        bw bwVar = this.featureId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public int getFeatureType() {
        return this.featureType_;
    }

    public int getIndex() {
        return this.index_;
    }

    public eh getParsedName(int i2) {
        return this.parsedName_.get(i2);
    }

    public int getParsedNameCount() {
        return this.parsedName_.size();
    }

    public List<eh> getParsedNameList() {
        return this.parsedName_;
    }

    public ei getParsedNameOrBuilder(int i2) {
        return this.parsedName_.get(i2);
    }

    public List<? extends ei> getParsedNameOrBuilderList() {
        return this.parsedName_;
    }

    public r getRange() {
        r rVar = this.range_;
        return rVar == null ? r.getDefaultInstance() : rVar;
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public jm getTextAffix(int i2) {
        return this.textAffix_.get(i2);
    }

    public int getTextAffixCount() {
        return this.textAffix_.size();
    }

    public List<jm> getTextAffixList() {
        return this.textAffix_;
    }

    public jn getTextAffixOrBuilder(int i2) {
        return this.textAffix_.get(i2);
    }

    public List<? extends jn> getTextAffixOrBuilderList() {
        return this.textAffix_;
    }

    public k getType() {
        k kVarA = k.a(this.type_);
        return kVarA == null ? k.TYPE_FEATURE : kVarA;
    }

    public boolean hasFeatureId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFeatureType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRange() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static j newBuilder(l lVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(com.google.v.z zVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParsedName(eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureParsedNameIsMutable();
        this.parsedName_.add(ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTextAffix(jm jmVar) {
        Objects.requireNonNull(jmVar);
        ensureTextAffixIsMutable();
        this.textAffix_.add(jmVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (l) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
