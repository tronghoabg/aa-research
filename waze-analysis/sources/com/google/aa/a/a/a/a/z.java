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
public final class z extends du<z, x> implements fj {
    public static final int BUILD_TYPE_FIELD_NUMBER = 3;
    public static final int BUILD_VERSION_FIELD_NUMBER = 2;
    public static final int CLIENT_TYPE_FIELD_NUMBER = 1;
    private static final z DEFAULT_INSTANCE;
    public static final int OMAHA_CHANNEL_FIELD_NUMBER = 4;
    private static volatile fo<z> PARSER;
    private int bitField0_;
    private int clientType_;
    private String buildVersion_ = "";
    private String buildType_ = "";
    private String omahaChannel_ = "";

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        du.registerDefaultInstance(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildType() {
        this.bitField0_ &= -5;
        this.buildType_ = getDefaultInstance().getBuildType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildVersion() {
        this.bitField0_ &= -3;
        this.buildVersion_ = getDefaultInstance().getBuildVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientType() {
        this.bitField0_ &= -2;
        this.clientType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOmahaChannel() {
        this.bitField0_ &= -9;
        this.omahaChannel_ = getDefaultInstance().getOmahaChannel();
    }

    public static z getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static z parseDelimitedFrom(InputStream inputStream) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(com.google.v.z zVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fo<z> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.buildType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildTypeBytes(com.google.v.v vVar) {
        this.buildType_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.buildVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildVersionBytes(com.google.v.v vVar) {
        this.buildVersion_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientType(y yVar) {
        this.clientType_ = yVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmahaChannel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.omahaChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmahaChannelBytes(com.google.v.v vVar) {
        this.omahaChannel_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "clientType_", i.f3788f, "buildVersion_", "buildType_", "omahaChannel_"});
        }
        if (iOrdinal == 3) {
            return new z();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<z> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (z.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBuildType() {
        return this.buildType_;
    }

    public com.google.v.v getBuildTypeBytes() {
        return com.google.v.v.s(this.buildType_);
    }

    public String getBuildVersion() {
        return this.buildVersion_;
    }

    public com.google.v.v getBuildVersionBytes() {
        return com.google.v.v.s(this.buildVersion_);
    }

    public y getClientType() {
        y yVarA = y.a(this.clientType_);
        return yVarA == null ? y.DESKTOP_SERVICES_CLIENT_TYPE_UNSPECIFIED : yVarA;
    }

    public String getOmahaChannel() {
        return this.omahaChannel_;
    }

    public com.google.v.v getOmahaChannelBytes() {
        return com.google.v.v.s(this.omahaChannel_);
    }

    public boolean hasBuildType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBuildVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasClientType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOmahaChannel() {
        return (this.bitField0_ & 8) != 0;
    }

    public static x newBuilder(z zVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(zVar);
    }

    public static z parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static z parseFrom(InputStream inputStream) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.v vVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static z parseFrom(byte[] bArr) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static z parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
