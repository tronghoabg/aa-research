package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qs extends com.google.v.du<qs, qr> implements com.google.v.fj {
    private static final qs DEFAULT_INSTANCE;
    public static final int DESTINATION_REPORTING_INFO_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<qs> PARSER = null;
    public static final int SELECTED_ANSWER_FIELD_NUMBER = 2;
    private int bitField0_;
    private rg destinationReportingInfo_;
    private qz selectedAnswer_;

    static {
        qs qsVar = new qs();
        DEFAULT_INSTANCE = qsVar;
        com.google.v.du.registerDefaultInstance(qs.class, qsVar);
    }

    private qs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationReportingInfo() {
        this.destinationReportingInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedAnswer() {
        this.selectedAnswer_ = null;
        this.bitField0_ &= -3;
    }

    public static qs getDefaultInstance() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelectedAnswer(qz qzVar) {
        Objects.requireNonNull(qzVar);
        qz qzVar2 = this.selectedAnswer_;
        if (qzVar2 != null && qzVar2 != qz.getDefaultInstance()) {
            qy qyVarNewBuilder = qz.newBuilder(qzVar2);
            qyVarNewBuilder.mergeFrom((qy) qzVar);
            qzVar = qyVarNewBuilder.buildPartial();
        }
        this.selectedAnswer_ = qzVar;
        this.bitField0_ |= 2;
    }

    public static qr newBuilder() {
        return (qr) DEFAULT_INSTANCE.createBuilder();
    }

    public static qs parseDelimitedFrom(InputStream inputStream) {
        return (qs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qs parseFrom(com.google.v.v vVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationReportingInfo(rg rgVar) {
        Objects.requireNonNull(rgVar);
        this.destinationReportingInfo_ = rgVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedAnswer(qz qzVar) {
        Objects.requireNonNull(qzVar);
        this.selectedAnswer_ = qzVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "destinationReportingInfo_", "selectedAnswer_"});
        }
        if (iOrdinal == 3) {
            return new qs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qs.class) {
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

    public qz getSelectedAnswer() {
        qz qzVar = this.selectedAnswer_;
        return qzVar == null ? qz.getDefaultInstance() : qzVar;
    }

    public boolean hasDestinationReportingInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSelectedAnswer() {
        return (this.bitField0_ & 2) != 0;
    }

    public static qr newBuilder(qs qsVar) {
        return (qr) DEFAULT_INSTANCE.createBuilder(qsVar);
    }

    public static qs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qs parseFrom(com.google.v.z zVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qs parseFrom(InputStream inputStream) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qs parseFrom(ByteBuffer byteBuffer) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qs parseFrom(byte[] bArr) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
