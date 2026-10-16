package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class alh extends com.google.v.du<alh, alg> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int CONSENT_VERSION_FIELD_NUMBER = 6;
    private static final alh DEFAULT_INSTANCE;
    public static final int EXISTING_CONSENT_FIELD_NUMBER = 2;
    public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 4;
    public static final int FLOW_FIELD_NUMBER = 3;
    public static final int IS_ISV_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<alh> PARSER = null;
    public static final int PARTNER_APP_ID_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private boolean existingConsent_;
    private int flow_;
    private boolean isIsv_;
    private String partnerAppId_ = "";
    private String externalTripToken_ = "";
    private String consentVersion_ = "";

    static {
        alh alhVar = new alh();
        DEFAULT_INSTANCE = alhVar;
        com.google.v.du.registerDefaultInstance(alh.class, alhVar);
    }

    private alh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsentVersion() {
        this.consentVersion_ = getDefaultInstance().getConsentVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExistingConsent() {
        this.bitField0_ &= -2;
        this.existingConsent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalTripToken() {
        this.externalTripToken_ = getDefaultInstance().getExternalTripToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlow() {
        this.flow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsIsv() {
        this.bitField0_ &= -3;
        this.isIsv_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerAppId() {
        this.partnerAppId_ = getDefaultInstance().getPartnerAppId();
    }

    public static alh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static alg newBuilder() {
        return (alg) DEFAULT_INSTANCE.createBuilder();
    }

    public static alh parseDelimitedFrom(InputStream inputStream) {
        return (alh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alh parseFrom(com.google.v.v vVar) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<alh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(alf alfVar) {
        this.action_ = alfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsentVersion(String str) {
        Objects.requireNonNull(str);
        this.consentVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsentVersionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.consentVersion_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExistingConsent(boolean z) {
        this.bitField0_ |= 1;
        this.existingConsent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalTripToken(String str) {
        Objects.requireNonNull(str);
        this.externalTripToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalTripTokenBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.externalTripToken_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlow(ale aleVar) {
        this.flow_ = aleVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowValue(int i2) {
        this.flow_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsIsv(boolean z) {
        this.bitField0_ |= 2;
        this.isIsv_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerAppId(String str) {
        Objects.requireNonNull(str);
        this.partnerAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerAppIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.partnerAppId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဇ\u0000\u0003\f\u0004Ȉ\u0005\f\u0006Ȉ\u0007ဇ\u0001", new Object[]{"bitField0_", "partnerAppId_", "existingConsent_", "flow_", "externalTripToken_", "action_", "consentVersion_", "isIsv_"});
        }
        if (iOrdinal == 3) {
            return new alh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new alg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<alh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (alh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public alf getAction() {
        alf alfVar;
        switch (this.action_) {
            case 0:
                alfVar = alf.ACTION_UNSPECIFIED;
                break;
            case 1:
                alfVar = alf.ALLOW;
                break;
            case 2:
                alfVar = alf.DO_NOT_ALLOW;
                break;
            case 3:
                alfVar = alf.PRIVACY_POLICY;
                break;
            case 4:
                alfVar = alf.LEARN_MORE;
                break;
            case 5:
                alfVar = alf.CLOSE;
                break;
            case 6:
                alfVar = alf.SESSION_ENDED;
                break;
            case 7:
                alfVar = alf.ISV_PRIVACY_POLICY;
                break;
            default:
                alfVar = null;
                break;
        }
        return alfVar == null ? alf.UNRECOGNIZED : alfVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getConsentVersion() {
        return this.consentVersion_;
    }

    public com.google.v.v getConsentVersionBytes() {
        return com.google.v.v.s(this.consentVersion_);
    }

    public boolean getExistingConsent() {
        return this.existingConsent_;
    }

    public String getExternalTripToken() {
        return this.externalTripToken_;
    }

    public com.google.v.v getExternalTripTokenBytes() {
        return com.google.v.v.s(this.externalTripToken_);
    }

    public ale getFlow() {
        ale aleVarA = ale.a(this.flow_);
        return aleVarA == null ? ale.UNRECOGNIZED : aleVarA;
    }

    public int getFlowValue() {
        return this.flow_;
    }

    public boolean getIsIsv() {
        return this.isIsv_;
    }

    public String getPartnerAppId() {
        return this.partnerAppId_;
    }

    public com.google.v.v getPartnerAppIdBytes() {
        return com.google.v.v.s(this.partnerAppId_);
    }

    public boolean hasExistingConsent() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsIsv() {
        return (this.bitField0_ & 2) != 0;
    }

    public static alg newBuilder(alh alhVar) {
        return (alg) DEFAULT_INSTANCE.createBuilder(alhVar);
    }

    public static alh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static alh parseFrom(com.google.v.z zVar) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static alh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static alh parseFrom(InputStream inputStream) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alh parseFrom(ByteBuffer byteBuffer) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static alh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static alh parseFrom(byte[] bArr) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static alh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (alh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
