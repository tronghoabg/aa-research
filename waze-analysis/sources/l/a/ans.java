package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ans extends com.google.v.du<ans, anq> implements com.google.v.fj {
    public static final int COORDINATES_FIELD_NUMBER = 2;
    private static final ans DEFAULT_INSTANCE;
    public static final int ERROR_TYPE_FIELD_NUMBER = 6;
    public static final int IS_CONNECTED_TO_NETWORK_FIELD_NUMBER = 1;
    public static final int LINE_ID_FIELD_NUMBER = 4;
    public static final int LOCATION_ACCURACY_METERS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ans> PARSER = null;
    public static final int TILE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private afx coordinates_;
    private int errorType_;
    private boolean isConnectedToNetwork_;
    private long lineId_;
    private long locationAccuracyMeters_;
    private long tileId_;

    static {
        ans ansVar = new ans();
        DEFAULT_INSTANCE = ansVar;
        com.google.v.du.registerDefaultInstance(ans.class, ansVar);
    }

    private ans() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorType() {
        this.errorType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsConnectedToNetwork() {
        this.bitField0_ &= -2;
        this.isConnectedToNetwork_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLineId() {
        this.bitField0_ &= -9;
        this.lineId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationAccuracyMeters() {
        this.bitField0_ &= -5;
        this.locationAccuracyMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.bitField0_ &= -17;
        this.tileId_ = 0L;
    }

    public static ans getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.coordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.coordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    public static anq newBuilder() {
        return (anq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ans parseDelimitedFrom(InputStream inputStream) {
        return (ans) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ans parseFrom(com.google.v.v vVar) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ans> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorType(anr anrVar) {
        this.errorType_ = anrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorTypeValue(int i2) {
        this.errorType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsConnectedToNetwork(boolean z) {
        this.bitField0_ |= 1;
        this.isConnectedToNetwork_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLineId(long j2) {
        this.bitField0_ |= 8;
        this.lineId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationAccuracyMeters(long j2) {
        this.bitField0_ |= 4;
        this.locationAccuracyMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(long j2) {
        this.bitField0_ |= 16;
        this.tileId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003တ\u0002\u0004တ\u0003\u0005တ\u0004\u0006\f", new Object[]{"bitField0_", "isConnectedToNetwork_", "coordinates_", "locationAccuracyMeters_", "lineId_", "tileId_", "errorType_"});
        }
        if (iOrdinal == 3) {
            return new ans();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new anq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ans> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ans.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public afx getCoordinates() {
        afx afxVar = this.coordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public anr getErrorType() {
        int i2 = this.errorType_;
        anr anrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : anr.NO_SERVER_CONNECTIVITY : anr.NO_NETWORK : anr.ERROR_TYPE_UNSPECIFIED;
        return anrVar == null ? anr.UNRECOGNIZED : anrVar;
    }

    public int getErrorTypeValue() {
        return this.errorType_;
    }

    @Deprecated
    public boolean getIsConnectedToNetwork() {
        return this.isConnectedToNetwork_;
    }

    @Deprecated
    public long getLineId() {
        return this.lineId_;
    }

    @Deprecated
    public long getLocationAccuracyMeters() {
        return this.locationAccuracyMeters_;
    }

    @Deprecated
    public long getTileId() {
        return this.tileId_;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasIsConnectedToNetwork() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasLineId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasLocationAccuracyMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasTileId() {
        return (this.bitField0_ & 16) != 0;
    }

    public static anq newBuilder(ans ansVar) {
        return (anq) DEFAULT_INSTANCE.createBuilder(ansVar);
    }

    public static ans parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ans) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ans parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ans parseFrom(com.google.v.z zVar) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ans parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ans parseFrom(InputStream inputStream) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ans parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ans parseFrom(ByteBuffer byteBuffer) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ans parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ans parseFrom(byte[] bArr) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ans parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ans) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
