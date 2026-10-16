package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class co extends com.google.v.du<co, cm> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    public static final int BEARING_AVAILABLE_FIELD_NUMBER = 6;
    private static final co DEFAULT_INSTANCE;
    public static final int LOCATION_RESOLVE_METHOD_FIELD_NUMBER = 2;
    public static final int ON_ROUTE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<co> PARSER = null;
    public static final int SEGMENT_DATA_ENABLED_FIELD_NUMBER = 5;
    public static final int SUPPOSED_TO_BE_ON_ROUTE_FIELD_NUMBER = 3;
    private ck alerterInfo_;
    private boolean bearingAvailable_;
    private int bitField0_;
    private int locationResolveMethod_;
    private boolean onRoute_;
    private boolean segmentDataEnabled_;
    private boolean supposedToBeOnRoute_;

    static {
        co coVar = new co();
        DEFAULT_INSTANCE = coVar;
        com.google.v.du.registerDefaultInstance(co.class, coVar);
    }

    private co() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBearingAvailable() {
        this.bitField0_ &= -17;
        this.bearingAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationResolveMethod() {
        this.locationResolveMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnRoute() {
        this.bitField0_ &= -5;
        this.onRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentDataEnabled() {
        this.bitField0_ &= -9;
        this.segmentDataEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupposedToBeOnRoute() {
        this.bitField0_ &= -3;
        this.supposedToBeOnRoute_ = false;
    }

    public static co getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ck ckVar2 = this.alerterInfo_;
        if (ckVar2 != null && ckVar2 != ck.getDefaultInstance()) {
            cj cjVarNewBuilder = ck.newBuilder(ckVar2);
            cjVarNewBuilder.mergeFrom((cj) ckVar);
            ckVar = cjVarNewBuilder.buildPartial();
        }
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    public static cm newBuilder() {
        return (cm) DEFAULT_INSTANCE.createBuilder();
    }

    public static co parseDelimitedFrom(InputStream inputStream) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(com.google.v.v vVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<co> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBearingAvailable(boolean z) {
        this.bitField0_ |= 16;
        this.bearingAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationResolveMethod(cn cnVar) {
        this.locationResolveMethod_ = cnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationResolveMethodValue(int i2) {
        this.locationResolveMethod_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnRoute(boolean z) {
        this.bitField0_ |= 4;
        this.onRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentDataEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.segmentDataEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupposedToBeOnRoute(boolean z) {
        this.bitField0_ |= 2;
        this.supposedToBeOnRoute_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "alerterInfo_", "locationResolveMethod_", "supposedToBeOnRoute_", "onRoute_", "segmentDataEnabled_", "bearingAvailable_"});
        }
        if (iOrdinal == 3) {
            return new co();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<co> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (co.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ck getAlerterInfo() {
        ck ckVar = this.alerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public boolean getBearingAvailable() {
        return this.bearingAvailable_;
    }

    public cn getLocationResolveMethod() {
        int i2 = this.locationResolveMethod_;
        cn cnVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : cn.FAILURE_CALCULATING : cn.SEGMENT_DATA : cn.LOCATION_AND_AZYMUTH : cn.CACHE : cn.LOCATION_RESOLVE_METHOD_UNSPECIFIED;
        return cnVar == null ? cn.UNRECOGNIZED : cnVar;
    }

    public int getLocationResolveMethodValue() {
        return this.locationResolveMethod_;
    }

    public boolean getOnRoute() {
        return this.onRoute_;
    }

    public boolean getSegmentDataEnabled() {
        return this.segmentDataEnabled_;
    }

    public boolean getSupposedToBeOnRoute() {
        return this.supposedToBeOnRoute_;
    }

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBearingAvailable() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasOnRoute() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSegmentDataEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSupposedToBeOnRoute() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cm newBuilder(co coVar) {
        return (cm) DEFAULT_INSTANCE.createBuilder(coVar);
    }

    public static co parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static co parseFrom(com.google.v.z zVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static co parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static co parseFrom(InputStream inputStream) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(ByteBuffer byteBuffer) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static co parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static co parseFrom(byte[] bArr) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static co parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
