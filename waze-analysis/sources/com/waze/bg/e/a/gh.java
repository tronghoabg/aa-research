package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gh extends com.google.v.du<gh, gg> implements com.google.v.fj {
    private static final gh DEFAULT_INSTANCE;
    public static final int NEXT_UPDATE_EPOCH_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gh> PARSER;
    private int bitField0_;
    private long nextUpdateEpochSeconds_;

    static {
        gh ghVar = new gh();
        DEFAULT_INSTANCE = ghVar;
        com.google.v.du.registerDefaultInstance(gh.class, ghVar);
    }

    private gh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextUpdateEpochSeconds() {
        this.bitField0_ &= -2;
        this.nextUpdateEpochSeconds_ = 0L;
    }

    public static gh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gg newBuilder() {
        return (gg) DEFAULT_INSTANCE.createBuilder();
    }

    public static gh parseDelimitedFrom(InputStream inputStream) {
        return (gh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gh parseFrom(com.google.v.v vVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextUpdateEpochSeconds(long j2) {
        this.bitField0_ |= 1;
        this.nextUpdateEpochSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "nextUpdateEpochSeconds_"});
        }
        if (iOrdinal == 3) {
            return new gh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getNextUpdateEpochSeconds() {
        return this.nextUpdateEpochSeconds_;
    }

    public boolean hasNextUpdateEpochSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gg newBuilder(gh ghVar) {
        return (gg) DEFAULT_INSTANCE.createBuilder(ghVar);
    }

    public static gh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gh parseFrom(com.google.v.z zVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gh parseFrom(InputStream inputStream) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gh parseFrom(ByteBuffer byteBuffer) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gh parseFrom(byte[] bArr) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
