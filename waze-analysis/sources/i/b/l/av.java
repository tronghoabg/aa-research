package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class av extends com.google.v.du<av, au> implements com.google.v.fj {
    public static final int ACCESSTOKENTYPE_FIELD_NUMBER = 10;
    public static final int CHANGE_EMAIL_TWO_FACTOR_AUTH_FIELD_NUMBER = 12;
    public static final int COMMUNITY_FIELD_NUMBER = 1;
    private static final av DEFAULT_INSTANCE;
    public static final int FIRST_NAME_FIELD_NUMBER = 5;
    public static final int FORCE_FIELD_NUMBER = 4;
    public static final int INITIAL_NOTIFICATIONS_PREFERENCES_FIELD_NUMBER = 8;
    public static final int LAST_NAME_FIELD_NUMBER = 6;
    public static final int MERGE_IF_FOUND_ANOTHER_USER_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<av> PARSER = null;
    public static final int SECRET_FIELD_NUMBER = 3;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int UID_ENABLED_FIELD_NUMBER = 9;
    public static final int USE_DEVICE_TYPE_FOR_GOOGLE_OAUTH_FIELD_NUMBER = 11;
    private int accessTokenType_;
    private int bitField0_;
    private bp changeEmailTwoFactorAuth_;
    private boolean force_;
    private bd initialNotificationsPreferences_;
    private boolean mergeIfFoundAnotherUser_;
    private boolean uidEnabled_;
    private boolean useDeviceTypeForGoogleOauth_;
    private String community_ = "";
    private String token_ = "";
    private String secret_ = "";
    private String firstName_ = "";
    private String lastName_ = "";

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        com.google.v.du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessTokenType() {
        this.bitField0_ &= -513;
        this.accessTokenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeEmailTwoFactorAuth() {
        this.changeEmailTwoFactorAuth_ = null;
        this.bitField0_ &= -2049;
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
    public void clearForce() {
        this.bitField0_ &= -9;
        this.force_ = false;
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
    public void clearMergeIfFoundAnotherUser() {
        this.bitField0_ &= -65;
        this.mergeIfFoundAnotherUser_ = false;
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

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChangeEmailTwoFactorAuth(bp bpVar) {
        Objects.requireNonNull(bpVar);
        bp bpVar2 = this.changeEmailTwoFactorAuth_;
        if (bpVar2 != null && bpVar2 != bp.getDefaultInstance()) {
            bo boVarNewBuilder = bp.newBuilder(bpVar2);
            boVarNewBuilder.mergeFrom((bo) bpVar);
            bpVar = boVarNewBuilder.buildPartial();
        }
        this.changeEmailTwoFactorAuth_ = bpVar;
        this.bitField0_ |= 2048;
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

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static av parseDelimitedFrom(InputStream inputStream) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(com.google.v.v vVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<av> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessTokenType(at atVar) {
        this.accessTokenType_ = atVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeEmailTwoFactorAuth(bp bpVar) {
        Objects.requireNonNull(bpVar);
        this.changeEmailTwoFactorAuth_ = bpVar;
        this.bitField0_ |= 2048;
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
    public void setForce(boolean z) {
        this.bitField0_ |= 8;
        this.force_ = z;
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
    public void setMergeIfFoundAnotherUser(boolean z) {
        this.bitField0_ |= 64;
        this.mergeIfFoundAnotherUser_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဉ\u0007\tဇ\b\n᠌\t\u000bဇ\n\fဉ\u000b", new Object[]{"bitField0_", "community_", "token_", "secret_", "force_", "firstName_", "lastName_", "mergeIfFoundAnotherUser_", "initialNotificationsPreferences_", "uidEnabled_", "accessTokenType_", e.f48665l, "useDeviceTypeForGoogleOauth_", "changeEmailTwoFactorAuth_"});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<av> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (av.class) {
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

    public bp getChangeEmailTwoFactorAuth() {
        bp bpVar = this.changeEmailTwoFactorAuth_;
        return bpVar == null ? bp.getDefaultInstance() : bpVar;
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

    public boolean getForce() {
        return this.force_;
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

    public boolean getMergeIfFoundAnotherUser() {
        return this.mergeIfFoundAnotherUser_;
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

    public boolean hasChangeEmailTwoFactorAuth() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFirstName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasForce() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasInitialNotificationsPreferences() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasLastName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMergeIfFoundAnotherUser() {
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

    public static au newBuilder(av avVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(avVar);
    }

    public static av parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static av parseFrom(com.google.v.z zVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static av parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static av parseFrom(InputStream inputStream) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(ByteBuffer byteBuffer) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static av parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static av parseFrom(byte[] bArr) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static av parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
