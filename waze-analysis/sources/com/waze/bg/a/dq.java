package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dq extends com.google.v.du<dq, dp> implements fj {
    private static final dq DEFAULT_INSTANCE;
    private static volatile fo<dq> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        dq dqVar = new dq();
        DEFAULT_INSTANCE = dqVar;
        com.google.v.du.registerDefaultInstance(dq.class, dqVar);
    }

    private dq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static dq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dp newBuilder() {
        return (dp) DEFAULT_INSTANCE.createBuilder();
    }

    public static dq parseDelimitedFrom(InputStream inputStream) {
        return (dq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dq parseFrom(com.google.v.v vVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dq> parser() {
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
            return new dq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dq.class) {
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

    public static dp newBuilder(dq dqVar) {
        return (dp) DEFAULT_INSTANCE.createBuilder(dqVar);
    }

    public static dq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dq parseFrom(com.google.v.z zVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dq parseFrom(InputStream inputStream) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dq parseFrom(ByteBuffer byteBuffer) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dq parseFrom(byte[] bArr) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
