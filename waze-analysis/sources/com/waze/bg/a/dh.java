package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dh extends com.google.v.du<dh, dg> implements fj {
    private static final dh DEFAULT_INSTANCE;
    private static volatile fo<dh> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        dh dhVar = new dh();
        DEFAULT_INSTANCE = dhVar;
        com.google.v.du.registerDefaultInstance(dh.class, dhVar);
    }

    private dh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static dh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dg newBuilder() {
        return (dg) DEFAULT_INSTANCE.createBuilder();
    }

    public static dh parseDelimitedFrom(InputStream inputStream) {
        return (dh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dh parseFrom(com.google.v.v vVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dh> parser() {
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
            return new dh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dh.class) {
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

    public static dg newBuilder(dh dhVar) {
        return (dg) DEFAULT_INSTANCE.createBuilder(dhVar);
    }

    public static dh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dh parseFrom(com.google.v.z zVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dh parseFrom(InputStream inputStream) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dh parseFrom(ByteBuffer byteBuffer) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dh parseFrom(byte[] bArr) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
