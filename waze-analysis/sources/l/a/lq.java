package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class lq extends com.google.v.du<lq, lo> implements com.google.v.fj {
    public static final int COPILOT_ASSETS_DOWNLOAD_FINISHED_FIELD_NUMBER = 1;
    public static final int COPILOT_ASSETS_DOWNLOAD_INITIATED_FIELD_NUMBER = 2;
    private static final lq DEFAULT_INSTANCE;
    public static final int MARKETPLACE_FTE_POPUP_CLICKED_FIELD_NUMBER = 3;
    public static final int MARKETPLACE_FTE_POPUP_SHOWN_FIELD_NUMBER = 4;
    public static final int MARKETPLACE_HEADER_CLICKED_FIELD_NUMBER = 5;
    public static final int MARKETPLACE_HEADER_SHOWN_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<lq> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        lq lqVar = new lq();
        DEFAULT_INSTANCE = lqVar;
        com.google.v.du.registerDefaultInstance(lq.class, lqVar);
    }

    private lq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopilotAssetsDownloadFinished() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopilotAssetsDownloadInitiated() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarketplaceFtePopupClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarketplaceFtePopupShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarketplaceHeaderClicked() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarketplaceHeaderShown() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static lq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCopilotAssetsDownloadFinished(oy oyVar) {
        Objects.requireNonNull(oyVar);
        if (this.statCase_ == 1 && this.stat_ != oy.getDefaultInstance()) {
            ow owVarNewBuilder = oy.newBuilder((oy) this.stat_);
            owVarNewBuilder.mergeFrom((ow) oyVar);
            oyVar = owVarNewBuilder.buildPartial();
        }
        this.stat_ = oyVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCopilotAssetsDownloadInitiated(pa paVar) {
        Objects.requireNonNull(paVar);
        if (this.statCase_ == 2 && this.stat_ != pa.getDefaultInstance()) {
            oz ozVarNewBuilder = pa.newBuilder((pa) this.stat_);
            ozVarNewBuilder.mergeFrom((oz) paVar);
            paVar = ozVarNewBuilder.buildPartial();
        }
        this.stat_ = paVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMarketplaceFtePopupClicked(ajo ajoVar) {
        Objects.requireNonNull(ajoVar);
        if (this.statCase_ == 3 && this.stat_ != ajo.getDefaultInstance()) {
            ajn ajnVarNewBuilder = ajo.newBuilder((ajo) this.stat_);
            ajnVarNewBuilder.mergeFrom((ajn) ajoVar);
            ajoVar = ajnVarNewBuilder.buildPartial();
        }
        this.stat_ = ajoVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMarketplaceFtePopupShown(ajq ajqVar) {
        Objects.requireNonNull(ajqVar);
        if (this.statCase_ == 4 && this.stat_ != ajq.getDefaultInstance()) {
            ajp ajpVarNewBuilder = ajq.newBuilder((ajq) this.stat_);
            ajpVarNewBuilder.mergeFrom((ajp) ajqVar);
            ajqVar = ajpVarNewBuilder.buildPartial();
        }
        this.stat_ = ajqVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMarketplaceHeaderClicked(ajt ajtVar) {
        Objects.requireNonNull(ajtVar);
        if (this.statCase_ == 5 && this.stat_ != ajt.getDefaultInstance()) {
            ajs ajsVarNewBuilder = ajt.newBuilder((ajt) this.stat_);
            ajsVarNewBuilder.mergeFrom((ajs) ajtVar);
            ajtVar = ajsVarNewBuilder.buildPartial();
        }
        this.stat_ = ajtVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMarketplaceHeaderShown(ajv ajvVar) {
        Objects.requireNonNull(ajvVar);
        if (this.statCase_ == 6 && this.stat_ != ajv.getDefaultInstance()) {
            aju ajuVarNewBuilder = ajv.newBuilder((ajv) this.stat_);
            ajuVarNewBuilder.mergeFrom((aju) ajvVar);
            ajvVar = ajuVarNewBuilder.buildPartial();
        }
        this.stat_ = ajvVar;
        this.statCase_ = 6;
    }

    public static lo newBuilder() {
        return (lo) DEFAULT_INSTANCE.createBuilder();
    }

    public static lq parseDelimitedFrom(InputStream inputStream) {
        return (lq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lq parseFrom(com.google.v.v vVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopilotAssetsDownloadFinished(oy oyVar) {
        Objects.requireNonNull(oyVar);
        this.stat_ = oyVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopilotAssetsDownloadInitiated(pa paVar) {
        Objects.requireNonNull(paVar);
        this.stat_ = paVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarketplaceFtePopupClicked(ajo ajoVar) {
        Objects.requireNonNull(ajoVar);
        this.stat_ = ajoVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarketplaceFtePopupShown(ajq ajqVar) {
        Objects.requireNonNull(ajqVar);
        this.stat_ = ajqVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarketplaceHeaderClicked(ajt ajtVar) {
        Objects.requireNonNull(ajtVar);
        this.stat_ = ajtVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarketplaceHeaderShown(ajv ajvVar) {
        Objects.requireNonNull(ajvVar);
        this.stat_ = ajvVar;
        this.statCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"stat_", "statCase_", oy.class, pa.class, ajo.class, ajq.class, ajt.class, ajv.class});
        }
        if (iOrdinal == 3) {
            return new lq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public oy getCopilotAssetsDownloadFinished() {
        return this.statCase_ == 1 ? (oy) this.stat_ : oy.getDefaultInstance();
    }

    public pa getCopilotAssetsDownloadInitiated() {
        return this.statCase_ == 2 ? (pa) this.stat_ : pa.getDefaultInstance();
    }

    public ajo getMarketplaceFtePopupClicked() {
        return this.statCase_ == 3 ? (ajo) this.stat_ : ajo.getDefaultInstance();
    }

    public ajq getMarketplaceFtePopupShown() {
        return this.statCase_ == 4 ? (ajq) this.stat_ : ajq.getDefaultInstance();
    }

    public ajt getMarketplaceHeaderClicked() {
        return this.statCase_ == 5 ? (ajt) this.stat_ : ajt.getDefaultInstance();
    }

    public ajv getMarketplaceHeaderShown() {
        return this.statCase_ == 6 ? (ajv) this.stat_ : ajv.getDefaultInstance();
    }

    public lp getStatCase() {
        switch (this.statCase_) {
            case 0:
                return lp.f55050g;
            case 1:
                return lp.f55044a;
            case 2:
                return lp.f55045b;
            case 3:
                return lp.f55046c;
            case 4:
                return lp.f55047d;
            case 5:
                return lp.f55048e;
            case 6:
                return lp.f55049f;
            default:
                return null;
        }
    }

    public boolean hasCopilotAssetsDownloadFinished() {
        return this.statCase_ == 1;
    }

    public boolean hasCopilotAssetsDownloadInitiated() {
        return this.statCase_ == 2;
    }

    public boolean hasMarketplaceFtePopupClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasMarketplaceFtePopupShown() {
        return this.statCase_ == 4;
    }

    public boolean hasMarketplaceHeaderClicked() {
        return this.statCase_ == 5;
    }

    public boolean hasMarketplaceHeaderShown() {
        return this.statCase_ == 6;
    }

    public static lo newBuilder(lq lqVar) {
        return (lo) DEFAULT_INSTANCE.createBuilder(lqVar);
    }

    public static lq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lq parseFrom(com.google.v.z zVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lq parseFrom(InputStream inputStream) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lq parseFrom(ByteBuffer byteBuffer) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lq parseFrom(byte[] bArr) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
