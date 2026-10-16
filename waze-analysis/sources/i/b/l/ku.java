package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ku extends com.google.v.du<ku, kt> implements com.google.v.fj {
    public static final int ANONYMOUS_FIELD_NUMBER = 4;
    private static final ku DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 7;
    public static final int GUEST_FIELD_NUMBER = 3;
    public static final int ISNEW_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 6;
    public static final int NICKNAME_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<ku> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int PICTUREID_FIELD_NUMBER = 8;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean anonymous_;
    private int bitField0_;
    private boolean guest_;
    private boolean isNew_;
    private String userName_ = "";
    private String password_ = "";
    private String nickname_ = "";
    private String name_ = "";
    private String email_ = "";
    private String pictureId_ = "";

    static {
        ku kuVar = new ku();
        DEFAULT_INSTANCE = kuVar;
        com.google.v.du.registerDefaultInstance(ku.class, kuVar);
    }

    private ku() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnonymous() {
        this.bitField0_ &= -9;
        this.anonymous_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -65;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuest() {
        this.bitField0_ &= -5;
        this.guest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNew() {
        this.bitField0_ &= -257;
        this.isNew_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -33;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.bitField0_ &= -17;
        this.nickname_ = getDefaultInstance().getNickname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.bitField0_ &= -3;
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPictureId() {
        this.bitField0_ &= -129;
        this.pictureId_ = getDefaultInstance().getPictureId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserName() {
        this.bitField0_ &= -2;
        this.userName_ = getDefaultInstance().getUserName();
    }

    public static ku getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kt newBuilder() {
        return (kt) DEFAULT_INSTANCE.createBuilder();
    }

    public static ku parseDelimitedFrom(InputStream inputStream) {
        return (ku) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ku parseFrom(com.google.v.v vVar) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ku> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnonymous(boolean z) {
        this.bitField0_ |= 8;
        this.anonymous_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuest(boolean z) {
        this.bitField0_ |= 4;
        this.guest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNew(boolean z) {
        this.bitField0_ |= 256;
        this.isNew_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.nickname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(com.google.v.v vVar) {
        this.nickname_ = vVar.u();
        this.bitField0_ |= 16;
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
    public void setPictureId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.pictureId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureIdBytes(com.google.v.v vVar) {
        this.pictureId_ = vVar.u();
        this.bitField0_ |= 128;
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
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b", new Object[]{"bitField0_", "userName_", "password_", "guest_", "anonymous_", "nickname_", "name_", "email_", "pictureId_", "isNew_"});
        }
        if (iOrdinal == 3) {
            return new ku();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ku> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ku.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAnonymous() {
        return this.anonymous_;
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public boolean getGuest() {
        return this.guest_;
    }

    public boolean getIsNew() {
        return this.isNew_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getNickname() {
        return this.nickname_;
    }

    public com.google.v.v getNicknameBytes() {
        return com.google.v.v.s(this.nickname_);
    }

    public String getPassword() {
        return this.password_;
    }

    public com.google.v.v getPasswordBytes() {
        return com.google.v.v.s(this.password_);
    }

    public String getPictureId() {
        return this.pictureId_;
    }

    public com.google.v.v getPictureIdBytes() {
        return com.google.v.v.s(this.pictureId_);
    }

    public String getUserName() {
        return this.userName_;
    }

    public com.google.v.v getUserNameBytes() {
        return com.google.v.v.s(this.userName_);
    }

    public boolean hasAnonymous() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasGuest() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsNew() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNickname() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPassword() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPictureId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasUserName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kt newBuilder(ku kuVar) {
        return (kt) DEFAULT_INSTANCE.createBuilder(kuVar);
    }

    public static ku parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ku) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ku parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ku parseFrom(com.google.v.z zVar) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ku parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ku parseFrom(InputStream inputStream) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ku parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ku parseFrom(ByteBuffer byteBuffer) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ku parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ku parseFrom(byte[] bArr) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ku parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ku) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
