package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends du<k, j> implements fj {
    private static final k DEFAULT_INSTANCE;
    private static volatile fo<k> PARSER = null;
    public static final int RETURN_ACHIEVEMENTS_INFO_FIELD_NUMBER = 4;
    public static final int RETURN_ACTIVITY_COUNTS_FIELD_NUMBER = 9;
    public static final int RETURN_ALL_ACHIEVEMENTS_FIELD_NUMBER = 8;
    public static final int RETURN_LEADERBOARD_INFO_FIELD_NUMBER = 10;
    public static final int RETURN_LEVEL_INFO_FIELD_NUMBER = 1;
    public static final int RETURN_MOOD_INFO_FIELD_NUMBER = 11;
    public static final int RETURN_POINTS_INFO_FIELD_NUMBER = 2;
    public static final int RETURN_UNSEEN_COUNT_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean returnAchievementsInfo_;
    private boolean returnActivityCounts_;
    private boolean returnAllAchievements_;
    private boolean returnLeaderboardInfo_;
    private boolean returnLevelInfo_;
    private boolean returnMoodInfo_;
    private boolean returnPointsInfo_;
    private boolean returnUnseenCount_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnAchievementsInfo() {
        this.bitField0_ &= -5;
        this.returnAchievementsInfo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnActivityCounts() {
        this.bitField0_ &= -33;
        this.returnActivityCounts_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnAllAchievements() {
        this.bitField0_ &= -17;
        this.returnAllAchievements_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnLeaderboardInfo() {
        this.bitField0_ &= -65;
        this.returnLeaderboardInfo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnLevelInfo() {
        this.bitField0_ &= -2;
        this.returnLevelInfo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnMoodInfo() {
        this.bitField0_ &= -129;
        this.returnMoodInfo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnPointsInfo() {
        this.bitField0_ &= -3;
        this.returnPointsInfo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnUnseenCount() {
        this.bitField0_ &= -9;
        this.returnUnseenCount_ = false;
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnAchievementsInfo(boolean z) {
        this.bitField0_ |= 4;
        this.returnAchievementsInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnActivityCounts(boolean z) {
        this.bitField0_ |= 32;
        this.returnActivityCounts_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnAllAchievements(boolean z) {
        this.bitField0_ |= 16;
        this.returnAllAchievements_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnLeaderboardInfo(boolean z) {
        this.bitField0_ |= 64;
        this.returnLeaderboardInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnLevelInfo(boolean z) {
        this.bitField0_ |= 1;
        this.returnLevelInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnMoodInfo(boolean z) {
        this.bitField0_ |= 128;
        this.returnMoodInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnPointsInfo(boolean z) {
        this.bitField0_ |= 2;
        this.returnPointsInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnUnseenCount(boolean z) {
        this.bitField0_ |= 8;
        this.returnUnseenCount_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0002\u0007ဇ\u0003\bဇ\u0004\tဇ\u0005\nဇ\u0006\u000bဇ\u0007", new Object[]{"bitField0_", "returnLevelInfo_", "returnPointsInfo_", "returnAchievementsInfo_", "returnUnseenCount_", "returnAllAchievements_", "returnActivityCounts_", "returnLeaderboardInfo_", "returnMoodInfo_"});
        }
        if (iOrdinal == 3) {
            return new k();
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
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getReturnAchievementsInfo() {
        return this.returnAchievementsInfo_;
    }

    public boolean getReturnActivityCounts() {
        return this.returnActivityCounts_;
    }

    public boolean getReturnAllAchievements() {
        return this.returnAllAchievements_;
    }

    public boolean getReturnLeaderboardInfo() {
        return this.returnLeaderboardInfo_;
    }

    public boolean getReturnLevelInfo() {
        return this.returnLevelInfo_;
    }

    public boolean getReturnMoodInfo() {
        return this.returnMoodInfo_;
    }

    public boolean getReturnPointsInfo() {
        return this.returnPointsInfo_;
    }

    public boolean getReturnUnseenCount() {
        return this.returnUnseenCount_;
    }

    public boolean hasReturnAchievementsInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasReturnActivityCounts() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasReturnAllAchievements() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasReturnLeaderboardInfo() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasReturnLevelInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReturnMoodInfo() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasReturnPointsInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasReturnUnseenCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(com.google.v.z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(com.google.v.z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
