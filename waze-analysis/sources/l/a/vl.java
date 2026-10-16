package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vl extends com.google.v.du<vl, vk> implements com.google.v.fj {
    private static final vl DEFAULT_INSTANCE;
    public static final int DISPLAYED_SPECIAL_ROUTES_FIELD_NUMBER = 7;
    public static final int HOV_AVAILABLE_FIELD_NUMBER = 8;
    public static final int HOV_CARD_INFORMATION_FIELD_NUMBER = 3;
    public static final int NAVIGATION_TYPE_FIELD_NUMBER = 1;
    public static final int ND4C_ALGO_TRANSPARENCY_LINK_SHOWN_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<vl> PARSER = null;
    public static final int SHARE_SUGGESTION_ENABLED_FIELD_NUMBER = 6;
    public static final int STOP_ADDED_FIELD_NUMBER = 5;
    public static final int VENUE_ID_FIELD_NUMBER = 2;
    private static final com.google.v.el<bfq> displayedSpecialRoutes_converter_ = new ve(2);
    private int bitField0_;
    private int displayedSpecialRoutesMemoizedSerializedSize;
    private boolean hovAvailable_;
    private abl hovCardInformation_;
    private int navigationType_;
    private boolean nd4CAlgoTransparencyLinkShown_;
    private boolean shareSuggestionEnabled_;
    private boolean stopAdded_;
    private String venueId_ = "";
    private com.google.v.ek displayedSpecialRoutes_ = emptyIntList();

    static {
        vl vlVar = new vl();
        DEFAULT_INSTANCE = vlVar;
        com.google.v.du.registerDefaultInstance(vl.class, vlVar);
    }

    private vl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplayedSpecialRoutes(Iterable<? extends bfq> iterable) {
        ensureDisplayedSpecialRoutesIsMutable();
        Iterator<? extends bfq> it = iterable.iterator();
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
    public void addDisplayedSpecialRoutes(bfq bfqVar) {
        Objects.requireNonNull(bfqVar);
        ensureDisplayedSpecialRoutesIsMutable();
        this.displayedSpecialRoutes_.i(bfqVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayedSpecialRoutesValue(int i2) {
        ensureDisplayedSpecialRoutesIsMutable();
        this.displayedSpecialRoutes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayedSpecialRoutes() {
        this.displayedSpecialRoutes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovAvailable() {
        this.bitField0_ &= -17;
        this.hovAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovCardInformation() {
        this.hovCardInformation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationType() {
        this.navigationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNd4CAlgoTransparencyLinkShown() {
        this.bitField0_ &= -3;
        this.nd4CAlgoTransparencyLinkShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareSuggestionEnabled() {
        this.bitField0_ &= -9;
        this.shareSuggestionEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStopAdded() {
        this.bitField0_ &= -5;
        this.stopAdded_ = false;
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

    public static vl getDefaultInstance() {
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

    public static vk newBuilder() {
        return (vk) DEFAULT_INSTANCE.createBuilder();
    }

    public static vl parseDelimitedFrom(InputStream inputStream) {
        return (vl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vl parseFrom(com.google.v.v vVar) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<vl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedSpecialRoutes(int i2, bfq bfqVar) {
        Objects.requireNonNull(bfqVar);
        ensureDisplayedSpecialRoutesIsMutable();
        this.displayedSpecialRoutes_.e(i2, bfqVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedSpecialRoutesValue(int i2, int i3) {
        ensureDisplayedSpecialRoutesIsMutable();
        this.displayedSpecialRoutes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovAvailable(boolean z) {
        this.bitField0_ |= 16;
        this.hovAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovCardInformation(abl ablVar) {
        Objects.requireNonNull(ablVar);
        this.hovCardInformation_ = ablVar;
        this.bitField0_ |= 1;
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
    public void setNd4CAlgoTransparencyLinkShown(boolean z) {
        this.bitField0_ |= 2;
        this.nd4CAlgoTransparencyLinkShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSuggestionEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.shareSuggestionEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStopAdded(boolean z) {
        this.bitField0_ |= 4;
        this.stopAdded_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003\u0007,\bဇ\u0004", new Object[]{"bitField0_", "navigationType_", "venueId_", "hovCardInformation_", "nd4CAlgoTransparencyLinkShown_", "stopAdded_", "shareSuggestionEnabled_", "displayedSpecialRoutes_", "hovAvailable_"});
        }
        if (iOrdinal == 3) {
            return new vl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new vk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<vl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (vl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bfq getDisplayedSpecialRoutes(int i2) {
        bfq bfqVarA = bfq.a(this.displayedSpecialRoutes_.d(i2));
        return bfqVarA == null ? bfq.UNRECOGNIZED : bfqVarA;
    }

    public int getDisplayedSpecialRoutesCount() {
        return this.displayedSpecialRoutes_.size();
    }

    public List<bfq> getDisplayedSpecialRoutesList() {
        return new com.google.v.em(this.displayedSpecialRoutes_, displayedSpecialRoutes_converter_);
    }

    public int getDisplayedSpecialRoutesValue(int i2) {
        return this.displayedSpecialRoutes_.d(i2);
    }

    public List<Integer> getDisplayedSpecialRoutesValueList() {
        return this.displayedSpecialRoutes_;
    }

    public boolean getHovAvailable() {
        return this.hovAvailable_;
    }

    public abl getHovCardInformation() {
        abl ablVar = this.hovCardInformation_;
        return ablVar == null ? abl.getDefaultInstance() : ablVar;
    }

    public vj getNavigationType() {
        vj vjVarA = vj.a(this.navigationType_);
        return vjVarA == null ? vj.UNRECOGNIZED : vjVarA;
    }

    public int getNavigationTypeValue() {
        return this.navigationType_;
    }

    public boolean getNd4CAlgoTransparencyLinkShown() {
        return this.nd4CAlgoTransparencyLinkShown_;
    }

    public boolean getShareSuggestionEnabled() {
        return this.shareSuggestionEnabled_;
    }

    public boolean getStopAdded() {
        return this.stopAdded_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasHovAvailable() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHovCardInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNd4CAlgoTransparencyLinkShown() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasShareSuggestionEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStopAdded() {
        return (this.bitField0_ & 4) != 0;
    }

    public static vk newBuilder(vl vlVar) {
        return (vk) DEFAULT_INSTANCE.createBuilder(vlVar);
    }

    public static vl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static vl parseFrom(com.google.v.z zVar) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static vl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static vl parseFrom(InputStream inputStream) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static vl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static vl parseFrom(ByteBuffer byteBuffer) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static vl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static vl parseFrom(byte[] bArr) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static vl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (vl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
