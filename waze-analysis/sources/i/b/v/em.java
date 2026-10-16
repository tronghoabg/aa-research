package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class em extends com.google.v.du<em, el> implements com.google.v.fj {
    private static final em DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<em> PARSER = null;
    public static final int RETURN_PENDING_REQUESTS_FIELD_NUMBER = 9;
    public static final int RETURN_VENUE_FIELD_NUMBER = 5;
    public static final int SESSION_FIELD_NUMBER = 3;
    public static final int TIME_FIELD_NUMBER = 7;
    public static final int USER_INFO_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 8;
    public static final int VENUE3_FIELD_NUMBER = 6;
    public static final int VENUE_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean returnPendingRequests_;
    private boolean returnVenue_;
    private long time_;
    private dx userInfo_;
    private ed venue3_;
    private ef venue_;
    private long version_;
    private byte memoizedIsInitialized = 2;
    private String session_ = "";
    private com.google.v.v uuid_ = com.google.v.v.f13054a;

    static {
        em emVar = new em();
        DEFAULT_INSTANCE = emVar;
        com.google.v.du.registerDefaultInstance(em.class, emVar);
    }

    private em() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnPendingRequests() {
        this.bitField0_ &= -257;
        this.returnPendingRequests_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnVenue() {
        this.bitField0_ &= -17;
        this.returnVenue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSession() {
        this.bitField0_ &= -5;
        this.session_ = getDefaultInstance().getSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.bitField0_ &= -65;
        this.time_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.bitField0_ &= -129;
        this.uuid_ = getDefaultInstance().getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        this.venue_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue3() {
        this.venue3_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = 0L;
    }

    public static em getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.userInfo_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.userInfo_ = dxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        ef efVar2 = this.venue_;
        if (efVar2 != null && efVar2 != ef.getDefaultInstance()) {
            eb ebVarNewBuilder = ef.newBuilder(efVar2);
            ebVarNewBuilder.mergeFrom((eb) efVar);
            efVar = ebVarNewBuilder.buildPartial();
        }
        this.venue_ = efVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue3(ed edVar) {
        Objects.requireNonNull(edVar);
        ed edVar2 = this.venue3_;
        if (edVar2 != null && edVar2 != ed.getDefaultInstance()) {
            ec ecVarNewBuilder = ed.newBuilder(edVar2);
            ecVarNewBuilder.mergeFrom((ec) edVar);
            edVar = ecVarNewBuilder.buildPartial();
        }
        this.venue3_ = edVar;
        this.bitField0_ |= 32;
    }

    public static el newBuilder() {
        return (el) DEFAULT_INSTANCE.createBuilder();
    }

    public static em parseDelimitedFrom(InputStream inputStream) {
        return (em) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static em parseFrom(com.google.v.v vVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<em> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnPendingRequests(boolean z) {
        this.bitField0_ |= 256;
        this.returnPendingRequests_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnVenue(boolean z) {
        this.bitField0_ |= 16;
        this.returnVenue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSession(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.session_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionBytes(com.google.v.v vVar) {
        this.session_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j2) {
        this.bitField0_ |= 64;
        this.time_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.userInfo_ = dxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuid(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 128;
        this.uuid_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        this.venue_ = efVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue3(ed edVar) {
        Objects.requireNonNull(edVar);
        this.venue3_ = edVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(long j2) {
        this.bitField0_ |= 2;
        this.version_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ᐉ\u0005\u0007ဂ\u0006\bည\u0007\tဇ\b", new Object[]{"bitField0_", "userInfo_", "version_", "session_", "venue_", "returnVenue_", "venue3_", "time_", "uuid_", "returnPendingRequests_"});
            case 3:
                return new em();
            case 4:
                return new el(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<em> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (em.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public boolean getReturnPendingRequests() {
        return this.returnPendingRequests_;
    }

    public boolean getReturnVenue() {
        return this.returnVenue_;
    }

    public String getSession() {
        return this.session_;
    }

    public com.google.v.v getSessionBytes() {
        return com.google.v.v.s(this.session_);
    }

    public long getTime() {
        return this.time_;
    }

    public dx getUserInfo() {
        dx dxVar = this.userInfo_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    public com.google.v.v getUuid() {
        return this.uuid_;
    }

    public ef getVenue() {
        ef efVar = this.venue_;
        return efVar == null ? ef.getDefaultInstance() : efVar;
    }

    public ed getVenue3() {
        ed edVar = this.venue3_;
        return edVar == null ? ed.getDefaultInstance() : edVar;
    }

    @Deprecated
    public long getVersion() {
        return this.version_;
    }

    public boolean hasReturnPendingRequests() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasReturnVenue() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSession() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTime() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUuid() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVenue() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVenue3() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static el newBuilder(em emVar) {
        return (el) DEFAULT_INSTANCE.createBuilder(emVar);
    }

    public static em parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (em) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static em parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static em parseFrom(com.google.v.z zVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static em parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static em parseFrom(InputStream inputStream) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static em parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static em parseFrom(ByteBuffer byteBuffer) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static em parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static em parseFrom(byte[] bArr) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static em parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (em) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
