package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class py extends com.google.v.du<py, px> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final py DEFAULT_INSTANCE;
    public static final int DETOURID_FIELD_NUMBER = 2;
    public static final int DRIVER_POSITION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<py> PARSER;
    private String alternativeRouteUuid_ = "";
    private int bitField0_;
    private long detourId_;
    private ol driverPosition_;

    static {
        py pyVar = new py();
        DEFAULT_INSTANCE = pyVar;
        com.google.v.du.registerDefaultInstance(py.class, pyVar);
    }

    private py() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.bitField0_ &= -2;
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourId() {
        this.bitField0_ &= -3;
        this.detourId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriverPosition() {
        this.driverPosition_ = null;
        this.bitField0_ &= -5;
    }

    public static py getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriverPosition(ol olVar) {
        Objects.requireNonNull(olVar);
        ol olVar2 = this.driverPosition_;
        if (olVar2 != null && olVar2 != ol.getDefaultInstance()) {
            ok okVarNewBuilder = ol.newBuilder(olVar2);
            okVarNewBuilder.mergeFrom((ok) olVar);
            olVar = okVarNewBuilder.buildPartial();
        }
        this.driverPosition_ = olVar;
        this.bitField0_ |= 4;
    }

    public static px newBuilder() {
        return (px) DEFAULT_INSTANCE.createBuilder();
    }

    public static py parseDelimitedFrom(InputStream inputStream) {
        return (py) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static py parseFrom(com.google.v.v vVar) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<py> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        this.alternativeRouteUuid_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourId(long j2) {
        this.bitField0_ |= 2;
        this.detourId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriverPosition(ol olVar) {
        Objects.requireNonNull(olVar);
        this.driverPosition_ = olVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "alternativeRouteUuid_", "detourId_", "driverPosition_"});
        }
        if (iOrdinal == 3) {
            return new py();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new px(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<py> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (py.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public long getDetourId() {
        return this.detourId_;
    }

    public ol getDriverPosition() {
        ol olVar = this.driverPosition_;
        return olVar == null ? ol.getDefaultInstance() : olVar;
    }

    public boolean hasAlternativeRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDetourId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDriverPosition() {
        return (this.bitField0_ & 4) != 0;
    }

    public static px newBuilder(py pyVar) {
        return (px) DEFAULT_INSTANCE.createBuilder(pyVar);
    }

    public static py parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (py) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static py parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static py parseFrom(com.google.v.z zVar) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static py parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static py parseFrom(InputStream inputStream) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static py parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static py parseFrom(ByteBuffer byteBuffer) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static py parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static py parseFrom(byte[] bArr) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static py parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (py) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
