package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cx extends com.google.v.du<cx, cl> implements com.google.v.fj {
    public static final int CITY_NAME_FIELD_NUMBER = 4;
    private static final cx DEFAULT_INSTANCE;
    public static final int FAVORITE_INFO_FIELD_NUMBER = 7;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<cx> PARSER = null;
    public static final int ROUTING_CONTEXT_FIELD_NUMBER = 5;
    public static final int STATE_NAME_FIELD_NUMBER = 8;
    public static final int STREET_NAME_FIELD_NUMBER = 3;
    public static final int VENUE_ID_FIELD_NUMBER = 2;
    public static final int VENUE_INFO_FIELD_NUMBER = 6;
    private int bitField0_;
    private cq favoriteInfo_;
    private ei location_;
    private cu venueInfo_;
    private String venueId_ = "";
    private String streetName_ = "";
    private String cityName_ = "";
    private String stateName_ = "";
    private String routingContext_ = "";

    static {
        cx cxVar = new cx();
        DEFAULT_INSTANCE = cxVar;
        com.google.v.du.registerDefaultInstance(cx.class, cxVar);
    }

    private cx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCityName() {
        this.bitField0_ &= -17;
        this.cityName_ = getDefaultInstance().getCityName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoriteInfo() {
        this.favoriteInfo_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingContext() {
        this.bitField0_ &= -65;
        this.routingContext_ = getDefaultInstance().getRoutingContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateName() {
        this.bitField0_ &= -33;
        this.stateName_ = getDefaultInstance().getStateName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetName() {
        this.bitField0_ &= -9;
        this.streetName_ = getDefaultInstance().getStreetName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -3;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueInfo() {
        this.venueInfo_ = null;
        this.bitField0_ &= -5;
    }

    public static cx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavoriteInfo(cq cqVar) {
        Objects.requireNonNull(cqVar);
        cq cqVar2 = this.favoriteInfo_;
        if (cqVar2 != null && cqVar2 != cq.getDefaultInstance()) {
            co coVarNewBuilder = cq.newBuilder(cqVar2);
            coVarNewBuilder.mergeFrom((co) cqVar);
            cqVar = coVarNewBuilder.buildPartial();
        }
        this.favoriteInfo_ = cqVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(ei eiVar) {
        Objects.requireNonNull(eiVar);
        ei eiVar2 = this.location_;
        if (eiVar2 != null && eiVar2 != ei.getDefaultInstance()) {
            eh ehVarNewBuilder = ei.newBuilder(eiVar2);
            ehVarNewBuilder.mergeFrom((eh) eiVar);
            eiVar = ehVarNewBuilder.buildPartial();
        }
        this.location_ = eiVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueInfo(cu cuVar) {
        Objects.requireNonNull(cuVar);
        cu cuVar2 = this.venueInfo_;
        if (cuVar2 != null && cuVar2 != cu.getDefaultInstance()) {
            ct ctVarNewBuilder = cu.newBuilder(cuVar2);
            ctVarNewBuilder.mergeFrom((ct) cuVar);
            cuVar = ctVarNewBuilder.buildPartial();
        }
        this.venueInfo_ = cuVar;
        this.bitField0_ |= 4;
    }

    public static cl newBuilder() {
        return (cl) DEFAULT_INSTANCE.createBuilder();
    }

    public static cx parseDelimitedFrom(InputStream inputStream) {
        return (cx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cx parseFrom(com.google.v.v vVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.cityName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityNameBytes(com.google.v.v vVar) {
        this.cityName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoriteInfo(cq cqVar) {
        Objects.requireNonNull(cqVar);
        this.favoriteInfo_ = cqVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(ei eiVar) {
        Objects.requireNonNull(eiVar);
        this.location_ = eiVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.routingContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContextBytes(com.google.v.v vVar) {
        this.routingContext_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.stateName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateNameBytes(com.google.v.v vVar) {
        this.stateName_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.streetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetNameBytes(com.google.v.v vVar) {
        this.streetName_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueInfo(cu cuVar) {
        Objects.requireNonNull(cuVar);
        this.venueInfo_ = cuVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0006\u0006ဉ\u0002\u0007ဉ\u0007\bဈ\u0005", new Object[]{"bitField0_", "location_", "venueId_", "streetName_", "cityName_", "routingContext_", "venueInfo_", "favoriteInfo_", "stateName_"});
        }
        if (iOrdinal == 3) {
            return new cx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCityName() {
        return this.cityName_;
    }

    public com.google.v.v getCityNameBytes() {
        return com.google.v.v.s(this.cityName_);
    }

    public cq getFavoriteInfo() {
        cq cqVar = this.favoriteInfo_;
        return cqVar == null ? cq.getDefaultInstance() : cqVar;
    }

    public ei getLocation() {
        ei eiVar = this.location_;
        return eiVar == null ? ei.getDefaultInstance() : eiVar;
    }

    public String getRoutingContext() {
        return this.routingContext_;
    }

    public com.google.v.v getRoutingContextBytes() {
        return com.google.v.v.s(this.routingContext_);
    }

    public String getStateName() {
        return this.stateName_;
    }

    public com.google.v.v getStateNameBytes() {
        return com.google.v.v.s(this.stateName_);
    }

    public String getStreetName() {
        return this.streetName_;
    }

    public com.google.v.v getStreetNameBytes() {
        return com.google.v.v.s(this.streetName_);
    }

    @Deprecated
    public String getVenueId() {
        return this.venueId_;
    }

    @Deprecated
    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public cu getVenueInfo() {
        cu cuVar = this.venueInfo_;
        return cuVar == null ? cu.getDefaultInstance() : cuVar;
    }

    public boolean hasCityName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFavoriteInfo() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoutingContext() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasStateName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasStreetName() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasVenueId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVenueInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public static cl newBuilder(cx cxVar) {
        return (cl) DEFAULT_INSTANCE.createBuilder(cxVar);
    }

    public static cx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cx parseFrom(com.google.v.z zVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cx parseFrom(InputStream inputStream) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cx parseFrom(ByteBuffer byteBuffer) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cx parseFrom(byte[] bArr) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
