package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cy extends com.google.v.du<cy, cx> implements com.google.v.fj {
    private static final cy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cy> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private String token_ = "";

    static {
        cy cyVar = new cy();
        DEFAULT_INSTANCE = cyVar;
        com.google.v.du.registerDefaultInstance(cy.class, cyVar);
    }

    private cy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -2;
        this.token_ = getDefaultInstance().getToken();
    }

    public static cy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cx newBuilder() {
        return (cx) DEFAULT_INSTANCE.createBuilder();
    }

    public static cy parseDelimitedFrom(InputStream inputStream) {
        return (cy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cy parseFrom(com.google.v.v vVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cy> parser() {
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
            return new cy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cy.class) {
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

    public static cx newBuilder(cy cyVar) {
        return (cx) DEFAULT_INSTANCE.createBuilder(cyVar);
    }

    public static cy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cy parseFrom(com.google.v.z zVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cy parseFrom(InputStream inputStream) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cy parseFrom(ByteBuffer byteBuffer) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cy parseFrom(byte[] bArr) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
