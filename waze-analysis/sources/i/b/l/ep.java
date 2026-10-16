package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ep extends com.google.v.du<ep, eo> implements com.google.v.fj {
    private static final ep DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ep> PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private String username_ = "";
    private String password_ = "";

    static {
        ep epVar = new ep();
        DEFAULT_INSTANCE = epVar;
        com.google.v.du.registerDefaultInstance(ep.class, epVar);
    }

    private ep() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassword() {
        this.bitField0_ &= -3;
        this.password_ = getDefaultInstance().getPassword();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -2;
        this.username_ = getDefaultInstance().getUsername();
    }

    public static ep getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eo newBuilder() {
        return (eo) DEFAULT_INSTANCE.createBuilder();
    }

    public static ep parseDelimitedFrom(InputStream inputStream) {
        return (ep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ep parseFrom(com.google.v.v vVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ep> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassword(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.password_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPasswordBytes(com.google.v.v vVar) {
        this.password_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(com.google.v.v vVar) {
        this.username_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "username_", "password_"});
        }
        if (iOrdinal == 3) {
            return new ep();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ep> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ep.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPassword() {
        return this.password_;
    }

    public com.google.v.v getPasswordBytes() {
        return com.google.v.v.s(this.password_);
    }

    public String getUsername() {
        return this.username_;
    }

    public com.google.v.v getUsernameBytes() {
        return com.google.v.v.s(this.username_);
    }

    public boolean hasPassword() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 1) != 0;
    }

    public static eo newBuilder(ep epVar) {
        return (eo) DEFAULT_INSTANCE.createBuilder(epVar);
    }

    public static ep parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ep parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ep parseFrom(com.google.v.z zVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ep parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ep parseFrom(InputStream inputStream) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ep parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ep parseFrom(ByteBuffer byteBuffer) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ep parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ep parseFrom(byte[] bArr) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ep parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
