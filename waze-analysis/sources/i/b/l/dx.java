package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dx extends com.google.v.du<dx, dw> implements com.google.v.fj {
    public static final int CONFIGVERSION_FIELD_NUMBER = 4;
    private static final dx DEFAULT_INSTANCE;
    public static final int FORCE_FIELD_NUMBER = 9;
    public static final int GENERATE_TOKEN_FIELD_NUMBER = 8;
    public static final int LASTSYSTEMMESSAGE_FIELD_NUMBER = 5;
    public static final int LASTTILESREFRESH_FIELD_NUMBER = 6;
    public static final int NICKNAME_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<dx> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int REASON_FIELD_NUMBER = 7;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int configVersion_;
    private boolean generateToken_;
    private int lastSystemMessage_;
    private long lastTilesRefresh_;
    private String username_ = "";
    private String password_ = "";
    private String nickname_ = "";
    private String reason_ = "normal";
    private boolean force_ = true;

    static {
        dx dxVar = new dx();
        DEFAULT_INSTANCE = dxVar;
        com.google.v.du.registerDefaultInstance(dx.class, dxVar);
    }

    private dx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigVersion() {
        this.bitField0_ &= -9;
        this.configVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForce() {
        this.bitField0_ &= -257;
        this.force_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGenerateToken() {
        this.bitField0_ &= -129;
        this.generateToken_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastSystemMessage() {
        this.bitField0_ &= -17;
        this.lastSystemMessage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastTilesRefresh() {
        this.bitField0_ &= -33;
        this.lastTilesRefresh_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.bitField0_ &= -5;
        this.nickname_ = getDefaultInstance().getNickname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.bitField0_ &= -3;
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.bitField0_ &= -65;
        this.reason_ = getDefaultInstance().getReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -2;
        this.username_ = getDefaultInstance().getUsername();
    }

    public static dx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dw newBuilder() {
        return (dw) DEFAULT_INSTANCE.createBuilder();
    }

    public static dx parseDelimitedFrom(InputStream inputStream) {
        return (dx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dx parseFrom(com.google.v.v vVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigVersion(int i2) {
        this.bitField0_ |= 8;
        this.configVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForce(boolean z) {
        this.bitField0_ |= 256;
        this.force_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenerateToken(boolean z) {
        this.bitField0_ |= 128;
        this.generateToken_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSystemMessage(int i2) {
        this.bitField0_ |= 16;
        this.lastSystemMessage_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastTilesRefresh(long j2) {
        this.bitField0_ |= 32;
        this.lastTilesRefresh_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.nickname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(com.google.v.v vVar) {
        this.nickname_ = vVar.u();
        this.bitField0_ |= 4;
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
    public void setReason(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.reason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonBytes(com.google.v.v vVar) {
        this.reason_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(com.google.v.v vVar) {
        this.username_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b", new Object[]{"bitField0_", "username_", "password_", "nickname_", "configVersion_", "lastSystemMessage_", "lastTilesRefresh_", "reason_", "generateToken_", "force_"});
        }
        if (iOrdinal == 3) {
            return new dx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getConfigVersion() {
        return this.configVersion_;
    }

    public boolean getForce() {
        return this.force_;
    }

    public boolean getGenerateToken() {
        return this.generateToken_;
    }

    @Deprecated
    public int getLastSystemMessage() {
        return this.lastSystemMessage_;
    }

    @Deprecated
    public long getLastTilesRefresh() {
        return this.lastTilesRefresh_;
    }

    @Deprecated
    public String getNickname() {
        return this.nickname_;
    }

    @Deprecated
    public com.google.v.v getNicknameBytes() {
        return com.google.v.v.s(this.nickname_);
    }

    public String getPassword() {
        return this.password_;
    }

    public com.google.v.v getPasswordBytes() {
        return com.google.v.v.s(this.password_);
    }

    public String getReason() {
        return this.reason_;
    }

    public com.google.v.v getReasonBytes() {
        return com.google.v.v.s(this.reason_);
    }

    public String getUsername() {
        return this.username_;
    }

    public com.google.v.v getUsernameBytes() {
        return com.google.v.v.s(this.username_);
    }

    public boolean hasConfigVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasForce() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasGenerateToken() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasLastSystemMessage() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasLastTilesRefresh() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasNickname() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPassword() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasReason() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dw newBuilder(dx dxVar) {
        return (dw) DEFAULT_INSTANCE.createBuilder(dxVar);
    }

    public static dx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dx parseFrom(com.google.v.z zVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dx parseFrom(InputStream inputStream) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dx parseFrom(ByteBuffer byteBuffer) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dx parseFrom(byte[] bArr) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
