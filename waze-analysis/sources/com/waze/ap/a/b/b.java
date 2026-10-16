package com.waze.ap.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends du<b, a> implements c {
    public static final int AWAY_SCORE_FIELD_NUMBER = 6;
    public static final int AWAY_TEAM_FIELD_NUMBER = 4;
    private static final b DEFAULT_INSTANCE;
    public static final int HOME_SCORE_FIELD_NUMBER = 5;
    public static final int HOME_TEAM_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LAST_UPDATED_TIMESTAMP_SECS_FIELD_NUMBER = 10;
    public static final int LATEST_EVENTS_FIELD_NUMBER = 8;
    public static final int MATCH_CLOCK_FIELD_NUMBER = 7;
    private static volatile fo<b> PARSER = null;
    public static final int SPORT_FIELD_NUMBER = 2;
    private w awayTeam_;
    private int bitField0_;
    private w homeTeam_;
    private long lastUpdatedTimestampSecs_;
    private int sport_;
    private String id_ = "";
    private String homeScore_ = "";
    private String awayScore_ = "";
    private String matchClock_ = "";
    private eo<f> latestEvents_ = emptyProtobufList();

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLatestEvents(Iterable<? extends f> iterable) {
        ensureLatestEventsIsMutable();
        com.google.v.c.addAll(iterable, this.latestEvents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLatestEvents(int i2, f fVar) {
        Objects.requireNonNull(fVar);
        ensureLatestEventsIsMutable();
        this.latestEvents_.add(i2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAwayScore() {
        this.awayScore_ = getDefaultInstance().getAwayScore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAwayTeam() {
        this.awayTeam_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHomeScore() {
        this.homeScore_ = getDefaultInstance().getHomeScore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHomeTeam() {
        this.homeTeam_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdatedTimestampSecs() {
        this.lastUpdatedTimestampSecs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatestEvents() {
        this.latestEvents_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatchClock() {
        this.matchClock_ = getDefaultInstance().getMatchClock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSport() {
        this.sport_ = 0;
    }

    private void ensureLatestEventsIsMutable() {
        eo<f> eoVar = this.latestEvents_;
        if (eoVar.c()) {
            return;
        }
        this.latestEvents_ = du.mutableCopy(eoVar);
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAwayTeam(w wVar) {
        Objects.requireNonNull(wVar);
        w wVar2 = this.awayTeam_;
        if (wVar2 != null && wVar2 != w.getDefaultInstance()) {
            v vVarNewBuilder = w.newBuilder(wVar2);
            vVarNewBuilder.mergeFrom((v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.awayTeam_ = wVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHomeTeam(w wVar) {
        Objects.requireNonNull(wVar);
        w wVar2 = this.homeTeam_;
        if (wVar2 != null && wVar2 != w.getDefaultInstance()) {
            v vVarNewBuilder = w.newBuilder(wVar2);
            vVarNewBuilder.mergeFrom((v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.homeTeam_ = wVar;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLatestEvents(int i2) {
        ensureLatestEventsIsMutable();
        this.latestEvents_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAwayScore(String str) {
        Objects.requireNonNull(str);
        this.awayScore_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAwayScoreBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.awayScore_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAwayTeam(w wVar) {
        Objects.requireNonNull(wVar);
        this.awayTeam_ = wVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHomeScore(String str) {
        Objects.requireNonNull(str);
        this.homeScore_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHomeScoreBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.homeScore_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHomeTeam(w wVar) {
        Objects.requireNonNull(wVar);
        this.homeTeam_ = wVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdatedTimestampSecs(long j2) {
        this.lastUpdatedTimestampSecs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestEvents(int i2, f fVar) {
        Objects.requireNonNull(fVar);
        ensureLatestEventsIsMutable();
        this.latestEvents_.set(i2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchClock(String str) {
        Objects.requireNonNull(str);
        this.matchClock_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchClockBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.matchClock_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSport(u uVar) {
        this.sport_ = uVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportValue(int i2) {
        this.sport_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u001b\n\u0002", new Object[]{"bitField0_", "id_", "sport_", "homeTeam_", "awayTeam_", "homeScore_", "awayScore_", "matchClock_", "latestEvents_", f.class, "lastUpdatedTimestampSecs_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAwayScore() {
        return this.awayScore_;
    }

    public com.google.v.v getAwayScoreBytes() {
        return com.google.v.v.s(this.awayScore_);
    }

    public w getAwayTeam() {
        w wVar = this.awayTeam_;
        return wVar == null ? w.getDefaultInstance() : wVar;
    }

    public String getHomeScore() {
        return this.homeScore_;
    }

    public com.google.v.v getHomeScoreBytes() {
        return com.google.v.v.s(this.homeScore_);
    }

    public w getHomeTeam() {
        w wVar = this.homeTeam_;
        return wVar == null ? w.getDefaultInstance() : wVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public long getLastUpdatedTimestampSecs() {
        return this.lastUpdatedTimestampSecs_;
    }

    public f getLatestEvents(int i2) {
        return this.latestEvents_.get(i2);
    }

    public int getLatestEventsCount() {
        return this.latestEvents_.size();
    }

    public List<f> getLatestEventsList() {
        return this.latestEvents_;
    }

    public g getLatestEventsOrBuilder(int i2) {
        return this.latestEvents_.get(i2);
    }

    public List<? extends g> getLatestEventsOrBuilderList() {
        return this.latestEvents_;
    }

    public String getMatchClock() {
        return this.matchClock_;
    }

    public com.google.v.v getMatchClockBytes() {
        return com.google.v.v.s(this.matchClock_);
    }

    public u getSport() {
        int i2 = this.sport_;
        u uVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : u.SPORT_AMERICAN_FOOTBALL : u.SPORT_BASKETBALL : u.SPORT_SOCCER : u.SPORT_UNKNOWN;
        return uVar == null ? u.UNRECOGNIZED : uVar;
    }

    public int getSportValue() {
        return this.sport_;
    }

    public boolean hasAwayTeam() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHomeTeam() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLatestEvents(f fVar) {
        Objects.requireNonNull(fVar);
        ensureLatestEventsIsMutable();
        this.latestEvents_.add(fVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
