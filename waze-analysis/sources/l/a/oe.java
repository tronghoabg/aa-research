package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class oe extends com.google.v.du<oe, od> implements com.google.v.fj {
    public static final int ALERT_ID_FIELD_NUMBER = 1;
    private static final oe DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<oe> PARSER = null;
    public static final int REPORT_ID_FIELD_NUMBER = 4;
    public static final int REPORT_SUBTYPE_FIELD_NUMBER = 5;
    private long alertId_;
    private int bitField0_;
    private String reportId_ = "";
    private int reportSubtype_;

    static {
        oe oeVar = new oe();
        DEFAULT_INSTANCE = oeVar;
        com.google.v.du.registerDefaultInstance(oe.class, oeVar);
    }

    private oe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.bitField0_ &= -2;
        this.alertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportId() {
        this.reportId_ = getDefaultInstance().getReportId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportSubtype() {
        this.reportSubtype_ = 0;
    }

    public static oe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static od newBuilder() {
        return (od) DEFAULT_INSTANCE.createBuilder();
    }

    public static oe parseDelimitedFrom(InputStream inputStream) {
        return (oe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oe parseFrom(com.google.v.v vVar) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(long j2) {
        this.bitField0_ |= 1;
        this.alertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportId(String str) {
        Objects.requireNonNull(str);
        this.reportId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.reportId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportSubtype(boa boaVar) {
        this.reportSubtype_ = boaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportSubtypeValue(int i2) {
        this.reportSubtype_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0004Ȉ\u0005\f", new Object[]{"bitField0_", "alertId_", "reportId_", "reportSubtype_"});
        }
        if (iOrdinal == 3) {
            return new oe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new od(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<oe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (oe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAlertId() {
        return this.alertId_;
    }

    public String getReportId() {
        return this.reportId_;
    }

    public com.google.v.v getReportIdBytes() {
        return com.google.v.v.s(this.reportId_);
    }

    public boa getReportSubtype() {
        boa boaVarA = boa.a(this.reportSubtype_);
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getReportSubtypeValue() {
        return this.reportSubtype_;
    }

    public boolean hasAlertId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static od newBuilder(oe oeVar) {
        return (od) DEFAULT_INSTANCE.createBuilder(oeVar);
    }

    public static oe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oe parseFrom(com.google.v.z zVar) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static oe parseFrom(InputStream inputStream) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oe parseFrom(ByteBuffer byteBuffer) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oe parseFrom(byte[] bArr) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
