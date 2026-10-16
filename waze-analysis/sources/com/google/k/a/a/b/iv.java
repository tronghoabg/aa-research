package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class iv extends com.google.v.du<iv, it> implements com.google.v.fj {
    private static final iv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<iv> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_ = 3;

    static {
        iv ivVar = new iv();
        DEFAULT_INSTANCE = ivVar;
        com.google.v.du.registerDefaultInstance(iv.class, ivVar);
    }

    private iv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 3;
    }

    public static iv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static it newBuilder() {
        return (it) DEFAULT_INSTANCE.createBuilder();
    }

    public static iv parseDelimitedFrom(InputStream inputStream) {
        return (iv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iv parseFrom(com.google.v.v vVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<iv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(iu iuVar) {
        this.type_ = iuVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", hs.n});
        }
        if (iOrdinal == 3) {
            return new iv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new it(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<iv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (iv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public iu getType() {
        iu iuVarA = iu.a(this.type_);
        return iuVarA == null ? iu.TYPE_CHAIR : iuVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static it newBuilder(iv ivVar) {
        return (it) DEFAULT_INSTANCE.createBuilder(ivVar);
    }

    public static iv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static iv parseFrom(com.google.v.z zVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static iv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static iv parseFrom(InputStream inputStream) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iv parseFrom(ByteBuffer byteBuffer) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static iv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static iv parseFrom(byte[] bArr) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static iv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
