package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cx extends com.google.v.du<cx, cw> implements fj {
    private static final cx DEFAULT_INSTANCE;
    private static volatile fo<cx> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        cx cxVar = new cx();
        DEFAULT_INSTANCE = cxVar;
        com.google.v.du.registerDefaultInstance(cx.class, cxVar);
    }

    private cx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static cx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cw newBuilder() {
        return (cw) DEFAULT_INSTANCE.createBuilder();
    }

    public static cx parseDelimitedFrom(InputStream inputStream) {
        return (cx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cx parseFrom(com.google.v.v vVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bw bwVar) {
        this.type_ = bwVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.q});
        }
        if (iOrdinal == 3) {
            return new cx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bw getType() {
        bw bwVarB = bw.b(this.type_);
        return bwVarB == null ? bw.POLICE_UNSPECIFIED : bwVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cw newBuilder(cx cxVar) {
        return (cw) DEFAULT_INSTANCE.createBuilder(cxVar);
    }

    public static cx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cx parseFrom(com.google.v.z zVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cx parseFrom(InputStream inputStream) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cx parseFrom(ByteBuffer byteBuffer) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cx parseFrom(byte[] bArr) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
