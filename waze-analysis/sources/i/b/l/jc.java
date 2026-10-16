package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class jc extends com.google.v.du<jc, jb> implements com.google.v.fj {
    public static final int BASIC_INFO_FIELD_NUMBER = 1;
    public static final int CARPOOL_ONBOARDED_FIELD_NUMBER = 8;
    public static final int COMPLETED_PERCENT_FIELD_NUMBER = 10;
    private static final jc DEFAULT_INSTANCE;
    public static final int FAVORITES_INFO_FIELD_NUMBER = 5;
    public static final int MOOD_ID_FIELD_NUMBER = 12;
    private static volatile com.google.v.fo<jc> PARSER = null;
    public static final int PICTURE_ID_FIELD_NUMBER = 11;
    public static final int SOCIAL_INFO_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 13;
    public static final int USER_ID_FIELD_NUMBER = 9;
    private iv basicInfo_;
    private int bitField0_;
    private boolean carpoolOnboarded_;
    private int completedPercent_;
    private ja favoritesInfo_;
    private int moodId_;
    private je socialInfo_;
    private long userId_;
    private String pictureId_ = "";
    private String username_ = "";

    static {
        jc jcVar = new jc();
        DEFAULT_INSTANCE = jcVar;
        com.google.v.du.registerDefaultInstance(jc.class, jcVar);
    }

    private jc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBasicInfo() {
        this.basicInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarpoolOnboarded() {
        this.bitField0_ &= -17;
        this.carpoolOnboarded_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCompletedPercent() {
        this.bitField0_ &= -33;
        this.completedPercent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoritesInfo() {
        this.favoritesInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodId() {
        this.bitField0_ &= -129;
        this.moodId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPictureId() {
        this.bitField0_ &= -65;
        this.pictureId_ = getDefaultInstance().getPictureId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSocialInfo() {
        this.socialInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -257;
        this.username_ = getDefaultInstance().getUsername();
    }

    public static jc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBasicInfo(iv ivVar) {
        Objects.requireNonNull(ivVar);
        iv ivVar2 = this.basicInfo_;
        if (ivVar2 != null && ivVar2 != iv.getDefaultInstance()) {
            it itVarNewBuilder = iv.newBuilder(ivVar2);
            itVarNewBuilder.mergeFrom((it) ivVar);
            ivVar = itVarNewBuilder.buildPartial();
        }
        this.basicInfo_ = ivVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavoritesInfo(ja jaVar) {
        Objects.requireNonNull(jaVar);
        ja jaVar2 = this.favoritesInfo_;
        if (jaVar2 != null && jaVar2 != ja.getDefaultInstance()) {
            iz izVarNewBuilder = ja.newBuilder(jaVar2);
            izVarNewBuilder.mergeFrom((iz) jaVar);
            jaVar = izVarNewBuilder.buildPartial();
        }
        this.favoritesInfo_ = jaVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSocialInfo(je jeVar) {
        Objects.requireNonNull(jeVar);
        je jeVar2 = this.socialInfo_;
        if (jeVar2 != null && jeVar2 != je.getDefaultInstance()) {
            jd jdVarNewBuilder = je.newBuilder(jeVar2);
            jdVarNewBuilder.mergeFrom((jd) jeVar);
            jeVar = jdVarNewBuilder.buildPartial();
        }
        this.socialInfo_ = jeVar;
        this.bitField0_ |= 4;
    }

    public static jb newBuilder() {
        return (jb) DEFAULT_INSTANCE.createBuilder();
    }

    public static jc parseDelimitedFrom(InputStream inputStream) {
        return (jc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jc parseFrom(com.google.v.v vVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBasicInfo(iv ivVar) {
        Objects.requireNonNull(ivVar);
        this.basicInfo_ = ivVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarpoolOnboarded(boolean z) {
        this.bitField0_ |= 16;
        this.carpoolOnboarded_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompletedPercent(int i2) {
        this.bitField0_ |= 32;
        this.completedPercent_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoritesInfo(ja jaVar) {
        Objects.requireNonNull(jaVar);
        this.favoritesInfo_ = jaVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodId(int i2) {
        this.bitField0_ |= 128;
        this.moodId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.pictureId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureIdBytes(com.google.v.v vVar) {
        this.pictureId_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSocialInfo(je jeVar) {
        Objects.requireNonNull(jeVar);
        this.socialInfo_ = jeVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
        this.userId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(com.google.v.v vVar) {
        this.username_ = vVar.u();
        this.bitField0_ |= 256;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0005ဉ\u0003\bဇ\u0004\tဂ\u0000\nင\u0005\u000bဈ\u0006\fင\u0007\rဈ\b", new Object[]{"bitField0_", "basicInfo_", "socialInfo_", "favoritesInfo_", "carpoolOnboarded_", "userId_", "completedPercent_", "pictureId_", "moodId_", "username_"});
        }
        if (iOrdinal == 3) {
            return new jc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public iv getBasicInfo() {
        iv ivVar = this.basicInfo_;
        return ivVar == null ? iv.getDefaultInstance() : ivVar;
    }

    @Deprecated
    public boolean getCarpoolOnboarded() {
        return this.carpoolOnboarded_;
    }

    public int getCompletedPercent() {
        return this.completedPercent_;
    }

    public ja getFavoritesInfo() {
        ja jaVar = this.favoritesInfo_;
        return jaVar == null ? ja.getDefaultInstance() : jaVar;
    }

    public int getMoodId() {
        return this.moodId_;
    }

    public String getPictureId() {
        return this.pictureId_;
    }

    public com.google.v.v getPictureIdBytes() {
        return com.google.v.v.s(this.pictureId_);
    }

    public je getSocialInfo() {
        je jeVar = this.socialInfo_;
        return jeVar == null ? je.getDefaultInstance() : jeVar;
    }

    public long getUserId() {
        return this.userId_;
    }

    public String getUsername() {
        return this.username_;
    }

    public com.google.v.v getUsernameBytes() {
        return com.google.v.v.s(this.username_);
    }

    public boolean hasBasicInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasCarpoolOnboarded() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCompletedPercent() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFavoritesInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMoodId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasPictureId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSocialInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 256) != 0;
    }

    public static jb newBuilder(jc jcVar) {
        return (jb) DEFAULT_INSTANCE.createBuilder(jcVar);
    }

    public static jc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jc parseFrom(com.google.v.z zVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jc parseFrom(InputStream inputStream) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jc parseFrom(ByteBuffer byteBuffer) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jc parseFrom(byte[] bArr) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
