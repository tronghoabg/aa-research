package i.b.h;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends du<d, c> implements fj {
    public static final int BADGE_FIELD_NUMBER = 21;
    public static final int BRAND_ID_FIELD_NUMBER = 24;
    public static final int CLICK_POP_HEIGHT_FIELD_NUMBER = 15;
    public static final int CLICK_URLS_FIELD_NUMBER = 30;
    public static final int CONTEXT_FIELD_NUMBER = 18;
    public static final int CREATION_TIME_FIELD_NUMBER = 7;
    private static final d DEFAULT_INSTANCE;
    public static final int EXTENDED_PRICE_FIELD_NUMBER = 16;
    public static final int FAKE_FIELD_NUMBER = 19;
    public static final int FRAME_FIELD_NUMBER = 20;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INVENTORY_TYPE_FIELD_NUMBER = 31;
    public static final int LOGO_TYPE_FIELD_NUMBER = 22;
    public static final int ON_CLICK_URLS_FIELD_NUMBER = 27;
    public static final int ON_DISPLAY_URLS_FIELD_NUMBER = 25;
    public static final int ON_VIEW_URLS_FIELD_NUMBER = 26;
    private static volatile fo<d> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 23;
    public static final int PROMOTION_ID_FIELD_NUMBER = 5;
    public static final int PROMOTION_RADIUS_FIELD_NUMBER = 6;
    public static final int PROVIDER_ID_FIELD_NUMBER = 4;
    public static final int RESOURCES_FIELD_NUMBER = 9;
    public static final int SERVICE_ID_FIELD_NUMBER = 3;
    public static final int SHOW_NEAR_BY_FIELD_NUMBER = 12;
    public static final int SHOW_ON_MAP_FIELD_NUMBER = 13;
    public static final int TAKE_OVER_HEIGHT_FIELD_NUMBER = 14;
    public static final int TRACK_STORE_VISITS_FIELD_NUMBER = 28;
    public static final int TYPE_ID_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 8;
    public static final int VENUE_ID_FIELD_NUMBER = 17;
    public static final int VIEW_URLS_FIELD_NUMBER = 29;
    public static final int X_FIELD_NUMBER = 10;
    public static final int Y_FIELD_NUMBER = 11;
    private int bitField0_;
    private int clickPopHeight_;
    private long creationTime_;
    private boolean fake_;
    private long id_;
    private int inventoryType_;
    private int priority_;
    private long promotionId_;
    private long promotionRadius_;
    private long providerId_;
    private long serviceId_;
    private int showNearBy_;
    private int takeOverHeight_;
    private boolean trackStoreVisits_;
    private long typeId_;
    private long updateTime_;
    private double x_;
    private double y_;
    private String resources_ = "";
    private boolean showOnMap_ = true;
    private String extendedPrice_ = "";
    private String venueId_ = "";
    private String context_ = "";
    private String frame_ = "";
    private String badge_ = "";
    private String logoType_ = "";
    private String brandId_ = "";
    private String onDisplayUrls_ = "";
    private String onViewUrls_ = "";
    private String onClickUrls_ = "";
    private eo<String> viewUrls_ = emptyProtobufList();
    private eo<String> clickUrls_ = emptyProtobufList();

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClickUrls(Iterable<String> iterable) {
        ensureClickUrlsIsMutable();
        com.google.v.c.addAll(iterable, this.clickUrls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllViewUrls(Iterable<String> iterable) {
        ensureViewUrlsIsMutable();
        com.google.v.c.addAll(iterable, this.viewUrls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClickUrls(String str) {
        Objects.requireNonNull(str);
        ensureClickUrlsIsMutable();
        this.clickUrls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClickUrlsBytes(v vVar) {
        ensureClickUrlsIsMutable();
        this.clickUrls_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViewUrls(String str) {
        Objects.requireNonNull(str);
        ensureViewUrlsIsMutable();
        this.viewUrls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViewUrlsBytes(v vVar) {
        ensureViewUrlsIsMutable();
        this.viewUrls_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.bitField0_ &= -1048577;
        this.badge_ = getDefaultInstance().getBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandId() {
        this.bitField0_ &= -8388609;
        this.brandId_ = getDefaultInstance().getBrandId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickPopHeight() {
        this.bitField0_ &= -16385;
        this.clickPopHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickUrls() {
        this.clickUrls_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.bitField0_ &= -131073;
        this.context_ = getDefaultInstance().getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationTime() {
        this.bitField0_ &= -65;
        this.creationTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendedPrice() {
        this.bitField0_ &= -32769;
        this.extendedPrice_ = getDefaultInstance().getExtendedPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFake() {
        this.bitField0_ &= -262145;
        this.fake_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrame() {
        this.bitField0_ &= -524289;
        this.frame_ = getDefaultInstance().getFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInventoryType() {
        this.bitField0_ &= -268435457;
        this.inventoryType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogoType() {
        this.bitField0_ &= -2097153;
        this.logoType_ = getDefaultInstance().getLogoType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnClickUrls() {
        this.bitField0_ &= -67108865;
        this.onClickUrls_ = getDefaultInstance().getOnClickUrls();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnDisplayUrls() {
        this.bitField0_ &= -16777217;
        this.onDisplayUrls_ = getDefaultInstance().getOnDisplayUrls();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnViewUrls() {
        this.bitField0_ &= -33554433;
        this.onViewUrls_ = getDefaultInstance().getOnViewUrls();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.bitField0_ &= -4194305;
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionId() {
        this.bitField0_ &= -17;
        this.promotionId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionRadius() {
        this.bitField0_ &= -33;
        this.promotionRadius_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.bitField0_ &= -9;
        this.providerId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResources() {
        this.bitField0_ &= -257;
        this.resources_ = getDefaultInstance().getResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceId() {
        this.bitField0_ &= -5;
        this.serviceId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowNearBy() {
        this.bitField0_ &= -2049;
        this.showNearBy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowOnMap() {
        this.bitField0_ &= -4097;
        this.showOnMap_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeOverHeight() {
        this.bitField0_ &= -8193;
        this.takeOverHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackStoreVisits() {
        this.bitField0_ &= -134217729;
        this.trackStoreVisits_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeId() {
        this.bitField0_ &= -3;
        this.typeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        this.bitField0_ &= -129;
        this.updateTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -65537;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewUrls() {
        this.viewUrls_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.bitField0_ &= -513;
        this.x_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.bitField0_ &= -1025;
        this.y_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    private void ensureClickUrlsIsMutable() {
        eo<String> eoVar = this.clickUrls_;
        if (eoVar.c()) {
            return;
        }
        this.clickUrls_ = du.mutableCopy(eoVar);
    }

    private void ensureViewUrlsIsMutable() {
        eo<String> eoVar = this.viewUrls_;
        if (eoVar.c()) {
            return;
        }
        this.viewUrls_ = du.mutableCopy(eoVar);
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1048576;
        this.badge_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeBytes(v vVar) {
        this.badge_ = vVar.u();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8388608;
        this.brandId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandIdBytes(v vVar) {
        this.brandId_ = vVar.u();
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickPopHeight(int i2) {
        this.bitField0_ |= 16384;
        this.clickPopHeight_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrls(int i2, String str) {
        Objects.requireNonNull(str);
        ensureClickUrlsIsMutable();
        this.clickUrls_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 131072;
        this.context_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextBytes(v vVar) {
        this.context_ = vVar.u();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationTime(long j2) {
        this.bitField0_ |= 64;
        this.creationTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendedPrice(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.extendedPrice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendedPriceBytes(v vVar) {
        this.extendedPrice_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFake(boolean z) {
        this.bitField0_ |= 262144;
        this.fake_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrame(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 524288;
        this.frame_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameBytes(v vVar) {
        this.frame_ = vVar.u();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInventoryType(f fVar) {
        this.inventoryType_ = fVar.getNumber();
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2097152;
        this.logoType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoTypeBytes(v vVar) {
        this.logoType_ = vVar.u();
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnClickUrls(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 67108864;
        this.onClickUrls_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnClickUrlsBytes(v vVar) {
        this.onClickUrls_ = vVar.u();
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDisplayUrls(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16777216;
        this.onDisplayUrls_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDisplayUrlsBytes(v vVar) {
        this.onDisplayUrls_ = vVar.u();
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnViewUrls(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.onViewUrls_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnViewUrlsBytes(v vVar) {
        this.onViewUrls_ = vVar.u();
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i2) {
        this.bitField0_ |= 4194304;
        this.priority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionId(long j2) {
        this.bitField0_ |= 16;
        this.promotionId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionRadius(long j2) {
        this.bitField0_ |= 32;
        this.promotionRadius_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(long j2) {
        this.bitField0_ |= 8;
        this.providerId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResources(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.resources_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourcesBytes(v vVar) {
        this.resources_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceId(long j2) {
        this.bitField0_ |= 4;
        this.serviceId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowNearBy(int i2) {
        this.bitField0_ |= 2048;
        this.showNearBy_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowOnMap(boolean z) {
        this.bitField0_ |= 4096;
        this.showOnMap_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeOverHeight(int i2) {
        this.bitField0_ |= 8192;
        this.takeOverHeight_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackStoreVisits(boolean z) {
        this.bitField0_ |= 134217728;
        this.trackStoreVisits_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeId(long j2) {
        this.bitField0_ |= 2;
        this.typeId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(long j2) {
        this.bitField0_ |= 128;
        this.updateTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewUrls(int i2, String str) {
        Objects.requireNonNull(str);
        ensureViewUrlsIsMutable();
        this.viewUrls_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(double d2) {
        this.bitField0_ |= 512;
        this.x_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(double d2) {
        this.bitField0_ |= 1024;
        this.y_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဈ\b\nက\t\u000bက\n\fင\u000b\rဇ\f\u000eင\r\u000fင\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0013ဇ\u0012\u0014ဈ\u0013\u0015ဈ\u0014\u0016ဈ\u0015\u0017င\u0016\u0018ဈ\u0017\u0019ဈ\u0018\u001aဈ\u0019\u001bဈ\u001a\u001cဇ\u001b\u001d\u001a\u001e\u001a\u001f᠌\u001c", new Object[]{"bitField0_", "id_", "typeId_", "serviceId_", "providerId_", "promotionId_", "promotionRadius_", "creationTime_", "updateTime_", "resources_", "x_", "y_", "showNearBy_", "showOnMap_", "takeOverHeight_", "clickPopHeight_", "extendedPrice_", "venueId_", "context_", "fake_", "frame_", "badge_", "logoType_", "priority_", "brandId_", "onDisplayUrls_", "onViewUrls_", "onClickUrls_", "trackStoreVisits_", "viewUrls_", "clickUrls_", "inventoryType_", e.f48476a});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBadge() {
        return this.badge_;
    }

    public v getBadgeBytes() {
        return v.s(this.badge_);
    }

    public String getBrandId() {
        return this.brandId_;
    }

    public v getBrandIdBytes() {
        return v.s(this.brandId_);
    }

    public int getClickPopHeight() {
        return this.clickPopHeight_;
    }

    public String getClickUrls(int i2) {
        return this.clickUrls_.get(i2);
    }

    public v getClickUrlsBytes(int i2) {
        return v.s(this.clickUrls_.get(i2));
    }

    public int getClickUrlsCount() {
        return this.clickUrls_.size();
    }

    public List<String> getClickUrlsList() {
        return this.clickUrls_;
    }

    public String getContext() {
        return this.context_;
    }

    public v getContextBytes() {
        return v.s(this.context_);
    }

    public long getCreationTime() {
        return this.creationTime_;
    }

    public String getExtendedPrice() {
        return this.extendedPrice_;
    }

    public v getExtendedPriceBytes() {
        return v.s(this.extendedPrice_);
    }

    @Deprecated
    public boolean getFake() {
        return this.fake_;
    }

    public String getFrame() {
        return this.frame_;
    }

    public v getFrameBytes() {
        return v.s(this.frame_);
    }

    public long getId() {
        return this.id_;
    }

    public f getInventoryType() {
        f fVarA = f.a(this.inventoryType_);
        return fVarA == null ? f.UNKNOWN : fVarA;
    }

    public String getLogoType() {
        return this.logoType_;
    }

    public v getLogoTypeBytes() {
        return v.s(this.logoType_);
    }

    @Deprecated
    public String getOnClickUrls() {
        return this.onClickUrls_;
    }

    @Deprecated
    public v getOnClickUrlsBytes() {
        return v.s(this.onClickUrls_);
    }

    @Deprecated
    public String getOnDisplayUrls() {
        return this.onDisplayUrls_;
    }

    @Deprecated
    public v getOnDisplayUrlsBytes() {
        return v.s(this.onDisplayUrls_);
    }

    @Deprecated
    public String getOnViewUrls() {
        return this.onViewUrls_;
    }

    @Deprecated
    public v getOnViewUrlsBytes() {
        return v.s(this.onViewUrls_);
    }

    public int getPriority() {
        return this.priority_;
    }

    public long getPromotionId() {
        return this.promotionId_;
    }

    public long getPromotionRadius() {
        return this.promotionRadius_;
    }

    public long getProviderId() {
        return this.providerId_;
    }

    public String getResources() {
        return this.resources_;
    }

    public v getResourcesBytes() {
        return v.s(this.resources_);
    }

    public long getServiceId() {
        return this.serviceId_;
    }

    public int getShowNearBy() {
        return this.showNearBy_;
    }

    public boolean getShowOnMap() {
        return this.showOnMap_;
    }

    public int getTakeOverHeight() {
        return this.takeOverHeight_;
    }

    public boolean getTrackStoreVisits() {
        return this.trackStoreVisits_;
    }

    public long getTypeId() {
        return this.typeId_;
    }

    public long getUpdateTime() {
        return this.updateTime_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public v getVenueIdBytes() {
        return v.s(this.venueId_);
    }

    public String getViewUrls(int i2) {
        return this.viewUrls_.get(i2);
    }

    public v getViewUrlsBytes(int i2) {
        return v.s(this.viewUrls_.get(i2));
    }

    public int getViewUrlsCount() {
        return this.viewUrls_.size();
    }

    public List<String> getViewUrlsList() {
        return this.viewUrls_;
    }

    public double getX() {
        return this.x_;
    }

    public double getY() {
        return this.y_;
    }

    public boolean hasBadge() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasBrandId() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasClickPopHeight() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasContext() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasCreationTime() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasExtendedPrice() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Deprecated
    public boolean hasFake() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasFrame() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInventoryType() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasLogoType() {
        return (this.bitField0_ & 2097152) != 0;
    }

    @Deprecated
    public boolean hasOnClickUrls() {
        return (this.bitField0_ & 67108864) != 0;
    }

    @Deprecated
    public boolean hasOnDisplayUrls() {
        return (this.bitField0_ & 16777216) != 0;
    }

    @Deprecated
    public boolean hasOnViewUrls() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasPriority() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasPromotionId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPromotionRadius() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasProviderId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasResources() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasServiceId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasShowNearBy() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasShowOnMap() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasTakeOverHeight() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasTrackStoreVisits() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasTypeId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUpdateTime() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasX() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasY() {
        return (this.bitField0_ & 1024) != 0;
    }

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
