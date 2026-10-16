package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class hx extends com.google.v.du<hx, hv> implements hy {
    public static final int ANDROID_PKG_NAME_FIELD_NUMBER = 3;
    public static final int BACK_BUTTON_DISABLED_FIELD_NUMBER = 6;
    private static final hx DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int ENABLED_FEATURES_FIELD_NUMBER = 7;
    public static final int INSTALLATION_URL_FIELD_NUMBER = 9;
    public static final int IOS_PKG_NAME_FIELD_NUMBER = 2;
    public static final int IOS_URL_SCHEME_FIELD_NUMBER = 8;
    public static final int IOS_URL_SCHEME_SUPPORTING_AUDIO_KIT_FIELD_NUMBER = 10;
    public static final int ITUNES_ID_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<hx> PARSER = null;
    public static final int SHARING_MODE_FIELD_NUMBER = 4;
    private boolean backButtonDisabled_;
    private int bitField0_;
    private int enabledFeatures_;
    private int sharingMode_;
    private com.google.v.eo<String> iosPkgName_ = emptyProtobufList();
    private com.google.v.eo<String> androidPkgName_ = emptyProtobufList();
    private String displayName_ = "";
    private String itunesId_ = "";
    private String iosUrlScheme_ = "";
    private String iosUrlSchemeSupportingAudioKit_ = "";
    private String installationUrl_ = "";

    static {
        hx hxVar = new hx();
        DEFAULT_INSTANCE = hxVar;
        com.google.v.du.registerDefaultInstance(hx.class, hxVar);
    }

    private hx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAndroidPkgName(Iterable<String> iterable) {
        ensureAndroidPkgNameIsMutable();
        com.google.v.c.addAll(iterable, this.androidPkgName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIosPkgName(Iterable<String> iterable) {
        ensureIosPkgNameIsMutable();
        com.google.v.c.addAll(iterable, this.iosPkgName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidPkgName(String str) {
        Objects.requireNonNull(str);
        ensureAndroidPkgNameIsMutable();
        this.androidPkgName_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidPkgNameBytes(com.google.v.v vVar) {
        ensureAndroidPkgNameIsMutable();
        this.androidPkgName_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIosPkgName(String str) {
        Objects.requireNonNull(str);
        ensureIosPkgNameIsMutable();
        this.iosPkgName_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIosPkgNameBytes(com.google.v.v vVar) {
        ensureIosPkgNameIsMutable();
        this.iosPkgName_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidPkgName() {
        this.androidPkgName_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackButtonDisabled() {
        this.bitField0_ &= -65;
        this.backButtonDisabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.bitField0_ &= -5;
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabledFeatures() {
        this.bitField0_ &= -3;
        this.enabledFeatures_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstallationUrl() {
        this.bitField0_ &= -129;
        this.installationUrl_ = getDefaultInstance().getInstallationUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosPkgName() {
        this.iosPkgName_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosUrlScheme() {
        this.bitField0_ &= -17;
        this.iosUrlScheme_ = getDefaultInstance().getIosUrlScheme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosUrlSchemeSupportingAudioKit() {
        this.bitField0_ &= -33;
        this.iosUrlSchemeSupportingAudioKit_ = getDefaultInstance().getIosUrlSchemeSupportingAudioKit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItunesId() {
        this.bitField0_ &= -9;
        this.itunesId_ = getDefaultInstance().getItunesId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharingMode() {
        this.bitField0_ &= -2;
        this.sharingMode_ = 0;
    }

    private void ensureAndroidPkgNameIsMutable() {
        com.google.v.eo<String> eoVar = this.androidPkgName_;
        if (eoVar.c()) {
            return;
        }
        this.androidPkgName_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureIosPkgNameIsMutable() {
        com.google.v.eo<String> eoVar = this.iosPkgName_;
        if (eoVar.c()) {
            return;
        }
        this.iosPkgName_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hv newBuilder() {
        return (hv) DEFAULT_INSTANCE.createBuilder();
    }

    public static hx parseDelimitedFrom(InputStream inputStream) {
        return (hx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hx parseFrom(com.google.v.v vVar) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidPkgName(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAndroidPkgNameIsMutable();
        this.androidPkgName_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackButtonDisabled(boolean z) {
        this.bitField0_ |= 64;
        this.backButtonDisabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(com.google.v.v vVar) {
        this.displayName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledFeatures(int i2) {
        this.bitField0_ |= 2;
        this.enabledFeatures_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.installationUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationUrlBytes(com.google.v.v vVar) {
        this.installationUrl_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosPkgName(int i2, String str) {
        Objects.requireNonNull(str);
        ensureIosPkgNameIsMutable();
        this.iosPkgName_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosUrlScheme(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.iosUrlScheme_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosUrlSchemeBytes(com.google.v.v vVar) {
        this.iosUrlScheme_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosUrlSchemeSupportingAudioKit(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.iosUrlSchemeSupportingAudioKit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosUrlSchemeSupportingAudioKitBytes(com.google.v.v vVar) {
        this.iosUrlSchemeSupportingAudioKit_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItunesId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.itunesId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItunesIdBytes(com.google.v.v vVar) {
        this.itunesId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharingMode(hw hwVar) {
        this.sharingMode_ = hwVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဈ\u0002\u0002\u001a\u0003\u001a\u0004᠌\u0000\u0005ဈ\u0003\u0006ဇ\u0006\u0007ဋ\u0001\bဈ\u0004\tဈ\u0007\nဈ\u0005", new Object[]{"bitField0_", "displayName_", "iosPkgName_", "androidPkgName_", "sharingMode_", hf.f48739c, "itunesId_", "backButtonDisabled_", "enabledFeatures_", "iosUrlScheme_", "installationUrl_", "iosUrlSchemeSupportingAudioKit_"});
        }
        if (iOrdinal == 3) {
            return new hx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAndroidPkgName(int i2) {
        return this.androidPkgName_.get(i2);
    }

    public com.google.v.v getAndroidPkgNameBytes(int i2) {
        return com.google.v.v.s(this.androidPkgName_.get(i2));
    }

    public int getAndroidPkgNameCount() {
        return this.androidPkgName_.size();
    }

    public List<String> getAndroidPkgNameList() {
        return this.androidPkgName_;
    }

    public boolean getBackButtonDisabled() {
        return this.backButtonDisabled_;
    }

    public String getDisplayName() {
        return this.displayName_;
    }

    public com.google.v.v getDisplayNameBytes() {
        return com.google.v.v.s(this.displayName_);
    }

    public int getEnabledFeatures() {
        return this.enabledFeatures_;
    }

    public String getInstallationUrl() {
        return this.installationUrl_;
    }

    public com.google.v.v getInstallationUrlBytes() {
        return com.google.v.v.s(this.installationUrl_);
    }

    public String getIosPkgName(int i2) {
        return this.iosPkgName_.get(i2);
    }

    public com.google.v.v getIosPkgNameBytes(int i2) {
        return com.google.v.v.s(this.iosPkgName_.get(i2));
    }

    public int getIosPkgNameCount() {
        return this.iosPkgName_.size();
    }

    public List<String> getIosPkgNameList() {
        return this.iosPkgName_;
    }

    public String getIosUrlScheme() {
        return this.iosUrlScheme_;
    }

    public com.google.v.v getIosUrlSchemeBytes() {
        return com.google.v.v.s(this.iosUrlScheme_);
    }

    public String getIosUrlSchemeSupportingAudioKit() {
        return this.iosUrlSchemeSupportingAudioKit_;
    }

    public com.google.v.v getIosUrlSchemeSupportingAudioKitBytes() {
        return com.google.v.v.s(this.iosUrlSchemeSupportingAudioKit_);
    }

    public String getItunesId() {
        return this.itunesId_;
    }

    public com.google.v.v getItunesIdBytes() {
        return com.google.v.v.s(this.itunesId_);
    }

    @Deprecated
    public hw getSharingMode() {
        hw hwVarA = hw.a(this.sharingMode_);
        return hwVarA == null ? hw.UNKNOWN : hwVarA;
    }

    public boolean hasBackButtonDisabled() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDisplayName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEnabledFeatures() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInstallationUrl() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIosUrlScheme() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIosUrlSchemeSupportingAudioKit() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasItunesId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasSharingMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hv newBuilder(hx hxVar) {
        return (hv) DEFAULT_INSTANCE.createBuilder(hxVar);
    }

    public static hx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hx parseFrom(com.google.v.z zVar) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hx parseFrom(InputStream inputStream) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hx parseFrom(ByteBuffer byteBuffer) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hx parseFrom(byte[] bArr) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
