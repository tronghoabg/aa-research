package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgo extends com.google.v.du<bgo, bgn> implements com.google.v.fj {
    private static final bgo DEFAULT_INSTANCE;
    public static final int LOGIN_SESSION_IN_BACKGROUND_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bgo> PARSER = null;
    public static final int RESPONSE_PROCESSING_TIME_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean loginSessionInBackground_;
    private long responseProcessingTimeMs_;

    static {
        bgo bgoVar = new bgo();
        DEFAULT_INSTANCE = bgoVar;
        com.google.v.du.registerDefaultInstance(bgo.class, bgoVar);
    }

    private bgo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginSessionInBackground() {
        this.bitField0_ &= -3;
        this.loginSessionInBackground_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseProcessingTimeMs() {
        this.bitField0_ &= -2;
        this.responseProcessingTimeMs_ = 0L;
    }

    public static bgo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bgn newBuilder() {
        return (bgn) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgo parseDelimitedFrom(InputStream inputStream) {
        return (bgo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgo parseFrom(com.google.v.v vVar) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginSessionInBackground(boolean z) {
        this.bitField0_ |= 2;
        this.loginSessionInBackground_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseProcessingTimeMs(long j2) {
        this.bitField0_ |= 1;
        this.responseProcessingTimeMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "responseProcessingTimeMs_", "loginSessionInBackground_"});
        }
        if (iOrdinal == 3) {
            return new bgo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bgn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getLoginSessionInBackground() {
        return this.loginSessionInBackground_;
    }

    public long getResponseProcessingTimeMs() {
        return this.responseProcessingTimeMs_;
    }

    public boolean hasLoginSessionInBackground() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResponseProcessingTimeMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bgn newBuilder(bgo bgoVar) {
        return (bgn) DEFAULT_INSTANCE.createBuilder(bgoVar);
    }

    public static bgo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgo parseFrom(com.google.v.z zVar) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgo parseFrom(InputStream inputStream) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgo parseFrom(ByteBuffer byteBuffer) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgo parseFrom(byte[] bArr) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
