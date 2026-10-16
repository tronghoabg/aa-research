package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bly extends com.google.v.du<bly, blu> implements com.google.v.fj {
    public static final int AVOID_BADGE_FIELD_NUMBER = 11;
    public static final int CURRENT_VEHICLE_TYPE_FIELD_NUMBER = 14;
    public static final int DEFAULT_ALT_ID_FIELD_NUMBER = 2;
    private static final bly DEFAULT_INSTANCE;
    public static final int IN_CAR_SCREEN_TYPE_FIELD_NUMBER = 12;
    public static final int IS_NOW_FIELD_NUMBER = 1;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    public static final int ND4C_ALGO_TRANSPARENCY_LINK_SHOWN_FIELD_NUMBER = 10;
    public static final int ORIGIN_ACCURACY_METERS_FIELD_NUMBER = 9;
    public static final int ORIGIN_PROVIDER_FIELD_NUMBER = 8;
    public static final int ORIGIN_TYPE_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<bly> PARSER = null;
    public static final int PORTRAIT_FIELD_NUMBER = 5;
    public static final int SOURCE_FIELD_NUMBER = 6;
    public static final int TIME_TO_DEPARTURE_MINUTES_FIELD_NUMBER = 4;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 13;
    private long avoidBadge_;
    private int bitField0_;
    private int currentVehicleType_;
    private long defaultAltId_;
    private int inCarScreenType_;
    private boolean isNow_;
    private long latencyMs_;
    private boolean nd4CAlgoTransparencyLinkShown_;
    private long originAccuracyMeters_;
    private int originProvider_;
    private int originType_;
    private boolean portrait_;
    private int source_;
    private long timeToDepartureMinutes_;
    private int triggeringPlatform_;

    static {
        bly blyVar = new bly();
        DEFAULT_INSTANCE = blyVar;
        com.google.v.du.registerDefaultInstance(bly.class, blyVar);
    }

    private bly() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidBadge() {
        this.bitField0_ &= -129;
        this.avoidBadge_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentVehicleType() {
        this.currentVehicleType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultAltId() {
        this.bitField0_ &= -3;
        this.defaultAltId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarScreenType() {
        this.bitField0_ &= -257;
        this.inCarScreenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNow() {
        this.bitField0_ &= -2;
        this.isNow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -5;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNd4CAlgoTransparencyLinkShown() {
        this.bitField0_ &= -65;
        this.nd4CAlgoTransparencyLinkShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginAccuracyMeters() {
        this.bitField0_ &= -33;
        this.originAccuracyMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginProvider() {
        this.originProvider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginType() {
        this.originType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortrait() {
        this.bitField0_ &= -17;
        this.portrait_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToDepartureMinutes() {
        this.bitField0_ &= -9;
        this.timeToDepartureMinutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    public static bly getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static blu newBuilder() {
        return (blu) DEFAULT_INSTANCE.createBuilder();
    }

    public static bly parseDelimitedFrom(InputStream inputStream) {
        return (bly) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bly parseFrom(com.google.v.v vVar) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bly> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidBadge(long j2) {
        this.bitField0_ |= 128;
        this.avoidBadge_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentVehicleType(blx blxVar) {
        this.currentVehicleType_ = blxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentVehicleTypeValue(int i2) {
        this.currentVehicleType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultAltId(long j2) {
        this.bitField0_ |= 2;
        this.defaultAltId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarScreenType(blv blvVar) {
        this.inCarScreenType_ = blvVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarScreenTypeValue(int i2) {
        this.bitField0_ |= 256;
        this.inCarScreenType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNow(boolean z) {
        this.bitField0_ |= 1;
        this.isNow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 4;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNd4CAlgoTransparencyLinkShown(boolean z) {
        this.bitField0_ |= 64;
        this.nd4CAlgoTransparencyLinkShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginAccuracyMeters(long j2) {
        this.bitField0_ |= 32;
        this.originAccuracyMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginProvider(blw blwVar) {
        this.originProvider_ = blwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginProviderValue(int i2) {
        this.originProvider_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginType(aor aorVar) {
        this.originType_ = aorVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginTypeValue(int i2) {
        this.originType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortrait(boolean z) {
        this.bitField0_ |= 16;
        this.portrait_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(bfn bfnVar) {
        this.source_ = bfnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToDepartureMinutes(long j2) {
        this.bitField0_ |= 8;
        this.timeToDepartureMinutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006\f\u0007\f\b\f\tဂ\u0005\nဇ\u0006\u000bဂ\u0007\fဌ\b\r\f\u000e\f", new Object[]{"bitField0_", "isNow_", "defaultAltId_", "latencyMs_", "timeToDepartureMinutes_", "portrait_", "source_", "originType_", "originProvider_", "originAccuracyMeters_", "nd4CAlgoTransparencyLinkShown_", "avoidBadge_", "inCarScreenType_", "triggeringPlatform_", "currentVehicleType_"});
        }
        if (iOrdinal == 3) {
            return new bly();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new blu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bly> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bly.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAvoidBadge() {
        return this.avoidBadge_;
    }

    public blx getCurrentVehicleType() {
        int i2 = this.currentVehicleType_;
        blx blxVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : blx.TAXI : blx.PRIVATE : blx.MOTORCYCLE : blx.VEHICLE_TYPE_UNSPECIFIED;
        return blxVar == null ? blx.UNRECOGNIZED : blxVar;
    }

    public int getCurrentVehicleTypeValue() {
        return this.currentVehicleType_;
    }

    public long getDefaultAltId() {
        return this.defaultAltId_;
    }

    public blv getInCarScreenType() {
        int i2 = this.inCarScreenType_;
        blv blvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : blv.LIST_VIEW : blv.PANE_VIEW : blv.IN_CAR_SCREEN_TYPE_UNSPECIFIED;
        return blvVar == null ? blv.UNRECOGNIZED : blvVar;
    }

    public int getInCarScreenTypeValue() {
        return this.inCarScreenType_;
    }

    public boolean getIsNow() {
        return this.isNow_;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    @Deprecated
    public boolean getNd4CAlgoTransparencyLinkShown() {
        return this.nd4CAlgoTransparencyLinkShown_;
    }

    public long getOriginAccuracyMeters() {
        return this.originAccuracyMeters_;
    }

    public blw getOriginProvider() {
        int i2 = this.originProvider_;
        blw blwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : blw.NOT_APPLICABLE : blw.NETWORK : blw.GPS : blw.BEACON : blw.ORIGIN_PROVIDER_UNSPECIFIED;
        return blwVar == null ? blw.UNRECOGNIZED : blwVar;
    }

    public int getOriginProviderValue() {
        return this.originProvider_;
    }

    public aor getOriginType() {
        aor aorVarA = aor.a(this.originType_);
        return aorVarA == null ? aor.UNRECOGNIZED : aorVarA;
    }

    public int getOriginTypeValue() {
        return this.originType_;
    }

    public boolean getPortrait() {
        return this.portrait_;
    }

    public bfn getSource() {
        bfn bfnVarA = bfn.a(this.source_);
        return bfnVarA == null ? bfn.UNRECOGNIZED : bfnVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public long getTimeToDepartureMinutes() {
        return this.timeToDepartureMinutes_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public boolean hasAvoidBadge() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasDefaultAltId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInCarScreenType() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIsNow() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasNd4CAlgoTransparencyLinkShown() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasOriginAccuracyMeters() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPortrait() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTimeToDepartureMinutes() {
        return (this.bitField0_ & 8) != 0;
    }

    public static blu newBuilder(bly blyVar) {
        return (blu) DEFAULT_INSTANCE.createBuilder(blyVar);
    }

    public static bly parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bly) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bly parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bly parseFrom(com.google.v.z zVar) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bly parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bly parseFrom(InputStream inputStream) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bly parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bly parseFrom(ByteBuffer byteBuffer) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bly parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bly parseFrom(byte[] bArr) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bly parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bly) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
