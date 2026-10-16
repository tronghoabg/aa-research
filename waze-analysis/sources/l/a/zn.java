package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zn extends com.google.v.du<zn, zl> implements com.google.v.fj {
    private static final zn DEFAULT_INSTANCE;
    public static final int FAILURE_REASON_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<zn> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int failureReason_;
    private boolean success_;

    static {
        zn znVar = new zn();
        DEFAULT_INSTANCE = znVar;
        com.google.v.du.registerDefaultInstance(zn.class, znVar);
    }

    private zn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureReason() {
        this.failureReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.success_ = false;
    }

    public static zn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static zl newBuilder() {
        return (zl) DEFAULT_INSTANCE.createBuilder();
    }

    public static zn parseDelimitedFrom(InputStream inputStream) {
        return (zn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zn parseFrom(com.google.v.v vVar) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<zn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReason(zm zmVar) {
        this.failureReason_ = zmVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureReasonValue(int i2) {
        this.failureReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"success_", "failureReason_"});
        }
        if (iOrdinal == 3) {
            return new zn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<zn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (zn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public zm getFailureReason() {
        int i2 = this.failureReason_;
        zm zmVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : zm.INTERNAL_ERROR : zm.SERVICE_ERROR : zm.NETWORK_ERROR : zm.GMS_UNAVAILABLE : zm.DEVELOPER_ERROR : zm.FAILURE_REASON_UNSPECIFIED;
        return zmVar == null ? zm.UNRECOGNIZED : zmVar;
    }

    public int getFailureReasonValue() {
        return this.failureReason_;
    }

    public boolean getSuccess() {
        return this.success_;
    }

    public static zl newBuilder(zn znVar) {
        return (zl) DEFAULT_INSTANCE.createBuilder(znVar);
    }

    public static zn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static zn parseFrom(com.google.v.z zVar) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static zn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static zn parseFrom(InputStream inputStream) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zn parseFrom(ByteBuffer byteBuffer) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static zn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static zn parseFrom(byte[] bArr) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static zn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (zn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
