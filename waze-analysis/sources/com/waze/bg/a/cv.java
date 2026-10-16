package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cv extends com.google.v.du<cv, cu> implements fj {
    private static final cv DEFAULT_INSTANCE;
    private static volatile fo<cv> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        cv cvVar = new cv();
        DEFAULT_INSTANCE = cvVar;
        com.google.v.du.registerDefaultInstance(cv.class, cvVar);
    }

    private cv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static cv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cu newBuilder() {
        return (cu) DEFAULT_INSTANCE.createBuilder();
    }

    public static cv parseDelimitedFrom(InputStream inputStream) {
        return (cv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cv parseFrom(com.google.v.v vVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bv bvVar) {
        this.type_ = bvVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.p});
        }
        if (iOrdinal == 3) {
            return new cv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bv getType() {
        bv bvVarB = bv.b(this.type_);
        return bvVarB == null ? bv.PERSONAL_SAFETY_UNSPECIFIED : bvVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cu newBuilder(cv cvVar) {
        return (cu) DEFAULT_INSTANCE.createBuilder(cvVar);
    }

    public static cv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cv parseFrom(com.google.v.z zVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cv parseFrom(InputStream inputStream) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cv parseFrom(ByteBuffer byteBuffer) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cv parseFrom(byte[] bArr) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
