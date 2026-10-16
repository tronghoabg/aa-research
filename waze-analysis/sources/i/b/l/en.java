package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class en extends com.google.v.du<en, em> implements com.google.v.fj {
    public static final int AUTH_TOKEN_FIELD_NUMBER = 7;
    public static final int COMMUNITY_NAME_FIELD_NUMBER = 5;
    private static final en DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MAX_PROTOCOL_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<en> PARSER = null;
    public static final int SECRET_KEY_FIELD_NUMBER = 2;
    public static final int SERVERVERSION_FIELD_NUMBER = 4;
    public static final int SESSION_TOKEN_FIELD_NUMBER = 8;
    private int bitField0_;
    private long id_;
    private int maxProtocol_;
    private String secretKey_ = "";
    private String serverVersion_ = "";
    private String communityName_ = "";
    private String email_ = "";
    private String authToken_ = "";
    private String sessionToken_ = "";

    static {
        en enVar = new en();
        DEFAULT_INSTANCE = enVar;
        com.google.v.du.registerDefaultInstance(en.class, enVar);
    }

    private en() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthToken() {
        this.bitField0_ &= -65;
        this.authToken_ = getDefaultInstance().getAuthToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunityName() {
        this.bitField0_ &= -17;
        this.communityName_ = getDefaultInstance().getCommunityName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -33;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxProtocol() {
        this.bitField0_ &= -5;
        this.maxProtocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecretKey() {
        this.bitField0_ &= -3;
        this.secretKey_ = getDefaultInstance().getSecretKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerVersion() {
        this.bitField0_ &= -9;
        this.serverVersion_ = getDefaultInstance().getServerVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionToken() {
        this.bitField0_ &= -129;
        this.sessionToken_ = getDefaultInstance().getSessionToken();
    }

    public static en getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static em newBuilder() {
        return (em) DEFAULT_INSTANCE.createBuilder();
    }

    public static en parseDelimitedFrom(InputStream inputStream) {
        return (en) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static en parseFrom(com.google.v.v vVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<en> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.authToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthTokenBytes(com.google.v.v vVar) {
        this.authToken_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.communityName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityNameBytes(com.google.v.v vVar) {
        this.communityName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxProtocol(int i2) {
        this.bitField0_ |= 4;
        this.maxProtocol_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.secretKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKeyBytes(com.google.v.v vVar) {
        this.secretKey_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.serverVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerVersionBytes(com.google.v.v vVar) {
        this.serverVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.sessionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionTokenBytes(com.google.v.v vVar) {
        this.sessionToken_ = vVar.u();
        this.bitField0_ |= 128;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"bitField0_", "id_", "secretKey_", "maxProtocol_", "serverVersion_", "communityName_", "email_", "authToken_", "sessionToken_"});
        }
        if (iOrdinal == 3) {
            return new en();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new em(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<en> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (en.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAuthToken() {
        return this.authToken_;
    }

    public com.google.v.v getAuthTokenBytes() {
        return com.google.v.v.s(this.authToken_);
    }

    public String getCommunityName() {
        return this.communityName_;
    }

    public com.google.v.v getCommunityNameBytes() {
        return com.google.v.v.s(this.communityName_);
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public long getId() {
        return this.id_;
    }

    public int getMaxProtocol() {
        return this.maxProtocol_;
    }

    public String getSecretKey() {
        return this.secretKey_;
    }

    public com.google.v.v getSecretKeyBytes() {
        return com.google.v.v.s(this.secretKey_);
    }

    public String getServerVersion() {
        return this.serverVersion_;
    }

    public com.google.v.v getServerVersionBytes() {
        return com.google.v.v.s(this.serverVersion_);
    }

    public String getSessionToken() {
        return this.sessionToken_;
    }

    public com.google.v.v getSessionTokenBytes() {
        return com.google.v.v.s(this.sessionToken_);
    }

    public boolean hasAuthToken() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCommunityName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMaxProtocol() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSecretKey() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasServerVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSessionToken() {
        return (this.bitField0_ & 128) != 0;
    }

    public static em newBuilder(en enVar) {
        return (em) DEFAULT_INSTANCE.createBuilder(enVar);
    }

    public static en parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (en) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static en parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static en parseFrom(com.google.v.z zVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static en parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static en parseFrom(InputStream inputStream) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static en parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static en parseFrom(ByteBuffer byteBuffer) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static en parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static en parseFrom(byte[] bArr) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static en parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
