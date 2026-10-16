package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cp extends du<cp, co> implements fj {
    public static final int BUILD_NUMBER_FIELD_NUMBER = 3;
    private static final cp DEFAULT_INSTANCE;
    public static final int MAJOR_VERSION_FIELD_NUMBER = 1;
    public static final int MINOR_VERSION_FIELD_NUMBER = 2;
    private static volatile fo<cp> PARSER = null;
    public static final int PRODUCT_TYPE_FIELD_NUMBER = 4;
    public static final int WINDOWS_EDITION_FIELD_NUMBER = 5;
    private int bitField0_;
    private int buildNumber_;
    private int majorVersion_;
    private int minorVersion_;
    private int productType_;
    private int windowsEdition_;

    static {
        cp cpVar = new cp();
        DEFAULT_INSTANCE = cpVar;
        du.registerDefaultInstance(cp.class, cpVar);
    }

    private cp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildNumber() {
        this.bitField0_ &= -5;
        this.buildNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMajorVersion() {
        this.bitField0_ &= -2;
        this.majorVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinorVersion() {
        this.bitField0_ &= -3;
        this.minorVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductType() {
        this.bitField0_ &= -9;
        this.productType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWindowsEdition() {
        this.bitField0_ &= -17;
        this.windowsEdition_ = 0;
    }

    public static cp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static co newBuilder() {
        return (co) DEFAULT_INSTANCE.createBuilder();
    }

    public static cp parseDelimitedFrom(InputStream inputStream) {
        return (cp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cp parseFrom(com.google.v.v vVar) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildNumber(int i2) {
        this.bitField0_ |= 4;
        this.buildNumber_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMajorVersion(int i2) {
        this.bitField0_ |= 1;
        this.majorVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinorVersion(int i2) {
        this.bitField0_ |= 2;
        this.minorVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductType(int i2) {
        this.bitField0_ |= 8;
        this.productType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWindowsEdition(com.google.w.t.e eVar) {
        this.windowsEdition_ = eVar.getNumber();
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "majorVersion_", "minorVersion_", "buildNumber_", "productType_", "windowsEdition_", com.google.w.t.e.a()});
        }
        if (iOrdinal == 3) {
            return new cp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new co(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getBuildNumber() {
        return this.buildNumber_;
    }

    public int getMajorVersion() {
        return this.majorVersion_;
    }

    public int getMinorVersion() {
        return this.minorVersion_;
    }

    public int getProductType() {
        return this.productType_;
    }

    public com.google.w.t.e getWindowsEdition() {
        com.google.w.t.e eVarB = com.google.w.t.e.b(this.windowsEdition_);
        return eVarB == null ? com.google.w.t.e.WINDOWS_EDITION_UNKNOWN : eVarB;
    }

    public boolean hasBuildNumber() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMajorVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMinorVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProductType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasWindowsEdition() {
        return (this.bitField0_ & 16) != 0;
    }

    public static co newBuilder(cp cpVar) {
        return (co) DEFAULT_INSTANCE.createBuilder(cpVar);
    }

    public static cp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cp parseFrom(com.google.v.z zVar) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cp parseFrom(InputStream inputStream) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cp parseFrom(ByteBuffer byteBuffer) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cp parseFrom(byte[] bArr) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cp) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
