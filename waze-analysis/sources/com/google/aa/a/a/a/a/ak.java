package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gb;
import com.google.v.gc;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak extends du<ak, aj> implements fj {
    public static final int ACCESSIBILITY_STATE_FIELD_NUMBER = 13;
    public static final int APPLICATION_BUILD_CL_FIELD_NUMBER = 9;
    public static final int APPLICATION_BUILD_FIELD_NUMBER = 5;
    public static final int APPLICATION_BUILD_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int APPLICATION_BUNDLE_ID_FIELD_NUMBER = 11;
    public static final int APPLICATION_VERSION_FIELD_NUMBER = 12;
    public static final int CLEARCUT_VERSION_FIELD_NUMBER = 10;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    public static final int COUNTRY_FIELD_NUMBER = 6;
    private static final ak DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 8;
    public static final int LOGGING_ID_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 7;
    public static final int OS_FULL_VERSION_FIELD_NUMBER = 4;
    public static final int OS_MAJOR_VERSION_FIELD_NUMBER = 3;
    private static volatile fo<ak> PARSER;
    private com.google.d.i.g accessibilityState_;
    private long applicationBuildCl_;
    private gc applicationBuildTimestamp_;
    private int bitField0_;
    private int clearcutVersion_;
    private String clientId_ = "";
    private String loggingId_ = "";
    private String osMajorVersion_ = "";
    private String osFullVersion_ = "";
    private String applicationBuild_ = "";
    private String applicationVersion_ = "";
    private String country_ = "";
    private String model_ = "";
    private String languageCode_ = "";
    private String applicationBundleId_ = "";

    static {
        ak akVar = new ak();
        DEFAULT_INSTANCE = akVar;
        du.registerDefaultInstance(ak.class, akVar);
    }

    private ak() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessibilityState() {
        this.accessibilityState_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuild() {
        this.bitField0_ &= -17;
        this.applicationBuild_ = getDefaultInstance().getApplicationBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuildCl() {
        this.bitField0_ &= -513;
        this.applicationBuildCl_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuildTimestamp() {
        this.applicationBuildTimestamp_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBundleId() {
        this.bitField0_ &= -2049;
        this.applicationBundleId_ = getDefaultInstance().getApplicationBundleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationVersion() {
        this.bitField0_ &= -33;
        this.applicationVersion_ = getDefaultInstance().getApplicationVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClearcutVersion() {
        this.bitField0_ &= -1025;
        this.clearcutVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientId() {
        this.bitField0_ &= -2;
        this.clientId_ = getDefaultInstance().getClientId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -65;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageCode() {
        this.bitField0_ &= -257;
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoggingId() {
        this.bitField0_ &= -3;
        this.loggingId_ = getDefaultInstance().getLoggingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.bitField0_ &= -129;
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsFullVersion() {
        this.bitField0_ &= -9;
        this.osFullVersion_ = getDefaultInstance().getOsFullVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsMajorVersion() {
        this.bitField0_ &= -5;
        this.osMajorVersion_ = getDefaultInstance().getOsMajorVersion();
    }

    public static ak getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccessibilityState(com.google.d.i.g gVar) {
        Objects.requireNonNull(gVar);
        com.google.d.i.g gVar2 = this.accessibilityState_;
        if (gVar2 != null && gVar2 != com.google.d.i.g.getDefaultInstance()) {
            com.google.d.i.d dVarNewBuilder = com.google.d.i.g.newBuilder(gVar2);
            dVarNewBuilder.mergeFrom((com.google.d.i.d) gVar);
            gVar = dVarNewBuilder.buildPartial();
        }
        this.accessibilityState_ = gVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApplicationBuildTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.applicationBuildTimestamp_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.applicationBuildTimestamp_ = gcVar;
        this.bitField0_ |= 8192;
    }

    public static aj newBuilder() {
        return (aj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ak parseDelimitedFrom(InputStream inputStream) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(com.google.v.v vVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ak> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessibilityState(com.google.d.i.g gVar) {
        Objects.requireNonNull(gVar);
        this.accessibilityState_ = gVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuild(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.applicationBuild_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuildBytes(com.google.v.v vVar) {
        this.applicationBuild_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuildCl(long j2) {
        this.bitField0_ |= 512;
        this.applicationBuildCl_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuildTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.applicationBuildTimestamp_ = gcVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBundleId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.applicationBundleId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBundleIdBytes(com.google.v.v vVar) {
        this.applicationBundleId_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.applicationVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationVersionBytes(com.google.v.v vVar) {
        this.applicationVersion_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearcutVersion(int i2) {
        this.bitField0_ |= 1024;
        this.clearcutVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.clientId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientIdBytes(com.google.v.v vVar) {
        this.clientId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(com.google.v.v vVar) {
        this.country_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCodeBytes(com.google.v.v vVar) {
        this.languageCode_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggingId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.loggingId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggingIdBytes(com.google.v.v vVar) {
        this.loggingId_ = vVar.u();
        this.bitField0_ |= 2;
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
    public void setOsFullVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.osFullVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsFullVersionBytes(com.google.v.v vVar) {
        this.osFullVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsMajorVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.osMajorVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsMajorVersionBytes(com.google.v.v vVar) {
        this.osMajorVersion_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0006\u0007ဈ\u0007\bဈ\b\tဂ\t\nင\n\u000bဈ\u000b\fဈ\u0005\rဉ\f\u000eဉ\r", new Object[]{"bitField0_", "clientId_", "loggingId_", "osMajorVersion_", "osFullVersion_", "applicationBuild_", "country_", "model_", "languageCode_", "applicationBuildCl_", "clearcutVersion_", "applicationBundleId_", "applicationVersion_", "accessibilityState_", "applicationBuildTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new ak();
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
        fo<ak> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ak.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.d.i.g getAccessibilityState() {
        com.google.d.i.g gVar = this.accessibilityState_;
        return gVar == null ? com.google.d.i.g.getDefaultInstance() : gVar;
    }

    public String getApplicationBuild() {
        return this.applicationBuild_;
    }

    public com.google.v.v getApplicationBuildBytes() {
        return com.google.v.v.s(this.applicationBuild_);
    }

    public long getApplicationBuildCl() {
        return this.applicationBuildCl_;
    }

    public gc getApplicationBuildTimestamp() {
        gc gcVar = this.applicationBuildTimestamp_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public String getApplicationBundleId() {
        return this.applicationBundleId_;
    }

    public com.google.v.v getApplicationBundleIdBytes() {
        return com.google.v.v.s(this.applicationBundleId_);
    }

    public String getApplicationVersion() {
        return this.applicationVersion_;
    }

    public com.google.v.v getApplicationVersionBytes() {
        return com.google.v.v.s(this.applicationVersion_);
    }

    public int getClearcutVersion() {
        return this.clearcutVersion_;
    }

    @Deprecated
    public String getClientId() {
        return this.clientId_;
    }

    @Deprecated
    public com.google.v.v getClientIdBytes() {
        return com.google.v.v.s(this.clientId_);
    }

    public String getCountry() {
        return this.country_;
    }

    public com.google.v.v getCountryBytes() {
        return com.google.v.v.s(this.country_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public com.google.v.v getLanguageCodeBytes() {
        return com.google.v.v.s(this.languageCode_);
    }

    @Deprecated
    public String getLoggingId() {
        return this.loggingId_;
    }

    @Deprecated
    public com.google.v.v getLoggingIdBytes() {
        return com.google.v.v.s(this.loggingId_);
    }

    public String getModel() {
        return this.model_;
    }

    public com.google.v.v getModelBytes() {
        return com.google.v.v.s(this.model_);
    }

    public String getOsFullVersion() {
        return this.osFullVersion_;
    }

    public com.google.v.v getOsFullVersionBytes() {
        return com.google.v.v.s(this.osFullVersion_);
    }

    public String getOsMajorVersion() {
        return this.osMajorVersion_;
    }

    public com.google.v.v getOsMajorVersionBytes() {
        return com.google.v.v.s(this.osMajorVersion_);
    }

    public boolean hasAccessibilityState() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasApplicationBuild() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasApplicationBuildCl() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasApplicationBuildTimestamp() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasApplicationBundleId() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasApplicationVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClearcutVersion() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Deprecated
    public boolean hasClientId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLanguageCode() {
        return (this.bitField0_ & 256) != 0;
    }

    @Deprecated
    public boolean hasLoggingId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasModel() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasOsFullVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOsMajorVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public static aj newBuilder(ak akVar) {
        return (aj) DEFAULT_INSTANCE.createBuilder(akVar);
    }

    public static ak parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ak parseFrom(com.google.v.z zVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ak parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ak parseFrom(InputStream inputStream) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(ByteBuffer byteBuffer) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ak parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ak parseFrom(byte[] bArr) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ak parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
