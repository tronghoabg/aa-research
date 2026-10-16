package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class uy extends com.google.v.du<uy, ux> implements com.google.v.fj {
    private static final uy DEFAULT_INSTANCE;
    public static final int ETA_DELTA_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<uy> PARSER;
    private int bitField0_;
    private long etaDeltaSeconds_;

    static {
        uy uyVar = new uy();
        DEFAULT_INSTANCE = uyVar;
        com.google.v.du.registerDefaultInstance(uy.class, uyVar);
    }

    private uy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaDeltaSeconds() {
        this.bitField0_ &= -2;
        this.etaDeltaSeconds_ = 0L;
    }

    public static uy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ux newBuilder() {
        return (ux) DEFAULT_INSTANCE.createBuilder();
    }

    public static uy parseDelimitedFrom(InputStream inputStream) {
        return (uy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uy parseFrom(com.google.v.v vVar) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<uy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaDeltaSeconds(long j2) {
        this.bitField0_ |= 1;
        this.etaDeltaSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001တ\u0000", new Object[]{"bitField0_", "etaDeltaSeconds_"});
        }
        if (iOrdinal == 3) {
            return new uy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ux(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<uy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (uy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEtaDeltaSeconds() {
        return this.etaDeltaSeconds_;
    }

    public boolean hasEtaDeltaSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ux newBuilder(uy uyVar) {
        return (ux) DEFAULT_INSTANCE.createBuilder(uyVar);
    }

    public static uy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static uy parseFrom(com.google.v.z zVar) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static uy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static uy parseFrom(InputStream inputStream) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uy parseFrom(ByteBuffer byteBuffer) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static uy parseFrom(byte[] bArr) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static uy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (uy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
