package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class alq extends com.google.v.du<alq, alo> implements com.google.v.fj {
    private static final alq DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 3;
    public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<alq> PARSER = null;
    public static final int PARTNER_APP_ID_FIELD_NUMBER = 5;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private long errorCode_;
    private String externalTripToken_ = "";
    private String partnerAppId_ = "";
    private int requestType_;
    private boolean success_;

    static {
        alq alqVar = new alq();
        DEFAULT_INSTANCE = alqVar;
        com.google.v.du.registerDefaultInstance(alq.class, alqVar);
    }

    private alq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -3;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalTripToken() {
        this.externalTripToken_ = getDefaultInstance().getExternalTripToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerAppId() {
        this.partnerAppId_ = getDefaultInstance().getPartnerAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestType() {
        this.requestType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.bitField0_ &= -2;
        this.success_ = false;
    }

    public static alq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static alo newBuilder() {
        return (alo) DEFAULT_INSTANCE.createBuilder();
    }

    public static alq parseDelimitedFrom(InputStream inputStream) {
        return (alq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alq parseFrom(com.google.v.v vVar) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<alq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 2;
        this.errorCode_ = j2;
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
    public void setPartnerAppId(String str) {
        Objects.requireNonNull(str);
        this.partnerAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerAppIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.partnerAppId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestType(alp alpVar) {
        this.requestType_ = alpVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeValue(int i2) {
        this.requestType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.bitField0_ |= 1;
        this.success_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003ဂ\u0001\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "requestType_", "success_", "errorCode_", "externalTripToken_", "partnerAppId_"});
        }
        if (iOrdinal == 3) {
            return new alq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new alo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<alq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (alq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public String getExternalTripToken() {
        return this.externalTripToken_;
    }

    public com.google.v.v getExternalTripTokenBytes() {
        return com.google.v.v.s(this.externalTripToken_);
    }

    public String getPartnerAppId() {
        return this.partnerAppId_;
    }

    public com.google.v.v getPartnerAppIdBytes() {
        return com.google.v.v.s(this.partnerAppId_);
    }

    public alp getRequestType() {
        int i2 = this.requestType_;
        alp alpVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : alp.CONSENT_DECLINED : alp.NAV_CONNECT_FAILED : alp.NAVIGATION_STOPPED : alp.REPORT_TRIP_PROGRESS : alp.VALIDATE_ACTION_TOKEN : alp.REQUEST_TYPE_UNSPECIFIED;
        return alpVar == null ? alp.UNRECOGNIZED : alpVar;
    }

    public int getRequestTypeValue() {
        return this.requestType_;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public static alo newBuilder(alq alqVar) {
        return (alo) DEFAULT_INSTANCE.createBuilder(alqVar);
    }

    public static alq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static alq parseFrom(com.google.v.z zVar) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static alq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static alq parseFrom(InputStream inputStream) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alq parseFrom(ByteBuffer byteBuffer) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static alq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static alq parseFrom(byte[] bArr) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static alq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (alq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
