package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azb extends com.google.v.du<azb, aza> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CATEGORY_FIELD_NUMBER = 2;
    public static final int CATEGORY_INDEX_FIELD_NUMBER = 4;
    public static final int CLICKED_CARD_FIELD_NUMBER = 6;
    private static final azb DEFAULT_INSTANCE;
    public static final int DESTINATION_CARD_INDEX_FIELD_NUMBER = 5;
    public static final int FEATURED_CATEGORY_FIELD_NUMBER = 3;
    public static final int LIST_CARDS_COUNT_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<azb> PARSER = null;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 8;
    private int action_;
    private int bitField0_;
    private long categoryIndex_;
    private int category_;
    private px clickedCard_;
    private long destinationCardIndex_;
    private boolean featuredCategory_;
    private long listCardsCount_;
    private int triggeringPlatform_;

    static {
        azb azbVar = new azb();
        DEFAULT_INSTANCE = azbVar;
        com.google.v.du.registerDefaultInstance(azb.class, azbVar);
    }

    private azb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryIndex() {
        this.bitField0_ &= -3;
        this.categoryIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickedCard() {
        this.clickedCard_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCardIndex() {
        this.bitField0_ &= -5;
        this.destinationCardIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeaturedCategory() {
        this.bitField0_ &= -2;
        this.featuredCategory_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListCardsCount() {
        this.bitField0_ &= -17;
        this.listCardsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    public static azb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClickedCard(px pxVar) {
        Objects.requireNonNull(pxVar);
        px pxVar2 = this.clickedCard_;
        if (pxVar2 != null && pxVar2 != px.getDefaultInstance()) {
            pt ptVarNewBuilder = px.newBuilder(pxVar2);
            ptVarNewBuilder.mergeFrom((pt) pxVar);
            pxVar = ptVarNewBuilder.buildPartial();
        }
        this.clickedCard_ = pxVar;
        this.bitField0_ |= 8;
    }

    public static aza newBuilder() {
        return (aza) DEFAULT_INSTANCE.createBuilder();
    }

    public static azb parseDelimitedFrom(InputStream inputStream) {
        return (azb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azb parseFrom(com.google.v.v vVar) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<azb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ayz ayzVar) {
        this.action_ = ayzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(ayn aynVar) {
        this.category_ = aynVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryIndex(long j2) {
        this.bitField0_ |= 2;
        this.categoryIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryValue(int i2) {
        this.category_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedCard(px pxVar) {
        Objects.requireNonNull(pxVar);
        this.clickedCard_ = pxVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCardIndex(long j2) {
        this.bitField0_ |= 4;
        this.destinationCardIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeaturedCategory(boolean z) {
        this.bitField0_ |= 1;
        this.featuredCategory_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListCardsCount(long j2) {
        this.bitField0_ |= 16;
        this.listCardsCount_ = j2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဉ\u0003\u0007ဂ\u0004\b\f", new Object[]{"bitField0_", "action_", "category_", "featuredCategory_", "categoryIndex_", "destinationCardIndex_", "clickedCard_", "listCardsCount_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new azb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aza(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<azb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (azb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ayz getAction() {
        int i2 = this.action_;
        ayz ayzVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : ayz.MAIN_MENU : ayz.DESTINATION_CARD : ayz.BACK : ayz.CATEGORY : ayz.VOICE_SEARCH : ayz.ACTION_UNSPECIFIED;
        return ayzVar == null ? ayz.UNRECOGNIZED : ayzVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public ayn getCategory() {
        ayn aynVarA = ayn.a(this.category_);
        return aynVarA == null ? ayn.UNRECOGNIZED : aynVarA;
    }

    public long getCategoryIndex() {
        return this.categoryIndex_;
    }

    public int getCategoryValue() {
        return this.category_;
    }

    public px getClickedCard() {
        px pxVar = this.clickedCard_;
        return pxVar == null ? px.getDefaultInstance() : pxVar;
    }

    public long getDestinationCardIndex() {
        return this.destinationCardIndex_;
    }

    public boolean getFeaturedCategory() {
        return this.featuredCategory_;
    }

    public long getListCardsCount() {
        return this.listCardsCount_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public boolean hasCategoryIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasClickedCard() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDestinationCardIndex() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFeaturedCategory() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasListCardsCount() {
        return (this.bitField0_ & 16) != 0;
    }

    public static aza newBuilder(azb azbVar) {
        return (aza) DEFAULT_INSTANCE.createBuilder(azbVar);
    }

    public static azb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static azb parseFrom(com.google.v.z zVar) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static azb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static azb parseFrom(InputStream inputStream) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azb parseFrom(ByteBuffer byteBuffer) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static azb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static azb parseFrom(byte[] bArr) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static azb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (azb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
