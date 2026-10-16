package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmo extends com.google.v.du<bmo, bmm> implements com.google.v.fj {
    public static final int CUSTOM_VOICE_INSTRUCTIONS_CREATED_FIELD_NUMBER = 6;
    public static final int CUSTOM_VOICE_INSTRUCTIONS_SCREEN_CLICKED_FIELD_NUMBER = 3;
    public static final int CUSTOM_VOICE_INSTRUCTIONS_SCREEN_SHOWN_FIELD_NUMBER = 4;
    private static final bmo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bmo> PARSER = null;
    public static final int PROMPT_AUDIO_PLAYED_FIELD_NUMBER = 1;
    public static final int SHARE_CUSTOM_VOICE_DRAWER_CLICKED_FIELD_NUMBER = 8;
    public static final int SHARE_CUSTOM_VOICE_DRAWER_SHOWN_FIELD_NUMBER = 5;
    public static final int TEXT_TO_SPEECH_PLAYED_FIELD_NUMBER = 2;
    public static final int TTS_RECEIVED_FIELD_NUMBER = 10;
    public static final int VOICE_DIRECTIONS_SETTINGS_CLICKED_FIELD_NUMBER = 9;
    public static final int VOICE_INSTRUCTIONS_SELECTED_TYPE_FIELD_NUMBER = 7;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bmo bmoVar = new bmo();
        DEFAULT_INSTANCE = bmoVar;
        com.google.v.du.registerDefaultInstance(bmo.class, bmoVar);
    }

    private bmo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomVoiceInstructionsCreated() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomVoiceInstructionsScreenClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomVoiceInstructionsScreenShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptAudioPlayed() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareCustomVoiceDrawerClicked() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareCustomVoiceDrawerShown() {
        if (this.statCase_ == 5) {
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
    public void clearTextToSpeechPlayed() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtsReceived() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceDirectionsSettingsClicked() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceInstructionsSelectedType() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bmo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustomVoiceInstructionsCreated(pi piVar) {
        Objects.requireNonNull(piVar);
        if (this.statCase_ == 6 && this.stat_ != pi.getDefaultInstance()) {
            ph phVarNewBuilder = pi.newBuilder((pi) this.stat_);
            phVarNewBuilder.mergeFrom((ph) piVar);
            piVar = phVarNewBuilder.buildPartial();
        }
        this.stat_ = piVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustomVoiceInstructionsScreenClicked(pl plVar) {
        Objects.requireNonNull(plVar);
        if (this.statCase_ == 3 && this.stat_ != pl.getDefaultInstance()) {
            pk pkVarNewBuilder = pl.newBuilder((pl) this.stat_);
            pkVarNewBuilder.mergeFrom((pk) plVar);
            plVar = pkVarNewBuilder.buildPartial();
        }
        this.stat_ = plVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustomVoiceInstructionsScreenShown(pn pnVar) {
        Objects.requireNonNull(pnVar);
        if (this.statCase_ == 4 && this.stat_ != pn.getDefaultInstance()) {
            pm pmVarNewBuilder = pn.newBuilder((pn) this.stat_);
            pmVarNewBuilder.mergeFrom((pm) pnVar);
            pnVar = pmVarNewBuilder.buildPartial();
        }
        this.stat_ = pnVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromptAudioPlayed(asn asnVar) {
        Objects.requireNonNull(asnVar);
        if (this.statCase_ == 1 && this.stat_ != asn.getDefaultInstance()) {
            asm asmVarNewBuilder = asn.newBuilder((asn) this.stat_);
            asmVarNewBuilder.mergeFrom((asm) asnVar);
            asnVar = asmVarNewBuilder.buildPartial();
        }
        this.stat_ = asnVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareCustomVoiceDrawerClicked(bcg bcgVar) {
        Objects.requireNonNull(bcgVar);
        if (this.statCase_ == 8 && this.stat_ != bcg.getDefaultInstance()) {
            bcf bcfVarNewBuilder = bcg.newBuilder((bcg) this.stat_);
            bcfVarNewBuilder.mergeFrom((bcf) bcgVar);
            bcgVar = bcfVarNewBuilder.buildPartial();
        }
        this.stat_ = bcgVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShareCustomVoiceDrawerShown(bci bciVar) {
        Objects.requireNonNull(bciVar);
        if (this.statCase_ == 5 && this.stat_ != bci.getDefaultInstance()) {
            bch bchVarNewBuilder = bci.newBuilder((bci) this.stat_);
            bchVarNewBuilder.mergeFrom((bch) bciVar);
            bciVar = bchVarNewBuilder.buildPartial();
        }
        this.stat_ = bciVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTextToSpeechPlayed(bhz bhzVar) {
        Objects.requireNonNull(bhzVar);
        if (this.statCase_ == 2 && this.stat_ != bhz.getDefaultInstance()) {
            bhx bhxVarNewBuilder = bhz.newBuilder((bhz) this.stat_);
            bhxVarNewBuilder.mergeFrom((bhx) bhzVar);
            bhzVar = bhxVarNewBuilder.buildPartial();
        }
        this.stat_ = bhzVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTtsReceived(bml bmlVar) {
        Objects.requireNonNull(bmlVar);
        if (this.statCase_ == 10 && this.stat_ != bml.getDefaultInstance()) {
            bmk bmkVarNewBuilder = bml.newBuilder((bml) this.stat_);
            bmkVarNewBuilder.mergeFrom((bmk) bmlVar);
            bmlVar = bmkVarNewBuilder.buildPartial();
        }
        this.stat_ = bmlVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceDirectionsSettingsClicked(bqf bqfVar) {
        Objects.requireNonNull(bqfVar);
        if (this.statCase_ == 9 && this.stat_ != bqf.getDefaultInstance()) {
            bqe bqeVarNewBuilder = bqf.newBuilder((bqf) this.stat_);
            bqeVarNewBuilder.mergeFrom((bqe) bqfVar);
            bqfVar = bqeVarNewBuilder.buildPartial();
        }
        this.stat_ = bqfVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceInstructionsSelectedType(bqk bqkVar) {
        Objects.requireNonNull(bqkVar);
        if (this.statCase_ == 7 && this.stat_ != bqk.getDefaultInstance()) {
            bqi bqiVarNewBuilder = bqk.newBuilder((bqk) this.stat_);
            bqiVarNewBuilder.mergeFrom((bqi) bqkVar);
            bqkVar = bqiVarNewBuilder.buildPartial();
        }
        this.stat_ = bqkVar;
        this.statCase_ = 7;
    }

    public static bmm newBuilder() {
        return (bmm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmo parseDelimitedFrom(InputStream inputStream) {
        return (bmo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmo parseFrom(com.google.v.v vVar) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomVoiceInstructionsCreated(pi piVar) {
        Objects.requireNonNull(piVar);
        this.stat_ = piVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomVoiceInstructionsScreenClicked(pl plVar) {
        Objects.requireNonNull(plVar);
        this.stat_ = plVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomVoiceInstructionsScreenShown(pn pnVar) {
        Objects.requireNonNull(pnVar);
        this.stat_ = pnVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptAudioPlayed(asn asnVar) {
        Objects.requireNonNull(asnVar);
        this.stat_ = asnVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareCustomVoiceDrawerClicked(bcg bcgVar) {
        Objects.requireNonNull(bcgVar);
        this.stat_ = bcgVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareCustomVoiceDrawerShown(bci bciVar) {
        Objects.requireNonNull(bciVar);
        this.stat_ = bciVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextToSpeechPlayed(bhz bhzVar) {
        Objects.requireNonNull(bhzVar);
        this.stat_ = bhzVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtsReceived(bml bmlVar) {
        Objects.requireNonNull(bmlVar);
        this.stat_ = bmlVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceDirectionsSettingsClicked(bqf bqfVar) {
        Objects.requireNonNull(bqfVar);
        this.stat_ = bqfVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionsSelectedType(bqk bqkVar) {
        Objects.requireNonNull(bqkVar);
        this.stat_ = bqkVar;
        this.statCase_ = 7;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"stat_", "statCase_", asn.class, bhz.class, pl.class, pn.class, bci.class, pi.class, bqk.class, bcg.class, bqf.class, bml.class});
        }
        if (iOrdinal == 3) {
            return new bmo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bmm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public pi getCustomVoiceInstructionsCreated() {
        return this.statCase_ == 6 ? (pi) this.stat_ : pi.getDefaultInstance();
    }

    public pl getCustomVoiceInstructionsScreenClicked() {
        return this.statCase_ == 3 ? (pl) this.stat_ : pl.getDefaultInstance();
    }

    public pn getCustomVoiceInstructionsScreenShown() {
        return this.statCase_ == 4 ? (pn) this.stat_ : pn.getDefaultInstance();
    }

    public asn getPromptAudioPlayed() {
        return this.statCase_ == 1 ? (asn) this.stat_ : asn.getDefaultInstance();
    }

    public bcg getShareCustomVoiceDrawerClicked() {
        return this.statCase_ == 8 ? (bcg) this.stat_ : bcg.getDefaultInstance();
    }

    public bci getShareCustomVoiceDrawerShown() {
        return this.statCase_ == 5 ? (bci) this.stat_ : bci.getDefaultInstance();
    }

    public bmn getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bmn.f54309k;
            case 1:
                return bmn.f54299a;
            case 2:
                return bmn.f54300b;
            case 3:
                return bmn.f54301c;
            case 4:
                return bmn.f54302d;
            case 5:
                return bmn.f54303e;
            case 6:
                return bmn.f54304f;
            case 7:
                return bmn.f54305g;
            case 8:
                return bmn.f54306h;
            case 9:
                return bmn.f54307i;
            case 10:
                return bmn.f54308j;
            default:
                return null;
        }
    }

    public bhz getTextToSpeechPlayed() {
        return this.statCase_ == 2 ? (bhz) this.stat_ : bhz.getDefaultInstance();
    }

    public bml getTtsReceived() {
        return this.statCase_ == 10 ? (bml) this.stat_ : bml.getDefaultInstance();
    }

    public bqf getVoiceDirectionsSettingsClicked() {
        return this.statCase_ == 9 ? (bqf) this.stat_ : bqf.getDefaultInstance();
    }

    public bqk getVoiceInstructionsSelectedType() {
        return this.statCase_ == 7 ? (bqk) this.stat_ : bqk.getDefaultInstance();
    }

    public boolean hasCustomVoiceInstructionsCreated() {
        return this.statCase_ == 6;
    }

    public boolean hasCustomVoiceInstructionsScreenClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasCustomVoiceInstructionsScreenShown() {
        return this.statCase_ == 4;
    }

    public boolean hasPromptAudioPlayed() {
        return this.statCase_ == 1;
    }

    public boolean hasShareCustomVoiceDrawerClicked() {
        return this.statCase_ == 8;
    }

    public boolean hasShareCustomVoiceDrawerShown() {
        return this.statCase_ == 5;
    }

    public boolean hasTextToSpeechPlayed() {
        return this.statCase_ == 2;
    }

    public boolean hasTtsReceived() {
        return this.statCase_ == 10;
    }

    public boolean hasVoiceDirectionsSettingsClicked() {
        return this.statCase_ == 9;
    }

    public boolean hasVoiceInstructionsSelectedType() {
        return this.statCase_ == 7;
    }

    public static bmm newBuilder(bmo bmoVar) {
        return (bmm) DEFAULT_INSTANCE.createBuilder(bmoVar);
    }

    public static bmo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmo parseFrom(com.google.v.z zVar) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmo parseFrom(InputStream inputStream) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmo parseFrom(ByteBuffer byteBuffer) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmo parseFrom(byte[] bArr) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
