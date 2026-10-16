package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ea extends com.google.v.du<ea, dz> implements com.google.v.fj {
    private static final ea DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    public static final int LOCALIZATION_POLICY_ID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ea> PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<ec> language_ = emptyProtobufList();
    private String localizationPolicyId_ = "";

    static {
        ea eaVar = new ea();
        DEFAULT_INSTANCE = eaVar;
        com.google.v.du.registerDefaultInstance(ea.class, eaVar);
    }

    private ea() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLanguage(Iterable<? extends ec> iterable) {
        ensureLanguageIsMutable();
        com.google.v.c.addAll(iterable, this.language_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguage(int i2, ec ecVar) {
        Objects.requireNonNull(ecVar);
        ensureLanguageIsMutable();
        this.language_.add(i2, ecVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalizationPolicyId() {
        this.bitField0_ &= -2;
        this.localizationPolicyId_ = getDefaultInstance().getLocalizationPolicyId();
    }

    private void ensureLanguageIsMutable() {
        com.google.v.eo<ec> eoVar = this.language_;
        if (eoVar.c()) {
            return;
        }
        this.language_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ea getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dz newBuilder() {
        return (dz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ea parseDelimitedFrom(InputStream inputStream) {
        return (ea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ea parseFrom(com.google.v.v vVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ea> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLanguage(int i2) {
        ensureLanguageIsMutable();
        this.language_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(int i2, ec ecVar) {
        Objects.requireNonNull(ecVar);
        ensureLanguageIsMutable();
        this.language_.set(i2, ecVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalizationPolicyId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.localizationPolicyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalizationPolicyIdBytes(com.google.v.v vVar) {
        this.localizationPolicyId_ = vVar.u();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"bitField0_", "language_", ec.class, "localizationPolicyId_"});
            case 3:
                return new ea();
            case 4:
                return new dz(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ea> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ea.class) {
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

    public ec getLanguage(int i2) {
        return this.language_.get(i2);
    }

    public int getLanguageCount() {
        return this.language_.size();
    }

    public List<ec> getLanguageList() {
        return this.language_;
    }

    public ed getLanguageOrBuilder(int i2) {
        return this.language_.get(i2);
    }

    public List<? extends ed> getLanguageOrBuilderList() {
        return this.language_;
    }

    public String getLocalizationPolicyId() {
        return this.localizationPolicyId_;
    }

    public com.google.v.v getLocalizationPolicyIdBytes() {
        return com.google.v.v.s(this.localizationPolicyId_);
    }

    public boolean hasLocalizationPolicyId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dz newBuilder(ea eaVar) {
        return (dz) DEFAULT_INSTANCE.createBuilder(eaVar);
    }

    public static ea parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ea parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ea parseFrom(com.google.v.z zVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ea parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguage(ec ecVar) {
        Objects.requireNonNull(ecVar);
        ensureLanguageIsMutable();
        this.language_.add(ecVar);
    }

    public static ea parseFrom(InputStream inputStream) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ea parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ea parseFrom(ByteBuffer byteBuffer) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ea parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ea parseFrom(byte[] bArr) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ea parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
