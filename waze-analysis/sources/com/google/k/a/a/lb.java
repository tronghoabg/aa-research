package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lb extends com.google.v.du<lb, la> implements com.google.v.fj {
    public static final int COLUMN_FIELD_NUMBER = 1;
    private static final lb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<lb> PARSER = null;
    public static final int ROW_FIELD_NUMBER = 2;
    private int bitField0_;
    private int column_;
    private int row_;

    static {
        lb lbVar = new lb();
        DEFAULT_INSTANCE = lbVar;
        com.google.v.du.registerDefaultInstance(lb.class, lbVar);
    }

    private lb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColumn() {
        this.bitField0_ &= -2;
        this.column_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRow() {
        this.bitField0_ &= -3;
        this.row_ = 0;
    }

    public static lb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static la newBuilder() {
        return (la) DEFAULT_INSTANCE.createBuilder();
    }

    public static lb parseDelimitedFrom(InputStream inputStream) {
        return (lb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lb parseFrom(com.google.v.v vVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColumn(int i2) {
        this.bitField0_ |= 1;
        this.column_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRow(int i2) {
        this.bitField0_ |= 2;
        this.row_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "column_", "row_"});
        }
        if (iOrdinal == 3) {
            return new lb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new la(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getColumn() {
        return this.column_;
    }

    public int getRow() {
        return this.row_;
    }

    public boolean hasColumn() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRow() {
        return (this.bitField0_ & 2) != 0;
    }

    public static la newBuilder(lb lbVar) {
        return (la) DEFAULT_INSTANCE.createBuilder(lbVar);
    }

    public static lb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lb parseFrom(com.google.v.z zVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lb parseFrom(InputStream inputStream) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lb parseFrom(ByteBuffer byteBuffer) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lb parseFrom(byte[] bArr) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
