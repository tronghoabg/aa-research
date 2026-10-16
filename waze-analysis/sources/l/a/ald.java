package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ald extends com.google.v.du<ald, alc> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int BUTTON_PACK_ENABLED_FIELD_NUMBER = 4;
    private static final ald DEFAULT_INSTANCE;
    public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 2;
    public static final int IS_ISV_FIELD_NUMBER = 6;
    public static final int MISSING_PENDING_INTENT_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<ald> PARSER = null;
    public static final int PARTNER_APP_ID_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private boolean buttonPackEnabled_;
    private boolean isIsv_;
    private boolean missingPendingIntent_;
    private String partnerAppId_ = "";
    private String externalTripToken_ = "";

    static {
        ald aldVar = new ald();
        DEFAULT_INSTANCE = aldVar;
        com.google.v.du.registerDefaultInstance(ald.class, aldVar);
    }

    private ald() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonPackEnabled() {
        this.bitField0_ &= -2;
        this.buttonPackEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalTripToken() {
        this.externalTripToken_ = getDefaultInstance().getExternalTripToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsIsv() {
        this.bitField0_ &= -5;
        this.isIsv_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMissingPendingIntent() {
        this.bitField0_ &= -3;
        this.missingPendingIntent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerAppId() {
        this.partnerAppId_ = getDefaultInstance().getPartnerAppId();
    }

    public static ald getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static alc newBuilder() {
        return (alc) DEFAULT_INSTANCE.createBuilder();
    }

    public static ald parseDelimitedFrom(InputStream inputStream) {
        return (ald) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ald parseFrom(com.google.v.v vVar) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ald> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(alb albVar) {
        this.action_ = albVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonPackEnabled(boolean z) {
        this.bitField0_ |= 1;
        this.buttonPackEnabled_ = z;
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
        this.bitField0_ |= 4;
        this.isIsv_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMissingPendingIntent(boolean z) {
        this.bitField0_ |= 2;
        this.missingPendingIntent_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004ဇ\u0000\u0005ဇ\u0001\u0006ဇ\u0002", new Object[]{"bitField0_", "partnerAppId_", "externalTripToken_", "action_", "buttonPackEnabled_", "missingPendingIntent_", "isIsv_"});
        }
        if (iOrdinal == 3) {
            return new ald();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new alc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ald> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ald.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public alb getAction() {
        int i2 = this.action_;
        alb albVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : alb.OPEN_MID_SESSION_CONSENT : alb.SWITCH_APP : alb.ACTION_UNSPECIFIED;
        return albVar == null ? alb.UNRECOGNIZED : albVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getButtonPackEnabled() {
        return this.buttonPackEnabled_;
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

    public boolean getMissingPendingIntent() {
        return this.missingPendingIntent_;
    }

    public String getPartnerAppId() {
        return this.partnerAppId_;
    }

    public com.google.v.v getPartnerAppIdBytes() {
        return com.google.v.v.s(this.partnerAppId_);
    }

    public boolean hasButtonPackEnabled() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsIsv() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMissingPendingIntent() {
        return (this.bitField0_ & 2) != 0;
    }

    public static alc newBuilder(ald aldVar) {
        return (alc) DEFAULT_INSTANCE.createBuilder(aldVar);
    }

    public static ald parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ald) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ald parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ald parseFrom(com.google.v.z zVar) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ald parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ald parseFrom(InputStream inputStream) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ald parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ald parseFrom(ByteBuffer byteBuffer) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ald parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ald parseFrom(byte[] bArr) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ald parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ald) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
