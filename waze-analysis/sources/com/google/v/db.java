package com.google.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class db extends du<db, da> implements fj {
    private static final db DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile fo<db> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        db dbVar = new db();
        DEFAULT_INSTANCE = dbVar;
        du.registerDefaultInstance(db.class, dbVar);
    }

    private db() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
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

    public static db parseFrom(v vVar) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<db> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i2) {
        this.nanos_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long j2) {
        this.seconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
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
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public long getSeconds() {
        return this.seconds_;
    }

    public static da newBuilder(db dbVar) {
        return (da) DEFAULT_INSTANCE.createBuilder(dbVar);
    }

    public static db parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (db) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static db parseFrom(v vVar, de deVar) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static db parseFrom(z zVar) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static db parseFrom(z zVar, de deVar) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static db parseFrom(InputStream inputStream) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static db parseFrom(InputStream inputStream, de deVar) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static db parseFrom(ByteBuffer byteBuffer) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static db parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static db parseFrom(byte[] bArr) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static db parseFrom(byte[] bArr, de deVar) {
        return (db) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
