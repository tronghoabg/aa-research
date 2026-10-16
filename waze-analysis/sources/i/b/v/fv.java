package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fv extends com.google.v.du<fv, fr> implements com.google.v.fj {
    public static final int COMMENT_FIELD_NUMBER = 4;
    private static final fv DEFAULT_INSTANCE;
    public static final int ENTITY_ID_FIELD_NUMBER = 3;
    public static final int INTERNAL_VENUE_ID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fv> PARSER = null;
    public static final int SESSION_FIELD_NUMBER = 5;
    public static final int SUBJECT_TYPE_FIELD_NUMBER = 7;
    public static final int TIME_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 6;
    public static final int USER_INFO_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 9;
    public static final int VENUE_ID_FIELD_NUMBER = 10;
    public static final int VERSION_FIELD_NUMBER = 11;
    private int bitField0_;
    private fz internalVenueId_;
    private long time_;
    private dx userInfo_;
    private long version_;
    private String entityId_ = "";
    private String comment_ = "";
    private String session_ = "";
    private int type_ = 1;
    private int subjectType_ = 1;
    private com.google.v.v uuid_ = com.google.v.v.f13054a;
    private String venueId_ = "";

    static {
        fv fvVar = new fv();
        DEFAULT_INSTANCE = fvVar;
        com.google.v.du.registerDefaultInstance(fv.class, fvVar);
    }

    private fv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComment() {
        this.bitField0_ &= -9;
        this.comment_ = getDefaultInstance().getComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntityId() {
        this.bitField0_ &= -5;
        this.entityId_ = getDefaultInstance().getEntityId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalVenueId() {
        this.internalVenueId_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSession() {
        this.bitField0_ &= -17;
        this.session_ = getDefaultInstance().getSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubjectType() {
        this.bitField0_ &= -65;
        this.subjectType_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.bitField0_ &= -129;
        this.time_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -33;
        this.type_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.bitField0_ &= -257;
        this.uuid_ = getDefaultInstance().getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -513;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -1025;
        this.version_ = 0L;
    }

    public static fv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInternalVenueId(fz fzVar) {
        Objects.requireNonNull(fzVar);
        fz fzVar2 = this.internalVenueId_;
        if (fzVar2 != null && fzVar2 != fz.getDefaultInstance()) {
            fy fyVarNewBuilder = fz.newBuilder(fzVar2);
            fyVarNewBuilder.mergeFrom((fy) fzVar);
            fzVar = fyVarNewBuilder.buildPartial();
        }
        this.internalVenueId_ = fzVar;
        this.bitField0_ |= 2;
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

    public static fr newBuilder() {
        return (fr) DEFAULT_INSTANCE.createBuilder();
    }

    public static fv parseDelimitedFrom(InputStream inputStream) {
        return (fv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fv parseFrom(com.google.v.v vVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.comment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommentBytes(com.google.v.v vVar) {
        this.comment_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.entityId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityIdBytes(com.google.v.v vVar) {
        this.entityId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalVenueId(fz fzVar) {
        Objects.requireNonNull(fzVar);
        this.internalVenueId_ = fzVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSession(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.session_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionBytes(com.google.v.v vVar) {
        this.session_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubjectType(fs fsVar) {
        this.subjectType_ = fsVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(long j2) {
        this.bitField0_ |= 128;
        this.time_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(fu fuVar) {
        this.type_ = fuVar.getNumber();
        this.bitField0_ |= 32;
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
        this.bitField0_ |= 256;
        this.uuid_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(long j2) {
        this.bitField0_ |= 1024;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006᠌\u0005\u0007᠌\u0006\bဂ\u0007\tည\b\nဈ\t\u000bဂ\n", new Object[]{"bitField0_", "userInfo_", "internalVenueId_", "entityId_", "comment_", "session_", "type_", ft.f49493a, "subjectType_", ft.f49494b, "time_", "uuid_", "venueId_", "version_"});
        }
        if (iOrdinal == 3) {
            return new fv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getComment() {
        return this.comment_;
    }

    public com.google.v.v getCommentBytes() {
        return com.google.v.v.s(this.comment_);
    }

    public String getEntityId() {
        return this.entityId_;
    }

    public com.google.v.v getEntityIdBytes() {
        return com.google.v.v.s(this.entityId_);
    }

    public fz getInternalVenueId() {
        fz fzVar = this.internalVenueId_;
        return fzVar == null ? fz.getDefaultInstance() : fzVar;
    }

    public String getSession() {
        return this.session_;
    }

    public com.google.v.v getSessionBytes() {
        return com.google.v.v.s(this.session_);
    }

    public fs getSubjectType() {
        fs fsVarA = fs.a(this.subjectType_);
        return fsVarA == null ? fs.VENUE : fsVarA;
    }

    public long getTime() {
        return this.time_;
    }

    public fu getType() {
        fu fuVarA = fu.a(this.type_);
        return fuVarA == null ? fu.CLOSED : fuVarA;
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

    public boolean hasComment() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEntityId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasInternalVenueId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSession() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSubjectType() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTime() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUuid() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 512) != 0;
    }

    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1024) != 0;
    }

    public static fr newBuilder(fv fvVar) {
        return (fr) DEFAULT_INSTANCE.createBuilder(fvVar);
    }

    public static fv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fv parseFrom(com.google.v.z zVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fv parseFrom(InputStream inputStream) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fv parseFrom(ByteBuffer byteBuffer) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fv parseFrom(byte[] bArr) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
