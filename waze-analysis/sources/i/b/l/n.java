package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class n extends com.google.v.du<n, j> implements com.google.v.fj {
    public static final int ACQUAINTANCETYPE_FIELD_NUMBER = 10242;
    public static final int COMMUNITY_FIELD_NUMBER = 10238;
    private static final n DEFAULT_INSTANCE;
    public static final int ETA_SEC_FIELD_NUMBER = 10241;
    public static final int IS_ONLINE_FIELD_NUMBER = 10233;
    public static final int IS_PARKED_FIELD_NUMBER = 10234;
    public static final int MEETING_DESTINATION_FIELD_NUMBER = 10240;
    public static final int MUTUAL_FRIEND_FIELD_NUMBER = 10237;
    private static volatile com.google.v.fo<n> PARSER = null;
    public static final int SAME_DRIVING_DESTINATION_FIELD_NUMBER = 10239;
    public static final int SHARED_MEETING_FROM_ME_FIELD_NUMBER = 10243;
    public static final int SHARED_MEETING_TO_ME_FIELD_NUMBER = 10244;
    public static final int STATUS_FIELD_NUMBER = 10235;
    public static final int TYPE_FIELD_NUMBER = 10231;
    public static final int WATCHED_ME_TIME_AGO_SEC_FIELD_NUMBER = 10245;
    private int acquaintanceType_;
    private int bitField0_;
    private int etaSec_;
    private boolean isOnline_;
    private boolean isParked_;
    private int meetingDestination_;
    private int sameDrivingDestination_;
    private aa status_;
    private int type_;
    private int watchedMeTimeAgoSec_;
    private com.google.v.eo<i.b.p.o> community_ = emptyProtobufList();
    private com.google.v.eo<s> mutualFriend_ = emptyProtobufList();
    private String sharedMeetingFromMe_ = "";
    private String sharedMeetingToMe_ = "";

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        com.google.v.du.registerDefaultInstance(n.class, nVar);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommunity(Iterable<? extends i.b.p.o> iterable) {
        ensureCommunityIsMutable();
        com.google.v.c.addAll(iterable, this.community_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMutualFriend(Iterable<? extends s> iterable) {
        ensureMutualFriendIsMutable();
        com.google.v.c.addAll(iterable, this.mutualFriend_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommunity(int i2, i.b.p.o oVar) {
        Objects.requireNonNull(oVar);
        ensureCommunityIsMutable();
        this.community_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMutualFriend(int i2, s sVar) {
        Objects.requireNonNull(sVar);
        ensureMutualFriendIsMutable();
        this.mutualFriend_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcquaintanceType() {
        this.bitField0_ &= -129;
        this.acquaintanceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.community_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaSec() {
        this.bitField0_ &= -65;
        this.etaSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOnline() {
        this.bitField0_ &= -3;
        this.isOnline_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsParked() {
        this.bitField0_ &= -5;
        this.isParked_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetingDestination() {
        this.bitField0_ &= -33;
        this.meetingDestination_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMutualFriend() {
        this.mutualFriend_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSameDrivingDestination() {
        this.bitField0_ &= -17;
        this.sameDrivingDestination_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharedMeetingFromMe() {
        this.bitField0_ &= -257;
        this.sharedMeetingFromMe_ = getDefaultInstance().getSharedMeetingFromMe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharedMeetingToMe() {
        this.bitField0_ &= -513;
        this.sharedMeetingToMe_ = getDefaultInstance().getSharedMeetingToMe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchedMeTimeAgoSec() {
        this.bitField0_ &= -1025;
        this.watchedMeTimeAgoSec_ = 0;
    }

    private void ensureCommunityIsMutable() {
        com.google.v.eo<i.b.p.o> eoVar = this.community_;
        if (eoVar.c()) {
            return;
        }
        this.community_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureMutualFriendIsMutable() {
        com.google.v.eo<s> eoVar = this.mutualFriend_;
        if (eoVar.c()) {
            return;
        }
        this.mutualFriend_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static n getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(aa aaVar) {
        Objects.requireNonNull(aaVar);
        aa aaVar2 = this.status_;
        if (aaVar2 != null && aaVar2 != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder(aaVar2);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.status_ = aaVar;
        this.bitField0_ |= 8;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static n parseDelimitedFrom(InputStream inputStream) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(com.google.v.v vVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<n> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCommunity(int i2) {
        ensureCommunityIsMutable();
        this.community_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMutualFriend(int i2) {
        ensureMutualFriendIsMutable();
        this.mutualFriend_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcquaintanceType(i iVar) {
        this.acquaintanceType_ = iVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(int i2, i.b.p.o oVar) {
        Objects.requireNonNull(oVar);
        ensureCommunityIsMutable();
        this.community_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaSec(int i2) {
        this.bitField0_ |= 64;
        this.etaSec_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOnline(boolean z) {
        this.bitField0_ |= 2;
        this.isOnline_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsParked(boolean z) {
        this.bitField0_ |= 4;
        this.isParked_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetingDestination(l lVar) {
        this.meetingDestination_ = lVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMutualFriend(int i2, s sVar) {
        Objects.requireNonNull(sVar);
        ensureMutualFriendIsMutable();
        this.mutualFriend_.set(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSameDrivingDestination(k kVar) {
        this.sameDrivingDestination_ = kVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedMeetingFromMe(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.sharedMeetingFromMe_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedMeetingFromMeBytes(com.google.v.v vVar) {
        this.sharedMeetingFromMe_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedMeetingToMe(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.sharedMeetingToMe_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedMeetingToMeBytes(com.google.v.v vVar) {
        this.sharedMeetingToMe_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.status_ = aaVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(m mVar) {
        this.type_ = mVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchedMeTimeAgoSec(int i2) {
        this.bitField0_ |= 1024;
        this.watchedMeTimeAgoSec_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001⟷⠅\r\u0000\u0002\u0000⟷᠌\u0000⟹ဇ\u0001⟺ဇ\u0002⟻ဉ\u0003⟽\u001b⟾\u001b⟿᠌\u0004⠀᠌\u0005⠁င\u0006⠂᠌\u0007⠃ဈ\b⠄ဈ\t⠅င\n", new Object[]{"bitField0_", "type_", e.f48660g, "isOnline_", "isParked_", "status_", "mutualFriend_", s.class, "community_", i.b.p.o.class, "sameDrivingDestination_", e.f48658e, "meetingDestination_", e.f48659f, "etaSec_", "acquaintanceType_", e.f48657d, "sharedMeetingFromMe_", "sharedMeetingToMe_", "watchedMeTimeAgoSec_"});
        }
        if (iOrdinal == 3) {
            return new n();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<n> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (n.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getAcquaintanceType() {
        i iVarA = i.a(this.acquaintanceType_);
        return iVarA == null ? i.ACQUAINTANCE_UNKNOWN : iVarA;
    }

    public i.b.p.o getCommunity(int i2) {
        return this.community_.get(i2);
    }

    public int getCommunityCount() {
        return this.community_.size();
    }

    public List<i.b.p.o> getCommunityList() {
        return this.community_;
    }

    public i.b.p.p getCommunityOrBuilder(int i2) {
        return this.community_.get(i2);
    }

    public List<? extends i.b.p.p> getCommunityOrBuilderList() {
        return this.community_;
    }

    public int getEtaSec() {
        return this.etaSec_;
    }

    public boolean getIsOnline() {
        return this.isOnline_;
    }

    public boolean getIsParked() {
        return this.isParked_;
    }

    public l getMeetingDestination() {
        l lVarA = l.a(this.meetingDestination_);
        return lVarA == null ? l.SHARED_DRIVE_STATUS_UNKNOWN : lVarA;
    }

    public s getMutualFriend(int i2) {
        return this.mutualFriend_.get(i2);
    }

    public int getMutualFriendCount() {
        return this.mutualFriend_.size();
    }

    public List<s> getMutualFriendList() {
        return this.mutualFriend_;
    }

    public t getMutualFriendOrBuilder(int i2) {
        return this.mutualFriend_.get(i2);
    }

    public List<? extends t> getMutualFriendOrBuilderList() {
        return this.mutualFriend_;
    }

    public k getSameDrivingDestination() {
        k kVarA = k.a(this.sameDrivingDestination_);
        return kVarA == null ? k.SAME_DEST_STATUS_UNKNOWN : kVarA;
    }

    public String getSharedMeetingFromMe() {
        return this.sharedMeetingFromMe_;
    }

    public com.google.v.v getSharedMeetingFromMeBytes() {
        return com.google.v.v.s(this.sharedMeetingFromMe_);
    }

    public String getSharedMeetingToMe() {
        return this.sharedMeetingToMe_;
    }

    public com.google.v.v getSharedMeetingToMeBytes() {
        return com.google.v.v.s(this.sharedMeetingToMe_);
    }

    public aa getStatus() {
        aa aaVar = this.status_;
        return aaVar == null ? aa.getDefaultInstance() : aaVar;
    }

    public m getType() {
        m mVarA = m.a(this.type_);
        return mVarA == null ? m.UNKNOWN : mVarA;
    }

    public int getWatchedMeTimeAgoSec() {
        return this.watchedMeTimeAgoSec_;
    }

    public boolean hasAcquaintanceType() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasEtaSec() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasIsOnline() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsParked() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMeetingDestination() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSameDrivingDestination() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSharedMeetingFromMe() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasSharedMeetingToMe() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWatchedMeTimeAgoSec() {
        return (this.bitField0_ & 1024) != 0;
    }

    public static j newBuilder(n nVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(nVar);
    }

    public static n parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (n) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static n parseFrom(com.google.v.z zVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static n parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommunity(i.b.p.o oVar) {
        Objects.requireNonNull(oVar);
        ensureCommunityIsMutable();
        this.community_.add(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMutualFriend(s sVar) {
        Objects.requireNonNull(sVar);
        ensureMutualFriendIsMutable();
        this.mutualFriend_.add(sVar);
    }

    public static n parseFrom(InputStream inputStream) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static n parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static n parseFrom(ByteBuffer byteBuffer) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static n parseFrom(byte[] bArr) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static n parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (n) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
