package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bkf extends com.google.v.du<bkf, bkd> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 15;
    public static final int ACTION_SOURCE_FIELD_NUMBER = 2;
    public static final int ACTION_SUB_SOURCE_FIELD_NUMBER = 3;
    public static final int CARD_INDEX_FIELD_NUMBER = 9;
    private static final bkf DEFAULT_INSTANCE;
    public static final int HOV_FIELD_NUMBER = 7;
    public static final int IS_NOW_FIELD_NUMBER = 6;
    public static final int ORIGIN_TYPE_FIELD_NUMBER = 18;
    private static volatile com.google.v.fo<bkf> PARSER = null;
    public static final int PORTRAIT_FIELD_NUMBER = 5;
    public static final int SECONDS_TO_AUTO_NAVIGATION_IN_CAR_FIELD_NUMBER = 16;
    public static final int SELECTED_ALT_ID_FIELD_NUMBER = 10;
    public static final int SELECTED_ROUTE_ID_FIELD_NUMBER = 11;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int TIMER_ACTIVE_FIELD_NUMBER = 8;
    public static final int TIMER_BEHAVIOR_FIELD_NUMBER = 4;
    public static final int TIMER_DURATION_SECONDS_FIELD_NUMBER = 12;
    public static final int TIME_FROM_SCREEN_SHOWN_TO_TIMER_ACTIVATED_SECONDS_FIELD_NUMBER = 14;
    public static final int TIME_FROM_TIMER_ACTIVATED_TO_CLICK_SECONDS_FIELD_NUMBER = 13;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 17;
    private int actionSource_;
    private int actionSubSource_;
    private int action_;
    private int bitField0_;
    private long cardIndex_;
    private boolean hov_;
    private boolean isNow_;
    private int originType_;
    private boolean portrait_;
    private long secondsToAutoNavigationInCar_;
    private long selectedAltId_;
    private long selectedRouteId_;
    private int source_;
    private long timeFromScreenShownToTimerActivatedSeconds_;
    private long timeFromTimerActivatedToClickSeconds_;
    private boolean timerActive_;
    private int timerBehavior_;
    private long timerDurationSeconds_;
    private int triggeringPlatform_;

    static {
        bkf bkfVar = new bkf();
        DEFAULT_INSTANCE = bkfVar;
        com.google.v.du.registerDefaultInstance(bkf.class, bkfVar);
    }

    private bkf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionSource() {
        this.actionSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionSubSource() {
        this.actionSubSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardIndex() {
        this.bitField0_ &= -17;
        this.cardIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHov() {
        this.bitField0_ &= -5;
        this.hov_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNow() {
        this.bitField0_ &= -3;
        this.isNow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginType() {
        this.originType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortrait() {
        this.bitField0_ &= -2;
        this.portrait_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsToAutoNavigationInCar() {
        this.bitField0_ &= -1025;
        this.secondsToAutoNavigationInCar_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedAltId() {
        this.bitField0_ &= -33;
        this.selectedAltId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedRouteId() {
        this.bitField0_ &= -65;
        this.selectedRouteId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeFromScreenShownToTimerActivatedSeconds() {
        this.bitField0_ &= -513;
        this.timeFromScreenShownToTimerActivatedSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeFromTimerActivatedToClickSeconds() {
        this.bitField0_ &= -257;
        this.timeFromTimerActivatedToClickSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimerActive() {
        this.bitField0_ &= -9;
        this.timerActive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimerBehavior() {
        this.timerBehavior_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimerDurationSeconds() {
        this.bitField0_ &= -129;
        this.timerDurationSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    public static bkf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bkd newBuilder() {
        return (bkd) DEFAULT_INSTANCE.createBuilder();
    }

    public static bkf parseDelimitedFrom(InputStream inputStream) {
        return (bkf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkf parseFrom(com.google.v.v vVar) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bkf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bka bkaVar) {
        this.action_ = bkaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSource(bkb bkbVar) {
        this.actionSource_ = bkbVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSourceValue(int i2) {
        this.actionSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSubSource(bkc bkcVar) {
        this.actionSubSource_ = bkcVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionSubSourceValue(int i2) {
        this.actionSubSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardIndex(long j2) {
        this.bitField0_ |= 16;
        this.cardIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHov(boolean z) {
        this.bitField0_ |= 4;
        this.hov_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNow(boolean z) {
        this.bitField0_ |= 2;
        this.isNow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginType(aor aorVar) {
        this.originType_ = aorVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginTypeValue(int i2) {
        this.originType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortrait(boolean z) {
        this.bitField0_ |= 1;
        this.portrait_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsToAutoNavigationInCar(long j2) {
        this.bitField0_ |= 1024;
        this.secondsToAutoNavigationInCar_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedAltId(long j2) {
        this.bitField0_ |= 32;
        this.selectedAltId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedRouteId(long j2) {
        this.bitField0_ |= 64;
        this.selectedRouteId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(bfn bfnVar) {
        this.source_ = bfnVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeFromScreenShownToTimerActivatedSeconds(long j2) {
        this.bitField0_ |= 512;
        this.timeFromScreenShownToTimerActivatedSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeFromTimerActivatedToClickSeconds(long j2) {
        this.bitField0_ |= 256;
        this.timeFromTimerActivatedToClickSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerActive(boolean z) {
        this.bitField0_ |= 8;
        this.timerActive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerBehavior(bke bkeVar) {
        this.timerBehavior_ = bkeVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerBehaviorValue(int i2) {
        this.timerBehavior_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerDurationSeconds(long j2) {
        this.bitField0_ |= 128;
        this.timerDurationSeconds_ = j2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005ဇ\u0000\u0006ဇ\u0001\u0007ဇ\u0002\bဇ\u0003\tဂ\u0004\nဂ\u0005\u000bဂ\u0006\fဂ\u0007\rဂ\b\u000eဂ\t\u000f\f\u0010ဂ\n\u0011\f\u0012\f", new Object[]{"bitField0_", "source_", "actionSource_", "actionSubSource_", "timerBehavior_", "portrait_", "isNow_", "hov_", "timerActive_", "cardIndex_", "selectedAltId_", "selectedRouteId_", "timerDurationSeconds_", "timeFromTimerActivatedToClickSeconds_", "timeFromScreenShownToTimerActivatedSeconds_", "action_", "secondsToAutoNavigationInCar_", "triggeringPlatform_", "originType_"});
        }
        if (iOrdinal == 3) {
            return new bkf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bkd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bkf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bkf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bka getAction() {
        bka bkaVar;
        switch (this.action_) {
            case 0:
                bkaVar = bka.ACTION_UNSPECIFIED;
                break;
            case 1:
                bkaVar = bka.BACK;
                break;
            case 2:
                bkaVar = bka.CANCEL_TIMER;
                break;
            case 3:
                bkaVar = bka.TOLL_INFO;
                break;
            case 4:
                bkaVar = bka.DRAWER_SWIPE_DOWN_FULLY;
                break;
            case 5:
                bkaVar = bka.DRAWER_SWIPE_UP_FULLY;
                break;
            case 6:
                bkaVar = bka.GO;
                break;
            case 7:
                bkaVar = bka.GO_TIMEOUT;
                break;
            case 8:
                bkaVar = bka.GO_TIMER;
                break;
            case 9:
                bkaVar = bka.PLAN_DRIVE;
                break;
            case 10:
                bkaVar = bka.ROUTE_SETTINGS;
                break;
            case 11:
                bkaVar = bka.SELECT_ROUTE;
                break;
            case 12:
                bkaVar = bka.SHOW_CURRENT;
                break;
            case 13:
                bkaVar = bka.CLICKED_ON_CLOSURE;
                break;
            case 14:
                bkaVar = bka.TOGGLE_PANE_VIEW;
                break;
            case 15:
                bkaVar = bka.TOGGLE_LIST_VIEW;
                break;
            case 16:
                bkaVar = bka.AUTOMATIC_NAVIGATION_IN_CAR;
                break;
            case 17:
                bkaVar = bka.AVOID;
                break;
            case 18:
                bkaVar = bka.INFO;
                break;
            case 19:
                bkaVar = bka.TOGGLE_VEHICLE_TYPE;
                break;
            case 20:
                bkaVar = bka.CLICK_ORIGIN;
                break;
            case 21:
                bkaVar = bka.CLICK_DESTINATION;
                break;
            case 22:
                bkaVar = bka.SWAP_LOCATIONS;
                break;
            default:
                bkaVar = null;
                break;
        }
        return bkaVar == null ? bka.UNRECOGNIZED : bkaVar;
    }

    public bkb getActionSource() {
        int i2 = this.actionSource_;
        bkb bkbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bkb.CARPLAY_CARD : bkb.CONTEXTUAL_HEADER : bkb.SCREEN_HEADER : bkb.MAP : bkb.CARD : bkb.ACTION_SOURCE_UNSPECIFIED;
        return bkbVar == null ? bkb.UNRECOGNIZED : bkbVar;
    }

    public int getActionSourceValue() {
        return this.actionSource_;
    }

    public bkc getActionSubSource() {
        int i2 = this.actionSubSource_;
        bkc bkcVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bkc.TOGGLE_HOV_ON : bkc.TOGGLE_HOV_OFF : bkc.MAP_ROUTE : bkc.MAP_ETA_LABEL : bkc.ROUTE_CARD : bkc.ACTION_SUB_SOURCE_UNSPECIFIED;
        return bkcVar == null ? bkc.UNRECOGNIZED : bkcVar;
    }

    public int getActionSubSourceValue() {
        return this.actionSubSource_;
    }

    public int getActionValue() {
        return this.action_;
    }

    public long getCardIndex() {
        return this.cardIndex_;
    }

    public boolean getHov() {
        return this.hov_;
    }

    public boolean getIsNow() {
        return this.isNow_;
    }

    public aor getOriginType() {
        aor aorVarA = aor.a(this.originType_);
        return aorVarA == null ? aor.UNRECOGNIZED : aorVarA;
    }

    public int getOriginTypeValue() {
        return this.originType_;
    }

    public boolean getPortrait() {
        return this.portrait_;
    }

    public long getSecondsToAutoNavigationInCar() {
        return this.secondsToAutoNavigationInCar_;
    }

    public long getSelectedAltId() {
        return this.selectedAltId_;
    }

    public long getSelectedRouteId() {
        return this.selectedRouteId_;
    }

    public bfn getSource() {
        bfn bfnVarA = bfn.a(this.source_);
        return bfnVarA == null ? bfn.UNRECOGNIZED : bfnVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public long getTimeFromScreenShownToTimerActivatedSeconds() {
        return this.timeFromScreenShownToTimerActivatedSeconds_;
    }

    public long getTimeFromTimerActivatedToClickSeconds() {
        return this.timeFromTimerActivatedToClickSeconds_;
    }

    public boolean getTimerActive() {
        return this.timerActive_;
    }

    public bke getTimerBehavior() {
        int i2 = this.timerBehavior_;
        bke bkeVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bke.ROAMING : bke.OFF : bke.GPS_WITH_FALLBACK_ROAMING : bke.TIMER_BEHAVIOR_UNSPECIFIED;
        return bkeVar == null ? bke.UNRECOGNIZED : bkeVar;
    }

    public int getTimerBehaviorValue() {
        return this.timerBehavior_;
    }

    public long getTimerDurationSeconds() {
        return this.timerDurationSeconds_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public boolean hasCardIndex() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHov() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsNow() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPortrait() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSecondsToAutoNavigationInCar() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasSelectedAltId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSelectedRouteId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTimeFromScreenShownToTimerActivatedSeconds() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasTimeFromTimerActivatedToClickSeconds() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTimerActive() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimerDurationSeconds() {
        return (this.bitField0_ & 128) != 0;
    }

    public static bkd newBuilder(bkf bkfVar) {
        return (bkd) DEFAULT_INSTANCE.createBuilder(bkfVar);
    }

    public static bkf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bkf parseFrom(com.google.v.z zVar) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bkf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bkf parseFrom(InputStream inputStream) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkf parseFrom(ByteBuffer byteBuffer) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bkf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bkf parseFrom(byte[] bArr) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bkf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bkf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
