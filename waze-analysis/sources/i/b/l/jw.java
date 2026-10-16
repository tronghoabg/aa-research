package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class jw extends com.google.v.du<jw, jv> implements com.google.v.fj {
    private static final jw DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<jw> PARSER = null;
    public static final int PHONE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String phone_ = "";
    private String email_ = "";

    static {
        jw jwVar = new jw();
        DEFAULT_INSTANCE = jwVar;
        com.google.v.du.registerDefaultInstance(jw.class, jwVar);
    }

    private jw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -3;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhone() {
        this.bitField0_ &= -2;
        this.phone_ = getDefaultInstance().getPhone();
    }

    public static jw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jv newBuilder() {
        return (jv) DEFAULT_INSTANCE.createBuilder();
    }

    public static jw parseDelimitedFrom(InputStream inputStream) {
        return (jw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jw parseFrom(com.google.v.v vVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhone(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.phone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneBytes(com.google.v.v vVar) {
        this.phone_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "phone_", "email_"});
        }
        if (iOrdinal == 3) {
            return new jw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jw.class) {
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

    public String getPhone() {
        return this.phone_;
    }

    public com.google.v.v getPhoneBytes() {
        return com.google.v.v.s(this.phone_);
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPhone() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jv newBuilder(jw jwVar) {
        return (jv) DEFAULT_INSTANCE.createBuilder(jwVar);
    }

    public static jw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jw parseFrom(com.google.v.z zVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jw parseFrom(InputStream inputStream) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jw parseFrom(ByteBuffer byteBuffer) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jw parseFrom(byte[] bArr) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
