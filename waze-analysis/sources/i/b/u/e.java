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
public final class e extends du<e, c> implements fj {
    private static final e DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 4;
    public static final int EMAIL_TYPE_FIELD_NUMBER = 5;
    public static final int FAILURE_TYPE_FIELD_NUMBER = 2;
    private static volatile fo<e> PARSER = null;
    public static final int REGISTRATION_TOKEN_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 3;
    public static final int UUID_FIELD_NUMBER = 6;
    private int bitField0_;
    private int emailType_;
    private int failureType_;
    private ah status_;
    private long userId_;
    private String email_ = "";
    private String uuid_ = "";
    private String registrationToken_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -9;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailType() {
        this.bitField0_ &= -17;
        this.emailType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureType() {
        this.bitField0_ &= -3;
        this.failureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegistrationToken() {
        this.bitField0_ &= -65;
        this.registrationToken_ = getDefaultInstance().getRegistrationToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -5;
        this.userId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.bitField0_ &= -33;
        this.uuid_ = getDefaultInstance().getUuid();
    }

    public static e getDefaultInstance() {
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

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(com.google.v.v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailType(i iVar) {
        this.emailType_ = iVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureType(d dVar) {
        this.failureType_ = dVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegistrationToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.registrationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegistrationTokenBytes(com.google.v.v vVar) {
        this.registrationToken_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 4;
        this.userId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.uuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuidBytes(com.google.v.v vVar) {
        this.uuid_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "status_", "failureType_", h.f49311b, "userId_", "email_", "emailType_", h.f49310a, "uuid_", "registrationToken_"});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public i getEmailType() {
        i iVarA = i.a(this.emailType_);
        return iVarA == null ? i.EMAIL_TYPE_UNKNOWN : iVarA;
    }

    public d getFailureType() {
        d dVarA = d.a(this.failureType_);
        return dVarA == null ? d.INVALID_TOKEN : dVarA;
    }

    public String getRegistrationToken() {
        return this.registrationToken_;
    }

    public com.google.v.v getRegistrationTokenBytes() {
        return com.google.v.v.s(this.registrationToken_);
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

    public boolean hasEmail() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEmailType() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFailureType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRegistrationToken() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUuid() {
        return (this.bitField0_ & 32) != 0;
    }

    public static c newBuilder(e eVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(com.google.v.v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(com.google.v.z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(com.google.v.z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
