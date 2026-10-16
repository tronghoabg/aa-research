package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class er extends com.google.v.du<er, eq> implements com.google.v.fj {
    private static final er DEFAULT_INSTANCE;
    public static final int LANE_SIDE_FIELD_NUMBER = 3;
    public static final int LANE_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<er> PARSER;
    private int bitField0_;
    private int laneSide_;
    private int laneType_;

    static {
        er erVar = new er();
        DEFAULT_INSTANCE = erVar;
        com.google.v.du.registerDefaultInstance(er.class, erVar);
    }

    private er() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneSide() {
        this.bitField0_ &= -2;
        this.laneSide_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneType() {
        this.bitField0_ &= -3;
        this.laneType_ = 0;
    }

    public static er getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eq newBuilder() {
        return (eq) DEFAULT_INSTANCE.createBuilder();
    }

    public static er parseDelimitedFrom(InputStream inputStream) {
        return (er) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static er parseFrom(com.google.v.v vVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<er> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneSide(fb fbVar) {
        this.laneSide_ = fbVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneType(fc fcVar) {
        this.laneType_ = fcVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003᠌\u0000\u0004᠌\u0001", new Object[]{"bitField0_", "laneSide_", ci.f16639e, "laneType_", ci.f16640f});
        }
        if (iOrdinal == 3) {
            return new er();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<er> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (er.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fb getLaneSide() {
        fb fbVarA = fb.a(this.laneSide_);
        return fbVarA == null ? fb.LANE_SIDE_UNDEFINED : fbVarA;
    }

    public fc getLaneType() {
        fc fcVarA = fc.a(this.laneType_);
        return fcVarA == null ? fc.NAVIGATE_LANE_TYPE_UNDEFINED : fcVarA;
    }

    public boolean hasLaneSide() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLaneType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static eq newBuilder(er erVar) {
        return (eq) DEFAULT_INSTANCE.createBuilder(erVar);
    }

    public static er parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (er) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static er parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static er parseFrom(com.google.v.z zVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static er parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static er parseFrom(InputStream inputStream) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static er parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static er parseFrom(ByteBuffer byteBuffer) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static er parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static er parseFrom(byte[] bArr) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static er parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
