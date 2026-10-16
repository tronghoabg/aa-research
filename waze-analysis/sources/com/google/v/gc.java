package com.google.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gc extends du<gc, gb> implements fj {
    private static final gc DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile fo<gc> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        gc gcVar = new gc();
        DEFAULT_INSTANCE = gcVar;
        du.registerDefaultInstance(gc.class, gcVar);
    }

    private gc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static gc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gb newBuilder() {
        return (gb) DEFAULT_INSTANCE.createBuilder();
    }

    public static gc parseDelimitedFrom(InputStream inputStream) {
        return (gc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gc parseFrom(v vVar) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<gc> parser() {
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
            return new gc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<gc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gc.class) {
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

    public static gb newBuilder(gc gcVar) {
        return (gb) DEFAULT_INSTANCE.createBuilder(gcVar);
    }

    public static gc parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (gc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gc parseFrom(v vVar, de deVar) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gc parseFrom(z zVar) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gc parseFrom(z zVar, de deVar) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gc parseFrom(InputStream inputStream) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gc parseFrom(InputStream inputStream, de deVar) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gc parseFrom(ByteBuffer byteBuffer) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gc parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gc parseFrom(byte[] bArr) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gc parseFrom(byte[] bArr, de deVar) {
        return (gc) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
