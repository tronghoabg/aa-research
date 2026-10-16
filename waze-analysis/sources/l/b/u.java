package l.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l.a.awx;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class u extends du<u, s> implements fj {
    public static final int ATTEMPT_NUM_FIELD_NUMBER = 4;
    private static final u DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 3;
    public static final int FAILURE_REASON_FIELD_NUMBER = 5;
    private static volatile fo<u> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    public static final int USE_CASE_FIELD_NUMBER = 1;
    private long attemptNum_;
    private int bitField0_;
    private long errorCode_;
    private String failureReason_ = "";
    private int result_;
    private int useCase_;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttemptNum() {
        this.bitField0_ &= -5;
        this.attemptNum_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -3;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        this.bitField0_ &= -9;
        this.failureReason_ = getDefaultInstance().getFailureReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCase() {
        this.bitField0_ &= -2;
        this.useCase_ = 0;
    }

    public static u getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static u parseDelimitedFrom(InputStream inputStream) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(v vVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<u> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttemptNum(long j2) {
        this.bitField0_ |= 4;
        this.attemptNum_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 2;
        this.errorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.failureReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.failureReason_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(t tVar) {
        this.result_ = tVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultValue(int i2) {
        this.result_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCase(awx awxVar) {
        this.useCase_ = awxVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCaseValue(int i2) {
        this.bitField0_ |= 1;
        this.useCase_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002\f\u0003ဂ\u0001\u0004တ\u0002\u0005ለ\u0003", new Object[]{"bitField0_", "useCase_", "result_", "errorCode_", "attemptNum_", "failureReason_"});
        }
        if (iOrdinal == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new s(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<u> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (u.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAttemptNum() {
        return this.attemptNum_;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public String getFailureReason() {
        return this.failureReason_;
    }

    public v getFailureReasonBytes() {
        return v.s(this.failureReason_);
    }

    public t getResult() {
        int i2 = this.result_;
        t tVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : t.FAILURE : t.SUCCESS : t.RESULT_STATUS_UNSPECIFIED;
        return tVar == null ? t.UNRECOGNIZED : tVar;
    }

    public int getResultValue() {
        return this.result_;
    }

    public awx getUseCase() {
        awx awxVarA = awx.a(this.useCase_);
        return awxVarA == null ? awx.UNRECOGNIZED : awxVarA;
    }

    public int getUseCaseValue() {
        return this.useCase_;
    }

    public boolean hasAttemptNum() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFailureReason() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUseCase() {
        return (this.bitField0_ & 1) != 0;
    }

    public static s newBuilder(u uVar) {
        return (s) DEFAULT_INSTANCE.createBuilder(uVar);
    }

    public static u parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(v vVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static u parseFrom(z zVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static u parseFrom(z zVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static u parseFrom(InputStream inputStream) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(InputStream inputStream, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(ByteBuffer byteBuffer) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static u parseFrom(byte[] bArr) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static u parseFrom(byte[] bArr, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
