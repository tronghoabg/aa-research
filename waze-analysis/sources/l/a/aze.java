package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aze extends com.google.v.du<aze, azc> implements com.google.v.fj {
    public static final int CATEGORIES_SHOWN_FIELD_NUMBER = 2;
    private static final aze DEFAULT_INSTANCE;
    public static final int LIST_CARDS_COUNT_FIELD_NUMBER = 4;
    public static final int MAIN_MENU_BUTTON_SHOWN_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aze> PARSER = null;
    public static final int PORTRAIT_FIELD_NUMBER = 3;
    public static final int SEARCH_CONTEXT_FIELD_NUMBER = 6;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean categoriesShown_;
    private long listCardsCount_;
    private boolean mainMenuButtonShown_;
    private boolean portrait_;
    private int searchContext_;
    private int triggeringPlatform_;

    static {
        aze azeVar = new aze();
        DEFAULT_INSTANCE = azeVar;
        com.google.v.du.registerDefaultInstance(aze.class, azeVar);
    }

    private aze() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoriesShown() {
        this.bitField0_ &= -3;
        this.categoriesShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListCardsCount() {
        this.bitField0_ &= -9;
        this.listCardsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainMenuButtonShown() {
        this.bitField0_ &= -2;
        this.mainMenuButtonShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortrait() {
        this.bitField0_ &= -5;
        this.portrait_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchContext() {
        this.searchContext_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    public static aze getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static azc newBuilder() {
        return (azc) DEFAULT_INSTANCE.createBuilder();
    }

    public static aze parseDelimitedFrom(InputStream inputStream) {
        return (aze) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aze parseFrom(com.google.v.v vVar) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aze> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShown(boolean z) {
        this.bitField0_ |= 2;
        this.categoriesShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListCardsCount(long j2) {
        this.bitField0_ |= 8;
        this.listCardsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainMenuButtonShown(boolean z) {
        this.bitField0_ |= 1;
        this.mainMenuButtonShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortrait(boolean z) {
        this.bitField0_ |= 4;
        this.portrait_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchContext(azd azdVar) {
        this.searchContext_ = azdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchContextValue(int i2) {
        this.searchContext_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005\f\u0006\f", new Object[]{"bitField0_", "mainMenuButtonShown_", "categoriesShown_", "portrait_", "listCardsCount_", "triggeringPlatform_", "searchContext_"});
        }
        if (iOrdinal == 3) {
            return new aze();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new azc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aze> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aze.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getCategoriesShown() {
        return this.categoriesShown_;
    }

    public long getListCardsCount() {
        return this.listCardsCount_;
    }

    public boolean getMainMenuButtonShown() {
        return this.mainMenuButtonShown_;
    }

    public boolean getPortrait() {
        return this.portrait_;
    }

    public azd getSearchContext() {
        int i2 = this.searchContext_;
        azd azdVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : azd.TRIP_OVERVIEW_DESTINATION : azd.TRIP_OVERVIEW_ORIGIN : azd.MAIN_MAP : azd.SEARCH_CONTEXT_UNSPECIFIED;
        return azdVar == null ? azd.UNRECOGNIZED : azdVar;
    }

    public int getSearchContextValue() {
        return this.searchContext_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public boolean hasCategoriesShown() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasListCardsCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMainMenuButtonShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPortrait() {
        return (this.bitField0_ & 4) != 0;
    }

    public static azc newBuilder(aze azeVar) {
        return (azc) DEFAULT_INSTANCE.createBuilder(azeVar);
    }

    public static aze parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aze) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aze parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aze parseFrom(com.google.v.z zVar) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aze parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aze parseFrom(InputStream inputStream) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aze parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aze parseFrom(ByteBuffer byteBuffer) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aze parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aze parseFrom(byte[] bArr) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aze parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aze) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
