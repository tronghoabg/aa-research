package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bah extends com.google.v.du<bah, bag> implements com.google.v.fj {
    private static final bah DEFAULT_INSTANCE;
    public static final int DELTA_SECONDS_FIELD_NUMBER = 1;
    public static final int DETOUR_ID_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bah> PARSER = null;
    public static final int PREV_ROUTE_REMAINING_SECONDS_FIELD_NUMBER = 2;
    public static final int REASSURANCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private long deltaSeconds_;
    private long detourId_;
    private long prevRouteRemainingSeconds_;
    private boolean reassurance_;

    static {
        bah bahVar = new bah();
        DEFAULT_INSTANCE = bahVar;
        com.google.v.du.registerDefaultInstance(bah.class, bahVar);
    }

    private bah() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeltaSeconds() {
        this.bitField0_ &= -2;
        this.deltaSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourId() {
        this.detourId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrevRouteRemainingSeconds() {
        this.bitField0_ &= -3;
        this.prevRouteRemainingSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReassurance() {
        this.bitField0_ &= -5;
        this.reassurance_ = false;
    }

    public static bah getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bag newBuilder() {
        return (bag) DEFAULT_INSTANCE.createBuilder();
    }

    public static bah parseDelimitedFrom(InputStream inputStream) {
        return (bah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bah parseFrom(com.google.v.v vVar) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bah> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeltaSeconds(long j2) {
        this.bitField0_ |= 1;
        this.deltaSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourId(long j2) {
        this.detourId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevRouteRemainingSeconds(long j2) {
        this.bitField0_ |= 2;
        this.prevRouteRemainingSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReassurance(boolean z) {
        this.bitField0_ |= 4;
        this.reassurance_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001တ\u0000\u0002ဂ\u0001\u0003\u0010\u0004ဇ\u0002", new Object[]{"bitField0_", "deltaSeconds_", "prevRouteRemainingSeconds_", "detourId_", "reassurance_"});
        }
        if (iOrdinal == 3) {
            return new bah();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bah> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bah.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDeltaSeconds() {
        return this.deltaSeconds_;
    }

    public long getDetourId() {
        return this.detourId_;
    }

    public long getPrevRouteRemainingSeconds() {
        return this.prevRouteRemainingSeconds_;
    }

    public boolean getReassurance() {
        return this.reassurance_;
    }

    public boolean hasDeltaSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPrevRouteRemainingSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasReassurance() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bag newBuilder(bah bahVar) {
        return (bag) DEFAULT_INSTANCE.createBuilder(bahVar);
    }

    public static bah parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bah parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bah parseFrom(com.google.v.z zVar) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bah parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bah parseFrom(InputStream inputStream) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bah parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bah parseFrom(ByteBuffer byteBuffer) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bah parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bah parseFrom(byte[] bArr) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bah parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bah) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
