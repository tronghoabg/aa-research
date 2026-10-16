package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class kh extends com.google.v.du<kh, kf> implements com.google.v.fj {
    public static final int ACCOUNT_INFO_FIELD_NUMBER = 2;
    private static final kh DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<kh> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 3;
    private ke accountInfo_;
    private int bitField0_;
    private String email_ = "";
    private int status_;

    static {
        kh khVar = new kh();
        DEFAULT_INSTANCE = khVar;
        com.google.v.du.registerDefaultInstance(kh.class, khVar);
    }

    private kh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountInfo() {
        this.accountInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -3;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -2;
        this.status_ = 0;
    }

    public static kh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountInfo(ke keVar) {
        Objects.requireNonNull(keVar);
        ke keVar2 = this.accountInfo_;
        if (keVar2 != null && keVar2 != ke.getDefaultInstance()) {
            kd kdVarNewBuilder = ke.newBuilder(keVar2);
            kdVarNewBuilder.mergeFrom((kd) keVar);
            keVar = kdVarNewBuilder.buildPartial();
        }
        this.accountInfo_ = keVar;
        this.bitField0_ |= 4;
    }

    public static kf newBuilder() {
        return (kf) DEFAULT_INSTANCE.createBuilder();
    }

    public static kh parseDelimitedFrom(InputStream inputStream) {
        return (kh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kh parseFrom(com.google.v.v vVar) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountInfo(ke keVar) {
        Objects.requireNonNull(keVar);
        this.accountInfo_ = keVar;
        this.bitField0_ |= 4;
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
    public void setStatus(kg kgVar) {
        this.status_ = kgVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဉ\u0002\u0003᠌\u0000", new Object[]{"bitField0_", "email_", "accountInfo_", "status_", hf.f48746j});
        }
        if (iOrdinal == 3) {
            return new kh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ke getAccountInfo() {
        ke keVar = this.accountInfo_;
        return keVar == null ? ke.getDefaultInstance() : keVar;
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public kg getStatus() {
        kg kgVarA = kg.a(this.status_);
        return kgVarA == null ? kg.SUCCESS : kgVarA;
    }

    public boolean hasAccountInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kf newBuilder(kh khVar) {
        return (kf) DEFAULT_INSTANCE.createBuilder(khVar);
    }

    public static kh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kh parseFrom(com.google.v.z zVar) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kh parseFrom(InputStream inputStream) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kh parseFrom(ByteBuffer byteBuffer) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kh parseFrom(byte[] bArr) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
