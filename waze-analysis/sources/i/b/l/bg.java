package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bg extends com.google.v.du<bg, be> implements com.google.v.fj {
    public static final int ACCESSTOKENTYPE_FIELD_NUMBER = 10;
    public static final int COMMUNITY_FIELD_NUMBER = 1;
    private static final bg DEFAULT_INSTANCE;
    public static final int FIRST_NAME_FIELD_NUMBER = 5;
    public static final int INITIAL_NOTIFICATIONS_PREFERENCES_FIELD_NUMBER = 8;
    public static final int LAST_NAME_FIELD_NUMBER = 6;
    public static final int MODE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bg> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 7;
    public static final int SECRET_FIELD_NUMBER = 3;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int UID_ENABLED_FIELD_NUMBER = 9;
    public static final int USE_DEVICE_TYPE_FOR_GOOGLE_OAUTH_FIELD_NUMBER = 11;
    private int accessTokenType_;
    private int bitField0_;
    private bd initialNotificationsPreferences_;
    private int mode_;
    private boolean uidEnabled_;
    private boolean useDeviceTypeForGoogleOauth_;
    private String community_ = "";
    private String token_ = "";
    private String secret_ = "";
    private String firstName_ = "";
    private String lastName_ = "";
    private String password_ = "";

    static {
        bg bgVar = new bg();
        DEFAULT_INSTANCE = bgVar;
        com.google.v.du.registerDefaultInstance(bg.class, bgVar);
    }

    private bg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessTokenType() {
        this.bitField0_ &= -513;
        this.accessTokenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.bitField0_ &= -2;
        this.community_ = getDefaultInstance().getCommunity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstName() {
        this.bitField0_ &= -17;
        this.firstName_ = getDefaultInstance().getFirstName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitialNotificationsPreferences() {
        this.initialNotificationsPreferences_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastName() {
        this.bitField0_ &= -33;
        this.lastName_ = getDefaultInstance().getLastName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.bitField0_ &= -9;
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.bitField0_ &= -65;
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecret() {
        this.bitField0_ &= -5;
        this.secret_ = getDefaultInstance().getSecret();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -3;
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUidEnabled() {
        this.bitField0_ &= -257;
        this.uidEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseDeviceTypeForGoogleOauth() {
        this.bitField0_ &= -1025;
        this.useDeviceTypeForGoogleOauth_ = false;
    }

    public static bg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInitialNotificationsPreferences(bd bdVar) {
        Objects.requireNonNull(bdVar);
        bd bdVar2 = this.initialNotificationsPreferences_;
        if (bdVar2 != null && bdVar2 != bd.getDefaultInstance()) {
            bc bcVarNewBuilder = bd.newBuilder(bdVar2);
            bcVarNewBuilder.mergeFrom((bc) bdVar);
            bdVar = bcVarNewBuilder.buildPartial();
        }
        this.initialNotificationsPreferences_ = bdVar;
        this.bitField0_ |= 128;
    }

    public static be newBuilder() {
        return (be) DEFAULT_INSTANCE.createBuilder();
    }

    public static bg parseDelimitedFrom(InputStream inputStream) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(com.google.v.v vVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessTokenType(at atVar) {
        this.accessTokenType_ = atVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.community_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityBytes(com.google.v.v vVar) {
        this.community_ = vVar.u();
        this.bitField0_ |= 1;
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
    public void setInitialNotificationsPreferences(bd bdVar) {
        Objects.requireNonNull(bdVar);
        this.initialNotificationsPreferences_ = bdVar;
        this.bitField0_ |= 128;
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
    public void setMode(bf bfVar) {
        this.mode_ = bfVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.password_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(com.google.v.v vVar) {
        this.password_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecret(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.secret_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretBytes(com.google.v.v vVar) {
        this.secret_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(com.google.v.v vVar) {
        this.token_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUidEnabled(boolean z) {
        this.bitField0_ |= 256;
        this.uidEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseDeviceTypeForGoogleOauth(boolean z) {
        this.bitField0_ |= 1024;
        this.useDeviceTypeForGoogleOauth_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007\tဇ\b\n᠌\t\u000bဇ\n", new Object[]{"bitField0_", "community_", "token_", "secret_", "mode_", e.o, "firstName_", "lastName_", "password_", "initialNotificationsPreferences_", "uidEnabled_", "accessTokenType_", e.f48665l, "useDeviceTypeForGoogleOauth_"});
        }
        if (iOrdinal == 3) {
            return new bg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new be(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public at getAccessTokenType() {
        at atVarA = at.a(this.accessTokenType_);
        return atVarA == null ? at.UNDEF : atVarA;
    }

    public String getCommunity() {
        return this.community_;
    }

    public com.google.v.v getCommunityBytes() {
        return com.google.v.v.s(this.community_);
    }

    public String getFirstName() {
        return this.firstName_;
    }

    public com.google.v.v getFirstNameBytes() {
        return com.google.v.v.s(this.firstName_);
    }

    public bd getInitialNotificationsPreferences() {
        bd bdVar = this.initialNotificationsPreferences_;
        return bdVar == null ? bd.getDefaultInstance() : bdVar;
    }

    public String getLastName() {
        return this.lastName_;
    }

    public com.google.v.v getLastNameBytes() {
        return com.google.v.v.s(this.lastName_);
    }

    public bf getMode() {
        bf bfVarA = bf.a(this.mode_);
        return bfVarA == null ? bf.UNKNOWN : bfVarA;
    }

    public String getPassword() {
        return this.password_;
    }

    public com.google.v.v getPasswordBytes() {
        return com.google.v.v.s(this.password_);
    }

    public String getSecret() {
        return this.secret_;
    }

    public com.google.v.v getSecretBytes() {
        return com.google.v.v.s(this.secret_);
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public boolean getUidEnabled() {
        return this.uidEnabled_;
    }

    public boolean getUseDeviceTypeForGoogleOauth() {
        return this.useDeviceTypeForGoogleOauth_;
    }

    public boolean hasAccessTokenType() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFirstName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasInitialNotificationsPreferences() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasLastName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPassword() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSecret() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUidEnabled() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasUseDeviceTypeForGoogleOauth() {
        return (this.bitField0_ & 1024) != 0;
    }

    public static be newBuilder(bg bgVar) {
        return (be) DEFAULT_INSTANCE.createBuilder(bgVar);
    }

    public static bg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bg parseFrom(com.google.v.z zVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bg parseFrom(InputStream inputStream) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(ByteBuffer byteBuffer) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bg parseFrom(byte[] bArr) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
