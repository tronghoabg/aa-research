package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.google.v.du<h, c> implements com.google.v.fj {
    private static final h DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<h> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.v.du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
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

    public static h getDefaultInstance() {
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
    public void mergeSuccess(g gVar) {
        Objects.requireNonNull(gVar);
        if (this.resultCase_ == 1 && this.result_ != g.getDefaultInstance()) {
            e eVarNewBuilder = g.newBuilder((g) this.result_);
            eVarNewBuilder.mergeFrom((e) gVar);
            gVar = eVarNewBuilder.buildPartial();
        }
        this.result_ = gVar;
        this.resultCase_ = 1;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(com.google.v.v vVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(Cdo cdo) {
        Objects.requireNonNull(cdo);
        this.result_ = cdo;
        this.resultCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(g gVar) {
        Objects.requireNonNull(gVar);
        this.result_ = gVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"result_", "resultCase_", g.class, Cdo.class});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
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

    public d getResultCase() {
        int i2 = this.resultCase_;
        if (i2 == 0) {
            return d.f16664c;
        }
        if (i2 == 1) {
            return d.f16662a;
        }
        if (i2 != 2) {
            return null;
        }
        return d.f16663b;
    }

    public g getSuccess() {
        return this.resultCase_ == 1 ? (g) this.result_ : g.getDefaultInstance();
    }

    public boolean hasError() {
        return this.resultCase_ == 2;
    }

    public boolean hasSuccess() {
        return this.resultCase_ == 1;
    }

    public static c newBuilder(h hVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(com.google.v.z zVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
