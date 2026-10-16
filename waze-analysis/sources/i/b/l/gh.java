package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gh extends com.google.v.du<gh, gc> implements gi {
    public static final int CAR_ID_FIELD_NUMBER = 1;
    private static final gh DEFAULT_INSTANCE;
    public static final int IS_ADS_FIELD_NUMBER = 2;
    public static final int MAP_CAR_3D_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<gh> PARSER;
    private int bitField0_;
    private String carId_ = "";
    private boolean isAds_;
    private ge mapCar3DInfo_;

    static {
        gh ghVar = new gh();
        DEFAULT_INSTANCE = ghVar;
        com.google.v.du.registerDefaultInstance(gh.class, ghVar);
    }

    private gh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarId() {
        this.bitField0_ &= -2;
        this.carId_ = getDefaultInstance().getCarId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAds() {
        this.bitField0_ &= -3;
        this.isAds_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapCar3DInfo() {
        this.mapCar3DInfo_ = null;
        this.bitField0_ &= -5;
    }

    public static gh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapCar3DInfo(ge geVar) {
        Objects.requireNonNull(geVar);
        ge geVar2 = this.mapCar3DInfo_;
        if (geVar2 != null && geVar2 != ge.getDefaultInstance()) {
            gd gdVarNewBuilder = ge.newBuilder(geVar2);
            gdVarNewBuilder.mergeFrom((gd) geVar);
            geVar = gdVarNewBuilder.buildPartial();
        }
        this.mapCar3DInfo_ = geVar;
        this.bitField0_ |= 4;
    }

    public static gc newBuilder() {
        return (gc) DEFAULT_INSTANCE.createBuilder();
    }

    public static gh parseDelimitedFrom(InputStream inputStream) {
        return (gh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gh parseFrom(com.google.v.v vVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.carId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarIdBytes(com.google.v.v vVar) {
        this.carId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAds(boolean z) {
        this.bitField0_ |= 2;
        this.isAds_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapCar3DInfo(ge geVar) {
        Objects.requireNonNull(geVar);
        this.mapCar3DInfo_ = geVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "carId_", "isAds_", "mapCar3DInfo_"});
        }
        if (iOrdinal == 3) {
            return new gh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCarId() {
        return this.carId_;
    }

    public com.google.v.v getCarIdBytes() {
        return com.google.v.v.s(this.carId_);
    }

    public boolean getIsAds() {
        return this.isAds_;
    }

    public ge getMapCar3DInfo() {
        ge geVar = this.mapCar3DInfo_;
        return geVar == null ? ge.getDefaultInstance() : geVar;
    }

    public boolean hasCarId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsAds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMapCar3DInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public static gc newBuilder(gh ghVar) {
        return (gc) DEFAULT_INSTANCE.createBuilder(ghVar);
    }

    public static gh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gh parseFrom(com.google.v.z zVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gh parseFrom(InputStream inputStream) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gh parseFrom(ByteBuffer byteBuffer) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gh parseFrom(byte[] bArr) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
