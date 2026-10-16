package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ci extends com.google.v.du<ci, cg> implements cj {
    private static final ci DEFAULT_INSTANCE;
    public static final int MID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ci> PARSER;
    private int idCase_ = 0;
    private Object id_;

    static {
        ci ciVar = new ci();
        DEFAULT_INSTANCE = ciVar;
        com.google.v.du.registerDefaultInstance(ci.class, ciVar);
    }

    private ci() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.idCase_ = 0;
        this.id_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        if (this.idCase_ == 1) {
            this.idCase_ = 0;
            this.id_ = null;
        }
    }

    public static ci getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cg newBuilder() {
        return (cg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ci parseDelimitedFrom(InputStream inputStream) {
        return (ci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ci parseFrom(com.google.v.v vVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ci> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(String str) {
        Objects.requireNonNull(str);
        this.idCase_ = 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMidBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.idCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001;\u0000", new Object[]{"id_", "idCase_"});
        }
        if (iOrdinal == 3) {
            return new ci();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ci> foVar = PARSER;
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

    public ch getIdCase() {
        int i2 = this.idCase_;
        if (i2 == 0) {
            return ch.f11751b;
        }
        if (i2 != 1) {
            return null;
        }
        return ch.f11750a;
    }

    public String getMid() {
        return this.idCase_ == 1 ? (String) this.id_ : "";
    }

    public com.google.v.v getMidBytes() {
        return com.google.v.v.s(this.idCase_ == 1 ? (String) this.id_ : "");
    }

    public boolean hasMid() {
        return this.idCase_ == 1;
    }

    public static cg newBuilder(ci ciVar) {
        return (cg) DEFAULT_INSTANCE.createBuilder(ciVar);
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
