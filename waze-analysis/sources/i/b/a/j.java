package i.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends du<j, i> implements fj {
    public static final int APP_VERSION_FIELD_NUMBER = 3;
    private static final j DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 4;
    public static final int EVENT_FIELD_NUMBER = 5;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 2;
    private static volatile fo<j> PARSER = null;
    public static final int SESSION_UUID_FIELD_NUMBER = 6;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private int deviceId_;
    private c event_;
    private long userId_;
    private String installationId_ = "";
    private String appVersion_ = "";
    private String sessionUuid_ = "";

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.bitField0_ &= -5;
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.bitField0_ &= -9;
        this.deviceId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstallationId() {
        this.bitField0_ &= -3;
        this.installationId_ = getDefaultInstance().getInstallationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionUuid() {
        this.bitField0_ &= -33;
        this.sessionUuid_ = getDefaultInstance().getSessionUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvent(c cVar) {
        Objects.requireNonNull(cVar);
        c cVar2 = this.event_;
        if (cVar2 != null && cVar2 != c.getDefaultInstance()) {
            a aVarNewBuilder = c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.event_ = cVar;
        this.bitField0_ |= 16;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionBytes(v vVar) {
        this.appVersion_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(int i2) {
        this.bitField0_ |= 8;
        this.deviceId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(c cVar) {
        Objects.requireNonNull(cVar);
        this.event_ = cVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.installationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationIdBytes(v vVar) {
        this.installationId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.sessionUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionUuidBytes(v vVar) {
        this.sessionUuid_ = vVar.u();
        this.bitField0_ |= 32;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "userId_", "installationId_", "appVersion_", "deviceId_", "event_", "sessionUuid_"});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public v getAppVersionBytes() {
        return v.s(this.appVersion_);
    }

    public int getDeviceId() {
        return this.deviceId_;
    }

    public c getEvent() {
        c cVar = this.event_;
        return cVar == null ? c.getDefaultInstance() : cVar;
    }

    public String getInstallationId() {
        return this.installationId_;
    }

    public v getInstallationIdBytes() {
        return v.s(this.installationId_);
    }

    public String getSessionUuid() {
        return this.sessionUuid_;
    }

    public v getSessionUuidBytes() {
        return v.s(this.sessionUuid_);
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasAppVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDeviceId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEvent() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasInstallationId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSessionUuid() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static i newBuilder(j jVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
