package com.waze.bg.a;

import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dm extends com.google.v.du<dm, dl> implements fj {
    public static final int CAMERA_DETECTION_TYPES_FIELD_NUMBER = 2;
    private static final dm DEFAULT_INSTANCE;
    private static volatile fo<dm> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final el<cb> cameraDetectionTypes_converter_ = new n(3);
    private int bitField0_;
    private ek cameraDetectionTypes_ = emptyIntList();
    private int type_;

    static {
        dm dmVar = new dm();
        DEFAULT_INSTANCE = dmVar;
        com.google.v.du.registerDefaultInstance(dm.class, dmVar);
    }

    private dm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCameraDetectionTypes(Iterable<? extends cb> iterable) {
        ensureCameraDetectionTypesIsMutable();
        Iterator<? extends cb> it = iterable.iterator();
        while (it.hasNext()) {
            this.cameraDetectionTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCameraDetectionTypes(cb cbVar) {
        Objects.requireNonNull(cbVar);
        ensureCameraDetectionTypesIsMutable();
        this.cameraDetectionTypes_.i(cbVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCameraDetectionTypes() {
        this.cameraDetectionTypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    private void ensureCameraDetectionTypesIsMutable() {
        ek ekVar = this.cameraDetectionTypes_;
        if (ekVar.c()) {
            return;
        }
        this.cameraDetectionTypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static dm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dl newBuilder() {
        return (dl) DEFAULT_INSTANCE.createBuilder();
    }

    public static dm parseDelimitedFrom(InputStream inputStream) {
        return (dm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dm parseFrom(com.google.v.v vVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCameraDetectionTypes(int i2, cb cbVar) {
        Objects.requireNonNull(cbVar);
        ensureCameraDetectionTypesIsMutable();
        this.cameraDetectionTypes_.e(i2, cbVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bp bpVar) {
        this.type_ = bpVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002ࠞ", new Object[]{"bitField0_", "type_", o.f16564j, "cameraDetectionTypes_", cc.f16510b});
        }
        if (iOrdinal == 3) {
            return new dm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cb getCameraDetectionTypes(int i2) {
        cb cbVarA = cb.a(this.cameraDetectionTypes_.d(i2));
        return cbVarA == null ? cb.CAMERA_TYPE_UNSPECIFIED : cbVarA;
    }

    public int getCameraDetectionTypesCount() {
        return this.cameraDetectionTypes_.size();
    }

    public List<cb> getCameraDetectionTypesList() {
        return new em(this.cameraDetectionTypes_, cameraDetectionTypes_converter_);
    }

    public bp getType() {
        bp bpVarA = bp.a(this.type_);
        return bpVarA == null ? bp.ALERT_CAMERA_UNSPECIFIED : bpVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dl newBuilder(dm dmVar) {
        return (dl) DEFAULT_INSTANCE.createBuilder(dmVar);
    }

    public static dm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dm parseFrom(com.google.v.z zVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dm parseFrom(InputStream inputStream) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dm parseFrom(ByteBuffer byteBuffer) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dm parseFrom(byte[] bArr) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
