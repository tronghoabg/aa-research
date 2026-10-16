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
public final class cm extends du<cm, ck> implements fj {
    public static final int COUNTRY_FIELD_NUMBER = 8;
    private static final cm DEFAULT_INSTANCE;
    public static final int FINGERPRINT_FIELD_NUMBER = 3;
    public static final int GVR_VERSION_FIELD_NUMBER = 4;
    public static final int LANGUAGE_FIELD_NUMBER = 7;
    public static final int MANUFACTURER_FIELD_NUMBER = 5;
    public static final int MODEL_FIELD_NUMBER = 6;
    private static volatile fo<cm> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int UNITY_SDK_VERSION_FIELD_NUMBER = 10;
    public static final int UNITY_VERSION_FIELD_NUMBER = 9;
    public static final int VR_CLIENT_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int vrClientType_;
    private String sdkVersion_ = "";
    private String fingerprint_ = "";
    private String gvrVersion_ = "";
    private String manufacturer_ = "";
    private String model_ = "";
    private String language_ = "";
    private String country_ = "";
    private String unityVersion_ = "";
    private String unitySdkVersion_ = "";

    static {
        cm cmVar = new cm();
        DEFAULT_INSTANCE = cmVar;
        du.registerDefaultInstance(cm.class, cmVar);
    }

    private cm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -129;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFingerprint() {
        this.bitField0_ &= -5;
        this.fingerprint_ = getDefaultInstance().getFingerprint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGvrVersion() {
        this.bitField0_ &= -9;
        this.gvrVersion_ = getDefaultInstance().getGvrVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -65;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManufacturer() {
        this.bitField0_ &= -17;
        this.manufacturer_ = getDefaultInstance().getManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.bitField0_ &= -33;
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnitySdkVersion() {
        this.bitField0_ &= -513;
        this.unitySdkVersion_ = getDefaultInstance().getUnitySdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnityVersion() {
        this.bitField0_ &= -257;
        this.unityVersion_ = getDefaultInstance().getUnityVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVrClientType() {
        this.bitField0_ &= -2;
        this.vrClientType_ = 0;
    }

    public static cm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ck newBuilder() {
        return (ck) DEFAULT_INSTANCE.createBuilder();
    }

    public static cm parseDelimitedFrom(InputStream inputStream) {
        return (cm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cm parseFrom(com.google.v.v vVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(com.google.v.v vVar) {
        this.country_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFingerprint(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.fingerprint_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFingerprintBytes(com.google.v.v vVar) {
        this.fingerprint_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGvrVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.gvrVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGvrVersionBytes(com.google.v.v vVar) {
        this.gvrVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        this.language_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.manufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturerBytes(com.google.v.v vVar) {
        this.manufacturer_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(com.google.v.v vVar) {
        this.model_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(com.google.v.v vVar) {
        this.sdkVersion_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitySdkVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.unitySdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitySdkVersionBytes(com.google.v.v vVar) {
        this.unitySdkVersion_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnityVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.unityVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnityVersionBytes(com.google.v.v vVar) {
        this.unityVersion_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVrClientType(cl clVar) {
        this.vrClientType_ = clVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "vrClientType_", cw.f3754b, "sdkVersion_", "fingerprint_", "gvrVersion_", "manufacturer_", "model_", "language_", "country_", "unityVersion_", "unitySdkVersion_"});
        }
        if (iOrdinal == 3) {
            return new cm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ck(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCountry() {
        return this.country_;
    }

    public com.google.v.v getCountryBytes() {
        return com.google.v.v.s(this.country_);
    }

    public String getFingerprint() {
        return this.fingerprint_;
    }

    public com.google.v.v getFingerprintBytes() {
        return com.google.v.v.s(this.fingerprint_);
    }

    public String getGvrVersion() {
        return this.gvrVersion_;
    }

    public com.google.v.v getGvrVersionBytes() {
        return com.google.v.v.s(this.gvrVersion_);
    }

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public String getManufacturer() {
        return this.manufacturer_;
    }

    public com.google.v.v getManufacturerBytes() {
        return com.google.v.v.s(this.manufacturer_);
    }

    public String getModel() {
        return this.model_;
    }

    public com.google.v.v getModelBytes() {
        return com.google.v.v.s(this.model_);
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public com.google.v.v getSdkVersionBytes() {
        return com.google.v.v.s(this.sdkVersion_);
    }

    public String getUnitySdkVersion() {
        return this.unitySdkVersion_;
    }

    public com.google.v.v getUnitySdkVersionBytes() {
        return com.google.v.v.s(this.unitySdkVersion_);
    }

    public String getUnityVersion() {
        return this.unityVersion_;
    }

    public com.google.v.v getUnityVersionBytes() {
        return com.google.v.v.s(this.unityVersion_);
    }

    public cl getVrClientType() {
        cl clVarA = cl.a(this.vrClientType_);
        return clVarA == null ? cl.UNKNOWN : clVarA;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasFingerprint() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGvrVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasManufacturer() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasModel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUnitySdkVersion() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasUnityVersion() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasVrClientType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ck newBuilder(cm cmVar) {
        return (ck) DEFAULT_INSTANCE.createBuilder(cmVar);
    }

    public static cm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cm parseFrom(com.google.v.z zVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cm parseFrom(InputStream inputStream) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cm parseFrom(ByteBuffer byteBuffer) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cm parseFrom(byte[] bArr) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
