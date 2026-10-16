package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class awc extends com.google.v.du<awc, awb> implements com.google.v.fj {
    private static final awc DEFAULT_INSTANCE;
    public static final int ETA_CHANGE_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<awc> PARSER;
    private int bitField0_;
    private long etaChangeSeconds_;

    static {
        awc awcVar = new awc();
        DEFAULT_INSTANCE = awcVar;
        com.google.v.du.registerDefaultInstance(awc.class, awcVar);
    }

    private awc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaChangeSeconds() {
        this.bitField0_ &= -2;
        this.etaChangeSeconds_ = 0L;
    }

    public static awc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static awb newBuilder() {
        return (awb) DEFAULT_INSTANCE.createBuilder();
    }

    public static awc parseDelimitedFrom(InputStream inputStream) {
        return (awc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awc parseFrom(com.google.v.v vVar) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<awc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaChangeSeconds(long j2) {
        this.bitField0_ |= 1;
        this.etaChangeSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001တ\u0000", new Object[]{"bitField0_", "etaChangeSeconds_"});
        }
        if (iOrdinal == 3) {
            return new awc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new awb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<awc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (awc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEtaChangeSeconds() {
        return this.etaChangeSeconds_;
    }

    public boolean hasEtaChangeSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static awb newBuilder(awc awcVar) {
        return (awb) DEFAULT_INSTANCE.createBuilder(awcVar);
    }

    public static awc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static awc parseFrom(com.google.v.z zVar) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static awc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static awc parseFrom(InputStream inputStream) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static awc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static awc parseFrom(ByteBuffer byteBuffer) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static awc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static awc parseFrom(byte[] bArr) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static awc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (awc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
