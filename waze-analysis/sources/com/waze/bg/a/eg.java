package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class eg extends com.google.v.du<eg, ef> implements fj {
    private static final eg DEFAULT_INSTANCE;
    private static volatile fo<eg> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        eg egVar = new eg();
        DEFAULT_INSTANCE = egVar;
        com.google.v.du.registerDefaultInstance(eg.class, egVar);
    }

    private eg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static eg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ef newBuilder() {
        return (ef) DEFAULT_INSTANCE.createBuilder();
    }

    public static eg parseDelimitedFrom(InputStream inputStream) {
        return (eg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eg parseFrom(com.google.v.v vVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<eg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bz bzVar) {
        this.type_ = bzVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.t});
        }
        if (iOrdinal == 3) {
            return new eg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ef(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<eg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bz getType() {
        bz bzVarA = bz.a(this.type_);
        return bzVarA == null ? bz.TURN_CLOSURE_UNSPECIFIED : bzVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ef newBuilder(eg egVar) {
        return (ef) DEFAULT_INSTANCE.createBuilder(egVar);
    }

    public static eg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eg parseFrom(com.google.v.z zVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eg parseFrom(InputStream inputStream) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eg parseFrom(ByteBuffer byteBuffer) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eg parseFrom(byte[] bArr) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
