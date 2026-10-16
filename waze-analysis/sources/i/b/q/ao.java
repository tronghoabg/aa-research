package i.b.q;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ao extends du<ao, an> implements fj {
    public static final int CONFIG_FIELD_NUMBER = 2;
    private static final ao DEFAULT_INSTANCE;
    public static final int DEST_SUGGESTIONS_SCORE_THRESHOLD_FIELD_NUMBER = 5;
    public static final int FUTURE_DRIVE_MAX_LOOK_BACK_MILLIS_FIELD_NUMBER = 7;
    public static final int FUTURE_DRIVE_MAX_LOOK_FORWARD_MILLIS_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MAX_SUGGESTIONS_COUNT_FIELD_NUMBER = 4;
    private static volatile fo<ao> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int SUGGEST_ETA_CHECKS_FIELD_NUMBER = 6;
    public static final int USE_PERSONALIZE_ETA_FIELD_NUMBER = 10;
    private int bitField0_;
    private i.b.am config_;
    private double destSuggestionsScoreThreshold_;
    private long futureDriveMaxLookBackMillis_;
    private long futureDriveMaxLookForwardMillis_;
    private long id_;
    private int maxSuggestionsCount_;
    private String sessionId_ = "";
    private boolean suggestEtaChecks_;
    private boolean usePersonalizeEta_;

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestSuggestionsScoreThreshold() {
        this.bitField0_ &= -17;
        this.destSuggestionsScoreThreshold_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFutureDriveMaxLookBackMillis() {
        this.bitField0_ &= -65;
        this.futureDriveMaxLookBackMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFutureDriveMaxLookForwardMillis() {
        this.bitField0_ &= -129;
        this.futureDriveMaxLookForwardMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxSuggestionsCount() {
        this.bitField0_ &= -9;
        this.maxSuggestionsCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -5;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestEtaChecks() {
        this.bitField0_ &= -33;
        this.suggestEtaChecks_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsePersonalizeEta() {
        this.bitField0_ &= -257;
        this.usePersonalizeEta_ = false;
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfig(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        i.b.am amVar2 = this.config_;
        if (amVar2 != null && amVar2 != i.b.am.getDefaultInstance()) {
            i.b.al alVarNewBuilder = i.b.am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((i.b.al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.config_ = amVar;
        this.bitField0_ |= 2;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(i.b.am amVar) {
        Objects.requireNonNull(amVar);
        this.config_ = amVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestSuggestionsScoreThreshold(double d2) {
        this.bitField0_ |= 16;
        this.destSuggestionsScoreThreshold_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFutureDriveMaxLookBackMillis(long j2) {
        this.bitField0_ |= 64;
        this.futureDriveMaxLookBackMillis_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFutureDriveMaxLookForwardMillis(long j2) {
        this.bitField0_ |= 128;
        this.futureDriveMaxLookForwardMillis_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSuggestionsCount(int i2) {
        this.bitField0_ |= 8;
        this.maxSuggestionsCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(com.google.v.v vVar) {
        this.sessionId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestEtaChecks(boolean z) {
        this.bitField0_ |= 32;
        this.suggestEtaChecks_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsePersonalizeEta(boolean z) {
        this.bitField0_ |= 256;
        this.usePersonalizeEta_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005က\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဂ\u0007\nဇ\b", new Object[]{"bitField0_", "id_", "config_", "sessionId_", "maxSuggestionsCount_", "destSuggestionsScoreThreshold_", "suggestEtaChecks_", "futureDriveMaxLookBackMillis_", "futureDriveMaxLookForwardMillis_", "usePersonalizeEta_"});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public i.b.am getConfig() {
        i.b.am amVar = this.config_;
        return amVar == null ? i.b.am.getDefaultInstance() : amVar;
    }

    public double getDestSuggestionsScoreThreshold() {
        return this.destSuggestionsScoreThreshold_;
    }

    public long getFutureDriveMaxLookBackMillis() {
        return this.futureDriveMaxLookBackMillis_;
    }

    public long getFutureDriveMaxLookForwardMillis() {
        return this.futureDriveMaxLookForwardMillis_;
    }

    public long getId() {
        return this.id_;
    }

    public int getMaxSuggestionsCount() {
        return this.maxSuggestionsCount_;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public com.google.v.v getSessionIdBytes() {
        return com.google.v.v.s(this.sessionId_);
    }

    public boolean getSuggestEtaChecks() {
        return this.suggestEtaChecks_;
    }

    public boolean getUsePersonalizeEta() {
        return this.usePersonalizeEta_;
    }

    @Deprecated
    public boolean hasConfig() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDestSuggestionsScoreThreshold() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFutureDriveMaxLookBackMillis() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFutureDriveMaxLookForwardMillis() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMaxSuggestionsCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSuggestEtaChecks() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUsePersonalizeEta() {
        return (this.bitField0_ & 256) != 0;
    }

    public static an newBuilder(ao aoVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
