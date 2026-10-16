package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bu extends du<bu, br> implements fj {
    public static final int CLOUD_ENVIRONMENT_FIELD_NUMBER = 9;
    private static final bu DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 2;
    private static volatile fo<bu> PARSER = null;
    public static final int PRODUCT_ID_FIELD_NUMBER = 11;
    public static final int SKU_FIELD_NUMBER = 4;
    public static final int SOFTWARE_VERSION_FIELD_NUMBER = 3;
    public static final int SOFTWARE_VERSION_NUMBER_FIELD_NUMBER = 5;
    public static final int SOFTWARE_VERSION_NUMBER_STRING_FIELD_NUMBER = 8;
    public static final int SYSTEM_RELEASE_CHANNEL_FIELD_NUMBER = 6;
    public static final int VENDOR_ID_FIELD_NUMBER = 10;
    public static final int VIRTUAL_RELEASE_CHANNEL_FIELD_NUMBER = 7;
    private int bitField0_;
    private int cloudEnvironment_;
    private int deviceType_;
    private int productId_;
    private long softwareVersionNumber_;
    private int systemReleaseChannel_;
    private int vendorId_;
    private String deviceId_ = "";
    private String sku_ = "";
    private String softwareVersion_ = "";
    private String softwareVersionNumberString_ = "";
    private String virtualReleaseChannel_ = "";

    static {
        bu buVar = new bu();
        DEFAULT_INSTANCE = buVar;
        du.registerDefaultInstance(bu.class, buVar);
    }

    private bu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCloudEnvironment() {
        this.bitField0_ &= -257;
        this.cloudEnvironment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.bitField0_ &= -2;
        this.deviceId_ = getDefaultInstance().getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.bitField0_ &= -3;
        this.deviceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductId() {
        this.bitField0_ &= -1025;
        this.productId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSku() {
        this.bitField0_ &= -5;
        this.sku_ = getDefaultInstance().getSku();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoftwareVersion() {
        this.bitField0_ &= -9;
        this.softwareVersion_ = getDefaultInstance().getSoftwareVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoftwareVersionNumber() {
        this.bitField0_ &= -129;
        this.softwareVersionNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoftwareVersionNumberString() {
        this.bitField0_ &= -17;
        this.softwareVersionNumberString_ = getDefaultInstance().getSoftwareVersionNumberString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemReleaseChannel() {
        this.bitField0_ &= -33;
        this.systemReleaseChannel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVendorId() {
        this.bitField0_ &= -513;
        this.vendorId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVirtualReleaseChannel() {
        this.bitField0_ &= -65;
        this.virtualReleaseChannel_ = getDefaultInstance().getVirtualReleaseChannel();
    }

    public static bu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static br newBuilder() {
        return (br) DEFAULT_INSTANCE.createBuilder();
    }

    public static bu parseDelimitedFrom(InputStream inputStream) {
        return (bu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bu parseFrom(com.google.v.v vVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloudEnvironment(bs bsVar) {
        this.cloudEnvironment_ = bsVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(com.google.v.v vVar) {
        this.deviceId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(bt btVar) {
        this.deviceType_ = btVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductId(int i2) {
        this.bitField0_ |= 1024;
        this.productId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSku(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.sku_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkuBytes(com.google.v.v vVar) {
        this.sku_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoftwareVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.softwareVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoftwareVersionBytes(com.google.v.v vVar) {
        this.softwareVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoftwareVersionNumber(long j2) {
        this.bitField0_ |= 128;
        this.softwareVersionNumber_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoftwareVersionNumberString(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.softwareVersionNumberString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoftwareVersionNumberStringBytes(com.google.v.v vVar) {
        this.softwareVersionNumberString_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemReleaseChannel(bq bqVar) {
        this.systemReleaseChannel_ = bqVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVendorId(int i2) {
        this.bitField0_ |= 512;
        this.vendorId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVirtualReleaseChannel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.virtualReleaseChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVirtualReleaseChannelBytes(com.google.v.v vVar) {
        this.virtualReleaseChannel_ = vVar.u();
        this.bitField0_ |= 64;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0003\u0004ဈ\u0002\u0005ဂ\u0007\u0006᠌\u0005\u0007ဈ\u0006\bဈ\u0004\t᠌\b\nင\t\u000bင\n", new Object[]{"bitField0_", "deviceId_", "deviceType_", i.q, "softwareVersion_", "sku_", "softwareVersionNumber_", "systemReleaseChannel_", i.o, "virtualReleaseChannel_", "softwareVersionNumberString_", "cloudEnvironment_", i.p, "vendorId_", "productId_"});
        }
        if (iOrdinal == 3) {
            return new bu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new br(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bs getCloudEnvironment() {
        bs bsVarA = bs.a(this.cloudEnvironment_);
        return bsVarA == null ? bs.CLOUD_ENVIRONMENT_UNKNOWN : bsVarA;
    }

    public String getDeviceId() {
        return this.deviceId_;
    }

    public com.google.v.v getDeviceIdBytes() {
        return com.google.v.v.s(this.deviceId_);
    }

    public bt getDeviceType() {
        bt btVarA = bt.a(this.deviceType_);
        return btVarA == null ? bt.DEVICE_TYPE_UNKNOWN : btVarA;
    }

    public int getProductId() {
        return this.productId_;
    }

    public String getSku() {
        return this.sku_;
    }

    public com.google.v.v getSkuBytes() {
        return com.google.v.v.s(this.sku_);
    }

    public String getSoftwareVersion() {
        return this.softwareVersion_;
    }

    public com.google.v.v getSoftwareVersionBytes() {
        return com.google.v.v.s(this.softwareVersion_);
    }

    @Deprecated
    public long getSoftwareVersionNumber() {
        return this.softwareVersionNumber_;
    }

    public String getSoftwareVersionNumberString() {
        return this.softwareVersionNumberString_;
    }

    public com.google.v.v getSoftwareVersionNumberStringBytes() {
        return com.google.v.v.s(this.softwareVersionNumberString_);
    }

    public bq getSystemReleaseChannel() {
        bq bqVarA = bq.a(this.systemReleaseChannel_);
        return bqVarA == null ? bq.BUILD_CHANNEL_UNKNOWN : bqVarA;
    }

    public int getVendorId() {
        return this.vendorId_;
    }

    public String getVirtualReleaseChannel() {
        return this.virtualReleaseChannel_;
    }

    public com.google.v.v getVirtualReleaseChannelBytes() {
        return com.google.v.v.s(this.virtualReleaseChannel_);
    }

    public boolean hasCloudEnvironment() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasDeviceId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeviceType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProductId() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasSku() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSoftwareVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasSoftwareVersionNumber() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSoftwareVersionNumberString() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSystemReleaseChannel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasVendorId() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasVirtualReleaseChannel() {
        return (this.bitField0_ & 64) != 0;
    }

    public static br newBuilder(bu buVar) {
        return (br) DEFAULT_INSTANCE.createBuilder(buVar);
    }

    public static bu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bu parseFrom(com.google.v.z zVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bu parseFrom(InputStream inputStream) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bu parseFrom(ByteBuffer byteBuffer) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bu parseFrom(byte[] bArr) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bu) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
