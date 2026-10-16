package i.b.v;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bo extends com.google.v.du<bo, bm> implements bp {
    private static final bo DEFAULT_INSTANCE;
    public static final int DISABLED_BY_CHANNEL_FIELD_NUMBER = 408;
    public static final int DISABLED_FIELD_NUMBER = 407;
    public static final int ID_FIELD_NUMBER = 402;
    public static final int MATCHERVERSION_FIELD_NUMBER = 406;
    private static volatile com.google.v.fo<bo> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 401;
    public static final int SCORE_FIELD_NUMBER = 404;
    public static final int TIMESTAMP_FIELD_NUMBER = 405;
    public static final int TYPE_FIELD_NUMBER = 403;
    private int bitField0_;
    private int disabledByChannel_;
    private boolean disabled_;
    private int matcherVersion_;
    private double score_;
    private long timestamp_;
    private int type_;
    private String provider_ = "";
    private String id_ = "";

    static {
        bo boVar = new bo();
        DEFAULT_INSTANCE = boVar;
        com.google.v.du.registerDefaultInstance(bo.class, boVar);
    }

    private bo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabled() {
        this.bitField0_ &= -65;
        this.disabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabledByChannel() {
        this.bitField0_ &= -129;
        this.disabledByChannel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -3;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatcherVersion() {
        this.bitField0_ &= -33;
        this.matcherVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -2;
        this.provider_ = getDefaultInstance().getProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.bitField0_ &= -9;
        this.score_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.bitField0_ &= -17;
        this.timestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -5;
        this.type_ = 0;
    }

    public static bo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bm newBuilder() {
        return (bm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bo parseDelimitedFrom(InputStream inputStream) {
        return (bo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bo parseFrom(com.google.v.v vVar) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabled(boolean z) {
        this.bitField0_ |= 64;
        this.disabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledByChannel(dw dwVar) {
        this.disabledByChannel_ = dwVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatcherVersion(int i2) {
        this.bitField0_ |= 32;
        this.matcherVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.provider_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderBytes(com.google.v.v vVar) {
        this.provider_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(double d2) {
        this.bitField0_ |= 8;
        this.score_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j2) {
        this.bitField0_ |= 16;
        this.timestamp_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bn bnVar) {
        this.type_ = bnVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001ƑƘ\b\u0000\u0000\u0000Ƒဈ\u0000ƒဈ\u0001Ɠ᠌\u0002Ɣက\u0003ƕဂ\u0004Ɩင\u0005Ɨဇ\u0006Ƙ᠌\u0007", new Object[]{"bitField0_", "provider_", "id_", "type_", z.f49562i, "score_", "timestamp_", "matcherVersion_", "disabled_", "disabledByChannel_", z.t});
        }
        if (iOrdinal == 3) {
            return new bo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getDisabled() {
        return this.disabled_;
    }

    public dw getDisabledByChannel() {
        dw dwVarA = dw.a(this.disabledByChannel_);
        return dwVarA == null ? dw.UNKNOWN : dwVarA;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public int getMatcherVersion() {
        return this.matcherVersion_;
    }

    public String getProvider() {
        return this.provider_;
    }

    public com.google.v.v getProviderBytes() {
        return com.google.v.v.s(this.provider_);
    }

    public double getScore() {
        return this.score_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public bn getType() {
        bn bnVarA = bn.a(this.type_);
        return bnVarA == null ? bn.MATCH_TYPE_UNKNOWN : bnVarA;
    }

    public boolean hasDisabled() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDisabledByChannel() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMatcherVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasScore() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bm newBuilder(bo boVar) {
        return (bm) DEFAULT_INSTANCE.createBuilder(boVar);
    }

    public static bo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bo parseFrom(com.google.v.z zVar) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bo parseFrom(InputStream inputStream) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bo parseFrom(ByteBuffer byteBuffer) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bo parseFrom(byte[] bArr) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
