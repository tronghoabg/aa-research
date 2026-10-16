package i.b.u;

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
/* loaded from: classes8.dex */
public final class v extends du<v, u> implements fj {
    public static final int BIRTHDATE_SECONDS_FIELD_NUMBER = 11;
    public static final int CONSENT_DATA_FIELD_NUMBER = 13;
    private static final v DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 3;
    public static final int FIRST_NAME_FIELD_NUMBER = 4;
    public static final int IS_ADS_USER_FIELD_NUMBER = 10;
    public static final int IS_AGE_CONFIRMED_FIELD_NUMBER = 12;
    public static final int LAST_NAME_FIELD_NUMBER = 5;
    public static final int ORGANIZATION_FIELD_NUMBER = 8;
    private static volatile fo<v> PARSER = null;
    public static final int PARTNER_USER_ID_FIELD_NUMBER = 9;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int RECEIVE_EMAILS_FIELD_NUMBER = 6;
    public static final int REFERRER_FIELD_NUMBER = 7;
    public static final int USER_NAME_FIELD_NUMBER = 1;
    private long birthdateSeconds_;
    private int bitField0_;
    private g consentData_;
    private boolean isAdsUser_;
    private boolean isAgeConfirmed_;
    private boolean receiveEmails_;
    private long referrer_;
    private String userName_ = "";
    private String password_ = "";
    private String email_ = "";
    private String firstName_ = "";
    private String lastName_ = "";
    private String organization_ = "";
    private String partnerUserId_ = "";

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        du.registerDefaultInstance(v.class, vVar);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBirthdateSeconds() {
        this.bitField0_ &= -1025;
        this.birthdateSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsentData() {
        this.consentData_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -5;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstName() {
        this.bitField0_ &= -9;
        this.firstName_ = getDefaultInstance().getFirstName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdsUser() {
        this.bitField0_ &= -513;
        this.isAdsUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAgeConfirmed() {
        this.bitField0_ &= -2049;
        this.isAgeConfirmed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastName() {
        this.bitField0_ &= -17;
        this.lastName_ = getDefaultInstance().getLastName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrganization() {
        this.bitField0_ &= -129;
        this.organization_ = getDefaultInstance().getOrganization();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerUserId() {
        this.bitField0_ &= -257;
        this.partnerUserId_ = getDefaultInstance().getPartnerUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.bitField0_ &= -3;
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceiveEmails() {
        this.bitField0_ &= -33;
        this.receiveEmails_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferrer() {
        this.bitField0_ &= -65;
        this.referrer_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserName() {
        this.bitField0_ &= -2;
        this.userName_ = getDefaultInstance().getUserName();
    }

    public static v getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConsentData(g gVar) {
        Objects.requireNonNull(gVar);
        g gVar2 = this.consentData_;
        if (gVar2 != null && gVar2 != g.getDefaultInstance()) {
            f fVarNewBuilder = g.newBuilder(gVar2);
            fVarNewBuilder.mergeFrom((f) gVar);
            gVar = fVarNewBuilder.buildPartial();
        }
        this.consentData_ = gVar;
        this.bitField0_ |= 4096;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static v parseDelimitedFrom(InputStream inputStream) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(com.google.v.v vVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<v> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirthdateSeconds(long j2) {
        this.bitField0_ |= 1024;
        this.birthdateSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsentData(g gVar) {
        Objects.requireNonNull(gVar);
        this.consentData_ = gVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.firstName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstNameBytes(com.google.v.v vVar) {
        this.firstName_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdsUser(boolean z) {
        this.bitField0_ |= 512;
        this.isAdsUser_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAgeConfirmed(boolean z) {
        this.bitField0_ |= 2048;
        this.isAgeConfirmed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.lastName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastNameBytes(com.google.v.v vVar) {
        this.lastName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrganization(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.organization_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrganizationBytes(com.google.v.v vVar) {
        this.organization_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerUserId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.partnerUserId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerUserIdBytes(com.google.v.v vVar) {
        this.partnerUserId_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.password_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(com.google.v.v vVar) {
        this.password_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceiveEmails(boolean z) {
        this.bitField0_ |= 32;
        this.receiveEmails_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferrer(long j2) {
        this.bitField0_ |= 64;
        this.referrer_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.userName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserNameBytes(com.google.v.v vVar) {
        this.userName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bဂ\n\fဇ\u000b\rဉ\f", new Object[]{"bitField0_", "userName_", "password_", "email_", "firstName_", "lastName_", "receiveEmails_", "referrer_", "organization_", "partnerUserId_", "isAdsUser_", "birthdateSeconds_", "isAgeConfirmed_", "consentData_"});
        }
        if (iOrdinal == 3) {
            return new v();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new u(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<v> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (v.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getBirthdateSeconds() {
        return this.birthdateSeconds_;
    }

    @Deprecated
    public g getConsentData() {
        g gVar = this.consentData_;
        return gVar == null ? g.getDefaultInstance() : gVar;
    }

    @Deprecated
    public String getEmail() {
        return this.email_;
    }

    @Deprecated
    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public String getFirstName() {
        return this.firstName_;
    }

    public com.google.v.v getFirstNameBytes() {
        return com.google.v.v.s(this.firstName_);
    }

    @Deprecated
    public boolean getIsAdsUser() {
        return this.isAdsUser_;
    }

    public boolean getIsAgeConfirmed() {
        return this.isAgeConfirmed_;
    }

    public String getLastName() {
        return this.lastName_;
    }

    public com.google.v.v getLastNameBytes() {
        return com.google.v.v.s(this.lastName_);
    }

    @Deprecated
    public String getOrganization() {
        return this.organization_;
    }

    @Deprecated
    public com.google.v.v getOrganizationBytes() {
        return com.google.v.v.s(this.organization_);
    }

    @Deprecated
    public String getPartnerUserId() {
        return this.partnerUserId_;
    }

    @Deprecated
    public com.google.v.v getPartnerUserIdBytes() {
        return com.google.v.v.s(this.partnerUserId_);
    }

    public String getPassword() {
        return this.password_;
    }

    public com.google.v.v getPasswordBytes() {
        return com.google.v.v.s(this.password_);
    }

    @Deprecated
    public boolean getReceiveEmails() {
        return this.receiveEmails_;
    }

    @Deprecated
    public long getReferrer() {
        return this.referrer_;
    }

    public String getUserName() {
        return this.userName_;
    }

    public com.google.v.v getUserNameBytes() {
        return com.google.v.v.s(this.userName_);
    }

    public boolean hasBirthdateSeconds() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Deprecated
    public boolean hasConsentData() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Deprecated
    public boolean hasEmail() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFirstName() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasIsAdsUser() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasIsAgeConfirmed() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasLastName() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasOrganization() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasPartnerUserId() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasPassword() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasReceiveEmails() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasReferrer() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasUserName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static u newBuilder(v vVar) {
        return (u) DEFAULT_INSTANCE.createBuilder(vVar);
    }

    public static v parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(com.google.v.v vVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static v parseFrom(com.google.v.z zVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static v parseFrom(com.google.v.z zVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static v parseFrom(InputStream inputStream) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(InputStream inputStream, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(ByteBuffer byteBuffer) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static v parseFrom(byte[] bArr) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static v parseFrom(byte[] bArr, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
