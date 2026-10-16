package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ea extends com.google.v.du<ea, dz> implements fj {
    private static final ea DEFAULT_INSTANCE;
    private static volatile fo<ea> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        ea eaVar = new ea();
        DEFAULT_INSTANCE = eaVar;
        com.google.v.du.registerDefaultInstance(ea.class, eaVar);
    }

    private ea() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static ea getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dz newBuilder() {
        return (dz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ea parseDelimitedFrom(InputStream inputStream) {
        return (ea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ea parseFrom(com.google.v.v vVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ea> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bw bwVar) {
        this.type_ = bwVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.q});
        }
        if (iOrdinal == 3) {
            return new ea();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ea> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ea.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bw getType() {
        bw bwVarB = bw.b(this.type_);
        return bwVarB == null ? bw.POLICE_UNSPECIFIED : bwVarB;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dz newBuilder(ea eaVar) {
        return (dz) DEFAULT_INSTANCE.createBuilder(eaVar);
    }

    public static ea parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ea parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ea parseFrom(com.google.v.z zVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ea parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ea parseFrom(InputStream inputStream) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ea parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ea parseFrom(ByteBuffer byteBuffer) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ea parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ea parseFrom(byte[] bArr) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ea parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
