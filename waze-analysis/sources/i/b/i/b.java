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
public final class b extends du<b, a> implements fj {
    public static final int APP_TYPE_FIELD_NUMBER = 9;
    public static final int CAPABILITIES_FIELD_NUMBER = 5;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 6;
    private static final b DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 4;
    public static final int MANUFACTORER_FIELD_NUMBER = 11;
    public static final int MODEL_FIELD_NUMBER = 12;
    public static final int OS_VERSION_FIELD_NUMBER = 7;
    private static volatile fo<b> PARSER = null;
    public static final int SANDBOX_FIELD_NUMBER = 10;
    public static final int TOKEN_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int appType_;
    private int bitField0_;
    private ao capabilities_;
    private int device_;
    private boolean sandbox_;
    private long userId_;
    private String token_ = "";
    private String installationId_ = "";
    private String clientVersion_ = "";
    private String osVersion_ = "";
    private String manufactorer_ = "";
    private String model_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppType() {
        this.bitField0_ &= -129;
        this.appType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCapabilities() {
        this.capabilities_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientVersion() {
        this.bitField0_ &= -33;
        this.clientVersion_ = getDefaultInstance().getClientVersion();
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
    public void clearManufactorer() {
        this.bitField0_ &= -513;
        this.manufactorer_ = getDefaultInstance().getManufactorer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.bitField0_ &= -1025;
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.bitField0_ &= -65;
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSandbox() {
        this.bitField0_ &= -257;
        this.sandbox_ = false;
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

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCapabilities(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.capabilities_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            an anVarNewBuilder = ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.capabilities_ = aoVar;
        this.bitField0_ |= 16;
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
    public void setAppType(i.b.n nVar) {
        this.appType_ = nVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCapabilities(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.capabilities_ = aoVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.clientVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersionBytes(com.google.v.v vVar) {
        this.clientVersion_ = vVar.u();
        this.bitField0_ |= 32;
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
    public void setManufactorer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.manufactorer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufactorerBytes(com.google.v.v vVar) {
        this.manufactorer_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(com.google.v.v vVar) {
        this.model_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(com.google.v.v vVar) {
        this.osVersion_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSandbox(boolean z) {
        this.bitField0_ |= 256;
        this.sandbox_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\t᠌\u0007\nဇ\b\u000bဈ\t\fဈ\n", new Object[]{"bitField0_", "userId_", "token_", "device_", i.b.u.a(), "installationId_", "capabilities_", "clientVersion_", "osVersion_", "appType_", i.b.n.a(), "sandbox_", "manufactorer_", "model_"});
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

    public i.b.n getAppType() {
        i.b.n nVarB = i.b.n.b(this.appType_);
        return nVarB == null ? i.b.n.UNKNOWN_APP_TYPE : nVarB;
    }

    public ao getCapabilities() {
        ao aoVar = this.capabilities_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public String getClientVersion() {
        return this.clientVersion_;
    }

    public com.google.v.v getClientVersionBytes() {
        return com.google.v.v.s(this.clientVersion_);
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

    public String getManufactorer() {
        return this.manufactorer_;
    }

    public com.google.v.v getManufactorerBytes() {
        return com.google.v.v.s(this.manufactorer_);
    }

    public String getModel() {
        return this.model_;
    }

    public com.google.v.v getModelBytes() {
        return com.google.v.v.s(this.model_);
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public com.google.v.v getOsVersionBytes() {
        return com.google.v.v.s(this.osVersion_);
    }

    public boolean getSandbox() {
        return this.sandbox_;
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
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCapabilities() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasClientVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDevice() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasInstallationId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasManufactorer() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasModel() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasOsVersion() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSandbox() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserId() {
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
