package i.b.u;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import i.b.af;
import i.b.ah;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aa extends du<aa, y> implements fj {
    private static final aa DEFAULT_INSTANCE;
    public static final int EXTRA_VERIFICATION_REQUIRED_FIELD_NUMBER = 7;
    public static final int FAILURE_TYPE_FIELD_NUMBER = 2;
    private static volatile fo<aa> PARSER = null;
    public static final int PIN_CODE_NUM_OF_DIGITS_FIELD_NUMBER = 8;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 5;
    public static final int UUID_FIELD_NUMBER = 4;
    public static final int VERIFICATION_TOKEN_FIELD_NUMBER = 6;
    public static final int VERIFICATION_URL_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean extraVerificationRequired_;
    private int failureType_;
    private int pinCodeNumOfDigits_;
    private ah status_;
    private long userId_;
    private String verificationUrl_ = "";
    private String uuid_ = "";
    private String verificationToken_ = "";

    static {
        aa aaVar = new aa();
        DEFAULT_INSTANCE = aaVar;
        du.registerDefaultInstance(aa.class, aaVar);
    }

    private aa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraVerificationRequired() {
        this.bitField0_ &= -65;
        this.extraVerificationRequired_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureType() {
        this.bitField0_ &= -3;
        this.failureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinCodeNumOfDigits() {
        this.bitField0_ &= -129;
        this.pinCodeNumOfDigits_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -17;
        this.userId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.bitField0_ &= -9;
        this.uuid_ = getDefaultInstance().getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerificationToken() {
        this.bitField0_ &= -33;
        this.verificationToken_ = getDefaultInstance().getVerificationToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerificationUrl() {
        this.bitField0_ &= -5;
        this.verificationUrl_ = getDefaultInstance().getVerificationUrl();
    }

    public static aa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != ah.getDefaultInstance()) {
            af afVarNewBuilder = ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    public static y newBuilder() {
        return (y) DEFAULT_INSTANCE.createBuilder();
    }

    public static aa parseDelimitedFrom(InputStream inputStream) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(com.google.v.v vVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraVerificationRequired(boolean z) {
        this.bitField0_ |= 64;
        this.extraVerificationRequired_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureType(z zVar) {
        this.failureType_ = zVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinCodeNumOfDigits(int i2) {
        this.bitField0_ |= 128;
        this.pinCodeNumOfDigits_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 16;
        this.userId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.uuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuidBytes(com.google.v.v vVar) {
        this.uuid_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.verificationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationTokenBytes(com.google.v.v vVar) {
        this.verificationToken_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.verificationUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationUrlBytes(com.google.v.v vVar) {
        this.verificationUrl_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"bitField0_", "status_", "failureType_", h.f49313d, "verificationUrl_", "uuid_", "userId_", "verificationToken_", "extraVerificationRequired_", "pinCodeNumOfDigits_"});
        }
        if (iOrdinal == 3) {
            return new aa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new y(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getExtraVerificationRequired() {
        return this.extraVerificationRequired_;
    }

    public z getFailureType() {
        z zVarA = z.a(this.failureType_);
        return zVarA == null ? z.INVALID_LOCALE : zVarA;
    }

    public int getPinCodeNumOfDigits() {
        return this.pinCodeNumOfDigits_;
    }

    public ah getStatus() {
        ah ahVar = this.status_;
        return ahVar == null ? ah.getDefaultInstance() : ahVar;
    }

    public long getUserId() {
        return this.userId_;
    }

    public String getUuid() {
        return this.uuid_;
    }

    public com.google.v.v getUuidBytes() {
        return com.google.v.v.s(this.uuid_);
    }

    public String getVerificationToken() {
        return this.verificationToken_;
    }

    public com.google.v.v getVerificationTokenBytes() {
        return com.google.v.v.s(this.verificationToken_);
    }

    public String getVerificationUrl() {
        return this.verificationUrl_;
    }

    public com.google.v.v getVerificationUrlBytes() {
        return com.google.v.v.s(this.verificationUrl_);
    }

    public boolean hasExtraVerificationRequired() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFailureType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPinCodeNumOfDigits() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUuid() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVerificationToken() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasVerificationUrl() {
        return (this.bitField0_ & 4) != 0;
    }

    public static y newBuilder(aa aaVar) {
        return (y) DEFAULT_INSTANCE.createBuilder(aaVar);
    }

    public static aa parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(com.google.v.v vVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aa parseFrom(com.google.v.z zVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aa parseFrom(com.google.v.z zVar, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aa parseFrom(InputStream inputStream) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aa parseFrom(InputStream inputStream, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aa parseFrom(ByteBuffer byteBuffer) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aa parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aa parseFrom(byte[] bArr) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aa parseFrom(byte[] bArr, de deVar) {
        return (aa) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
