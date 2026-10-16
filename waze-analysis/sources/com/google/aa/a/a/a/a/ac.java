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
public final class ac extends du<ac, aa> implements fj {
    public static final int BUILD_VERSION_FIELD_NUMBER = 1;
    private static final ac DEFAULT_INSTANCE;
    public static final int DRIVE_DESKTOP_CLIENT_TYPE_FIELD_NUMBER = 2;
    private static volatile fo<ac> PARSER;
    private int bitField0_;
    private String buildVersion_ = "";
    private int driveDesktopClientType_;

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        du.registerDefaultInstance(ac.class, acVar);
    }

    private ac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildVersion() {
        this.bitField0_ &= -2;
        this.buildVersion_ = getDefaultInstance().getBuildVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveDesktopClientType() {
        this.bitField0_ &= -3;
        this.driveDesktopClientType_ = 0;
    }

    public static ac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aa newBuilder() {
        return (aa) DEFAULT_INSTANCE.createBuilder();
    }

    public static ac parseDelimitedFrom(InputStream inputStream) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(com.google.v.v vVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.buildVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildVersionBytes(com.google.v.v vVar) {
        this.buildVersion_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveDesktopClientType(ab abVar) {
        this.driveDesktopClientType_ = abVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "buildVersion_", "driveDesktopClientType_", i.f3789g});
        }
        if (iOrdinal == 3) {
            return new ac();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ac> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ac.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBuildVersion() {
        return this.buildVersion_;
    }

    public com.google.v.v getBuildVersionBytes() {
        return com.google.v.v.s(this.buildVersion_);
    }

    public ab getDriveDesktopClientType() {
        ab abVarA = ab.a(this.driveDesktopClientType_);
        return abVarA == null ? ab.CLIENT_UNKNOWN : abVarA;
    }

    public boolean hasBuildVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDriveDesktopClientType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static aa newBuilder(ac acVar) {
        return (aa) DEFAULT_INSTANCE.createBuilder(acVar);
    }

    public static ac parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ac parseFrom(com.google.v.z zVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ac parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ac parseFrom(InputStream inputStream) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(ByteBuffer byteBuffer) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ac parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ac parseFrom(byte[] bArr) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ac parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
