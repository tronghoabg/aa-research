package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class rj extends com.google.v.du<rj, rh> implements com.google.v.fj {
    private static final rj DEFAULT_INSTANCE;
    public static final int DESTINATION_REPORTING_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<rj> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private rg destinationReportingInfo_;
    private int reason_;

    static {
        rj rjVar = new rj();
        DEFAULT_INSTANCE = rjVar;
        com.google.v.du.registerDefaultInstance(rj.class, rjVar);
    }

    private rj() {
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

    public static rj getDefaultInstance() {
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

    public static rh newBuilder() {
        return (rh) DEFAULT_INSTANCE.createBuilder();
    }

    public static rj parseDelimitedFrom(InputStream inputStream) {
        return (rj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rj parseFrom(com.google.v.v vVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingInfo(rg rgVar) {
        Objects.requireNonNull(rgVar);
        this.destinationReportingInfo_ = rgVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(ri riVar) {
        this.reason_ = riVar.getNumber();
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
            return new rj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rj.class) {
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

    public ri getReason() {
        int i2 = this.reason_;
        ri riVar = i2 != 0 ? i2 != 1 ? null : ri.ANOTHER_QUESTION_SHOWN : ri.REASON_UNSPECIFIED;
        return riVar == null ? ri.UNRECOGNIZED : riVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasDestinationReportingInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static rh newBuilder(rj rjVar) {
        return (rh) DEFAULT_INSTANCE.createBuilder(rjVar);
    }

    public static rj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rj parseFrom(com.google.v.z zVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rj parseFrom(InputStream inputStream) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rj parseFrom(ByteBuffer byteBuffer) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rj parseFrom(byte[] bArr) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
