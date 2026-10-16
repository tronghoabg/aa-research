package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fl extends com.google.v.du<fl, fj> implements fm {
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final fl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fl> PARSER;
    private int bitField0_;
    private int color_ = 1;

    static {
        fl flVar = new fl();
        DEFAULT_INSTANCE = flVar;
        com.google.v.du.registerDefaultInstance(fl.class, flVar);
    }

    private fl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.bitField0_ &= -2;
        this.color_ = 1;
    }

    public static fl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fj newBuilder() {
        return (fj) DEFAULT_INSTANCE.createBuilder();
    }

    public static fl parseDelimitedFrom(InputStream inputStream) {
        return (fl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fl parseFrom(com.google.v.v vVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(fk fkVar) {
        this.color_ = fkVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "color_", h.n});
        }
        if (iOrdinal == 3) {
            return new fl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fk getColor() {
        fk fkVarA = fk.a(this.color_);
        return fkVarA == null ? fk.UNKNOWN_LOGICAL_COLOR : fkVarA;
    }

    public boolean hasColor() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fj newBuilder(fl flVar) {
        return (fj) DEFAULT_INSTANCE.createBuilder(flVar);
    }

    public static fl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fl parseFrom(com.google.v.z zVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fl parseFrom(InputStream inputStream) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fl parseFrom(ByteBuffer byteBuffer) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fl parseFrom(byte[] bArr) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
