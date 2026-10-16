package i.b.c;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import i.b.s;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends du<l, k> implements fj {
    public static final int CURRENT_LOCATION_FIELD_NUMBER = 1;
    private static final l DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 4;
    public static final int DESTINATION_NAME_FIELD_NUMBER = 2;
    public static final int DESTINATION_VENUE_ID_FIELD_NUMBER = 3;
    public static final int PARKING_TIME_MILLIS_FIELD_NUMBER = 5;
    private static volatile fo<l> PARSER;
    private int bitField0_;
    private s currentLocation_;
    private String destinationName_ = "";
    private String destinationVenueId_ = "";
    private s destination_;
    private long parkingTimeMillis_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentLocation() {
        this.currentLocation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationName() {
        this.bitField0_ &= -3;
        this.destinationName_ = getDefaultInstance().getDestinationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationVenueId() {
        this.bitField0_ &= -5;
        this.destinationVenueId_ = getDefaultInstance().getDestinationVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingTimeMillis() {
        this.bitField0_ &= -17;
        this.parkingTimeMillis_ = 0L;
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentLocation(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.currentLocation_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.currentLocation_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.destination_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.destination_ = sVar;
        this.bitField0_ |= 8;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentLocation(s sVar) {
        Objects.requireNonNull(sVar);
        this.currentLocation_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(s sVar) {
        Objects.requireNonNull(sVar);
        this.destination_ = sVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.destinationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationNameBytes(v vVar) {
        this.destinationName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.destinationVenueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationVenueIdBytes(v vVar) {
        this.destinationVenueId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingTimeMillis(long j2) {
        this.bitField0_ |= 16;
        this.parkingTimeMillis_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဂ\u0004", new Object[]{"bitField0_", "currentLocation_", "destinationName_", "destinationVenueId_", "destination_", "parkingTimeMillis_"});
        }
        if (iOrdinal == 3) {
            return new l();
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
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public s getCurrentLocation() {
        s sVar = this.currentLocation_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public s getDestination() {
        s sVar = this.destination_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public String getDestinationName() {
        return this.destinationName_;
    }

    public v getDestinationNameBytes() {
        return v.s(this.destinationName_);
    }

    public String getDestinationVenueId() {
        return this.destinationVenueId_;
    }

    public v getDestinationVenueIdBytes() {
        return v.s(this.destinationVenueId_);
    }

    public long getParkingTimeMillis() {
        return this.parkingTimeMillis_;
    }

    public boolean hasCurrentLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDestination() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDestinationName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDestinationVenueId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasParkingTimeMillis() {
        return (this.bitField0_ & 16) != 0;
    }

    public static k newBuilder(l lVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
