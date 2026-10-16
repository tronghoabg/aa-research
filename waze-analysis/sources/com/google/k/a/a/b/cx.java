package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cx extends com.google.v.du<cx, cw> implements com.google.v.fj {
    private static final cx DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 157211294;
    private static volatile com.google.v.fo<cx> PARSER;
    public static final com.google.v.ds<com.google.w.n.a.b, cx> messageSetExtension;
    private int bitField0_;
    private String id_ = "";

    static {
        cx cxVar = new cx();
        DEFAULT_INSTANCE = cxVar;
        com.google.v.du.registerDefaultInstance(cx.class, cxVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, cx.class);
    }

    private cx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
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

    public static com.google.v.fo<cx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "id_"});
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
        com.google.v.fo<cx> foVar = PARSER;
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

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public boolean hasId() {
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
