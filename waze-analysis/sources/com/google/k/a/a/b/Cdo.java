package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* renamed from: com.google.k.a.a.b.do, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo extends com.google.v.du<Cdo, dm> implements dp {
    private static final Cdo DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<Cdo> PARSER;
    private int bitField0_;
    private int method_;

    static {
        Cdo cdo = new Cdo();
        DEFAULT_INSTANCE = cdo;
        com.google.v.du.registerDefaultInstance(Cdo.class, cdo);
    }

    private Cdo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.bitField0_ &= -2;
        this.method_ = 0;
    }

    public static Cdo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dm newBuilder() {
        return (dm) DEFAULT_INSTANCE.createBuilder();
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(com.google.v.v vVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<Cdo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(dn dnVar) {
        this.method_ = dnVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "method_", dq.f11270b});
        }
        if (iOrdinal == 3) {
            return new Cdo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<Cdo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Cdo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dn getMethod() {
        dn dnVarA = dn.a(this.method_);
        return dnVarA == null ? dn.METHOD_UNSPECIFIED : dnVarA;
    }

    public boolean hasMethod() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dm newBuilder(Cdo cdo) {
        return (dm) DEFAULT_INSTANCE.createBuilder(cdo);
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Cdo parseFrom(InputStream inputStream) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Cdo parseFrom(byte[] bArr) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cdo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
