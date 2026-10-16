package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ix extends com.google.v.du<ix, iw> implements iy {
    public static final int ACCESSTOKENSTATUS_FIELD_NUMBER = 7;
    private static final ix DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 10;
    public static final int FIRST_NAME_FIELD_NUMBER = 11;
    public static final int GENDER_FIELD_NUMBER = 8;
    public static final int GENDER_TEXT_FIELD_NUMBER = 9;
    public static final int JOB_TITLE_FIELD_NUMBER = 5;
    public static final int LAST_NAME_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ix> PARSER = null;
    public static final int PROFILE_URL_FIELD_NUMBER = 6;
    public static final int USER_ID_FIELD_NUMBER = 4;
    public static final int WAS_UPLOADED_FIELD_NUMBER = 3;
    private int accessTokenStatus_;
    private int bitField0_;
    private boolean wasUploaded_;
    private String name_ = "";
    private String userId_ = "";
    private String jobTitle_ = "";
    private String profileUrl_ = "";
    private int gender_ = 1;
    private String genderText_ = "";
    private String email_ = "";
    private String firstName_ = "";
    private String lastName_ = "";

    static {
        ix ixVar = new ix();
        DEFAULT_INSTANCE = ixVar;
        com.google.v.du.registerDefaultInstance(ix.class, ixVar);
    }

    private ix() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessTokenStatus() {
        this.bitField0_ &= -33;
        this.accessTokenStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -257;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstName() {
        this.bitField0_ &= -513;
        this.firstName_ = getDefaultInstance().getFirstName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGender() {
        this.bitField0_ &= -65;
        this.gender_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGenderText() {
        this.bitField0_ &= -129;
        this.genderText_ = getDefaultInstance().getGenderText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobTitle() {
        this.bitField0_ &= -9;
        this.jobTitle_ = getDefaultInstance().getJobTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastName() {
        this.bitField0_ &= -1025;
        this.lastName_ = getDefaultInstance().getLastName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfileUrl() {
        this.bitField0_ &= -17;
        this.profileUrl_ = getDefaultInstance().getProfileUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -5;
        this.userId_ = getDefaultInstance().getUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWasUploaded() {
        this.bitField0_ &= -3;
        this.wasUploaded_ = false;
    }

    public static ix getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static iw newBuilder() {
        return (iw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ix parseDelimitedFrom(InputStream inputStream) {
        return (ix) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ix parseFrom(com.google.v.v vVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ix> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessTokenStatus(i.b.p.a aVar) {
        this.accessTokenStatus_ = aVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.firstName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstNameBytes(com.google.v.v vVar) {
        this.firstName_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGender(im imVar) {
        this.gender_ = imVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenderText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.genderText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenderTextBytes(com.google.v.v vVar) {
        this.genderText_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.jobTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTitleBytes(com.google.v.v vVar) {
        this.jobTitle_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.lastName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastNameBytes(com.google.v.v vVar) {
        this.lastName_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfileUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.profileUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfileUrlBytes(com.google.v.v vVar) {
        this.profileUrl_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.userId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIdBytes(com.google.v.v vVar) {
        this.userId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWasUploaded(boolean z) {
        this.bitField0_ |= 2;
        this.wasUploaded_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007᠌\u0005\b᠌\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fဈ\n", new Object[]{"bitField0_", "name_", "wasUploaded_", "userId_", "jobTitle_", "profileUrl_", "accessTokenStatus_", i.b.p.a.a(), "gender_", hf.f48741e, "genderText_", "email_", "firstName_", "lastName_"});
        }
        if (iOrdinal == 3) {
            return new ix();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new iw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ix> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ix.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.p.a getAccessTokenStatus() {
        i.b.p.a aVarB = i.b.p.a.b(this.accessTokenStatus_);
        return aVarB == null ? i.b.p.a.OK : aVarB;
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public String getFirstName() {
        return this.firstName_;
    }

    public com.google.v.v getFirstNameBytes() {
        return com.google.v.v.s(this.firstName_);
    }

    public im getGender() {
        im imVarA = im.a(this.gender_);
        return imVarA == null ? im.MALE : imVarA;
    }

    public String getGenderText() {
        return this.genderText_;
    }

    public com.google.v.v getGenderTextBytes() {
        return com.google.v.v.s(this.genderText_);
    }

    public String getJobTitle() {
        return this.jobTitle_;
    }

    public com.google.v.v getJobTitleBytes() {
        return com.google.v.v.s(this.jobTitle_);
    }

    public String getLastName() {
        return this.lastName_;
    }

    public com.google.v.v getLastNameBytes() {
        return com.google.v.v.s(this.lastName_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getProfileUrl() {
        return this.profileUrl_;
    }

    public com.google.v.v getProfileUrlBytes() {
        return com.google.v.v.s(this.profileUrl_);
    }

    public String getUserId() {
        return this.userId_;
    }

    public com.google.v.v getUserIdBytes() {
        return com.google.v.v.s(this.userId_);
    }

    public boolean getWasUploaded() {
        return this.wasUploaded_;
    }

    public boolean hasAccessTokenStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasFirstName() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasGender() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasGenderText() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasJobTitle() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLastName() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasProfileUrl() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWasUploaded() {
        return (this.bitField0_ & 2) != 0;
    }

    public static iw newBuilder(ix ixVar) {
        return (iw) DEFAULT_INSTANCE.createBuilder(ixVar);
    }

    public static ix parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ix) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ix parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ix parseFrom(com.google.v.z zVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ix parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ix parseFrom(InputStream inputStream) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ix parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ix parseFrom(ByteBuffer byteBuffer) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ix parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ix parseFrom(byte[] bArr) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ix parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
