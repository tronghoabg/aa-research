package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aln extends com.google.v.du<aln, all> implements com.google.v.fj {
    private static final aln DEFAULT_INSTANCE;
    public static final int EXTERNAL_TRIP_TOKEN_FIELD_NUMBER = 2;
    public static final int IS_ISV_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<aln> PARSER = null;
    public static final int PARTNER_APP_ID_FIELD_NUMBER = 1;
    public static final int SKIP_REASON_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isIsv_;
    private int skipReason_;
    private String partnerAppId_ = "";
    private String externalTripToken_ = "";

    static {
        aln alnVar = new aln();
        DEFAULT_INSTANCE = alnVar;
        com.google.v.du.registerDefaultInstance(aln.class, alnVar);
    }

    private aln() {
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
    public void clearSkipReason() {
        this.skipReason_ = 0;
    }

    public static aln getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static all newBuilder() {
        return (all) DEFAULT_INSTANCE.createBuilder();
    }

    public static aln parseDelimitedFrom(InputStream inputStream) {
        return (aln) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aln parseFrom(com.google.v.v vVar) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aln> parser() {
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
    public void setSkipReason(alm almVar) {
        this.skipReason_ = almVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipReasonValue(int i2) {
        this.skipReason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004ဇ\u0000", new Object[]{"bitField0_", "partnerAppId_", "externalTripToken_", "skipReason_", "isIsv_"});
        }
        if (iOrdinal == 3) {
            return new aln();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new all(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aln> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aln.class) {
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

    public alm getSkipReason() {
        int i2 = this.skipReason_;
        alm almVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : alm.UNKNOWN : alm.EXISTING_CONSENT : alm.SKIP_REASON_UNSPECIFIED;
        return almVar == null ? alm.UNRECOGNIZED : almVar;
    }

    public int getSkipReasonValue() {
        return this.skipReason_;
    }

    public boolean hasIsIsv() {
        return (this.bitField0_ & 1) != 0;
    }

    public static all newBuilder(aln alnVar) {
        return (all) DEFAULT_INSTANCE.createBuilder(alnVar);
    }

    public static aln parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aln) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aln parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aln parseFrom(com.google.v.z zVar) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aln parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aln parseFrom(InputStream inputStream) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aln parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aln parseFrom(ByteBuffer byteBuffer) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aln parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aln parseFrom(byte[] bArr) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aln parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
