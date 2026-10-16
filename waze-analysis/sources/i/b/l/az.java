package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class az extends com.google.v.du<az, ax> implements com.google.v.fj {
    public static final int ANOTHER_USER_ACTION_FIELD_NUMBER = 11;
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int CODE_VALUE_FIELD_NUMBER = 10;
    private static final az DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 4;
    public static final int LASTACCESSSECONDS_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NICKNAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<az> PARSER = null;
    public static final int PICTUREID_FIELD_NUMBER = 5;
    public static final int POINTS_FIELD_NUMBER = 9;
    public static final int RANK_FIELD_NUMBER = 8;
    public static final int USERNAME_FIELD_NUMBER = 6;
    private int bitField0_;
    private int code_;
    private long lastAccessSeconds_;
    private long points_;
    private long rank_;
    private String nickname_ = "";
    private String name_ = "";
    private String email_ = "";
    private String pictureId_ = "";
    private String username_ = "";
    private int codeValue_ = 1;
    private int anotherUserAction_ = 1;

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        com.google.v.du.registerDefaultInstance(az.class, azVar);
    }

    private az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnotherUserAction() {
        this.bitField0_ &= -1025;
        this.anotherUserAction_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.bitField0_ &= -2;
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodeValue() {
        this.bitField0_ &= -513;
        this.codeValue_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -9;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAccessSeconds() {
        this.bitField0_ &= -65;
        this.lastAccessSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.bitField0_ &= -3;
        this.nickname_ = getDefaultInstance().getNickname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPictureId() {
        this.bitField0_ &= -17;
        this.pictureId_ = getDefaultInstance().getPictureId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.bitField0_ &= -257;
        this.points_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.bitField0_ &= -129;
        this.rank_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -33;
        this.username_ = getDefaultInstance().getUsername();
    }

    public static az getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ax newBuilder() {
        return (ax) DEFAULT_INSTANCE.createBuilder();
    }

    public static az parseDelimitedFrom(InputStream inputStream) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(com.google.v.v vVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<az> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnotherUserAction(aw awVar) {
        this.anotherUserAction_ = awVar.getNumber();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i2) {
        this.bitField0_ |= 1;
        this.code_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeValue(ay ayVar) {
        this.codeValue_ = ayVar.getNumber();
        this.bitField0_ |= 512;
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
    public void setLastAccessSeconds(long j2) {
        this.bitField0_ |= 64;
        this.lastAccessSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.nickname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(com.google.v.v vVar) {
        this.nickname_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.pictureId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureIdBytes(com.google.v.v vVar) {
        this.pictureId_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(long j2) {
        this.bitField0_ |= 256;
        this.points_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(long j2) {
        this.bitField0_ |= 128;
        this.rank_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(com.google.v.v vVar) {
        this.username_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\n᠌\t\u000b᠌\n", new Object[]{"bitField0_", "code_", "nickname_", "name_", "email_", "pictureId_", "username_", "lastAccessSeconds_", "rank_", "points_", "codeValue_", e.n, "anotherUserAction_", e.m});
        }
        if (iOrdinal == 3) {
            return new az();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ax(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<az> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (az.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aw getAnotherUserAction() {
        aw awVarA = aw.a(this.anotherUserAction_);
        return awVarA == null ? aw.SHOULD_SWITCH : awVarA;
    }

    public int getCode() {
        return this.code_;
    }

    public ay getCodeValue() {
        ay ayVarA = ay.a(this.codeValue_);
        return ayVarA == null ? ay.CONNECTED : ayVarA;
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public long getLastAccessSeconds() {
        return this.lastAccessSeconds_;
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

    public String getPictureId() {
        return this.pictureId_;
    }

    public com.google.v.v getPictureIdBytes() {
        return com.google.v.v.s(this.pictureId_);
    }

    public long getPoints() {
        return this.points_;
    }

    @Deprecated
    public long getRank() {
        return this.rank_;
    }

    public String getUsername() {
        return this.username_;
    }

    public com.google.v.v getUsernameBytes() {
        return com.google.v.v.s(this.username_);
    }

    public boolean hasAnotherUserAction() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCodeValue() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLastAccessSeconds() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNickname() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPictureId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPoints() {
        return (this.bitField0_ & 256) != 0;
    }

    @Deprecated
    public boolean hasRank() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 32) != 0;
    }

    public static ax newBuilder(az azVar) {
        return (ax) DEFAULT_INSTANCE.createBuilder(azVar);
    }

    public static az parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static az parseFrom(com.google.v.z zVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static az parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static az parseFrom(InputStream inputStream) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(ByteBuffer byteBuffer) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static az parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static az parseFrom(byte[] bArr) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static az parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
