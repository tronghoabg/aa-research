package com.waze.sharedrive.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n extends du<n, k> implements fj {
    public static final int CITY_FIELD_NUMBER = 5;
    private static final n DEFAULT_INSTANCE;
    public static final int HOUSE_NUMBER_FIELD_NUMBER = 3;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile fo<n> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 6;
    public static final int STREET_FIELD_NUMBER = 4;
    public static final int VENUE_INFO_FIELD_NUMBER = 2;
    public static final int ZIP_FIELD_NUMBER = 7;
    private int bitField0_;
    private i.b.s location_;
    private m venueInfo_;
    private String houseNumber_ = "";
    private String street_ = "";
    private String city_ = "";
    private String state_ = "";
    private String zip_ = "";

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        du.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHouseNumber() {
        this.houseNumber_ = getDefaultInstance().getHouseNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = getDefaultInstance().getState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.street_ = getDefaultInstance().getStreet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueInfo() {
        this.venueInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZip() {
        this.zip_ = getDefaultInstance().getZip();
    }

    public static n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.location_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.location_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueInfo(m mVar) {
        Objects.requireNonNull(mVar);
        m mVar2 = this.venueInfo_;
        if (mVar2 != null && mVar2 != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder(mVar2);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.venueInfo_ = mVar;
        this.bitField0_ |= 2;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static n parseDelimitedFrom(InputStream inputStream) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(com.google.v.v vVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<n> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        Objects.requireNonNull(str);
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.city_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumber(String str) {
        Objects.requireNonNull(str);
        this.houseNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumberBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.houseNumber_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.location_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(String str) {
        Objects.requireNonNull(str);
        this.state_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.state_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.street_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueInfo(m mVar) {
        Objects.requireNonNull(mVar);
        this.venueInfo_ = mVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZip(String str) {
        Objects.requireNonNull(str);
        this.zip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZipBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.zip_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"bitField0_", "location_", "venueInfo_", "houseNumber_", "street_", "city_", "state_", "zip_"});
        }
        if (iOrdinal == 3) {
            return new n();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new k(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<n> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (n.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCity() {
        return this.city_;
    }

    public com.google.v.v getCityBytes() {
        return com.google.v.v.s(this.city_);
    }

    public String getHouseNumber() {
        return this.houseNumber_;
    }

    public com.google.v.v getHouseNumberBytes() {
        return com.google.v.v.s(this.houseNumber_);
    }

    public i.b.s getLocation() {
        i.b.s sVar = this.location_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public String getState() {
        return this.state_;
    }

    public com.google.v.v getStateBytes() {
        return com.google.v.v.s(this.state_);
    }

    public String getStreet() {
        return this.street_;
    }

    public com.google.v.v getStreetBytes() {
        return com.google.v.v.s(this.street_);
    }

    public m getVenueInfo() {
        m mVar = this.venueInfo_;
        return mVar == null ? m.getDefaultInstance() : mVar;
    }

    public String getZip() {
        return this.zip_;
    }

    public com.google.v.v getZipBytes() {
        return com.google.v.v.s(this.zip_);
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVenueInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static k newBuilder(n nVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(nVar);
    }

    public static n parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(com.google.v.v vVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static n parseFrom(com.google.v.z zVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static n parseFrom(com.google.v.z zVar, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static n parseFrom(InputStream inputStream) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(InputStream inputStream, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(ByteBuffer byteBuffer) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static n parseFrom(byte[] bArr) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n parseFrom(byte[] bArr, de deVar) {
        return (n) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
