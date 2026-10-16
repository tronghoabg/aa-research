package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gl extends com.google.v.du<gl, gk> implements gm {
    private static final gl DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gl> PARSER;
    private int bitField0_;
    private String name_ = "";

    static {
        gl glVar = new gl();
        DEFAULT_INSTANCE = glVar;
        com.google.v.du.registerDefaultInstance(gl.class, glVar);
    }

    private gl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public static gl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gk newBuilder() {
        return (gk) DEFAULT_INSTANCE.createBuilder();
    }

    public static gl parseDelimitedFrom(InputStream inputStream) {
        return (gl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gl parseFrom(com.google.v.v vVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "name_"});
        }
        if (iOrdinal == 3) {
            return new gl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gk newBuilder(gl glVar) {
        return (gk) DEFAULT_INSTANCE.createBuilder(glVar);
    }

    public static gl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gl parseFrom(com.google.v.z zVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gl parseFrom(InputStream inputStream) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gl parseFrom(ByteBuffer byteBuffer) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gl parseFrom(byte[] bArr) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
