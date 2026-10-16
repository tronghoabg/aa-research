package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dx extends com.google.v.du<dx, dv> implements com.google.v.fj {
    public static final int APPROVED_VENUES_FIELD_NUMBER = 6;
    public static final int CHANNEL_FIELD_NUMBER = 7;
    private static final dx DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_AD_OPERATOR_FIELD_NUMBER = 11;
    public static final int IS_REGISTERED_FIELD_NUMBER = 9;
    public static final int IS_STAFF_FIELD_NUMBER = 8;
    public static final int IS_SYSTEM_TRUSTED_FIELD_NUMBER = 12;
    public static final int IS_VENUE_MANAGER_FIELD_NUMBER = 13;
    public static final int MOOD_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<dx> PARSER = null;
    public static final int PERSISTENT_ID_FIELD_NUMBER = 10;
    public static final int POINTS_FIELD_NUMBER = 4;
    public static final int RANK_FIELD_NUMBER = 3;
    private int approvedVenues_;
    private int bitField0_;
    private int channel_;
    private long id_;
    private boolean isAdOperator_;
    private boolean isRegistered_;
    private boolean isStaff_;
    private boolean isSystemTrusted_;
    private boolean isVenueManager_;
    private int mood_;
    private String name_ = "";
    private String persistentId_ = "";
    private int points_;
    private int rank_;

    static {
        dx dxVar = new dx();
        DEFAULT_INSTANCE = dxVar;
        com.google.v.du.registerDefaultInstance(dx.class, dxVar);
    }

    private dx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApprovedVenues() {
        this.bitField0_ &= -33;
        this.approvedVenues_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannel() {
        this.bitField0_ &= -65;
        this.channel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdOperator() {
        this.bitField0_ &= -1025;
        this.isAdOperator_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRegistered() {
        this.bitField0_ &= -257;
        this.isRegistered_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsStaff() {
        this.bitField0_ &= -129;
        this.isStaff_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSystemTrusted() {
        this.bitField0_ &= -2049;
        this.isSystemTrusted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVenueManager() {
        this.bitField0_ &= -4097;
        this.isVenueManager_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMood() {
        this.bitField0_ &= -17;
        this.mood_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersistentId() {
        this.bitField0_ &= -513;
        this.persistentId_ = getDefaultInstance().getPersistentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.bitField0_ &= -9;
        this.points_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.bitField0_ &= -5;
        this.rank_ = 0;
    }

    public static dx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dv newBuilder() {
        return (dv) DEFAULT_INSTANCE.createBuilder();
    }

    public static dx parseDelimitedFrom(InputStream inputStream) {
        return (dx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dx parseFrom(com.google.v.v vVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApprovedVenues(int i2) {
        this.bitField0_ |= 32;
        this.approvedVenues_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(dw dwVar) {
        this.channel_ = dwVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdOperator(boolean z) {
        this.bitField0_ |= 1024;
        this.isAdOperator_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRegistered(boolean z) {
        this.bitField0_ |= 256;
        this.isRegistered_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsStaff(boolean z) {
        this.bitField0_ |= 128;
        this.isStaff_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSystemTrusted(boolean z) {
        this.bitField0_ |= 2048;
        this.isSystemTrusted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVenueManager(boolean z) {
        this.bitField0_ |= 4096;
        this.isVenueManager_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMood(int i2) {
        this.bitField0_ |= 16;
        this.mood_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersistentId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.persistentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersistentIdBytes(com.google.v.v vVar) {
        this.persistentId_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(int i2) {
        this.bitField0_ |= 8;
        this.points_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(int i2) {
        this.bitField0_ |= 4;
        this.rank_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007᠌\u0006\bဇ\u0007\tဇ\b\nဈ\t\u000bဇ\n\fဇ\u000b\rဇ\f", new Object[]{"bitField0_", "id_", "name_", "rank_", "points_", "mood_", "approvedVenues_", "channel_", z.t, "isStaff_", "isRegistered_", "persistentId_", "isAdOperator_", "isSystemTrusted_", "isVenueManager_"});
        }
        if (iOrdinal == 3) {
            return new dx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getApprovedVenues() {
        return this.approvedVenues_;
    }

    public dw getChannel() {
        dw dwVarA = dw.a(this.channel_);
        return dwVarA == null ? dw.UNKNOWN : dwVarA;
    }

    public long getId() {
        return this.id_;
    }

    public boolean getIsAdOperator() {
        return this.isAdOperator_;
    }

    public boolean getIsRegistered() {
        return this.isRegistered_;
    }

    public boolean getIsStaff() {
        return this.isStaff_;
    }

    public boolean getIsSystemTrusted() {
        return this.isSystemTrusted_;
    }

    public boolean getIsVenueManager() {
        return this.isVenueManager_;
    }

    public int getMood() {
        return this.mood_;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getPersistentId() {
        return this.persistentId_;
    }

    public com.google.v.v getPersistentIdBytes() {
        return com.google.v.v.s(this.persistentId_);
    }

    public int getPoints() {
        return this.points_;
    }

    public int getRank() {
        return this.rank_;
    }

    public boolean hasApprovedVenues() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasChannel() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsAdOperator() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasIsRegistered() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIsStaff() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIsSystemTrusted() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasIsVenueManager() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasMood() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPersistentId() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasPoints() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRank() {
        return (this.bitField0_ & 4) != 0;
    }

    public static dv newBuilder(dx dxVar) {
        return (dv) DEFAULT_INSTANCE.createBuilder(dxVar);
    }

    public static dx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dx parseFrom(com.google.v.z zVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dx parseFrom(InputStream inputStream) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dx parseFrom(ByteBuffer byteBuffer) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dx parseFrom(byte[] bArr) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
