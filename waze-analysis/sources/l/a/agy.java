package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agy extends com.google.v.du<agy, agw> implements com.google.v.fj {
    public static final int ADDRESS_CHANGED_POPUP_CLICKED_FIELD_NUMBER = 8;
    public static final int ADDRESS_CHANGED_POPUP_SHOWN_FIELD_NUMBER = 7;
    public static final int ADDRESS_PREVIEW_CLICKED_FIELD_NUMBER = 5;
    public static final int ADDRESS_PREVIEW_INFORMATION_SHOWN_FIELD_NUMBER = 6;
    public static final int ADDRESS_PREVIEW_LATENCY_FIELD_NUMBER = 2;
    public static final int ADDRESS_PREVIEW_ONSITE_PARKING_SHOWN_FIELD_NUMBER = 3;
    public static final int ADDRESS_PREVIEW_SHOWN_FIELD_NUMBER = 1;
    public static final int ADDRESS_PREVIEW_SUGGESTED_PARKING_SHOWN_FIELD_NUMBER = 4;
    private static final agy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<agy> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        agy agyVar = new agy();
        DEFAULT_INSTANCE = agyVar;
        com.google.v.du.registerDefaultInstance(agy.class, agyVar);
    }

    private agy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressChangedPopupClicked() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressChangedPopupShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressPreviewClicked() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressPreviewInformationShown() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressPreviewLatency() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressPreviewOnsiteParkingShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressPreviewShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressPreviewSuggestedParkingShown() {
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

    public static agy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddressChangedPopupClicked(at atVar) {
        Objects.requireNonNull(atVar);
        if (this.statCase_ == 8 && this.stat_ != at.getDefaultInstance()) {
            as asVarNewBuilder = at.newBuilder((at) this.stat_);
            asVarNewBuilder.mergeFrom((as) atVar);
            atVar = asVarNewBuilder.buildPartial();
        }
        this.stat_ = atVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddressChangedPopupShown(av avVar) {
        Objects.requireNonNull(avVar);
        if (this.statCase_ == 7 && this.stat_ != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder((av) this.stat_);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.stat_ = avVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddressPreviewClicked(az azVar) {
        Objects.requireNonNull(azVar);
        if (this.statCase_ == 5 && this.stat_ != az.getDefaultInstance()) {
            ax axVarNewBuilder = az.newBuilder((az) this.stat_);
            axVarNewBuilder.mergeFrom((ax) azVar);
            azVar = axVarNewBuilder.buildPartial();
        }
        this.stat_ = azVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddressPreviewInformationShown(bc bcVar) {
        Objects.requireNonNull(bcVar);
        if (this.statCase_ == 6 && this.stat_ != bc.getDefaultInstance()) {
            bb bbVarNewBuilder = bc.newBuilder((bc) this.stat_);
            bbVarNewBuilder.mergeFrom((bb) bcVar);
            bcVar = bbVarNewBuilder.buildPartial();
        }
        this.stat_ = bcVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddressPreviewLatency(be beVar) {
        Objects.requireNonNull(beVar);
        if (this.statCase_ == 2 && this.stat_ != be.getDefaultInstance()) {
            bd bdVarNewBuilder = be.newBuilder((be) this.stat_);
            bdVarNewBuilder.mergeFrom((bd) beVar);
            beVar = bdVarNewBuilder.buildPartial();
        }
        this.stat_ = beVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddressPreviewOnsiteParkingShown(bg bgVar) {
        Objects.requireNonNull(bgVar);
        if (this.statCase_ == 3 && this.stat_ != bg.getDefaultInstance()) {
            bf bfVarNewBuilder = bg.newBuilder((bg) this.stat_);
            bfVarNewBuilder.mergeFrom((bf) bgVar);
            bgVar = bfVarNewBuilder.buildPartial();
        }
        this.stat_ = bgVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddressPreviewShown(bi biVar) {
        Objects.requireNonNull(biVar);
        if (this.statCase_ == 1 && this.stat_ != bi.getDefaultInstance()) {
            bh bhVarNewBuilder = bi.newBuilder((bi) this.stat_);
            bhVarNewBuilder.mergeFrom((bh) biVar);
            biVar = bhVarNewBuilder.buildPartial();
        }
        this.stat_ = biVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddressPreviewSuggestedParkingShown(bm bmVar) {
        Objects.requireNonNull(bmVar);
        if (this.statCase_ == 4 && this.stat_ != bm.getDefaultInstance()) {
            bj bjVarNewBuilder = bm.newBuilder((bm) this.stat_);
            bjVarNewBuilder.mergeFrom((bj) bmVar);
            bmVar = bjVarNewBuilder.buildPartial();
        }
        this.stat_ = bmVar;
        this.statCase_ = 4;
    }

    public static agw newBuilder() {
        return (agw) DEFAULT_INSTANCE.createBuilder();
    }

    public static agy parseDelimitedFrom(InputStream inputStream) {
        return (agy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agy parseFrom(com.google.v.v vVar) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<agy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressChangedPopupClicked(at atVar) {
        Objects.requireNonNull(atVar);
        this.stat_ = atVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressChangedPopupShown(av avVar) {
        Objects.requireNonNull(avVar);
        this.stat_ = avVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressPreviewClicked(az azVar) {
        Objects.requireNonNull(azVar);
        this.stat_ = azVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressPreviewInformationShown(bc bcVar) {
        Objects.requireNonNull(bcVar);
        this.stat_ = bcVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressPreviewLatency(be beVar) {
        Objects.requireNonNull(beVar);
        this.stat_ = beVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressPreviewOnsiteParkingShown(bg bgVar) {
        Objects.requireNonNull(bgVar);
        this.stat_ = bgVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressPreviewShown(bi biVar) {
        Objects.requireNonNull(biVar);
        this.stat_ = biVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressPreviewSuggestedParkingShown(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.stat_ = bmVar;
        this.statCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", bi.class, be.class, bg.class, bm.class, az.class, bc.class, av.class, at.class});
        }
        if (iOrdinal == 3) {
            return new agy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new agw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<agy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (agy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public at getAddressChangedPopupClicked() {
        return this.statCase_ == 8 ? (at) this.stat_ : at.getDefaultInstance();
    }

    public av getAddressChangedPopupShown() {
        return this.statCase_ == 7 ? (av) this.stat_ : av.getDefaultInstance();
    }

    public az getAddressPreviewClicked() {
        return this.statCase_ == 5 ? (az) this.stat_ : az.getDefaultInstance();
    }

    public bc getAddressPreviewInformationShown() {
        return this.statCase_ == 6 ? (bc) this.stat_ : bc.getDefaultInstance();
    }

    public be getAddressPreviewLatency() {
        return this.statCase_ == 2 ? (be) this.stat_ : be.getDefaultInstance();
    }

    public bg getAddressPreviewOnsiteParkingShown() {
        return this.statCase_ == 3 ? (bg) this.stat_ : bg.getDefaultInstance();
    }

    public bi getAddressPreviewShown() {
        return this.statCase_ == 1 ? (bi) this.stat_ : bi.getDefaultInstance();
    }

    public bm getAddressPreviewSuggestedParkingShown() {
        return this.statCase_ == 4 ? (bm) this.stat_ : bm.getDefaultInstance();
    }

    public agx getStatCase() {
        switch (this.statCase_) {
            case 0:
                return agx.f52483i;
            case 1:
                return agx.f52475a;
            case 2:
                return agx.f52476b;
            case 3:
                return agx.f52477c;
            case 4:
                return agx.f52478d;
            case 5:
                return agx.f52479e;
            case 6:
                return agx.f52480f;
            case 7:
                return agx.f52481g;
            case 8:
                return agx.f52482h;
            default:
                return null;
        }
    }

    public boolean hasAddressChangedPopupClicked() {
        return this.statCase_ == 8;
    }

    public boolean hasAddressChangedPopupShown() {
        return this.statCase_ == 7;
    }

    public boolean hasAddressPreviewClicked() {
        return this.statCase_ == 5;
    }

    public boolean hasAddressPreviewInformationShown() {
        return this.statCase_ == 6;
    }

    public boolean hasAddressPreviewLatency() {
        return this.statCase_ == 2;
    }

    public boolean hasAddressPreviewOnsiteParkingShown() {
        return this.statCase_ == 3;
    }

    public boolean hasAddressPreviewShown() {
        return this.statCase_ == 1;
    }

    public boolean hasAddressPreviewSuggestedParkingShown() {
        return this.statCase_ == 4;
    }

    public static agw newBuilder(agy agyVar) {
        return (agw) DEFAULT_INSTANCE.createBuilder(agyVar);
    }

    public static agy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static agy parseFrom(com.google.v.z zVar) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static agy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static agy parseFrom(InputStream inputStream) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agy parseFrom(ByteBuffer byteBuffer) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static agy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static agy parseFrom(byte[] bArr) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static agy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (agy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
