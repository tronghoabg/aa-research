package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bq extends com.google.v.du<bq, bn> implements com.google.v.fj {
    public static final int CLOSED_FIELD_NUMBER = 1;
    public static final int CLOSE_REASON_FIELD_NUMBER = 5;
    private static final bq DEFAULT_INSTANCE;
    public static final int END_AS_OF_DATE_FIELD_NUMBER = 11;
    public static final int END_DATE_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 1321489;
    private static volatile com.google.v.fo<bq> PARSER = null;
    public static final int PREVENT_REVIVAL_FIELD_NUMBER = 12;
    public static final int REMOVED_FIELD_NUMBER = 2;
    public static final int REMOVED_REASON_FIELD_NUMBER = 3;
    public static final int START_DATE_FIELD_NUMBER = 6;
    public static final com.google.v.ds<com.google.w.n.a.b, bq> messageSetExtension;
    private int bitField0_;
    private int closeReason_;
    private boolean closed_;
    private au endAsOfDate_;
    private au endDate_;
    private boolean preventRevival_;
    private int removedReason_;
    private boolean removed_;
    private au startDate_;

    static {
        bq bqVar = new bq();
        DEFAULT_INSTANCE = bqVar;
        com.google.v.du.registerDefaultInstance(bq.class, bqVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, bq.class);
    }

    private bq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCloseReason() {
        this.bitField0_ &= -9;
        this.closeReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosed() {
        this.bitField0_ &= -5;
        this.closed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndAsOfDate() {
        this.endAsOfDate_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndDate() {
        this.endDate_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreventRevival() {
        this.bitField0_ &= -129;
        this.preventRevival_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoved() {
        this.bitField0_ &= -2;
        this.removed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemovedReason() {
        this.bitField0_ &= -3;
        this.removedReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartDate() {
        this.startDate_ = null;
        this.bitField0_ &= -17;
    }

    public static bq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndAsOfDate(au auVar) {
        Objects.requireNonNull(auVar);
        au auVar2 = this.endAsOfDate_;
        if (auVar2 != null && auVar2 != au.getDefaultInstance()) {
            as asVarNewBuilder = au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.endAsOfDate_ = auVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndDate(au auVar) {
        Objects.requireNonNull(auVar);
        au auVar2 = this.endDate_;
        if (auVar2 != null && auVar2 != au.getDefaultInstance()) {
            as asVarNewBuilder = au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.endDate_ = auVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartDate(au auVar) {
        Objects.requireNonNull(auVar);
        au auVar2 = this.startDate_;
        if (auVar2 != null && auVar2 != au.getDefaultInstance()) {
            as asVarNewBuilder = au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.startDate_ = auVar;
        this.bitField0_ |= 16;
    }

    public static bn newBuilder() {
        return (bn) DEFAULT_INSTANCE.createBuilder();
    }

    public static bq parseDelimitedFrom(InputStream inputStream) {
        return (bq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bq parseFrom(com.google.v.v vVar) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseReason(bo boVar) {
        this.closeReason_ = boVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosed(boolean z) {
        this.bitField0_ |= 4;
        this.closed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndAsOfDate(au auVar) {
        Objects.requireNonNull(auVar);
        this.endAsOfDate_ = auVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndDate(au auVar) {
        Objects.requireNonNull(auVar);
        this.endDate_ = auVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreventRevival(boolean z) {
        this.bitField0_ |= 128;
        this.preventRevival_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoved(boolean z) {
        this.bitField0_ |= 1;
        this.removed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemovedReason(bp bpVar) {
        this.removedReason_ = bpVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartDate(au auVar) {
        Objects.requireNonNull(auVar);
        this.startDate_ = auVar;
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဇ\u0002\u0002ဇ\u0000\u0003᠌\u0001\u0005᠌\u0003\u0006ဉ\u0004\u0007ဉ\u0005\u000bဉ\u0006\fဇ\u0007", new Object[]{"bitField0_", "closed_", "removed_", "removedReason_", c.n, "closeReason_", c.m, "startDate_", "endDate_", "endAsOfDate_", "preventRevival_"});
        }
        if (iOrdinal == 3) {
            return new bq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bo getCloseReason() {
        bo boVarA = bo.a(this.closeReason_);
        return boVarA == null ? bo.CLOSED : boVarA;
    }

    public boolean getClosed() {
        return this.closed_;
    }

    public au getEndAsOfDate() {
        au auVar = this.endAsOfDate_;
        return auVar == null ? au.getDefaultInstance() : auVar;
    }

    public au getEndDate() {
        au auVar = this.endDate_;
        return auVar == null ? au.getDefaultInstance() : auVar;
    }

    public boolean getPreventRevival() {
        return this.preventRevival_;
    }

    public boolean getRemoved() {
        return this.removed_;
    }

    public bp getRemovedReason() {
        bp bpVarA = bp.a(this.removedReason_);
        return bpVarA == null ? bp.UNKNOWN : bpVarA;
    }

    public au getStartDate() {
        au auVar = this.startDate_;
        return auVar == null ? au.getDefaultInstance() : auVar;
    }

    public boolean hasCloseReason() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasClosed() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEndAsOfDate() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasEndDate() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPreventRevival() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasRemoved() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRemovedReason() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStartDate() {
        return (this.bitField0_ & 16) != 0;
    }

    public static bn newBuilder(bq bqVar) {
        return (bn) DEFAULT_INSTANCE.createBuilder(bqVar);
    }

    public static bq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bq parseFrom(com.google.v.z zVar) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bq parseFrom(InputStream inputStream) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bq parseFrom(ByteBuffer byteBuffer) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bq parseFrom(byte[] bArr) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
