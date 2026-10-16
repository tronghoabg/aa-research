package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ky extends com.google.v.du<ky, kx> implements com.google.v.fj {
    private static final ky DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ky> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int bitField0_;
    private long reason_;

    static {
        ky kyVar = new ky();
        DEFAULT_INSTANCE = kyVar;
        com.google.v.du.registerDefaultInstance(ky.class, kyVar);
    }

    private ky() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.bitField0_ &= -2;
        this.reason_ = 0L;
    }

    public static ky getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kx newBuilder() {
        return (kx) DEFAULT_INSTANCE.createBuilder();
    }

    public static ky parseDelimitedFrom(InputStream inputStream) {
        return (ky) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ky parseFrom(com.google.v.v vVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ky> parser() {
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
            return new ky();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ky> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ky.class) {
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

    public static kx newBuilder(ky kyVar) {
        return (kx) DEFAULT_INSTANCE.createBuilder(kyVar);
    }

    public static ky parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ky) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ky parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ky parseFrom(com.google.v.z zVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ky parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ky parseFrom(InputStream inputStream) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ky parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ky parseFrom(ByteBuffer byteBuffer) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ky parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ky parseFrom(byte[] bArr) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ky parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
