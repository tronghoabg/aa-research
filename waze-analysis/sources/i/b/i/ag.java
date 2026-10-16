package i.b.i;

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
/* loaded from: classes7.dex */
public final class ag extends du<ag, af> implements fj {
    public static final int APP_TYPE_FIELD_NUMBER = 5;
    private static final ag DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 4;
    private static volatile fo<ag> PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int appType_;
    private int bitField0_;
    private int device_;
    private long userId_;
    private String token_ = "";
    private String installationId_ = "";

    static {
        ag agVar = new ag();
        DEFAULT_INSTANCE = agVar;
        du.registerDefaultInstance(ag.class, agVar);
    }

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppType() {
        this.bitField0_ &= -17;
        this.appType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.bitField0_ &= -5;
        this.device_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstallationId() {
        this.bitField0_ &= -9;
        this.installationId_ = getDefaultInstance().getInstallationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.bitField0_ &= -3;
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    public static ag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ag parseDelimitedFrom(InputStream inputStream) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(com.google.v.v vVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppType(i.b.n nVar) {
        this.appType_ = nVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(i.b.u uVar) {
        this.device_ = uVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.installationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationIdBytes(com.google.v.v vVar) {
        this.installationId_ = vVar.u();
        this.bitField0_ |= 8;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "userId_", "token_", "device_", i.b.u.a(), "installationId_", "appType_", i.b.n.a()});
        }
        if (iOrdinal == 3) {
            return new ag();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new af(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ag> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ag.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.n getAppType() {
        i.b.n nVarB = i.b.n.b(this.appType_);
        return nVarB == null ? i.b.n.UNKNOWN_APP_TYPE : nVarB;
    }

    public i.b.u getDevice() {
        i.b.u uVarB = i.b.u.b(this.device_);
        return uVarB == null ? i.b.u.UNKNOWN_DEVICE_TYPE : uVarB;
    }

    public String getInstallationId() {
        return this.installationId_;
    }

    public com.google.v.v getInstallationIdBytes() {
        return com.google.v.v.s(this.installationId_);
    }

    public String getToken() {
        return this.token_;
    }

    public com.google.v.v getTokenBytes() {
        return com.google.v.v.s(this.token_);
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasAppType() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDevice() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasInstallationId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static af newBuilder(ag agVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(agVar);
    }

    public static ag parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(com.google.v.v vVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ag parseFrom(com.google.v.z zVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ag parseFrom(com.google.v.z zVar, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ag parseFrom(InputStream inputStream) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(InputStream inputStream, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(ByteBuffer byteBuffer) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ag parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ag parseFrom(byte[] bArr) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ag parseFrom(byte[] bArr, de deVar) {
        return (ag) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
