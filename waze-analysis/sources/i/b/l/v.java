package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class v extends com.google.v.du<v, u> implements w {
    private static final v DEFAULT_INSTANCE;
    public static final int FIRST_NAME_FIELD_NUMBER = 7;
    public static final int JOB_TITLE_FIELD_NUMBER = 5;
    public static final int LAST_NAME_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_OF_FRIENDS_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<v> PARSER = null;
    public static final int PROFILE_URL_FIELD_NUMBER = 6;
    public static final int USER_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private int numberOfFriends_;
    private String name_ = "";
    private String userId_ = "";
    private String jobTitle_ = "";
    private String profileUrl_ = "";
    private String firstName_ = "";
    private String lastName_ = "";

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        com.google.v.du.registerDefaultInstance(v.class, vVar);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstName() {
        this.bitField0_ &= -17;
        this.firstName_ = getDefaultInstance().getFirstName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobTitle() {
        this.bitField0_ &= -5;
        this.jobTitle_ = getDefaultInstance().getJobTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastName() {
        this.bitField0_ &= -33;
        this.lastName_ = getDefaultInstance().getLastName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberOfFriends() {
        this.bitField0_ &= -65;
        this.numberOfFriends_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfileUrl() {
        this.bitField0_ &= -9;
        this.profileUrl_ = getDefaultInstance().getProfileUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -3;
        this.userId_ = getDefaultInstance().getUserId();
    }

    public static v getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static v parseDelimitedFrom(InputStream inputStream) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(com.google.v.v vVar) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<v> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.firstName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstNameBytes(com.google.v.v vVar) {
        this.firstName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.jobTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTitleBytes(com.google.v.v vVar) {
        this.jobTitle_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.lastName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastNameBytes(com.google.v.v vVar) {
        this.lastName_ = vVar.u();
        this.bitField0_ |= 32;
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
    public void setNumberOfFriends(int i2) {
        this.bitField0_ |= 64;
        this.numberOfFriends_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfileUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.profileUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfileUrlBytes(com.google.v.v vVar) {
        this.profileUrl_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.userId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIdBytes(com.google.v.v vVar) {
        this.userId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003\u0007ဈ\u0004\bဈ\u0005\tင\u0006", new Object[]{"bitField0_", "name_", "userId_", "jobTitle_", "profileUrl_", "firstName_", "lastName_", "numberOfFriends_"});
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
        com.google.v.fo<v> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (v.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getFirstName() {
        return this.firstName_;
    }

    public com.google.v.v getFirstNameBytes() {
        return com.google.v.v.s(this.firstName_);
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

    public int getNumberOfFriends() {
        return this.numberOfFriends_;
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

    public boolean hasFirstName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasJobTitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLastName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNumberOfFriends() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasProfileUrl() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static u newBuilder(v vVar) {
        return (u) DEFAULT_INSTANCE.createBuilder(vVar);
    }

    public static v parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static v parseFrom(com.google.v.z zVar) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static v parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static v parseFrom(InputStream inputStream) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(ByteBuffer byteBuffer) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static v parseFrom(byte[] bArr) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static v parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (v) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
