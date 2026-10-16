package i.b.l;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ao extends com.google.v.du<ao, aj> implements com.google.v.fj {
    public static final int APPLICATIN_MODE_BITMAP_FIELD_NUMBER = 12;
    public static final int APPLICATION_TYPE_FIELD_NUMBER = 10;
    public static final int APP_FLAVOR_FIELD_NUMBER = 31;
    public static final int APP_TYPE_FIELD_NUMBER = 19;
    public static final int CLIENT_AB_TESTS_FIELD_NUMBER = 13;
    public static final int CLIENT_API_FIELD_NUMBER = 20;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 3;
    public static final int CURRENT_TIME_MILLIS_FIELD_NUMBER = 28;
    public static final int DEBUG_OPTIONS_FIELD_NUMBER = 22;
    private static final ao DEFAULT_INSTANCE;
    public static final int DEVICE_BRAND_FIELD_NUMBER = 29;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 18;
    public static final int DISPLAY_FIELD_NUMBER = 24;
    public static final int ENVIRONMENT_FIELD_NUMBER = 21;
    public static final int HEIGHT_FIELD_NUMBER = 9;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 17;
    public static final int IS_24_HOUR_FORMAT_FIELD_NUMBER = 30;
    public static final int IS_JAILBROKEN_FIELD_NUMBER = 27;
    public static final int LAST_POSITION_FIELD_NUMBER = 4;
    public static final int LOCALE_FIELD_NUMBER = 16;
    public static final int MANUFACTORER_FIELD_NUMBER = 5;
    public static final int MODEL_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 7;
    public static final int OS_LANGUAGE_ID_FIELD_NUMBER = 25;
    public static final int OS_VERSION_FIELD_NUMBER = 11;
    private static volatile com.google.v.fo<ao> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    public static final int RETURN_TEXT_FIELD_NUMBER = 14;
    public static final int SESSION_UUID_FIELD_NUMBER = 26;
    public static final int SIMULATED_FIELD_NUMBER = 15;
    public static final int USER_AGENT_FIELD_NUMBER = 23;
    public static final int WIDTH_FIELD_NUMBER = 8;
    private int appFlavor_;
    private int appType_;
    private int applicatinModeBitmap_;
    private int bitField0_;
    private i.b.am clientAbTests_;
    private long currentTimeMillis_;
    private i.b.am debugOptions_;
    private int deviceType_;
    private boolean is24HourFormat_;
    private boolean isJailbroken_;
    private i.b.s lastPosition_;
    private int protocol_;
    private boolean returnText_;
    private boolean simulated_;
    private String device_ = "";
    private String clientVersion_ = "";
    private String manufactorer_ = "";
    private String model_ = "";
    private String name_ = "";
    private int width_ = -1;
    private int height_ = -1;
    private String applicationType_ = "";
    private String osVersion_ = "";
    private String locale_ = "";
    private String installationId_ = "";
    private com.google.v.eo<al> clientApi_ = emptyProtobufList();
    private int environment_ = 1;
    private String userAgent_ = "";
    private com.google.v.eo<ar> display_ = emptyProtobufList();
    private String osLanguageId_ = "";
    private String sessionUuid_ = "";
    private String deviceBrand_ = "";

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        com.google.v.du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClientApi(Iterable<? extends al> iterable) {
        ensureClientApiIsMutable();
        com.google.v.c.addAll(iterable, this.clientApi_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplay(Iterable<? extends ar> iterable) {
        ensureDisplayIsMutable();
        com.google.v.c.addAll(iterable, this.display_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientApi(int i2, al alVar) {
        Objects.requireNonNull(alVar);
        ensureClientApiIsMutable();
        this.clientApi_.add(i2, alVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplay(int i2, ar arVar) {
        Objects.requireNonNull(arVar);
        ensureDisplayIsMutable();
        this.display_.add(i2, arVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppFlavor() {
        this.bitField0_ &= -268435457;
        this.appFlavor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppType() {
        this.bitField0_ &= -262145;
        this.appType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicatinModeBitmap() {
        this.bitField0_ &= -2049;
        this.applicatinModeBitmap_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationType() {
        this.bitField0_ &= -513;
        this.applicationType_ = getDefaultInstance().getApplicationType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientAbTests() {
        this.clientAbTests_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientApi() {
        this.clientApi_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientVersion() {
        this.bitField0_ &= -5;
        this.clientVersion_ = getDefaultInstance().getClientVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentTimeMillis() {
        this.bitField0_ &= -33554433;
        this.currentTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugOptions() {
        this.debugOptions_ = null;
        this.bitField0_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.bitField0_ &= -3;
        this.device_ = getDefaultInstance().getDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceBrand() {
        this.bitField0_ &= -67108865;
        this.deviceBrand_ = getDefaultInstance().getDeviceBrand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.bitField0_ &= -131073;
        this.deviceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplay() {
        this.display_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnvironment() {
        this.bitField0_ &= -524289;
        this.environment_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.bitField0_ &= -257;
        this.height_ = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstallationId() {
        this.bitField0_ &= -65537;
        this.installationId_ = getDefaultInstance().getInstallationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIs24HourFormat() {
        this.bitField0_ &= -134217729;
        this.is24HourFormat_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsJailbroken() {
        this.bitField0_ &= -16777217;
        this.isJailbroken_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPosition() {
        this.lastPosition_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -32769;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManufactorer() {
        this.bitField0_ &= -17;
        this.manufactorer_ = getDefaultInstance().getManufactorer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.bitField0_ &= -33;
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -65;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsLanguageId() {
        this.bitField0_ &= -4194305;
        this.osLanguageId_ = getDefaultInstance().getOsLanguageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.bitField0_ &= -1025;
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.bitField0_ &= -2;
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnText() {
        this.bitField0_ &= -8193;
        this.returnText_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionUuid() {
        this.bitField0_ &= -8388609;
        this.sessionUuid_ = getDefaultInstance().getSessionUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimulated() {
        this.bitField0_ &= -16385;
        this.simulated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.bitField0_ &= -2097153;
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.bitField0_ &= -129;
        this.width_ = -1;
    }

    private void ensureClientApiIsMutable() {
        com.google.v.eo<al> eoVar = this.clientApi_;
        if (eoVar.c()) {
            return;
        }
        this.clientApi_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureDisplayIsMutable() {
        com.google.v.eo<ar> eoVar = this.display_;
        if (eoVar.c()) {
            return;
        }
        this.display_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientAbTests(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.am amVar2 = this.clientAbTests_;
        if (amVar2 != null && amVar2 != i.b.am.getDefaultInstance()) {
            i.b.al alVarNewBuilder = i.b.am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((i.b.al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.clientAbTests_ = amVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDebugOptions(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.am amVar2 = this.debugOptions_;
        if (amVar2 != null && amVar2 != i.b.am.getDefaultInstance()) {
            i.b.al alVarNewBuilder = i.b.am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((i.b.al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.debugOptions_ = amVar;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.lastPosition_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.lastPosition_ = sVar;
        this.bitField0_ |= 8;
    }

    public static aj newBuilder() {
        return (aj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeClientApi(int i2) {
        ensureClientApiIsMutable();
        this.clientApi_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDisplay(int i2) {
        ensureDisplayIsMutable();
        this.display_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppFlavor(i.b.m mVar) {
        this.appFlavor_ = mVar.getNumber();
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppType(i.b.n nVar) {
        this.appType_ = nVar.getNumber();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicatinModeBitmap(int i2) {
        this.bitField0_ |= 2048;
        this.applicatinModeBitmap_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.applicationType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationTypeBytes(com.google.v.v vVar) {
        this.applicationType_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAbTests(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        this.clientAbTests_ = amVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientApi(int i2, al alVar) {
        Objects.requireNonNull(alVar);
        ensureClientApiIsMutable();
        this.clientApi_.set(i2, alVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.clientVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersionBytes(com.google.v.v vVar) {
        this.clientVersion_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentTimeMillis(long j2) {
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.currentTimeMillis_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugOptions(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        this.debugOptions_ = amVar;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.device_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBrand(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 67108864;
        this.deviceBrand_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBrandBytes(com.google.v.v vVar) {
        this.deviceBrand_ = vVar.u();
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBytes(com.google.v.v vVar) {
        this.device_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(i.b.u uVar) {
        this.deviceType_ = uVar.getNumber();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplay(int i2, ar arVar) {
        Objects.requireNonNull(arVar);
        ensureDisplayIsMutable();
        this.display_.set(i2, arVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironment(an anVar) {
        this.environment_ = anVar.getNumber();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i2) {
        this.bitField0_ |= 256;
        this.height_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.installationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationIdBytes(com.google.v.v vVar) {
        this.installationId_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIs24HourFormat(boolean z) {
        this.bitField0_ |= 134217728;
        this.is24HourFormat_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsJailbroken(boolean z) {
        this.bitField0_ |= 16777216;
        this.isJailbroken_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.lastPosition_ = sVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufactorer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.manufactorer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufactorerBytes(com.google.v.v vVar) {
        this.manufactorer_ = vVar.u();
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
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsLanguageId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4194304;
        this.osLanguageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsLanguageIdBytes(com.google.v.v vVar) {
        this.osLanguageId_ = vVar.u();
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(com.google.v.v vVar) {
        this.osVersion_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(int i2) {
        this.bitField0_ |= 1;
        this.protocol_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnText(boolean z) {
        this.bitField0_ |= 8192;
        this.returnText_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8388608;
        this.sessionUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionUuidBytes(com.google.v.v vVar) {
        this.sessionUuid_ = vVar.u();
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimulated(boolean z) {
        this.bitField0_ |= 16384;
        this.simulated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2097152;
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(com.google.v.v vVar) {
        this.userAgent_ = vVar.u();
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i2) {
        this.bitField0_ |= 128;
        this.width_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tင\b\nဈ\t\u000bဈ\n\fင\u000b\rဉ\f\u000eဇ\r\u000fဇ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012᠌\u0011\u0013᠌\u0012\u0014\u001b\u0015᠌\u0013\u0016ဉ\u0014\u0017ဈ\u0015\u0018\u001b\u0019ဈ\u0016\u001aဈ\u0017\u001bဇ\u0018\u001cဂ\u0019\u001dဈ\u001a\u001eဇ\u001b\u001f᠌\u001c", new Object[]{"bitField0_", "protocol_", "device_", "clientVersion_", "lastPosition_", "manufactorer_", "model_", "name_", "width_", "height_", "applicationType_", "osVersion_", "applicatinModeBitmap_", "clientAbTests_", "returnText_", "simulated_", "locale_", "installationId_", "deviceType_", i.b.u.a(), "appType_", i.b.n.a(), "clientApi_", al.class, "environment_", e.f48663j, "debugOptions_", "userAgent_", "display_", ar.class, "osLanguageId_", "sessionUuid_", "isJailbroken_", "currentTimeMillis_", "deviceBrand_", "is24HourFormat_", "appFlavor_", i.b.m.a()});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.m getAppFlavor() {
        i.b.m mVarB = i.b.m.b(this.appFlavor_);
        return mVarB == null ? i.b.m.UNKNOWN_APP_FLAVOR : mVarB;
    }

    public i.b.n getAppType() {
        i.b.n nVarB = i.b.n.b(this.appType_);
        return nVarB == null ? i.b.n.UNKNOWN_APP_TYPE : nVarB;
    }

    @Deprecated
    public int getApplicatinModeBitmap() {
        return this.applicatinModeBitmap_;
    }

    @Deprecated
    public String getApplicationType() {
        return this.applicationType_;
    }

    @Deprecated
    public com.google.v.v getApplicationTypeBytes() {
        return com.google.v.v.s(this.applicationType_);
    }

    public i.b.am getClientAbTests() {
        i.b.am amVar = this.clientAbTests_;
        return amVar == null ? i.b.am.getDefaultInstance() : amVar;
    }

    public al getClientApi(int i2) {
        return this.clientApi_.get(i2);
    }

    public int getClientApiCount() {
        return this.clientApi_.size();
    }

    public List<al> getClientApiList() {
        return this.clientApi_;
    }

    public am getClientApiOrBuilder(int i2) {
        return this.clientApi_.get(i2);
    }

    public List<? extends am> getClientApiOrBuilderList() {
        return this.clientApi_;
    }

    public String getClientVersion() {
        return this.clientVersion_;
    }

    public com.google.v.v getClientVersionBytes() {
        return com.google.v.v.s(this.clientVersion_);
    }

    public long getCurrentTimeMillis() {
        return this.currentTimeMillis_;
    }

    public i.b.am getDebugOptions() {
        i.b.am amVar = this.debugOptions_;
        return amVar == null ? i.b.am.getDefaultInstance() : amVar;
    }

    @Deprecated
    public String getDevice() {
        return this.device_;
    }

    public String getDeviceBrand() {
        return this.deviceBrand_;
    }

    public com.google.v.v getDeviceBrandBytes() {
        return com.google.v.v.s(this.deviceBrand_);
    }

    @Deprecated
    public com.google.v.v getDeviceBytes() {
        return com.google.v.v.s(this.device_);
    }

    public i.b.u getDeviceType() {
        i.b.u uVarB = i.b.u.b(this.deviceType_);
        return uVarB == null ? i.b.u.UNKNOWN_DEVICE_TYPE : uVarB;
    }

    public ar getDisplay(int i2) {
        return this.display_.get(i2);
    }

    public int getDisplayCount() {
        return this.display_.size();
    }

    public List<ar> getDisplayList() {
        return this.display_;
    }

    public as getDisplayOrBuilder(int i2) {
        return this.display_.get(i2);
    }

    public List<? extends as> getDisplayOrBuilderList() {
        return this.display_;
    }

    public an getEnvironment() {
        an anVarA = an.a(this.environment_);
        return anVarA == null ? an.STAGING : anVarA;
    }

    public int getHeight() {
        return this.height_;
    }

    public String getInstallationId() {
        return this.installationId_;
    }

    public com.google.v.v getInstallationIdBytes() {
        return com.google.v.v.s(this.installationId_);
    }

    public boolean getIs24HourFormat() {
        return this.is24HourFormat_;
    }

    public boolean getIsJailbroken() {
        return this.isJailbroken_;
    }

    public i.b.s getLastPosition() {
        i.b.s sVar = this.lastPosition_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    public String getManufactorer() {
        return this.manufactorer_;
    }

    public com.google.v.v getManufactorerBytes() {
        return com.google.v.v.s(this.manufactorer_);
    }

    public String getModel() {
        return this.model_;
    }

    public com.google.v.v getModelBytes() {
        return com.google.v.v.s(this.model_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getOsLanguageId() {
        return this.osLanguageId_;
    }

    public com.google.v.v getOsLanguageIdBytes() {
        return com.google.v.v.s(this.osLanguageId_);
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public com.google.v.v getOsVersionBytes() {
        return com.google.v.v.s(this.osVersion_);
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public boolean getReturnText() {
        return this.returnText_;
    }

    public String getSessionUuid() {
        return this.sessionUuid_;
    }

    public com.google.v.v getSessionUuidBytes() {
        return com.google.v.v.s(this.sessionUuid_);
    }

    public boolean getSimulated() {
        return this.simulated_;
    }

    public String getUserAgent() {
        return this.userAgent_;
    }

    public com.google.v.v getUserAgentBytes() {
        return com.google.v.v.s(this.userAgent_);
    }

    public int getWidth() {
        return this.width_;
    }

    public boolean hasAppFlavor() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasAppType() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Deprecated
    public boolean hasApplicatinModeBitmap() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Deprecated
    public boolean hasApplicationType() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasClientAbTests() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasClientVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCurrentTimeMillis() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasDebugOptions() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Deprecated
    public boolean hasDevice() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDeviceBrand() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasDeviceType() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasEnvironment() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasHeight() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasInstallationId() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasIs24HourFormat() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasIsJailbroken() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasLastPosition() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasManufactorer() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasModel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasOsLanguageId() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasOsVersion() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasProtocol() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReturnText() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasSessionUuid() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasSimulated() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasUserAgent() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasWidth() {
        return (this.bitField0_ & 128) != 0;
    }

    public static aj newBuilder(ao aoVar) {
        return (aj) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientApi(al alVar) {
        Objects.requireNonNull(alVar);
        ensureClientApiIsMutable();
        this.clientApi_.add(alVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplay(ar arVar) {
        Objects.requireNonNull(arVar);
        ensureDisplayIsMutable();
        this.display_.add(arVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
