package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bea extends com.google.v.du<bea, bdx> implements com.google.v.fj {
    public static final int CLIENT_ALERT_ID_FIELD_NUMBER = 5;
    private static final bea DEFAULT_INSTANCE;
    public static final int FAILURE_REASON_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bea> PARSER = null;
    public static final int REPORT_TYPE_PHRASE_FIELD_NUMBER = 6;
    public static final int SIRI_DIALOG_TEXT_FIELD_NUMBER = 2;
    public static final int SUCCESS_FIELD_NUMBER = 3;
    public static final int UGC_CONTEXT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object reportEndingInfo_;
    private boolean success_;
    private int reportEndingInfoCase_ = 0;
    private String ugcContextId_ = "";
    private String siriDialogText_ = "";
    private String reportTypePhrase_ = "";

    static {
        bea beaVar = new bea();
        DEFAULT_INSTANCE = beaVar;
        com.google.v.du.registerDefaultInstance(bea.class, beaVar);
    }

    private bea() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientAlertId() {
        if (this.reportEndingInfoCase_ == 5) {
            this.reportEndingInfoCase_ = 0;
            this.reportEndingInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        if (this.reportEndingInfoCase_ == 4) {
            this.reportEndingInfoCase_ = 0;
            this.reportEndingInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportEndingInfo() {
        this.reportEndingInfoCase_ = 0;
        this.reportEndingInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportTypePhrase() {
        this.reportTypePhrase_ = getDefaultInstance().getReportTypePhrase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSiriDialogText() {
        this.siriDialogText_ = getDefaultInstance().getSiriDialogText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -2;
        this.success_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcContextId() {
        this.ugcContextId_ = getDefaultInstance().getUgcContextId();
    }

    public static bea getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bdx newBuilder() {
        return (bdx) DEFAULT_INSTANCE.createBuilder();
    }

    public static bea parseDelimitedFrom(InputStream inputStream) {
        return (bea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bea parseFrom(com.google.v.v vVar) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bea> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAlertId(long j2) {
        this.reportEndingInfoCase_ = 5;
        this.reportEndingInfo_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(bdy bdyVar) {
        this.reportEndingInfo_ = Integer.valueOf(bdyVar.getNumber());
        this.reportEndingInfoCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonValue(int i2) {
        this.reportEndingInfoCase_ = 4;
        this.reportEndingInfo_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTypePhrase(String str) {
        Objects.requireNonNull(str);
        this.reportTypePhrase_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTypePhraseBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.reportTypePhrase_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiriDialogText(String str) {
        Objects.requireNonNull(str);
        this.siriDialogText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiriDialogTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.siriDialogText_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 1;
        this.success_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextId(String str) {
        Objects.requireNonNull(str);
        this.ugcContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ugcContextId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဇ\u0000\u0004?\u0000\u00055\u0000\u0006Ȉ", new Object[]{"reportEndingInfo_", "reportEndingInfoCase_", "bitField0_", "ugcContextId_", "siriDialogText_", "success_", "reportTypePhrase_"});
        }
        if (iOrdinal == 3) {
            return new bea();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bdx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bea> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bea.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getClientAlertId() {
        if (this.reportEndingInfoCase_ == 5) {
            return ((Long) this.reportEndingInfo_).longValue();
        }
        return 0L;
    }

    public bdy getFailureReason() {
        if (this.reportEndingInfoCase_ != 4) {
            return bdy.FAILURE_REASON_UNSPECIFIED;
        }
        int iIntValue = ((Integer) this.reportEndingInfo_).intValue();
        bdy bdyVar = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? null : bdy.UNKNOWN_ERROR_WHILE_CLARIFYING_REPORT_TYPE : bdy.BACKEND_ERROR : bdy.CLIENT_ERROR : bdy.NO_REPORT_LOCATION : bdy.UNRECOGNIZED_REPORT_TYPE : bdy.FAILURE_REASON_UNSPECIFIED;
        return bdyVar == null ? bdy.UNRECOGNIZED : bdyVar;
    }

    public int getFailureReasonValue() {
        if (this.reportEndingInfoCase_ == 4) {
            return ((Integer) this.reportEndingInfo_).intValue();
        }
        return 0;
    }

    public bdz getReportEndingInfoCase() {
        int i2 = this.reportEndingInfoCase_;
        if (i2 == 0) {
            return bdz.f53799c;
        }
        if (i2 == 4) {
            return bdz.f53797a;
        }
        if (i2 != 5) {
            return null;
        }
        return bdz.f53798b;
    }

    public String getReportTypePhrase() {
        return this.reportTypePhrase_;
    }

    public com.google.v.v getReportTypePhraseBytes() {
        return com.google.v.v.s(this.reportTypePhrase_);
    }

    public String getSiriDialogText() {
        return this.siriDialogText_;
    }

    public com.google.v.v getSiriDialogTextBytes() {
        return com.google.v.v.s(this.siriDialogText_);
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public String getUgcContextId() {
        return this.ugcContextId_;
    }

    public com.google.v.v getUgcContextIdBytes() {
        return com.google.v.v.s(this.ugcContextId_);
    }

    public boolean hasClientAlertId() {
        return this.reportEndingInfoCase_ == 5;
    }

    public boolean hasFailureReason() {
        return this.reportEndingInfoCase_ == 4;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bdx newBuilder(bea beaVar) {
        return (bdx) DEFAULT_INSTANCE.createBuilder(beaVar);
    }

    public static bea parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bea parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bea parseFrom(com.google.v.z zVar) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bea parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bea parseFrom(InputStream inputStream) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bea parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bea parseFrom(ByteBuffer byteBuffer) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bea parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bea parseFrom(byte[] bArr) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bea parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
