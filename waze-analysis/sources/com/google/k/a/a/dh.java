package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dh extends com.google.v.du<dh, dg> implements di {
    private static final dh DEFAULT_INSTANCE;
    public static final int ORIGINATOR_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<dh> PARSER = null;
    public static final int UTC_CONFIRMATION_RECEIPT_TIME_FIELD_NUMBER = 3;
    public static final int UTC_CONFIRMATION_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private ci originator_;
    private com.google.k.a.a.b.au utcConfirmationReceiptTime_;
    private com.google.k.a.a.b.au utcConfirmationTime_;

    static {
        dh dhVar = new dh();
        DEFAULT_INSTANCE = dhVar;
        com.google.v.du.registerDefaultInstance(dh.class, dhVar);
    }

    private dh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginator() {
        this.originator_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtcConfirmationReceiptTime() {
        this.utcConfirmationReceiptTime_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtcConfirmationTime() {
        this.utcConfirmationTime_ = null;
        this.bitField0_ &= -3;
    }

    public static dh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOriginator(ci ciVar) {
        Objects.requireNonNull(ciVar);
        ci ciVar2 = this.originator_;
        if (ciVar2 != null && ciVar2 != ci.getDefaultInstance()) {
            cg cgVarNewBuilder = ci.newBuilder(ciVar2);
            cgVarNewBuilder.mergeFrom((cg) ciVar);
            ciVar = cgVarNewBuilder.buildPartial();
        }
        this.originator_ = ciVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUtcConfirmationReceiptTime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        com.google.k.a.a.b.au auVar2 = this.utcConfirmationReceiptTime_;
        if (auVar2 != null && auVar2 != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.utcConfirmationReceiptTime_ = auVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUtcConfirmationTime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        com.google.k.a.a.b.au auVar2 = this.utcConfirmationTime_;
        if (auVar2 != null && auVar2 != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.utcConfirmationTime_ = auVar;
        this.bitField0_ |= 2;
    }

    public static dg newBuilder() {
        return (dg) DEFAULT_INSTANCE.createBuilder();
    }

    public static dh parseDelimitedFrom(InputStream inputStream) {
        return (dh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dh parseFrom(com.google.v.v vVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginator(ci ciVar) {
        Objects.requireNonNull(ciVar);
        this.originator_ = ciVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtcConfirmationReceiptTime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.utcConfirmationReceiptTime_ = auVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtcConfirmationTime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.utcConfirmationTime_ = auVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "originator_", "utcConfirmationTime_", "utcConfirmationReceiptTime_"});
        }
        if (iOrdinal == 3) {
            return new dh();
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
        com.google.v.fo<dh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ci getOriginator() {
        ci ciVar = this.originator_;
        return ciVar == null ? ci.getDefaultInstance() : ciVar;
    }

    public com.google.k.a.a.b.au getUtcConfirmationReceiptTime() {
        com.google.k.a.a.b.au auVar = this.utcConfirmationReceiptTime_;
        return auVar == null ? com.google.k.a.a.b.au.getDefaultInstance() : auVar;
    }

    public com.google.k.a.a.b.au getUtcConfirmationTime() {
        com.google.k.a.a.b.au auVar = this.utcConfirmationTime_;
        return auVar == null ? com.google.k.a.a.b.au.getDefaultInstance() : auVar;
    }

    public boolean hasOriginator() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUtcConfirmationReceiptTime() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUtcConfirmationTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public static dg newBuilder(dh dhVar) {
        return (dg) DEFAULT_INSTANCE.createBuilder(dhVar);
    }

    public static dh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dh parseFrom(com.google.v.z zVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dh parseFrom(InputStream inputStream) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dh parseFrom(ByteBuffer byteBuffer) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dh parseFrom(byte[] bArr) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
