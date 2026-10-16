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
public final class de extends du<de, dd> implements fj {
    public static final int BUILD_LABEL_FIELD_NUMBER = 1;
    private static final de DEFAULT_INSTANCE;
    public static final int DEPLOYMENT_TYPE_FIELD_NUMBER = 2;
    public static final int ENVIRONMENT_FIELD_NUMBER = 3;
    public static final int GAMELET_ID_FIELD_NUMBER = 6;
    public static final int LOCATION_FIELD_NUMBER = 4;
    public static final int MACHINE_FIELD_NUMBER = 5;
    public static final int MACHINE_SHAPE_FIELD_NUMBER = 7;
    public static final int METRO_FIELD_NUMBER = 8;
    private static volatile fo<de> PARSER = null;
    public static final int RELEASE_STAGE_FIELD_NUMBER = 10;
    public static final int VM_PURPOSE_FIELD_NUMBER = 9;
    private int bitField0_;
    private String buildLabel_ = "";
    private String deploymentType_ = "";
    private String environment_ = "";
    private String location_ = "";
    private String machine_ = "";
    private String gameletId_ = "";
    private String machineShape_ = "";
    private String metro_ = "";
    private String vmPurpose_ = "";
    private String releaseStage_ = "";

    static {
        de deVar = new de();
        DEFAULT_INSTANCE = deVar;
        du.registerDefaultInstance(de.class, deVar);
    }

    private de() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildLabel() {
        this.bitField0_ &= -2;
        this.buildLabel_ = getDefaultInstance().getBuildLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeploymentType() {
        this.bitField0_ &= -3;
        this.deploymentType_ = getDefaultInstance().getDeploymentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnvironment() {
        this.bitField0_ &= -5;
        this.environment_ = getDefaultInstance().getEnvironment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameletId() {
        this.bitField0_ &= -33;
        this.gameletId_ = getDefaultInstance().getGameletId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.bitField0_ &= -9;
        this.location_ = getDefaultInstance().getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMachine() {
        this.bitField0_ &= -17;
        this.machine_ = getDefaultInstance().getMachine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMachineShape() {
        this.bitField0_ &= -65;
        this.machineShape_ = getDefaultInstance().getMachineShape();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetro() {
        this.bitField0_ &= -129;
        this.metro_ = getDefaultInstance().getMetro();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReleaseStage() {
        this.bitField0_ &= -513;
        this.releaseStage_ = getDefaultInstance().getReleaseStage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVmPurpose() {
        this.bitField0_ &= -257;
        this.vmPurpose_ = getDefaultInstance().getVmPurpose();
    }

    public static de getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dd newBuilder() {
        return (dd) DEFAULT_INSTANCE.createBuilder();
    }

    public static de parseDelimitedFrom(InputStream inputStream) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(com.google.v.v vVar) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<de> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.buildLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildLabelBytes(com.google.v.v vVar) {
        this.buildLabel_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeploymentType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.deploymentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeploymentTypeBytes(com.google.v.v vVar) {
        this.deploymentType_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.environment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnvironmentBytes(com.google.v.v vVar) {
        this.environment_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameletId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.gameletId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameletIdBytes(com.google.v.v vVar) {
        this.gameletId_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationBytes(com.google.v.v vVar) {
        this.location_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMachine(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.machine_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMachineBytes(com.google.v.v vVar) {
        this.machine_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMachineShape(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.machineShape_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMachineShapeBytes(com.google.v.v vVar) {
        this.machineShape_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetro(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.metro_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetroBytes(com.google.v.v vVar) {
        this.metro_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseStage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.releaseStage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseStageBytes(com.google.v.v vVar) {
        this.releaseStage_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVmPurpose(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.vmPurpose_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVmPurposeBytes(com.google.v.v vVar) {
        this.vmPurpose_ = vVar.u();
        this.bitField0_ |= 256;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "buildLabel_", "deploymentType_", "environment_", "location_", "machine_", "gameletId_", "machineShape_", "metro_", "vmPurpose_", "releaseStage_"});
        }
        if (iOrdinal == 3) {
            return new de();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<de> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (de.class) {
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

    public String getDeploymentType() {
        return this.deploymentType_;
    }

    public com.google.v.v getDeploymentTypeBytes() {
        return com.google.v.v.s(this.deploymentType_);
    }

    public String getEnvironment() {
        return this.environment_;
    }

    public com.google.v.v getEnvironmentBytes() {
        return com.google.v.v.s(this.environment_);
    }

    public String getGameletId() {
        return this.gameletId_;
    }

    public com.google.v.v getGameletIdBytes() {
        return com.google.v.v.s(this.gameletId_);
    }

    public String getLocation() {
        return this.location_;
    }

    public com.google.v.v getLocationBytes() {
        return com.google.v.v.s(this.location_);
    }

    public String getMachine() {
        return this.machine_;
    }

    public com.google.v.v getMachineBytes() {
        return com.google.v.v.s(this.machine_);
    }

    public String getMachineShape() {
        return this.machineShape_;
    }

    public com.google.v.v getMachineShapeBytes() {
        return com.google.v.v.s(this.machineShape_);
    }

    public String getMetro() {
        return this.metro_;
    }

    public com.google.v.v getMetroBytes() {
        return com.google.v.v.s(this.metro_);
    }

    public String getReleaseStage() {
        return this.releaseStage_;
    }

    public com.google.v.v getReleaseStageBytes() {
        return com.google.v.v.s(this.releaseStage_);
    }

    public String getVmPurpose() {
        return this.vmPurpose_;
    }

    public com.google.v.v getVmPurposeBytes() {
        return com.google.v.v.s(this.vmPurpose_);
    }

    public boolean hasBuildLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeploymentType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEnvironment() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGameletId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMachine() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMachineShape() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasMetro() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasReleaseStage() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasVmPurpose() {
        return (this.bitField0_ & 256) != 0;
    }

    public static dd newBuilder(de deVar) {
        return (dd) DEFAULT_INSTANCE.createBuilder(deVar);
    }

    public static de parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static de parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static de parseFrom(com.google.v.z zVar) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static de parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static de parseFrom(InputStream inputStream) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static de parseFrom(ByteBuffer byteBuffer) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static de parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static de parseFrom(byte[] bArr) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static de parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (de) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
