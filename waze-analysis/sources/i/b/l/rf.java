package i.b.l;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rf extends com.google.v.du<rf, re> implements rg {
    public static final int ALERTADDON_FIELD_NUMBER = 4;
    public static final int ALERTDETAILS_FIELD_NUMBER = 24;
    public static final int ALERTID_FIELD_NUMBER = 1;
    public static final int ALERTSUBTYPE_FIELD_NUMBER = 3;
    public static final int ALERTTYPE_FIELD_NUMBER = 2;
    public static final int CITY_FIELD_NUMBER = 15;
    private static final rf DEFAULT_INSTANCE;
    public static final int DELAYSECONDS_FIELD_NUMBER = 26;
    public static final int DURATION_FIELD_NUMBER = 11;
    public static final int ENDNAME_FIELD_NUMBER = 17;
    public static final int FIRSTREPORTEDTIMESTAMP_FIELD_NUMBER = 20;
    public static final int GEOMETRYPOINTS_FIELD_NUMBER = 19;
    public static final int HISTORICDELAYSECONDS_FIELD_NUMBER = 27;
    public static final int ISMAJOREVENT_FIELD_NUMBER = 10;
    public static final int ISPARTIALLANECLOSURE_FIELD_NUMBER = 23;
    public static final int JAMID_FIELD_NUMBER = 22;
    public static final int LASTREPORTEDTIMESTAMP_FIELD_NUMBER = 21;
    public static final int LOCATION_FIELD_NUMBER = 18;
    public static final int NOTTHERECOUNT_FIELD_NUMBER = 31;
    public static final int NUMREPORTED_FIELD_NUMBER = 13;
    public static final int NUMTHANKED_FIELD_NUMBER = 12;
    public static final int NUMTHUMBSUP_FIELD_NUMBER = 30;
    private static volatile com.google.v.fo<rf> PARSER = null;
    public static final int POSEND_FIELD_NUMBER = 7;
    public static final int POSSTART_FIELD_NUMBER = 6;
    public static final int RATIOONROADEND_FIELD_NUMBER = 9;
    public static final int RATIOONROADSTART_FIELD_NUMBER = 8;
    public static final int ROADINFOSEVERITY_FIELD_NUMBER = 5;
    public static final int SERVERSEGMENTID_FIELD_NUMBER = 25;
    public static final int STARTNAME_FIELD_NUMBER = 16;
    public static final int STREET_FIELD_NUMBER = 14;
    public static final int TOTALLENGTHMETERS_FIELD_NUMBER = 29;
    public static final int TOTALTIMESECONDS_FIELD_NUMBER = 28;
    private com.waze.bg.a.ej alertDetails_;
    private long alertId_;
    private int alertSubType_;
    private int alertType_;
    private int bitField0_;
    private int delaySeconds_;
    private int duration_;
    private long firstReportedTimestamp_;
    private int historicDelaySeconds_;
    private boolean isMajorEvent_;
    private boolean isPartialLaneClosure_;
    private long jamId_;
    private long lastReportedTimestamp_;
    private i.b.s location_;
    private int notThereCount_;
    private int numReported_;
    private int numThanked_;
    private int numThumbsUp_;
    private i.b.s posEnd_;
    private i.b.s posStart_;
    private double ratioOnRoadEnd_;
    private double ratioOnRoadStart_;
    private int roadInfoSeverity_;
    private int totalLengthMeters_;
    private int totalTimeSeconds_;
    private String alertAddon_ = "";
    private String street_ = "";
    private String city_ = "";
    private String startName_ = "";
    private String endName_ = "";
    private com.google.v.eo<i.b.s> geometryPoints_ = emptyProtobufList();
    private com.google.v.ek serverSegmentId_ = emptyIntList();

    static {
        rf rfVar = new rf();
        DEFAULT_INSTANCE = rfVar;
        com.google.v.du.registerDefaultInstance(rf.class, rfVar);
    }

    private rf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGeometryPoints(Iterable<? extends i.b.s> iterable) {
        ensureGeometryPointsIsMutable();
        com.google.v.c.addAll(iterable, this.geometryPoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServerSegmentId(Iterable<? extends Integer> iterable) {
        ensureServerSegmentIdIsMutable();
        com.google.v.c.addAll(iterable, this.serverSegmentId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeometryPoints(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureGeometryPointsIsMutable();
        this.geometryPoints_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServerSegmentId(int i2) {
        ensureServerSegmentIdIsMutable();
        this.serverSegmentId_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertAddon() {
        this.bitField0_ &= -9;
        this.alertAddon_ = getDefaultInstance().getAlertAddon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetails_ = null;
        this.bitField0_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.bitField0_ &= -2;
        this.alertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertSubType() {
        this.bitField0_ &= -5;
        this.alertSubType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertType() {
        this.bitField0_ &= -3;
        this.alertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.bitField0_ &= -16385;
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelaySeconds() {
        this.bitField0_ &= -8388609;
        this.delaySeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.bitField0_ &= -1025;
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndName() {
        this.bitField0_ &= -65537;
        this.endName_ = getDefaultInstance().getEndName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstReportedTimestamp() {
        this.bitField0_ &= -262145;
        this.firstReportedTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometryPoints() {
        this.geometryPoints_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistoricDelaySeconds() {
        this.bitField0_ &= -16777217;
        this.historicDelaySeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMajorEvent() {
        this.bitField0_ &= -513;
        this.isMajorEvent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPartialLaneClosure() {
        this.bitField0_ &= -2097153;
        this.isPartialLaneClosure_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJamId() {
        this.bitField0_ &= -1048577;
        this.jamId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastReportedTimestamp() {
        this.bitField0_ &= -524289;
        this.lastReportedTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotThereCount() {
        this.bitField0_ &= -268435457;
        this.notThereCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumReported() {
        this.bitField0_ &= -4097;
        this.numReported_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumThanked() {
        this.bitField0_ &= -2049;
        this.numThanked_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumThumbsUp() {
        this.bitField0_ &= -134217729;
        this.numThumbsUp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosEnd() {
        this.posEnd_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosStart() {
        this.posStart_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRatioOnRoadEnd() {
        this.bitField0_ &= -257;
        this.ratioOnRoadEnd_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRatioOnRoadStart() {
        this.bitField0_ &= -129;
        this.ratioOnRoadStart_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadInfoSeverity() {
        this.bitField0_ &= -17;
        this.roadInfoSeverity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSegmentId() {
        this.serverSegmentId_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartName() {
        this.bitField0_ &= -32769;
        this.startName_ = getDefaultInstance().getStartName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -8193;
        this.street_ = getDefaultInstance().getStreet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalLengthMeters() {
        this.bitField0_ &= -67108865;
        this.totalLengthMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalTimeSeconds() {
        this.bitField0_ &= -33554433;
        this.totalTimeSeconds_ = 0;
    }

    private void ensureGeometryPointsIsMutable() {
        com.google.v.eo<i.b.s> eoVar = this.geometryPoints_;
        if (eoVar.c()) {
            return;
        }
        this.geometryPoints_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureServerSegmentIdIsMutable() {
        com.google.v.ek ekVar = this.serverSegmentId_;
        if (ekVar.c()) {
            return;
        }
        this.serverSegmentId_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static rf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        com.waze.bg.a.ej ejVar2 = this.alertDetails_;
        if (ejVar2 != null && ejVar2 != com.waze.bg.a.ej.getDefaultInstance()) {
            com.waze.bg.a.dk dkVarNewBuilder = com.waze.bg.a.ej.newBuilder(ejVar2);
            dkVarNewBuilder.mergeFrom((com.waze.bg.a.dk) ejVar);
            ejVar = dkVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 4194304;
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
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosEnd(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.posEnd_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.posEnd_ = sVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosStart(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.posStart_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.posStart_ = sVar;
        this.bitField0_ |= 32;
    }

    public static re newBuilder() {
        return (re) DEFAULT_INSTANCE.createBuilder();
    }

    public static rf parseDelimitedFrom(InputStream inputStream) {
        return (rf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rf parseFrom(com.google.v.v vVar) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGeometryPoints(int i2) {
        ensureGeometryPointsIsMutable();
        this.geometryPoints_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertAddon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.alertAddon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertAddonBytes(com.google.v.v vVar) {
        this.alertAddon_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(long j2) {
        this.bitField0_ |= 1;
        this.alertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertSubType(i.b.j jVar) {
        this.alertSubType_ = jVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertType(i.b.l lVar) {
        this.alertType_ = lVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(com.google.v.v vVar) {
        this.city_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelaySeconds(int i2) {
        this.bitField0_ |= 8388608;
        this.delaySeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i2) {
        this.bitField0_ |= 1024;
        this.duration_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.endName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndNameBytes(com.google.v.v vVar) {
        this.endName_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstReportedTimestamp(long j2) {
        this.bitField0_ |= 262144;
        this.firstReportedTimestamp_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometryPoints(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureGeometryPointsIsMutable();
        this.geometryPoints_.set(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoricDelaySeconds(int i2) {
        this.bitField0_ |= 16777216;
        this.historicDelaySeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMajorEvent(boolean z) {
        this.bitField0_ |= 512;
        this.isMajorEvent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPartialLaneClosure(boolean z) {
        this.bitField0_ |= 2097152;
        this.isPartialLaneClosure_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJamId(long j2) {
        this.bitField0_ |= 1048576;
        this.jamId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastReportedTimestamp(long j2) {
        this.bitField0_ |= 524288;
        this.lastReportedTimestamp_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.location_ = sVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotThereCount(int i2) {
        this.bitField0_ |= 268435456;
        this.notThereCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumReported(int i2) {
        this.bitField0_ |= 4096;
        this.numReported_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumThanked(int i2) {
        this.bitField0_ |= 2048;
        this.numThanked_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumThumbsUp(int i2) {
        this.bitField0_ |= 134217728;
        this.numThumbsUp_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosEnd(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.posEnd_ = sVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosStart(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.posStart_ = sVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRatioOnRoadEnd(double d2) {
        this.bitField0_ |= 256;
        this.ratioOnRoadEnd_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRatioOnRoadStart(double d2) {
        this.bitField0_ |= 128;
        this.ratioOnRoadStart_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadInfoSeverity(int i2) {
        this.bitField0_ |= 16;
        this.roadInfoSeverity_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSegmentId(int i2, int i3) {
        ensureServerSegmentIdIsMutable();
        this.serverSegmentId_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.startName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartNameBytes(com.google.v.v vVar) {
        this.startName_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8192;
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(com.google.v.v vVar) {
        this.street_ = vVar.u();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalLengthMeters(int i2) {
        this.bitField0_ |= 67108864;
        this.totalLengthMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalTimeSeconds(int i2) {
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.totalTimeSeconds_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0002\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bက\u0007\tက\b\nဇ\t\u000bင\n\fင\u000b\rင\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဉ\u0011\u0013\u001b\u0014ဂ\u0012\u0015ဂ\u0013\u0016ဂ\u0014\u0017ဇ\u0015\u0018ဉ\u0016\u0019\u0016\u001aင\u0017\u001bင\u0018\u001cင\u0019\u001dင\u001a\u001eင\u001b\u001fင\u001c", new Object[]{"bitField0_", "alertId_", "alertType_", i.b.l.a(), "alertSubType_", i.b.j.a(), "alertAddon_", "roadInfoSeverity_", "posStart_", "posEnd_", "ratioOnRoadStart_", "ratioOnRoadEnd_", "isMajorEvent_", "duration_", "numThanked_", "numReported_", "street_", "city_", "startName_", "endName_", "location_", "geometryPoints_", i.b.s.class, "firstReportedTimestamp_", "lastReportedTimestamp_", "jamId_", "isPartialLaneClosure_", "alertDetails_", "serverSegmentId_", "delaySeconds_", "historicDelaySeconds_", "totalTimeSeconds_", "totalLengthMeters_", "numThumbsUp_", "notThereCount_"});
        }
        if (iOrdinal == 3) {
            return new rf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new re(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlertAddon() {
        return this.alertAddon_;
    }

    public com.google.v.v getAlertAddonBytes() {
        return com.google.v.v.s(this.alertAddon_);
    }

    public com.waze.bg.a.ej getAlertDetails() {
        com.waze.bg.a.ej ejVar = this.alertDetails_;
        return ejVar == null ? com.waze.bg.a.ej.getDefaultInstance() : ejVar;
    }

    public long getAlertId() {
        return this.alertId_;
    }

    public i.b.j getAlertSubType() {
        i.b.j jVarB = i.b.j.b(this.alertSubType_);
        return jVarB == null ? i.b.j.NO_SUBTYPE : jVarB;
    }

    public i.b.l getAlertType() {
        i.b.l lVarB = i.b.l.b(this.alertType_);
        return lVarB == null ? i.b.l.CHIT_CHAT : lVarB;
    }

    public String getCity() {
        return this.city_;
    }

    public com.google.v.v getCityBytes() {
        return com.google.v.v.s(this.city_);
    }

    public int getDelaySeconds() {
        return this.delaySeconds_;
    }

    public int getDuration() {
        return this.duration_;
    }

    public String getEndName() {
        return this.endName_;
    }

    public com.google.v.v getEndNameBytes() {
        return com.google.v.v.s(this.endName_);
    }

    public long getFirstReportedTimestamp() {
        return this.firstReportedTimestamp_;
    }

    public i.b.s getGeometryPoints(int i2) {
        return this.geometryPoints_.get(i2);
    }

    public int getGeometryPointsCount() {
        return this.geometryPoints_.size();
    }

    public List<i.b.s> getGeometryPointsList() {
        return this.geometryPoints_;
    }

    public i.b.t getGeometryPointsOrBuilder(int i2) {
        return this.geometryPoints_.get(i2);
    }

    public List<? extends i.b.t> getGeometryPointsOrBuilderList() {
        return this.geometryPoints_;
    }

    public int getHistoricDelaySeconds() {
        return this.historicDelaySeconds_;
    }

    public boolean getIsMajorEvent() {
        return this.isMajorEvent_;
    }

    public boolean getIsPartialLaneClosure() {
        return this.isPartialLaneClosure_;
    }

    public long getJamId() {
        return this.jamId_;
    }

    public long getLastReportedTimestamp() {
        return this.lastReportedTimestamp_;
    }

    public i.b.s getLocation() {
        i.b.s sVar = this.location_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public int getNotThereCount() {
        return this.notThereCount_;
    }

    public int getNumReported() {
        return this.numReported_;
    }

    public int getNumThanked() {
        return this.numThanked_;
    }

    public int getNumThumbsUp() {
        return this.numThumbsUp_;
    }

    @Deprecated
    public i.b.s getPosEnd() {
        i.b.s sVar = this.posEnd_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    @Deprecated
    public i.b.s getPosStart() {
        i.b.s sVar = this.posStart_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public double getRatioOnRoadEnd() {
        return this.ratioOnRoadEnd_;
    }

    public double getRatioOnRoadStart() {
        return this.ratioOnRoadStart_;
    }

    public int getRoadInfoSeverity() {
        return this.roadInfoSeverity_;
    }

    public int getServerSegmentId(int i2) {
        return this.serverSegmentId_.d(i2);
    }

    public int getServerSegmentIdCount() {
        return this.serverSegmentId_.size();
    }

    public List<Integer> getServerSegmentIdList() {
        return this.serverSegmentId_;
    }

    public String getStartName() {
        return this.startName_;
    }

    public com.google.v.v getStartNameBytes() {
        return com.google.v.v.s(this.startName_);
    }

    public String getStreet() {
        return this.street_;
    }

    public com.google.v.v getStreetBytes() {
        return com.google.v.v.s(this.street_);
    }

    public int getTotalLengthMeters() {
        return this.totalLengthMeters_;
    }

    public int getTotalTimeSeconds() {
        return this.totalTimeSeconds_;
    }

    public boolean hasAlertAddon() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAlertDetails() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasAlertId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAlertSubType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAlertType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCity() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasDelaySeconds() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasDuration() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasEndName() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasFirstReportedTimestamp() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasHistoricDelaySeconds() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasIsMajorEvent() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasIsPartialLaneClosure() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasJamId() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasLastReportedTimestamp() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasNotThereCount() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasNumReported() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasNumThanked() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasNumThumbsUp() {
        return (this.bitField0_ & 134217728) != 0;
    }

    @Deprecated
    public boolean hasPosEnd() {
        return (this.bitField0_ & 64) != 0;
    }

    @Deprecated
    public boolean hasPosStart() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRatioOnRoadEnd() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasRatioOnRoadStart() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasRoadInfoSeverity() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasStartName() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasTotalLengthMeters() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasTotalTimeSeconds() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public static re newBuilder(rf rfVar) {
        return (re) DEFAULT_INSTANCE.createBuilder(rfVar);
    }

    public static rf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rf parseFrom(com.google.v.z zVar) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeometryPoints(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureGeometryPointsIsMutable();
        this.geometryPoints_.add(sVar);
    }

    public static rf parseFrom(InputStream inputStream) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rf parseFrom(ByteBuffer byteBuffer) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rf parseFrom(byte[] bArr) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
