package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ha extends com.google.v.du<ha, gz> implements com.google.v.fj {
    private static final ha DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ha> PARSER = null;
    public static final int PERCENT_REMAINING_FIELD_NUMBER = 2;
    public static final int TIME_REMAINING_SECONDS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long percentRemaining_;
    private long timeRemainingSeconds_;

    static {
        ha haVar = new ha();
        DEFAULT_INSTANCE = haVar;
        com.google.v.du.registerDefaultInstance(ha.class, haVar);
    }

    private ha() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPercentRemaining() {
        this.bitField0_ &= -3;
        this.percentRemaining_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeRemainingSeconds() {
        this.bitField0_ &= -2;
        this.timeRemainingSeconds_ = 0L;
    }

    public static ha getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gz newBuilder() {
        return (gz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ha parseDelimitedFrom(InputStream inputStream) {
        return (ha) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ha parseFrom(com.google.v.v vVar) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ha> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPercentRemaining(long j2) {
        this.bitField0_ |= 2;
        this.percentRemaining_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeRemainingSeconds(long j2) {
        this.bitField0_ |= 1;
        this.timeRemainingSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "timeRemainingSeconds_", "percentRemaining_"});
        }
        if (iOrdinal == 3) {
            return new ha();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ha> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ha.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getPercentRemaining() {
        return this.percentRemaining_;
    }

    public long getTimeRemainingSeconds() {
        return this.timeRemainingSeconds_;
    }

    public boolean hasPercentRemaining() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimeRemainingSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gz newBuilder(ha haVar) {
        return (gz) DEFAULT_INSTANCE.createBuilder(haVar);
    }

    public static ha parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ha) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ha parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ha parseFrom(com.google.v.z zVar) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ha parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ha parseFrom(InputStream inputStream) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ha parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ha parseFrom(ByteBuffer byteBuffer) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ha parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ha parseFrom(byte[] bArr) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ha parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ha) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
