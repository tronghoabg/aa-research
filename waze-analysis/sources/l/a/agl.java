package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agl extends com.google.v.du<agl, agk> implements agm {
    public static final int COORDINATES_FIELD_NUMBER = 1;
    private static final agl DEFAULT_INSTANCE;
    public static final int LOCATION_PROVIDER_FIELD_NUMBER = 2;
    public static final int LOCATION_SOURCE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<agl> PARSER;
    private int bitField0_;
    private afx coordinates_;
    private int locationProvider_;
    private int locationSource_;

    static {
        agl aglVar = new agl();
        DEFAULT_INSTANCE = aglVar;
        com.google.v.du.registerDefaultInstance(agl.class, aglVar);
    }

    private agl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationProvider() {
        this.locationProvider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationSource() {
        this.locationSource_ = 0;
    }

    public static agl getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static agk newBuilder() {
        return (agk) DEFAULT_INSTANCE.createBuilder();
    }

    public static agl parseDelimitedFrom(InputStream inputStream) {
        return (agl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agl parseFrom(com.google.v.v vVar) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<agl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationProvider(agz agzVar) {
        this.locationProvider_ = agzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationProviderValue(int i2) {
        this.locationProvider_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationSource(aha ahaVar) {
        this.locationSource_ = ahaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationSourceValue(int i2) {
        this.locationSource_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f", new Object[]{"bitField0_", "coordinates_", "locationProvider_", "locationSource_"});
        }
        if (iOrdinal == 3) {
            return new agl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new agk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<agl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (agl.class) {
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

    public agz getLocationProvider() {
        agz agzVarA = agz.a(this.locationProvider_);
        return agzVarA == null ? agz.UNRECOGNIZED : agzVarA;
    }

    public int getLocationProviderValue() {
        return this.locationProvider_;
    }

    public aha getLocationSource() {
        int i2 = this.locationSource_;
        aha ahaVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : aha.LOCATION_SOURCE_EXTERNAL : aha.LOCATION_SOURCE_MOBILE : aha.LOCATION_SOURCE_UNSPECIFIED;
        return ahaVar == null ? aha.UNRECOGNIZED : ahaVar;
    }

    public int getLocationSourceValue() {
        return this.locationSource_;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public static agk newBuilder(agl aglVar) {
        return (agk) DEFAULT_INSTANCE.createBuilder(aglVar);
    }

    public static agl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static agl parseFrom(com.google.v.z zVar) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static agl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static agl parseFrom(InputStream inputStream) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agl parseFrom(ByteBuffer byteBuffer) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static agl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static agl parseFrom(byte[] bArr) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static agl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (agl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
