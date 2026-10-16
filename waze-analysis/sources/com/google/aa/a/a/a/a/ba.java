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
public final class ba extends du<ba, az> implements fj {
    public static final int APPLICATION_BUILD_CL_FIELD_NUMBER = 5;
    public static final int APPLICATION_BUILD_FIELD_NUMBER = 3;
    public static final int APPLICATION_BUNDLE_ID_FIELD_NUMBER = 7;
    public static final int CLEARCUT_VERSION_FIELD_NUMBER = 6;
    public static final int CLIENT_BUILD_VARIANT_FIELD_NUMBER = 8;
    public static final int COUNTRY_FIELD_NUMBER = 4;
    private static final ba DEFAULT_INSTANCE;
    public static final int OS_FULL_VERSION_FIELD_NUMBER = 2;
    public static final int OS_MAJOR_VERSION_FIELD_NUMBER = 1;
    private static volatile fo<ba> PARSER;
    private long applicationBuildCl_;
    private int bitField0_;
    private int clearcutVersion_;
    private String osMajorVersion_ = "";
    private String osFullVersion_ = "";
    private String applicationBuild_ = "";
    private String country_ = "";
    private String applicationBundleId_ = "";
    private String clientBuildVariant_ = "";

    static {
        ba baVar = new ba();
        DEFAULT_INSTANCE = baVar;
        du.registerDefaultInstance(ba.class, baVar);
    }

    private ba() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuild() {
        this.bitField0_ &= -5;
        this.applicationBuild_ = getDefaultInstance().getApplicationBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuildCl() {
        this.bitField0_ &= -17;
        this.applicationBuildCl_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBundleId() {
        this.bitField0_ &= -65;
        this.applicationBundleId_ = getDefaultInstance().getApplicationBundleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClearcutVersion() {
        this.bitField0_ &= -33;
        this.clearcutVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientBuildVariant() {
        this.bitField0_ &= -129;
        this.clientBuildVariant_ = getDefaultInstance().getClientBuildVariant();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -9;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsFullVersion() {
        this.bitField0_ &= -3;
        this.osFullVersion_ = getDefaultInstance().getOsFullVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsMajorVersion() {
        this.bitField0_ &= -2;
        this.osMajorVersion_ = getDefaultInstance().getOsMajorVersion();
    }

    public static ba getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static az newBuilder() {
        return (az) DEFAULT_INSTANCE.createBuilder();
    }

    public static ba parseDelimitedFrom(InputStream inputStream) {
        return (ba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ba parseFrom(com.google.v.v vVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ba> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuild(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.applicationBuild_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuildBytes(com.google.v.v vVar) {
        this.applicationBuild_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBuildCl(long j2) {
        this.bitField0_ |= 16;
        this.applicationBuildCl_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBundleId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.applicationBundleId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationBundleIdBytes(com.google.v.v vVar) {
        this.applicationBundleId_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearcutVersion(int i2) {
        this.bitField0_ |= 32;
        this.clearcutVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientBuildVariant(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.clientBuildVariant_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientBuildVariantBytes(com.google.v.v vVar) {
        this.clientBuildVariant_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(com.google.v.v vVar) {
        this.country_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsFullVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.osFullVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsFullVersionBytes(com.google.v.v vVar) {
        this.osFullVersion_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsMajorVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.osMajorVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsMajorVersionBytes(com.google.v.v vVar) {
        this.osMajorVersion_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"bitField0_", "osMajorVersion_", "osFullVersion_", "applicationBuild_", "country_", "applicationBuildCl_", "clearcutVersion_", "applicationBundleId_", "clientBuildVariant_"});
        }
        if (iOrdinal == 3) {
            return new ba();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new az(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ba> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ba.class) {
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

    public String getApplicationBundleId() {
        return this.applicationBundleId_;
    }

    public com.google.v.v getApplicationBundleIdBytes() {
        return com.google.v.v.s(this.applicationBundleId_);
    }

    public int getClearcutVersion() {
        return this.clearcutVersion_;
    }

    public String getClientBuildVariant() {
        return this.clientBuildVariant_;
    }

    public com.google.v.v getClientBuildVariantBytes() {
        return com.google.v.v.s(this.clientBuildVariant_);
    }

    public String getCountry() {
        return this.country_;
    }

    public com.google.v.v getCountryBytes() {
        return com.google.v.v.s(this.country_);
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

    public boolean hasApplicationBuild() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasApplicationBuildCl() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasApplicationBundleId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasClearcutVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClientBuildVariant() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOsFullVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOsMajorVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public static az newBuilder(ba baVar) {
        return (az) DEFAULT_INSTANCE.createBuilder(baVar);
    }

    public static ba parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ba parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ba parseFrom(com.google.v.z zVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ba parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ba parseFrom(InputStream inputStream) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ba parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ba parseFrom(ByteBuffer byteBuffer) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ba parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ba parseFrom(byte[] bArr) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ba parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
