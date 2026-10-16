package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class iv extends com.google.v.du<iv, it> implements com.google.v.fj {
    public static final int ADDON_FIELD_NUMBER = 20;
    public static final int ANONYMOUS_FIELD_NUMBER = 14;
    public static final int BIRTH_DATE_SEC_FIELD_NUMBER = 17;
    private static final iv DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 4;
    public static final int EMAIL_VERIFICATION_AUTHORITY_FIELD_NUMBER = 16;
    public static final int EMAIL_VERIFIED_FIELD_NUMBER = 5;
    public static final int EXCLUSIVE_MOODS_LEVEL_FIELD_NUMBER = 24;
    public static final int FIRST_NAME_FIELD_NUMBER = 1;
    public static final int FREE_TEXT_FIELD_NUMBER = 8;
    public static final int IS_AADC_RESTRICTED_FIELD_NUMBER = 18;
    public static final int IS_AGE_CONFIRMED_FIELD_NUMBER = 23;
    public static final int IS_REGISTERED_FIELD_NUMBER = 15;
    public static final int IS_U16_RESTRICTED_FIELD_NUMBER = 22;
    public static final int IS_U18_RESTRICTED_FIELD_NUMBER = 19;
    public static final int JOIN_DATE_SEC_FIELD_NUMBER = 10;
    public static final int LAST_LOGIN_SEC_FIELD_NUMBER = 12;
    public static final int LAST_NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<iv> PARSER = null;
    public static final int PHONE_FIELD_NUMBER = 3;
    public static final int POINTS_FIELD_NUMBER = 11;
    public static final int POINTS_UPDATE_TIME_FIELD_NUMBER = 25;
    public static final int PUBLIC_USER_NAME_FIELD_NUMBER = 13;
    public static final int WORK_EMAIL_FIELD_NUMBER = 6;
    public static final int WORK_EMAIL_VERIFIED_FIELD_NUMBER = 7;
    private int addon_;
    private boolean anonymous_;
    private long birthDateSec_;
    private int bitField0_;
    private int emailVerificationAuthority_;
    private boolean emailVerified_;
    private int exclusiveMoodsLevel_;
    private boolean isAadcRestricted_;
    private boolean isAgeConfirmed_;
    private boolean isRegistered_;
    private boolean isU16Restricted_;
    private boolean isU18Restricted_;
    private int joinDateSec_;
    private long lastLoginSec_;
    private com.google.v.gc pointsUpdateTime_;
    private long points_;
    private boolean workEmailVerified_;
    private String firstName_ = "";
    private String lastName_ = "";
    private String phone_ = "";
    private String email_ = "";
    private String workEmail_ = "";
    private String freeText_ = "";
    private String publicUserName_ = "";

    static {
        iv ivVar = new iv();
        DEFAULT_INSTANCE = ivVar;
        com.google.v.du.registerDefaultInstance(iv.class, ivVar);
    }

    private iv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddon() {
        this.bitField0_ &= -2097153;
        this.addon_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnonymous() {
        this.bitField0_ &= -8193;
        this.anonymous_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBirthDateSec() {
        this.bitField0_ &= -65537;
        this.birthDateSec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -9;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailVerificationAuthority() {
        this.bitField0_ &= -32769;
        this.emailVerificationAuthority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailVerified() {
        this.bitField0_ &= -17;
        this.emailVerified_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExclusiveMoodsLevel() {
        this.bitField0_ &= -4194305;
        this.exclusiveMoodsLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstName() {
        this.bitField0_ &= -2;
        this.firstName_ = getDefaultInstance().getFirstName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeText() {
        this.bitField0_ &= -129;
        this.freeText_ = getDefaultInstance().getFreeText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAadcRestricted() {
        this.bitField0_ &= -131073;
        this.isAadcRestricted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAgeConfirmed() {
        this.bitField0_ &= -1048577;
        this.isAgeConfirmed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRegistered() {
        this.bitField0_ &= -16385;
        this.isRegistered_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsU16Restricted() {
        this.bitField0_ &= -524289;
        this.isU16Restricted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsU18Restricted() {
        this.bitField0_ &= -262145;
        this.isU18Restricted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinDateSec() {
        this.bitField0_ &= -257;
        this.joinDateSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastLoginSec() {
        this.bitField0_ &= -2049;
        this.lastLoginSec_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastName() {
        this.bitField0_ &= -3;
        this.lastName_ = getDefaultInstance().getLastName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhone() {
        this.bitField0_ &= -5;
        this.phone_ = getDefaultInstance().getPhone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.bitField0_ &= -513;
        this.points_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointsUpdateTime() {
        this.pointsUpdateTime_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicUserName() {
        this.bitField0_ &= -4097;
        this.publicUserName_ = getDefaultInstance().getPublicUserName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkEmail() {
        this.bitField0_ &= -33;
        this.workEmail_ = getDefaultInstance().getWorkEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkEmailVerified() {
        this.bitField0_ &= -65;
        this.workEmailVerified_ = false;
    }

    public static iv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointsUpdateTime(com.google.v.gc gcVar) {
        Objects.requireNonNull(gcVar);
        com.google.v.gc gcVar2 = this.pointsUpdateTime_;
        if (gcVar2 != null && gcVar2 != com.google.v.gc.getDefaultInstance()) {
            com.google.v.gb gbVarNewBuilder = com.google.v.gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((com.google.v.gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.pointsUpdateTime_ = gcVar;
        this.bitField0_ |= 1024;
    }

    public static it newBuilder() {
        return (it) DEFAULT_INSTANCE.createBuilder();
    }

    public static iv parseDelimitedFrom(InputStream inputStream) {
        return (iv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iv parseFrom(com.google.v.v vVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<iv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddon(int i2) {
        this.bitField0_ |= 2097152;
        this.addon_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnonymous(boolean z) {
        this.bitField0_ |= 8192;
        this.anonymous_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirthDateSec(long j2) {
        this.bitField0_ |= 65536;
        this.birthDateSec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailVerificationAuthority(i.b.v vVar) {
        this.emailVerificationAuthority_ = vVar.getNumber();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailVerified(boolean z) {
        this.bitField0_ |= 16;
        this.emailVerified_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExclusiveMoodsLevel(iu iuVar) {
        this.exclusiveMoodsLevel_ = iuVar.getNumber();
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.firstName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstNameBytes(com.google.v.v vVar) {
        this.firstName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.freeText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeTextBytes(com.google.v.v vVar) {
        this.freeText_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAadcRestricted(boolean z) {
        this.bitField0_ |= 131072;
        this.isAadcRestricted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAgeConfirmed(boolean z) {
        this.bitField0_ |= 1048576;
        this.isAgeConfirmed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRegistered(boolean z) {
        this.bitField0_ |= 16384;
        this.isRegistered_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsU16Restricted(boolean z) {
        this.bitField0_ |= 524288;
        this.isU16Restricted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsU18Restricted(boolean z) {
        this.bitField0_ |= 262144;
        this.isU18Restricted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinDateSec(int i2) {
        this.bitField0_ |= 256;
        this.joinDateSec_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastLoginSec(long j2) {
        this.bitField0_ |= 2048;
        this.lastLoginSec_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.lastName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastNameBytes(com.google.v.v vVar) {
        this.lastName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhone(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.phone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneBytes(com.google.v.v vVar) {
        this.phone_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(long j2) {
        this.bitField0_ |= 512;
        this.points_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsUpdateTime(com.google.v.gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.pointsUpdateTime_ = gcVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicUserName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.publicUserName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicUserNameBytes(com.google.v.v vVar) {
        this.publicUserName_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.workEmail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkEmailBytes(com.google.v.v vVar) {
        this.workEmail_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkEmailVerified(boolean z) {
        this.bitField0_ |= 64;
        this.workEmailVerified_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0019\u0017\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဈ\u0007\nင\b\u000bဂ\t\fဂ\u000b\rဈ\f\u000eဇ\r\u000fဇ\u000e\u0010᠌\u000f\u0011ဂ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014င\u0015\u0016ဇ\u0013\u0017ဇ\u0014\u0018᠌\u0016\u0019ဉ\n", new Object[]{"bitField0_", "firstName_", "lastName_", "phone_", "email_", "emailVerified_", "workEmail_", "workEmailVerified_", "freeText_", "joinDateSec_", "points_", "lastLoginSec_", "publicUserName_", "anonymous_", "isRegistered_", "emailVerificationAuthority_", i.b.v.a(), "birthDateSec_", "isAadcRestricted_", "isU18Restricted_", "addon_", "isU16Restricted_", "isAgeConfirmed_", "exclusiveMoodsLevel_", hf.f48742f, "pointsUpdateTime_"});
        }
        if (iOrdinal == 3) {
            return new iv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new it(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<iv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (iv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getAddon() {
        return this.addon_;
    }

    public boolean getAnonymous() {
        return this.anonymous_;
    }

    public long getBirthDateSec() {
        return this.birthDateSec_;
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public i.b.v getEmailVerificationAuthority() {
        i.b.v vVarB = i.b.v.b(this.emailVerificationAuthority_);
        return vVarB == null ? i.b.v.NONE : vVarB;
    }

    public boolean getEmailVerified() {
        return this.emailVerified_;
    }

    public iu getExclusiveMoodsLevel() {
        iu iuVarA = iu.a(this.exclusiveMoodsLevel_);
        return iuVarA == null ? iu.NONE : iuVarA;
    }

    public String getFirstName() {
        return this.firstName_;
    }

    public com.google.v.v getFirstNameBytes() {
        return com.google.v.v.s(this.firstName_);
    }

    @Deprecated
    public String getFreeText() {
        return this.freeText_;
    }

    @Deprecated
    public com.google.v.v getFreeTextBytes() {
        return com.google.v.v.s(this.freeText_);
    }

    public boolean getIsAadcRestricted() {
        return this.isAadcRestricted_;
    }

    public boolean getIsAgeConfirmed() {
        return this.isAgeConfirmed_;
    }

    public boolean getIsRegistered() {
        return this.isRegistered_;
    }

    public boolean getIsU16Restricted() {
        return this.isU16Restricted_;
    }

    public boolean getIsU18Restricted() {
        return this.isU18Restricted_;
    }

    public int getJoinDateSec() {
        return this.joinDateSec_;
    }

    public long getLastLoginSec() {
        return this.lastLoginSec_;
    }

    public String getLastName() {
        return this.lastName_;
    }

    public com.google.v.v getLastNameBytes() {
        return com.google.v.v.s(this.lastName_);
    }

    public String getPhone() {
        return this.phone_;
    }

    public com.google.v.v getPhoneBytes() {
        return com.google.v.v.s(this.phone_);
    }

    public long getPoints() {
        return this.points_;
    }

    public com.google.v.gc getPointsUpdateTime() {
        com.google.v.gc gcVar = this.pointsUpdateTime_;
        return gcVar == null ? com.google.v.gc.getDefaultInstance() : gcVar;
    }

    public String getPublicUserName() {
        return this.publicUserName_;
    }

    public com.google.v.v getPublicUserNameBytes() {
        return com.google.v.v.s(this.publicUserName_);
    }

    @Deprecated
    public String getWorkEmail() {
        return this.workEmail_;
    }

    @Deprecated
    public com.google.v.v getWorkEmailBytes() {
        return com.google.v.v.s(this.workEmail_);
    }

    @Deprecated
    public boolean getWorkEmailVerified() {
        return this.workEmailVerified_;
    }

    public boolean hasAddon() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasAnonymous() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasBirthDateSec() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEmailVerificationAuthority() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasEmailVerified() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasExclusiveMoodsLevel() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasFirstName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasFreeText() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIsAadcRestricted() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasIsAgeConfirmed() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasIsRegistered() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasIsU16Restricted() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasIsU18Restricted() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasJoinDateSec() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasLastLoginSec() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasLastName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPhone() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPoints() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasPointsUpdateTime() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasPublicUserName() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Deprecated
    public boolean hasWorkEmail() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasWorkEmailVerified() {
        return (this.bitField0_ & 64) != 0;
    }

    public static it newBuilder(iv ivVar) {
        return (it) DEFAULT_INSTANCE.createBuilder(ivVar);
    }

    public static iv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static iv parseFrom(com.google.v.z zVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static iv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static iv parseFrom(InputStream inputStream) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iv parseFrom(ByteBuffer byteBuffer) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static iv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static iv parseFrom(byte[] bArr) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static iv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (iv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
