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
public final class cl extends com.google.v.du<cl, ck> implements fj {
    public static final int CAMERA_DETECTION_TYPES_FIELD_NUMBER = 2;
    private static final cl DEFAULT_INSTANCE;
    private static volatile fo<cl> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final el<cb> cameraDetectionTypes_converter_ = new n(2);
    private int bitField0_;
    private ek cameraDetectionTypes_ = emptyIntList();
    private int type_;

    static {
        cl clVar = new cl();
        DEFAULT_INSTANCE = clVar;
        com.google.v.du.registerDefaultInstance(cl.class, clVar);
    }

    private cl() {
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

    public static cl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ck newBuilder() {
        return (ck) DEFAULT_INSTANCE.createBuilder();
    }

    public static cl parseDelimitedFrom(InputStream inputStream) {
        return (cl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cl parseFrom(com.google.v.v vVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cl> parser() {
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
            return new cl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ck(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cl.class) {
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

    public static ck newBuilder(cl clVar) {
        return (ck) DEFAULT_INSTANCE.createBuilder(clVar);
    }

    public static cl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cl parseFrom(com.google.v.z zVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cl parseFrom(InputStream inputStream) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cl parseFrom(ByteBuffer byteBuffer) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cl parseFrom(byte[] bArr) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
