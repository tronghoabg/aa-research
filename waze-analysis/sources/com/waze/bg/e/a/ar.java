package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar extends com.google.v.du<ar, an> implements com.google.v.fj {
    private static final ar DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ar> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        ar arVar = new ar();
        DEFAULT_INSTANCE = arVar;
        com.google.v.du.registerDefaultInstance(ar.class, arVar);
    }

    private ar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        if (this.resultCase_ == 2) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        if (this.resultCase_ == 1) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    public static ar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeError(Cdo cdo) {
        Objects.requireNonNull(cdo);
        if (this.resultCase_ == 2 && this.result_ != Cdo.getDefaultInstance()) {
            dg dgVarNewBuilder = Cdo.newBuilder((Cdo) this.result_);
            dgVarNewBuilder.mergeFrom((dg) cdo);
            cdo = dgVarNewBuilder.buildPartial();
        }
        this.result_ = cdo;
        this.resultCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuccess(aq aqVar) {
        Objects.requireNonNull(aqVar);
        if (this.resultCase_ == 1 && this.result_ != aq.getDefaultInstance()) {
            ap apVarNewBuilder = aq.newBuilder((aq) this.result_);
            apVarNewBuilder.mergeFrom((ap) aqVar);
            aqVar = apVarNewBuilder.buildPartial();
        }
        this.result_ = aqVar;
        this.resultCase_ = 1;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ar parseDelimitedFrom(InputStream inputStream) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(com.google.v.v vVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(Cdo cdo) {
        Objects.requireNonNull(cdo);
        this.result_ = cdo;
        this.resultCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.result_ = aqVar;
        this.resultCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", aq.class, Cdo.class});
        }
        if (iOrdinal == 3) {
            return new ar();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ar> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ar.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public Cdo getError() {
        return this.resultCase_ == 2 ? (Cdo) this.result_ : Cdo.getDefaultInstance();
    }

    public ao getResultCase() {
        int i2 = this.resultCase_;
        if (i2 == 0) {
            return ao.f16619c;
        }
        if (i2 == 1) {
            return ao.f16617a;
        }
        if (i2 != 2) {
            return null;
        }
        return ao.f16618b;
    }

    public aq getSuccess() {
        return this.resultCase_ == 1 ? (aq) this.result_ : aq.getDefaultInstance();
    }

    public boolean hasError() {
        return this.resultCase_ == 2;
    }

    public boolean hasSuccess() {
        return this.resultCase_ == 1;
    }

    public static an newBuilder(ar arVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(arVar);
    }

    public static ar parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ar parseFrom(com.google.v.z zVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ar parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ar parseFrom(InputStream inputStream) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ar parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ar parseFrom(ByteBuffer byteBuffer) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ar parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ar parseFrom(byte[] bArr) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ar parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ar) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
