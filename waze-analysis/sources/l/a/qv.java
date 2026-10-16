package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qv extends com.google.v.du<qv, qt> implements com.google.v.fj {
    private static final qv DEFAULT_INSTANCE;
    public static final int DESTINATION_REPORTING_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<qv> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private rg destinationReportingInfo_;
    private int reason_;

    static {
        qv qvVar = new qv();
        DEFAULT_INSTANCE = qvVar;
        com.google.v.du.registerDefaultInstance(qv.class, qvVar);
    }

    private qv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationReportingInfo() {
        this.destinationReportingInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static qv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationReportingInfo(rg rgVar) {
        Objects.requireNonNull(rgVar);
        rg rgVar2 = this.destinationReportingInfo_;
        if (rgVar2 != null && rgVar2 != rg.getDefaultInstance()) {
            qw qwVarNewBuilder = rg.newBuilder(rgVar2);
            qwVarNewBuilder.mergeFrom((qw) rgVar);
            rgVar = qwVarNewBuilder.buildPartial();
        }
        this.destinationReportingInfo_ = rgVar;
        this.bitField0_ |= 1;
    }

    public static qt newBuilder() {
        return (qt) DEFAULT_INSTANCE.createBuilder();
    }

    public static qv parseDelimitedFrom(InputStream inputStream) {
        return (qv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qv parseFrom(com.google.v.v vVar) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingInfo(rg rgVar) {
        Objects.requireNonNull(rgVar);
        this.destinationReportingInfo_ = rgVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(qu quVar) {
        this.reason_ = quVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "destinationReportingInfo_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new qv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public rg getDestinationReportingInfo() {
        rg rgVar = this.destinationReportingInfo_;
        return rgVar == null ? rg.getDefaultInstance() : rgVar;
    }

    public qu getReason() {
        int i2 = this.reason_;
        qu quVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : qu.TIMER_EXPIRED : qu.CLOSE : qu.REASON_UNSPECIFIED;
        return quVar == null ? qu.UNRECOGNIZED : quVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasDestinationReportingInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qt newBuilder(qv qvVar) {
        return (qt) DEFAULT_INSTANCE.createBuilder(qvVar);
    }

    public static qv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qv parseFrom(com.google.v.z zVar) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qv parseFrom(InputStream inputStream) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qv parseFrom(ByteBuffer byteBuffer) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qv parseFrom(byte[] bArr) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
