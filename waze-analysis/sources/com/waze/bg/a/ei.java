package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ei extends com.google.v.du<ei, eh> implements fj {
    private static final ei DEFAULT_INSTANCE;
    private static volatile fo<ei> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        ei eiVar = new ei();
        DEFAULT_INSTANCE = eiVar;
        com.google.v.du.registerDefaultInstance(ei.class, eiVar);
    }

    private ei() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static ei getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eh newBuilder() {
        return (eh) DEFAULT_INSTANCE.createBuilder();
    }

    public static ei parseDelimitedFrom(InputStream inputStream) {
        return (ei) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ei parseFrom(com.google.v.v vVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ei> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ca caVar) {
        this.type_ = caVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.u});
        }
        if (iOrdinal == 3) {
            return new ei();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ei> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ei.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ca getType() {
        ca caVarB = ca.b(this.type_);
        return caVarB == null ? ca.WEATHER_UNSPECIFIED : caVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static eh newBuilder(ei eiVar) {
        return (eh) DEFAULT_INSTANCE.createBuilder(eiVar);
    }

    public static ei parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ei) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ei parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ei parseFrom(com.google.v.z zVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ei parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ei parseFrom(InputStream inputStream) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ei parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ei parseFrom(ByteBuffer byteBuffer) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ei parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ei parseFrom(byte[] bArr) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ei parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
