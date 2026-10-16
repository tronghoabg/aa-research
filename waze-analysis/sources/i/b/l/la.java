package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class la extends com.google.v.du<la, kz> implements com.google.v.fj {
    private static final la DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<la> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 3;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private long userId_;
    private String username_ = "";
    private String password_ = "";
    private String token_ = "";

    static {
        la laVar = new la();
        DEFAULT_INSTANCE = laVar;
        com.google.v.du.registerDefaultInstance(la.class, laVar);
    }

    private la() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.bitField0_ &= -3;
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -5;
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -9;
        this.userId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -2;
        this.username_ = getDefaultInstance().getUsername();
    }

    public static la getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kz newBuilder() {
        return (kz) DEFAULT_INSTANCE.createBuilder();
    }

    public static la parseDelimitedFrom(InputStream inputStream) {
        return (la) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static la parseFrom(com.google.v.v vVar) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<la> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(com.google.v.v vVar) {
        this.token_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 8;
        this.userId_ = j2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "username_", "password_", "token_", "userId_"});
        }
        if (iOrdinal == 3) {
            return new la();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<la> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (la.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPassword() {
        return this.password_;
    }

    public com.google.v.v getPasswordBytes() {
        return com.google.v.v.s(this.password_);
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
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

    public boolean hasPassword() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kz newBuilder(la laVar) {
        return (kz) DEFAULT_INSTANCE.createBuilder(laVar);
    }

    public static la parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (la) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static la parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static la parseFrom(com.google.v.z zVar) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static la parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static la parseFrom(InputStream inputStream) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static la parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static la parseFrom(ByteBuffer byteBuffer) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static la parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static la parseFrom(byte[] bArr) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static la parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (la) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
