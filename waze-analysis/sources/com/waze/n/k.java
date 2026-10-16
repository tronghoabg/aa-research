package com.waze.n;

import com.google.v.de;
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
public final class k extends du<k, j> implements fj {
    private static final k DEFAULT_INSTANCE;
    public static final int DEVICE_MANUFACTURER_FIELD_NUMBER = 6;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 5;
    public static final int OS_FIELD_NUMBER = 1;
    public static final int OS_VERSION_FIELD_NUMBER = 7;
    private static volatile fo<k> PARSER = null;
    public static final int SYSTEM_LANGUAGE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int os_;
    private String systemLanguage_ = "";
    private String deviceModel_ = "";
    private String installationId_ = "";
    private String deviceManufacturer_ = "";
    private String osVersion_ = "";

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceManufacturer() {
        this.bitField0_ &= -17;
        this.deviceManufacturer_ = getDefaultInstance().getDeviceManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.bitField0_ &= -5;
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstallationId() {
        this.bitField0_ &= -9;
        this.installationId_ = getDefaultInstance().getInstallationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.bitField0_ &= -2;
        this.os_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.bitField0_ &= -33;
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemLanguage() {
        this.bitField0_ &= -3;
        this.systemLanguage_ = getDefaultInstance().getSystemLanguage();
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceManufacturer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.deviceManufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceManufacturerBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deviceManufacturer_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.deviceModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModelBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deviceModel_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.installationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.installationId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(s sVar) {
        this.os_ = sVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsValue(int i2) {
        this.bitField0_ |= 1;
        this.os_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.osVersion_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.systemLanguage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemLanguageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.systemLanguage_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0005ለ\u0003\u0006ለ\u0004\u0007ለ\u0005", new Object[]{"bitField0_", "os_", "systemLanguage_", "deviceModel_", "installationId_", "deviceManufacturer_", "osVersion_"});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDeviceManufacturer() {
        return this.deviceManufacturer_;
    }

    public com.google.v.v getDeviceManufacturerBytes() {
        return com.google.v.v.s(this.deviceManufacturer_);
    }

    public String getDeviceModel() {
        return this.deviceModel_;
    }

    public com.google.v.v getDeviceModelBytes() {
        return com.google.v.v.s(this.deviceModel_);
    }

    public String getInstallationId() {
        return this.installationId_;
    }

    public com.google.v.v getInstallationIdBytes() {
        return com.google.v.v.s(this.installationId_);
    }

    public s getOs() {
        int i2 = this.os_;
        s sVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : s.ANDROID : s.IOS : s.OS_UNSPECIFIED;
        return sVar == null ? s.UNRECOGNIZED : sVar;
    }

    public int getOsValue() {
        return this.os_;
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public com.google.v.v getOsVersionBytes() {
        return com.google.v.v.s(this.osVersion_);
    }

    public String getSystemLanguage() {
        return this.systemLanguage_;
    }

    public com.google.v.v getSystemLanguageBytes() {
        return com.google.v.v.s(this.systemLanguage_);
    }

    public boolean hasDeviceManufacturer() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDeviceModel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasInstallationId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOsVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSystemLanguage() {
        return (this.bitField0_ & 2) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(com.google.v.z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(com.google.v.z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
