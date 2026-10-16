package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bs extends du<bs, br> implements fj {
    public static final int CATEGORY_ID_FIELD_NUMBER = 7;
    public static final int CTA_DEEP_LINK_FIELD_NUMBER = 6;
    public static final int CTA_KEY_FIELD_NUMBER = 5;
    private static final bs DEFAULT_INSTANCE;
    public static final int DESCRIPTION_KEY_FIELD_NUMBER = 3;
    public static final int DISABLED_FIELD_NUMBER = 9;
    public static final int ICON_URL_FIELD_NUMBER = 16;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int IS_PUBLIC_FIELD_NUMBER = 10;
    public static final int LABEL_KEY_FIELD_NUMBER = 14;
    public static final int NAME_KEY_FIELD_NUMBER = 2;
    private static volatile fo<bs> PARSER = null;
    public static final int POST_CTA_DEEP_LINK_FIELD_NUMBER = 13;
    public static final int POST_CTA_KEY_FIELD_NUMBER = 12;
    public static final int POST_DESCRIPTION_KEY_FIELD_NUMBER = 11;
    public static final int PRIORITY_FIELD_NUMBER = 15;
    public static final int PRIORITY_IN_CATEGORY_FIELD_NUMBER = 8;
    private int bitField0_;
    private boolean disabled_;
    private boolean isPublic_;
    private int priorityInCategory_;
    private int priority_;
    private String id_ = "";
    private String nameKey_ = "";
    private String descriptionKey_ = "";
    private String imageUrl_ = "";
    private String ctaKey_ = "";
    private String ctaDeepLink_ = "";
    private String categoryId_ = "";
    private String postDescriptionKey_ = "";
    private String postCtaKey_ = "";
    private String postCtaDeepLink_ = "";
    private String labelKey_ = "";
    private String iconUrl_ = "";

    static {
        bs bsVar = new bs();
        DEFAULT_INSTANCE = bsVar;
        du.registerDefaultInstance(bs.class, bsVar);
    }

    private bs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryId() {
        this.bitField0_ &= -65;
        this.categoryId_ = getDefaultInstance().getCategoryId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtaDeepLink() {
        this.bitField0_ &= -33;
        this.ctaDeepLink_ = getDefaultInstance().getCtaDeepLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtaKey() {
        this.bitField0_ &= -17;
        this.ctaKey_ = getDefaultInstance().getCtaKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescriptionKey() {
        this.bitField0_ &= -5;
        this.descriptionKey_ = getDefaultInstance().getDescriptionKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabled() {
        this.bitField0_ &= -257;
        this.disabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconUrl() {
        this.bitField0_ &= -32769;
        this.iconUrl_ = getDefaultInstance().getIconUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -9;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPublic() {
        this.bitField0_ &= -513;
        this.isPublic_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelKey() {
        this.bitField0_ &= -8193;
        this.labelKey_ = getDefaultInstance().getLabelKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameKey() {
        this.bitField0_ &= -3;
        this.nameKey_ = getDefaultInstance().getNameKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostCtaDeepLink() {
        this.bitField0_ &= -4097;
        this.postCtaDeepLink_ = getDefaultInstance().getPostCtaDeepLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostCtaKey() {
        this.bitField0_ &= -2049;
        this.postCtaKey_ = getDefaultInstance().getPostCtaKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostDescriptionKey() {
        this.bitField0_ &= -1025;
        this.postDescriptionKey_ = getDefaultInstance().getPostDescriptionKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.bitField0_ &= -16385;
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorityInCategory() {
        this.bitField0_ &= -129;
        this.priorityInCategory_ = 0;
    }

    public static bs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static br newBuilder() {
        return (br) DEFAULT_INSTANCE.createBuilder();
    }

    public static bs parseDelimitedFrom(InputStream inputStream) {
        return (bs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bs parseFrom(com.google.v.v vVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.categoryId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryIdBytes(com.google.v.v vVar) {
        this.categoryId_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaDeepLink(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.ctaDeepLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaDeepLinkBytes(com.google.v.v vVar) {
        this.ctaDeepLink_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.ctaKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaKeyBytes(com.google.v.v vVar) {
        this.ctaKey_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.descriptionKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionKeyBytes(com.google.v.v vVar) {
        this.descriptionKey_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabled(boolean z) {
        this.bitField0_ |= 256;
        this.disabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.iconUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrlBytes(com.google.v.v vVar) {
        this.iconUrl_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(com.google.v.v vVar) {
        this.imageUrl_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPublic(boolean z) {
        this.bitField0_ |= 512;
        this.isPublic_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8192;
        this.labelKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelKeyBytes(com.google.v.v vVar) {
        this.labelKey_ = vVar.u();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.nameKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameKeyBytes(com.google.v.v vVar) {
        this.nameKey_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostCtaDeepLink(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.postCtaDeepLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostCtaDeepLinkBytes(com.google.v.v vVar) {
        this.postCtaDeepLink_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostCtaKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.postCtaKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostCtaKeyBytes(com.google.v.v vVar) {
        this.postCtaKey_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostDescriptionKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.postDescriptionKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostDescriptionKeyBytes(com.google.v.v vVar) {
        this.postDescriptionKey_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i2) {
        this.bitField0_ |= 16384;
        this.priority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorityInCategory(int i2) {
        this.bitField0_ |= 128;
        this.priorityInCategory_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tဇ\b\nဇ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e\u0010ဈ\u000f", new Object[]{"bitField0_", "id_", "nameKey_", "descriptionKey_", "imageUrl_", "ctaKey_", "ctaDeepLink_", "categoryId_", "priorityInCategory_", "disabled_", "isPublic_", "postDescriptionKey_", "postCtaKey_", "postCtaDeepLink_", "labelKey_", "priority_", "iconUrl_"});
        }
        if (iOrdinal == 3) {
            return new bs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new br(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCategoryId() {
        return this.categoryId_;
    }

    public com.google.v.v getCategoryIdBytes() {
        return com.google.v.v.s(this.categoryId_);
    }

    public String getCtaDeepLink() {
        return this.ctaDeepLink_;
    }

    public com.google.v.v getCtaDeepLinkBytes() {
        return com.google.v.v.s(this.ctaDeepLink_);
    }

    public String getCtaKey() {
        return this.ctaKey_;
    }

    public com.google.v.v getCtaKeyBytes() {
        return com.google.v.v.s(this.ctaKey_);
    }

    public String getDescriptionKey() {
        return this.descriptionKey_;
    }

    public com.google.v.v getDescriptionKeyBytes() {
        return com.google.v.v.s(this.descriptionKey_);
    }

    public boolean getDisabled() {
        return this.disabled_;
    }

    public String getIconUrl() {
        return this.iconUrl_;
    }

    public com.google.v.v getIconUrlBytes() {
        return com.google.v.v.s(this.iconUrl_);
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public com.google.v.v getImageUrlBytes() {
        return com.google.v.v.s(this.imageUrl_);
    }

    public boolean getIsPublic() {
        return this.isPublic_;
    }

    public String getLabelKey() {
        return this.labelKey_;
    }

    public com.google.v.v getLabelKeyBytes() {
        return com.google.v.v.s(this.labelKey_);
    }

    public String getNameKey() {
        return this.nameKey_;
    }

    public com.google.v.v getNameKeyBytes() {
        return com.google.v.v.s(this.nameKey_);
    }

    public String getPostCtaDeepLink() {
        return this.postCtaDeepLink_;
    }

    public com.google.v.v getPostCtaDeepLinkBytes() {
        return com.google.v.v.s(this.postCtaDeepLink_);
    }

    public String getPostCtaKey() {
        return this.postCtaKey_;
    }

    public com.google.v.v getPostCtaKeyBytes() {
        return com.google.v.v.s(this.postCtaKey_);
    }

    public String getPostDescriptionKey() {
        return this.postDescriptionKey_;
    }

    public com.google.v.v getPostDescriptionKeyBytes() {
        return com.google.v.v.s(this.postDescriptionKey_);
    }

    public int getPriority() {
        return this.priority_;
    }

    public int getPriorityInCategory() {
        return this.priorityInCategory_;
    }

    public boolean hasCategoryId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCtaDeepLink() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasCtaKey() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDescriptionKey() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDisabled() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIconUrl() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasImageUrl() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsPublic() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasLabelKey() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasNameKey() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPostCtaDeepLink() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasPostCtaKey() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasPostDescriptionKey() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasPriority() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasPriorityInCategory() {
        return (this.bitField0_ & 128) != 0;
    }

    public static br newBuilder(bs bsVar) {
        return (br) DEFAULT_INSTANCE.createBuilder(bsVar);
    }

    public static bs parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bs parseFrom(com.google.v.v vVar, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bs parseFrom(com.google.v.z zVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bs parseFrom(com.google.v.z zVar, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bs parseFrom(InputStream inputStream) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bs parseFrom(InputStream inputStream, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bs parseFrom(ByteBuffer byteBuffer) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bs parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bs parseFrom(byte[] bArr) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bs parseFrom(byte[] bArr, de deVar) {
        return (bs) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
