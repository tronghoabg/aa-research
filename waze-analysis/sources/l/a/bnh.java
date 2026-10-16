package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnh extends com.google.v.du<bnh, bng> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 3;
    private static final bnh DEFAULT_INSTANCE;
    public static final int LOCK_SCREEN_MODE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<bnh> PARSER = null;
    public static final int QUICK_CLOSURE_FLOW_FIELD_NUMBER = 4;
    public static final int REPORTING_BUTTON_MARKER_VISIBLE_FIELD_NUMBER = 6;
    public static final int REPORTING_BUTTON_TOOLTIP_VISIBLE_FIELD_NUMBER = 7;
    public static final int UGC_INFO_FIELD_NUMBER = 1;
    public static final int UGC_TYPE_INFO_FIELD_NUMBER = 2;
    private int action_;
    private int bitField0_;
    private boolean lockScreenMode_;
    private boolean quickClosureFlow_;
    private boolean reportingButtonMarkerVisible_;
    private boolean reportingButtonTooltipVisible_;
    private bnb ugcInfo_;
    private boc ugcTypeInfo_;

    static {
        bnh bnhVar = new bnh();
        DEFAULT_INSTANCE = bnhVar;
        com.google.v.du.registerDefaultInstance(bnh.class, bnhVar);
    }

    private bnh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLockScreenMode() {
        this.bitField0_ &= -9;
        this.lockScreenMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuickClosureFlow() {
        this.bitField0_ &= -5;
        this.quickClosureFlow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingButtonMarkerVisible() {
        this.bitField0_ &= -17;
        this.reportingButtonMarkerVisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingButtonTooltipVisible() {
        this.bitField0_ &= -33;
        this.reportingButtonTooltipVisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcInfo() {
        this.ugcInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcTypeInfo() {
        this.ugcTypeInfo_ = null;
        this.bitField0_ &= -3;
    }

    public static bnh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcInfo(bnb bnbVar) {
        Objects.requireNonNull(bnbVar);
        bnb bnbVar2 = this.ugcInfo_;
        if (bnbVar2 != null && bnbVar2 != bnb.getDefaultInstance()) {
            bna bnaVarNewBuilder = bnb.newBuilder(bnbVar2);
            bnaVarNewBuilder.mergeFrom((bna) bnbVar);
            bnbVar = bnaVarNewBuilder.buildPartial();
        }
        this.ugcInfo_ = bnbVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcTypeInfo(boc bocVar) {
        Objects.requireNonNull(bocVar);
        boc bocVar2 = this.ugcTypeInfo_;
        if (bocVar2 != null && bocVar2 != boc.getDefaultInstance()) {
            bnx bnxVarNewBuilder = boc.newBuilder(bocVar2);
            bnxVarNewBuilder.mergeFrom((bnx) bocVar);
            bocVar = bnxVarNewBuilder.buildPartial();
        }
        this.ugcTypeInfo_ = bocVar;
        this.bitField0_ |= 2;
    }

    public static bng newBuilder() {
        return (bng) DEFAULT_INSTANCE.createBuilder();
    }

    public static bnh parseDelimitedFrom(InputStream inputStream) {
        return (bnh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnh parseFrom(com.google.v.v vVar) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bnh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bnf bnfVar) {
        this.action_ = bnfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockScreenMode(boolean z) {
        this.bitField0_ |= 8;
        this.lockScreenMode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuickClosureFlow(boolean z) {
        this.bitField0_ |= 4;
        this.quickClosureFlow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonMarkerVisible(boolean z) {
        this.bitField0_ |= 16;
        this.reportingButtonMarkerVisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingButtonTooltipVisible(boolean z) {
        this.bitField0_ |= 32;
        this.reportingButtonTooltipVisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcInfo(bnb bnbVar) {
        Objects.requireNonNull(bnbVar);
        this.ugcInfo_ = bnbVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcTypeInfo(boc bocVar) {
        Objects.requireNonNull(bocVar);
        this.ugcTypeInfo_ = bocVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"bitField0_", "ugcInfo_", "ugcTypeInfo_", "action_", "quickClosureFlow_", "lockScreenMode_", "reportingButtonMarkerVisible_", "reportingButtonTooltipVisible_"});
        }
        if (iOrdinal == 3) {
            return new bnh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bng(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bnh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bnh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bnf getAction() {
        bnf bnfVar;
        switch (this.action_) {
            case 0:
                bnfVar = bnf.ACTION_UNSPECIFIED;
                break;
            case 1:
                bnfVar = bnf.CANCEL;
                break;
            case 2:
                bnfVar = bnf.LATER;
                break;
            case 3:
                bnfVar = bnf.REPORT;
                break;
            case 4:
                bnfVar = bnf.SELECT;
                break;
            case 5:
                bnfVar = bnf.CLOSE;
                break;
            case 6:
                bnfVar = bnf.CLOSE_SIRI_EDUCATION_CARD;
                break;
            case 7:
                bnfVar = bnf.START_REPORTING_CONVERSATION;
                break;
            default:
                bnfVar = null;
                break;
        }
        return bnfVar == null ? bnf.UNRECOGNIZED : bnfVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getLockScreenMode() {
        return this.lockScreenMode_;
    }

    public boolean getQuickClosureFlow() {
        return this.quickClosureFlow_;
    }

    public boolean getReportingButtonMarkerVisible() {
        return this.reportingButtonMarkerVisible_;
    }

    @Deprecated
    public boolean getReportingButtonTooltipVisible() {
        return this.reportingButtonTooltipVisible_;
    }

    public bnb getUgcInfo() {
        bnb bnbVar = this.ugcInfo_;
        return bnbVar == null ? bnb.getDefaultInstance() : bnbVar;
    }

    public boc getUgcTypeInfo() {
        boc bocVar = this.ugcTypeInfo_;
        return bocVar == null ? boc.getDefaultInstance() : bocVar;
    }

    public boolean hasLockScreenMode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasQuickClosureFlow() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasReportingButtonMarkerVisible() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasReportingButtonTooltipVisible() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUgcInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUgcTypeInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bng newBuilder(bnh bnhVar) {
        return (bng) DEFAULT_INSTANCE.createBuilder(bnhVar);
    }

    public static bnh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bnh parseFrom(com.google.v.z zVar) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bnh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bnh parseFrom(InputStream inputStream) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnh parseFrom(ByteBuffer byteBuffer) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bnh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bnh parseFrom(byte[] bArr) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bnh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bnh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
