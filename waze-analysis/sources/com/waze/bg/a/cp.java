package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cp extends com.google.v.du<cp, co> implements fj {
    private static final cp DEFAULT_INSTANCE;
    private static volatile fo<cp> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        cp cpVar = new cp();
        DEFAULT_INSTANCE = cpVar;
        com.google.v.du.registerDefaultInstance(cp.class, cpVar);
    }

    private cp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static cp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static co newBuilder() {
        return (co) DEFAULT_INSTANCE.createBuilder();
    }

    public static cp parseDelimitedFrom(InputStream inputStream) {
        return (cp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cp parseFrom(com.google.v.v vVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(br brVar) {
        this.type_ = brVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.f16566l});
        }
        if (iOrdinal == 3) {
            return new cp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new co(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public br getType() {
        br brVarB = br.b(this.type_);
        return brVarB == null ? br.CRASH_UNSPECIFIED : brVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static co newBuilder(cp cpVar) {
        return (co) DEFAULT_INSTANCE.createBuilder(cpVar);
    }

    public static cp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cp parseFrom(com.google.v.z zVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cp parseFrom(InputStream inputStream) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cp parseFrom(ByteBuffer byteBuffer) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cp parseFrom(byte[] bArr) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
