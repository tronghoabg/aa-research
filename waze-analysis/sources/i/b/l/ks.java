package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ks extends com.google.v.du<ks, kr> implements com.google.v.fj {
    private static final ks DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ks> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int bitField0_;
    private long reason_;

    static {
        ks ksVar = new ks();
        DEFAULT_INSTANCE = ksVar;
        com.google.v.du.registerDefaultInstance(ks.class, ksVar);
    }

    private ks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.bitField0_ &= -2;
        this.reason_ = 0L;
    }

    public static ks getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kr newBuilder() {
        return (kr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ks parseDelimitedFrom(InputStream inputStream) {
        return (ks) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ks parseFrom(com.google.v.v vVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ks> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(long j2) {
        this.bitField0_ |= 1;
        this.reason_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new ks();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ks> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ks.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getReason() {
        return this.reason_;
    }

    public boolean hasReason() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kr newBuilder(ks ksVar) {
        return (kr) DEFAULT_INSTANCE.createBuilder(ksVar);
    }

    public static ks parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ks) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ks parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ks parseFrom(com.google.v.z zVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ks parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ks parseFrom(InputStream inputStream) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ks parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ks parseFrom(ByteBuffer byteBuffer) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ks parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ks parseFrom(byte[] bArr) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ks parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
