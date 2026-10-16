package com.waze.o;

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
/* loaded from: classes5.dex */
public final class ce extends du<ce, cd> implements fj {
    public static final int CITY_FIELD_NUMBER = 3;
    public static final int COORDINATE_FIELD_NUMBER = 6;
    private static final ce DEFAULT_INSTANCE;
    public static final int HOUSE_NUMBER_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<ce> PARSER = null;
    public static final int STREET_FIELD_NUMBER = 4;
    public static final int VENUE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private i.b.s coordinate_;
    private String venueId_ = "";
    private String name_ = "";
    private String city_ = "";
    private String street_ = "";
    private String houseNumber_ = "";

    static {
        ce ceVar = new ce();
        DEFAULT_INSTANCE = ceVar;
        du.registerDefaultInstance(ce.class, ceVar);
    }

    private ce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.bitField0_ &= -5;
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHouseNumber() {
        this.bitField0_ &= -17;
        this.houseNumber_ = getDefaultInstance().getHouseNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -9;
        this.street_ = getDefaultInstance().getStreet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -2;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static ce getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinate(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.coordinate_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.coordinate_ = sVar;
        this.bitField0_ |= 32;
    }

    public static cd newBuilder() {
        return (cd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ce parseDelimitedFrom(InputStream inputStream) {
        return (ce) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ce parseFrom(com.google.v.v vVar) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ce> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(com.google.v.v vVar) {
        this.city_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.coordinate_ = sVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumber(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.houseNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumberBytes(com.google.v.v vVar) {
        this.houseNumber_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(com.google.v.v vVar) {
        this.street_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "venueId_", "name_", "city_", "street_", "houseNumber_", "coordinate_"});
        }
        if (iOrdinal == 3) {
            return new ce();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ce> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ce.class) {
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

    public i.b.s getCoordinate() {
        i.b.s sVar = this.coordinate_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public String getHouseNumber() {
        return this.houseNumber_;
    }

    public com.google.v.v getHouseNumberBytes() {
        return com.google.v.v.s(this.houseNumber_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getStreet() {
        return this.street_;
    }

    public com.google.v.v getStreetBytes() {
        return com.google.v.v.s(this.street_);
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasCity() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCoordinate() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasHouseNumber() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cd newBuilder(ce ceVar) {
        return (cd) DEFAULT_INSTANCE.createBuilder(ceVar);
    }

    public static ce parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ce) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ce parseFrom(com.google.v.v vVar, de deVar) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ce parseFrom(com.google.v.z zVar) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ce parseFrom(com.google.v.z zVar, de deVar) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ce parseFrom(InputStream inputStream) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ce parseFrom(InputStream inputStream, de deVar) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ce parseFrom(ByteBuffer byteBuffer) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ce parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ce parseFrom(byte[] bArr) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ce parseFrom(byte[] bArr, de deVar) {
        return (ce) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
