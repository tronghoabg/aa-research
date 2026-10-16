package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class avj extends com.google.v.du<avj, avh> implements com.google.v.fj {
    private static final avj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<avj> PARSER = null;
    public static final int REROUTE_ETA_DIFFERENCE_FIELD_NUMBER = 5;
    public static final int REROUTE_FIELD_NUMBER = 1;
    public static final int REROUTE_SUGGESTION_FILTERED_FIELD_NUMBER = 2;
    public static final int REROUTE_SUGGESTION_RECEIVED_FIELD_NUMBER = 3;
    public static final int REROUTE_SUGGESTION_RESOLVED_FIELD_NUMBER = 4;
    public static final int SELECT_DETOUR_ETA_DIFFERENCE_FIELD_NUMBER = 6;
    private int statCase_ = 0;
    private Object stat_;

    static {
        avj avjVar = new avj();
        DEFAULT_INSTANCE = avjVar;
        com.google.v.du.registerDefaultInstance(avj.class, avjVar);
    }

    private avj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReroute() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteEtaDifference() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteSuggestionFiltered() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteSuggestionReceived() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteSuggestionResolved() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectDetourEtaDifference() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static avj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReroute(avg avgVar) {
        Objects.requireNonNull(avgVar);
        if (this.statCase_ == 1 && this.stat_ != avg.getDefaultInstance()) {
            avf avfVarNewBuilder = avg.newBuilder((avg) this.stat_);
            avfVarNewBuilder.mergeFrom((avf) avgVar);
            avgVar = avfVarNewBuilder.buildPartial();
        }
        this.stat_ = avgVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteEtaDifference(ave aveVar) {
        Objects.requireNonNull(aveVar);
        if (this.statCase_ == 5 && this.stat_ != ave.getDefaultInstance()) {
            avd avdVarNewBuilder = ave.newBuilder((ave) this.stat_);
            avdVarNewBuilder.mergeFrom((avd) aveVar);
            aveVar = avdVarNewBuilder.buildPartial();
        }
        this.stat_ = aveVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteSuggestionFiltered(avm avmVar) {
        Objects.requireNonNull(avmVar);
        if (this.statCase_ == 2 && this.stat_ != avm.getDefaultInstance()) {
            avk avkVarNewBuilder = avm.newBuilder((avm) this.stat_);
            avkVarNewBuilder.mergeFrom((avk) avmVar);
            avmVar = avkVarNewBuilder.buildPartial();
        }
        this.stat_ = avmVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteSuggestionReceived(avo avoVar) {
        Objects.requireNonNull(avoVar);
        if (this.statCase_ == 3 && this.stat_ != avo.getDefaultInstance()) {
            avn avnVarNewBuilder = avo.newBuilder((avo) this.stat_);
            avnVarNewBuilder.mergeFrom((avn) avoVar);
            avoVar = avnVarNewBuilder.buildPartial();
        }
        this.stat_ = avoVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteSuggestionResolved(avs avsVar) {
        Objects.requireNonNull(avsVar);
        if (this.statCase_ == 4 && this.stat_ != avs.getDefaultInstance()) {
            avp avpVarNewBuilder = avs.newBuilder((avs) this.stat_);
            avpVarNewBuilder.mergeFrom((avp) avsVar);
            avsVar = avpVarNewBuilder.buildPartial();
        }
        this.stat_ = avsVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelectDetourEtaDifference(bah bahVar) {
        Objects.requireNonNull(bahVar);
        if (this.statCase_ == 6 && this.stat_ != bah.getDefaultInstance()) {
            bag bagVarNewBuilder = bah.newBuilder((bah) this.stat_);
            bagVarNewBuilder.mergeFrom((bag) bahVar);
            bahVar = bagVarNewBuilder.buildPartial();
        }
        this.stat_ = bahVar;
        this.statCase_ = 6;
    }

    public static avh newBuilder() {
        return (avh) DEFAULT_INSTANCE.createBuilder();
    }

    public static avj parseDelimitedFrom(InputStream inputStream) {
        return (avj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avj parseFrom(com.google.v.v vVar) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<avj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReroute(avg avgVar) {
        Objects.requireNonNull(avgVar);
        this.stat_ = avgVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteEtaDifference(ave aveVar) {
        Objects.requireNonNull(aveVar);
        this.stat_ = aveVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteSuggestionFiltered(avm avmVar) {
        Objects.requireNonNull(avmVar);
        this.stat_ = avmVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteSuggestionReceived(avo avoVar) {
        Objects.requireNonNull(avoVar);
        this.stat_ = avoVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteSuggestionResolved(avs avsVar) {
        Objects.requireNonNull(avsVar);
        this.stat_ = avsVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectDetourEtaDifference(bah bahVar) {
        Objects.requireNonNull(bahVar);
        this.stat_ = bahVar;
        this.statCase_ = 6;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"stat_", "statCase_", avg.class, avm.class, avo.class, avs.class, ave.class, bah.class});
        }
        if (iOrdinal == 3) {
            return new avj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new avh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<avj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (avj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public avg getReroute() {
        return this.statCase_ == 1 ? (avg) this.stat_ : avg.getDefaultInstance();
    }

    public ave getRerouteEtaDifference() {
        return this.statCase_ == 5 ? (ave) this.stat_ : ave.getDefaultInstance();
    }

    public avm getRerouteSuggestionFiltered() {
        return this.statCase_ == 2 ? (avm) this.stat_ : avm.getDefaultInstance();
    }

    public avo getRerouteSuggestionReceived() {
        return this.statCase_ == 3 ? (avo) this.stat_ : avo.getDefaultInstance();
    }

    public avs getRerouteSuggestionResolved() {
        return this.statCase_ == 4 ? (avs) this.stat_ : avs.getDefaultInstance();
    }

    public bah getSelectDetourEtaDifference() {
        return this.statCase_ == 6 ? (bah) this.stat_ : bah.getDefaultInstance();
    }

    public avi getStatCase() {
        switch (this.statCase_) {
            case 0:
                return avi.f53242g;
            case 1:
                return avi.f53236a;
            case 2:
                return avi.f53237b;
            case 3:
                return avi.f53238c;
            case 4:
                return avi.f53239d;
            case 5:
                return avi.f53240e;
            case 6:
                return avi.f53241f;
            default:
                return null;
        }
    }

    public boolean hasReroute() {
        return this.statCase_ == 1;
    }

    public boolean hasRerouteEtaDifference() {
        return this.statCase_ == 5;
    }

    public boolean hasRerouteSuggestionFiltered() {
        return this.statCase_ == 2;
    }

    public boolean hasRerouteSuggestionReceived() {
        return this.statCase_ == 3;
    }

    public boolean hasRerouteSuggestionResolved() {
        return this.statCase_ == 4;
    }

    public boolean hasSelectDetourEtaDifference() {
        return this.statCase_ == 6;
    }

    public static avh newBuilder(avj avjVar) {
        return (avh) DEFAULT_INSTANCE.createBuilder(avjVar);
    }

    public static avj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static avj parseFrom(com.google.v.z zVar) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static avj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static avj parseFrom(InputStream inputStream) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avj parseFrom(ByteBuffer byteBuffer) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static avj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static avj parseFrom(byte[] bArr) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static avj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (avj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
