package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aht extends com.google.v.du<aht, ahr> implements com.google.v.fj {
    public static final int BANNER_CLICKED_FIELD_NUMBER = 2;
    public static final int BANNER_RECEIVED_FIELD_NUMBER = 3;
    public static final int BANNER_SHOWN_FIELD_NUMBER = 1;
    private static final aht DEFAULT_INSTANCE;
    public static final int MAIN_MENU_BUTTON_CLICKED_FIELD_NUMBER = 4;
    public static final int MAIN_MENU_BUTTON_SHOWN_FIELD_NUMBER = 5;
    public static final int MAIN_MENU_CLICKED_FIELD_NUMBER = 6;
    public static final int MAIN_MENU_SHOWN_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<aht> PARSER = null;
    public static final int PROMOTIONAL_CHIP_CLICKED_FIELD_NUMBER = 8;
    public static final int PROMOTIONAL_CHIP_RECEIVED_FIELD_NUMBER = 9;
    public static final int PROMOTIONAL_CHIP_SHOWN_FIELD_NUMBER = 10;
    public static final int PROMOTIONAL_CHIP_SKIPPED_FIELD_NUMBER = 11;
    private int statCase_ = 0;
    private Object stat_;

    static {
        aht ahtVar = new aht();
        DEFAULT_INSTANCE = ahtVar;
        com.google.v.du.registerDefaultInstance(aht.class, ahtVar);
    }

    private aht() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerReceived() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainMenuButtonClicked() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainMenuButtonShown() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainMenuClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainMenuShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionalChipClicked() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionalChipReceived() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionalChipShown() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionalChipSkipped() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static aht getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBannerClicked(hd hdVar) {
        Objects.requireNonNull(hdVar);
        if (this.statCase_ == 2 && this.stat_ != hd.getDefaultInstance()) {
            hc hcVarNewBuilder = hd.newBuilder((hd) this.stat_);
            hcVarNewBuilder.mergeFrom((hc) hdVar);
            hdVar = hcVarNewBuilder.buildPartial();
        }
        this.stat_ = hdVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBannerReceived(hi hiVar) {
        Objects.requireNonNull(hiVar);
        if (this.statCase_ == 3 && this.stat_ != hi.getDefaultInstance()) {
            hh hhVarNewBuilder = hi.newBuilder((hi) this.stat_);
            hhVarNewBuilder.mergeFrom((hh) hiVar);
            hiVar = hhVarNewBuilder.buildPartial();
        }
        this.stat_ = hiVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBannerShown(hk hkVar) {
        Objects.requireNonNull(hkVar);
        if (this.statCase_ == 1 && this.stat_ != hk.getDefaultInstance()) {
            hj hjVarNewBuilder = hk.newBuilder((hk) this.stat_);
            hjVarNewBuilder.mergeFrom((hj) hkVar);
            hkVar = hjVarNewBuilder.buildPartial();
        }
        this.stat_ = hkVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMainMenuButtonClicked(ahi ahiVar) {
        Objects.requireNonNull(ahiVar);
        if (this.statCase_ == 4 && this.stat_ != ahi.getDefaultInstance()) {
            ahh ahhVarNewBuilder = ahi.newBuilder((ahi) this.stat_);
            ahhVarNewBuilder.mergeFrom((ahh) ahiVar);
            ahiVar = ahhVarNewBuilder.buildPartial();
        }
        this.stat_ = ahiVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMainMenuButtonShown(ahk ahkVar) {
        Objects.requireNonNull(ahkVar);
        if (this.statCase_ == 5 && this.stat_ != ahk.getDefaultInstance()) {
            ahj ahjVarNewBuilder = ahk.newBuilder((ahk) this.stat_);
            ahjVarNewBuilder.mergeFrom((ahj) ahkVar);
            ahkVar = ahjVarNewBuilder.buildPartial();
        }
        this.stat_ = ahkVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMainMenuClicked(ahn ahnVar) {
        Objects.requireNonNull(ahnVar);
        if (this.statCase_ == 6 && this.stat_ != ahn.getDefaultInstance()) {
            ahm ahmVarNewBuilder = ahn.newBuilder((ahn) this.stat_);
            ahmVarNewBuilder.mergeFrom((ahm) ahnVar);
            ahnVar = ahmVarNewBuilder.buildPartial();
        }
        this.stat_ = ahnVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMainMenuShown(ahq ahqVar) {
        Objects.requireNonNull(ahqVar);
        if (this.statCase_ == 7 && this.stat_ != ahq.getDefaultInstance()) {
            aho ahoVarNewBuilder = ahq.newBuilder((ahq) this.stat_);
            ahoVarNewBuilder.mergeFrom((aho) ahqVar);
            ahqVar = ahoVarNewBuilder.buildPartial();
        }
        this.stat_ = ahqVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromotionalChipClicked(asc ascVar) {
        Objects.requireNonNull(ascVar);
        if (this.statCase_ == 8 && this.stat_ != asc.getDefaultInstance()) {
            asa asaVarNewBuilder = asc.newBuilder((asc) this.stat_);
            asaVarNewBuilder.mergeFrom((asa) ascVar);
            ascVar = asaVarNewBuilder.buildPartial();
        }
        this.stat_ = ascVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromotionalChipReceived(asg asgVar) {
        Objects.requireNonNull(asgVar);
        if (this.statCase_ == 9 && this.stat_ != asg.getDefaultInstance()) {
            asf asfVarNewBuilder = asg.newBuilder((asg) this.stat_);
            asfVarNewBuilder.mergeFrom((asf) asgVar);
            asgVar = asfVarNewBuilder.buildPartial();
        }
        this.stat_ = asgVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromotionalChipShown(asi asiVar) {
        Objects.requireNonNull(asiVar);
        if (this.statCase_ == 10 && this.stat_ != asi.getDefaultInstance()) {
            ash ashVarNewBuilder = asi.newBuilder((asi) this.stat_);
            ashVarNewBuilder.mergeFrom((ash) asiVar);
            asiVar = ashVarNewBuilder.buildPartial();
        }
        this.stat_ = asiVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromotionalChipSkipped(asl aslVar) {
        Objects.requireNonNull(aslVar);
        if (this.statCase_ == 11 && this.stat_ != asl.getDefaultInstance()) {
            asj asjVarNewBuilder = asl.newBuilder((asl) this.stat_);
            asjVarNewBuilder.mergeFrom((asj) aslVar);
            aslVar = asjVarNewBuilder.buildPartial();
        }
        this.stat_ = aslVar;
        this.statCase_ = 11;
    }

    public static ahr newBuilder() {
        return (ahr) DEFAULT_INSTANCE.createBuilder();
    }

    public static aht parseDelimitedFrom(InputStream inputStream) {
        return (aht) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aht parseFrom(com.google.v.v vVar) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aht> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerClicked(hd hdVar) {
        Objects.requireNonNull(hdVar);
        this.stat_ = hdVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerReceived(hi hiVar) {
        Objects.requireNonNull(hiVar);
        this.stat_ = hiVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerShown(hk hkVar) {
        Objects.requireNonNull(hkVar);
        this.stat_ = hkVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainMenuButtonClicked(ahi ahiVar) {
        Objects.requireNonNull(ahiVar);
        this.stat_ = ahiVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainMenuButtonShown(ahk ahkVar) {
        Objects.requireNonNull(ahkVar);
        this.stat_ = ahkVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainMenuClicked(ahn ahnVar) {
        Objects.requireNonNull(ahnVar);
        this.stat_ = ahnVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainMenuShown(ahq ahqVar) {
        Objects.requireNonNull(ahqVar);
        this.stat_ = ahqVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionalChipClicked(asc ascVar) {
        Objects.requireNonNull(ascVar);
        this.stat_ = ascVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionalChipReceived(asg asgVar) {
        Objects.requireNonNull(asgVar);
        this.stat_ = asgVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionalChipShown(asi asiVar) {
        Objects.requireNonNull(asiVar);
        this.stat_ = asiVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionalChipSkipped(asl aslVar) {
        Objects.requireNonNull(aslVar);
        this.stat_ = aslVar;
        this.statCase_ = 11;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"stat_", "statCase_", hk.class, hd.class, hi.class, ahi.class, ahk.class, ahn.class, ahq.class, asc.class, asg.class, asi.class, asl.class});
        }
        if (iOrdinal == 3) {
            return new aht();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ahr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aht> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aht.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hd getBannerClicked() {
        return this.statCase_ == 2 ? (hd) this.stat_ : hd.getDefaultInstance();
    }

    public hi getBannerReceived() {
        return this.statCase_ == 3 ? (hi) this.stat_ : hi.getDefaultInstance();
    }

    public hk getBannerShown() {
        return this.statCase_ == 1 ? (hk) this.stat_ : hk.getDefaultInstance();
    }

    public ahi getMainMenuButtonClicked() {
        return this.statCase_ == 4 ? (ahi) this.stat_ : ahi.getDefaultInstance();
    }

    public ahk getMainMenuButtonShown() {
        return this.statCase_ == 5 ? (ahk) this.stat_ : ahk.getDefaultInstance();
    }

    public ahn getMainMenuClicked() {
        return this.statCase_ == 6 ? (ahn) this.stat_ : ahn.getDefaultInstance();
    }

    public ahq getMainMenuShown() {
        return this.statCase_ == 7 ? (ahq) this.stat_ : ahq.getDefaultInstance();
    }

    public asc getPromotionalChipClicked() {
        return this.statCase_ == 8 ? (asc) this.stat_ : asc.getDefaultInstance();
    }

    public asg getPromotionalChipReceived() {
        return this.statCase_ == 9 ? (asg) this.stat_ : asg.getDefaultInstance();
    }

    public asi getPromotionalChipShown() {
        return this.statCase_ == 10 ? (asi) this.stat_ : asi.getDefaultInstance();
    }

    public asl getPromotionalChipSkipped() {
        return this.statCase_ == 11 ? (asl) this.stat_ : asl.getDefaultInstance();
    }

    public ahs getStatCase() {
        switch (this.statCase_) {
            case 0:
                return ahs.f52527l;
            case 1:
                return ahs.f52516a;
            case 2:
                return ahs.f52517b;
            case 3:
                return ahs.f52518c;
            case 4:
                return ahs.f52519d;
            case 5:
                return ahs.f52520e;
            case 6:
                return ahs.f52521f;
            case 7:
                return ahs.f52522g;
            case 8:
                return ahs.f52523h;
            case 9:
                return ahs.f52524i;
            case 10:
                return ahs.f52525j;
            case 11:
                return ahs.f52526k;
            default:
                return null;
        }
    }

    public boolean hasBannerClicked() {
        return this.statCase_ == 2;
    }

    public boolean hasBannerReceived() {
        return this.statCase_ == 3;
    }

    public boolean hasBannerShown() {
        return this.statCase_ == 1;
    }

    public boolean hasMainMenuButtonClicked() {
        return this.statCase_ == 4;
    }

    public boolean hasMainMenuButtonShown() {
        return this.statCase_ == 5;
    }

    public boolean hasMainMenuClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasMainMenuShown() {
        return this.statCase_ == 7;
    }

    public boolean hasPromotionalChipClicked() {
        return this.statCase_ == 8;
    }

    public boolean hasPromotionalChipReceived() {
        return this.statCase_ == 9;
    }

    public boolean hasPromotionalChipShown() {
        return this.statCase_ == 10;
    }

    public boolean hasPromotionalChipSkipped() {
        return this.statCase_ == 11;
    }

    public static ahr newBuilder(aht ahtVar) {
        return (ahr) DEFAULT_INSTANCE.createBuilder(ahtVar);
    }

    public static aht parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aht) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aht parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aht parseFrom(com.google.v.z zVar) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aht parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aht parseFrom(InputStream inputStream) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aht parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aht parseFrom(ByteBuffer byteBuffer) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aht parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aht parseFrom(byte[] bArr) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aht parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
