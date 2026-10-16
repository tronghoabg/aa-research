package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class el extends com.google.v.du<el, ek> implements com.google.v.fj {
    private static final el DEFAULT_INSTANCE;
    public static final int GLOBAL_USER_ID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<el> PARSER = null;
    public static final int SECRET_KEY_FIELD_NUMBER = 3;
    public static final int SERVER_SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private long serverSessionId_;
    private String globalUserId_ = "";
    private String secretKey_ = "";
    private String sessionId_ = "";

    static {
        el elVar = new el();
        DEFAULT_INSTANCE = elVar;
        com.google.v.du.registerDefaultInstance(el.class, elVar);
    }

    private el() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGlobalUserId() {
        this.bitField0_ &= -3;
        this.globalUserId_ = getDefaultInstance().getGlobalUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecretKey() {
        this.bitField0_ &= -5;
        this.secretKey_ = getDefaultInstance().getSecretKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSessionId() {
        this.bitField0_ &= -2;
        this.serverSessionId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -9;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    public static el getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ek newBuilder() {
        return (ek) DEFAULT_INSTANCE.createBuilder();
    }

    public static el parseDelimitedFrom(InputStream inputStream) {
        return (el) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static el parseFrom(com.google.v.v vVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<el> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGlobalUserId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.globalUserId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGlobalUserIdBytes(com.google.v.v vVar) {
        this.globalUserId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.secretKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKeyBytes(com.google.v.v vVar) {
        this.secretKey_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSessionId(long j2) {
        this.bitField0_ |= 1;
        this.serverSessionId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(com.google.v.v vVar) {
        this.sessionId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "serverSessionId_", "globalUserId_", "secretKey_", "sessionId_"});
        }
        if (iOrdinal == 3) {
            return new el();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ek(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<el> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (el.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getGlobalUserId() {
        return this.globalUserId_;
    }

    public com.google.v.v getGlobalUserIdBytes() {
        return com.google.v.v.s(this.globalUserId_);
    }

    public String getSecretKey() {
        return this.secretKey_;
    }

    public com.google.v.v getSecretKeyBytes() {
        return com.google.v.v.s(this.secretKey_);
    }

    public long getServerSessionId() {
        return this.serverSessionId_;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public com.google.v.v getSessionIdBytes() {
        return com.google.v.v.s(this.sessionId_);
    }

    public boolean hasGlobalUserId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSecretKey() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasServerSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static ek newBuilder(el elVar) {
        return (ek) DEFAULT_INSTANCE.createBuilder(elVar);
    }

    public static el parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (el) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static el parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static el parseFrom(com.google.v.z zVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static el parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static el parseFrom(InputStream inputStream) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static el parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static el parseFrom(ByteBuffer byteBuffer) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static el parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static el parseFrom(byte[] bArr) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static el parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
