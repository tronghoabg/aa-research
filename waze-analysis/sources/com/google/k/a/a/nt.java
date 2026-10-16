package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nt extends com.google.v.du<nt, nr> implements com.google.v.fj {
    private static final nt DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<nt> PARSER;
    private int bitField0_;
    private int level_;

    static {
        nt ntVar = new nt();
        DEFAULT_INSTANCE = ntVar;
        com.google.v.du.registerDefaultInstance(nt.class, ntVar);
    }

    private nt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.bitField0_ &= -2;
        this.level_ = 0;
    }

    public static nt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nr newBuilder() {
        return (nr) DEFAULT_INSTANCE.createBuilder();
    }

    public static nt parseDelimitedFrom(InputStream inputStream) {
        return (nt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nt parseFrom(com.google.v.v vVar) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(ns nsVar) {
        this.level_ = nsVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "level_", lq.f12092e});
        }
        if (iOrdinal == 3) {
            return new nt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ns getLevel() {
        ns nsVarA = ns.a(this.level_);
        return nsVarA == null ? ns.UNKNOWN : nsVarA;
    }

    public boolean hasLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static nr newBuilder(nt ntVar) {
        return (nr) DEFAULT_INSTANCE.createBuilder(ntVar);
    }

    public static nt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nt parseFrom(com.google.v.z zVar) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nt parseFrom(InputStream inputStream) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nt parseFrom(ByteBuffer byteBuffer) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nt parseFrom(byte[] bArr) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
