package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class az extends com.google.v.du<az, ay> implements fj {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int ALERT_UUID_FIELD_NUMBER = 2;
    private static final az DEFAULT_INSTANCE;
    private static volatile fo<az> PARSER;
    private long aid_;
    private String alertUuid_ = "";
    private int bitField0_;

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        com.google.v.du.registerDefaultInstance(az.class, azVar);
    }

    private az() {
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

    public static az getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ay newBuilder() {
        return (ay) DEFAULT_INSTANCE.createBuilder();
    }

    public static az parseDelimitedFrom(InputStream inputStream) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(com.google.v.v vVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<az> parser() {
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
            return new az();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ay(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<az> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (az.class) {
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

    public static ay newBuilder(az azVar) {
        return (ay) DEFAULT_INSTANCE.createBuilder(azVar);
    }

    public static az parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static az parseFrom(com.google.v.z zVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static az parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static az parseFrom(InputStream inputStream) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(ByteBuffer byteBuffer) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static az parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static az parseFrom(byte[] bArr) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static az parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
