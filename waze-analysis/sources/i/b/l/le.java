package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class le extends com.google.v.du<le, ld> implements com.google.v.fj {
    private static final le DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<le> PARSER = null;
    public static final int SERVER_DEBUG_STRING_FIELD_NUMBER = 3;
    public static final int SERVER_HOSTNAME_FIELD_NUMBER = 2;
    public static final int SERVER_PROCESSING_TIME_MSEC_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int bitField0_;
    private long serverProcessingTimeMsec_;
    private long timestamp_;
    private String serverHostname_ = "";
    private String serverDebugString_ = "";

    static {
        le leVar = new le();
        DEFAULT_INSTANCE = leVar;
        com.google.v.du.registerDefaultInstance(le.class, leVar);
    }

    private le() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerDebugString() {
        this.bitField0_ &= -5;
        this.serverDebugString_ = getDefaultInstance().getServerDebugString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerHostname() {
        this.bitField0_ &= -3;
        this.serverHostname_ = getDefaultInstance().getServerHostname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerProcessingTimeMsec() {
        this.bitField0_ &= -9;
        this.serverProcessingTimeMsec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.bitField0_ &= -2;
        this.timestamp_ = 0L;
    }

    public static le getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ld newBuilder() {
        return (ld) DEFAULT_INSTANCE.createBuilder();
    }

    public static le parseDelimitedFrom(InputStream inputStream) {
        return (le) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static le parseFrom(com.google.v.v vVar) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<le> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerDebugString(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.serverDebugString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerDebugStringBytes(com.google.v.v vVar) {
        this.serverDebugString_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerHostname(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.serverHostname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerHostnameBytes(com.google.v.v vVar) {
        this.serverHostname_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerProcessingTimeMsec(long j2) {
        this.bitField0_ |= 8;
        this.serverProcessingTimeMsec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j2) {
        this.bitField0_ |= 1;
        this.timestamp_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "timestamp_", "serverHostname_", "serverDebugString_", "serverProcessingTimeMsec_"});
        }
        if (iOrdinal == 3) {
            return new le();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ld(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<le> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (le.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getServerDebugString() {
        return this.serverDebugString_;
    }

    public com.google.v.v getServerDebugStringBytes() {
        return com.google.v.v.s(this.serverDebugString_);
    }

    public String getServerHostname() {
        return this.serverHostname_;
    }

    public com.google.v.v getServerHostnameBytes() {
        return com.google.v.v.s(this.serverHostname_);
    }

    public long getServerProcessingTimeMsec() {
        return this.serverProcessingTimeMsec_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public boolean hasServerDebugString() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasServerHostname() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasServerProcessingTimeMsec() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ld newBuilder(le leVar) {
        return (ld) DEFAULT_INSTANCE.createBuilder(leVar);
    }

    public static le parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (le) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static le parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static le parseFrom(com.google.v.z zVar) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static le parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static le parseFrom(InputStream inputStream) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static le parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static le parseFrom(ByteBuffer byteBuffer) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static le parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static le parseFrom(byte[] bArr) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static le parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (le) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
