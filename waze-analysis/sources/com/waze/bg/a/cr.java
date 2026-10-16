package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cr extends com.google.v.du<cr, cq> implements fj {
    private static final cr DEFAULT_INSTANCE;
    private static volatile fo<cr> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        cr crVar = new cr();
        DEFAULT_INSTANCE = crVar;
        com.google.v.du.registerDefaultInstance(cr.class, crVar);
    }

    private cr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static cr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cq newBuilder() {
        return (cq) DEFAULT_INSTANCE.createBuilder();
    }

    public static cr parseDelimitedFrom(InputStream inputStream) {
        return (cr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cr parseFrom(com.google.v.v vVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bt btVar) {
        this.type_ = btVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.n});
        }
        if (iOrdinal == 3) {
            return new cr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bt getType() {
        bt btVarB = bt.b(this.type_);
        return btVarB == null ? bt.HAZARD_UNSPECIFIED : btVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cq newBuilder(cr crVar) {
        return (cq) DEFAULT_INSTANCE.createBuilder(crVar);
    }

    public static cr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cr parseFrom(com.google.v.z zVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cr parseFrom(InputStream inputStream) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cr parseFrom(ByteBuffer byteBuffer) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cr parseFrom(byte[] bArr) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
