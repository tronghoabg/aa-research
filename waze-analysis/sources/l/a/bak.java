package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bak extends com.google.v.du<bak, baj> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int COMMENT_FIELD_NUMBER = 5;
    public static final int COORDINATES_FIELD_NUMBER = 4;
    private static final bak DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bak> PARSER = null;
    public static final int PHOTO_ADDED_FIELD_NUMBER = 6;
    public static final int QUICK_CLOSURE_FLOW_FIELD_NUMBER = 7;
    public static final int REPORT_SUBTYPE_FIELD_NUMBER = 9;
    public static final int REPORT_TYPE_FIELD_NUMBER = 8;
    public static final int SUBTYPE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int action_;
    private int bitField0_;
    private String comment_ = "";
    private afx coordinates_;
    private boolean photoAdded_;
    private boolean quickClosureFlow_;
    private int reportSubtype_;
    private int reportType_;
    private long subtype_;
    private long type_;

    static {
        bak bakVar = new bak();
        DEFAULT_INSTANCE = bakVar;
        com.google.v.du.registerDefaultInstance(bak.class, bakVar);
    }

    private bak() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComment() {
        this.comment_ = getDefaultInstance().getComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhotoAdded() {
        this.bitField0_ &= -9;
        this.photoAdded_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuickClosureFlow() {
        this.bitField0_ &= -17;
        this.quickClosureFlow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportSubtype() {
        this.reportSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportType() {
        this.reportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtype() {
        this.bitField0_ &= -3;
        this.subtype_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0L;
    }

    public static bak getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.coordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.coordinates_ = afxVar;
        this.bitField0_ |= 4;
    }

    public static baj newBuilder() {
        return (baj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bak parseDelimitedFrom(InputStream inputStream) {
        return (bak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bak parseFrom(com.google.v.v vVar) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bak> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bai baiVar) {
        this.action_ = baiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComment(String str) {
        Objects.requireNonNull(str);
        this.comment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.comment_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhotoAdded(boolean z) {
        this.bitField0_ |= 8;
        this.photoAdded_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuickClosureFlow(boolean z) {
        this.bitField0_ |= 16;
        this.quickClosureFlow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportSubtype(boa boaVar) {
        this.reportSubtype_ = boaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportSubtypeValue(int i2) {
        this.reportSubtype_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportType(bob bobVar) {
        this.reportType_ = bobVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTypeValue(int i2) {
        this.reportType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtype(long j2) {
        this.bitField0_ |= 2;
        this.subtype_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(long j2) {
        this.bitField0_ |= 1;
        this.type_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002တ\u0000\u0003ဂ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006ဇ\u0003\u0007ဇ\u0004\b\f\t\f", new Object[]{"bitField0_", "action_", "type_", "subtype_", "coordinates_", "comment_", "photoAdded_", "quickClosureFlow_", "reportType_", "reportSubtype_"});
        }
        if (iOrdinal == 3) {
            return new bak();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new baj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bak> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bak.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bai getAction() {
        bai baiVar;
        switch (this.action_) {
            case 0:
                baiVar = bai.ACTION_UNSPECIFIED;
                break;
            case 1:
                baiVar = bai.ADD_COMMENT;
                break;
            case 2:
                baiVar = bai.CLOSE;
                break;
            case 3:
                baiVar = bai.CANCEL;
                break;
            case 4:
                baiVar = bai.EMERGENCY_CALL;
                break;
            case 5:
                baiVar = bai.LATER;
                break;
            case 6:
                baiVar = bai.PHOTO;
                break;
            case 7:
                baiVar = bai.REPORT;
                break;
            case 8:
                baiVar = bai.ROAD_ASSISTANCE;
                break;
            case 9:
                baiVar = bai.SELECT;
                break;
            case 10:
                baiVar = bai.SEND_LOCATION;
                break;
            default:
                baiVar = null;
                break;
        }
        return baiVar == null ? bai.UNRECOGNIZED : baiVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getComment() {
        return this.comment_;
    }

    public com.google.v.v getCommentBytes() {
        return com.google.v.v.s(this.comment_);
    }

    public afx getCoordinates() {
        afx afxVar = this.coordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean getPhotoAdded() {
        return this.photoAdded_;
    }

    public boolean getQuickClosureFlow() {
        return this.quickClosureFlow_;
    }

    public boa getReportSubtype() {
        boa boaVarA = boa.a(this.reportSubtype_);
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getReportSubtypeValue() {
        return this.reportSubtype_;
    }

    public bob getReportType() {
        bob bobVarA = bob.a(this.reportType_);
        return bobVarA == null ? bob.UNRECOGNIZED : bobVarA;
    }

    public int getReportTypeValue() {
        return this.reportType_;
    }

    public long getSubtype() {
        return this.subtype_;
    }

    public long getType() {
        return this.type_;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPhotoAdded() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasQuickClosureFlow() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static baj newBuilder(bak bakVar) {
        return (baj) DEFAULT_INSTANCE.createBuilder(bakVar);
    }

    public static bak parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bak parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bak parseFrom(com.google.v.z zVar) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bak parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bak parseFrom(InputStream inputStream) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bak parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bak parseFrom(ByteBuffer byteBuffer) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bak parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bak parseFrom(byte[] bArr) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bak parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
