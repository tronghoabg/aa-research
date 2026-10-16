package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bdp extends com.google.v.du<bdp, bdo> implements com.google.v.fj {
    private static final bdp DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_DESTINATION_METERS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bdp> PARSER;
    private int bitField0_;
    private long distanceToDestinationMeters_;

    static {
        bdp bdpVar = new bdp();
        DEFAULT_INSTANCE = bdpVar;
        com.google.v.du.registerDefaultInstance(bdp.class, bdpVar);
    }

    private bdp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToDestinationMeters() {
        this.bitField0_ &= -2;
        this.distanceToDestinationMeters_ = 0L;
    }

    public static bdp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bdo newBuilder() {
        return (bdo) DEFAULT_INSTANCE.createBuilder();
    }

    public static bdp parseDelimitedFrom(InputStream inputStream) {
        return (bdp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdp parseFrom(com.google.v.v vVar) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bdp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToDestinationMeters(long j2) {
        this.bitField0_ |= 1;
        this.distanceToDestinationMeters_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "distanceToDestinationMeters_"});
        }
        if (iOrdinal == 3) {
            return new bdp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bdo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bdp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bdp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDistanceToDestinationMeters() {
        return this.distanceToDestinationMeters_;
    }

    public boolean hasDistanceToDestinationMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bdo newBuilder(bdp bdpVar) {
        return (bdo) DEFAULT_INSTANCE.createBuilder(bdpVar);
    }

    public static bdp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bdp parseFrom(com.google.v.z zVar) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bdp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bdp parseFrom(InputStream inputStream) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdp parseFrom(ByteBuffer byteBuffer) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bdp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bdp parseFrom(byte[] bArr) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bdp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bdp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
