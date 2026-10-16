package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad extends com.google.v.du<ad, ac> implements com.google.v.fj {
    private static final ad DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 2;
    public static final int LOCALIZATION_POLICY_ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<ad> PARSER;
    private int bitField0_;
    private bw locale_;
    private ce metadata_;
    private byte memoizedIsInitialized = 2;
    private String localizationPolicyId_ = "";

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        com.google.v.du.registerDefaultInstance(ad.class, adVar);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalizationPolicyId() {
        this.bitField0_ &= -2;
        this.localizationPolicyId_ = getDefaultInstance().getLocalizationPolicyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -5;
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocale(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.locale_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.locale_ = bwVar;
        this.bitField0_ |= 2;
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

    public static ac newBuilder() {
        return (ac) DEFAULT_INSTANCE.createBuilder();
    }

    public static ad parseDelimitedFrom(InputStream inputStream) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(com.google.v.v vVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.locale_ = bwVar;
        this.bitField0_ |= 2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001Ǵ\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001Ǵဉ\u0002", new Object[]{"bitField0_", "localizationPolicyId_", "locale_", "metadata_"});
            case 3:
                return new ad();
            case 4:
                return new ac(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ad> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ad.class) {
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

    public bw getLocale() {
        bw bwVar = this.locale_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public String getLocalizationPolicyId() {
        return this.localizationPolicyId_;
    }

    public com.google.v.v getLocalizationPolicyIdBytes() {
        return com.google.v.v.s(this.localizationPolicyId_);
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLocalizationPolicyId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ac newBuilder(ad adVar) {
        return (ac) DEFAULT_INSTANCE.createBuilder(adVar);
    }

    public static ad parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ad parseFrom(com.google.v.z zVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ad parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ad parseFrom(InputStream inputStream) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(ByteBuffer byteBuffer) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ad parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ad parseFrom(byte[] bArr) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ad parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
