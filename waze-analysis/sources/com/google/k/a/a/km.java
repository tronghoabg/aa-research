package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class km extends com.google.v.du<km, kk> implements com.google.v.fj {
    private static final km DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<km> PARSER = null;
    public static final int SUBJECT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int subject_;

    static {
        km kmVar = new km();
        DEFAULT_INSTANCE = kmVar;
        com.google.v.du.registerDefaultInstance(km.class, kmVar);
    }

    private km() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubject() {
        this.bitField0_ &= -2;
        this.subject_ = 0;
    }

    public static km getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kk newBuilder() {
        return (kk) DEFAULT_INSTANCE.createBuilder();
    }

    public static km parseDelimitedFrom(InputStream inputStream) {
        return (km) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static km parseFrom(com.google.v.v vVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<km> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubject(kl klVar) {
        this.subject_ = klVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "subject_", ha.q});
        }
        if (iOrdinal == 3) {
            return new km();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<km> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (km.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public kl getSubject() {
        kl klVarA = kl.a(this.subject_);
        return klVarA == null ? kl.SUBJECT_UNSPECIFIED : klVarA;
    }

    public boolean hasSubject() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kk newBuilder(km kmVar) {
        return (kk) DEFAULT_INSTANCE.createBuilder(kmVar);
    }

    public static km parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (km) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static km parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static km parseFrom(com.google.v.z zVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static km parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static km parseFrom(InputStream inputStream) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static km parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static km parseFrom(ByteBuffer byteBuffer) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static km parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static km parseFrom(byte[] bArr) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static km parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (km) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
