package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class kj extends com.google.v.du<kj, ki> implements com.google.v.fj {
    private static final kj DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<kj> PARSER;
    private int bitField0_;
    private String email_ = "";

    static {
        kj kjVar = new kj();
        DEFAULT_INSTANCE = kjVar;
        com.google.v.du.registerDefaultInstance(kj.class, kjVar);
    }

    private kj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -2;
        this.email_ = getDefaultInstance().getEmail();
    }

    public static kj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ki newBuilder() {
        return (ki) DEFAULT_INSTANCE.createBuilder();
    }

    public static kj parseDelimitedFrom(InputStream inputStream) {
        return (kj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kj parseFrom(com.google.v.v vVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "email_"});
        }
        if (iOrdinal == 3) {
            return new kj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ki(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
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

    public boolean hasEmail() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ki newBuilder(kj kjVar) {
        return (ki) DEFAULT_INSTANCE.createBuilder(kjVar);
    }

    public static kj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kj parseFrom(com.google.v.z zVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kj parseFrom(InputStream inputStream) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kj parseFrom(ByteBuffer byteBuffer) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kj parseFrom(byte[] bArr) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
