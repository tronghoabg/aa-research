package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgf extends com.google.v.du<bgf, bgd> implements com.google.v.fj {
    public static final int CALENDAR_CARDS_COUNT_FIELD_NUMBER = 5;
    private static final bgf DEFAULT_INSTANCE;
    public static final int DRAWER_STATE_FIELD_NUMBER = 1;
    public static final int FAVORITES_CAROUSEL_FIELD_NUMBER = 2;
    public static final int LIST_CARDS_COUNT_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bgf> PARSER = null;
    public static final int PLANNED_DRIVE_CARDS_COUNT_FIELD_NUMBER = 4;
    public static final int REASON_FIELD_NUMBER = 6;
    private int bitField0_;
    private long calendarCardsCount_;
    private int drawerState_;
    private wj favoritesCarousel_;
    private long listCardsCount_;
    private long plannedDriveCardsCount_;
    private int reason_;

    static {
        bgf bgfVar = new bgf();
        DEFAULT_INSTANCE = bgfVar;
        com.google.v.du.registerDefaultInstance(bgf.class, bgfVar);
    }

    private bgf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalendarCardsCount() {
        this.bitField0_ &= -9;
        this.calendarCardsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrawerState() {
        this.drawerState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoritesCarousel() {
        this.favoritesCarousel_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListCardsCount() {
        this.bitField0_ &= -3;
        this.listCardsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedDriveCardsCount() {
        this.bitField0_ &= -5;
        this.plannedDriveCardsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static bgf getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 1;
    }

    public static bgd newBuilder() {
        return (bgd) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgf parseDelimitedFrom(InputStream inputStream) {
        return (bgf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgf parseFrom(com.google.v.v vVar) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalendarCardsCount(long j2) {
        this.bitField0_ |= 8;
        this.calendarCardsCount_ = j2;
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListCardsCount(long j2) {
        this.bitField0_ |= 2;
        this.listCardsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedDriveCardsCount(long j2) {
        this.bitField0_ |= 4;
        this.plannedDriveCardsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(bge bgeVar) {
        this.reason_ = bgeVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006\f", new Object[]{"bitField0_", "drawerState_", "favoritesCarousel_", "listCardsCount_", "plannedDriveCardsCount_", "calendarCardsCount_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new bgf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bgd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCalendarCardsCount() {
        return this.calendarCardsCount_;
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

    public bge getReason() {
        int i2 = this.reason_;
        bge bgeVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bge.UGC_MENU_DISMISS : bge.NAVIGATION_END : bge.APP_LAUNCH : bge.REASON_UNSPECIFIED;
        return bgeVar == null ? bge.UNRECOGNIZED : bgeVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasCalendarCardsCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFavoritesCarousel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasListCardsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPlannedDriveCardsCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bgd newBuilder(bgf bgfVar) {
        return (bgd) DEFAULT_INSTANCE.createBuilder(bgfVar);
    }

    public static bgf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgf parseFrom(com.google.v.z zVar) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgf parseFrom(InputStream inputStream) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgf parseFrom(ByteBuffer byteBuffer) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgf parseFrom(byte[] bArr) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
