package i.b.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends du<b, a> implements fj {
    public static final int BIG_ICON_FIELD_NUMBER = 6;
    public static final int BIG_PROMOTION_ICON_FIELD_NUMBER = 13;
    private static final b DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LOGO_FIELD_NUMBER = 15;
    public static final int MAX_ZOOM_LEVEL_BIG_FIELD_NUMBER = 10;
    public static final int MAX_ZOOM_LEVEL_SMALL_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NAVIGABLE_FIELD_NUMBER = 14;
    public static final int ON_CLICK_DIALOG_FIELD_NUMBER = 7;
    public static final int ON_CLICK_DIALOG_SIZE_FIELD_NUMBER = 8;
    public static final int ON_CLICK_URLS_FIELD_NUMBER = 18;
    public static final int ON_DISPLAY_URLS_FIELD_NUMBER = 16;
    public static final int ON_VIEW_URLS_FIELD_NUMBER = 17;
    private static volatile fo<b> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 11;
    public static final int PROVIDER_ID_FIELD_NUMBER = 4;
    public static final int SERVICE_ID_FIELD_NUMBER = 3;
    public static final int SMALL_ICON_FIELD_NUMBER = 5;
    public static final int SMALL_PROMOTION_ICON_FIELD_NUMBER = 12;
    private int bitField0_;
    private long id_;
    private int maxZoomLevelBig_;
    private int maxZoomLevelSmall_;
    private int onClickDialogSize_;
    private int priority_;
    private long providerId_;
    private long serviceId_;
    private String name_ = "";
    private String smallIcon_ = "";
    private String bigIcon_ = "";
    private String onClickDialog_ = "";
    private String smallPromotionIcon_ = "";
    private String bigPromotionIcon_ = "";
    private boolean navigable_ = true;
    private String logo_ = "";
    private String onDisplayUrls_ = "";
    private String onViewUrls_ = "";
    private String onClickUrls_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBigIcon() {
        this.bitField0_ &= -33;
        this.bigIcon_ = getDefaultInstance().getBigIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBigPromotionIcon() {
        this.bitField0_ &= -4097;
        this.bigPromotionIcon_ = getDefaultInstance().getBigPromotionIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogo() {
        this.bitField0_ &= -16385;
        this.logo_ = getDefaultInstance().getLogo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxZoomLevelBig() {
        this.bitField0_ &= -513;
        this.maxZoomLevelBig_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxZoomLevelSmall() {
        this.bitField0_ &= -257;
        this.maxZoomLevelSmall_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigable() {
        this.bitField0_ &= -8193;
        this.navigable_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnClickDialog() {
        this.bitField0_ &= -65;
        this.onClickDialog_ = getDefaultInstance().getOnClickDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnClickDialogSize() {
        this.bitField0_ &= -129;
        this.onClickDialogSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnClickUrls() {
        this.bitField0_ &= -131073;
        this.onClickUrls_ = getDefaultInstance().getOnClickUrls();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnDisplayUrls() {
        this.bitField0_ &= -32769;
        this.onDisplayUrls_ = getDefaultInstance().getOnDisplayUrls();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnViewUrls() {
        this.bitField0_ &= -65537;
        this.onViewUrls_ = getDefaultInstance().getOnViewUrls();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.bitField0_ &= -1025;
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.bitField0_ &= -9;
        this.providerId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceId() {
        this.bitField0_ &= -5;
        this.serviceId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallIcon() {
        this.bitField0_ &= -17;
        this.smallIcon_ = getDefaultInstance().getSmallIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallPromotionIcon() {
        this.bitField0_ &= -2049;
        this.smallPromotionIcon_ = getDefaultInstance().getSmallPromotionIcon();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.bigIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigIconBytes(v vVar) {
        this.bigIcon_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigPromotionIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.bigPromotionIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigPromotionIconBytes(v vVar) {
        this.bigPromotionIcon_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.logo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoBytes(v vVar) {
        this.logo_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxZoomLevelBig(int i2) {
        this.bitField0_ |= 512;
        this.maxZoomLevelBig_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxZoomLevelSmall(int i2) {
        this.bitField0_ |= 256;
        this.maxZoomLevelSmall_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigable(boolean z) {
        this.bitField0_ |= 8192;
        this.navigable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnClickDialog(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.onClickDialog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnClickDialogBytes(v vVar) {
        this.onClickDialog_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnClickDialogSize(int i2) {
        this.bitField0_ |= 128;
        this.onClickDialogSize_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnClickUrls(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 131072;
        this.onClickUrls_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnClickUrlsBytes(v vVar) {
        this.onClickUrls_ = vVar.u();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDisplayUrls(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.onDisplayUrls_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDisplayUrlsBytes(v vVar) {
        this.onDisplayUrls_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnViewUrls(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.onViewUrls_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnViewUrlsBytes(v vVar) {
        this.onViewUrls_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i2) {
        this.bitField0_ |= 1024;
        this.priority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(long j2) {
        this.bitField0_ |= 8;
        this.providerId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceId(long j2) {
        this.bitField0_ |= 4;
        this.serviceId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.smallIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallIconBytes(v vVar) {
        this.smallIcon_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallPromotionIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.smallPromotionIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallPromotionIconBytes(v vVar) {
        this.smallPromotionIcon_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fဈ\u000b\rဈ\f\u000eဇ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဈ\u0011", new Object[]{"bitField0_", "id_", "name_", "serviceId_", "providerId_", "smallIcon_", "bigIcon_", "onClickDialog_", "onClickDialogSize_", "maxZoomLevelSmall_", "maxZoomLevelBig_", "priority_", "smallPromotionIcon_", "bigPromotionIcon_", "navigable_", "logo_", "onDisplayUrls_", "onViewUrls_", "onClickUrls_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBigIcon() {
        return this.bigIcon_;
    }

    public v getBigIconBytes() {
        return v.s(this.bigIcon_);
    }

    public String getBigPromotionIcon() {
        return this.bigPromotionIcon_;
    }

    public v getBigPromotionIconBytes() {
        return v.s(this.bigPromotionIcon_);
    }

    public long getId() {
        return this.id_;
    }

    public String getLogo() {
        return this.logo_;
    }

    public v getLogoBytes() {
        return v.s(this.logo_);
    }

    public int getMaxZoomLevelBig() {
        return this.maxZoomLevelBig_;
    }

    public int getMaxZoomLevelSmall() {
        return this.maxZoomLevelSmall_;
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public boolean getNavigable() {
        return this.navigable_;
    }

    public String getOnClickDialog() {
        return this.onClickDialog_;
    }

    public v getOnClickDialogBytes() {
        return v.s(this.onClickDialog_);
    }

    public int getOnClickDialogSize() {
        return this.onClickDialogSize_;
    }

    public String getOnClickUrls() {
        return this.onClickUrls_;
    }

    public v getOnClickUrlsBytes() {
        return v.s(this.onClickUrls_);
    }

    public String getOnDisplayUrls() {
        return this.onDisplayUrls_;
    }

    public v getOnDisplayUrlsBytes() {
        return v.s(this.onDisplayUrls_);
    }

    public String getOnViewUrls() {
        return this.onViewUrls_;
    }

    public v getOnViewUrlsBytes() {
        return v.s(this.onViewUrls_);
    }

    public int getPriority() {
        return this.priority_;
    }

    public long getProviderId() {
        return this.providerId_;
    }

    public long getServiceId() {
        return this.serviceId_;
    }

    public String getSmallIcon() {
        return this.smallIcon_;
    }

    public v getSmallIconBytes() {
        return v.s(this.smallIcon_);
    }

    public String getSmallPromotionIcon() {
        return this.smallPromotionIcon_;
    }

    public v getSmallPromotionIconBytes() {
        return v.s(this.smallPromotionIcon_);
    }

    public boolean hasBigIcon() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBigPromotionIcon() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLogo() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasMaxZoomLevelBig() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasMaxZoomLevelSmall() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNavigable() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasOnClickDialog() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasOnClickDialogSize() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasOnClickUrls() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasOnDisplayUrls() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasOnViewUrls() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasPriority() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasProviderId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasServiceId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSmallIcon() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSmallPromotionIcon() {
        return (this.bitField0_ & 2048) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
