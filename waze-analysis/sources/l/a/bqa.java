package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqa extends com.google.v.du<bqa, bpy> implements com.google.v.fj {
    private static final bqa DEFAULT_INSTANCE;
    public static final int DICTATION_SCREEN_CLICKED_FIELD_NUMBER = 5;
    public static final int DICTATION_SCREEN_FINISHED_FIELD_NUMBER = 6;
    public static final int DICTATION_SCREEN_INITIATED_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<bqa> PARSER = null;
    public static final int SEARCH_BY_VOICE_AUTO_LANGUAGE_CHANGED_FIELD_NUMBER = 1;
    public static final int SEARCH_BY_VOICE_LANGUAGE_CHANGED_FIELD_NUMBER = 2;
    public static final int SEARCH_BY_VOICE_LISTENING_CANCELLED_FIELD_NUMBER = 3;
    public static final int VOICE_SEARCH_FINISHED_FIELD_NUMBER = 4;
    public static final int VOICE_SEARCH_INITIATED_FIELD_NUMBER = 8;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bqa bqaVar = new bqa();
        DEFAULT_INSTANCE = bqaVar;
        com.google.v.du.registerDefaultInstance(bqa.class, bqaVar);
    }

    private bqa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDictationScreenClicked() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDictationScreenFinished() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDictationScreenInitiated() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchByVoiceAutoLanguageChanged() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchByVoiceLanguageChanged() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchByVoiceListeningCancelled() {
        if (this.statCase_ == 3) {
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
    public void clearVoiceSearchFinished() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceSearchInitiated() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bqa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDictationScreenClicked(sj sjVar) {
        Objects.requireNonNull(sjVar);
        if (this.statCase_ == 5 && this.stat_ != sj.getDefaultInstance()) {
            si siVarNewBuilder = sj.newBuilder((sj) this.stat_);
            siVarNewBuilder.mergeFrom((si) sjVar);
            sjVar = siVarNewBuilder.buildPartial();
        }
        this.stat_ = sjVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDictationScreenFinished(sm smVar) {
        Objects.requireNonNull(smVar);
        if (this.statCase_ == 6 && this.stat_ != sm.getDefaultInstance()) {
            sk skVarNewBuilder = sm.newBuilder((sm) this.stat_);
            skVarNewBuilder.mergeFrom((sk) smVar);
            smVar = skVarNewBuilder.buildPartial();
        }
        this.stat_ = smVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDictationScreenInitiated(so soVar) {
        Objects.requireNonNull(soVar);
        if (this.statCase_ == 7 && this.stat_ != so.getDefaultInstance()) {
            sn snVarNewBuilder = so.newBuilder((so) this.stat_);
            snVarNewBuilder.mergeFrom((sn) soVar);
            soVar = snVarNewBuilder.buildPartial();
        }
        this.stat_ = soVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchByVoiceAutoLanguageChanged(ayi ayiVar) {
        Objects.requireNonNull(ayiVar);
        if (this.statCase_ == 1 && this.stat_ != ayi.getDefaultInstance()) {
            ayh ayhVarNewBuilder = ayi.newBuilder((ayi) this.stat_);
            ayhVarNewBuilder.mergeFrom((ayh) ayiVar);
            ayiVar = ayhVarNewBuilder.buildPartial();
        }
        this.stat_ = ayiVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchByVoiceLanguageChanged(ayk aykVar) {
        Objects.requireNonNull(aykVar);
        if (this.statCase_ == 2 && this.stat_ != ayk.getDefaultInstance()) {
            ayj ayjVarNewBuilder = ayk.newBuilder((ayk) this.stat_);
            ayjVarNewBuilder.mergeFrom((ayj) aykVar);
            aykVar = ayjVarNewBuilder.buildPartial();
        }
        this.stat_ = aykVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchByVoiceListeningCancelled(aym aymVar) {
        Objects.requireNonNull(aymVar);
        if (this.statCase_ == 3 && this.stat_ != aym.getDefaultInstance()) {
            ayl aylVarNewBuilder = aym.newBuilder((aym) this.stat_);
            aylVarNewBuilder.mergeFrom((ayl) aymVar);
            aymVar = aylVarNewBuilder.buildPartial();
        }
        this.stat_ = aymVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceSearchFinished(bqn bqnVar) {
        Objects.requireNonNull(bqnVar);
        if (this.statCase_ == 4 && this.stat_ != bqn.getDefaultInstance()) {
            bqm bqmVarNewBuilder = bqn.newBuilder((bqn) this.stat_);
            bqmVarNewBuilder.mergeFrom((bqm) bqnVar);
            bqnVar = bqmVarNewBuilder.buildPartial();
        }
        this.stat_ = bqnVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceSearchInitiated(bqp bqpVar) {
        Objects.requireNonNull(bqpVar);
        if (this.statCase_ == 8 && this.stat_ != bqp.getDefaultInstance()) {
            bqo bqoVarNewBuilder = bqp.newBuilder((bqp) this.stat_);
            bqoVarNewBuilder.mergeFrom((bqo) bqpVar);
            bqpVar = bqoVarNewBuilder.buildPartial();
        }
        this.stat_ = bqpVar;
        this.statCase_ = 8;
    }

    public static bpy newBuilder() {
        return (bpy) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqa parseDelimitedFrom(InputStream inputStream) {
        return (bqa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqa parseFrom(com.google.v.v vVar) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDictationScreenClicked(sj sjVar) {
        Objects.requireNonNull(sjVar);
        this.stat_ = sjVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDictationScreenFinished(sm smVar) {
        Objects.requireNonNull(smVar);
        this.stat_ = smVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDictationScreenInitiated(so soVar) {
        Objects.requireNonNull(soVar);
        this.stat_ = soVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchByVoiceAutoLanguageChanged(ayi ayiVar) {
        Objects.requireNonNull(ayiVar);
        this.stat_ = ayiVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchByVoiceLanguageChanged(ayk aykVar) {
        Objects.requireNonNull(aykVar);
        this.stat_ = aykVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchByVoiceListeningCancelled(aym aymVar) {
        Objects.requireNonNull(aymVar);
        this.stat_ = aymVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceSearchFinished(bqn bqnVar) {
        Objects.requireNonNull(bqnVar);
        this.stat_ = bqnVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceSearchInitiated(bqp bqpVar) {
        Objects.requireNonNull(bqpVar);
        this.stat_ = bqpVar;
        this.statCase_ = 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", ayi.class, ayk.class, aym.class, bqn.class, sj.class, sm.class, so.class, bqp.class});
        }
        if (iOrdinal == 3) {
            return new bqa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bpy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public sj getDictationScreenClicked() {
        return this.statCase_ == 5 ? (sj) this.stat_ : sj.getDefaultInstance();
    }

    public sm getDictationScreenFinished() {
        return this.statCase_ == 6 ? (sm) this.stat_ : sm.getDefaultInstance();
    }

    public so getDictationScreenInitiated() {
        return this.statCase_ == 7 ? (so) this.stat_ : so.getDefaultInstance();
    }

    public ayi getSearchByVoiceAutoLanguageChanged() {
        return this.statCase_ == 1 ? (ayi) this.stat_ : ayi.getDefaultInstance();
    }

    public ayk getSearchByVoiceLanguageChanged() {
        return this.statCase_ == 2 ? (ayk) this.stat_ : ayk.getDefaultInstance();
    }

    public aym getSearchByVoiceListeningCancelled() {
        return this.statCase_ == 3 ? (aym) this.stat_ : aym.getDefaultInstance();
    }

    public bpz getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bpz.f54503i;
            case 1:
                return bpz.f54495a;
            case 2:
                return bpz.f54496b;
            case 3:
                return bpz.f54497c;
            case 4:
                return bpz.f54498d;
            case 5:
                return bpz.f54499e;
            case 6:
                return bpz.f54500f;
            case 7:
                return bpz.f54501g;
            case 8:
                return bpz.f54502h;
            default:
                return null;
        }
    }

    public bqn getVoiceSearchFinished() {
        return this.statCase_ == 4 ? (bqn) this.stat_ : bqn.getDefaultInstance();
    }

    public bqp getVoiceSearchInitiated() {
        return this.statCase_ == 8 ? (bqp) this.stat_ : bqp.getDefaultInstance();
    }

    public boolean hasDictationScreenClicked() {
        return this.statCase_ == 5;
    }

    public boolean hasDictationScreenFinished() {
        return this.statCase_ == 6;
    }

    public boolean hasDictationScreenInitiated() {
        return this.statCase_ == 7;
    }

    public boolean hasSearchByVoiceAutoLanguageChanged() {
        return this.statCase_ == 1;
    }

    public boolean hasSearchByVoiceLanguageChanged() {
        return this.statCase_ == 2;
    }

    public boolean hasSearchByVoiceListeningCancelled() {
        return this.statCase_ == 3;
    }

    public boolean hasVoiceSearchFinished() {
        return this.statCase_ == 4;
    }

    public boolean hasVoiceSearchInitiated() {
        return this.statCase_ == 8;
    }

    public static bpy newBuilder(bqa bqaVar) {
        return (bpy) DEFAULT_INSTANCE.createBuilder(bqaVar);
    }

    public static bqa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqa parseFrom(com.google.v.z zVar) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqa parseFrom(InputStream inputStream) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqa parseFrom(ByteBuffer byteBuffer) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqa parseFrom(byte[] bArr) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
