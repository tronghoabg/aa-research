package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ahe extends com.google.v.du<ahe, ahd> implements com.google.v.fj {
    private static final ahe DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ahe> PARSER = null;
    public static final int UPTIME_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long uptimeMs_;

    static {
        ahe aheVar = new ahe();
        DEFAULT_INSTANCE = aheVar;
        com.google.v.du.registerDefaultInstance(ahe.class, aheVar);
    }

    private ahe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUptimeMs() {
        this.bitField0_ &= -2;
        this.uptimeMs_ = 0L;
    }

    public static ahe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ahd newBuilder() {
        return (ahd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ahe parseDelimitedFrom(InputStream inputStream) {
        return (ahe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahe parseFrom(com.google.v.v vVar) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ahe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUptimeMs(long j2) {
        this.bitField0_ |= 1;
        this.uptimeMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "uptimeMs_"});
        }
        if (iOrdinal == 3) {
            return new ahe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ahd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ahe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ahe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getUptimeMs() {
        return this.uptimeMs_;
    }

    public boolean hasUptimeMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ahd newBuilder(ahe aheVar) {
        return (ahd) DEFAULT_INSTANCE.createBuilder(aheVar);
    }

    public static ahe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ahe parseFrom(com.google.v.z zVar) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ahe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ahe parseFrom(InputStream inputStream) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahe parseFrom(ByteBuffer byteBuffer) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ahe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ahe parseFrom(byte[] bArr) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ahe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ahe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
