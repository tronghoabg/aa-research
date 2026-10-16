package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends com.google.v.du<x, t> implements com.google.v.fj {
    private static final x DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<x> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        com.google.v.du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
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

    public static x getDefaultInstance() {
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
    public void mergeSuccess(w wVar) {
        Objects.requireNonNull(wVar);
        if (this.resultCase_ == 1 && this.result_ != w.getDefaultInstance()) {
            v vVarNewBuilder = w.newBuilder((w) this.result_);
            vVarNewBuilder.mergeFrom((v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.result_ = wVar;
        this.resultCase_ = 1;
    }

    public static t newBuilder() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(Cdo cdo) {
        Objects.requireNonNull(cdo);
        this.result_ = cdo;
        this.resultCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(w wVar) {
        Objects.requireNonNull(wVar);
        this.result_ = wVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", w.class, Cdo.class});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new t(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
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

    public u getResultCase() {
        int i2 = this.resultCase_;
        if (i2 == 0) {
            return u.f16738c;
        }
        if (i2 == 1) {
            return u.f16736a;
        }
        if (i2 != 2) {
            return null;
        }
        return u.f16737b;
    }

    public w getSuccess() {
        return this.resultCase_ == 1 ? (w) this.result_ : w.getDefaultInstance();
    }

    public boolean hasError() {
        return this.resultCase_ == 2;
    }

    public boolean hasSuccess() {
        return this.resultCase_ == 1;
    }

    public static t newBuilder(x xVar) {
        return (t) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
