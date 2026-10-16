package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cf extends com.google.v.du<cf, ca> implements com.google.v.fj {
    public static final int BEZIER_PARAMS_FIELD_NUMBER = 2;
    public static final int CIRCLE_PARAMS_FIELD_NUMBER = 3;
    private static final cf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cf> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int paramsCase_ = 0;
    private Object params_;
    private int type_;

    static {
        cf cfVar = new cf();
        DEFAULT_INSTANCE = cfVar;
        com.google.v.du.registerDefaultInstance(cf.class, cfVar);
    }

    private cf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBezierParams() {
        if (this.paramsCase_ == 2) {
            this.paramsCase_ = 0;
            this.params_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCircleParams() {
        if (this.paramsCase_ == 3) {
            this.paramsCase_ = 0;
            this.params_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.paramsCase_ = 0;
        this.params_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static cf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBezierParams(bz bzVar) {
        Objects.requireNonNull(bzVar);
        if (this.paramsCase_ == 2 && this.params_ != bz.getDefaultInstance()) {
            bv bvVarNewBuilder = bz.newBuilder((bz) this.params_);
            bvVarNewBuilder.mergeFrom((bv) bzVar);
            bzVar = bvVarNewBuilder.buildPartial();
        }
        this.params_ = bzVar;
        this.paramsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCircleParams(cc ccVar) {
        Objects.requireNonNull(ccVar);
        if (this.paramsCase_ == 3 && this.params_ != cc.getDefaultInstance()) {
            cb cbVarNewBuilder = cc.newBuilder((cc) this.params_);
            cbVarNewBuilder.mergeFrom((cb) ccVar);
            ccVar = cbVarNewBuilder.buildPartial();
        }
        this.params_ = ccVar;
        this.paramsCase_ = 3;
    }

    public static ca newBuilder() {
        return (ca) DEFAULT_INSTANCE.createBuilder();
    }

    public static cf parseDelimitedFrom(InputStream inputStream) {
        return (cf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cf parseFrom(com.google.v.v vVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBezierParams(bz bzVar) {
        Objects.requireNonNull(bzVar);
        this.params_ = bzVar;
        this.paramsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCircleParams(cc ccVar) {
        Objects.requireNonNull(ccVar);
        this.params_ = ccVar;
        this.paramsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(cd cdVar) {
        this.type_ = cdVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"params_", "paramsCase_", "bitField0_", "type_", h.f11878g, bz.class, cc.class});
        }
        if (iOrdinal == 3) {
            return new cf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ca(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bz getBezierParams() {
        return this.paramsCase_ == 2 ? (bz) this.params_ : bz.getDefaultInstance();
    }

    public cc getCircleParams() {
        return this.paramsCase_ == 3 ? (cc) this.params_ : cc.getDefaultInstance();
    }

    public ce getParamsCase() {
        int i2 = this.paramsCase_;
        if (i2 == 0) {
            return ce.f11748c;
        }
        if (i2 == 2) {
            return ce.f11746a;
        }
        if (i2 != 3) {
            return null;
        }
        return ce.f11747b;
    }

    public cd getType() {
        cd cdVarA = cd.a(this.type_);
        return cdVarA == null ? cd.UNSPECIFIED : cdVarA;
    }

    public boolean hasBezierParams() {
        return this.paramsCase_ == 2;
    }

    public boolean hasCircleParams() {
        return this.paramsCase_ == 3;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ca newBuilder(cf cfVar) {
        return (ca) DEFAULT_INSTANCE.createBuilder(cfVar);
    }

    public static cf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cf parseFrom(com.google.v.z zVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cf parseFrom(InputStream inputStream) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cf parseFrom(ByteBuffer byteBuffer) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cf parseFrom(byte[] bArr) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
