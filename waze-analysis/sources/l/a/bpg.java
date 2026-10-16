package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpg extends com.google.v.du<bpg, bpe> implements com.google.v.fj {
    public static final int CURRENT_MAP_CAR_ICON_FIELD_NUMBER = 5;
    private static final bpg DEFAULT_INSTANCE;
    public static final int MAP_CAR_CHANGED_FIELD_NUMBER = 1;
    public static final int MY_WAZE_ITEM_CLICKED_FIELD_NUMBER = 6;
    public static final int MY_WAZE_SHOWN_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bpg> PARSER = null;
    public static final int SET_COMMUTE_MENU_SHOWN_FIELD_NUMBER = 7;
    public static final int USER_MOOD_CHANGED_FIELD_NUMBER = 3;
    public static final int VOICE_CHANGED_FIELD_NUMBER = 2;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bpg bpgVar = new bpg();
        DEFAULT_INSTANCE = bpgVar;
        com.google.v.du.registerDefaultInstance(bpg.class, bpgVar);
    }

    private bpg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentMapCarIcon() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapCarChanged() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMyWazeItemClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMyWazeShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetCommuteMenuShown() {
        if (this.statCase_ == 7) {
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
    public void clearUserMoodChanged() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceChanged() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bpg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentMapCarIcon(pe peVar) {
        Objects.requireNonNull(peVar);
        if (this.statCase_ == 5 && this.stat_ != pe.getDefaultInstance()) {
            pd pdVarNewBuilder = pe.newBuilder((pe) this.stat_);
            pdVarNewBuilder.mergeFrom((pd) peVar);
            peVar = pdVarNewBuilder.buildPartial();
        }
        this.stat_ = peVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapCarChanged(ahw ahwVar) {
        Objects.requireNonNull(ahwVar);
        if (this.statCase_ == 1 && this.stat_ != ahw.getDefaultInstance()) {
            ahu ahuVarNewBuilder = ahw.newBuilder((ahw) this.stat_);
            ahuVarNewBuilder.mergeFrom((ahu) ahwVar);
            ahwVar = ahuVarNewBuilder.buildPartial();
        }
        this.stat_ = ahwVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMyWazeItemClicked(akx akxVar) {
        Objects.requireNonNull(akxVar);
        if (this.statCase_ == 6 && this.stat_ != akx.getDefaultInstance()) {
            akv akvVarNewBuilder = akx.newBuilder((akx) this.stat_);
            akvVarNewBuilder.mergeFrom((akv) akxVar);
            akxVar = akvVarNewBuilder.buildPartial();
        }
        this.stat_ = akxVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMyWazeShown(ala alaVar) {
        Objects.requireNonNull(alaVar);
        if (this.statCase_ == 4 && this.stat_ != ala.getDefaultInstance()) {
            aky akyVarNewBuilder = ala.newBuilder((ala) this.stat_);
            akyVarNewBuilder.mergeFrom((aky) alaVar);
            alaVar = akyVarNewBuilder.buildPartial();
        }
        this.stat_ = alaVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetCommuteMenuShown(bbj bbjVar) {
        Objects.requireNonNull(bbjVar);
        if (this.statCase_ == 7 && this.stat_ != bbj.getDefaultInstance()) {
            bbg bbgVarNewBuilder = bbj.newBuilder((bbj) this.stat_);
            bbgVarNewBuilder.mergeFrom((bbg) bbjVar);
            bbjVar = bbgVarNewBuilder.buildPartial();
        }
        this.stat_ = bbjVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserMoodChanged(bpa bpaVar) {
        Objects.requireNonNull(bpaVar);
        if (this.statCase_ == 3 && this.stat_ != bpa.getDefaultInstance()) {
            boz bozVarNewBuilder = bpa.newBuilder((bpa) this.stat_);
            bozVarNewBuilder.mergeFrom((boz) bpaVar);
            bpaVar = bozVarNewBuilder.buildPartial();
        }
        this.stat_ = bpaVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceChanged(bqc bqcVar) {
        Objects.requireNonNull(bqcVar);
        if (this.statCase_ == 2 && this.stat_ != bqc.getDefaultInstance()) {
            bqb bqbVarNewBuilder = bqc.newBuilder((bqc) this.stat_);
            bqbVarNewBuilder.mergeFrom((bqb) bqcVar);
            bqcVar = bqbVarNewBuilder.buildPartial();
        }
        this.stat_ = bqcVar;
        this.statCase_ = 2;
    }

    public static bpe newBuilder() {
        return (bpe) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpg parseDelimitedFrom(InputStream inputStream) {
        return (bpg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpg parseFrom(com.google.v.v vVar) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentMapCarIcon(pe peVar) {
        Objects.requireNonNull(peVar);
        this.stat_ = peVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapCarChanged(ahw ahwVar) {
        Objects.requireNonNull(ahwVar);
        this.stat_ = ahwVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMyWazeItemClicked(akx akxVar) {
        Objects.requireNonNull(akxVar);
        this.stat_ = akxVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMyWazeShown(ala alaVar) {
        Objects.requireNonNull(alaVar);
        this.stat_ = alaVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetCommuteMenuShown(bbj bbjVar) {
        Objects.requireNonNull(bbjVar);
        this.stat_ = bbjVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserMoodChanged(bpa bpaVar) {
        Objects.requireNonNull(bpaVar);
        this.stat_ = bpaVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceChanged(bqc bqcVar) {
        Objects.requireNonNull(bqcVar);
        this.stat_ = bqcVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"stat_", "statCase_", ahw.class, bqc.class, bpa.class, ala.class, pe.class, akx.class, bbj.class});
        }
        if (iOrdinal == 3) {
            return new bpg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bpe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public pe getCurrentMapCarIcon() {
        return this.statCase_ == 5 ? (pe) this.stat_ : pe.getDefaultInstance();
    }

    public ahw getMapCarChanged() {
        return this.statCase_ == 1 ? (ahw) this.stat_ : ahw.getDefaultInstance();
    }

    public akx getMyWazeItemClicked() {
        return this.statCase_ == 6 ? (akx) this.stat_ : akx.getDefaultInstance();
    }

    public ala getMyWazeShown() {
        return this.statCase_ == 4 ? (ala) this.stat_ : ala.getDefaultInstance();
    }

    public bbj getSetCommuteMenuShown() {
        return this.statCase_ == 7 ? (bbj) this.stat_ : bbj.getDefaultInstance();
    }

    public bpf getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bpf.f54457h;
            case 1:
                return bpf.f54450a;
            case 2:
                return bpf.f54451b;
            case 3:
                return bpf.f54452c;
            case 4:
                return bpf.f54453d;
            case 5:
                return bpf.f54454e;
            case 6:
                return bpf.f54455f;
            case 7:
                return bpf.f54456g;
            default:
                return null;
        }
    }

    public bpa getUserMoodChanged() {
        return this.statCase_ == 3 ? (bpa) this.stat_ : bpa.getDefaultInstance();
    }

    public bqc getVoiceChanged() {
        return this.statCase_ == 2 ? (bqc) this.stat_ : bqc.getDefaultInstance();
    }

    public boolean hasCurrentMapCarIcon() {
        return this.statCase_ == 5;
    }

    public boolean hasMapCarChanged() {
        return this.statCase_ == 1;
    }

    public boolean hasMyWazeItemClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasMyWazeShown() {
        return this.statCase_ == 4;
    }

    public boolean hasSetCommuteMenuShown() {
        return this.statCase_ == 7;
    }

    public boolean hasUserMoodChanged() {
        return this.statCase_ == 3;
    }

    public boolean hasVoiceChanged() {
        return this.statCase_ == 2;
    }

    public static bpe newBuilder(bpg bpgVar) {
        return (bpe) DEFAULT_INSTANCE.createBuilder(bpgVar);
    }

    public static bpg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpg parseFrom(com.google.v.z zVar) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bpg parseFrom(InputStream inputStream) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpg parseFrom(ByteBuffer byteBuffer) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpg parseFrom(byte[] bArr) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
