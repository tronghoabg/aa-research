package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qc extends com.google.v.du<qc, qb> implements com.google.v.fj {
    public static final int ALTID_FIELD_NUMBER = 2;
    private static final qc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<qc> PARSER = null;
    public static final int ROUTEID_FIELD_NUMBER = 1;
    private long altId_;
    private int bitField0_;
    private long routeId_;

    static {
        qc qcVar = new qc();
        DEFAULT_INSTANCE = qcVar;
        com.google.v.du.registerDefaultInstance(qc.class, qcVar);
    }

    private qc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltId() {
        this.bitField0_ &= -3;
        this.altId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteId() {
        this.bitField0_ &= -2;
        this.routeId_ = 0L;
    }

    public static qc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qb newBuilder() {
        return (qb) DEFAULT_INSTANCE.createBuilder();
    }

    public static qc parseDelimitedFrom(InputStream inputStream) {
        return (qc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qc parseFrom(com.google.v.v vVar) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltId(long j2) {
        this.bitField0_ |= 2;
        this.altId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteId(long j2) {
        this.bitField0_ |= 1;
        this.routeId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "routeId_", "altId_"});
        }
        if (iOrdinal == 3) {
            return new qc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAltId() {
        return this.altId_;
    }

    public long getRouteId() {
        return this.routeId_;
    }

    public boolean hasAltId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qb newBuilder(qc qcVar) {
        return (qb) DEFAULT_INSTANCE.createBuilder(qcVar);
    }

    public static qc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qc parseFrom(com.google.v.z zVar) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qc parseFrom(InputStream inputStream) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qc parseFrom(ByteBuffer byteBuffer) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qc parseFrom(byte[] bArr) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
