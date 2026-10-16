package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vi extends com.google.v.du<vi, vg> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final vi DEFAULT_INSTANCE;
    public static final int DISPLAYED_SPECIAL_ROUTES_FIELD_NUMBER = 7;
    public static final int DRAWER_OPEN_FIELD_NUMBER = 8;
    public static final int HOV_CARD_INFORMATION_FIELD_NUMBER = 5;
    public static final int LOCK_SCREEN_MODE_FIELD_NUMBER = 9;
    public static final int NAVIGATION_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<vi> PARSER = null;
    public static final int SHARE_SUGGESTION_DISPLAYED_FIELD_NUMBER = 6;
    public static final int SPECIAL_ROUTE_TYPE_FIELD_NUMBER = 2;
    public static final int VENUE_ID_FIELD_NUMBER = 4;
    private static final com.google.v.el<vh> displayedSpecialRoutes_converter_ = new ve(0);
    private int action_;
    private int bitField0_;
    private int displayedSpecialRoutesMemoizedSerializedSize;
    private boolean drawerOpen_;
    private abl hovCardInformation_;
    private boolean lockScreenMode_;
    private int navigationType_;
    private boolean shareSuggestionDisplayed_;
    private int specialRouteType_;
    private String venueId_ = "";
    private com.google.v.ek displayedSpecialRoutes_ = emptyIntList();

    static {
        vi viVar = new vi();
        DEFAULT_INSTANCE = viVar;
        com.google.v.du.registerDefaultInstance(vi.class, viVar);
    }

    private vi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplayedSpecialRoutes(Iterable<? extends vh> iterable) {
        ensureDisplayedSpecialRoutesIsMutable();
        Iterator<? extends vh> it = iterable.iterator();
        while (it.hasNext()) {
            this.displayedSpecialRoutes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplayedSpecialRoutesValue(Iterable<Integer> iterable) {
        ensureDisplayedSpecialRoutesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.displayedSpecialRoutes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayedSpecialRoutes(vh vhVar) {
        Objects.requireNonNull(vhVar);
        ensureDisplayedSpecialRoutesIsMutable();
        this.displayedSpecialRoutes_.i(vhVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayedSpecialRoutesValue(int i2) {
        ensureDisplayedSpecialRoutesIsMutable();
        this.displayedSpecialRoutes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayedSpecialRoutes() {
        this.displayedSpecialRoutes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrawerOpen() {
        this.bitField0_ &= -5;
        this.drawerOpen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovCardInformation() {
        this.hovCardInformation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLockScreenMode() {
        this.bitField0_ &= -9;
        this.lockScreenMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationType() {
        this.navigationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareSuggestionDisplayed() {
        this.bitField0_ &= -3;
        this.shareSuggestionDisplayed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpecialRouteType() {
        this.specialRouteType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    private void ensureDisplayedSpecialRoutesIsMutable() {
        com.google.v.ek ekVar = this.displayedSpecialRoutes_;
        if (ekVar.c()) {
            return;
        }
        this.displayedSpecialRoutes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static vi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHovCardInformation(abl ablVar) {
        Objects.requireNonNull(ablVar);
        abl ablVar2 = this.hovCardInformation_;
        if (ablVar2 != null && ablVar2 != abl.getDefaultInstance()) {
            abk abkVarNewBuilder = abl.newBuilder(ablVar2);
            abkVarNewBuilder.mergeFrom((abk) ablVar);
            ablVar = abkVarNewBuilder.buildPartial();
        }
        this.hovCardInformation_ = ablVar;
        this.bitField0_ |= 1;
    }

    public static vg newBuilder() {
        return (vg) DEFAULT_INSTANCE.createBuilder();
    }

    public static vi parseDelimitedFrom(InputStream inputStream) {
        return (vi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vi parseFrom(com.google.v.v vVar) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<vi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(vf vfVar) {
        this.action_ = vfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedSpecialRoutes(int i2, vh vhVar) {
        Objects.requireNonNull(vhVar);
        ensureDisplayedSpecialRoutesIsMutable();
        this.displayedSpecialRoutes_.e(i2, vhVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedSpecialRoutesValue(int i2, int i3) {
        ensureDisplayedSpecialRoutesIsMutable();
        this.displayedSpecialRoutes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawerOpen(boolean z) {
        this.bitField0_ |= 4;
        this.drawerOpen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovCardInformation(abl ablVar) {
        Objects.requireNonNull(ablVar);
        this.hovCardInformation_ = ablVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockScreenMode(boolean z) {
        this.bitField0_ |= 8;
        this.lockScreenMode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationType(vj vjVar) {
        this.navigationType_ = vjVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationTypeValue(int i2) {
        this.navigationType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSuggestionDisplayed(boolean z) {
        this.bitField0_ |= 2;
        this.shareSuggestionDisplayed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpecialRouteType(vh vhVar) {
        this.specialRouteType_ = vhVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpecialRouteTypeValue(int i2) {
        this.specialRouteType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004Ȉ\u0005ဉ\u0000\u0006ဇ\u0001\u0007,\bဇ\u0002\tဇ\u0003", new Object[]{"bitField0_", "action_", "specialRouteType_", "navigationType_", "venueId_", "hovCardInformation_", "shareSuggestionDisplayed_", "displayedSpecialRoutes_", "drawerOpen_", "lockScreenMode_"});
        }
        if (iOrdinal == 3) {
            return new vi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new vg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<vi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (vi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public vf getAction() {
        vf vfVar;
        switch (this.action_) {
            case 0:
                vfVar = vf.ACTION_UNSPECIFIED;
                break;
            case 1:
                vfVar = vf.GO;
                break;
            case 2:
                vfVar = vf.GO_LATER;
                break;
            case 3:
                vfVar = vf.GO_TIMEOUT;
                break;
            case 4:
                vfVar = vf.OVERVIEW;
                break;
            case 5:
                vfVar = vf.SHARE;
                break;
            case 6:
                vfVar = vf.UNSHARE;
                break;
            case 7:
                vfVar = vf.STOP;
                break;
            case 8:
                vfVar = vf.GAS_WAYPOINT;
                break;
            case 9:
                vfVar = vf.FOOD_WAYPOINT;
                break;
            case 10:
                vfVar = vf.COFFEE_WAYPOINT;
                break;
            case 11:
                vfVar = vf.PARKING_WAYPOINT;
                break;
            case 12:
                vfVar = vf.SEARCH_WAYPOINT;
                break;
            case 13:
                vfVar = vf.EV_CHARGING_STATION_WAYPOINT;
                break;
            case 14:
                vfVar = vf.CLOSE;
                break;
            case 15:
                vfVar = vf.RESUME;
                break;
            case 16:
                vfVar = vf.SPECIAL_ROUTE_CARD;
                break;
            case 17:
                vfVar = vf.MANAGE_SOUNDS;
                break;
            case 18:
                vfVar = vf.SETTINGS;
                break;
            case 19:
                vfVar = vf.ALGO_TRANSPARENCY_LINK;
                break;
            case 20:
                vfVar = vf.ALTERNATIVE_ROUTES;
                break;
            case 21:
                vfVar = vf.SEARCH;
                break;
            case 22:
                vfVar = vf.EXIT_LOCK_SCREEN_NAVIGATION;
                break;
            default:
                vfVar = null;
                break;
        }
        return vfVar == null ? vf.UNRECOGNIZED : vfVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public vh getDisplayedSpecialRoutes(int i2) {
        vh vhVarA = vh.a(this.displayedSpecialRoutes_.d(i2));
        return vhVarA == null ? vh.UNRECOGNIZED : vhVarA;
    }

    public int getDisplayedSpecialRoutesCount() {
        return this.displayedSpecialRoutes_.size();
    }

    public List<vh> getDisplayedSpecialRoutesList() {
        return new com.google.v.em(this.displayedSpecialRoutes_, displayedSpecialRoutes_converter_);
    }

    public int getDisplayedSpecialRoutesValue(int i2) {
        return this.displayedSpecialRoutes_.d(i2);
    }

    public List<Integer> getDisplayedSpecialRoutesValueList() {
        return this.displayedSpecialRoutes_;
    }

    public boolean getDrawerOpen() {
        return this.drawerOpen_;
    }

    public abl getHovCardInformation() {
        abl ablVar = this.hovCardInformation_;
        return ablVar == null ? abl.getDefaultInstance() : ablVar;
    }

    public boolean getLockScreenMode() {
        return this.lockScreenMode_;
    }

    public vj getNavigationType() {
        vj vjVarA = vj.a(this.navigationType_);
        return vjVarA == null ? vj.UNRECOGNIZED : vjVarA;
    }

    public int getNavigationTypeValue() {
        return this.navigationType_;
    }

    public boolean getShareSuggestionDisplayed() {
        return this.shareSuggestionDisplayed_;
    }

    public vh getSpecialRouteType() {
        vh vhVarA = vh.a(this.specialRouteType_);
        return vhVarA == null ? vh.UNRECOGNIZED : vhVarA;
    }

    public int getSpecialRouteTypeValue() {
        return this.specialRouteType_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasDrawerOpen() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasHovCardInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLockScreenMode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasShareSuggestionDisplayed() {
        return (this.bitField0_ & 2) != 0;
    }

    public static vg newBuilder(vi viVar) {
        return (vg) DEFAULT_INSTANCE.createBuilder(viVar);
    }

    public static vi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static vi parseFrom(com.google.v.z zVar) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static vi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static vi parseFrom(InputStream inputStream) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vi parseFrom(ByteBuffer byteBuffer) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static vi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static vi parseFrom(byte[] bArr) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static vi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (vi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
