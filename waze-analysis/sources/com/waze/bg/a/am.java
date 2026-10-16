package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class am extends com.google.v.du<am, al> implements fj {
    public static final int ALERT_UUID_FIELD_NUMBER = 1;
    private static final am DEFAULT_INSTANCE;
    private static volatile fo<am> PARSER;
    private String alertUuid_ = "";
    private int bitField0_;

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        com.google.v.du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertUuid() {
        this.bitField0_ &= -2;
        this.alertUuid_ = getDefaultInstance().getAlertUuid();
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.alertUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuidBytes(com.google.v.v vVar) {
        this.alertUuid_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "alertUuid_"});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<am> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (am.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlertUuid() {
        return this.alertUuid_;
    }

    public com.google.v.v getAlertUuidBytes() {
        return com.google.v.v.s(this.alertUuid_);
    }

    public boolean hasAlertUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public static al newBuilder(am amVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (am) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
