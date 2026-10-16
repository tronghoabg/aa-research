package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ci extends com.google.v.du<ci, ch> implements fj {
    private static final ci DEFAULT_INSTANCE;
    private static volatile fo<ci> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        ci ciVar = new ci();
        DEFAULT_INSTANCE = ciVar;
        com.google.v.du.registerDefaultInstance(ci.class, ciVar);
    }

    private ci() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static ci getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ch newBuilder() {
        return (ch) DEFAULT_INSTANCE.createBuilder();
    }

    public static ci parseDelimitedFrom(InputStream inputStream) {
        return (ci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ci parseFrom(com.google.v.v vVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ci> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bo boVar) {
        this.type_ = boVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.f16563i});
        }
        if (iOrdinal == 3) {
            return new ci();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ch(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ci> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ci.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bo getType() {
        bo boVarB = bo.b(this.type_);
        return boVarB == null ? bo.BLOCKED_LANE_UNSPECIFIED : boVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ch newBuilder(ci ciVar) {
        return (ch) DEFAULT_INSTANCE.createBuilder(ciVar);
    }

    public static ci parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ci parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ci parseFrom(com.google.v.z zVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ci parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ci parseFrom(InputStream inputStream) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ci parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ci parseFrom(ByteBuffer byteBuffer) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ci parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ci parseFrom(byte[] bArr) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ci parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
