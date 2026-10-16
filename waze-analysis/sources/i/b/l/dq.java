package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dq extends com.google.v.du<dq, dp> implements com.google.v.fj {
    private static final dq DEFAULT_INSTANCE;
    public static final int GET_PROFILE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<dq> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean getProfile_;
    private String username_ = "";
    private String password_ = "";

    static {
        dq dqVar = new dq();
        DEFAULT_INSTANCE = dqVar;
        com.google.v.du.registerDefaultInstance(dq.class, dqVar);
    }

    private dq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetProfile() {
        this.bitField0_ &= -5;
        this.getProfile_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.bitField0_ &= -3;
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -2;
        this.username_ = getDefaultInstance().getUsername();
    }

    public static dq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dp newBuilder() {
        return (dp) DEFAULT_INSTANCE.createBuilder();
    }

    public static dq parseDelimitedFrom(InputStream inputStream) {
        return (dq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dq parseFrom(com.google.v.v vVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetProfile(boolean z) {
        this.bitField0_ |= 4;
        this.getProfile_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "username_", "password_", "getProfile_"});
        }
        if (iOrdinal == 3) {
            return new dq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getGetProfile() {
        return this.getProfile_;
    }

    public String getPassword() {
        return this.password_;
    }

    public com.google.v.v getPasswordBytes() {
        return com.google.v.v.s(this.password_);
    }

    public String getUsername() {
        return this.username_;
    }

    public com.google.v.v getUsernameBytes() {
        return com.google.v.v.s(this.username_);
    }

    public boolean hasGetProfile() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPassword() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dp newBuilder(dq dqVar) {
        return (dp) DEFAULT_INSTANCE.createBuilder(dqVar);
    }

    public static dq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dq parseFrom(com.google.v.z zVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dq parseFrom(InputStream inputStream) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dq parseFrom(ByteBuffer byteBuffer) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dq parseFrom(byte[] bArr) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
