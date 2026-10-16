package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ec extends com.google.v.du<ec, eb> implements fj {
    private static final ec DEFAULT_INSTANCE;
    private static volatile fo<ec> PARSER = null;
    public static final int SPEED_LIMIT_KMPH_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int speedLimitKmph_;
    private int type_;

    static {
        ec ecVar = new ec();
        DEFAULT_INSTANCE = ecVar;
        com.google.v.du.registerDefaultInstance(ec.class, ecVar);
    }

    private ec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimitKmph() {
        this.bitField0_ &= -3;
        this.speedLimitKmph_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static ec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eb newBuilder() {
        return (eb) DEFAULT_INSTANCE.createBuilder();
    }

    public static ec parseDelimitedFrom(InputStream inputStream) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(com.google.v.v vVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimitKmph(int i2) {
        this.bitField0_ |= 2;
        this.speedLimitKmph_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bx bxVar) {
        this.type_ = bxVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"bitField0_", "type_", o.r, "speedLimitKmph_"});
        }
        if (iOrdinal == 3) {
            return new ec();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ec> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ec.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getSpeedLimitKmph() {
        return this.speedLimitKmph_;
    }

    public bx getType() {
        bx bxVarA = bx.a(this.type_);
        return bxVarA == null ? bx.SPEED_LIMIT_DECREASE_UNSPECIFIED : bxVarA;
    }

    public boolean hasSpeedLimitKmph() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static eb newBuilder(ec ecVar) {
        return (eb) DEFAULT_INSTANCE.createBuilder(ecVar);
    }

    public static ec parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ec parseFrom(com.google.v.z zVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ec parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ec parseFrom(InputStream inputStream) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(ByteBuffer byteBuffer) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ec parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ec parseFrom(byte[] bArr) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ec parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
