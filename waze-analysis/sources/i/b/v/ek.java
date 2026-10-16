package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ek extends com.google.v.du<ek, ej> implements com.google.v.fj {
    private static final ek DEFAULT_INSTANCE;
    public static final int IMAGE_ID_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<ek> PARSER = null;
    public static final int SESSION_FIELD_NUMBER = 3;
    public static final int TIME_FIELD_NUMBER = 6;
    public static final int USER_INFO_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 7;
    public static final int VENUE_ID_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private long time_;
    private dx userInfo_;
    private long version_;
    private String session_ = "";
    private String venueId_ = "";
    private String imageId_ = "";
    private com.google.v.v uuid_ = com.google.v.v.f13054a;

    static {
        ek ekVar = new ek();
        DEFAULT_INSTANCE = ekVar;
        com.google.v.du.registerDefaultInstance(ek.class, ekVar);
    }

    private ek() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageId() {
        this.bitField0_ &= -17;
        this.imageId_ = getDefaultInstance().getImageId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSession() {
        this.bitField0_ &= -5;
        this.session_ = getDefaultInstance().getSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.bitField0_ &= -33;
        this.time_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.bitField0_ &= -65;
        this.uuid_ = getDefaultInstance().getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -9;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = 0L;
    }

    public static ek getDefaultInstance() {
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

    public static ej newBuilder() {
        return (ej) DEFAULT_INSTANCE.createBuilder();
    }

    public static ek parseDelimitedFrom(InputStream inputStream) {
        return (ek) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ek parseFrom(com.google.v.v vVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ek> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.imageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageIdBytes(com.google.v.v vVar) {
        this.imageId_ = vVar.u();
        this.bitField0_ |= 16;
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
        this.bitField0_ |= 32;
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
        this.bitField0_ |= 64;
        this.uuid_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(long j2) {
        this.bitField0_ |= 2;
        this.version_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ည\u0006", new Object[]{"bitField0_", "userInfo_", "version_", "session_", "venueId_", "imageId_", "time_", "uuid_"});
        }
        if (iOrdinal == 3) {
            return new ek();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ej(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ek> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ek.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getImageId() {
        return this.imageId_;
    }

    public com.google.v.v getImageIdBytes() {
        return com.google.v.v.s(this.imageId_);
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

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    @Deprecated
    public long getVersion() {
        return this.version_;
    }

    public boolean hasImageId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSession() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTime() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUuid() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ej newBuilder(ek ekVar) {
        return (ej) DEFAULT_INSTANCE.createBuilder(ekVar);
    }

    public static ek parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ek) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ek parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ek parseFrom(com.google.v.z zVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ek parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ek parseFrom(InputStream inputStream) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ek parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ek parseFrom(ByteBuffer byteBuffer) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ek parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ek parseFrom(byte[] bArr) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ek parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
