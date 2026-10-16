package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agp extends com.google.v.du<agp, agn> implements com.google.v.fj {
    private static final agp DEFAULT_INSTANCE;
    public static final int LOCATIONS_DETAILS_FIELD_NUMBER = 2;
    public static final int LOCATION_DISTANCE_METERS_FIELD_NUMBER = 4;
    public static final int LOCATION_ISSUE_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<agp> PARSER = null;
    public static final int STALE_DURATION_MS_FIELD_NUMBER = 5;
    public static final int TIME_DIFFERENCE_MS_FIELD_NUMBER = 3;
    private int bitField0_;
    private long locationDistanceMeters_;
    private int locationIssueType_;
    private com.google.v.eo<agl> locationsDetails_ = emptyProtobufList();
    private long staleDurationMs_;
    private long timeDifferenceMs_;

    static {
        agp agpVar = new agp();
        DEFAULT_INSTANCE = agpVar;
        com.google.v.du.registerDefaultInstance(agp.class, agpVar);
    }

    private agp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLocationsDetails(Iterable<? extends agl> iterable) {
        ensureLocationsDetailsIsMutable();
        com.google.v.c.addAll(iterable, this.locationsDetails_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocationsDetails(int i2, agl aglVar) {
        Objects.requireNonNull(aglVar);
        ensureLocationsDetailsIsMutable();
        this.locationsDetails_.add(i2, aglVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationDistanceMeters() {
        this.bitField0_ &= -3;
        this.locationDistanceMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationIssueType() {
        this.locationIssueType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationsDetails() {
        this.locationsDetails_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaleDurationMs() {
        this.bitField0_ &= -5;
        this.staleDurationMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeDifferenceMs() {
        this.bitField0_ &= -2;
        this.timeDifferenceMs_ = 0L;
    }

    private void ensureLocationsDetailsIsMutable() {
        com.google.v.eo<agl> eoVar = this.locationsDetails_;
        if (eoVar.c()) {
            return;
        }
        this.locationsDetails_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static agp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static agn newBuilder() {
        return (agn) DEFAULT_INSTANCE.createBuilder();
    }

    public static agp parseDelimitedFrom(InputStream inputStream) {
        return (agp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agp parseFrom(com.google.v.v vVar) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<agp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocationsDetails(int i2) {
        ensureLocationsDetailsIsMutable();
        this.locationsDetails_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationDistanceMeters(long j2) {
        this.bitField0_ |= 2;
        this.locationDistanceMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationIssueType(ago agoVar) {
        this.locationIssueType_ = agoVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationIssueTypeValue(int i2) {
        this.locationIssueType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationsDetails(int i2, agl aglVar) {
        Objects.requireNonNull(aglVar);
        ensureLocationsDetailsIsMutable();
        this.locationsDetails_.set(i2, aglVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaleDurationMs(long j2) {
        this.bitField0_ |= 4;
        this.staleDurationMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeDifferenceMs(long j2) {
        this.bitField0_ |= 1;
        this.timeDifferenceMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003ဂ\u0000\u0004ဂ\u0001\u0005ဂ\u0002", new Object[]{"bitField0_", "locationIssueType_", "locationsDetails_", agl.class, "timeDifferenceMs_", "locationDistanceMeters_", "staleDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new agp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new agn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<agp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (agp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLocationDistanceMeters() {
        return this.locationDistanceMeters_;
    }

    public ago getLocationIssueType() {
        int i2 = this.locationIssueType_;
        ago agoVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : ago.STALE_ACCURACY : ago.STALE_LOCATION : ago.LOCATION_INCONSISTENCY : ago.TIME_INCONSISTENCY : ago.LOCATION_ISSUE_TYPE_UNSPECIFIED;
        return agoVar == null ? ago.UNRECOGNIZED : agoVar;
    }

    public int getLocationIssueTypeValue() {
        return this.locationIssueType_;
    }

    public agl getLocationsDetails(int i2) {
        return this.locationsDetails_.get(i2);
    }

    public int getLocationsDetailsCount() {
        return this.locationsDetails_.size();
    }

    public List<agl> getLocationsDetailsList() {
        return this.locationsDetails_;
    }

    public agm getLocationsDetailsOrBuilder(int i2) {
        return this.locationsDetails_.get(i2);
    }

    public List<? extends agm> getLocationsDetailsOrBuilderList() {
        return this.locationsDetails_;
    }

    public long getStaleDurationMs() {
        return this.staleDurationMs_;
    }

    public long getTimeDifferenceMs() {
        return this.timeDifferenceMs_;
    }

    public boolean hasLocationDistanceMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStaleDurationMs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTimeDifferenceMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static agn newBuilder(agp agpVar) {
        return (agn) DEFAULT_INSTANCE.createBuilder(agpVar);
    }

    public static agp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static agp parseFrom(com.google.v.z zVar) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static agp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocationsDetails(agl aglVar) {
        Objects.requireNonNull(aglVar);
        ensureLocationsDetailsIsMutable();
        this.locationsDetails_.add(aglVar);
    }

    public static agp parseFrom(InputStream inputStream) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agp parseFrom(ByteBuffer byteBuffer) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static agp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static agp parseFrom(byte[] bArr) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static agp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (agp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
