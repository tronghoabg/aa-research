package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class akq extends com.google.v.du<akq, ako> implements com.google.v.fj {
    public static final int AUDIOKIT_PARTNER_ICON_CLICKED_FIELD_NUMBER = 3;
    public static final int AUDIOKIT_PLAYER_CLICKED_FIELD_NUMBER = 1;
    private static final akq DEFAULT_INSTANCE;
    public static final int MUSIC_SETTINGS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<akq> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        akq akqVar = new akq();
        DEFAULT_INSTANCE = akqVar;
        com.google.v.du.registerDefaultInstance(akq.class, akqVar);
    }

    private akq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiokitPartnerIconClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudiokitPlayerClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusicSettings() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static akq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudiokitPartnerIconClicked(gb gbVar) {
        Objects.requireNonNull(gbVar);
        if (this.statCase_ == 3 && this.stat_ != gb.getDefaultInstance()) {
            ga gaVarNewBuilder = gb.newBuilder((gb) this.stat_);
            gaVarNewBuilder.mergeFrom((ga) gbVar);
            gbVar = gaVarNewBuilder.buildPartial();
        }
        this.stat_ = gbVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudiokitPlayerClicked(ge geVar) {
        Objects.requireNonNull(geVar);
        if (this.statCase_ == 1 && this.stat_ != ge.getDefaultInstance()) {
            gd gdVarNewBuilder = ge.newBuilder((ge) this.stat_);
            gdVarNewBuilder.mergeFrom((gd) geVar);
            geVar = gdVarNewBuilder.buildPartial();
        }
        this.stat_ = geVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMusicSettings(akt aktVar) {
        Objects.requireNonNull(aktVar);
        if (this.statCase_ == 2 && this.stat_ != akt.getDefaultInstance()) {
            akr akrVarNewBuilder = akt.newBuilder((akt) this.stat_);
            akrVarNewBuilder.mergeFrom((akr) aktVar);
            aktVar = akrVarNewBuilder.buildPartial();
        }
        this.stat_ = aktVar;
        this.statCase_ = 2;
    }

    public static ako newBuilder() {
        return (ako) DEFAULT_INSTANCE.createBuilder();
    }

    public static akq parseDelimitedFrom(InputStream inputStream) {
        return (akq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akq parseFrom(com.google.v.v vVar) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<akq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiokitPartnerIconClicked(gb gbVar) {
        Objects.requireNonNull(gbVar);
        this.stat_ = gbVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudiokitPlayerClicked(ge geVar) {
        Objects.requireNonNull(geVar);
        this.stat_ = geVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusicSettings(akt aktVar) {
        Objects.requireNonNull(aktVar);
        this.stat_ = aktVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"stat_", "statCase_", ge.class, akt.class, gb.class});
        }
        if (iOrdinal == 3) {
            return new akq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ako(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<akq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (akq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gb getAudiokitPartnerIconClicked() {
        return this.statCase_ == 3 ? (gb) this.stat_ : gb.getDefaultInstance();
    }

    public ge getAudiokitPlayerClicked() {
        return this.statCase_ == 1 ? (ge) this.stat_ : ge.getDefaultInstance();
    }

    public akt getMusicSettings() {
        return this.statCase_ == 2 ? (akt) this.stat_ : akt.getDefaultInstance();
    }

    public akp getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return akp.f52621d;
        }
        if (i2 == 1) {
            return akp.f52618a;
        }
        if (i2 == 2) {
            return akp.f52619b;
        }
        if (i2 != 3) {
            return null;
        }
        return akp.f52620c;
    }

    public boolean hasAudiokitPartnerIconClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasAudiokitPlayerClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasMusicSettings() {
        return this.statCase_ == 2;
    }

    public static ako newBuilder(akq akqVar) {
        return (ako) DEFAULT_INSTANCE.createBuilder(akqVar);
    }

    public static akq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static akq parseFrom(com.google.v.z zVar) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static akq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static akq parseFrom(InputStream inputStream) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akq parseFrom(ByteBuffer byteBuffer) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static akq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static akq parseFrom(byte[] bArr) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static akq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (akq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
