package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnb extends com.google.v.du<bnb, bna> implements com.google.v.fj {
    private static final bnb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bnb> PARSER = null;
    public static final int REPORT_COORDINATES_FIELD_NUMBER = 1;
    public static final int REPORT_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private int bitField0_;
    private afx reportCoordinates_;
    private long reportTimestampMs_;

    static {
        bnb bnbVar = new bnb();
        DEFAULT_INSTANCE = bnbVar;
        com.google.v.du.registerDefaultInstance(bnb.class, bnbVar);
    }

    private bnb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportCoordinates() {
        this.reportCoordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportTimestampMs() {
        this.reportTimestampMs_ = 0L;
    }

    public static bnb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.reportCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.reportCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    public static bna newBuilder() {
        return (bna) DEFAULT_INSTANCE.createBuilder();
    }

    public static bnb parseDelimitedFrom(InputStream inputStream) {
        return (bnb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnb parseFrom(com.google.v.v vVar) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bnb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.reportCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTimestampMs(long j2) {
        this.reportTimestampMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"bitField0_", "reportCoordinates_", "reportTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new bnb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bna(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bnb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bnb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public afx getReportCoordinates() {
        afx afxVar = this.reportCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public long getReportTimestampMs() {
        return this.reportTimestampMs_;
    }

    public boolean hasReportCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bna newBuilder(bnb bnbVar) {
        return (bna) DEFAULT_INSTANCE.createBuilder(bnbVar);
    }

    public static bnb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bnb parseFrom(com.google.v.z zVar) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bnb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bnb parseFrom(InputStream inputStream) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnb parseFrom(ByteBuffer byteBuffer) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bnb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bnb parseFrom(byte[] bArr) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bnb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bnb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
