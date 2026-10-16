package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mc extends com.google.v.du<mc, lz> implements md {
    private static final mc DEFAULT_INSTANCE;
    public static final int END_AS_OF_DATE_FIELD_NUMBER = 4;
    public static final int END_DATE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<mc> PARSER = null;
    public static final int START_AS_OF_DATE_FIELD_NUMBER = 3;
    public static final int START_DATE_FIELD_NUMBER = 1;
    private Object end_;
    private Object start_;
    private int startCase_ = 0;
    private int endCase_ = 0;

    static {
        mc mcVar = new mc();
        DEFAULT_INSTANCE = mcVar;
        com.google.v.du.registerDefaultInstance(mc.class, mcVar);
    }

    private mc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.endCase_ = 0;
        this.end_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndAsOfDate() {
        if (this.endCase_ == 4) {
            this.endCase_ = 0;
            this.end_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndDate() {
        if (this.endCase_ == 2) {
            this.endCase_ = 0;
            this.end_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.startCase_ = 0;
        this.start_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartAsOfDate() {
        if (this.startCase_ == 3) {
            this.startCase_ = 0;
            this.start_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartDate() {
        if (this.startCase_ == 1) {
            this.startCase_ = 0;
            this.start_ = null;
        }
    }

    public static mc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndAsOfDate(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        if (this.endCase_ == 4 && this.end_ != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder((com.google.k.a.a.b.au) this.end_);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.end_ = auVar;
        this.endCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndDate(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        if (this.endCase_ == 2 && this.end_ != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder((com.google.k.a.a.b.au) this.end_);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.end_ = auVar;
        this.endCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartAsOfDate(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        if (this.startCase_ == 3 && this.start_ != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder((com.google.k.a.a.b.au) this.start_);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.start_ = auVar;
        this.startCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartDate(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        if (this.startCase_ == 1 && this.start_ != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder((com.google.k.a.a.b.au) this.start_);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.start_ = auVar;
        this.startCase_ = 1;
    }

    public static lz newBuilder() {
        return (lz) DEFAULT_INSTANCE.createBuilder();
    }

    public static mc parseDelimitedFrom(InputStream inputStream) {
        return (mc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mc parseFrom(com.google.v.v vVar) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndAsOfDate(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.end_ = auVar;
        this.endCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndDate(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.end_ = auVar;
        this.endCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartAsOfDate(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.start_ = auVar;
        this.startCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartDate(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.start_ = auVar;
        this.startCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0001\u0003<\u0000\u0004<\u0001", new Object[]{"start_", "startCase_", "end_", "endCase_", com.google.k.a.a.b.au.class, com.google.k.a.a.b.au.class, com.google.k.a.a.b.au.class, com.google.k.a.a.b.au.class});
        }
        if (iOrdinal == 3) {
            return new mc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<mc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (mc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.k.a.a.b.au getEndAsOfDate() {
        return this.endCase_ == 4 ? (com.google.k.a.a.b.au) this.end_ : com.google.k.a.a.b.au.getDefaultInstance();
    }

    public ma getEndCase() {
        int i2 = this.endCase_;
        if (i2 == 0) {
            return ma.f12105c;
        }
        if (i2 == 2) {
            return ma.f12103a;
        }
        if (i2 != 4) {
            return null;
        }
        return ma.f12104b;
    }

    public com.google.k.a.a.b.au getEndDate() {
        return this.endCase_ == 2 ? (com.google.k.a.a.b.au) this.end_ : com.google.k.a.a.b.au.getDefaultInstance();
    }

    public com.google.k.a.a.b.au getStartAsOfDate() {
        return this.startCase_ == 3 ? (com.google.k.a.a.b.au) this.start_ : com.google.k.a.a.b.au.getDefaultInstance();
    }

    public mb getStartCase() {
        int i2 = this.startCase_;
        if (i2 == 0) {
            return mb.f12109c;
        }
        if (i2 == 1) {
            return mb.f12107a;
        }
        if (i2 != 3) {
            return null;
        }
        return mb.f12108b;
    }

    public com.google.k.a.a.b.au getStartDate() {
        return this.startCase_ == 1 ? (com.google.k.a.a.b.au) this.start_ : com.google.k.a.a.b.au.getDefaultInstance();
    }

    public boolean hasEndAsOfDate() {
        return this.endCase_ == 4;
    }

    public boolean hasEndDate() {
        return this.endCase_ == 2;
    }

    public boolean hasStartAsOfDate() {
        return this.startCase_ == 3;
    }

    public boolean hasStartDate() {
        return this.startCase_ == 1;
    }

    public static lz newBuilder(mc mcVar) {
        return (lz) DEFAULT_INSTANCE.createBuilder(mcVar);
    }

    public static mc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mc parseFrom(com.google.v.z zVar) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mc parseFrom(InputStream inputStream) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mc parseFrom(ByteBuffer byteBuffer) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mc parseFrom(byte[] bArr) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
