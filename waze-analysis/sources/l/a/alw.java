package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class alw extends com.google.v.du<alw, alu> implements com.google.v.fj {
    private static final alw DEFAULT_INSTANCE;
    public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 2;
    public static final int IS_ISV_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<alw> PARSER = null;
    public static final int PARTNER_APP_ID_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isIsv_;
    private int reason_;
    private String partnerAppId_ = "";
    private String externalTripToken_ = "";

    static {
        alw alwVar = new alw();
        DEFAULT_INSTANCE = alwVar;
        com.google.v.du.registerDefaultInstance(alw.class, alwVar);
    }

    private alw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalTripToken() {
        this.externalTripToken_ = getDefaultInstance().getExternalTripToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsIsv() {
        this.bitField0_ &= -2;
        this.isIsv_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerAppId() {
        this.partnerAppId_ = getDefaultInstance().getPartnerAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static alw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static alu newBuilder() {
        return (alu) DEFAULT_INSTANCE.createBuilder();
    }

    public static alw parseDelimitedFrom(InputStream inputStream) {
        return (alw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alw parseFrom(com.google.v.v vVar) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<alw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setIsIsv(boolean z) {
        this.bitField0_ |= 1;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(alv alvVar) {
        this.reason_ = alvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004ဇ\u0000", new Object[]{"bitField0_", "partnerAppId_", "externalTripToken_", "reason_", "isIsv_"});
        }
        if (iOrdinal == 3) {
            return new alw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new alu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<alw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (alw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getExternalTripToken() {
        return this.externalTripToken_;
    }

    public com.google.v.v getExternalTripTokenBytes() {
        return com.google.v.v.s(this.externalTripToken_);
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

    public alv getReason() {
        alv alvVar;
        switch (this.reason_) {
            case 0:
                alvVar = alv.REASON_UNSPECIFIED;
                break;
            case 1:
                alvVar = alv.REACHED_DESTINATION;
                break;
            case 2:
                alvVar = alv.NEW_DESTINATION;
                break;
            case 3:
                alvVar = alv.NAVIGATION_STOPPED;
                break;
            case 4:
                alvVar = alv.APP_TERMINATED;
                break;
            case 5:
                alvVar = alv.PARKED;
                break;
            case 6:
                alvVar = alv.UNSUPPORTED_DISPLAY_TYPE;
                break;
            case 7:
                alvVar = alv.DESTINATION_NOT_FOUND;
                break;
            case 8:
                alvVar = alv.NAVIGATION_FAILED;
                break;
            case 9:
                alvVar = alv.NAVIGATION_CANCELLED;
                break;
            case 10:
                alvVar = alv.REPORT_TRIP_PERMISSION_DENIED;
                break;
            default:
                alvVar = null;
                break;
        }
        return alvVar == null ? alv.UNRECOGNIZED : alvVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasIsIsv() {
        return (this.bitField0_ & 1) != 0;
    }

    public static alu newBuilder(alw alwVar) {
        return (alu) DEFAULT_INSTANCE.createBuilder(alwVar);
    }

    public static alw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static alw parseFrom(com.google.v.z zVar) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static alw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static alw parseFrom(InputStream inputStream) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alw parseFrom(ByteBuffer byteBuffer) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static alw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static alw parseFrom(byte[] bArr) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static alw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (alw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
