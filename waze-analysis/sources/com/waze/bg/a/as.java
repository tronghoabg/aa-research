package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class as extends com.google.v.du<as, ar> implements fj {
    private static final as DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile fo<as> PARSER = null;
    public static final int RECEIVED_POINTS_COUNT_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private long receivedPointsCount_;
    private i.b.ah status_;
    private String title_ = "";
    private String description_ = "";

    static {
        as asVar = new as();
        DEFAULT_INSTANCE = asVar;
        com.google.v.du.registerDefaultInstance(as.class, asVar);
    }

    private as() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -9;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceivedPointsCount() {
        this.bitField0_ &= -3;
        this.receivedPointsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.bitField0_ &= -5;
        this.title_ = getDefaultInstance().getTitle();
    }

    public static as getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        i.b.ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != i.b.ah.getDefaultInstance()) {
            i.b.af afVarNewBuilder = i.b.ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((i.b.af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    public static ar newBuilder() {
        return (ar) DEFAULT_INSTANCE.createBuilder();
    }

    public static as parseDelimitedFrom(InputStream inputStream) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(com.google.v.v vVar) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<as> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceivedPointsCount(long j2) {
        this.bitField0_ |= 2;
        this.receivedPointsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(com.google.v.v vVar) {
        this.title_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "status_", "receivedPointsCount_", "title_", "description_"});
        }
        if (iOrdinal == 3) {
            return new as();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ar(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<as> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (as.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public long getReceivedPointsCount() {
        return this.receivedPointsCount_;
    }

    public i.b.ah getStatus() {
        i.b.ah ahVar = this.status_;
        return ahVar == null ? i.b.ah.getDefaultInstance() : ahVar;
    }

    public String getTitle() {
        return this.title_;
    }

    public com.google.v.v getTitleBytes() {
        return com.google.v.v.s(this.title_);
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasReceivedPointsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ar newBuilder(as asVar) {
        return (ar) DEFAULT_INSTANCE.createBuilder(asVar);
    }

    public static as parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static as parseFrom(com.google.v.z zVar) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static as parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static as parseFrom(InputStream inputStream) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(ByteBuffer byteBuffer) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static as parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static as parseFrom(byte[] bArr) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static as parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (as) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
