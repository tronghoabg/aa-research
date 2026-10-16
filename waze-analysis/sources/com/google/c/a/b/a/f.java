package com.google.c.a.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ei;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends du<f, a> implements fj {
    private static final f DEFAULT_INSTANCE;
    public static final int DISPLAYED_PLACE_RESULTS_FIELD_NUMBER = 5;
    public static final int DRIVING_INFO_CONSENT_STATE_FIELD_NUMBER = 6;
    public static final int FINAL_DESTINATION_ARRIVAL_TIMESTAMP_SECONDS_FIELD_NUMBER = 4;
    public static final int HOME_ALIAS_STATE_FIELD_NUMBER = 2;
    public static final int NAVIGATION_STATE_FIELD_NUMBER = 1;
    private static volatile fo<f> PARSER = null;
    public static final int WORK_ALIAS_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int drivingInfoConsentState_;
    private long finalDestinationArrivalTimestampSeconds_;
    private int homeAliasState_;
    private int navigationState_;
    private int workAliasState_;
    private byte memoizedIsInitialized = 2;
    private eo<com.google.c.a.c.c> displayedPlaceResults_ = emptyProtobufList();

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplayedPlaceResults(Iterable<? extends com.google.c.a.c.c> iterable) {
        ensureDisplayedPlaceResultsIsMutable();
        com.google.v.c.addAll(iterable, this.displayedPlaceResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayedPlaceResults(int i2, com.google.c.a.c.c cVar) {
        Objects.requireNonNull(cVar);
        ensureDisplayedPlaceResultsIsMutable();
        this.displayedPlaceResults_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayedPlaceResults() {
        this.displayedPlaceResults_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrivingInfoConsentState() {
        this.bitField0_ &= -17;
        this.drivingInfoConsentState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFinalDestinationArrivalTimestampSeconds() {
        this.bitField0_ &= -9;
        this.finalDestinationArrivalTimestampSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHomeAliasState() {
        this.bitField0_ &= -3;
        this.homeAliasState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationState() {
        this.bitField0_ &= -2;
        this.navigationState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkAliasState() {
        this.bitField0_ &= -5;
        this.workAliasState_ = 0;
    }

    private void ensureDisplayedPlaceResultsIsMutable() {
        eo<com.google.c.a.c.c> eoVar = this.displayedPlaceResults_;
        if (eoVar.c()) {
            return;
        }
        this.displayedPlaceResults_ = du.mutableCopy(eoVar);
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDisplayedPlaceResults(int i2) {
        ensureDisplayedPlaceResultsIsMutable();
        this.displayedPlaceResults_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedPlaceResults(int i2, com.google.c.a.c.c cVar) {
        Objects.requireNonNull(cVar);
        ensureDisplayedPlaceResultsIsMutable();
        this.displayedPlaceResults_.set(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrivingInfoConsentState(b bVar) {
        this.drivingInfoConsentState_ = bVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFinalDestinationArrivalTimestampSeconds(long j2) {
        this.bitField0_ |= 8;
        this.finalDestinationArrivalTimestampSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHomeAliasState(d dVar) {
        this.homeAliasState_ = dVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationState(e eVar) {
        this.navigationState_ = eVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkAliasState(d dVar) {
        this.workAliasState_ = dVar.getNumber();
        this.bitField0_ |= 4;
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
                ei eiVar = c.f7150a;
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005Л\u0006᠌\u0004", new Object[]{"bitField0_", "navigationState_", c.f7152c, "homeAliasState_", eiVar, "workAliasState_", eiVar, "finalDestinationArrivalTimestampSeconds_", "displayedPlaceResults_", com.google.c.a.c.c.class, "drivingInfoConsentState_", c.f7151b});
            case 3:
                return new f();
            case 4:
                return new a(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<f> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (f.class) {
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

    public com.google.c.a.c.c getDisplayedPlaceResults(int i2) {
        return this.displayedPlaceResults_.get(i2);
    }

    public int getDisplayedPlaceResultsCount() {
        return this.displayedPlaceResults_.size();
    }

    public List<com.google.c.a.c.c> getDisplayedPlaceResultsList() {
        return this.displayedPlaceResults_;
    }

    public com.google.c.a.c.d getDisplayedPlaceResultsOrBuilder(int i2) {
        return this.displayedPlaceResults_.get(i2);
    }

    public List<? extends com.google.c.a.c.d> getDisplayedPlaceResultsOrBuilderList() {
        return this.displayedPlaceResults_;
    }

    public b getDrivingInfoConsentState() {
        b bVarA = b.a(this.drivingInfoConsentState_);
        return bVarA == null ? b.USER_CONSENT_STATE_UNKNOWN : bVarA;
    }

    public long getFinalDestinationArrivalTimestampSeconds() {
        return this.finalDestinationArrivalTimestampSeconds_;
    }

    public d getHomeAliasState() {
        d dVarA = d.a(this.homeAliasState_);
        return dVarA == null ? d.LOCATION_ALIAS_STATE_UNSPECIFIED : dVarA;
    }

    public e getNavigationState() {
        e eVarA = e.a(this.navigationState_);
        return eVarA == null ? e.NAVIGATION_STATE_UNSPECIFIED : eVarA;
    }

    public d getWorkAliasState() {
        d dVarA = d.a(this.workAliasState_);
        return dVarA == null ? d.LOCATION_ALIAS_STATE_UNSPECIFIED : dVarA;
    }

    public boolean hasDrivingInfoConsentState() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFinalDestinationArrivalTimestampSeconds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasHomeAliasState() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNavigationState() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWorkAliasState() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(f fVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayedPlaceResults(com.google.c.a.c.c cVar) {
        Objects.requireNonNull(cVar);
        ensureDisplayedPlaceResultsIsMutable();
        this.displayedPlaceResults_.add(cVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
