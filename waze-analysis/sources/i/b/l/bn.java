package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bn extends com.google.v.du<bn, bl> implements com.google.v.fj {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final bn DEFAULT_INSTANCE;
    public static final int INTERNALUSERNAME_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bn> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 3;
    public static final int TOKEN_FIELD_NUMBER = 5;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean internalUserName_;
    private int code_ = 1;
    private String userName_ = "";
    private String password_ = "";
    private String token_ = "";

    static {
        bn bnVar = new bn();
        DEFAULT_INSTANCE = bnVar;
        com.google.v.du.registerDefaultInstance(bn.class, bnVar);
    }

    private bn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.bitField0_ &= -2;
        this.code_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalUserName() {
        this.bitField0_ &= -9;
        this.internalUserName_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.bitField0_ &= -5;
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -17;
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserName() {
        this.bitField0_ &= -3;
        this.userName_ = getDefaultInstance().getUserName();
    }

    public static bn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bl newBuilder() {
        return (bl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bn parseDelimitedFrom(InputStream inputStream) {
        return (bn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bn parseFrom(com.google.v.v vVar) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(bm bmVar) {
        this.code_ = bmVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalUserName(boolean z) {
        this.bitField0_ |= 8;
        this.internalUserName_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.password_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(com.google.v.v vVar) {
        this.password_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(com.google.v.v vVar) {
        this.token_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.userName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserNameBytes(com.google.v.v vVar) {
        this.userName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "code_", e.p, "userName_", "password_", "internalUserName_", "token_"});
        }
        if (iOrdinal == 3) {
            return new bn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bm getCode() {
        bm bmVarA = bm.a(this.code_);
        return bmVarA == null ? bm.SUCCESS : bmVarA;
    }

    public boolean getInternalUserName() {
        return this.internalUserName_;
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

    public String getUserName() {
        return this.userName_;
    }

    public com.google.v.v getUserNameBytes() {
        return com.google.v.v.s(this.userName_);
    }

    public boolean hasCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInternalUserName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPassword() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUserName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bl newBuilder(bn bnVar) {
        return (bl) DEFAULT_INSTANCE.createBuilder(bnVar);
    }

    public static bn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bn parseFrom(com.google.v.z zVar) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bn parseFrom(InputStream inputStream) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bn parseFrom(ByteBuffer byteBuffer) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bn parseFrom(byte[] bArr) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
