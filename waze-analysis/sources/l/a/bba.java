package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bba extends com.google.v.du<bba, baz> implements com.google.v.fj {
    private static final bba DEFAULT_INSTANCE;
    public static final int FRESH_LOCATION_AVAILABLE_FIELD_NUMBER = 1;
    public static final int LOCATION_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bba> PARSER;
    private int bitField0_;
    private boolean freshLocationAvailable_;
    private long locationTimestampMs_;

    static {
        bba bbaVar = new bba();
        DEFAULT_INSTANCE = bbaVar;
        com.google.v.du.registerDefaultInstance(bba.class, bbaVar);
    }

    private bba() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreshLocationAvailable() {
        this.bitField0_ &= -2;
        this.freshLocationAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationTimestampMs() {
        this.bitField0_ &= -3;
        this.locationTimestampMs_ = 0L;
    }

    public static bba getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static baz newBuilder() {
        return (baz) DEFAULT_INSTANCE.createBuilder();
    }

    public static bba parseDelimitedFrom(InputStream inputStream) {
        return (bba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bba parseFrom(com.google.v.v vVar) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bba> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreshLocationAvailable(boolean z) {
        this.bitField0_ |= 1;
        this.freshLocationAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationTimestampMs(long j2) {
        this.bitField0_ |= 2;
        this.locationTimestampMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "freshLocationAvailable_", "locationTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new bba();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new baz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bba> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bba.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getFreshLocationAvailable() {
        return this.freshLocationAvailable_;
    }

    public long getLocationTimestampMs() {
        return this.locationTimestampMs_;
    }

    public boolean hasFreshLocationAvailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLocationTimestampMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static baz newBuilder(bba bbaVar) {
        return (baz) DEFAULT_INSTANCE.createBuilder(bbaVar);
    }

    public static bba parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bba parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bba parseFrom(com.google.v.z zVar) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bba parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bba parseFrom(InputStream inputStream) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bba parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bba parseFrom(ByteBuffer byteBuffer) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bba parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bba parseFrom(byte[] bArr) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bba parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
