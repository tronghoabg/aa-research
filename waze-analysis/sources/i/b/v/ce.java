package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ce extends com.google.v.du<ce, cd> implements cf {
    public static final int APPROVED_FIELD_NUMBER = 906;
    public static final int AZIMUTH_FIELD_NUMBER = 112;
    public static final int BY_ME_FIELD_NUMBER = 113;
    public static final int CONTENT_SCANNED_FIELD_NUMBER = 114;
    public static final int CREATED_BY_INFO_FIELD_NUMBER = 111;
    public static final int CREATORUSERID_FIELD_NUMBER = 904;
    public static final int DATE_FIELD_NUMBER = 902;
    private static final ce DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 901;
    public static final int LIKED_FIELD_NUMBER = 909;
    public static final int LIKES_FIELD_NUMBER = 908;
    public static final int LOCATION_FIELD_NUMBER = 903;
    private static volatile com.google.v.fo<ce> PARSER = null;
    public static final int PROMOTED_FIELD_NUMBER = 907;
    public static final int STREET_FIELD_NUMBER = 905;
    private boolean approved_;
    private int azimuth_;
    private int bitField0_;
    private boolean byMe_;
    private boolean contentScanned_;
    private dx createdByInfo_;
    private long creatorUserId_;
    private long date_;
    private boolean liked_;
    private int likes_;
    private u location_;
    private boolean promoted_;
    private boolean street_;
    private byte memoizedIsInitialized = 2;
    private String id_ = "";

    static {
        ce ceVar = new ce();
        DEFAULT_INSTANCE = ceVar;
        com.google.v.du.registerDefaultInstance(ce.class, ceVar);
    }

    private ce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApproved() {
        this.bitField0_ &= -33;
        this.approved_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzimuth() {
        this.bitField0_ &= -1025;
        this.azimuth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearByMe() {
        this.bitField0_ &= -2049;
        this.byMe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentScanned() {
        this.bitField0_ &= -4097;
        this.contentScanned_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedByInfo() {
        this.createdByInfo_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatorUserId() {
        this.bitField0_ &= -9;
        this.creatorUserId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDate() {
        this.bitField0_ &= -3;
        this.date_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiked() {
        this.bitField0_ &= -257;
        this.liked_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikes() {
        this.bitField0_ &= -129;
        this.likes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromoted() {
        this.bitField0_ &= -65;
        this.promoted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -17;
        this.street_ = false;
    }

    public static ce getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreatedByInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.createdByInfo_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.createdByInfo_ = dxVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.location_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.location_ = uVar;
        this.bitField0_ |= 4;
    }

    public static cd newBuilder() {
        return (cd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ce parseDelimitedFrom(InputStream inputStream) {
        return (ce) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ce parseFrom(com.google.v.v vVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ce> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApproved(boolean z) {
        this.bitField0_ |= 32;
        this.approved_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzimuth(int i2) {
        this.bitField0_ |= 1024;
        this.azimuth_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setByMe(boolean z) {
        this.bitField0_ |= 2048;
        this.byMe_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentScanned(boolean z) {
        this.bitField0_ |= 4096;
        this.contentScanned_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedByInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.createdByInfo_ = dxVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatorUserId(long j2) {
        this.bitField0_ |= 8;
        this.creatorUserId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(long j2) {
        this.bitField0_ |= 2;
        this.date_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiked(boolean z) {
        this.bitField0_ |= 256;
        this.liked_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikes(int i2) {
        this.bitField0_ |= 128;
        this.likes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(u uVar) {
        Objects.requireNonNull(uVar);
        this.location_ = uVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromoted(boolean z) {
        this.bitField0_ |= 64;
        this.promoted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(boolean z) {
        this.bitField0_ |= 16;
        this.street_ = z;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001o\u038d\r\u0000\u0000\u0001oဉ\tpင\nqဇ\u000brဇ\f΅ဈ\u0000Άဂ\u0001·ᐉ\u0002Έဂ\u0003Ήဇ\u0004Ίဇ\u0005\u038bဇ\u0006Όင\u0007\u038dဇ\b", new Object[]{"bitField0_", "createdByInfo_", "azimuth_", "byMe_", "contentScanned_", "id_", "date_", "location_", "creatorUserId_", "street_", "approved_", "promoted_", "likes_", "liked_"});
            case 3:
                return new ce();
            case 4:
                return new cd(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ce> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ce.class) {
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

    public boolean getApproved() {
        return this.approved_;
    }

    public int getAzimuth() {
        return this.azimuth_;
    }

    public boolean getByMe() {
        return this.byMe_;
    }

    public boolean getContentScanned() {
        return this.contentScanned_;
    }

    public dx getCreatedByInfo() {
        dx dxVar = this.createdByInfo_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    public long getCreatorUserId() {
        return this.creatorUserId_;
    }

    public long getDate() {
        return this.date_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    @Deprecated
    public boolean getLiked() {
        return this.liked_;
    }

    @Deprecated
    public int getLikes() {
        return this.likes_;
    }

    public u getLocation() {
        u uVar = this.location_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public boolean getPromoted() {
        return this.promoted_;
    }

    public boolean getStreet() {
        return this.street_;
    }

    public boolean hasApproved() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasAzimuth() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasByMe() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasContentScanned() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasCreatedByInfo() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCreatorUserId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDate() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasLiked() {
        return (this.bitField0_ & 256) != 0;
    }

    @Deprecated
    public boolean hasLikes() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPromoted() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 16) != 0;
    }

    public static cd newBuilder(ce ceVar) {
        return (cd) DEFAULT_INSTANCE.createBuilder(ceVar);
    }

    public static ce parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ce) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ce parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ce parseFrom(com.google.v.z zVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ce parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ce parseFrom(InputStream inputStream) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ce parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ce parseFrom(ByteBuffer byteBuffer) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ce parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ce parseFrom(byte[] bArr) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ce parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
