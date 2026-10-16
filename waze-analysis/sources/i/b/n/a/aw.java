package i.b.n.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import i.b.v.eb;
import i.b.v.ef;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aw extends du<aw, an> implements ax {
    private static final aw DEFAULT_INSTANCE;
    public static final int PARKING_DATA_FIELD_NUMBER = 8;
    private static volatile fo<aw> PARSER = null;
    public static final int RESULT_TYPE_FIELD_NUMBER = 9;
    public static final int ROUTING_CONTEXT_FIELD_NUMBER = 2;
    public static final int UPDATABLE_FIELD_NUMBER = 3;
    public static final int VENUE_DECORATION_DATA_FIELD_NUMBER = 5;
    public static final int VENUE_FIELD_NUMBER = 1;
    public static final int VENUE_SOURCE_FIELD_NUMBER = 6;
    public static final int WALKING_DISTANCE_DATA_FIELD_NUMBER = 7;
    private int bitField0_;
    private ap parkingData_;
    private int resultType_;
    private boolean updatable_;
    private as venueDecorationData_;
    private int venueSource_;
    private ef venue_;
    private av walkingDistanceData_;
    private byte memoizedIsInitialized = 2;
    private String routingContext_ = "";

    static {
        aw awVar = new aw();
        DEFAULT_INSTANCE = awVar;
        du.registerDefaultInstance(aw.class, awVar);
    }

    private aw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingData() {
        this.parkingData_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultType() {
        this.bitField0_ &= -129;
        this.resultType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingContext() {
        this.bitField0_ &= -3;
        this.routingContext_ = getDefaultInstance().getRoutingContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatable() {
        this.bitField0_ &= -5;
        this.updatable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        this.venue_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueDecorationData() {
        this.venueDecorationData_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueSource() {
        this.bitField0_ &= -17;
        this.venueSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingDistanceData() {
        this.walkingDistanceData_ = null;
        this.bitField0_ &= -33;
    }

    public static aw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingData(ap apVar) {
        Objects.requireNonNull(apVar);
        ap apVar2 = this.parkingData_;
        if (apVar2 != null && apVar2 != ap.getDefaultInstance()) {
            ao aoVarNewBuilder = ap.newBuilder(apVar2);
            aoVarNewBuilder.mergeFrom((ao) apVar);
            apVar = aoVarNewBuilder.buildPartial();
        }
        this.parkingData_ = apVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        ef efVar2 = this.venue_;
        if (efVar2 != null && efVar2 != ef.getDefaultInstance()) {
            eb ebVarNewBuilder = ef.newBuilder(efVar2);
            ebVarNewBuilder.mergeFrom((eb) efVar);
            efVar = ebVarNewBuilder.buildPartial();
        }
        this.venue_ = efVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueDecorationData(as asVar) {
        Objects.requireNonNull(asVar);
        as asVar2 = this.venueDecorationData_;
        if (asVar2 != null && asVar2 != as.getDefaultInstance()) {
            ar arVarNewBuilder = as.newBuilder(asVar2);
            arVarNewBuilder.mergeFrom((ar) asVar);
            asVar = arVarNewBuilder.buildPartial();
        }
        this.venueDecorationData_ = asVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWalkingDistanceData(av avVar) {
        Objects.requireNonNull(avVar);
        av avVar2 = this.walkingDistanceData_;
        if (avVar2 != null && avVar2 != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder(avVar2);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.walkingDistanceData_ = avVar;
        this.bitField0_ |= 32;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static aw parseDelimitedFrom(InputStream inputStream) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(com.google.v.v vVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingData(ap apVar) {
        Objects.requireNonNull(apVar);
        this.parkingData_ = apVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultType(aq aqVar) {
        this.resultType_ = aqVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.routingContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContextBytes(com.google.v.v vVar) {
        this.routingContext_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatable(boolean z) {
        this.bitField0_ |= 4;
        this.updatable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        this.venue_ = efVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueDecorationData(as asVar) {
        Objects.requireNonNull(asVar);
        this.venueDecorationData_ = asVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueSource(at atVar) {
        this.venueSource_ = atVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingDistanceData(av avVar) {
        Objects.requireNonNull(avVar);
        this.walkingDistanceData_ = avVar;
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0005ဉ\u0003\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\t᠌\u0007", new Object[]{"bitField0_", "venue_", "routingContext_", "updatable_", "venueDecorationData_", "venueSource_", af.f49102d, "walkingDistanceData_", "parkingData_", "resultType_", af.f49101c});
            case 3:
                return new aw();
            case 4:
                return new an(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<aw> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (aw.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public ap getParkingData() {
        ap apVar = this.parkingData_;
        return apVar == null ? ap.getDefaultInstance() : apVar;
    }

    public aq getResultType() {
        aq aqVarA = aq.a(this.resultType_);
        return aqVarA == null ? aq.RESULT_TYPE_UNSPECIFIED : aqVarA;
    }

    public String getRoutingContext() {
        return this.routingContext_;
    }

    public com.google.v.v getRoutingContextBytes() {
        return com.google.v.v.s(this.routingContext_);
    }

    public boolean getUpdatable() {
        return this.updatable_;
    }

    public ef getVenue() {
        ef efVar = this.venue_;
        return efVar == null ? ef.getDefaultInstance() : efVar;
    }

    public as getVenueDecorationData() {
        as asVar = this.venueDecorationData_;
        return asVar == null ? as.getDefaultInstance() : asVar;
    }

    public at getVenueSource() {
        at atVarA = at.a(this.venueSource_);
        return atVarA == null ? at.VENUE_SOURCE_UNSPECIFIED : atVarA;
    }

    public av getWalkingDistanceData() {
        av avVar = this.walkingDistanceData_;
        return avVar == null ? av.getDefaultInstance() : avVar;
    }

    public boolean hasParkingData() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasResultType() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasRoutingContext() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUpdatable() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVenue() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVenueDecorationData() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVenueSource() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasWalkingDistanceData() {
        return (this.bitField0_ & 32) != 0;
    }

    public static an newBuilder(aw awVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(awVar);
    }

    public static aw parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(com.google.v.v vVar, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aw parseFrom(com.google.v.z zVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aw parseFrom(com.google.v.z zVar, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aw parseFrom(InputStream inputStream) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(InputStream inputStream, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(ByteBuffer byteBuffer) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aw parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aw parseFrom(byte[] bArr) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aw parseFrom(byte[] bArr, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
