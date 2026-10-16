package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kp extends com.google.v.du<kp, kn> implements com.google.v.fj {
    private static final kp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kp> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int UTC_DATETIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private int state_;
    private com.google.k.a.a.b.au utcDatetime_;

    static {
        kp kpVar = new kp();
        DEFAULT_INSTANCE = kpVar;
        com.google.v.du.registerDefaultInstance(kp.class, kpVar);
    }

    private kp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.bitField0_ &= -2;
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtcDatetime() {
        this.utcDatetime_ = null;
        this.bitField0_ &= -3;
    }

    public static kp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUtcDatetime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        com.google.k.a.a.b.au auVar2 = this.utcDatetime_;
        if (auVar2 != null && auVar2 != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.utcDatetime_ = auVar;
        this.bitField0_ |= 2;
    }

    public static kn newBuilder() {
        return (kn) DEFAULT_INSTANCE.createBuilder();
    }

    public static kp parseDelimitedFrom(InputStream inputStream) {
        return (kp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kp parseFrom(com.google.v.v vVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(ko koVar) {
        this.state_ = koVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtcDatetime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.utcDatetime_ = auVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "state_", ha.r, "utcDatetime_"});
        }
        if (iOrdinal == 3) {
            return new kp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ko getState() {
        ko koVarA = ko.a(this.state_);
        return koVarA == null ? ko.STATE_UNSPECIFIED : koVarA;
    }

    public com.google.k.a.a.b.au getUtcDatetime() {
        com.google.k.a.a.b.au auVar = this.utcDatetime_;
        return auVar == null ? com.google.k.a.a.b.au.getDefaultInstance() : auVar;
    }

    public boolean hasState() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUtcDatetime() {
        return (this.bitField0_ & 2) != 0;
    }

    public static kn newBuilder(kp kpVar) {
        return (kn) DEFAULT_INSTANCE.createBuilder(kpVar);
    }

    public static kp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kp parseFrom(com.google.v.z zVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kp parseFrom(InputStream inputStream) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kp parseFrom(ByteBuffer byteBuffer) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kp parseFrom(byte[] bArr) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
