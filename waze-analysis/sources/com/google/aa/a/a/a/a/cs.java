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
public final class cs extends du<cs, cn> implements fj {
    public static final int BUILD_VERSION_FIELD_NUMBER = 1;
    public static final int CPU_ARCHITECTURE_FIELD_NUMBER = 4;
    public static final int D3D_FEATURE_LEVEL_FIELD_NUMBER = 5;
    private static final cs DEFAULT_INSTANCE;
    public static final int HAS_PACKAGE_IDENTITY_FIELD_NUMBER = 7;
    public static final int NETWORK_ENVIRONMENT_FIELD_NUMBER = 3;
    public static final int OS_VERSION_FIELD_NUMBER = 2;
    private static volatile fo<cs> PARSER = null;
    public static final int WEBVIEW2_VERSION_FIELD_NUMBER = 6;
    private int bitField0_;
    private String buildVersion_ = "";
    private int cpuArchitecture_;
    private int d3DFeatureLevel_;
    private boolean hasPackageIdentity_;
    private int networkEnvironment_;
    private cp osVersion_;
    private cr webview2Version_;

    static {
        cs csVar = new cs();
        DEFAULT_INSTANCE = csVar;
        du.registerDefaultInstance(cs.class, csVar);
    }

    private cs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildVersion() {
        this.bitField0_ &= -2;
        this.buildVersion_ = getDefaultInstance().getBuildVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuArchitecture() {
        this.bitField0_ &= -9;
        this.cpuArchitecture_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearD3DFeatureLevel() {
        this.bitField0_ &= -17;
        this.d3DFeatureLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasPackageIdentity() {
        this.bitField0_ &= -65;
        this.hasPackageIdentity_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkEnvironment() {
        this.bitField0_ &= -5;
        this.networkEnvironment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebview2Version() {
        this.webview2Version_ = null;
        this.bitField0_ &= -33;
    }

    public static cs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOsVersion(cp cpVar) {
        Objects.requireNonNull(cpVar);
        cp cpVar2 = this.osVersion_;
        if (cpVar2 != null && cpVar2 != cp.getDefaultInstance()) {
            co coVarNewBuilder = cp.newBuilder(cpVar2);
            coVarNewBuilder.mergeFrom((co) cpVar);
            cpVar = coVarNewBuilder.buildPartial();
        }
        this.osVersion_ = cpVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebview2Version(cr crVar) {
        Objects.requireNonNull(crVar);
        cr crVar2 = this.webview2Version_;
        if (crVar2 != null && crVar2 != cr.getDefaultInstance()) {
            cq cqVarNewBuilder = cr.newBuilder(crVar2);
            cqVarNewBuilder.mergeFrom((cq) crVar);
            crVar = cqVarNewBuilder.buildPartial();
        }
        this.webview2Version_ = crVar;
        this.bitField0_ |= 32;
    }

    public static cn newBuilder() {
        return (cn) DEFAULT_INSTANCE.createBuilder();
    }

    public static cs parseDelimitedFrom(InputStream inputStream) {
        return (cs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cs parseFrom(com.google.v.v vVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cs> parser() {
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
    public void setCpuArchitecture(com.google.w.t.a aVar) {
        this.cpuArchitecture_ = aVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setD3DFeatureLevel(com.google.w.t.c cVar) {
        this.d3DFeatureLevel_ = cVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasPackageIdentity(boolean z) {
        this.bitField0_ |= 64;
        this.hasPackageIdentity_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkEnvironment(com.google.w.t.d dVar) {
        this.networkEnvironment_ = dVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(cp cpVar) {
        Objects.requireNonNull(cpVar);
        this.osVersion_ = cpVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebview2Version(cr crVar) {
        Objects.requireNonNull(crVar);
        this.webview2Version_ = crVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ဇ\u0006", new Object[]{"bitField0_", "buildVersion_", "osVersion_", "networkEnvironment_", com.google.w.t.d.a(), "cpuArchitecture_", com.google.w.t.a.a(), "d3DFeatureLevel_", com.google.w.t.c.a(), "webview2Version_", "hasPackageIdentity_"});
        }
        if (iOrdinal == 3) {
            return new cs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cs.class) {
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

    public com.google.w.t.a getCpuArchitecture() {
        com.google.w.t.a aVarB = com.google.w.t.a.b(this.cpuArchitecture_);
        return aVarB == null ? com.google.w.t.a.CPU_ARCHITECTURE_UNKNOWN : aVarB;
    }

    public com.google.w.t.c getD3DFeatureLevel() {
        com.google.w.t.c cVarB = com.google.w.t.c.b(this.d3DFeatureLevel_);
        return cVarB == null ? com.google.w.t.c.D3D_FEATURE_LEVEL_UNKNOWN : cVarB;
    }

    public boolean getHasPackageIdentity() {
        return this.hasPackageIdentity_;
    }

    public com.google.w.t.d getNetworkEnvironment() {
        com.google.w.t.d dVarB = com.google.w.t.d.b(this.networkEnvironment_);
        return dVarB == null ? com.google.w.t.d.NETWORK_ENVIRONMENT_UNKNOWN : dVarB;
    }

    public cp getOsVersion() {
        cp cpVar = this.osVersion_;
        return cpVar == null ? cp.getDefaultInstance() : cpVar;
    }

    public cr getWebview2Version() {
        cr crVar = this.webview2Version_;
        return crVar == null ? cr.getDefaultInstance() : crVar;
    }

    public boolean hasBuildVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCpuArchitecture() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasD3DFeatureLevel() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHasPackageIdentity() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasNetworkEnvironment() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOsVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWebview2Version() {
        return (this.bitField0_ & 32) != 0;
    }

    public static cn newBuilder(cs csVar) {
        return (cn) DEFAULT_INSTANCE.createBuilder(csVar);
    }

    public static cs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cs parseFrom(com.google.v.z zVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cs parseFrom(InputStream inputStream) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cs parseFrom(ByteBuffer byteBuffer) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cs parseFrom(byte[] bArr) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
