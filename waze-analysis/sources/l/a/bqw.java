package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqw extends com.google.v.du<bqw, bqv> implements com.google.v.fj {
    private static final bqw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bqw> PARSER = null;
    public static final int WALKING_TIME_SECONDS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long walkingTimeSeconds_;

    static {
        bqw bqwVar = new bqw();
        DEFAULT_INSTANCE = bqwVar;
        com.google.v.du.registerDefaultInstance(bqw.class, bqwVar);
    }

    private bqw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingTimeSeconds() {
        this.bitField0_ &= -2;
        this.walkingTimeSeconds_ = 0L;
    }

    public static bqw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bqv newBuilder() {
        return (bqv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqw parseDelimitedFrom(InputStream inputStream) {
        return (bqw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqw parseFrom(com.google.v.v vVar) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingTimeSeconds(long j2) {
        this.bitField0_ |= 1;
        this.walkingTimeSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "walkingTimeSeconds_"});
        }
        if (iOrdinal == 3) {
            return new bqw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getWalkingTimeSeconds() {
        return this.walkingTimeSeconds_;
    }

    public boolean hasWalkingTimeSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bqv newBuilder(bqw bqwVar) {
        return (bqv) DEFAULT_INSTANCE.createBuilder(bqwVar);
    }

    public static bqw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqw parseFrom(com.google.v.z zVar) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqw parseFrom(InputStream inputStream) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqw parseFrom(ByteBuffer byteBuffer) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqw parseFrom(byte[] bArr) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
