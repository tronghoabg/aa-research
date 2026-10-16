package l.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class anh extends com.google.v.du<anh, anf> implements com.google.v.fj {
    public static final int ACCURACY_FIELD_NUMBER = 2;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 1;
    public static final int COORDINATES_FIELD_NUMBER = 3;
    private static final anh DEFAULT_INSTANCE;
    public static final int IPV4_FIELD_NUMBER = 4;
    public static final int IPV6_FIELD_NUMBER = 5;
    public static final int MOBILE_COUNTRY_CODE_FIELD_NUMBER = 7;
    public static final int MOBILE_NETWORK_CODE_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<anh> PARSER = null;
    public static final int RADIO_ACCESS_TECHNOLOGY_FIELD_NUMBER = 6;
    private double accuracy_;
    private int bitField0_;
    private int connectionType_;
    private afx coordinates_;
    private boolean ipv4_;
    private boolean ipv6_;
    private long mobileCountryCode_;
    private long mobileNetworkCode_;
    private String radioAccessTechnology_ = "";

    static {
        anh anhVar = new anh();
        DEFAULT_INSTANCE = anhVar;
        com.google.v.du.registerDefaultInstance(anh.class, anhVar);
    }

    private anh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracy() {
        this.bitField0_ &= -2;
        this.accuracy_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIpv4() {
        this.bitField0_ &= -5;
        this.ipv4_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIpv6() {
        this.bitField0_ &= -9;
        this.ipv6_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileCountryCode() {
        this.bitField0_ &= -17;
        this.mobileCountryCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileNetworkCode() {
        this.bitField0_ &= -33;
        this.mobileNetworkCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadioAccessTechnology() {
        this.radioAccessTechnology_ = getDefaultInstance().getRadioAccessTechnology();
    }

    public static anh getDefaultInstance() {
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

    public static anf newBuilder() {
        return (anf) DEFAULT_INSTANCE.createBuilder();
    }

    public static anh parseDelimitedFrom(InputStream inputStream) {
        return (anh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anh parseFrom(com.google.v.v vVar) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<anh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracy(double d2) {
        this.bitField0_ |= 1;
        this.accuracy_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(ang angVar) {
        this.connectionType_ = angVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeValue(int i2) {
        this.connectionType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpv4(boolean z) {
        this.bitField0_ |= 4;
        this.ipv4_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpv6(boolean z) {
        this.bitField0_ |= 8;
        this.ipv6_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileCountryCode(long j2) {
        this.bitField0_ |= 16;
        this.mobileCountryCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileNetworkCode(long j2) {
        this.bitField0_ |= 32;
        this.mobileNetworkCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadioAccessTechnology(String str) {
        Objects.requireNonNull(str);
        this.radioAccessTechnology_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadioAccessTechnologyBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.radioAccessTechnology_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002က\u0000\u0003ဉ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006Ȉ\u0007ဂ\u0004\bဂ\u0005", new Object[]{"bitField0_", "connectionType_", "accuracy_", "coordinates_", "ipv4_", "ipv6_", "radioAccessTechnology_", "mobileCountryCode_", "mobileNetworkCode_"});
        }
        if (iOrdinal == 3) {
            return new anh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new anf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<anh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (anh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getAccuracy() {
        return this.accuracy_;
    }

    public ang getConnectionType() {
        int i2 = this.connectionType_;
        ang angVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : ang.NA : ang.OTHER : ang.CELL : ang.WIFI : ang.MODE_UNSPECIFIED;
        return angVar == null ? ang.UNRECOGNIZED : angVar;
    }

    public int getConnectionTypeValue() {
        return this.connectionType_;
    }

    public afx getCoordinates() {
        afx afxVar = this.coordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean getIpv4() {
        return this.ipv4_;
    }

    public boolean getIpv6() {
        return this.ipv6_;
    }

    public long getMobileCountryCode() {
        return this.mobileCountryCode_;
    }

    public long getMobileNetworkCode() {
        return this.mobileNetworkCode_;
    }

    public String getRadioAccessTechnology() {
        return this.radioAccessTechnology_;
    }

    public com.google.v.v getRadioAccessTechnologyBytes() {
        return com.google.v.v.s(this.radioAccessTechnology_);
    }

    public boolean hasAccuracy() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIpv4() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIpv6() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMobileCountryCode() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMobileNetworkCode() {
        return (this.bitField0_ & 32) != 0;
    }

    public static anf newBuilder(anh anhVar) {
        return (anf) DEFAULT_INSTANCE.createBuilder(anhVar);
    }

    public static anh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static anh parseFrom(com.google.v.z zVar) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static anh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static anh parseFrom(InputStream inputStream) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anh parseFrom(ByteBuffer byteBuffer) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static anh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static anh parseFrom(byte[] bArr) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static anh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (anh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
