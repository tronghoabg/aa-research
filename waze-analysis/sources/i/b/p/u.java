package i.b.p;

import androidx.camera.video.AudioStats;
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
/* loaded from: classes8.dex */
public final class u extends du<u, t> implements fj {
    public static final int ADDRESS_FIELD_NUMBER = 11;
    public static final int CITY_FIELD_NUMBER = 3;
    public static final int COUNTRY_FIELD_NUMBER = 5;
    private static final u DEFAULT_INSTANCE;
    public static final int HOUSE_NUMBER_FIELD_NUMBER = 12;
    public static final int LATITUDE_FIELD_NUMBER = 7;
    public static final int LONGITUDE_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<u> PARSER = null;
    public static final int ROUTING_CONTEXT_FIELD_NUMBER = 13;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int STREET_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 9;
    public static final int VENUE_ID_FIELD_NUMBER = 10;
    public static final int ZIP_FIELD_NUMBER = 6;
    private int bitField0_;
    private double latitude_;
    private double longitude_;
    private String name_ = "";
    private String street_ = "";
    private String city_ = "";
    private String state_ = "";
    private String country_ = "";
    private String zip_ = "";
    private String type_ = "";
    private String venueId_ = "";
    private String address_ = "";
    private String houseNumber_ = "";
    private String routingContext_ = "";

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.bitField0_ &= -1025;
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.bitField0_ &= -5;
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -17;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHouseNumber() {
        this.bitField0_ &= -2049;
        this.houseNumber_ = getDefaultInstance().getHouseNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.bitField0_ &= -65;
        this.latitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.bitField0_ &= -129;
        this.longitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingContext() {
        this.bitField0_ &= -4097;
        this.routingContext_ = getDefaultInstance().getRoutingContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.bitField0_ &= -9;
        this.state_ = getDefaultInstance().getState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -3;
        this.street_ = getDefaultInstance().getStreet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -257;
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -513;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZip() {
        this.bitField0_ &= -33;
        this.zip_ = getDefaultInstance().getZip();
    }

    public static u getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static t newBuilder() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    public static u parseDelimitedFrom(InputStream inputStream) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(com.google.v.v vVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<u> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(com.google.v.v vVar) {
        this.address_ = vVar.u();
        this.bitField0_ |= 1024;
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
    public void setCountry(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(com.google.v.v vVar) {
        this.country_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumber(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.houseNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumberBytes(com.google.v.v vVar) {
        this.houseNumber_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d2) {
        this.bitField0_ |= 64;
        this.latitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d2) {
        this.bitField0_ |= 128;
        this.longitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.routingContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContextBytes(com.google.v.v vVar) {
        this.routingContext_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.state_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateBytes(com.google.v.v vVar) {
        this.state_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(com.google.v.v vVar) {
        this.street_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(com.google.v.v vVar) {
        this.type_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZip(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.zip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZipBytes(com.google.v.v vVar) {
        this.zip_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007က\u0006\bက\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f", new Object[]{"bitField0_", "name_", "street_", "city_", "state_", "country_", "zip_", "latitude_", "longitude_", "type_", "venueId_", "address_", "houseNumber_", "routingContext_"});
        }
        if (iOrdinal == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new t(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<u> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (u.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAddress() {
        return this.address_;
    }

    public com.google.v.v getAddressBytes() {
        return com.google.v.v.s(this.address_);
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

    public String getHouseNumber() {
        return this.houseNumber_;
    }

    public com.google.v.v getHouseNumberBytes() {
        return com.google.v.v.s(this.houseNumber_);
    }

    public double getLatitude() {
        return this.latitude_;
    }

    public double getLongitude() {
        return this.longitude_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
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

    public String getType() {
        return this.type_;
    }

    public com.google.v.v getTypeBytes() {
        return com.google.v.v.s(this.type_);
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public String getZip() {
        return this.zip_;
    }

    public com.google.v.v getZipBytes() {
        return com.google.v.v.s(this.zip_);
    }

    public boolean hasAddress() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasCity() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHouseNumber() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasLatitude() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLongitude() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoutingContext() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasZip() {
        return (this.bitField0_ & 32) != 0;
    }

    public static t newBuilder(u uVar) {
        return (t) DEFAULT_INSTANCE.createBuilder(uVar);
    }

    public static u parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(com.google.v.v vVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static u parseFrom(com.google.v.z zVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static u parseFrom(com.google.v.z zVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static u parseFrom(InputStream inputStream) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(InputStream inputStream, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(ByteBuffer byteBuffer) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static u parseFrom(byte[] bArr) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static u parseFrom(byte[] bArr, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
