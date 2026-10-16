package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cg extends com.google.v.du<cg, cf> implements fj {
    private static final cg DEFAULT_INSTANCE;
    private static volatile fo<cg> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        cg cgVar = new cg();
        DEFAULT_INSTANCE = cgVar;
        com.google.v.du.registerDefaultInstance(cg.class, cgVar);
    }

    private cg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static cg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cf newBuilder() {
        return (cf) DEFAULT_INSTANCE.createBuilder();
    }

    public static cg parseDelimitedFrom(InputStream inputStream) {
        return (cg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cg parseFrom(com.google.v.v vVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bn bnVar) {
        this.type_ = bnVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.f16562h});
        }
        if (iOrdinal == 3) {
            return new cg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bn getType() {
        bn bnVarB = bn.b(this.type_);
        return bnVarB == null ? bn.ANIMAL_UNSPECIFIED : bnVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cf newBuilder(cg cgVar) {
        return (cf) DEFAULT_INSTANCE.createBuilder(cgVar);
    }

    public static cg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cg parseFrom(com.google.v.z zVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cg parseFrom(InputStream inputStream) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cg parseFrom(ByteBuffer byteBuffer) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cg parseFrom(byte[] bArr) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
