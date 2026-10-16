package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bk extends com.google.v.du<bk, bj> implements com.google.v.fj {
    public static final int ACCESSTOKENTYPE_FIELD_NUMBER = 4;
    public static final int CHANGE_EMAIL_TWO_FACTOR_AUTH_FIELD_NUMBER = 6;
    public static final int COMMUNITY_FIELD_NUMBER = 1;
    private static final bk DEFAULT_INSTANCE;
    public static final int INITIAL_NOTIFICATIONS_PREFERENCES_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bk> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int USE_DEVICE_TYPE_FOR_GOOGLE_OAUTH_FIELD_NUMBER = 5;
    private int accessTokenType_;
    private int bitField0_;
    private bp changeEmailTwoFactorAuth_;
    private bd initialNotificationsPreferences_;
    private boolean useDeviceTypeForGoogleOauth_;
    private String community_ = "";
    private String token_ = "";

    static {
        bk bkVar = new bk();
        DEFAULT_INSTANCE = bkVar;
        com.google.v.du.registerDefaultInstance(bk.class, bkVar);
    }

    private bk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessTokenType() {
        this.bitField0_ &= -9;
        this.accessTokenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeEmailTwoFactorAuth() {
        this.changeEmailTwoFactorAuth_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.bitField0_ &= -2;
        this.community_ = getDefaultInstance().getCommunity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitialNotificationsPreferences() {
        this.initialNotificationsPreferences_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -3;
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseDeviceTypeForGoogleOauth() {
        this.bitField0_ &= -17;
        this.useDeviceTypeForGoogleOauth_ = false;
    }

    public static bk getDefaultInstance() {
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
        this.bitField0_ |= 32;
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
        this.bitField0_ |= 4;
    }

    public static bj newBuilder() {
        return (bj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bk parseDelimitedFrom(InputStream inputStream) {
        return (bk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bk parseFrom(com.google.v.v vVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessTokenType(at atVar) {
        this.accessTokenType_ = atVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeEmailTwoFactorAuth(bp bpVar) {
        Objects.requireNonNull(bpVar);
        this.changeEmailTwoFactorAuth_ = bpVar;
        this.bitField0_ |= 32;
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
    public void setInitialNotificationsPreferences(bd bdVar) {
        Objects.requireNonNull(bdVar);
        this.initialNotificationsPreferences_ = bdVar;
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
    public void setUseDeviceTypeForGoogleOauth(boolean z) {
        this.bitField0_ |= 16;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "community_", "token_", "initialNotificationsPreferences_", "accessTokenType_", e.f48665l, "useDeviceTypeForGoogleOauth_", "changeEmailTwoFactorAuth_"});
        }
        if (iOrdinal == 3) {
            return new bk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bk.class) {
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

    public bd getInitialNotificationsPreferences() {
        bd bdVar = this.initialNotificationsPreferences_;
        return bdVar == null ? bd.getDefaultInstance() : bdVar;
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public boolean getUseDeviceTypeForGoogleOauth() {
        return this.useDeviceTypeForGoogleOauth_;
    }

    public boolean hasAccessTokenType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasChangeEmailTwoFactorAuth() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInitialNotificationsPreferences() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUseDeviceTypeForGoogleOauth() {
        return (this.bitField0_ & 16) != 0;
    }

    public static bj newBuilder(bk bkVar) {
        return (bj) DEFAULT_INSTANCE.createBuilder(bkVar);
    }

    public static bk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bk parseFrom(com.google.v.z zVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bk parseFrom(InputStream inputStream) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bk parseFrom(ByteBuffer byteBuffer) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bk parseFrom(byte[] bArr) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
