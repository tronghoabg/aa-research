package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class hi extends com.google.v.du<hi, hh> implements hj {
    public static final int BANNER_ACTION_FIELD_NUMBER = 8;
    public static final int BANNER_ICON_FIELD_NUMBER = 6;
    public static final int BANNER_TITLE_FIELD_NUMBER = 7;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_PRIORITY_FIELD_NUMBER = 2;
    public static final int CAR_BG_COLOR_FIELD_NUMBER = 10;
    public static final int CAR_IDS_FIELD_NUMBER = 9;
    private static final hi DEFAULT_INSTANCE;
    public static final int LANGUAGE_BG_COLOR_FIELD_NUMBER = 19;
    public static final int LANGUAGE_ICONS_FIELD_NUMBER = 18;
    public static final int LANGUAGE_IDS_FIELD_NUMBER = 14;
    public static final int MOOD_BG_COLOR_FIELD_NUMBER = 12;
    public static final int MOOD_IDS_FIELD_NUMBER = 11;
    private static volatile com.google.v.fo<hi> PARSER = null;
    public static final int PROMPT_BG_COLOR_FIELD_NUMBER = 17;
    public static final int PROMPT_ICONS_FIELD_NUMBER = 16;
    public static final int PROMPT_IDS_FIELD_NUMBER = 13;
    public static final int SHEET_ICON_FIELD_NUMBER = 3;
    public static final int SHEET_SUBTITLE_FIELD_NUMBER = 5;
    public static final int SHEET_TITLE_FIELD_NUMBER = 4;
    public static final int SHOW_BANNER_FIELD_NUMBER = 15;
    private int bitField0_;
    private int campaignPriority_;
    private boolean showBanner_;
    private String campaignId_ = "";
    private String sheetIcon_ = "";
    private String sheetTitle_ = "";
    private String sheetSubtitle_ = "";
    private String bannerIcon_ = "";
    private String bannerTitle_ = "";
    private String bannerAction_ = "";
    private com.google.v.eo<String> carIds_ = emptyProtobufList();
    private String carBgColor_ = "";
    private com.google.v.eo<String> moodIds_ = emptyProtobufList();
    private String moodBgColor_ = "";
    private com.google.v.eo<String> promptIds_ = emptyProtobufList();
    private com.google.v.eo<String> languageIds_ = emptyProtobufList();
    private com.google.v.eo<String> promptIcons_ = emptyProtobufList();
    private String promptBgColor_ = "";
    private com.google.v.eo<String> languageIcons_ = emptyProtobufList();
    private String languageBgColor_ = "";

    static {
        hi hiVar = new hi();
        DEFAULT_INSTANCE = hiVar;
        com.google.v.du.registerDefaultInstance(hi.class, hiVar);
    }

    private hi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCarIds(Iterable<String> iterable) {
        ensureCarIdsIsMutable();
        com.google.v.c.addAll(iterable, this.carIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLanguageIcons(Iterable<String> iterable) {
        ensureLanguageIconsIsMutable();
        com.google.v.c.addAll(iterable, this.languageIcons_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLanguageIds(Iterable<String> iterable) {
        ensureLanguageIdsIsMutable();
        com.google.v.c.addAll(iterable, this.languageIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMoodIds(Iterable<String> iterable) {
        ensureMoodIdsIsMutable();
        com.google.v.c.addAll(iterable, this.moodIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPromptIcons(Iterable<String> iterable) {
        ensurePromptIconsIsMutable();
        com.google.v.c.addAll(iterable, this.promptIcons_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPromptIds(Iterable<String> iterable) {
        ensurePromptIdsIsMutable();
        com.google.v.c.addAll(iterable, this.promptIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCarIds(String str) {
        Objects.requireNonNull(str);
        ensureCarIdsIsMutable();
        this.carIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCarIdsBytes(com.google.v.v vVar) {
        ensureCarIdsIsMutable();
        this.carIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguageIcons(String str) {
        Objects.requireNonNull(str);
        ensureLanguageIconsIsMutable();
        this.languageIcons_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguageIconsBytes(com.google.v.v vVar) {
        ensureLanguageIconsIsMutable();
        this.languageIcons_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguageIds(String str) {
        Objects.requireNonNull(str);
        ensureLanguageIdsIsMutable();
        this.languageIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLanguageIdsBytes(com.google.v.v vVar) {
        ensureLanguageIdsIsMutable();
        this.languageIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMoodIds(String str) {
        Objects.requireNonNull(str);
        ensureMoodIdsIsMutable();
        this.moodIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMoodIdsBytes(com.google.v.v vVar) {
        ensureMoodIdsIsMutable();
        this.moodIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPromptIcons(String str) {
        Objects.requireNonNull(str);
        ensurePromptIconsIsMutable();
        this.promptIcons_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPromptIconsBytes(com.google.v.v vVar) {
        ensurePromptIconsIsMutable();
        this.promptIcons_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPromptIds(String str) {
        Objects.requireNonNull(str);
        ensurePromptIdsIsMutable();
        this.promptIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPromptIdsBytes(com.google.v.v vVar) {
        ensurePromptIdsIsMutable();
        this.promptIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerAction() {
        this.bitField0_ &= -129;
        this.bannerAction_ = getDefaultInstance().getBannerAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerIcon() {
        this.bitField0_ &= -33;
        this.bannerIcon_ = getDefaultInstance().getBannerIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBannerTitle() {
        this.bitField0_ &= -65;
        this.bannerTitle_ = getDefaultInstance().getBannerTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.bitField0_ &= -2;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignPriority() {
        this.bitField0_ &= -3;
        this.campaignPriority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarBgColor() {
        this.bitField0_ &= -257;
        this.carBgColor_ = getDefaultInstance().getCarBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarIds() {
        this.carIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageBgColor() {
        this.bitField0_ &= -4097;
        this.languageBgColor_ = getDefaultInstance().getLanguageBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageIcons() {
        this.languageIcons_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageIds() {
        this.languageIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodBgColor() {
        this.bitField0_ &= -513;
        this.moodBgColor_ = getDefaultInstance().getMoodBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodIds() {
        this.moodIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptBgColor() {
        this.bitField0_ &= -2049;
        this.promptBgColor_ = getDefaultInstance().getPromptBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptIcons() {
        this.promptIcons_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptIds() {
        this.promptIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSheetIcon() {
        this.bitField0_ &= -5;
        this.sheetIcon_ = getDefaultInstance().getSheetIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSheetSubtitle() {
        this.bitField0_ &= -17;
        this.sheetSubtitle_ = getDefaultInstance().getSheetSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSheetTitle() {
        this.bitField0_ &= -9;
        this.sheetTitle_ = getDefaultInstance().getSheetTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowBanner() {
        this.bitField0_ &= -1025;
        this.showBanner_ = false;
    }

    private void ensureCarIdsIsMutable() {
        com.google.v.eo<String> eoVar = this.carIds_;
        if (eoVar.c()) {
            return;
        }
        this.carIds_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureLanguageIconsIsMutable() {
        com.google.v.eo<String> eoVar = this.languageIcons_;
        if (eoVar.c()) {
            return;
        }
        this.languageIcons_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureLanguageIdsIsMutable() {
        com.google.v.eo<String> eoVar = this.languageIds_;
        if (eoVar.c()) {
            return;
        }
        this.languageIds_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureMoodIdsIsMutable() {
        com.google.v.eo<String> eoVar = this.moodIds_;
        if (eoVar.c()) {
            return;
        }
        this.moodIds_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePromptIconsIsMutable() {
        com.google.v.eo<String> eoVar = this.promptIcons_;
        if (eoVar.c()) {
            return;
        }
        this.promptIcons_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePromptIdsIsMutable() {
        com.google.v.eo<String> eoVar = this.promptIds_;
        if (eoVar.c()) {
            return;
        }
        this.promptIds_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hh newBuilder() {
        return (hh) DEFAULT_INSTANCE.createBuilder();
    }

    public static hi parseDelimitedFrom(InputStream inputStream) {
        return (hi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hi parseFrom(com.google.v.v vVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerAction(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.bannerAction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerActionBytes(com.google.v.v vVar) {
        this.bannerAction_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.bannerIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerIconBytes(com.google.v.v vVar) {
        this.bannerIcon_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.bannerTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerTitleBytes(com.google.v.v vVar) {
        this.bannerTitle_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignIdBytes(com.google.v.v vVar) {
        this.campaignId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignPriority(int i2) {
        this.bitField0_ |= 2;
        this.campaignPriority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarBgColor(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.carBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarBgColorBytes(com.google.v.v vVar) {
        this.carBgColor_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureCarIdsIsMutable();
        this.carIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBgColor(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.languageBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBgColorBytes(com.google.v.v vVar) {
        this.languageBgColor_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageIcons(int i2, String str) {
        Objects.requireNonNull(str);
        ensureLanguageIconsIsMutable();
        this.languageIcons_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureLanguageIdsIsMutable();
        this.languageIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodBgColor(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.moodBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodBgColorBytes(com.google.v.v vVar) {
        this.moodBgColor_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureMoodIdsIsMutable();
        this.moodIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptBgColor(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.promptBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptBgColorBytes(com.google.v.v vVar) {
        this.promptBgColor_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptIcons(int i2, String str) {
        Objects.requireNonNull(str);
        ensurePromptIconsIsMutable();
        this.promptIcons_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensurePromptIdsIsMutable();
        this.promptIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.sheetIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetIconBytes(com.google.v.v vVar) {
        this.sheetIcon_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetSubtitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.sheetSubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetSubtitleBytes(com.google.v.v vVar) {
        this.sheetSubtitle_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.sheetTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetTitleBytes(com.google.v.v vVar) {
        this.sheetTitle_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowBanner(boolean z) {
        this.bitField0_ |= 1024;
        this.showBanner_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0006\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t\u001a\nဈ\b\u000b\u001a\fဈ\t\r\u001a\u000e\u001a\u000fဇ\n\u0010\u001a\u0011ဈ\u000b\u0012\u001a\u0013ဈ\f", new Object[]{"bitField0_", "campaignId_", "campaignPriority_", "sheetIcon_", "sheetTitle_", "sheetSubtitle_", "bannerIcon_", "bannerTitle_", "bannerAction_", "carIds_", "carBgColor_", "moodIds_", "moodBgColor_", "promptIds_", "languageIds_", "showBanner_", "promptIcons_", "promptBgColor_", "languageIcons_", "languageBgColor_"});
        }
        if (iOrdinal == 3) {
            return new hi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBannerAction() {
        return this.bannerAction_;
    }

    public com.google.v.v getBannerActionBytes() {
        return com.google.v.v.s(this.bannerAction_);
    }

    public String getBannerIcon() {
        return this.bannerIcon_;
    }

    public com.google.v.v getBannerIconBytes() {
        return com.google.v.v.s(this.bannerIcon_);
    }

    public String getBannerTitle() {
        return this.bannerTitle_;
    }

    public com.google.v.v getBannerTitleBytes() {
        return com.google.v.v.s(this.bannerTitle_);
    }

    public String getCampaignId() {
        return this.campaignId_;
    }

    public com.google.v.v getCampaignIdBytes() {
        return com.google.v.v.s(this.campaignId_);
    }

    public int getCampaignPriority() {
        return this.campaignPriority_;
    }

    public String getCarBgColor() {
        return this.carBgColor_;
    }

    public com.google.v.v getCarBgColorBytes() {
        return com.google.v.v.s(this.carBgColor_);
    }

    public String getCarIds(int i2) {
        return this.carIds_.get(i2);
    }

    public com.google.v.v getCarIdsBytes(int i2) {
        return com.google.v.v.s(this.carIds_.get(i2));
    }

    public int getCarIdsCount() {
        return this.carIds_.size();
    }

    public List<String> getCarIdsList() {
        return this.carIds_;
    }

    public String getLanguageBgColor() {
        return this.languageBgColor_;
    }

    public com.google.v.v getLanguageBgColorBytes() {
        return com.google.v.v.s(this.languageBgColor_);
    }

    public String getLanguageIcons(int i2) {
        return this.languageIcons_.get(i2);
    }

    public com.google.v.v getLanguageIconsBytes(int i2) {
        return com.google.v.v.s(this.languageIcons_.get(i2));
    }

    public int getLanguageIconsCount() {
        return this.languageIcons_.size();
    }

    public List<String> getLanguageIconsList() {
        return this.languageIcons_;
    }

    public String getLanguageIds(int i2) {
        return this.languageIds_.get(i2);
    }

    public com.google.v.v getLanguageIdsBytes(int i2) {
        return com.google.v.v.s(this.languageIds_.get(i2));
    }

    public int getLanguageIdsCount() {
        return this.languageIds_.size();
    }

    public List<String> getLanguageIdsList() {
        return this.languageIds_;
    }

    public String getMoodBgColor() {
        return this.moodBgColor_;
    }

    public com.google.v.v getMoodBgColorBytes() {
        return com.google.v.v.s(this.moodBgColor_);
    }

    public String getMoodIds(int i2) {
        return this.moodIds_.get(i2);
    }

    public com.google.v.v getMoodIdsBytes(int i2) {
        return com.google.v.v.s(this.moodIds_.get(i2));
    }

    public int getMoodIdsCount() {
        return this.moodIds_.size();
    }

    public List<String> getMoodIdsList() {
        return this.moodIds_;
    }

    public String getPromptBgColor() {
        return this.promptBgColor_;
    }

    public com.google.v.v getPromptBgColorBytes() {
        return com.google.v.v.s(this.promptBgColor_);
    }

    public String getPromptIcons(int i2) {
        return this.promptIcons_.get(i2);
    }

    public com.google.v.v getPromptIconsBytes(int i2) {
        return com.google.v.v.s(this.promptIcons_.get(i2));
    }

    public int getPromptIconsCount() {
        return this.promptIcons_.size();
    }

    public List<String> getPromptIconsList() {
        return this.promptIcons_;
    }

    public String getPromptIds(int i2) {
        return this.promptIds_.get(i2);
    }

    public com.google.v.v getPromptIdsBytes(int i2) {
        return com.google.v.v.s(this.promptIds_.get(i2));
    }

    public int getPromptIdsCount() {
        return this.promptIds_.size();
    }

    public List<String> getPromptIdsList() {
        return this.promptIds_;
    }

    public String getSheetIcon() {
        return this.sheetIcon_;
    }

    public com.google.v.v getSheetIconBytes() {
        return com.google.v.v.s(this.sheetIcon_);
    }

    public String getSheetSubtitle() {
        return this.sheetSubtitle_;
    }

    public com.google.v.v getSheetSubtitleBytes() {
        return com.google.v.v.s(this.sheetSubtitle_);
    }

    public String getSheetTitle() {
        return this.sheetTitle_;
    }

    public com.google.v.v getSheetTitleBytes() {
        return com.google.v.v.s(this.sheetTitle_);
    }

    public boolean getShowBanner() {
        return this.showBanner_;
    }

    public boolean hasBannerAction() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasBannerIcon() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBannerTitle() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCampaignPriority() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCarBgColor() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasLanguageBgColor() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasMoodBgColor() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasPromptBgColor() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasSheetIcon() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSheetSubtitle() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSheetTitle() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasShowBanner() {
        return (this.bitField0_ & 1024) != 0;
    }

    public static hh newBuilder(hi hiVar) {
        return (hh) DEFAULT_INSTANCE.createBuilder(hiVar);
    }

    public static hi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hi parseFrom(com.google.v.z zVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hi parseFrom(InputStream inputStream) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hi parseFrom(ByteBuffer byteBuffer) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hi parseFrom(byte[] bArr) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
