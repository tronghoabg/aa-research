package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class dk extends com.google.v.du<dk, di> implements dl {
    public static final int ACTUAL_DURATION_DELTA_SECONDS_FIELD_NUMBER = 8;
    public static final int ALERTS_FIELD_NUMBER = 2;
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 3;
    public static final int CURRENT_FIELD_NUMBER = 6;
    private static final dk DEFAULT_INSTANCE;
    public static final int DISTANCE_METERS_FIELD_NUMBER = 5;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 4;
    public static final int HOV_INFORMATION_FIELD_NUMBER = 10;
    public static final int HOV_TOGGLE_STATE_FIELD_NUMBER = 12;
    public static final int INSIGHTS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<dk> PARSER = null;
    public static final int PRESENTED_DURATION_DELTA_SECONDS_FIELD_NUMBER = 7;
    public static final int RESTRICTIONS_FIELD_NUMBER = 14;
    public static final int ROUTE_INDEX_IN_LIST_FIELD_NUMBER = 13;
    public static final int STOP_FIELD_NUMBER = 11;
    public static final int TOLL_INFORMATION_FIELD_NUMBER = 9;
    private static final com.google.v.el<awg> insights_converter_ = new ve(1);
    private long actualDurationDeltaSeconds_;
    private int bitField0_;
    private boolean current_;
    private long distanceMeters_;
    private long durationSeconds_;
    private abl hovInformation_;
    private int hovToggleState_;
    private int insightsMemoizedSerializedSize;
    private long presentedDurationDeltaSeconds_;
    private long routeIndexInList_;
    private boolean stop_;
    private biu tollInformation_;
    private com.google.v.ek insights_ = emptyIntList();
    private com.google.v.eo<ck> alerts_ = emptyProtobufList();
    private String alternativeRouteUuid_ = "";
    private com.google.v.eo<String> restrictions_ = emptyProtobufList();

    static {
        dk dkVar = new dk();
        DEFAULT_INSTANCE = dkVar;
        com.google.v.du.registerDefaultInstance(dk.class, dkVar);
    }

    private dk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerts(int i2, ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureAlertsIsMutable();
        this.alerts_.add(i2, ckVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlerts(Iterable<? extends ck> iterable) {
        ensureAlertsIsMutable();
        com.google.v.c.addAll(iterable, this.alerts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInsights(Iterable<? extends awg> iterable) {
        ensureInsightsIsMutable();
        Iterator<? extends awg> it = iterable.iterator();
        while (it.hasNext()) {
            this.insights_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInsightsValue(Iterable<Integer> iterable) {
        ensureInsightsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.insights_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestrictions(Iterable<String> iterable) {
        ensureRestrictionsIsMutable();
        com.google.v.c.addAll(iterable, this.restrictions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInsights(awg awgVar) {
        Objects.requireNonNull(awgVar);
        ensureInsightsIsMutable();
        this.insights_.i(awgVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInsightsValue(int i2) {
        ensureInsightsIsMutable();
        this.insights_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestrictions(String str) {
        Objects.requireNonNull(str);
        ensureRestrictionsIsMutable();
        this.restrictions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestrictionsBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureRestrictionsIsMutable();
        this.restrictions_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActualDurationDeltaSeconds() {
        this.bitField0_ &= -17;
        this.actualDurationDeltaSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerts() {
        this.alerts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrent() {
        this.bitField0_ &= -5;
        this.current_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceMeters() {
        this.bitField0_ &= -3;
        this.distanceMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationSeconds() {
        this.bitField0_ &= -2;
        this.durationSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovInformation() {
        this.hovInformation_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovToggleState() {
        this.hovToggleState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsights() {
        this.insights_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPresentedDurationDeltaSeconds() {
        this.bitField0_ &= -9;
        this.presentedDurationDeltaSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictions() {
        this.restrictions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteIndexInList() {
        this.bitField0_ &= -257;
        this.routeIndexInList_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStop() {
        this.bitField0_ &= -129;
        this.stop_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollInformation() {
        this.tollInformation_ = null;
        this.bitField0_ &= -33;
    }

    private void ensureAlertsIsMutable() {
        com.google.v.eo<ck> eoVar = this.alerts_;
        if (eoVar.c()) {
            return;
        }
        this.alerts_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureInsightsIsMutable() {
        com.google.v.ek ekVar = this.insights_;
        if (ekVar.c()) {
            return;
        }
        this.insights_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureRestrictionsIsMutable() {
        com.google.v.eo<String> eoVar = this.restrictions_;
        if (eoVar.c()) {
            return;
        }
        this.restrictions_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static dk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHovInformation(abl ablVar) {
        Objects.requireNonNull(ablVar);
        abl ablVar2 = this.hovInformation_;
        if (ablVar2 != null && ablVar2 != abl.getDefaultInstance()) {
            abk abkVarNewBuilder = abl.newBuilder(ablVar2);
            abkVarNewBuilder.mergeFrom((abk) ablVar);
            ablVar = abkVarNewBuilder.buildPartial();
        }
        this.hovInformation_ = ablVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollInformation(biu biuVar) {
        Objects.requireNonNull(biuVar);
        biu biuVar2 = this.tollInformation_;
        if (biuVar2 != null && biuVar2 != biu.getDefaultInstance()) {
            bis bisVarNewBuilder = biu.newBuilder(biuVar2);
            bisVarNewBuilder.mergeFrom((bis) biuVar);
            biuVar = bisVarNewBuilder.buildPartial();
        }
        this.tollInformation_ = biuVar;
        this.bitField0_ |= 32;
    }

    public static di newBuilder() {
        return (di) DEFAULT_INSTANCE.createBuilder();
    }

    public static dk parseDelimitedFrom(InputStream inputStream) {
        return (dk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dk parseFrom(com.google.v.v vVar) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlerts(int i2) {
        ensureAlertsIsMutable();
        this.alerts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActualDurationDeltaSeconds(long j2) {
        this.bitField0_ |= 16;
        this.actualDurationDeltaSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerts(int i2, ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureAlertsIsMutable();
        this.alerts_.set(i2, ckVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alternativeRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrent(boolean z) {
        this.bitField0_ |= 4;
        this.current_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceMeters(long j2) {
        this.bitField0_ |= 2;
        this.distanceMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationSeconds(long j2) {
        this.bitField0_ |= 1;
        this.durationSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovInformation(abl ablVar) {
        Objects.requireNonNull(ablVar);
        this.hovInformation_ = ablVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovToggleState(dj djVar) {
        this.hovToggleState_ = djVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovToggleStateValue(int i2) {
        this.hovToggleState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsights(int i2, awg awgVar) {
        Objects.requireNonNull(awgVar);
        ensureInsightsIsMutable();
        this.insights_.e(i2, awgVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightsValue(int i2, int i3) {
        ensureInsightsIsMutable();
        this.insights_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresentedDurationDeltaSeconds(long j2) {
        this.bitField0_ |= 8;
        this.presentedDurationDeltaSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictions(int i2, String str) {
        Objects.requireNonNull(str);
        ensureRestrictionsIsMutable();
        this.restrictions_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteIndexInList(long j2) {
        this.bitField0_ |= 256;
        this.routeIndexInList_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStop(boolean z) {
        this.bitField0_ |= 128;
        this.stop_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollInformation(biu biuVar) {
        Objects.requireNonNull(biuVar);
        this.tollInformation_ = biuVar;
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001,\u0002\u001b\u0003Ȉ\u0004ဂ\u0000\u0005ဂ\u0001\u0006ဇ\u0002\u0007တ\u0003\bတ\u0004\tဉ\u0005\nဉ\u0006\u000bဇ\u0007\f\f\rဂ\b\u000eȚ", new Object[]{"bitField0_", "insights_", "alerts_", ck.class, "alternativeRouteUuid_", "durationSeconds_", "distanceMeters_", "current_", "presentedDurationDeltaSeconds_", "actualDurationDeltaSeconds_", "tollInformation_", "hovInformation_", "stop_", "hovToggleState_", "routeIndexInList_", "restrictions_"});
        }
        if (iOrdinal == 3) {
            return new dk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new di(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getActualDurationDeltaSeconds() {
        return this.actualDurationDeltaSeconds_;
    }

    public ck getAlerts(int i2) {
        return this.alerts_.get(i2);
    }

    public int getAlertsCount() {
        return this.alerts_.size();
    }

    public List<ck> getAlertsList() {
        return this.alerts_;
    }

    public cl getAlertsOrBuilder(int i2) {
        return this.alerts_.get(i2);
    }

    public List<? extends cl> getAlertsOrBuilderList() {
        return this.alerts_;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public boolean getCurrent() {
        return this.current_;
    }

    public long getDistanceMeters() {
        return this.distanceMeters_;
    }

    public long getDurationSeconds() {
        return this.durationSeconds_;
    }

    public abl getHovInformation() {
        abl ablVar = this.hovInformation_;
        return ablVar == null ? abl.getDefaultInstance() : ablVar;
    }

    public dj getHovToggleState() {
        int i2 = this.hovToggleState_;
        dj djVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : dj.HOV_ON : dj.HOV_OFF : dj.HOV_ONLY : dj.NO_HOV : dj.HOV_TOGGLE_STATE_UNSPECIFIED;
        return djVar == null ? dj.UNRECOGNIZED : djVar;
    }

    public int getHovToggleStateValue() {
        return this.hovToggleState_;
    }

    public awg getInsights(int i2) {
        awg awgVarA = awg.a(this.insights_.d(i2));
        return awgVarA == null ? awg.UNRECOGNIZED : awgVarA;
    }

    public int getInsightsCount() {
        return this.insights_.size();
    }

    public List<awg> getInsightsList() {
        return new com.google.v.em(this.insights_, insights_converter_);
    }

    public int getInsightsValue(int i2) {
        return this.insights_.d(i2);
    }

    public List<Integer> getInsightsValueList() {
        return this.insights_;
    }

    public long getPresentedDurationDeltaSeconds() {
        return this.presentedDurationDeltaSeconds_;
    }

    public String getRestrictions(int i2) {
        return this.restrictions_.get(i2);
    }

    public com.google.v.v getRestrictionsBytes(int i2) {
        return com.google.v.v.s(this.restrictions_.get(i2));
    }

    public int getRestrictionsCount() {
        return this.restrictions_.size();
    }

    public List<String> getRestrictionsList() {
        return this.restrictions_;
    }

    public long getRouteIndexInList() {
        return this.routeIndexInList_;
    }

    public boolean getStop() {
        return this.stop_;
    }

    public biu getTollInformation() {
        biu biuVar = this.tollInformation_;
        return biuVar == null ? biu.getDefaultInstance() : biuVar;
    }

    public boolean hasActualDurationDeltaSeconds() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCurrent() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDistanceMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDurationSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHovInformation() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPresentedDurationDeltaSeconds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRouteIndexInList() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasStop() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasTollInformation() {
        return (this.bitField0_ & 32) != 0;
    }

    public static di newBuilder(dk dkVar) {
        return (di) DEFAULT_INSTANCE.createBuilder(dkVar);
    }

    public static dk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dk parseFrom(com.google.v.z zVar) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerts(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureAlertsIsMutable();
        this.alerts_.add(ckVar);
    }

    public static dk parseFrom(InputStream inputStream) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dk parseFrom(ByteBuffer byteBuffer) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dk parseFrom(byte[] bArr) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
