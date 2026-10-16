package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* renamed from: com.waze.bg.e.a.do, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cdo extends com.google.v.du<Cdo, dg> implements com.google.v.fj {
    private static final Cdo DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<Cdo> PARSER = null;
    public static final int RETRY_FIELD_NUMBER = 1;
    public static final int UNRECOVERABLE_ERROR_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object clientAction_;
    private int clientActionCase_ = 0;
    private String description_ = "";

    static {
        Cdo cdo = new Cdo();
        DEFAULT_INSTANCE = cdo;
        com.google.v.du.registerDefaultInstance(Cdo.class, cdo);
    }

    private Cdo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientAction() {
        this.clientActionCase_ = 0;
        this.clientAction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -2;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayErrorMessage() {
        if (this.clientActionCase_ == 2) {
            this.clientActionCase_ = 0;
            this.clientAction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetry() {
        if (this.clientActionCase_ == 1) {
            this.clientActionCase_ = 0;
            this.clientAction_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnrecoverableError() {
        if (this.clientActionCase_ == 4) {
            this.clientActionCase_ = 0;
            this.clientAction_ = null;
        }
    }

    public static Cdo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayErrorMessage(dj djVar) {
        Objects.requireNonNull(djVar);
        if (this.clientActionCase_ == 2 && this.clientAction_ != dj.getDefaultInstance()) {
            di diVarNewBuilder = dj.newBuilder((dj) this.clientAction_);
            diVarNewBuilder.mergeFrom((di) djVar);
            djVar = diVarNewBuilder.buildPartial();
        }
        this.clientAction_ = djVar;
        this.clientActionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRetry(dl dlVar) {
        Objects.requireNonNull(dlVar);
        if (this.clientActionCase_ == 1 && this.clientAction_ != dl.getDefaultInstance()) {
            dk dkVarNewBuilder = dl.newBuilder((dl) this.clientAction_);
            dkVarNewBuilder.mergeFrom((dk) dlVar);
            dlVar = dkVarNewBuilder.buildPartial();
        }
        this.clientAction_ = dlVar;
        this.clientActionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnrecoverableError(dn dnVar) {
        Objects.requireNonNull(dnVar);
        if (this.clientActionCase_ == 4 && this.clientAction_ != dn.getDefaultInstance()) {
            dm dmVarNewBuilder = dn.newBuilder((dn) this.clientAction_);
            dmVarNewBuilder.mergeFrom((dm) dnVar);
            dnVar = dmVarNewBuilder.buildPartial();
        }
        this.clientAction_ = dnVar;
        this.clientActionCase_ = 4;
    }

    public static dg newBuilder() {
        return (dg) DEFAULT_INSTANCE.createBuilder();
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(com.google.v.v vVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<Cdo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayErrorMessage(dj djVar) {
        Objects.requireNonNull(djVar);
        this.clientAction_ = djVar;
        this.clientActionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetry(dl dlVar) {
        Objects.requireNonNull(dlVar);
        this.clientAction_ = dlVar;
        this.clientActionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnrecoverableError(dn dnVar) {
        Objects.requireNonNull(dnVar);
        this.clientAction_ = dnVar;
        this.clientActionCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဈ\u0000\u0004<\u0000", new Object[]{"clientAction_", "clientActionCase_", "bitField0_", dl.class, dj.class, "description_", dn.class});
        }
        if (iOrdinal == 3) {
            return new Cdo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<Cdo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Cdo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dh getClientActionCase() {
        int i2 = this.clientActionCase_;
        if (i2 == 0) {
            return dh.f16669d;
        }
        if (i2 == 1) {
            return dh.f16666a;
        }
        if (i2 == 2) {
            return dh.f16667b;
        }
        if (i2 != 4) {
            return null;
        }
        return dh.f16668c;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public dj getDisplayErrorMessage() {
        return this.clientActionCase_ == 2 ? (dj) this.clientAction_ : dj.getDefaultInstance();
    }

    public dl getRetry() {
        return this.clientActionCase_ == 1 ? (dl) this.clientAction_ : dl.getDefaultInstance();
    }

    public dn getUnrecoverableError() {
        return this.clientActionCase_ == 4 ? (dn) this.clientAction_ : dn.getDefaultInstance();
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDisplayErrorMessage() {
        return this.clientActionCase_ == 2;
    }

    public boolean hasRetry() {
        return this.clientActionCase_ == 1;
    }

    public boolean hasUnrecoverableError() {
        return this.clientActionCase_ == 4;
    }

    public static dg newBuilder(Cdo cdo) {
        return (dg) DEFAULT_INSTANCE.createBuilder(cdo);
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Cdo parseFrom(InputStream inputStream) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Cdo parseFrom(byte[] bArr) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cdo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
