package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bd extends com.google.v.du<bd, bc> implements fj {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int ALERT_UUID_FIELD_NUMBER = 2;
    private static final bd DEFAULT_INSTANCE;
    private static volatile fo<bd> PARSER;
    private long aid_;
    private String alertUuid_ = "";
    private int bitField0_;

    static {
        bd bdVar = new bd();
        DEFAULT_INSTANCE = bdVar;
        com.google.v.du.registerDefaultInstance(bd.class, bdVar);
    }

    private bd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.bitField0_ &= -2;
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertUuid() {
        this.bitField0_ &= -3;
        this.alertUuid_ = getDefaultInstance().getAlertUuid();
    }

    public static bd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bc newBuilder() {
        return (bc) DEFAULT_INSTANCE.createBuilder();
    }

    public static bd parseDelimitedFrom(InputStream inputStream) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(com.google.v.v vVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j2) {
        this.bitField0_ |= 1;
        this.aid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.alertUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuidBytes(com.google.v.v vVar) {
        this.alertUuid_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "aid_", "alertUuid_"});
        }
        if (iOrdinal == 3) {
            return new bd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAid() {
        return this.aid_;
    }

    public String getAlertUuid() {
        return this.alertUuid_;
    }

    public com.google.v.v getAlertUuidBytes() {
        return com.google.v.v.s(this.alertUuid_);
    }

    public boolean hasAid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAlertUuid() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bc newBuilder(bd bdVar) {
        return (bc) DEFAULT_INSTANCE.createBuilder(bdVar);
    }

    public static bd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bd parseFrom(com.google.v.z zVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bd parseFrom(InputStream inputStream) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(ByteBuffer byteBuffer) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bd parseFrom(byte[] bArr) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
