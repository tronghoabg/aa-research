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
public final class cd extends du<cd, cc> implements fj {
    public static final int APPLICATION_BUILD_FIELD_NUMBER = 5;
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    public static final int COUNTRY_FIELD_NUMBER = 8;
    private static final cd DEFAULT_INSTANCE;
    public static final int LOGGING_ID_FIELD_NUMBER = 7;
    public static final int MAKE_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 4;
    private static volatile fo<cd> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 6;
    private int bitField0_;
    private String clientId_ = "";
    private String loggingId_ = "";
    private String make_ = "";
    private String model_ = "";
    private String applicationBuild_ = "";
    private String platformVersion_ = "";
    private String country_ = "";

    static {
        cd cdVar = new cd();
        DEFAULT_INSTANCE = cdVar;
        du.registerDefaultInstance(cd.class, cdVar);
    }

    private cd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationBuild() {
        this.bitField0_ &= -17;
        this.applicationBuild_ = getDefaultInstance().getApplicationBuild();
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
    public void clearMake() {
        this.bitField0_ &= -5;
        this.make_ = getDefaultInstance().getMake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.bitField0_ &= -9;
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatformVersion() {
        this.bitField0_ &= -33;
        this.platformVersion_ = getDefaultInstance().getPlatformVersion();
    }

    public static cd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cc newBuilder() {
        return (cc) DEFAULT_INSTANCE.createBuilder();
    }

    public static cd parseDelimitedFrom(InputStream inputStream) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(com.google.v.v vVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setMake(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.make_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakeBytes(com.google.v.v vVar) {
        this.make_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(com.google.v.v vVar) {
        this.model_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.platformVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformVersionBytes(com.google.v.v vVar) {
        this.platformVersion_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0001\bဈ\u0006", new Object[]{"bitField0_", "clientId_", "make_", "model_", "applicationBuild_", "platformVersion_", "loggingId_", "country_"});
        }
        if (iOrdinal == 3) {
            return new cd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cd.class) {
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

    public String getClientId() {
        return this.clientId_;
    }

    public com.google.v.v getClientIdBytes() {
        return com.google.v.v.s(this.clientId_);
    }

    public String getCountry() {
        return this.country_;
    }

    public com.google.v.v getCountryBytes() {
        return com.google.v.v.s(this.country_);
    }

    public String getLoggingId() {
        return this.loggingId_;
    }

    public com.google.v.v getLoggingIdBytes() {
        return com.google.v.v.s(this.loggingId_);
    }

    public String getMake() {
        return this.make_;
    }

    public com.google.v.v getMakeBytes() {
        return com.google.v.v.s(this.make_);
    }

    public String getModel() {
        return this.model_;
    }

    public com.google.v.v getModelBytes() {
        return com.google.v.v.s(this.model_);
    }

    public String getPlatformVersion() {
        return this.platformVersion_;
    }

    public com.google.v.v getPlatformVersionBytes() {
        return com.google.v.v.s(this.platformVersion_);
    }

    public boolean hasApplicationBuild() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasClientId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLoggingId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMake() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasModel() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPlatformVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public static cc newBuilder(cd cdVar) {
        return (cc) DEFAULT_INSTANCE.createBuilder(cdVar);
    }

    public static cd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cd parseFrom(com.google.v.z zVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cd parseFrom(InputStream inputStream) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(ByteBuffer byteBuffer) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cd parseFrom(byte[] bArr) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cd) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
