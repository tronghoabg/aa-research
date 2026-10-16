package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gw extends com.google.v.du<gw, gu> implements com.google.v.fj {
    private static final gw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gw> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        gw gwVar = new gw();
        DEFAULT_INSTANCE = gwVar;
        com.google.v.du.registerDefaultInstance(gw.class, gwVar);
    }

    private gw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static gw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gu newBuilder() {
        return (gu) DEFAULT_INSTANCE.createBuilder();
    }

    public static gw parseDelimitedFrom(InputStream inputStream) {
        return (gw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gw parseFrom(com.google.v.v vVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(gv gvVar) {
        this.type_ = gvVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", dq.p});
        }
        if (iOrdinal == 3) {
            return new gw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gv getType() {
        gv gvVarA = gv.a(this.type_);
        return gvVarA == null ? gv.TYPE_UNIFIED : gvVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gu newBuilder(gw gwVar) {
        return (gu) DEFAULT_INSTANCE.createBuilder(gwVar);
    }

    public static gw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gw parseFrom(com.google.v.z zVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gw parseFrom(InputStream inputStream) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gw parseFrom(ByteBuffer byteBuffer) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gw parseFrom(byte[] bArr) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
