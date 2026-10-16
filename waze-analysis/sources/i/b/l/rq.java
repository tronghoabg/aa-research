package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rq extends com.google.v.du<rq, rp> implements com.google.v.fj {
    private static final rq DEFAULT_INSTANCE;
    public static final int MINPASSENGERS_FIELD_NUMBER = 2;
    public static final int NORMALROUTEALTID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<rq> PARSER;
    private int bitField0_;
    private int minPassengers_;
    private long normalRouteAltId_;

    static {
        rq rqVar = new rq();
        DEFAULT_INSTANCE = rqVar;
        com.google.v.du.registerDefaultInstance(rq.class, rqVar);
    }

    private rq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinPassengers() {
        this.bitField0_ &= -3;
        this.minPassengers_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalRouteAltId() {
        this.bitField0_ &= -2;
        this.normalRouteAltId_ = 0L;
    }

    public static rq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static rp newBuilder() {
        return (rp) DEFAULT_INSTANCE.createBuilder();
    }

    public static rq parseDelimitedFrom(InputStream inputStream) {
        return (rq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rq parseFrom(com.google.v.v vVar) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinPassengers(int i2) {
        this.bitField0_ |= 2;
        this.minPassengers_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalRouteAltId(long j2) {
        this.bitField0_ |= 1;
        this.normalRouteAltId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "normalRouteAltId_", "minPassengers_"});
        }
        if (iOrdinal == 3) {
            return new rq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getMinPassengers() {
        return this.minPassengers_;
    }

    public long getNormalRouteAltId() {
        return this.normalRouteAltId_;
    }

    public boolean hasMinPassengers() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNormalRouteAltId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rp newBuilder(rq rqVar) {
        return (rp) DEFAULT_INSTANCE.createBuilder(rqVar);
    }

    public static rq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rq parseFrom(com.google.v.z zVar) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rq parseFrom(InputStream inputStream) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rq parseFrom(ByteBuffer byteBuffer) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rq parseFrom(byte[] bArr) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
