package com.waze.ap.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t extends du<t, s> implements fj {
    private static final t DEFAULT_INSTANCE;
    private static volatile fo<t> PARSER = null;
    public static final int PRIMARY_PLAYER_FIELD_NUMBER = 1;
    public static final int SCORING_TEAM_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private i primaryPlayer_;
    private String scoringTeamId_ = "";

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        du.registerDefaultInstance(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryPlayer() {
        this.primaryPlayer_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScoringTeamId() {
        this.scoringTeamId_ = getDefaultInstance().getScoringTeamId();
    }

    public static t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrimaryPlayer(i iVar) {
        Objects.requireNonNull(iVar);
        i iVar2 = this.primaryPlayer_;
        if (iVar2 != null && iVar2 != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.primaryPlayer_ = iVar;
        this.bitField0_ |= 1;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static t parseDelimitedFrom(InputStream inputStream) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(com.google.v.v vVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<t> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryPlayer(i iVar) {
        Objects.requireNonNull(iVar);
        this.primaryPlayer_ = iVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScoringTeamId(String str) {
        Objects.requireNonNull(str);
        this.scoringTeamId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScoringTeamIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.scoringTeamId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "primaryPlayer_", "scoringTeamId_"});
        }
        if (iOrdinal == 3) {
            return new t();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new s(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<t> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (t.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getPrimaryPlayer() {
        i iVar = this.primaryPlayer_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public String getScoringTeamId() {
        return this.scoringTeamId_;
    }

    public com.google.v.v getScoringTeamIdBytes() {
        return com.google.v.v.s(this.scoringTeamId_);
    }

    public boolean hasPrimaryPlayer() {
        return (this.bitField0_ & 1) != 0;
    }

    public static s newBuilder(t tVar) {
        return (s) DEFAULT_INSTANCE.createBuilder(tVar);
    }

    public static t parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(com.google.v.v vVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static t parseFrom(z zVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static t parseFrom(z zVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static t parseFrom(InputStream inputStream) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(InputStream inputStream, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(ByteBuffer byteBuffer) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static t parseFrom(byte[] bArr) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static t parseFrom(byte[] bArr, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
