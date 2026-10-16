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
public final class ac extends du<ac, ab> implements fj {
    private static final ac DEFAULT_INSTANCE;
    private static volatile fo<ac> PARSER = null;
    public static final int PARTNER_ID_FIELD_NUMBER = 1;
    public static final int TOKEN_FIELD_NUMBER = 2;
    private int bitField0_;
    private String partnerId_ = "";
    private String token_ = "";

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        du.registerDefaultInstance(ac.class, acVar);
    }

    private ac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerId() {
        this.bitField0_ &= -2;
        this.partnerId_ = getDefaultInstance().getPartnerId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -3;
        this.token_ = getDefaultInstance().getToken();
    }

    public static ac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ab newBuilder() {
        return (ab) DEFAULT_INSTANCE.createBuilder();
    }

    public static ac parseDelimitedFrom(InputStream inputStream) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(com.google.v.v vVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.partnerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerIdBytes(com.google.v.v vVar) {
        this.partnerId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(com.google.v.v vVar) {
        this.token_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "partnerId_", "token_"});
        }
        if (iOrdinal == 3) {
            return new ac();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ab(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ac> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ac.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPartnerId() {
        return this.partnerId_;
    }

    public com.google.v.v getPartnerIdBytes() {
        return com.google.v.v.s(this.partnerId_);
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public boolean hasPartnerId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ab newBuilder(ac acVar) {
        return (ab) DEFAULT_INSTANCE.createBuilder(acVar);
    }

    public static ac parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(com.google.v.v vVar, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ac parseFrom(com.google.v.z zVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ac parseFrom(com.google.v.z zVar, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ac parseFrom(InputStream inputStream) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(InputStream inputStream, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(ByteBuffer byteBuffer) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ac parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ac parseFrom(byte[] bArr) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ac parseFrom(byte[] bArr, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
