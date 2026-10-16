package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqs extends com.google.v.du<bqs, bqq> implements com.google.v.fj {
    private static final bqs DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bqs> PARSER = null;
    public static final int SOUND_PLAYED_FIELD_NUMBER = 4;
    public static final int TTS_CACHE_SIZE_FIELD_NUMBER = 1;
    public static final int TTS_DOWNLOAD_REQUEST_FIELD_NUMBER = 2;
    public static final int TTS_FETCH_FIELD_NUMBER = 3;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bqs bqsVar = new bqs();
        DEFAULT_INSTANCE = bqsVar;
        com.google.v.du.registerDefaultInstance(bqs.class, bqsVar);
    }

    private bqs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundPlayed() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtsCacheSize() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtsDownloadRequest() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtsFetch() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bqs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSoundPlayed(bfk bfkVar) {
        Objects.requireNonNull(bfkVar);
        if (this.statCase_ == 4 && this.stat_ != bfk.getDefaultInstance()) {
            bfi bfiVarNewBuilder = bfk.newBuilder((bfk) this.stat_);
            bfiVarNewBuilder.mergeFrom((bfi) bfkVar);
            bfkVar = bfiVarNewBuilder.buildPartial();
        }
        this.stat_ = bfkVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTtsCacheSize(bmd bmdVar) {
        Objects.requireNonNull(bmdVar);
        if (this.statCase_ == 1 && this.stat_ != bmd.getDefaultInstance()) {
            bmc bmcVarNewBuilder = bmd.newBuilder((bmd) this.stat_);
            bmcVarNewBuilder.mergeFrom((bmc) bmdVar);
            bmdVar = bmcVarNewBuilder.buildPartial();
        }
        this.stat_ = bmdVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTtsDownloadRequest(bmg bmgVar) {
        Objects.requireNonNull(bmgVar);
        if (this.statCase_ == 2 && this.stat_ != bmg.getDefaultInstance()) {
            bme bmeVarNewBuilder = bmg.newBuilder((bmg) this.stat_);
            bmeVarNewBuilder.mergeFrom((bme) bmgVar);
            bmgVar = bmeVarNewBuilder.buildPartial();
        }
        this.stat_ = bmgVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTtsFetch(bmj bmjVar) {
        Objects.requireNonNull(bmjVar);
        if (this.statCase_ == 3 && this.stat_ != bmj.getDefaultInstance()) {
            bmh bmhVarNewBuilder = bmj.newBuilder((bmj) this.stat_);
            bmhVarNewBuilder.mergeFrom((bmh) bmjVar);
            bmjVar = bmhVarNewBuilder.buildPartial();
        }
        this.stat_ = bmjVar;
        this.statCase_ = 3;
    }

    public static bqq newBuilder() {
        return (bqq) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqs parseDelimitedFrom(InputStream inputStream) {
        return (bqs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqs parseFrom(com.google.v.v vVar) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundPlayed(bfk bfkVar) {
        Objects.requireNonNull(bfkVar);
        this.stat_ = bfkVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsCacheSize(bmd bmdVar) {
        Objects.requireNonNull(bmdVar);
        this.stat_ = bmdVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsDownloadRequest(bmg bmgVar) {
        Objects.requireNonNull(bmgVar);
        this.stat_ = bmgVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsFetch(bmj bmjVar) {
        Objects.requireNonNull(bmjVar);
        this.stat_ = bmjVar;
        this.statCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"stat_", "statCase_", bmd.class, bmg.class, bmj.class, bfk.class});
        }
        if (iOrdinal == 3) {
            return new bqs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bqq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bfk getSoundPlayed() {
        return this.statCase_ == 4 ? (bfk) this.stat_ : bfk.getDefaultInstance();
    }

    public bqr getStatCase() {
        int i2 = this.statCase_;
        if (i2 == 0) {
            return bqr.f54541e;
        }
        if (i2 == 1) {
            return bqr.f54537a;
        }
        if (i2 == 2) {
            return bqr.f54538b;
        }
        if (i2 == 3) {
            return bqr.f54539c;
        }
        if (i2 != 4) {
            return null;
        }
        return bqr.f54540d;
    }

    public bmd getTtsCacheSize() {
        return this.statCase_ == 1 ? (bmd) this.stat_ : bmd.getDefaultInstance();
    }

    public bmg getTtsDownloadRequest() {
        return this.statCase_ == 2 ? (bmg) this.stat_ : bmg.getDefaultInstance();
    }

    public bmj getTtsFetch() {
        return this.statCase_ == 3 ? (bmj) this.stat_ : bmj.getDefaultInstance();
    }

    public boolean hasSoundPlayed() {
        return this.statCase_ == 4;
    }

    public boolean hasTtsCacheSize() {
        return this.statCase_ == 1;
    }

    public boolean hasTtsDownloadRequest() {
        return this.statCase_ == 2;
    }

    public boolean hasTtsFetch() {
        return this.statCase_ == 3;
    }

    public static bqq newBuilder(bqs bqsVar) {
        return (bqq) DEFAULT_INSTANCE.createBuilder(bqsVar);
    }

    public static bqs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqs parseFrom(com.google.v.z zVar) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqs parseFrom(InputStream inputStream) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqs parseFrom(ByteBuffer byteBuffer) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqs parseFrom(byte[] bArr) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
