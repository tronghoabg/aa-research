package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class iz extends com.google.v.du<iz, iw> implements com.google.v.fj {
    private static final iz DEFAULT_INSTANCE;
    public static final int DIFFICULTY_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<iz> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int difficulty_;
    private int type_ = 3;

    static {
        iz izVar = new iz();
        DEFAULT_INSTANCE = izVar;
        com.google.v.du.registerDefaultInstance(iz.class, izVar);
    }

    private iz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDifficulty() {
        this.bitField0_ &= -3;
        this.difficulty_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 3;
    }

    public static iz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static iw newBuilder() {
        return (iw) DEFAULT_INSTANCE.createBuilder();
    }

    public static iz parseDelimitedFrom(InputStream inputStream) {
        return (iz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iz parseFrom(com.google.v.v vVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<iz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDifficulty(ix ixVar) {
        this.difficulty_ = ixVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(iy iyVar) {
        this.type_ = iyVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "type_", hs.p, "difficulty_", hs.o});
        }
        if (iOrdinal == 3) {
            return new iz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new iw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<iz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (iz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ix getDifficulty() {
        ix ixVarA = ix.a(this.difficulty_);
        return ixVarA == null ? ix.DIFFICULTY_EASIEST : ixVarA;
    }

    public iy getType() {
        iy iyVarA = iy.a(this.type_);
        return iyVarA == null ? iy.TYPE_TRAIL : iyVarA;
    }

    public boolean hasDifficulty() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static iw newBuilder(iz izVar) {
        return (iw) DEFAULT_INSTANCE.createBuilder(izVar);
    }

    public static iz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static iz parseFrom(com.google.v.z zVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static iz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static iz parseFrom(InputStream inputStream) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iz parseFrom(ByteBuffer byteBuffer) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static iz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static iz parseFrom(byte[] bArr) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static iz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
