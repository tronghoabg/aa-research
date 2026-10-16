package i.b.e;

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
public final class y extends du<y, x> implements fj {
    public static final int CITY_FIELD_NUMBER = 5;
    public static final int COUNTRY_FIELD_NUMBER = 7;
    private static final y DEFAULT_INSTANCE;
    public static final int EDIT_TIME_SECS_FIELD_NUMBER = 10;
    public static final int HOUSE_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 2;
    public static final int LOCATION_NAME_FIELD_NUMBER = 3;
    private static volatile fo<y> PARSER = null;
    public static final int ROUTING_CONTEXT_FIELD_NUMBER = 11;
    public static final int STATE_FIELD_NUMBER = 6;
    public static final int STREET_FIELD_NUMBER = 4;
    public static final int VENUE_ID_FIELD_NUMBER = 9;
    private int bitField0_;
    private long editTimeSecs_;
    private long id_;
    private i.b.s location_;
    private String locationName_ = "";
    private String street_ = "";
    private String city_ = "";
    private String state_ = "";
    private String country_ = "";
    private String house_ = "";
    private String venueId_ = "";
    private String routingContext_ = "";

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        du.registerDefaultInstance(y.class, yVar);
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.bitField0_ &= -17;
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -65;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditTimeSecs() {
        this.bitField0_ &= -513;
        this.editTimeSecs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHouse() {
        this.bitField0_ &= -129;
        this.house_ = getDefaultInstance().getHouse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationName() {
        this.bitField0_ &= -5;
        this.locationName_ = getDefaultInstance().getLocationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingContext() {
        this.bitField0_ &= -1025;
        this.routingContext_ = getDefaultInstance().getRoutingContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.bitField0_ &= -33;
        this.state_ = getDefaultInstance().getState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -9;
        this.street_ = getDefaultInstance().getStreet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -257;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static y getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static y parseDelimitedFrom(InputStream inputStream) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(com.google.v.v vVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<y> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(com.google.v.v vVar) {
        this.city_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(com.google.v.v vVar) {
        this.country_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditTimeSecs(long j2) {
        this.bitField0_ |= 512;
        this.editTimeSecs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouse(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.house_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseBytes(com.google.v.v vVar) {
        this.house_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.location_ = sVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.locationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationNameBytes(com.google.v.v vVar) {
        this.locationName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.routingContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContextBytes(com.google.v.v vVar) {
        this.routingContext_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.state_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateBytes(com.google.v.v vVar) {
        this.state_ = vVar.u();
        this.bitField0_ |= 32;
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
        this.bitField0_ |= 256;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 256;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဂ\t\u000bဈ\n", new Object[]{"bitField0_", "id_", "location_", "locationName_", "street_", "city_", "state_", "country_", "house_", "venueId_", "editTimeSecs_", "routingContext_"});
        }
        if (iOrdinal == 3) {
            return new y();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<y> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (y.class) {
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

    public String getCountry() {
        return this.country_;
    }

    public com.google.v.v getCountryBytes() {
        return com.google.v.v.s(this.country_);
    }

    public long getEditTimeSecs() {
        return this.editTimeSecs_;
    }

    public String getHouse() {
        return this.house_;
    }

    public com.google.v.v getHouseBytes() {
        return com.google.v.v.s(this.house_);
    }

    public long getId() {
        return this.id_;
    }

    public i.b.s getLocation() {
        i.b.s sVar = this.location_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public String getLocationName() {
        return this.locationName_;
    }

    public com.google.v.v getLocationNameBytes() {
        return com.google.v.v.s(this.locationName_);
    }

    public String getRoutingContext() {
        return this.routingContext_;
    }

    public com.google.v.v getRoutingContextBytes() {
        return com.google.v.v.s(this.routingContext_);
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

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasCity() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasEditTimeSecs() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasHouse() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLocationName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRoutingContext() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 256) != 0;
    }

    public static x newBuilder(y yVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(yVar);
    }

    public static y parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(com.google.v.v vVar, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static y parseFrom(com.google.v.z zVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static y parseFrom(com.google.v.z zVar, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static y parseFrom(InputStream inputStream) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(InputStream inputStream, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(ByteBuffer byteBuffer) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static y parseFrom(byte[] bArr) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static y parseFrom(byte[] bArr, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
