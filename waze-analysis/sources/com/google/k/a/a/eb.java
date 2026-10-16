package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eb extends com.google.v.du<eb, ea> implements ec {
    public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
    private static final eb DEFAULT_INSTANCE;
    public static final int LOCATION_ID_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<eb> PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String providerId_ = "";
    private String countryCode_ = "";
    private String locationId_ = "";

    static {
        eb ebVar = new eb();
        DEFAULT_INSTANCE = ebVar;
        com.google.v.du.registerDefaultInstance(eb.class, ebVar);
    }

    private eb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.bitField0_ &= -3;
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationId() {
        this.bitField0_ &= -5;
        this.locationId_ = getDefaultInstance().getLocationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.bitField0_ &= -2;
        this.providerId_ = getDefaultInstance().getProviderId();
    }

    public static eb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ea newBuilder() {
        return (ea) DEFAULT_INSTANCE.createBuilder();
    }

    public static eb parseDelimitedFrom(InputStream inputStream) {
        return (eb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eb parseFrom(com.google.v.v vVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.countryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.countryCode_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.locationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.locationId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.providerId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "providerId_", "countryCode_", "locationId_"});
        }
        if (iOrdinal == 3) {
            return new eb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ea(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<eb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCountryCode() {
        return this.countryCode_;
    }

    public com.google.v.v getCountryCodeBytes() {
        return com.google.v.v.s(this.countryCode_);
    }

    public String getLocationId() {
        return this.locationId_;
    }

    public com.google.v.v getLocationIdBytes() {
        return com.google.v.v.s(this.locationId_);
    }

    public String getProviderId() {
        return this.providerId_;
    }

    public com.google.v.v getProviderIdBytes() {
        return com.google.v.v.s(this.providerId_);
    }

    public boolean hasCountryCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLocationId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasProviderId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ea newBuilder(eb ebVar) {
        return (ea) DEFAULT_INSTANCE.createBuilder(ebVar);
    }

    public static eb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eb parseFrom(com.google.v.z zVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eb parseFrom(InputStream inputStream) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eb parseFrom(ByteBuffer byteBuffer) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eb parseFrom(byte[] bArr) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
