package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class blg extends com.google.v.du<blg, blf> implements blh {
    public static final int ALERTS_FIELD_NUMBER = 2;
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 7;
    private static final blg DEFAULT_INSTANCE;
    public static final int GHG_EMISSION_SHOWN_FIELD_NUMBER = 3;
    public static final int HOV_INFORMATION_FIELD_NUMBER = 5;
    public static final int INSIGHTS_FIELD_NUMBER = 1;
    public static final int IS_BEST_FIELD_NUMBER = 8;
    public static final int IS_PREFERRED_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<blg> PARSER = null;
    public static final int RESTRICTIONS_FIELD_NUMBER = 10;
    public static final int ROUTE_ALT_ID_FIELD_NUMBER = 6;
    public static final int TOLL_INFORMATION_FIELD_NUMBER = 4;
    private static final com.google.v.el<awg> insights_converter_ = new ve(15);
    private int bitField0_;
    private boolean ghgEmissionShown_;
    private abl hovInformation_;
    private int insightsMemoizedSerializedSize;
    private boolean isBest_;
    private boolean isPreferred_;
    private long routeAltId_;
    private biu tollInformation_;
    private com.google.v.ek insights_ = emptyIntList();
    private com.google.v.eo<ck> alerts_ = emptyProtobufList();
    private String alternativeRouteUuid_ = "";
    private com.google.v.eo<String> restrictions_ = emptyProtobufList();

    static {
        blg blgVar = new blg();
        DEFAULT_INSTANCE = blgVar;
        com.google.v.du.registerDefaultInstance(blg.class, blgVar);
    }

    private blg() {
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
    public void clearAlerts() {
        this.alerts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGhgEmissionShown() {
        this.bitField0_ &= -2;
        this.ghgEmissionShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovInformation() {
        this.hovInformation_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsights() {
        this.insights_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBest() {
        this.bitField0_ &= -17;
        this.isBest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPreferred() {
        this.bitField0_ &= -33;
        this.isPreferred_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictions() {
        this.restrictions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteAltId() {
        this.bitField0_ &= -9;
        this.routeAltId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollInformation() {
        this.tollInformation_ = null;
        this.bitField0_ &= -3;
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

    public static blg getDefaultInstance() {
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
        this.bitField0_ |= 4;
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
        this.bitField0_ |= 2;
    }

    public static blf newBuilder() {
        return (blf) DEFAULT_INSTANCE.createBuilder();
    }

    public static blg parseDelimitedFrom(InputStream inputStream) {
        return (blg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blg parseFrom(com.google.v.v vVar) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<blg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlerts(int i2) {
        ensureAlertsIsMutable();
        this.alerts_.remove(i2);
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
    public void setGhgEmissionShown(boolean z) {
        this.bitField0_ |= 1;
        this.ghgEmissionShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovInformation(abl ablVar) {
        Objects.requireNonNull(ablVar);
        this.hovInformation_ = ablVar;
        this.bitField0_ |= 4;
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
    public void setIsBest(boolean z) {
        this.bitField0_ |= 16;
        this.isBest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPreferred(boolean z) {
        this.bitField0_ |= 32;
        this.isPreferred_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictions(int i2, String str) {
        Objects.requireNonNull(str);
        ensureRestrictionsIsMutable();
        this.restrictions_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteAltId(long j2) {
        this.bitField0_ |= 8;
        this.routeAltId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollInformation(biu biuVar) {
        Objects.requireNonNull(biuVar);
        this.tollInformation_ = biuVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0003\u0000\u0001,\u0002\u001b\u0003ဇ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဂ\u0003\u0007Ȉ\bဇ\u0004\tဇ\u0005\nȚ", new Object[]{"bitField0_", "insights_", "alerts_", ck.class, "ghgEmissionShown_", "tollInformation_", "hovInformation_", "routeAltId_", "alternativeRouteUuid_", "isBest_", "isPreferred_", "restrictions_"});
        }
        if (iOrdinal == 3) {
            return new blg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new blf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<blg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (blg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
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

    public boolean getGhgEmissionShown() {
        return this.ghgEmissionShown_;
    }

    public abl getHovInformation() {
        abl ablVar = this.hovInformation_;
        return ablVar == null ? abl.getDefaultInstance() : ablVar;
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

    public boolean getIsBest() {
        return this.isBest_;
    }

    public boolean getIsPreferred() {
        return this.isPreferred_;
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

    public long getRouteAltId() {
        return this.routeAltId_;
    }

    public biu getTollInformation() {
        biu biuVar = this.tollInformation_;
        return biuVar == null ? biu.getDefaultInstance() : biuVar;
    }

    public boolean hasGhgEmissionShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHovInformation() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsBest() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsPreferred() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRouteAltId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTollInformation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static blf newBuilder(blg blgVar) {
        return (blf) DEFAULT_INSTANCE.createBuilder(blgVar);
    }

    public static blg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (blg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static blg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static blg parseFrom(com.google.v.z zVar) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static blg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerts(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureAlertsIsMutable();
        this.alerts_.add(ckVar);
    }

    public static blg parseFrom(InputStream inputStream) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static blg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static blg parseFrom(ByteBuffer byteBuffer) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static blg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static blg parseFrom(byte[] bArr) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static blg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (blg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
