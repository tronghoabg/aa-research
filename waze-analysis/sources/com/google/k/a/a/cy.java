package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cy extends com.google.v.du<cy, cx> implements cz {
    public static final int COUNTRY_CODE_FIELD_NUMBER = 1;
    private static final cy DEFAULT_INSTANCE;
    public static final int LOCATION_ID_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<cy> PARSER = null;
    public static final int PARTY_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String countryCode_ = "";
    private String partyId_ = "";
    private String locationId_ = "";

    static {
        cy cyVar = new cy();
        DEFAULT_INSTANCE = cyVar;
        com.google.v.du.registerDefaultInstance(cy.class, cyVar);
    }

    private cy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.bitField0_ &= -2;
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationId() {
        this.bitField0_ &= -5;
        this.locationId_ = getDefaultInstance().getLocationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartyId() {
        this.bitField0_ &= -3;
        this.partyId_ = getDefaultInstance().getPartyId();
    }

    public static cy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cx newBuilder() {
        return (cx) DEFAULT_INSTANCE.createBuilder();
    }

    public static cy parseDelimitedFrom(InputStream inputStream) {
        return (cy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cy parseFrom(com.google.v.v vVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.countryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.countryCode_ = vVar.u();
        this.bitField0_ |= 1;
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
    public void setPartyId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.partyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartyIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.partyId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "countryCode_", "partyId_", "locationId_"});
        }
        if (iOrdinal == 3) {
            return new cy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cy.class) {
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

    public String getPartyId() {
        return this.partyId_;
    }

    public com.google.v.v getPartyIdBytes() {
        return com.google.v.v.s(this.partyId_);
    }

    public boolean hasCountryCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLocationId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPartyId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cx newBuilder(cy cyVar) {
        return (cx) DEFAULT_INSTANCE.createBuilder(cyVar);
    }

    public static cy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cy parseFrom(com.google.v.z zVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cy parseFrom(InputStream inputStream) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cy parseFrom(ByteBuffer byteBuffer) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cy parseFrom(byte[] bArr) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
