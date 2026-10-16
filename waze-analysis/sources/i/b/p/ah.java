package i.b.p;

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
public final class ah extends du<ah, ag> implements fj {
    private static final ah DEFAULT_INSTANCE;
    public static final int HIJACK_EXISTING_USER_FIELD_NUMBER = 4;
    private static volatile fo<ah> PARSER = null;
    public static final int PIN_FIELD_NUMBER = 1;
    public static final int SENDER_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean hijackExistingUser_;
    private String pin_ = "";
    private String sender_ = "";
    private String token_ = "";

    static {
        ah ahVar = new ah();
        DEFAULT_INSTANCE = ahVar;
        du.registerDefaultInstance(ah.class, ahVar);
    }

    private ah() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHijackExistingUser() {
        this.bitField0_ &= -9;
        this.hijackExistingUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPin() {
        this.bitField0_ &= -2;
        this.pin_ = getDefaultInstance().getPin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSender() {
        this.bitField0_ &= -3;
        this.sender_ = getDefaultInstance().getSender();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -5;
        this.token_ = getDefaultInstance().getToken();
    }

    public static ah getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ah parseDelimitedFrom(InputStream inputStream) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(com.google.v.v vVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ah> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHijackExistingUser(boolean z) {
        this.bitField0_ |= 8;
        this.hijackExistingUser_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPin(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.pin_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinBytes(com.google.v.v vVar) {
        this.pin_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSender(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.sender_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderBytes(com.google.v.v vVar) {
        this.sender_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(com.google.v.v vVar) {
        this.token_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "pin_", "sender_", "token_", "hijackExistingUser_"});
        }
        if (iOrdinal == 3) {
            return new ah();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ah> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ah.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getHijackExistingUser() {
        return this.hijackExistingUser_;
    }

    public String getPin() {
        return this.pin_;
    }

    public com.google.v.v getPinBytes() {
        return com.google.v.v.s(this.pin_);
    }

    public String getSender() {
        return this.sender_;
    }

    public com.google.v.v getSenderBytes() {
        return com.google.v.v.s(this.sender_);
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public boolean hasHijackExistingUser() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPin() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSender() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ag newBuilder(ah ahVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(ahVar);
    }

    public static ah parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(com.google.v.v vVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ah parseFrom(com.google.v.z zVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ah parseFrom(com.google.v.z zVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ah parseFrom(InputStream inputStream) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(InputStream inputStream, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(ByteBuffer byteBuffer) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ah parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ah parseFrom(byte[] bArr) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ah parseFrom(byte[] bArr, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
