package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes8.dex */
public final class er extends com.google.v.du<er, eq> implements com.google.v.fj {
    private static final er DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<er> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private int protocol_;
    private String token_ = "";

    static {
        er erVar = new er();
        DEFAULT_INSTANCE = erVar;
        com.google.v.du.registerDefaultInstance(er.class, erVar);
    }

    private er() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.bitField0_ &= -3;
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -2;
        this.token_ = getDefaultInstance().getToken();
    }

    public static er getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eq newBuilder() {
        return (eq) DEFAULT_INSTANCE.createBuilder();
    }

    public static er parseDelimitedFrom(InputStream inputStream) {
        return (er) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static er parseFrom(com.google.v.v vVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<er> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(int i2) {
        this.bitField0_ |= 2;
        this.protocol_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(com.google.v.v vVar) {
        this.token_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"bitField0_", "token_", "protocol_"});
        }
        if (iOrdinal == 3) {
            return new er();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<er> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (er.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public boolean hasProtocol() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static eq newBuilder(er erVar) {
        return (eq) DEFAULT_INSTANCE.createBuilder(erVar);
    }

    public static er parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (er) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static er parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static er parseFrom(com.google.v.z zVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static er parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static er parseFrom(InputStream inputStream) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static er parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static er parseFrom(ByteBuffer byteBuffer) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static er parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static er parseFrom(byte[] bArr) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static er parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (er) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
