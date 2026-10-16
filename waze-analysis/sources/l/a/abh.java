package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abh extends com.google.v.du<abh, abf> implements com.google.v.fj {
    private static final abh DEFAULT_INSTANCE;
    public static final int EXPLAINABILITY_HANDLING_ENDED_FIELD_NUMBER = 2;
    public static final int EXPLAINABILITY_REQUEST_SENT_FIELD_NUMBER = 3;
    public static final int EXPLAINABILITY_RESPONSE_RECEIVED_FIELD_NUMBER = 4;
    public static final int GUIDANCE_SOURCE_CHANGED_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<abh> PARSER = null;
    public static final int VOICE_ANNOUNCEMENT_FINISHED_FIELD_NUMBER = 7;
    public static final int VOICE_ANNOUNCEMENT_PLAYED_FIELD_NUMBER = 5;
    public static final int VOICE_INSTRUCTION_ANNOUNCEMENT_FIELD_NUMBER = 1;
    private int statCase_ = 0;
    private Object stat_;

    static {
        abh abhVar = new abh();
        DEFAULT_INSTANCE = abhVar;
        com.google.v.du.registerDefaultInstance(abh.class, abhVar);
    }

    private abh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExplainabilityHandlingEnded() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExplainabilityRequestSent() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExplainabilityResponseReceived() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuidanceSourceChanged() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceAnnouncementFinished() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceAnnouncementPlayed() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceInstructionAnnouncement() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static abh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExplainabilityHandlingEnded(wa waVar) {
        Objects.requireNonNull(waVar);
        if (this.statCase_ == 2 && this.stat_ != wa.getDefaultInstance()) {
            vw vwVarNewBuilder = wa.newBuilder((wa) this.stat_);
            vwVarNewBuilder.mergeFrom((vw) waVar);
            waVar = vwVarNewBuilder.buildPartial();
        }
        this.stat_ = waVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExplainabilityRequestSent(wc wcVar) {
        Objects.requireNonNull(wcVar);
        if (this.statCase_ == 3 && this.stat_ != wc.getDefaultInstance()) {
            wb wbVarNewBuilder = wc.newBuilder((wc) this.stat_);
            wbVarNewBuilder.mergeFrom((wb) wcVar);
            wcVar = wbVarNewBuilder.buildPartial();
        }
        this.stat_ = wcVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExplainabilityResponseReceived(wf wfVar) {
        Objects.requireNonNull(wfVar);
        if (this.statCase_ == 4 && this.stat_ != wf.getDefaultInstance()) {
            wd wdVarNewBuilder = wf.newBuilder((wf) this.stat_);
            wdVarNewBuilder.mergeFrom((wd) wfVar);
            wfVar = wdVarNewBuilder.buildPartial();
        }
        this.stat_ = wfVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGuidanceSourceChanged(abe abeVar) {
        Objects.requireNonNull(abeVar);
        if (this.statCase_ == 6 && this.stat_ != abe.getDefaultInstance()) {
            abc abcVarNewBuilder = abe.newBuilder((abe) this.stat_);
            abcVarNewBuilder.mergeFrom((abc) abeVar);
            abeVar = abcVarNewBuilder.buildPartial();
        }
        this.stat_ = abeVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceAnnouncementFinished(bpu bpuVar) {
        Objects.requireNonNull(bpuVar);
        if (this.statCase_ == 7 && this.stat_ != bpu.getDefaultInstance()) {
            bpt bptVarNewBuilder = bpu.newBuilder((bpu) this.stat_);
            bptVarNewBuilder.mergeFrom((bpt) bpuVar);
            bpuVar = bptVarNewBuilder.buildPartial();
        }
        this.stat_ = bpuVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceAnnouncementPlayed(bpx bpxVar) {
        Objects.requireNonNull(bpxVar);
        if (this.statCase_ == 5 && this.stat_ != bpx.getDefaultInstance()) {
            bpv bpvVarNewBuilder = bpx.newBuilder((bpx) this.stat_);
            bpvVarNewBuilder.mergeFrom((bpv) bpxVar);
            bpxVar = bpvVarNewBuilder.buildPartial();
        }
        this.stat_ = bpxVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceInstructionAnnouncement(bqh bqhVar) {
        Objects.requireNonNull(bqhVar);
        if (this.statCase_ == 1 && this.stat_ != bqh.getDefaultInstance()) {
            bqg bqgVarNewBuilder = bqh.newBuilder((bqh) this.stat_);
            bqgVarNewBuilder.mergeFrom((bqg) bqhVar);
            bqhVar = bqgVarNewBuilder.buildPartial();
        }
        this.stat_ = bqhVar;
        this.statCase_ = 1;
    }

    public static abf newBuilder() {
        return (abf) DEFAULT_INSTANCE.createBuilder();
    }

    public static abh parseDelimitedFrom(InputStream inputStream) {
        return (abh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abh parseFrom(com.google.v.v vVar) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExplainabilityHandlingEnded(wa waVar) {
        Objects.requireNonNull(waVar);
        this.stat_ = waVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExplainabilityRequestSent(wc wcVar) {
        Objects.requireNonNull(wcVar);
        this.stat_ = wcVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExplainabilityResponseReceived(wf wfVar) {
        Objects.requireNonNull(wfVar);
        this.stat_ = wfVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceSourceChanged(abe abeVar) {
        Objects.requireNonNull(abeVar);
        this.stat_ = abeVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceAnnouncementFinished(bpu bpuVar) {
        Objects.requireNonNull(bpuVar);
        this.stat_ = bpuVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceAnnouncementPlayed(bpx bpxVar) {
        Objects.requireNonNull(bpxVar);
        this.stat_ = bpxVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructionAnnouncement(bqh bqhVar) {
        Objects.requireNonNull(bqhVar);
        this.stat_ = bqhVar;
        this.statCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"stat_", "statCase_", bqh.class, wa.class, wc.class, wf.class, bpx.class, abe.class, bpu.class});
        }
        if (iOrdinal == 3) {
            return new abh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new abf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public wa getExplainabilityHandlingEnded() {
        return this.statCase_ == 2 ? (wa) this.stat_ : wa.getDefaultInstance();
    }

    public wc getExplainabilityRequestSent() {
        return this.statCase_ == 3 ? (wc) this.stat_ : wc.getDefaultInstance();
    }

    public wf getExplainabilityResponseReceived() {
        return this.statCase_ == 4 ? (wf) this.stat_ : wf.getDefaultInstance();
    }

    public abe getGuidanceSourceChanged() {
        return this.statCase_ == 6 ? (abe) this.stat_ : abe.getDefaultInstance();
    }

    public abg getStatCase() {
        switch (this.statCase_) {
            case 0:
                return abg.f52157h;
            case 1:
                return abg.f52150a;
            case 2:
                return abg.f52151b;
            case 3:
                return abg.f52152c;
            case 4:
                return abg.f52153d;
            case 5:
                return abg.f52154e;
            case 6:
                return abg.f52155f;
            case 7:
                return abg.f52156g;
            default:
                return null;
        }
    }

    public bpu getVoiceAnnouncementFinished() {
        return this.statCase_ == 7 ? (bpu) this.stat_ : bpu.getDefaultInstance();
    }

    public bpx getVoiceAnnouncementPlayed() {
        return this.statCase_ == 5 ? (bpx) this.stat_ : bpx.getDefaultInstance();
    }

    public bqh getVoiceInstructionAnnouncement() {
        return this.statCase_ == 1 ? (bqh) this.stat_ : bqh.getDefaultInstance();
    }

    public boolean hasExplainabilityHandlingEnded() {
        return this.statCase_ == 2;
    }

    public boolean hasExplainabilityRequestSent() {
        return this.statCase_ == 3;
    }

    public boolean hasExplainabilityResponseReceived() {
        return this.statCase_ == 4;
    }

    public boolean hasGuidanceSourceChanged() {
        return this.statCase_ == 6;
    }

    public boolean hasVoiceAnnouncementFinished() {
        return this.statCase_ == 7;
    }

    public boolean hasVoiceAnnouncementPlayed() {
        return this.statCase_ == 5;
    }

    public boolean hasVoiceInstructionAnnouncement() {
        return this.statCase_ == 1;
    }

    public static abf newBuilder(abh abhVar) {
        return (abf) DEFAULT_INSTANCE.createBuilder(abhVar);
    }

    public static abh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abh parseFrom(com.google.v.z zVar) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abh parseFrom(InputStream inputStream) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abh parseFrom(ByteBuffer byteBuffer) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abh parseFrom(byte[] bArr) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
