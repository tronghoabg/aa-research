package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqu extends com.google.v.du<bqu, bqt> implements com.google.v.fj {
    private static final bqu DEFAULT_INSTANCE;
    public static final int FRESH_LOCATION_AVAILABLE_FIELD_NUMBER = 1;
    public static final int LOCATION_TIMESTAMP_MS_FIELD_NUMBER = 2;
    public static final int LOGGED_IN_FIELD_NUMBER = 4;
    public static final int NETWORK_AVAILABLE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bqu> PARSER;
    private int bitField0_;
    private boolean freshLocationAvailable_;
    private long locationTimestampMs_;
    private boolean loggedIn_;
    private boolean networkAvailable_;

    static {
        bqu bquVar = new bqu();
        DEFAULT_INSTANCE = bquVar;
        com.google.v.du.registerDefaultInstance(bqu.class, bquVar);
    }

    private bqu() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoggedIn() {
        this.bitField0_ &= -9;
        this.loggedIn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkAvailable() {
        this.bitField0_ &= -5;
        this.networkAvailable_ = false;
    }

    public static bqu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bqt newBuilder() {
        return (bqt) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqu parseDelimitedFrom(InputStream inputStream) {
        return (bqu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqu parseFrom(com.google.v.v vVar) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqu> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggedIn(boolean z) {
        this.bitField0_ |= 8;
        this.loggedIn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkAvailable(boolean z) {
        this.bitField0_ |= 4;
        this.networkAvailable_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "freshLocationAvailable_", "locationTimestampMs_", "networkAvailable_", "loggedIn_"});
        }
        if (iOrdinal == 3) {
            return new bqu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqu.class) {
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

    public boolean getLoggedIn() {
        return this.loggedIn_;
    }

    public boolean getNetworkAvailable() {
        return this.networkAvailable_;
    }

    public boolean hasFreshLocationAvailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLocationTimestampMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLoggedIn() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNetworkAvailable() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bqt newBuilder(bqu bquVar) {
        return (bqt) DEFAULT_INSTANCE.createBuilder(bquVar);
    }

    public static bqu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqu parseFrom(com.google.v.z zVar) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqu parseFrom(InputStream inputStream) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqu parseFrom(ByteBuffer byteBuffer) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqu parseFrom(byte[] bArr) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
