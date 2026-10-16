package com.google.aa.a.a.a.a;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.google.v.dn;
import com.google.v.dq;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends dq<e, a> implements fj {
    public static final int ACCESSIBILITY_STATE_FIELD_NUMBER = 25;
    public static final int ANDROID_DEVICE_TYPE_FIELD_NUMBER = 24;
    public static final int ANDROID_ID_FIELD_NUMBER = 1;
    public static final int APPLICATION_BUILD_FIELD_NUMBER = 7;
    public static final int BOARD_FIELD_NUMBER = 15;
    public static final int BRAND_FIELD_NUMBER = 14;
    public static final int COUNTRY_FIELD_NUMBER = 12;
    private static final e DEFAULT_INSTANCE;
    public static final int DEVICE_DATA_VERSION_INFO_FIELD_NUMBER = 28;
    public static final int DEVICE_FIELD_NUMBER = 9;
    public static final int DEVICE_ID_FIELD_NUMBER = 18;
    public static final int DEVICE_RESTRICTION_FIELD_NUMBER = 23;
    public static final int EXTENSION_VERSION_FIELD_NUMBER = 34;
    public static final int FINGERPRINT_FIELD_NUMBER = 17;
    public static final int GMSCORE_DEVICE_INFO_FIELD_NUMBER = 37;
    public static final int GMSCORE_VARIANT_FIELD_NUMBER = 32;
    public static final int GMS_CORE_VERSION_CODE_FIELD_NUMBER = 19;
    public static final int GMS_DEVICE_ID_FIELD_NUMBER = 39;
    public static final int GMS_DEVICE_ID_ZWIEBACK_FIELD_NUMBER = 40;
    public static final int HARDWARE_FIELD_NUMBER = 8;
    public static final int IS_SIDEWINDER_DEVICE_FIELD_NUMBER = 20;
    public static final int LOCALE_FIELD_NUMBER = 11;
    public static final int LOGGING_ID_FIELD_NUMBER = 2;
    public static final int MANUFACTURER_FIELD_NUMBER = 13;
    public static final int MCC_MNC_FIELD_NUMBER = 10;
    public static final int MODEL_FIELD_NUMBER = 4;
    public static final int NATIVE_PLATFORM_FIELD_NUMBER = 31;
    public static final int OS_BUILD_FIELD_NUMBER = 6;
    private static volatile fo<e> PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 5;
    public static final int RADIO_VERSION_FIELD_NUMBER = 16;
    public static final int RO_OEM_KEY1_FIELD_NUMBER = 27;
    public static final int SDK_VERSION_FIELD_NUMBER = 3;
    public static final int SDK_VERSION_FULL_FIELD_NUMBER = 38;
    public static final int SIM_CARRIER_ID_FIELD_NUMBER = 33;
    public static final int TYPE_FIELD_NUMBER = 26;
    public static final int USER_CONSENT_STATE_FIELD_NUMBER = 36;
    public static final int USING_LOG_SOURCE_INT_FIELD_NUMBER = 22;
    public static final int WEBVIEW_VERSION_INFO_FIELD_NUMBER = 35;
    private com.google.d.i.c accessibilityState_;
    private g androidDeviceType_;
    private long androidId_;
    private int bitField0_;
    private int bitField1_;
    private long deviceId_;
    private int deviceRestriction_;
    private int gmsCoreVersionCode_;
    private long gmsDeviceId_;
    private com.google.android.c.a.i gmscoreDeviceInfo_;
    private com.google.android.c.a.f gmscoreVariant_;
    private boolean isSidewinderDevice_;
    private int sdkVersionFull_;
    private int sdkVersion_;
    private int simCarrierId_;
    private long userConsentState_;
    private boolean usingLogSourceInt_;
    private com.google.w.v.d webviewVersionInfo_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.v gmsDeviceIdZwieback_ = com.google.v.v.f13054a;
    private String loggingId_ = "";
    private eo<c> extensionVersion_ = emptyProtobufList();
    private String model_ = "";
    private String product_ = "";
    private String hardware_ = "";
    private String device_ = "";
    private String osBuild_ = "";
    private String applicationBuild_ = "";
    private String mccMnc_ = "";
    private String locale_ = "";
    private String country_ = "";
    private String manufacturer_ = "";
    private String brand_ = "";
    private String board_ = "";
    private String radioVersion_ = "";
    private String fingerprint_ = "";
    private String type_ = "";
    private String roOemKey1_ = "";
    private String deviceDataVersionInfo_ = "";
    private eo<String> nativePlatform_ = emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensionVersion(Iterable<? extends c> iterable) {
        ensureExtensionVersionIsMutable();
        com.google.v.c.addAll(iterable, this.extensionVersion_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNativePlatform(Iterable<String> iterable) {
        ensureNativePlatformIsMutable();
        com.google.v.c.addAll(iterable, this.nativePlatform_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionVersion(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureExtensionVersionIsMutable();
        this.extensionVersion_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNativePlatform(String str) {
        Objects.requireNonNull(str);
        ensureNativePlatformIsMutable();
        this.nativePlatform_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNativePlatformBytes(com.google.v.v vVar) {
        ensureNativePlatformIsMutable();
        this.nativePlatform_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessibilityState() {
        this.accessibilityState_ = null;
        this.bitField0_ &= -268435457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidDeviceType() {
        this.androidDeviceType_ = null;
        this.bitField0_ &= -134217729;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidId() {
        this.bitField0_ &= -2;
        this.androidId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuild() {
        this.bitField0_ &= -4097;
        this.applicationBuild_ = getDefaultInstance().getApplicationBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoard() {
        this.bitField0_ &= -262145;
        this.board_ = getDefaultInstance().getBoard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrand() {
        this.bitField0_ &= -131073;
        this.brand_ = getDefaultInstance().getBrand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -32769;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.bitField0_ &= -1025;
        this.device_ = getDefaultInstance().getDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceDataVersionInfo() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.deviceDataVersionInfo_ = getDefaultInstance().getDeviceDataVersionInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.bitField0_ &= -17;
        this.deviceId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceRestriction() {
        this.bitField0_ &= -67108865;
        this.deviceRestriction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtensionVersion() {
        this.extensionVersion_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFingerprint() {
        this.bitField0_ &= -1048577;
        this.fingerprint_ = getDefaultInstance().getFingerprint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGmsCoreVersionCode() {
        this.bitField0_ &= -2097153;
        this.gmsCoreVersionCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGmsDeviceId() {
        this.bitField0_ &= -3;
        this.gmsDeviceId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGmsDeviceIdZwieback() {
        this.bitField0_ &= -5;
        this.gmsDeviceIdZwieback_ = getDefaultInstance().getGmsDeviceIdZwieback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGmscoreDeviceInfo() {
        this.gmscoreDeviceInfo_ = null;
        this.bitField0_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGmscoreVariant() {
        this.gmscoreVariant_ = null;
        this.bitField0_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHardware() {
        this.bitField0_ &= -513;
        this.hardware_ = getDefaultInstance().getHardware();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSidewinderDevice() {
        this.bitField0_ &= -16777217;
        this.isSidewinderDevice_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -16385;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoggingId() {
        this.bitField0_ &= -9;
        this.loggingId_ = getDefaultInstance().getLoggingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManufacturer() {
        this.bitField0_ &= -65537;
        this.manufacturer_ = getDefaultInstance().getManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMccMnc() {
        this.bitField0_ &= -8193;
        this.mccMnc_ = getDefaultInstance().getMccMnc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.bitField0_ &= -129;
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNativePlatform() {
        this.nativePlatform_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsBuild() {
        this.bitField0_ &= -2049;
        this.osBuild_ = getDefaultInstance().getOsBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProduct() {
        this.bitField0_ &= -257;
        this.product_ = getDefaultInstance().getProduct();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadioVersion() {
        this.bitField0_ &= -524289;
        this.radioVersion_ = getDefaultInstance().getRadioVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoOemKey1() {
        this.bitField0_ &= -1073741825;
        this.roOemKey1_ = getDefaultInstance().getRoOemKey1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -33;
        this.sdkVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersionFull() {
        this.bitField0_ &= -65;
        this.sdkVersionFull_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimCarrierId() {
        this.bitField1_ &= -2;
        this.simCarrierId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -536870913;
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserConsentState() {
        this.bitField1_ &= -5;
        this.userConsentState_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsingLogSourceInt() {
        this.bitField0_ &= -33554433;
        this.usingLogSourceInt_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewVersionInfo() {
        this.webviewVersionInfo_ = null;
        this.bitField1_ &= -3;
    }

    private void ensureExtensionVersionIsMutable() {
        eo<c> eoVar = this.extensionVersion_;
        if (eoVar.c()) {
            return;
        }
        this.extensionVersion_ = du.mutableCopy(eoVar);
    }

    private void ensureNativePlatformIsMutable() {
        eo<String> eoVar = this.nativePlatform_;
        if (eoVar.c()) {
            return;
        }
        this.nativePlatform_ = du.mutableCopy(eoVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccessibilityState(com.google.d.i.c cVar) {
        Objects.requireNonNull(cVar);
        com.google.d.i.c cVar2 = this.accessibilityState_;
        if (cVar2 != null && cVar2 != com.google.d.i.c.getDefaultInstance()) {
            com.google.d.i.a aVarNewBuilder = com.google.d.i.c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((com.google.d.i.a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.accessibilityState_ = cVar;
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidDeviceType(g gVar) {
        Objects.requireNonNull(gVar);
        g gVar2 = this.androidDeviceType_;
        if (gVar2 != null && gVar2 != g.getDefaultInstance()) {
            f fVarNewBuilder = g.newBuilder(gVar2);
            fVarNewBuilder.mergeFrom((f) gVar);
            gVar = fVarNewBuilder.buildPartial();
        }
        this.androidDeviceType_ = gVar;
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGmscoreDeviceInfo(com.google.android.c.a.i iVar) {
        Objects.requireNonNull(iVar);
        com.google.android.c.a.i iVar2 = this.gmscoreDeviceInfo_;
        if (iVar2 != null && iVar2 != com.google.android.c.a.i.getDefaultInstance()) {
            com.google.android.c.a.g gVarNewBuilder = com.google.android.c.a.i.newBuilder(iVar2);
            gVarNewBuilder.mergeFrom((com.google.android.c.a.g) iVar);
            iVar = gVarNewBuilder.buildPartial();
        }
        this.gmscoreDeviceInfo_ = iVar;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGmscoreVariant(com.google.android.c.a.f fVar) {
        Objects.requireNonNull(fVar);
        com.google.android.c.a.f fVar2 = this.gmscoreVariant_;
        if (fVar2 != null && fVar2 != com.google.android.c.a.f.getDefaultInstance()) {
            com.google.android.c.a.a aVarNewBuilder = com.google.android.c.a.f.newBuilder(fVar2);
            aVarNewBuilder.mergeFrom((com.google.android.c.a.a) fVar);
            fVar = aVarNewBuilder.buildPartial();
        }
        this.gmscoreVariant_ = fVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebviewVersionInfo(com.google.w.v.d dVar) {
        Objects.requireNonNull(dVar);
        com.google.w.v.d dVar2 = this.webviewVersionInfo_;
        if (dVar2 != null && dVar2 != com.google.w.v.d.getDefaultInstance()) {
            com.google.w.v.a aVarNewBuilder = com.google.w.v.d.newBuilder(dVar2);
            aVarNewBuilder.mergeFrom((com.google.w.v.a) dVar);
            dVar = aVarNewBuilder.buildPartial();
        }
        this.webviewVersionInfo_ = dVar;
        this.bitField1_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(com.google.v.v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtensionVersion(int i2) {
        ensureExtensionVersionIsMutable();
        this.extensionVersion_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessibilityState(com.google.d.i.c cVar) {
        Objects.requireNonNull(cVar);
        this.accessibilityState_ = cVar;
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidDeviceType(g gVar) {
        Objects.requireNonNull(gVar);
        this.androidDeviceType_ = gVar;
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidId(long j2) {
        this.bitField0_ |= 1;
        this.androidId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuild(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.applicationBuild_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuildBytes(com.google.v.v vVar) {
        this.applicationBuild_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoard(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 262144;
        this.board_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoardBytes(com.google.v.v vVar) {
        this.board_ = vVar.u();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrand(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 131072;
        this.brand_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBytes(com.google.v.v vVar) {
        this.brand_ = vVar.u();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(com.google.v.v vVar) {
        this.country_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.device_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBytes(com.google.v.v vVar) {
        this.device_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceDataVersionInfo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= Integer.MIN_VALUE;
        this.deviceDataVersionInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceDataVersionInfoBytes(com.google.v.v vVar) {
        this.deviceDataVersionInfo_ = vVar.u();
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(long j2) {
        this.bitField0_ |= 16;
        this.deviceId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceRestriction(df dfVar) {
        this.deviceRestriction_ = dfVar.getNumber();
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionVersion(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureExtensionVersionIsMutable();
        this.extensionVersion_.set(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFingerprint(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1048576;
        this.fingerprint_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFingerprintBytes(com.google.v.v vVar) {
        this.fingerprint_ = vVar.u();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmsCoreVersionCode(int i2) {
        this.bitField0_ |= 2097152;
        this.gmsCoreVersionCode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmsDeviceId(long j2) {
        this.bitField0_ |= 2;
        this.gmsDeviceId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmsDeviceIdZwieback(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 4;
        this.gmsDeviceIdZwieback_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmscoreDeviceInfo(com.google.android.c.a.i iVar) {
        Objects.requireNonNull(iVar);
        this.gmscoreDeviceInfo_ = iVar;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmscoreVariant(com.google.android.c.a.f fVar) {
        Objects.requireNonNull(fVar);
        this.gmscoreVariant_ = fVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardware(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.hardware_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardwareBytes(com.google.v.v vVar) {
        this.hardware_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSidewinderDevice(boolean z) {
        this.bitField0_ |= 16777216;
        this.isSidewinderDevice_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggingId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.loggingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggingIdBytes(com.google.v.v vVar) {
        this.loggingId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.manufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturerBytes(com.google.v.v vVar) {
        this.manufacturer_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMccMnc(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8192;
        this.mccMnc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMccMncBytes(com.google.v.v vVar) {
        this.mccMnc_ = vVar.u();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(com.google.v.v vVar) {
        this.model_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativePlatform(int i2, String str) {
        Objects.requireNonNull(str);
        ensureNativePlatformIsMutable();
        this.nativePlatform_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBuild(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.osBuild_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBuildBytes(com.google.v.v vVar) {
        this.osBuild_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.product_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductBytes(com.google.v.v vVar) {
        this.product_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadioVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 524288;
        this.radioVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadioVersionBytes(com.google.v.v vVar) {
        this.radioVersion_ = vVar.u();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoOemKey1(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1073741824;
        this.roOemKey1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoOemKey1Bytes(com.google.v.v vVar) {
        this.roOemKey1_ = vVar.u();
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(int i2) {
        this.bitField0_ |= 32;
        this.sdkVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionFull(int i2) {
        this.bitField0_ |= 64;
        this.sdkVersionFull_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimCarrierId(int i2) {
        this.bitField1_ |= 1;
        this.simCarrierId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 536870912;
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(com.google.v.v vVar) {
        this.type_ = vVar.u();
        this.bitField0_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserConsentState(long j2) {
        this.bitField1_ |= 4;
        this.userConsentState_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsingLogSourceInt(boolean z) {
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.usingLogSourceInt_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewVersionInfo(com.google.w.v.d dVar) {
        Objects.requireNonNull(dVar);
        this.webviewVersionInfo_ = dVar;
        this.bitField1_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001%\u0000\u0002\u0001(%\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဈ\u0003\u0003င\u0005\u0004ဈ\u0007\u0005ဈ\b\u0006ဈ\u000b\u0007ဈ\f\bဈ\t\tဈ\n\nဈ\r\u000bဈ\u000e\fဈ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဈ\u0012\u0010ဈ\u0013\u0011ဈ\u0014\u0012ဂ\u0004\u0013င\u0015\u0014ဇ\u0018\u0016ဇ\u0019\u0017᠌\u001a\u0018ဉ\u001b\u0019ဉ\u001c\u001aဈ\u001d\u001bဈ\u001e\u001cဈ\u001f\u001f\u001a ဉ\u0016!င \"\u001b#ဉ!$ဃ\"%ဉ\u0017&င\u0006'ဂ\u0001(ည\u0002", new Object[]{"bitField0_", "bitField1_", "androidId_", "loggingId_", "sdkVersion_", "model_", "product_", "osBuild_", "applicationBuild_", "hardware_", "device_", "mccMnc_", "locale_", "country_", "manufacturer_", "brand_", "board_", "radioVersion_", "fingerprint_", "deviceId_", "gmsCoreVersionCode_", "isSidewinderDevice_", "usingLogSourceInt_", "deviceRestriction_", cw.f3756d, "androidDeviceType_", "accessibilityState_", "type_", "roOemKey1_", "deviceDataVersionInfo_", "nativePlatform_", "gmscoreVariant_", "simCarrierId_", "extensionVersion_", c.class, "webviewVersionInfo_", "userConsentState_", "gmscoreDeviceInfo_", "sdkVersionFull_", "gmsDeviceId_", "gmsDeviceIdZwieback_"});
            case 3:
                return new e();
            case 4:
                return new a(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<e> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (e.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public com.google.d.i.c getAccessibilityState() {
        com.google.d.i.c cVar = this.accessibilityState_;
        return cVar == null ? com.google.d.i.c.getDefaultInstance() : cVar;
    }

    public g getAndroidDeviceType() {
        g gVar = this.androidDeviceType_;
        return gVar == null ? g.getDefaultInstance() : gVar;
    }

    public long getAndroidId() {
        return this.androidId_;
    }

    public String getApplicationBuild() {
        return this.applicationBuild_;
    }

    public com.google.v.v getApplicationBuildBytes() {
        return com.google.v.v.s(this.applicationBuild_);
    }

    public String getBoard() {
        return this.board_;
    }

    public com.google.v.v getBoardBytes() {
        return com.google.v.v.s(this.board_);
    }

    public String getBrand() {
        return this.brand_;
    }

    public com.google.v.v getBrandBytes() {
        return com.google.v.v.s(this.brand_);
    }

    public String getCountry() {
        return this.country_;
    }

    public com.google.v.v getCountryBytes() {
        return com.google.v.v.s(this.country_);
    }

    public String getDevice() {
        return this.device_;
    }

    public com.google.v.v getDeviceBytes() {
        return com.google.v.v.s(this.device_);
    }

    public String getDeviceDataVersionInfo() {
        return this.deviceDataVersionInfo_;
    }

    public com.google.v.v getDeviceDataVersionInfoBytes() {
        return com.google.v.v.s(this.deviceDataVersionInfo_);
    }

    public long getDeviceId() {
        return this.deviceId_;
    }

    public df getDeviceRestriction() {
        df dfVarA = df.a(this.deviceRestriction_);
        return dfVarA == null ? df.NO_RESTRICTION : dfVarA;
    }

    public c getExtensionVersion(int i2) {
        return this.extensionVersion_.get(i2);
    }

    public int getExtensionVersionCount() {
        return this.extensionVersion_.size();
    }

    public List<c> getExtensionVersionList() {
        return this.extensionVersion_;
    }

    public d getExtensionVersionOrBuilder(int i2) {
        return this.extensionVersion_.get(i2);
    }

    public List<? extends d> getExtensionVersionOrBuilderList() {
        return this.extensionVersion_;
    }

    public String getFingerprint() {
        return this.fingerprint_;
    }

    public com.google.v.v getFingerprintBytes() {
        return com.google.v.v.s(this.fingerprint_);
    }

    public int getGmsCoreVersionCode() {
        return this.gmsCoreVersionCode_;
    }

    @Deprecated
    public long getGmsDeviceId() {
        return this.gmsDeviceId_;
    }

    public com.google.v.v getGmsDeviceIdZwieback() {
        return this.gmsDeviceIdZwieback_;
    }

    public com.google.android.c.a.i getGmscoreDeviceInfo() {
        com.google.android.c.a.i iVar = this.gmscoreDeviceInfo_;
        return iVar == null ? com.google.android.c.a.i.getDefaultInstance() : iVar;
    }

    public com.google.android.c.a.f getGmscoreVariant() {
        com.google.android.c.a.f fVar = this.gmscoreVariant_;
        return fVar == null ? com.google.android.c.a.f.getDefaultInstance() : fVar;
    }

    public String getHardware() {
        return this.hardware_;
    }

    public com.google.v.v getHardwareBytes() {
        return com.google.v.v.s(this.hardware_);
    }

    @Deprecated
    public boolean getIsSidewinderDevice() {
        return this.isSidewinderDevice_;
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    @Deprecated
    public String getLoggingId() {
        return this.loggingId_;
    }

    @Deprecated
    public com.google.v.v getLoggingIdBytes() {
        return com.google.v.v.s(this.loggingId_);
    }

    public String getManufacturer() {
        return this.manufacturer_;
    }

    public com.google.v.v getManufacturerBytes() {
        return com.google.v.v.s(this.manufacturer_);
    }

    public String getMccMnc() {
        return this.mccMnc_;
    }

    public com.google.v.v getMccMncBytes() {
        return com.google.v.v.s(this.mccMnc_);
    }

    public String getModel() {
        return this.model_;
    }

    public com.google.v.v getModelBytes() {
        return com.google.v.v.s(this.model_);
    }

    public String getNativePlatform(int i2) {
        return this.nativePlatform_.get(i2);
    }

    public com.google.v.v getNativePlatformBytes(int i2) {
        return com.google.v.v.s(this.nativePlatform_.get(i2));
    }

    public int getNativePlatformCount() {
        return this.nativePlatform_.size();
    }

    public List<String> getNativePlatformList() {
        return this.nativePlatform_;
    }

    public String getOsBuild() {
        return this.osBuild_;
    }

    public com.google.v.v getOsBuildBytes() {
        return com.google.v.v.s(this.osBuild_);
    }

    public String getProduct() {
        return this.product_;
    }

    public com.google.v.v getProductBytes() {
        return com.google.v.v.s(this.product_);
    }

    public String getRadioVersion() {
        return this.radioVersion_;
    }

    public com.google.v.v getRadioVersionBytes() {
        return com.google.v.v.s(this.radioVersion_);
    }

    public String getRoOemKey1() {
        return this.roOemKey1_;
    }

    public com.google.v.v getRoOemKey1Bytes() {
        return com.google.v.v.s(this.roOemKey1_);
    }

    public int getSdkVersion() {
        return this.sdkVersion_;
    }

    public int getSdkVersionFull() {
        return this.sdkVersionFull_;
    }

    public int getSimCarrierId() {
        return this.simCarrierId_;
    }

    public String getType() {
        return this.type_;
    }

    public com.google.v.v getTypeBytes() {
        return com.google.v.v.s(this.type_);
    }

    public long getUserConsentState() {
        return this.userConsentState_;
    }

    @Deprecated
    public boolean getUsingLogSourceInt() {
        return this.usingLogSourceInt_;
    }

    public com.google.w.v.d getWebviewVersionInfo() {
        com.google.w.v.d dVar = this.webviewVersionInfo_;
        return dVar == null ? com.google.w.v.d.getDefaultInstance() : dVar;
    }

    public boolean hasAccessibilityState() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasAndroidDeviceType() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasAndroidId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasApplicationBuild() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasBoard() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasBrand() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasDevice() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDeviceDataVersionInfo() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasDeviceId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDeviceRestriction() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasFingerprint() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasGmsCoreVersionCode() {
        return (this.bitField0_ & 2097152) != 0;
    }

    @Deprecated
    public boolean hasGmsDeviceId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasGmsDeviceIdZwieback() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGmscoreDeviceInfo() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasGmscoreVariant() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasHardware() {
        return (this.bitField0_ & 512) != 0;
    }

    @Deprecated
    public boolean hasIsSidewinderDevice() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Deprecated
    public boolean hasLoggingId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasManufacturer() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasMccMnc() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasModel() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasOsBuild() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasProduct() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasRadioVersion() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasRoOemKey1() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSdkVersionFull() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSimCarrierId() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasUserConsentState() {
        return (this.bitField1_ & 4) != 0;
    }

    @Deprecated
    public boolean hasUsingLogSourceInt() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasWebviewVersionInfo() {
        return (this.bitField1_ & 2) != 0;
    }

    public static a newBuilder(e eVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(com.google.v.z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionVersion(c cVar) {
        Objects.requireNonNull(cVar);
        ensureExtensionVersionIsMutable();
        this.extensionVersion_.add(cVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
