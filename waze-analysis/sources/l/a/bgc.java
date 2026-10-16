package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgc extends com.google.v.du<bgc, bga> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CALENDAR_CARDS_COUNT_FIELD_NUMBER = 10;
    public static final int CLICKED_CARD_FIELD_NUMBER = 4;
    public static final int CLICKED_CARD_INDEX_FIELD_NUMBER = 5;
    public static final int CLICKED_CHIP_FIELD_NUMBER = 7;
    public static final int CLICK_TYPE_FIELD_NUMBER = 2;
    private static final bgc DEFAULT_INSTANCE;
    public static final int DRAWER_STATE_FIELD_NUMBER = 8;
    public static final int FAVORITES_CAROUSEL_FIELD_NUMBER = 12;
    public static final int LIST_CARDS_COUNT_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<bgc> PARSER = null;
    public static final int PLANNED_DRIVE_CARDS_COUNT_FIELD_NUMBER = 9;
    public static final int RT_INFO_FIELD_NUMBER = 11;
    private int action_;
    private int bitField0_;
    private long calendarCardsCount_;
    private int clickType_;
    private long clickedCardIndex_;
    private px clickedCard_;
    private qq clickedChip_;
    private int drawerState_;
    private wj favoritesCarousel_;
    private long listCardsCount_;
    private long plannedDriveCardsCount_;
    private awz rtInfo_;

    static {
        bgc bgcVar = new bgc();
        DEFAULT_INSTANCE = bgcVar;
        com.google.v.du.registerDefaultInstance(bgc.class, bgcVar);
    }

    private bgc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalendarCardsCount() {
        this.bitField0_ &= -33;
        this.calendarCardsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickType() {
        this.clickType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickedCard() {
        this.clickedCard_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickedCardIndex() {
        this.bitField0_ &= -3;
        this.clickedCardIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickedChip() {
        this.clickedChip_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrawerState() {
        this.drawerState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoritesCarousel() {
        this.favoritesCarousel_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListCardsCount() {
        this.bitField0_ &= -5;
        this.listCardsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveCardsCount() {
        this.bitField0_ &= -17;
        this.plannedDriveCardsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtInfo() {
        this.rtInfo_ = null;
        this.bitField0_ &= -65;
    }

    public static bgc getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClickedChip(qq qqVar) {
        Objects.requireNonNull(qqVar);
        qq qqVar2 = this.clickedChip_;
        if (qqVar2 != null && qqVar2 != qq.getDefaultInstance()) {
            qn qnVarNewBuilder = qq.newBuilder(qqVar2);
            qnVarNewBuilder.mergeFrom((qn) qqVar);
            qqVar = qnVarNewBuilder.buildPartial();
        }
        this.clickedChip_ = qqVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavoritesCarousel(wj wjVar) {
        Objects.requireNonNull(wjVar);
        wj wjVar2 = this.favoritesCarousel_;
        if (wjVar2 != null && wjVar2 != wj.getDefaultInstance()) {
            wi wiVarNewBuilder = wj.newBuilder(wjVar2);
            wiVarNewBuilder.mergeFrom((wi) wjVar);
            wjVar = wiVarNewBuilder.buildPartial();
        }
        this.favoritesCarousel_ = wjVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRtInfo(awz awzVar) {
        Objects.requireNonNull(awzVar);
        awz awzVar2 = this.rtInfo_;
        if (awzVar2 != null && awzVar2 != awz.getDefaultInstance()) {
            awy awyVarNewBuilder = awz.newBuilder(awzVar2);
            awyVarNewBuilder.mergeFrom((awy) awzVar);
            awzVar = awyVarNewBuilder.buildPartial();
        }
        this.rtInfo_ = awzVar;
        this.bitField0_ |= 64;
    }

    public static bga newBuilder() {
        return (bga) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgc parseDelimitedFrom(InputStream inputStream) {
        return (bgc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgc parseFrom(com.google.v.v vVar) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bfz bfzVar) {
        this.action_ = bfzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalendarCardsCount(long j2) {
        this.bitField0_ |= 32;
        this.calendarCardsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickType(bgb bgbVar) {
        this.clickType_ = bgbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickTypeValue(int i2) {
        this.clickType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedCard(px pxVar) {
        Objects.requireNonNull(pxVar);
        this.clickedCard_ = pxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedCardIndex(long j2) {
        this.bitField0_ |= 2;
        this.clickedCardIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedChip(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.clickedChip_ = qqVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawerState(sv svVar) {
        this.drawerState_ = svVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawerStateValue(int i2) {
        this.drawerState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoritesCarousel(wj wjVar) {
        Objects.requireNonNull(wjVar);
        this.favoritesCarousel_ = wjVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListCardsCount(long j2) {
        this.bitField0_ |= 4;
        this.listCardsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveCardsCount(long j2) {
        this.bitField0_ |= 16;
        this.plannedDriveCardsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtInfo(awz awzVar) {
        Objects.requireNonNull(awzVar);
        this.rtInfo_ = awzVar;
        this.bitField0_ |= 64;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001\f\u0002\f\u0004ဉ\u0000\u0005ဂ\u0001\u0006ဂ\u0002\u0007ဉ\u0003\b\f\tဂ\u0004\nဂ\u0005\u000bဉ\u0006\fဉ\u0007", new Object[]{"bitField0_", "action_", "clickType_", "clickedCard_", "clickedCardIndex_", "listCardsCount_", "clickedChip_", "drawerState_", "plannedDriveCardsCount_", "calendarCardsCount_", "rtInfo_", "favoritesCarousel_"});
        }
        if (iOrdinal == 3) {
            return new bgc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bga(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bfz getAction() {
        bfz bfzVar;
        switch (this.action_) {
            case 0:
                bfzVar = bfz.ACTION_UNSPECIFIED;
                break;
            case 1:
                bfzVar = bfz.DESTINATION_CARD;
                break;
            case 2:
                bfzVar = bfz.SCROLL;
                break;
            case 3:
                bfzVar = bfz.SEARCH_FIELD;
                break;
            case 4:
                bfzVar = bfz.SUGGESTED_INFO;
                break;
            case 5:
                bfzVar = bfz.VOICE_SEARCH;
                break;
            case 6:
                bfzVar = bfz.DESTINATION_CHIP;
                break;
            case 7:
                bfzVar = bfz.CAROUSEL_SCROLL;
                break;
            default:
                bfzVar = null;
                break;
        }
        return bfzVar == null ? bfz.UNRECOGNIZED : bfzVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public long getCalendarCardsCount() {
        return this.calendarCardsCount_;
    }

    public bgb getClickType() {
        int i2 = this.clickType_;
        bgb bgbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bgb.OPTIONS_FROM_SWIPE : bgb.LONG_PRESS : bgb.CLICK : bgb.CLICK_TYPE_UNSPECIFIED;
        return bgbVar == null ? bgb.UNRECOGNIZED : bgbVar;
    }

    public int getClickTypeValue() {
        return this.clickType_;
    }

    public px getClickedCard() {
        px pxVar = this.clickedCard_;
        return pxVar == null ? px.getDefaultInstance() : pxVar;
    }

    public long getClickedCardIndex() {
        return this.clickedCardIndex_;
    }

    public qq getClickedChip() {
        qq qqVar = this.clickedChip_;
        return qqVar == null ? qq.getDefaultInstance() : qqVar;
    }

    public sv getDrawerState() {
        sv svVarA = sv.a(this.drawerState_);
        return svVarA == null ? sv.UNRECOGNIZED : svVarA;
    }

    public int getDrawerStateValue() {
        return this.drawerState_;
    }

    public wj getFavoritesCarousel() {
        wj wjVar = this.favoritesCarousel_;
        return wjVar == null ? wj.getDefaultInstance() : wjVar;
    }

    public long getListCardsCount() {
        return this.listCardsCount_;
    }

    public long getPlannedDriveCardsCount() {
        return this.plannedDriveCardsCount_;
    }

    public awz getRtInfo() {
        awz awzVar = this.rtInfo_;
        return awzVar == null ? awz.getDefaultInstance() : awzVar;
    }

    public boolean hasCalendarCardsCount() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClickedCard() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClickedCardIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasClickedChip() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFavoritesCarousel() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasListCardsCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPlannedDriveCardsCount() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRtInfo() {
        return (this.bitField0_ & 64) != 0;
    }

    public static bga newBuilder(bgc bgcVar) {
        return (bga) DEFAULT_INSTANCE.createBuilder(bgcVar);
    }

    public static bgc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgc parseFrom(com.google.v.z zVar) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgc parseFrom(InputStream inputStream) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgc parseFrom(ByteBuffer byteBuffer) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgc parseFrom(byte[] bArr) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
