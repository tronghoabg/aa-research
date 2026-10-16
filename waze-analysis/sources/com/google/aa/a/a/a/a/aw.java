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
public final class aw extends du<aw, al> implements fj {
    public static final int BUILD_LABEL_FIELD_NUMBER = 7;
    public static final int CLIENT_HINTS_FIELD_NUMBER = 9;
    public static final int CONTINENT_FIELD_NUMBER = 8;
    public static final int COUNTRY_FIELD_NUMBER = 4;
    private static final aw DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
    public static final int FLUSH_INFO_FIELD_NUMBER = 10;
    public static final int LOCALE_FIELD_NUMBER = 5;
    public static final int OS_FIELD_NUMBER = 1;
    public static final int OS_TYPE_FIELD_NUMBER = 6;
    public static final int OS_VERSION_FIELD_NUMBER = 2;
    private static volatile fo<aw> PARSER;
    private int bitField0_;
    private av clientHints_;
    private int deviceType_;
    private ap flushInfo_;
    private int osType_;
    private String os_ = "";
    private String osVersion_ = "";
    private String country_ = "";
    private String locale_ = "";
    private String buildLabel_ = "";
    private String continent_ = "";

    static {
        aw awVar = new aw();
        DEFAULT_INSTANCE = awVar;
        du.registerDefaultInstance(aw.class, awVar);
    }

    private aw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildLabel() {
        this.bitField0_ &= -65;
        this.buildLabel_ = getDefaultInstance().getBuildLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientHints() {
        this.clientHints_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContinent() {
        this.bitField0_ &= -129;
        this.continent_ = getDefaultInstance().getContinent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -9;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.bitField0_ &= -5;
        this.deviceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlushInfo() {
        this.flushInfo_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -17;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.bitField0_ &= -2;
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsType() {
        this.bitField0_ &= -33;
        this.osType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.bitField0_ &= -3;
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    public static aw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientHints(av avVar) {
        Objects.requireNonNull(avVar);
        av avVar2 = this.clientHints_;
        if (avVar2 != null && avVar2 != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder(avVar2);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.clientHints_ = avVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFlushInfo(ap apVar) {
        Objects.requireNonNull(apVar);
        ap apVar2 = this.flushInfo_;
        if (apVar2 != null && apVar2 != ap.getDefaultInstance()) {
            an anVarNewBuilder = ap.newBuilder(apVar2);
            anVarNewBuilder.mergeFrom((an) apVar);
            apVar = anVarNewBuilder.buildPartial();
        }
        this.flushInfo_ = apVar;
        this.bitField0_ |= 512;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static aw parseDelimitedFrom(InputStream inputStream) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(com.google.v.v vVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.buildLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildLabelBytes(com.google.v.v vVar) {
        this.buildLabel_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientHints(av avVar) {
        Objects.requireNonNull(avVar);
        this.clientHints_ = avVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinent(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.continent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinentBytes(com.google.v.v vVar) {
        this.continent_ = vVar.u();
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
    public void setDeviceType(am amVar) {
        this.deviceType_ = amVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlushInfo(ap apVar) {
        Objects.requireNonNull(apVar);
        this.flushInfo_ = apVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(com.google.v.v vVar) {
        this.os_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsType(aq aqVar) {
        this.osType_ = aqVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(com.google.v.v vVar) {
        this.osVersion_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006᠌\u0005\u0007ဈ\u0006\bဈ\u0007\tဉ\b\nဉ\t", new Object[]{"bitField0_", "os_", "osVersion_", "deviceType_", i.f3792j, "country_", "locale_", "osType_", i.f3794l, "buildLabel_", "continent_", "clientHints_", "flushInfo_"});
        }
        if (iOrdinal == 3) {
            return new aw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBuildLabel() {
        return this.buildLabel_;
    }

    public com.google.v.v getBuildLabelBytes() {
        return com.google.v.v.s(this.buildLabel_);
    }

    public av getClientHints() {
        av avVar = this.clientHints_;
        return avVar == null ? av.getDefaultInstance() : avVar;
    }

    public String getContinent() {
        return this.continent_;
    }

    public com.google.v.v getContinentBytes() {
        return com.google.v.v.s(this.continent_);
    }

    public String getCountry() {
        return this.country_;
    }

    public com.google.v.v getCountryBytes() {
        return com.google.v.v.s(this.country_);
    }

    public am getDeviceType() {
        am amVarA = am.a(this.deviceType_);
        return amVarA == null ? am.UNKNOWN : amVarA;
    }

    public ap getFlushInfo() {
        ap apVar = this.flushInfo_;
        return apVar == null ? ap.getDefaultInstance() : apVar;
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    @Deprecated
    public String getOs() {
        return this.os_;
    }

    @Deprecated
    public com.google.v.v getOsBytes() {
        return com.google.v.v.s(this.os_);
    }

    public aq getOsType() {
        aq aqVarA = aq.a(this.osType_);
        return aqVarA == null ? aq.OS_UNKNOWN : aqVarA;
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public com.google.v.v getOsVersionBytes() {
        return com.google.v.v.s(this.osVersion_);
    }

    public boolean hasBuildLabel() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasClientHints() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasContinent() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDeviceType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFlushInfo() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasOs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOsType() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOsVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static al newBuilder(aw awVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(awVar);
    }

    public static aw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aw parseFrom(com.google.v.z zVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aw parseFrom(InputStream inputStream) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(ByteBuffer byteBuffer) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aw parseFrom(byte[] bArr) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
