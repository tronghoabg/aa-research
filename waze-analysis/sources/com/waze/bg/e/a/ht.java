package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ht extends com.google.v.du<ht, hr> implements com.google.v.fj {
    public static final int ARRIVAL_IN_EPOCH_SECONDS_FIELD_NUMBER = 2;
    private static final ht DEFAULT_INSTANCE;
    public static final int DEPARTURE_IN_EPOCH_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ht> PARSER;
    private int timeOneofCase_ = 0;
    private Object timeOneof_;

    static {
        ht htVar = new ht();
        DEFAULT_INSTANCE = htVar;
        com.google.v.du.registerDefaultInstance(ht.class, htVar);
    }

    private ht() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrivalInEpochSeconds() {
        if (this.timeOneofCase_ == 2) {
            this.timeOneofCase_ = 0;
            this.timeOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepartureInEpochSeconds() {
        if (this.timeOneofCase_ == 1) {
            this.timeOneofCase_ = 0;
            this.timeOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOneof() {
        this.timeOneofCase_ = 0;
        this.timeOneof_ = null;
    }

    public static ht getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hr newBuilder() {
        return (hr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ht parseDelimitedFrom(InputStream inputStream) {
        return (ht) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ht parseFrom(com.google.v.v vVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ht> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrivalInEpochSeconds(long j2) {
        this.timeOneofCase_ = 2;
        this.timeOneof_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDepartureInEpochSeconds(long j2) {
        this.timeOneofCase_ = 1;
        this.timeOneof_ = Long.valueOf(j2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"timeOneof_", "timeOneofCase_"});
        }
        if (iOrdinal == 3) {
            return new ht();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ht> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ht.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getArrivalInEpochSeconds() {
        if (this.timeOneofCase_ == 2) {
            return ((Long) this.timeOneof_).longValue();
        }
        return 0L;
    }

    public long getDepartureInEpochSeconds() {
        if (this.timeOneofCase_ == 1) {
            return ((Long) this.timeOneof_).longValue();
        }
        return 0L;
    }

    public hs getTimeOneofCase() {
        int i2 = this.timeOneofCase_;
        if (i2 == 0) {
            return hs.f16716c;
        }
        if (i2 == 1) {
            return hs.f16714a;
        }
        if (i2 != 2) {
            return null;
        }
        return hs.f16715b;
    }

    public boolean hasArrivalInEpochSeconds() {
        return this.timeOneofCase_ == 2;
    }

    public boolean hasDepartureInEpochSeconds() {
        return this.timeOneofCase_ == 1;
    }

    public static hr newBuilder(ht htVar) {
        return (hr) DEFAULT_INSTANCE.createBuilder(htVar);
    }

    public static ht parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ht) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ht parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ht parseFrom(com.google.v.z zVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ht parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ht parseFrom(InputStream inputStream) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ht parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ht parseFrom(ByteBuffer byteBuffer) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ht parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ht parseFrom(byte[] bArr) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ht parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
