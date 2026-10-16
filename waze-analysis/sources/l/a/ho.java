package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ho extends com.google.v.du<ho, hn> implements hp {
    private static final ho DEFAULT_INSTANCE;
    public static final int INTERVAL_FROM_PREV_SAMPLE_MS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ho> PARSER = null;
    public static final int RELATIVE_POWER_FIELD_NUMBER = 2;
    private int bitField0_;
    private long intervalFromPrevSampleMs_;
    private long relativePower_;

    static {
        ho hoVar = new ho();
        DEFAULT_INSTANCE = hoVar;
        com.google.v.du.registerDefaultInstance(ho.class, hoVar);
    }

    private ho() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntervalFromPrevSampleMs() {
        this.bitField0_ &= -2;
        this.intervalFromPrevSampleMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelativePower() {
        this.bitField0_ &= -3;
        this.relativePower_ = 0L;
    }

    public static ho getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hn newBuilder() {
        return (hn) DEFAULT_INSTANCE.createBuilder();
    }

    public static ho parseDelimitedFrom(InputStream inputStream) {
        return (ho) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ho parseFrom(com.google.v.v vVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ho> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntervalFromPrevSampleMs(long j2) {
        this.bitField0_ |= 1;
        this.intervalFromPrevSampleMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelativePower(long j2) {
        this.bitField0_ |= 2;
        this.relativePower_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002တ\u0001", new Object[]{"bitField0_", "intervalFromPrevSampleMs_", "relativePower_"});
        }
        if (iOrdinal == 3) {
            return new ho();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ho> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ho.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getIntervalFromPrevSampleMs() {
        return this.intervalFromPrevSampleMs_;
    }

    public long getRelativePower() {
        return this.relativePower_;
    }

    public boolean hasIntervalFromPrevSampleMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRelativePower() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hn newBuilder(ho hoVar) {
        return (hn) DEFAULT_INSTANCE.createBuilder(hoVar);
    }

    public static ho parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ho) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ho parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ho parseFrom(com.google.v.z zVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ho parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ho parseFrom(InputStream inputStream) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ho parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ho parseFrom(ByteBuffer byteBuffer) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ho parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ho parseFrom(byte[] bArr) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ho parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
