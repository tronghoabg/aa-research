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
public final class w extends du<w, v> implements fj {
    public static final int APPLICATION_BUILD_CL_FIELD_NUMBER = 8;
    public static final int APPLICATION_BUILD_FIELD_NUMBER = 6;
    public static final int APPLICATION_IDENTIFIER_FIELD_NUMBER = 10;
    public static final int BATTLESTAR_WINDOWS_ID_FIELD_NUMBER = 11;
    public static final int CLEARCUT_VERSION_FIELD_NUMBER = 9;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    public static final int COUNTRY_FIELD_NUMBER = 7;
    private static final w DEFAULT_INSTANCE;
    public static final int LOGGING_ID_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int OS_FULL_VERSION_FIELD_NUMBER = 5;
    public static final int OS_MAJOR_VERSION_FIELD_NUMBER = 4;
    private static volatile fo<w> PARSER = null;
    public static final int PC_ID_FIELD_NUMBER = 12;
    private long applicationBuildCl_;
    private int bitField0_;
    private int clearcutVersion_;
    private long pcId_;
    private String clientId_ = "";
    private String loggingId_ = "";
    private String os_ = "";
    private String osMajorVersion_ = "";
    private String osFullVersion_ = "";
    private String applicationBuild_ = "";
    private String country_ = "";
    private String applicationIdentifier_ = "";
    private String battlestarWindowsId_ = "";

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuild() {
        this.bitField0_ &= -33;
        this.applicationBuild_ = getDefaultInstance().getApplicationBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuildCl() {
        this.bitField0_ &= -129;
        this.applicationBuildCl_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationIdentifier() {
        this.bitField0_ &= -513;
        this.applicationIdentifier_ = getDefaultInstance().getApplicationIdentifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattlestarWindowsId() {
        this.bitField0_ &= -1025;
        this.battlestarWindowsId_ = getDefaultInstance().getBattlestarWindowsId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClearcutVersion() {
        this.bitField0_ &= -257;
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
    public void clearLoggingId() {
        this.bitField0_ &= -3;
        this.loggingId_ = getDefaultInstance().getLoggingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.bitField0_ &= -5;
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsFullVersion() {
        this.bitField0_ &= -17;
        this.osFullVersion_ = getDefaultInstance().getOsFullVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsMajorVersion() {
        this.bitField0_ &= -9;
        this.osMajorVersion_ = getDefaultInstance().getOsMajorVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPcId() {
        this.bitField0_ &= -2049;
        this.pcId_ = 0L;
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuild(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.applicationBuild_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuildBytes(com.google.v.v vVar) {
        this.applicationBuild_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuildCl(long j2) {
        this.bitField0_ |= 128;
        this.applicationBuildCl_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationIdentifier(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.applicationIdentifier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationIdentifierBytes(com.google.v.v vVar) {
        this.applicationIdentifier_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattlestarWindowsId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.battlestarWindowsId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattlestarWindowsIdBytes(com.google.v.v vVar) {
        this.battlestarWindowsId_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearcutVersion(int i2) {
        this.bitField0_ |= 256;
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
    public void setOs(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(com.google.v.v vVar) {
        this.os_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsFullVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.osFullVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsFullVersionBytes(com.google.v.v vVar) {
        this.osFullVersion_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsMajorVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.osMajorVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsMajorVersionBytes(com.google.v.v vVar) {
        this.osMajorVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPcId(long j2) {
        this.bitField0_ |= 2048;
        this.pcId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\tင\b\nဈ\t\u000bဈ\n\fဂ\u000b", new Object[]{"bitField0_", "clientId_", "loggingId_", "os_", "osMajorVersion_", "osFullVersion_", "applicationBuild_", "country_", "applicationBuildCl_", "clearcutVersion_", "applicationIdentifier_", "battlestarWindowsId_", "pcId_"});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
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

    public String getApplicationIdentifier() {
        return this.applicationIdentifier_;
    }

    public com.google.v.v getApplicationIdentifierBytes() {
        return com.google.v.v.s(this.applicationIdentifier_);
    }

    public String getBattlestarWindowsId() {
        return this.battlestarWindowsId_;
    }

    public com.google.v.v getBattlestarWindowsIdBytes() {
        return com.google.v.v.s(this.battlestarWindowsId_);
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

    @Deprecated
    public String getLoggingId() {
        return this.loggingId_;
    }

    @Deprecated
    public com.google.v.v getLoggingIdBytes() {
        return com.google.v.v.s(this.loggingId_);
    }

    public String getOs() {
        return this.os_;
    }

    public com.google.v.v getOsBytes() {
        return com.google.v.v.s(this.os_);
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

    public long getPcId() {
        return this.pcId_;
    }

    public boolean hasApplicationBuild() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasApplicationBuildCl() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasApplicationIdentifier() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasBattlestarWindowsId() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasClearcutVersion() {
        return (this.bitField0_ & 256) != 0;
    }

    @Deprecated
    public boolean hasClientId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 64) != 0;
    }

    @Deprecated
    public boolean hasLoggingId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOsFullVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasOsMajorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPcId() {
        return (this.bitField0_ & 2048) != 0;
    }

    public static v newBuilder(w wVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(com.google.v.z zVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
