package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class is extends com.google.v.du<is, iq> implements com.google.v.fj {
    private static final is DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<is> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_ = 2;

    static {
        is isVar = new is();
        DEFAULT_INSTANCE = isVar;
        com.google.v.du.registerDefaultInstance(is.class, isVar);
    }

    private is() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 2;
    }

    public static is getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static iq newBuilder() {
        return (iq) DEFAULT_INSTANCE.createBuilder();
    }

    public static is parseDelimitedFrom(InputStream inputStream) {
        return (is) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static is parseFrom(com.google.v.v vVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<is> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ir irVar) {
        this.type_ = irVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", hs.m});
        }
        if (iOrdinal == 3) {
            return new is();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new iq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<is> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (is.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ir getType() {
        ir irVarA = ir.a(this.type_);
        return irVarA == null ? ir.TYPE_SKI_AREA : irVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static iq newBuilder(is isVar) {
        return (iq) DEFAULT_INSTANCE.createBuilder(isVar);
    }

    public static is parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (is) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static is parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static is parseFrom(com.google.v.z zVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static is parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static is parseFrom(InputStream inputStream) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static is parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static is parseFrom(ByteBuffer byteBuffer) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static is parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static is parseFrom(byte[] bArr) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static is parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
