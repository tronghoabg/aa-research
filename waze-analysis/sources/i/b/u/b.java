package i.b.u;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b extends du<b, a> implements fj {
    private static final b DEFAULT_INSTANCE;
    public static final int EMAIL_TOKEN_FIELD_NUMBER = 2;
    private static volatile fo<b> PARSER = null;
    public static final int PIN_CODE_FIELD_NUMBER = 3;
    public static final int USE_NEW_ERROR_SCHEME_FIELD_NUMBER = 4;
    public static final int VERIFICATION_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean useNewErrorScheme_;
    private String verificationToken_ = "";
    private String emailToken_ = "";
    private String pinCode_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmailToken() {
        this.bitField0_ &= -3;
        this.emailToken_ = getDefaultInstance().getEmailToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinCode() {
        this.bitField0_ &= -5;
        this.pinCode_ = getDefaultInstance().getPinCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseNewErrorScheme() {
        this.bitField0_ &= -9;
        this.useNewErrorScheme_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerificationToken() {
        this.bitField0_ &= -2;
        this.verificationToken_ = getDefaultInstance().getVerificationToken();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.emailToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailTokenBytes(com.google.v.v vVar) {
        this.emailToken_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.pinCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinCodeBytes(com.google.v.v vVar) {
        this.pinCode_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseNewErrorScheme(boolean z) {
        this.bitField0_ |= 8;
        this.useNewErrorScheme_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.verificationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationTokenBytes(com.google.v.v vVar) {
        this.verificationToken_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "verificationToken_", "emailToken_", "pinCode_", "useNewErrorScheme_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getEmailToken() {
        return this.emailToken_;
    }

    public com.google.v.v getEmailTokenBytes() {
        return com.google.v.v.s(this.emailToken_);
    }

    public String getPinCode() {
        return this.pinCode_;
    }

    public com.google.v.v getPinCodeBytes() {
        return com.google.v.v.s(this.pinCode_);
    }

    public boolean getUseNewErrorScheme() {
        return this.useNewErrorScheme_;
    }

    public String getVerificationToken() {
        return this.verificationToken_;
    }

    public com.google.v.v getVerificationTokenBytes() {
        return com.google.v.v.s(this.verificationToken_);
    }

    public boolean hasEmailToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPinCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUseNewErrorScheme() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVerificationToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(com.google.v.z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(com.google.v.z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
