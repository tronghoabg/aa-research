package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends du<u, p> implements fj {
    public static final int ACHIEVEMENT_FIELD_NUMBER = 6;
    public static final int ACTIVITY_COUNT_FIELD_NUMBER = 11;
    public static final int CURRENT_LEVEL_FIELD_NUMBER = 1;
    private static final u DEFAULT_INSTANCE;
    public static final int LEADERBOARD_FIELD_NUMBER = 12;
    public static final int MOOD_FIELD_NUMBER = 13;
    private static volatile fo<u> PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 2;
    public static final int POINTS_TO_NEXT_REWARD_FIELD_NUMBER = 3;
    public static final int UNSEEN_COUNT_FIELD_NUMBER = 10;
    private eo<b> achievement_ = emptyProtobufList();
    private eo<n> activityCount_ = emptyProtobufList();
    private int bitField0_;
    private ad currentLevel_;
    private r leaderboard_;
    private t mood_;
    private aj pointsToNextReward_;
    private aj points_;
    private int unseenCount_;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAchievement(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureAchievementIsMutable();
        this.achievement_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityCount(int i2, n nVar) {
        Objects.requireNonNull(nVar);
        ensureActivityCountIsMutable();
        this.activityCount_.add(i2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAchievement(Iterable<? extends b> iterable) {
        ensureAchievementIsMutable();
        com.google.v.c.addAll(iterable, this.achievement_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllActivityCount(Iterable<? extends n> iterable) {
        ensureActivityCountIsMutable();
        com.google.v.c.addAll(iterable, this.activityCount_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAchievement() {
        this.achievement_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityCount() {
        this.activityCount_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentLevel() {
        this.currentLevel_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeaderboard() {
        this.leaderboard_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMood() {
        this.mood_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.points_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointsToNextReward() {
        this.pointsToNextReward_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnseenCount() {
        this.bitField0_ &= -9;
        this.unseenCount_ = 0;
    }

    private void ensureAchievementIsMutable() {
        eo<b> eoVar = this.achievement_;
        if (eoVar.c()) {
            return;
        }
        this.achievement_ = du.mutableCopy(eoVar);
    }

    private void ensureActivityCountIsMutable() {
        eo<n> eoVar = this.activityCount_;
        if (eoVar.c()) {
            return;
        }
        this.activityCount_ = du.mutableCopy(eoVar);
    }

    public static u getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentLevel(ad adVar) {
        Objects.requireNonNull(adVar);
        ad adVar2 = this.currentLevel_;
        if (adVar2 != null && adVar2 != ad.getDefaultInstance()) {
            ac acVarNewBuilder = ad.newBuilder(adVar2);
            acVarNewBuilder.mergeFrom((ac) adVar);
            adVar = acVarNewBuilder.buildPartial();
        }
        this.currentLevel_ = adVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLeaderboard(r rVar) {
        Objects.requireNonNull(rVar);
        r rVar2 = this.leaderboard_;
        if (rVar2 != null && rVar2 != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.leaderboard_ = rVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMood(t tVar) {
        Objects.requireNonNull(tVar);
        t tVar2 = this.mood_;
        if (tVar2 != null && tVar2 != t.getDefaultInstance()) {
            s sVarNewBuilder = t.newBuilder(tVar2);
            sVarNewBuilder.mergeFrom((s) tVar);
            tVar = sVarNewBuilder.buildPartial();
        }
        this.mood_ = tVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePoints(aj ajVar) {
        Objects.requireNonNull(ajVar);
        aj ajVar2 = this.points_;
        if (ajVar2 != null && ajVar2 != aj.getDefaultInstance()) {
            ai aiVarNewBuilder = aj.newBuilder(ajVar2);
            aiVarNewBuilder.mergeFrom((ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.points_ = ajVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointsToNextReward(aj ajVar) {
        Objects.requireNonNull(ajVar);
        aj ajVar2 = this.pointsToNextReward_;
        if (ajVar2 != null && ajVar2 != aj.getDefaultInstance()) {
            ai aiVarNewBuilder = aj.newBuilder(ajVar2);
            aiVarNewBuilder.mergeFrom((ai) ajVar);
            ajVar = aiVarNewBuilder.buildPartial();
        }
        this.pointsToNextReward_ = ajVar;
        this.bitField0_ |= 4;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static u parseDelimitedFrom(InputStream inputStream) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(com.google.v.v vVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<u> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAchievement(int i2) {
        ensureAchievementIsMutable();
        this.achievement_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeActivityCount(int i2) {
        ensureActivityCountIsMutable();
        this.activityCount_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAchievement(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureAchievementIsMutable();
        this.achievement_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCount(int i2, n nVar) {
        Objects.requireNonNull(nVar);
        ensureActivityCountIsMutable();
        this.activityCount_.set(i2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentLevel(ad adVar) {
        Objects.requireNonNull(adVar);
        this.currentLevel_ = adVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeaderboard(r rVar) {
        Objects.requireNonNull(rVar);
        this.leaderboard_ = rVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMood(t tVar) {
        Objects.requireNonNull(tVar);
        this.mood_ = tVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.points_ = ajVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsToNextReward(aj ajVar) {
        Objects.requireNonNull(ajVar);
        this.pointsToNextReward_ = ajVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnseenCount(int i2) {
        this.bitField0_ |= 8;
        this.unseenCount_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006\u001b\nင\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005", new Object[]{"bitField0_", "currentLevel_", "points_", "pointsToNextReward_", "achievement_", b.class, "unseenCount_", "activityCount_", n.class, "leaderboard_", "mood_"});
        }
        if (iOrdinal == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new p(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<u> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (u.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getAchievement(int i2) {
        return this.achievement_.get(i2);
    }

    public int getAchievementCount() {
        return this.achievement_.size();
    }

    public List<b> getAchievementList() {
        return this.achievement_;
    }

    public c getAchievementOrBuilder(int i2) {
        return this.achievement_.get(i2);
    }

    public List<? extends c> getAchievementOrBuilderList() {
        return this.achievement_;
    }

    public n getActivityCount(int i2) {
        return this.activityCount_.get(i2);
    }

    public int getActivityCountCount() {
        return this.activityCount_.size();
    }

    public List<n> getActivityCountList() {
        return this.activityCount_;
    }

    public o getActivityCountOrBuilder(int i2) {
        return this.activityCount_.get(i2);
    }

    public List<? extends o> getActivityCountOrBuilderList() {
        return this.activityCount_;
    }

    public ad getCurrentLevel() {
        ad adVar = this.currentLevel_;
        return adVar == null ? ad.getDefaultInstance() : adVar;
    }

    public r getLeaderboard() {
        r rVar = this.leaderboard_;
        return rVar == null ? r.getDefaultInstance() : rVar;
    }

    public t getMood() {
        t tVar = this.mood_;
        return tVar == null ? t.getDefaultInstance() : tVar;
    }

    public aj getPoints() {
        aj ajVar = this.points_;
        return ajVar == null ? aj.getDefaultInstance() : ajVar;
    }

    public aj getPointsToNextReward() {
        aj ajVar = this.pointsToNextReward_;
        return ajVar == null ? aj.getDefaultInstance() : ajVar;
    }

    public int getUnseenCount() {
        return this.unseenCount_;
    }

    public boolean hasCurrentLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLeaderboard() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMood() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPoints() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPointsToNextReward() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUnseenCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public static p newBuilder(u uVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(uVar);
    }

    public static u parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(com.google.v.v vVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static u parseFrom(com.google.v.z zVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static u parseFrom(com.google.v.z zVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAchievement(b bVar) {
        Objects.requireNonNull(bVar);
        ensureAchievementIsMutable();
        this.achievement_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityCount(n nVar) {
        Objects.requireNonNull(nVar);
        ensureActivityCountIsMutable();
        this.activityCount_.add(nVar);
    }

    public static u parseFrom(InputStream inputStream) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(InputStream inputStream, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(ByteBuffer byteBuffer) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static u parseFrom(byte[] bArr) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static u parseFrom(byte[] bArr, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
