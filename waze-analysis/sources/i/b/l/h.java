package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h extends com.google.v.du<h, d> implements com.google.v.fj {
    public static final int ACQUAINTANCE_FIELD_NUMBER = 10216;
    public static final int ADDON_FIELD_NUMBER = 10207;
    public static final int CAN_PING_FIELD_NUMBER = 10212;
    public static final int CAN_PRIVATE_MESSAGE_FIELD_NUMBER = 10213;
    public static final int CAPABILITIES_FIELD_NUMBER = 10211;
    private static final h DEFAULT_INSTANCE;
    public static final int FIRSTNAME_FIELD_NUMBER = 10217;
    public static final int FREE_TEXT_FIELD_NUMBER = 6;
    public static final int FRIENDSHIP_FIELD_NUMBER = 10215;
    public static final int GPS_SAMPLE_FIELD_NUMBER = 10205;
    public static final int GROUP_FIELD_NUMBER = 10214;
    public static final int ID_FIELD_NUMBER = 10202;
    public static final int JOIN_DATE_SEC_FIELD_NUMBER = 10210;
    public static final int LASTNAME_FIELD_NUMBER = 10218;
    public static final int MAPNAME_FIELD_NUMBER = 10203;
    public static final int MODE_FIELD_NUMBER = 10201;
    public static final int MOOD_FIELD_NUMBER = 10206;
    private static volatile com.google.v.fo<h> PARSER = null;
    public static final int PERSISTENT_ID_FIELD_NUMBER = 10204;
    public static final int POINTS_FIELD_NUMBER = 10209;
    public static final int RANK_FIELD_NUMBER = 10208;
    public static final int SOCIAL_INFO_FIELD_NUMBER = 10222;
    public static final int SOCIAL_PRIORITY_FIELD_NUMBER = 10219;
    private c acquaintance_;
    private int addon_;
    private int bitField0_;
    private boolean canPing_;
    private boolean canPrivateMessage_;
    private int capabilities_;
    private n friendship_;
    private i.b.z gpsSample_;
    private q group_;
    private i.b.aq id_;
    private int joinDateSec_;
    private int mode_;
    private int mood_;
    private int points_;
    private int rank_;
    private y socialInfo_;
    private int socialPriority_;
    private String mapName_ = "";
    private String firstName_ = "";
    private String lastName_ = "";
    private String freeText_ = "";
    private String persistentId_ = "";

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.v.du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcquaintance() {
        this.acquaintance_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddon() {
        this.bitField0_ &= -513;
        this.addon_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPing() {
        this.bitField0_ &= -16385;
        this.canPing_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPrivateMessage() {
        this.bitField0_ &= -32769;
        this.canPrivateMessage_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCapabilities() {
        this.bitField0_ &= -8193;
        this.capabilities_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstName() {
        this.bitField0_ &= -9;
        this.firstName_ = getDefaultInstance().getFirstName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeText() {
        this.bitField0_ &= -33;
        this.freeText_ = getDefaultInstance().getFreeText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFriendship() {
        this.friendship_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsSample() {
        this.gpsSample_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroup() {
        this.group_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinDateSec() {
        this.bitField0_ &= -4097;
        this.joinDateSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastName() {
        this.bitField0_ &= -17;
        this.lastName_ = getDefaultInstance().getLastName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapName() {
        this.bitField0_ &= -5;
        this.mapName_ = getDefaultInstance().getMapName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.bitField0_ &= -2;
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMood() {
        this.bitField0_ &= -257;
        this.mood_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersistentId() {
        this.bitField0_ &= -65;
        this.persistentId_ = getDefaultInstance().getPersistentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.bitField0_ &= -2049;
        this.points_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.bitField0_ &= -1025;
        this.rank_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSocialInfo() {
        this.socialInfo_ = null;
        this.bitField0_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSocialPriority() {
        this.bitField0_ &= -524289;
        this.socialPriority_ = 0;
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAcquaintance(c cVar) {
        Objects.requireNonNull(cVar);
        c cVar2 = this.acquaintance_;
        if (cVar2 != null && cVar2 != c.getDefaultInstance()) {
            a aVarNewBuilder = c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.acquaintance_ = cVar;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFriendship(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.friendship_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            j jVarNewBuilder = n.newBuilder(nVar2);
            jVarNewBuilder.mergeFrom((j) nVar);
            nVar = jVarNewBuilder.buildPartial();
        }
        this.friendship_ = nVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGpsSample(i.b.z zVar) {
        Objects.requireNonNull(zVar);
        i.b.z zVar2 = this.gpsSample_;
        if (zVar2 != null && zVar2 != i.b.z.getDefaultInstance()) {
            i.b.y yVarNewBuilder = i.b.z.newBuilder(zVar2);
            yVarNewBuilder.mergeFrom((i.b.y) zVar);
            zVar = yVarNewBuilder.buildPartial();
        }
        this.gpsSample_ = zVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroup(q qVar) {
        Objects.requireNonNull(qVar);
        q qVar2 = this.group_;
        if (qVar2 != null && qVar2 != q.getDefaultInstance()) {
            o oVarNewBuilder = q.newBuilder(qVar2);
            oVarNewBuilder.mergeFrom((o) qVar);
            qVar = oVarNewBuilder.buildPartial();
        }
        this.group_ = qVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeId(i.b.aq aqVar) {
        Objects.requireNonNull(aqVar);
        i.b.aq aqVar2 = this.id_;
        if (aqVar2 != null && aqVar2 != i.b.aq.getDefaultInstance()) {
            i.b.ap apVarNewBuilder = i.b.aq.newBuilder(aqVar2);
            apVarNewBuilder.mergeFrom((i.b.ap) aqVar);
            aqVar = apVarNewBuilder.buildPartial();
        }
        this.id_ = aqVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSocialInfo(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.socialInfo_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.socialInfo_ = yVar;
        this.bitField0_ |= 1048576;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(com.google.v.v vVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcquaintance(c cVar) {
        Objects.requireNonNull(cVar);
        this.acquaintance_ = cVar;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddon(f fVar) {
        this.addon_ = fVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPing(boolean z) {
        this.bitField0_ |= 16384;
        this.canPing_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPrivateMessage(boolean z) {
        this.bitField0_ |= 32768;
        this.canPrivateMessage_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCapabilities(int i2) {
        this.bitField0_ |= 8192;
        this.capabilities_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.firstName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstNameBytes(com.google.v.v vVar) {
        this.firstName_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.freeText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeTextBytes(com.google.v.v vVar) {
        this.freeText_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFriendship(n nVar) {
        Objects.requireNonNull(nVar);
        this.friendship_ = nVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsSample(i.b.z zVar) {
        Objects.requireNonNull(zVar);
        this.gpsSample_ = zVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroup(q qVar) {
        Objects.requireNonNull(qVar);
        this.group_ = qVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(i.b.aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.id_ = aqVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinDateSec(int i2) {
        this.bitField0_ |= 4096;
        this.joinDateSec_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.lastName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastNameBytes(com.google.v.v vVar) {
        this.lastName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.mapName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapNameBytes(com.google.v.v vVar) {
        this.mapName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(g gVar) {
        this.mode_ = gVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMood(int i2) {
        this.bitField0_ |= 256;
        this.mood_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersistentId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.persistentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersistentIdBytes(com.google.v.v vVar) {
        this.persistentId_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(int i2) {
        this.bitField0_ |= 2048;
        this.points_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(int i2) {
        this.bitField0_ |= 1024;
        this.rank_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSocialInfo(y yVar) {
        Objects.requireNonNull(yVar);
        this.socialInfo_ = yVar;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSocialPriority(int i2) {
        this.bitField0_ |= 524288;
        this.socialPriority_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0006⟮\u0015\u0000\u0000\u0000\u0006ဈ\u0005⟙᠌\u0000⟚ဉ\u0001⟛ဈ\u0002⟜ဈ\u0006⟝ဉ\u0007⟞င\b⟟᠌\t⟠င\n⟡င\u000b⟢င\f⟣င\r⟤ဇ\u000e⟥ဇ\u000f⟦ဉ\u0010⟧ဉ\u0011⟨ဉ\u0012⟩ဈ\u0003⟪ဈ\u0004⟫င\u0013⟮ဉ\u0014", new Object[]{"bitField0_", "freeText_", "mode_", e.f48656c, "id_", "mapName_", "persistentId_", "gpsSample_", "mood_", "addon_", e.f48654a, "rank_", "points_", "joinDateSec_", "capabilities_", "canPing_", "canPrivateMessage_", "group_", "friendship_", "acquaintance_", "firstName_", "lastName_", "socialPriority_", "socialInfo_"});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getAcquaintance() {
        c cVar = this.acquaintance_;
        return cVar == null ? c.getDefaultInstance() : cVar;
    }

    public f getAddon() {
        f fVarA = f.a(this.addon_);
        return fVarA == null ? f.NONE : fVarA;
    }

    public boolean getCanPing() {
        return this.canPing_;
    }

    public boolean getCanPrivateMessage() {
        return this.canPrivateMessage_;
    }

    public int getCapabilities() {
        return this.capabilities_;
    }

    public String getFirstName() {
        return this.firstName_;
    }

    public com.google.v.v getFirstNameBytes() {
        return com.google.v.v.s(this.firstName_);
    }

    public String getFreeText() {
        return this.freeText_;
    }

    public com.google.v.v getFreeTextBytes() {
        return com.google.v.v.s(this.freeText_);
    }

    public n getFriendship() {
        n nVar = this.friendship_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public i.b.z getGpsSample() {
        i.b.z zVar = this.gpsSample_;
        return zVar == null ? i.b.z.getDefaultInstance() : zVar;
    }

    @Deprecated
    public q getGroup() {
        q qVar = this.group_;
        return qVar == null ? q.getDefaultInstance() : qVar;
    }

    public i.b.aq getId() {
        i.b.aq aqVar = this.id_;
        return aqVar == null ? i.b.aq.getDefaultInstance() : aqVar;
    }

    public int getJoinDateSec() {
        return this.joinDateSec_;
    }

    public String getLastName() {
        return this.lastName_;
    }

    public com.google.v.v getLastNameBytes() {
        return com.google.v.v.s(this.lastName_);
    }

    public String getMapName() {
        return this.mapName_;
    }

    public com.google.v.v getMapNameBytes() {
        return com.google.v.v.s(this.mapName_);
    }

    public g getMode() {
        g gVarA = g.a(this.mode_);
        return gVarA == null ? g.UNKNOWN : gVarA;
    }

    public int getMood() {
        return this.mood_;
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

    public y getSocialInfo() {
        y yVar = this.socialInfo_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public int getSocialPriority() {
        return this.socialPriority_;
    }

    public boolean hasAcquaintance() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasAddon() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCanPing() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasCanPrivateMessage() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasCapabilities() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasFirstName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFreeText() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFriendship() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasGpsSample() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasGroup() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasJoinDateSec() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasLastName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMapName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMood() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasPersistentId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPoints() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasRank() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasSocialInfo() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasSocialPriority() {
        return (this.bitField0_ & 524288) != 0;
    }

    public static d newBuilder(h hVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(com.google.v.z zVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (h) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
