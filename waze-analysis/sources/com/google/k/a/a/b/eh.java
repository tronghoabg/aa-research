package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eh extends com.google.v.du<eh, ef> implements ei {
    private static final eh DEFAULT_INSTANCE;
    public static final int FLAG_FIELD_NUMBER = 3;
    public static final int LANGUAGE_FIELD_NUMBER = 2;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 308676116;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<eh> PARSER = null;
    public static final int RAW_TEXT_FIELD_NUMBER = 5;
    public static final int SHORT_TEXT_FIELD_NUMBER = 6;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 15;
    public static final int TEXT_FIELD_NUMBER = 1;
    private static final com.google.v.el<eg> flag_converter_ = new ee(0);
    public static final com.google.v.ds<com.google.w.n.a.b, eh> messageSetExtension;
    private int bitField0_;
    private ce metadata_;
    private com.google.w.n.a.b temporaryData_;
    private byte memoizedIsInitialized = 2;
    private String text_ = "";
    private String language_ = "";
    private com.google.v.ek flag_ = emptyIntList();
    private String rawText_ = "";
    private String shortText_ = "";

    static {
        eh ehVar = new eh();
        DEFAULT_INSTANCE = ehVar;
        com.google.v.du.registerDefaultInstance(eh.class, ehVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, eh.class);
    }

    private eh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFlag(Iterable<? extends eg> iterable) {
        ensureFlagIsMutable();
        Iterator<? extends eg> it = iterable.iterator();
        while (it.hasNext()) {
            this.flag_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFlag(eg egVar) {
        Objects.requireNonNull(egVar);
        ensureFlagIsMutable();
        this.flag_.i(egVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlag() {
        this.flag_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -3;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawText() {
        this.bitField0_ &= -5;
        this.rawText_ = getDefaultInstance().getRawText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortText() {
        this.bitField0_ &= -9;
        this.shortText_ = getDefaultInstance().getShortText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -2;
        this.text_ = getDefaultInstance().getText();
    }

    private void ensureFlagIsMutable() {
        com.google.v.ek ekVar = this.flag_;
        if (ekVar.c()) {
            return;
        }
        this.flag_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static eh getDefaultInstance() {
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
    public void mergeTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.temporaryData_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.temporaryData_ = bVar;
        this.bitField0_ |= 32;
    }

    public static ef newBuilder() {
        return (ef) DEFAULT_INSTANCE.createBuilder();
    }

    public static eh parseDelimitedFrom(InputStream inputStream) {
        return (eh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eh parseFrom(com.google.v.v vVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlag(int i2, eg egVar) {
        Objects.requireNonNull(egVar);
        ensureFlagIsMutable();
        this.flag_.e(i2, egVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        this.language_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.rawText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawTextBytes(com.google.v.v vVar) {
        this.rawText_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.shortText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortTextBytes(com.google.v.v vVar) {
        this.shortText_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        this.text_ = vVar.u();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"bitField0_", "text_", "language_", "flag_", dq.f11271c, "rawText_", "shortText_", "temporaryData_", "metadata_"});
            case 3:
                return new eh();
            case 4:
                return new ef(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<eh> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (eh.class) {
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

    public eg getFlag(int i2) {
        eg egVarA = eg.a(this.flag_.d(i2));
        return egVarA == null ? eg.FLAG_ANY : egVarA;
    }

    public int getFlagCount() {
        return this.flag_.size();
    }

    public List<eg> getFlagList() {
        return new com.google.v.em(this.flag_, flag_converter_);
    }

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    @Deprecated
    public String getRawText() {
        return this.rawText_;
    }

    @Deprecated
    public com.google.v.v getRawTextBytes() {
        return com.google.v.v.s(this.rawText_);
    }

    public String getShortText() {
        return this.shortText_;
    }

    public com.google.v.v getShortTextBytes() {
        return com.google.v.v.s(this.shortText_);
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasRawText() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasShortText() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ef newBuilder(eh ehVar) {
        return (ef) DEFAULT_INSTANCE.createBuilder(ehVar);
    }

    public static eh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eh parseFrom(com.google.v.z zVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eh parseFrom(InputStream inputStream) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eh parseFrom(ByteBuffer byteBuffer) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eh parseFrom(byte[] bArr) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
