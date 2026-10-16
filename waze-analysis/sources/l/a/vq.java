package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vq extends com.google.v.du<vq, vo> implements com.google.v.fj {
    public static final int BOTTOM_PANE_CLICKED_FIELD_NUMBER = 1;
    private static final vq DEFAULT_INSTANCE;
    public static final int ETA_CHANGED_BUBBLE_SHOWN_FIELD_NUMBER = 2;
    public static final int ETA_DRAWER_CLICKED_FIELD_NUMBER = 7;
    public static final int ETA_DRAWER_SHOWN_FIELD_NUMBER = 6;
    public static final int ETA_ROUTE_SHOWN_FIELD_NUMBER = 3;
    public static final int OVERVIEW_BAR_CLICKED_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<vq> PARSER = null;
    public static final int VENUE_MULTI_ENTRY_CARD_SHOWN_FIELD_NUMBER = 5;
    private int statCase_ = 0;
    private Object stat_;

    static {
        vq vqVar = new vq();
        DEFAULT_INSTANCE = vqVar;
        com.google.v.du.registerDefaultInstance(vq.class, vqVar);
    }

    private vq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomPaneClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaChangedBubbleShown() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaDrawerClicked() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaDrawerShown() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaRouteShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverviewBarClicked() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueMultiEntryCardShown() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static vq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBottomPaneClicked(is isVar) {
        Objects.requireNonNull(isVar);
        if (this.statCase_ == 1 && this.stat_ != is.getDefaultInstance()) {
            ir irVarNewBuilder = is.newBuilder((is) this.stat_);
            irVarNewBuilder.mergeFrom((ir) isVar);
            isVar = irVarNewBuilder.buildPartial();
        }
        this.stat_ = isVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaChangedBubbleShown(uy uyVar) {
        Objects.requireNonNull(uyVar);
        if (this.statCase_ == 2 && this.stat_ != uy.getDefaultInstance()) {
            ux uxVarNewBuilder = uy.newBuilder((uy) this.stat_);
            uxVarNewBuilder.mergeFrom((ux) uyVar);
            uyVar = uxVarNewBuilder.buildPartial();
        }
        this.stat_ = uyVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaDrawerClicked(vi viVar) {
        Objects.requireNonNull(viVar);
        if (this.statCase_ == 7 && this.stat_ != vi.getDefaultInstance()) {
            vg vgVarNewBuilder = vi.newBuilder((vi) this.stat_);
            vgVarNewBuilder.mergeFrom((vg) viVar);
            viVar = vgVarNewBuilder.buildPartial();
        }
        this.stat_ = viVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaDrawerShown(vl vlVar) {
        Objects.requireNonNull(vlVar);
        if (this.statCase_ == 6 && this.stat_ != vl.getDefaultInstance()) {
            vk vkVarNewBuilder = vl.newBuilder((vl) this.stat_);
            vkVarNewBuilder.mergeFrom((vk) vlVar);
            vlVar = vkVarNewBuilder.buildPartial();
        }
        this.stat_ = vlVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaRouteShown(vn vnVar) {
        Objects.requireNonNull(vnVar);
        if (this.statCase_ == 3 && this.stat_ != vn.getDefaultInstance()) {
            vm vmVarNewBuilder = vn.newBuilder((vn) this.stat_);
            vmVarNewBuilder.mergeFrom((vm) vnVar);
            vnVar = vmVarNewBuilder.buildPartial();
        }
        this.stat_ = vnVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOverviewBarClicked(aox aoxVar) {
        Objects.requireNonNull(aoxVar);
        if (this.statCase_ == 4 && this.stat_ != aox.getDefaultInstance()) {
            aow aowVarNewBuilder = aox.newBuilder((aox) this.stat_);
            aowVarNewBuilder.mergeFrom((aow) aoxVar);
            aoxVar = aowVarNewBuilder.buildPartial();
        }
        this.stat_ = aoxVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueMultiEntryCardShown(bpr bprVar) {
        Objects.requireNonNull(bprVar);
        if (this.statCase_ == 5 && this.stat_ != bpr.getDefaultInstance()) {
            bpq bpqVarNewBuilder = bpr.newBuilder((bpr) this.stat_);
            bpqVarNewBuilder.mergeFrom((bpq) bprVar);
            bprVar = bpqVarNewBuilder.buildPartial();
        }
        this.stat_ = bprVar;
        this.statCase_ = 5;
    }

    public static vo newBuilder() {
        return (vo) DEFAULT_INSTANCE.createBuilder();
    }

    public static vq parseDelimitedFrom(InputStream inputStream) {
        return (vq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vq parseFrom(com.google.v.v vVar) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<vq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomPaneClicked(is isVar) {
        Objects.requireNonNull(isVar);
        this.stat_ = isVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaChangedBubbleShown(uy uyVar) {
        Objects.requireNonNull(uyVar);
        this.stat_ = uyVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaDrawerClicked(vi viVar) {
        Objects.requireNonNull(viVar);
        this.stat_ = viVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaDrawerShown(vl vlVar) {
        Objects.requireNonNull(vlVar);
        this.stat_ = vlVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaRouteShown(vn vnVar) {
        Objects.requireNonNull(vnVar);
        this.stat_ = vnVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverviewBarClicked(aox aoxVar) {
        Objects.requireNonNull(aoxVar);
        this.stat_ = aoxVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueMultiEntryCardShown(bpr bprVar) {
        Objects.requireNonNull(bprVar);
        this.stat_ = bprVar;
        this.statCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"stat_", "statCase_", is.class, uy.class, vn.class, aox.class, bpr.class, vl.class, vi.class});
        }
        if (iOrdinal == 3) {
            return new vq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new vo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<vq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (vq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public is getBottomPaneClicked() {
        return this.statCase_ == 1 ? (is) this.stat_ : is.getDefaultInstance();
    }

    public uy getEtaChangedBubbleShown() {
        return this.statCase_ == 2 ? (uy) this.stat_ : uy.getDefaultInstance();
    }

    public vi getEtaDrawerClicked() {
        return this.statCase_ == 7 ? (vi) this.stat_ : vi.getDefaultInstance();
    }

    public vl getEtaDrawerShown() {
        return this.statCase_ == 6 ? (vl) this.stat_ : vl.getDefaultInstance();
    }

    public vn getEtaRouteShown() {
        return this.statCase_ == 3 ? (vn) this.stat_ : vn.getDefaultInstance();
    }

    public aox getOverviewBarClicked() {
        return this.statCase_ == 4 ? (aox) this.stat_ : aox.getDefaultInstance();
    }

    public vp getStatCase() {
        switch (this.statCase_) {
            case 0:
                return vp.f55567h;
            case 1:
                return vp.f55560a;
            case 2:
                return vp.f55561b;
            case 3:
                return vp.f55562c;
            case 4:
                return vp.f55563d;
            case 5:
                return vp.f55564e;
            case 6:
                return vp.f55565f;
            case 7:
                return vp.f55566g;
            default:
                return null;
        }
    }

    public bpr getVenueMultiEntryCardShown() {
        return this.statCase_ == 5 ? (bpr) this.stat_ : bpr.getDefaultInstance();
    }

    public boolean hasBottomPaneClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasEtaChangedBubbleShown() {
        return this.statCase_ == 2;
    }

    public boolean hasEtaDrawerClicked() {
        return this.statCase_ == 7;
    }

    public boolean hasEtaDrawerShown() {
        return this.statCase_ == 6;
    }

    public boolean hasEtaRouteShown() {
        return this.statCase_ == 3;
    }

    public boolean hasOverviewBarClicked() {
        return this.statCase_ == 4;
    }

    public boolean hasVenueMultiEntryCardShown() {
        return this.statCase_ == 5;
    }

    public static vo newBuilder(vq vqVar) {
        return (vo) DEFAULT_INSTANCE.createBuilder(vqVar);
    }

    public static vq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static vq parseFrom(com.google.v.z zVar) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static vq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static vq parseFrom(InputStream inputStream) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vq parseFrom(ByteBuffer byteBuffer) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static vq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static vq parseFrom(byte[] bArr) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static vq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (vq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
