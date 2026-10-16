package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zk extends com.google.v.du<zk, zj> implements com.google.v.fj {
    public static final int AD_CHANNEL_FIELD_NUMBER = 3;
    public static final int AD_RENDERING_ORDER_FIELD_NUMBER = 5;
    public static final int BUSINESS_NAME_FIELD_NUMBER = 1;
    private static final zk DEFAULT_INSTANCE;
    public static final int GOOGLE_MAPS_ZOOM_LEVEL_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<zk> PARSER = null;
    public static final int PIN_ICON_URL_FIELD_NUMBER = 6;
    public static final int PLACE_LAT_LNG_FIELD_NUMBER = 2;
    public static final int USER_LOCATION_COORDINATES_FIELD_NUMBER = 7;
    private int adChannel_;
    private int adRenderingOrder_;
    private int bitField0_;
    private int googleMapsZoomLevel_;
    private afx placeLatLng_;
    private afx userLocationCoordinates_;
    private String businessName_ = "";
    private String pinIconUrl_ = "";

    static {
        zk zkVar = new zk();
        DEFAULT_INSTANCE = zkVar;
        com.google.v.du.registerDefaultInstance(zk.class, zkVar);
    }

    private zk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdChannel() {
        this.adChannel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdRenderingOrder() {
        this.bitField0_ &= -3;
        this.adRenderingOrder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusinessName() {
        this.businessName_ = getDefaultInstance().getBusinessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleMapsZoomLevel() {
        this.googleMapsZoomLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinIconUrl() {
        this.bitField0_ &= -5;
        this.pinIconUrl_ = getDefaultInstance().getPinIconUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceLatLng() {
        this.placeLatLng_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserLocationCoordinates() {
        this.userLocationCoordinates_ = null;
        this.bitField0_ &= -9;
    }

    public static zk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaceLatLng(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.placeLatLng_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.placeLatLng_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserLocationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.userLocationCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.userLocationCoordinates_ = afxVar;
        this.bitField0_ |= 8;
    }

    public static zj newBuilder() {
        return (zj) DEFAULT_INSTANCE.createBuilder();
    }

    public static zk parseDelimitedFrom(InputStream inputStream) {
        return (zk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zk parseFrom(com.google.v.v vVar) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<zk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdChannel(zi ziVar) {
        this.adChannel_ = ziVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdChannelValue(int i2) {
        this.adChannel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdRenderingOrder(int i2) {
        this.bitField0_ |= 2;
        this.adRenderingOrder_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessName(String str) {
        Objects.requireNonNull(str);
        this.businessName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.businessName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleMapsZoomLevel(int i2) {
        this.googleMapsZoomLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinIconUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.pinIconUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinIconUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.pinIconUrl_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceLatLng(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.placeLatLng_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserLocationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.userLocationCoordinates_ = afxVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\f\u0004\u0004\u0005င\u0001\u0006ለ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "businessName_", "placeLatLng_", "adChannel_", "googleMapsZoomLevel_", "adRenderingOrder_", "pinIconUrl_", "userLocationCoordinates_"});
        }
        if (iOrdinal == 3) {
            return new zk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<zk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (zk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public zi getAdChannel() {
        int i2 = this.adChannel_;
        zi ziVar = i2 != 0 ? i2 != 1 ? null : zi.NAVIGATION_PIN : zi.CHANNEL_UNSPECIFIED;
        return ziVar == null ? zi.UNRECOGNIZED : ziVar;
    }

    public int getAdChannelValue() {
        return this.adChannel_;
    }

    public int getAdRenderingOrder() {
        return this.adRenderingOrder_;
    }

    public String getBusinessName() {
        return this.businessName_;
    }

    public com.google.v.v getBusinessNameBytes() {
        return com.google.v.v.s(this.businessName_);
    }

    public int getGoogleMapsZoomLevel() {
        return this.googleMapsZoomLevel_;
    }

    public String getPinIconUrl() {
        return this.pinIconUrl_;
    }

    public com.google.v.v getPinIconUrlBytes() {
        return com.google.v.v.s(this.pinIconUrl_);
    }

    public afx getPlaceLatLng() {
        afx afxVar = this.placeLatLng_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public afx getUserLocationCoordinates() {
        afx afxVar = this.userLocationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean hasAdRenderingOrder() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPinIconUrl() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPlaceLatLng() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserLocationCoordinates() {
        return (this.bitField0_ & 8) != 0;
    }

    public static zj newBuilder(zk zkVar) {
        return (zj) DEFAULT_INSTANCE.createBuilder(zkVar);
    }

    public static zk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static zk parseFrom(com.google.v.z zVar) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static zk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static zk parseFrom(InputStream inputStream) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zk parseFrom(ByteBuffer byteBuffer) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static zk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static zk parseFrom(byte[] bArr) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static zk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (zk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
