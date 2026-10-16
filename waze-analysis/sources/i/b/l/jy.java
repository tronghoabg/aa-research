package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class jy extends com.google.v.du<jy, jx> implements com.google.v.fj {
    private static final jy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jy> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private String token_ = "";

    static {
        jy jyVar = new jy();
        DEFAULT_INSTANCE = jyVar;
        com.google.v.du.registerDefaultInstance(jy.class, jyVar);
    }

    private jy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -2;
        this.token_ = getDefaultInstance().getToken();
    }

    public static jy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jx newBuilder() {
        return (jx) DEFAULT_INSTANCE.createBuilder();
    }

    public static jy parseDelimitedFrom(InputStream inputStream) {
        return (jy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jy parseFrom(com.google.v.v vVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "token_"});
        }
        if (iOrdinal == 3) {
            return new jy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public boolean hasToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jx newBuilder(jy jyVar) {
        return (jx) DEFAULT_INSTANCE.createBuilder(jyVar);
    }

    public static jy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jy parseFrom(com.google.v.z zVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jy parseFrom(InputStream inputStream) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jy parseFrom(ByteBuffer byteBuffer) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jy parseFrom(byte[] bArr) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
