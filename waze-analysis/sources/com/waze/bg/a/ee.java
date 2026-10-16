package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ee extends com.google.v.du<ee, ed> implements fj {
    private static final ee DEFAULT_INSTANCE;
    private static volatile fo<ee> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        ee eeVar = new ee();
        DEFAULT_INSTANCE = eeVar;
        com.google.v.du.registerDefaultInstance(ee.class, eeVar);
    }

    private ee() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static ee getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ed newBuilder() {
        return (ed) DEFAULT_INSTANCE.createBuilder();
    }

    public static ee parseDelimitedFrom(InputStream inputStream) {
        return (ee) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ee parseFrom(com.google.v.v vVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ee> parser() {
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
            return new ee();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ed(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ee> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ee.class) {
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

    public static ed newBuilder(ee eeVar) {
        return (ed) DEFAULT_INSTANCE.createBuilder(eeVar);
    }

    public static ee parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ee) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ee parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ee parseFrom(com.google.v.z zVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ee parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ee parseFrom(InputStream inputStream) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ee parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ee parseFrom(ByteBuffer byteBuffer) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ee parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ee parseFrom(byte[] bArr) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ee parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ee) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
