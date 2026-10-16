package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cz extends com.google.v.du<cz, cy> implements fj {
    private static final cz DEFAULT_INSTANCE;
    private static volatile fo<cz> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        cz czVar = new cz();
        DEFAULT_INSTANCE = czVar;
        com.google.v.du.registerDefaultInstance(cz.class, czVar);
    }

    private cz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static cz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cy newBuilder() {
        return (cy) DEFAULT_INSTANCE.createBuilder();
    }

    public static cz parseDelimitedFrom(InputStream inputStream) {
        return (cz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cz parseFrom(com.google.v.v vVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(by byVar) {
        this.type_ = byVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.s});
        }
        if (iOrdinal == 3) {
            return new cz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public by getType() {
        by byVarB = by.b(this.type_);
        return byVarB == null ? by.TRAFFIC_UNSPECIFIED : byVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cy newBuilder(cz czVar) {
        return (cy) DEFAULT_INSTANCE.createBuilder(czVar);
    }

    public static cz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cz parseFrom(com.google.v.z zVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cz parseFrom(InputStream inputStream) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cz parseFrom(ByteBuffer byteBuffer) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cz parseFrom(byte[] bArr) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
