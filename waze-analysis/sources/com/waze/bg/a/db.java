package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class db extends com.google.v.du<db, da> implements fj {
    private static final db DEFAULT_INSTANCE;
    private static volatile fo<db> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        db dbVar = new db();
        DEFAULT_INSTANCE = dbVar;
        com.google.v.du.registerDefaultInstance(db.class, dbVar);
    }

    private db() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static db getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static da newBuilder() {
        return (da) DEFAULT_INSTANCE.createBuilder();
    }

    public static db parseDelimitedFrom(InputStream inputStream) {
        return (db) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static db parseFrom(com.google.v.v vVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<db> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bz bzVar) {
        this.type_ = bzVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "type_", o.t});
        }
        if (iOrdinal == 3) {
            return new db();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new da(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<db> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (db.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bz getType() {
        bz bzVarA = bz.a(this.type_);
        return bzVarA == null ? bz.TURN_CLOSURE_UNSPECIFIED : bzVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static da newBuilder(db dbVar) {
        return (da) DEFAULT_INSTANCE.createBuilder(dbVar);
    }

    public static db parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (db) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static db parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static db parseFrom(com.google.v.z zVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static db parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static db parseFrom(InputStream inputStream) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static db parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static db parseFrom(ByteBuffer byteBuffer) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static db parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static db parseFrom(byte[] bArr) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static db parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
