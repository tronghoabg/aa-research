package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class kc extends com.google.v.du<kc, kb> implements com.google.v.fj {
    public static final int ACCESSTOKENTYPE_FIELD_NUMBER = 3;
    public static final int COMMUNITY_FIELD_NUMBER = 1;
    private static final kc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kc> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int USE_DEVICE_TYPE_FOR_GOOGLE_OAUTH_FIELD_NUMBER = 4;
    private int accessTokenType_;
    private int bitField0_;
    private String community_ = "";
    private String token_ = "";
    private boolean useDeviceTypeForGoogleOauth_;

    static {
        kc kcVar = new kc();
        DEFAULT_INSTANCE = kcVar;
        com.google.v.du.registerDefaultInstance(kc.class, kcVar);
    }

    private kc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessTokenType() {
        this.bitField0_ &= -5;
        this.accessTokenType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.bitField0_ &= -2;
        this.community_ = getDefaultInstance().getCommunity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -3;
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseDeviceTypeForGoogleOauth() {
        this.bitField0_ &= -9;
        this.useDeviceTypeForGoogleOauth_ = false;
    }

    public static kc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kb newBuilder() {
        return (kb) DEFAULT_INSTANCE.createBuilder();
    }

    public static kc parseDelimitedFrom(InputStream inputStream) {
        return (kc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kc parseFrom(com.google.v.v vVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessTokenType(i.b.p.c cVar) {
        this.accessTokenType_ = cVar.getNumber();
        this.bitField0_ |= 4;
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
        this.bitField0_ |= 8;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "community_", "token_", "accessTokenType_", i.b.p.c.a(), "useDeviceTypeForGoogleOauth_"});
        }
        if (iOrdinal == 3) {
            return new kc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.p.c getAccessTokenType() {
        i.b.p.c cVarB = i.b.p.c.b(this.accessTokenType_);
        return cVarB == null ? i.b.p.c.UNDEF : cVarB;
    }

    public String getCommunity() {
        return this.community_;
    }

    public com.google.v.v getCommunityBytes() {
        return com.google.v.v.s(this.community_);
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
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUseDeviceTypeForGoogleOauth() {
        return (this.bitField0_ & 8) != 0;
    }

    public static kb newBuilder(kc kcVar) {
        return (kb) DEFAULT_INSTANCE.createBuilder(kcVar);
    }

    public static kc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kc parseFrom(com.google.v.z zVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kc parseFrom(InputStream inputStream) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kc parseFrom(ByteBuffer byteBuffer) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kc parseFrom(byte[] bArr) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
