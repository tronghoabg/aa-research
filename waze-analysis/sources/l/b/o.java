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

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class o extends du<o, l> implements fj {
    public static final int API_FIELD_NUMBER = 1;
    public static final int ATTEMPTS_COUNT_FIELD_NUMBER = 4;
    private static final o DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 3;
    public static final int FAILURE_REASON_FIELD_NUMBER = 5;
    private static volatile fo<o> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    private int api_;
    private long attemptsCount_;
    private int bitField0_;
    private long errorCode_;
    private String failureReason_ = "";
    private int result_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApi() {
        this.api_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttemptsCount() {
        this.bitField0_ &= -3;
        this.attemptsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -2;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        this.bitField0_ &= -5;
        this.failureReason_ = getDefaultInstance().getFailureReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = 0;
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApi(m mVar) {
        this.api_ = mVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiValue(int i2) {
        this.api_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttemptsCount(long j2) {
        this.bitField0_ |= 2;
        this.attemptsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 1;
        this.errorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.failureReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.failureReason_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(n nVar) {
        this.result_ = nVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultValue(int i2) {
        this.result_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဂ\u0000\u0004တ\u0001\u0005ለ\u0002", new Object[]{"bitField0_", "api_", "result_", "errorCode_", "attemptsCount_", "failureReason_"});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public m getApi() {
        int i2 = this.api_;
        m mVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : m.REGISTER_CONNECT : m.REGISTER : m.ONBOARDING_API_UNSPECIFIED;
        return mVar == null ? m.UNRECOGNIZED : mVar;
    }

    public int getApiValue() {
        return this.api_;
    }

    public long getAttemptsCount() {
        return this.attemptsCount_;
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

    public n getResult() {
        int i2 = this.result_;
        n nVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : n.FAILURE : n.SUCCESS : n.RESULT_STATUS_UNSPECIFIED;
        return nVar == null ? n.UNRECOGNIZED : nVar;
    }

    public int getResultValue() {
        return this.result_;
    }

    public boolean hasAttemptsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFailureReason() {
        return (this.bitField0_ & 4) != 0;
    }

    public static l newBuilder(o oVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
