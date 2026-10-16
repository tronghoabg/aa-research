package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class nh extends com.google.v.du<nh, nf> implements com.google.v.fj {
    public static final int CONVERSATION_AGENT_RESPONSE_PLAYING_ENDED_FIELD_NUMBER = 8;
    public static final int CONVERSATION_AGENT_RESPONSE_PLAYING_STARTED_FIELD_NUMBER = 7;
    public static final int CONVERSATION_AGENT_RESPONSE_STREAM_COMPLETED_FIELD_NUMBER = 11;
    public static final int CONVERSATION_ENDED_FIELD_NUMBER = 4;
    public static final int CONVERSATION_ERROR_FIELD_NUMBER = 14;
    public static final int CONVERSATION_FUNCTION_HANDLING_COMPLETED_FIELD_NUMBER = 13;
    public static final int CONVERSATION_FUNCTION_HANDLING_STARTED_FIELD_NUMBER = 12;
    public static final int CONVERSATION_INTERRUPTED_FIELD_NUMBER = 3;
    public static final int CONVERSATION_MESSAGE_SENT_FIELD_NUMBER = 9;
    public static final int CONVERSATION_REACTION_FIELD_NUMBER = 1;
    public static final int CONVERSATION_RESPONSE_CHUNK_RECEIVED_FIELD_NUMBER = 10;
    public static final int CONVERSATION_STARTED_FIELD_NUMBER = 2;
    public static final int CONVERSATION_USER_FEEDBACK_SHOWN_FIELD_NUMBER = 15;
    public static final int CONVERSATION_USER_RECORDING_ENDED_FIELD_NUMBER = 6;
    public static final int CONVERSATION_USER_RECORDING_STARTED_FIELD_NUMBER = 5;
    private static final nh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nh> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        nh nhVar = new nh();
        DEFAULT_INSTANCE = nhVar;
        com.google.v.du.registerDefaultInstance(nh.class, nhVar);
    }

    private nh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationAgentResponsePlayingEnded() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationAgentResponsePlayingStarted() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationAgentResponseStreamCompleted() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationEnded() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationError() {
        if (this.statCase_ == 14) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationFunctionHandlingCompleted() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationFunctionHandlingStarted() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInterrupted() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationMessageSent() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationReaction() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationResponseChunkReceived() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationStarted() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationUserFeedbackShown() {
        if (this.statCase_ == 15) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationUserRecordingEnded() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationUserRecordingStarted() {
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

    public static nh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationAgentResponsePlayingEnded(ly lyVar) {
        Objects.requireNonNull(lyVar);
        if (this.statCase_ == 8 && this.stat_ != ly.getDefaultInstance()) {
            lx lxVarNewBuilder = ly.newBuilder((ly) this.stat_);
            lxVarNewBuilder.mergeFrom((lx) lyVar);
            lyVar = lxVarNewBuilder.buildPartial();
        }
        this.stat_ = lyVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationAgentResponsePlayingStarted(ma maVar) {
        Objects.requireNonNull(maVar);
        if (this.statCase_ == 7 && this.stat_ != ma.getDefaultInstance()) {
            lz lzVarNewBuilder = ma.newBuilder((ma) this.stat_);
            lzVarNewBuilder.mergeFrom((lz) maVar);
            maVar = lzVarNewBuilder.buildPartial();
        }
        this.stat_ = maVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationAgentResponseStreamCompleted(mc mcVar) {
        Objects.requireNonNull(mcVar);
        if (this.statCase_ == 11 && this.stat_ != mc.getDefaultInstance()) {
            mb mbVarNewBuilder = mc.newBuilder((mc) this.stat_);
            mbVarNewBuilder.mergeFrom((mb) mcVar);
            mcVar = mbVarNewBuilder.buildPartial();
        }
        this.stat_ = mcVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationEnded(mf mfVar) {
        Objects.requireNonNull(mfVar);
        if (this.statCase_ == 4 && this.stat_ != mf.getDefaultInstance()) {
            me meVarNewBuilder = mf.newBuilder((mf) this.stat_);
            meVarNewBuilder.mergeFrom((me) mfVar);
            mfVar = meVarNewBuilder.buildPartial();
        }
        this.stat_ = mfVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationError(mi miVar) {
        Objects.requireNonNull(miVar);
        if (this.statCase_ == 14 && this.stat_ != mi.getDefaultInstance()) {
            mg mgVarNewBuilder = mi.newBuilder((mi) this.stat_);
            mgVarNewBuilder.mergeFrom((mg) miVar);
            miVar = mgVarNewBuilder.buildPartial();
        }
        this.stat_ = miVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationFunctionHandlingCompleted(mk mkVar) {
        Objects.requireNonNull(mkVar);
        if (this.statCase_ == 13 && this.stat_ != mk.getDefaultInstance()) {
            mj mjVarNewBuilder = mk.newBuilder((mk) this.stat_);
            mjVarNewBuilder.mergeFrom((mj) mkVar);
            mkVar = mjVarNewBuilder.buildPartial();
        }
        this.stat_ = mkVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationFunctionHandlingStarted(mm mmVar) {
        Objects.requireNonNull(mmVar);
        if (this.statCase_ == 12 && this.stat_ != mm.getDefaultInstance()) {
            ml mlVarNewBuilder = mm.newBuilder((mm) this.stat_);
            mlVarNewBuilder.mergeFrom((ml) mmVar);
            mmVar = mlVarNewBuilder.buildPartial();
        }
        this.stat_ = mmVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationInterrupted(ms msVar) {
        Objects.requireNonNull(msVar);
        if (this.statCase_ == 3 && this.stat_ != ms.getDefaultInstance()) {
            mq mqVarNewBuilder = ms.newBuilder((ms) this.stat_);
            mqVarNewBuilder.mergeFrom((mq) msVar);
            msVar = mqVarNewBuilder.buildPartial();
        }
        this.stat_ = msVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationMessageSent(mv mvVar) {
        Objects.requireNonNull(mvVar);
        if (this.statCase_ == 9 && this.stat_ != mv.getDefaultInstance()) {
            mt mtVarNewBuilder = mv.newBuilder((mv) this.stat_);
            mtVarNewBuilder.mergeFrom((mt) mvVar);
            mvVar = mtVarNewBuilder.buildPartial();
        }
        this.stat_ = mvVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationReaction(my myVar) {
        Objects.requireNonNull(myVar);
        if (this.statCase_ == 1 && this.stat_ != my.getDefaultInstance()) {
            mx mxVarNewBuilder = my.newBuilder((my) this.stat_);
            mxVarNewBuilder.mergeFrom((mx) myVar);
            myVar = mxVarNewBuilder.buildPartial();
        }
        this.stat_ = myVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationResponseChunkReceived(nb nbVar) {
        Objects.requireNonNull(nbVar);
        if (this.statCase_ == 10 && this.stat_ != nb.getDefaultInstance()) {
            mz mzVarNewBuilder = nb.newBuilder((nb) this.stat_);
            mzVarNewBuilder.mergeFrom((mz) nbVar);
            nbVar = mzVarNewBuilder.buildPartial();
        }
        this.stat_ = nbVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationStarted(ne neVar) {
        Objects.requireNonNull(neVar);
        if (this.statCase_ == 2 && this.stat_ != ne.getDefaultInstance()) {
            nc ncVarNewBuilder = ne.newBuilder((ne) this.stat_);
            ncVarNewBuilder.mergeFrom((nc) neVar);
            neVar = ncVarNewBuilder.buildPartial();
        }
        this.stat_ = neVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationUserFeedbackShown(nj njVar) {
        Objects.requireNonNull(njVar);
        if (this.statCase_ == 15 && this.stat_ != nj.getDefaultInstance()) {
            ni niVarNewBuilder = nj.newBuilder((nj) this.stat_);
            niVarNewBuilder.mergeFrom((ni) njVar);
            njVar = niVarNewBuilder.buildPartial();
        }
        this.stat_ = njVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationUserRecordingEnded(nl nlVar) {
        Objects.requireNonNull(nlVar);
        if (this.statCase_ == 6 && this.stat_ != nl.getDefaultInstance()) {
            nk nkVarNewBuilder = nl.newBuilder((nl) this.stat_);
            nkVarNewBuilder.mergeFrom((nk) nlVar);
            nlVar = nkVarNewBuilder.buildPartial();
        }
        this.stat_ = nlVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationUserRecordingStarted(nn nnVar) {
        Objects.requireNonNull(nnVar);
        if (this.statCase_ == 5 && this.stat_ != nn.getDefaultInstance()) {
            nm nmVarNewBuilder = nn.newBuilder((nn) this.stat_);
            nmVarNewBuilder.mergeFrom((nm) nnVar);
            nnVar = nmVarNewBuilder.buildPartial();
        }
        this.stat_ = nnVar;
        this.statCase_ = 5;
    }

    public static nf newBuilder() {
        return (nf) DEFAULT_INSTANCE.createBuilder();
    }

    public static nh parseDelimitedFrom(InputStream inputStream) {
        return (nh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nh parseFrom(com.google.v.v vVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationAgentResponsePlayingEnded(ly lyVar) {
        Objects.requireNonNull(lyVar);
        this.stat_ = lyVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationAgentResponsePlayingStarted(ma maVar) {
        Objects.requireNonNull(maVar);
        this.stat_ = maVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationAgentResponseStreamCompleted(mc mcVar) {
        Objects.requireNonNull(mcVar);
        this.stat_ = mcVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationEnded(mf mfVar) {
        Objects.requireNonNull(mfVar);
        this.stat_ = mfVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationError(mi miVar) {
        Objects.requireNonNull(miVar);
        this.stat_ = miVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationFunctionHandlingCompleted(mk mkVar) {
        Objects.requireNonNull(mkVar);
        this.stat_ = mkVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationFunctionHandlingStarted(mm mmVar) {
        Objects.requireNonNull(mmVar);
        this.stat_ = mmVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationInterrupted(ms msVar) {
        Objects.requireNonNull(msVar);
        this.stat_ = msVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationMessageSent(mv mvVar) {
        Objects.requireNonNull(mvVar);
        this.stat_ = mvVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationReaction(my myVar) {
        Objects.requireNonNull(myVar);
        this.stat_ = myVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationResponseChunkReceived(nb nbVar) {
        Objects.requireNonNull(nbVar);
        this.stat_ = nbVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationStarted(ne neVar) {
        Objects.requireNonNull(neVar);
        this.stat_ = neVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationUserFeedbackShown(nj njVar) {
        Objects.requireNonNull(njVar);
        this.stat_ = njVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationUserRecordingEnded(nl nlVar) {
        Objects.requireNonNull(nlVar);
        this.stat_ = nlVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationUserRecordingStarted(nn nnVar) {
        Objects.requireNonNull(nnVar);
        this.stat_ = nnVar;
        this.statCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"stat_", "statCase_", my.class, ne.class, ms.class, mf.class, nn.class, nl.class, ma.class, ly.class, mv.class, nb.class, mc.class, mm.class, mk.class, mi.class, nj.class});
        }
        if (iOrdinal == 3) {
            return new nh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ly getConversationAgentResponsePlayingEnded() {
        return this.statCase_ == 8 ? (ly) this.stat_ : ly.getDefaultInstance();
    }

    public ma getConversationAgentResponsePlayingStarted() {
        return this.statCase_ == 7 ? (ma) this.stat_ : ma.getDefaultInstance();
    }

    public mc getConversationAgentResponseStreamCompleted() {
        return this.statCase_ == 11 ? (mc) this.stat_ : mc.getDefaultInstance();
    }

    public mf getConversationEnded() {
        return this.statCase_ == 4 ? (mf) this.stat_ : mf.getDefaultInstance();
    }

    public mi getConversationError() {
        return this.statCase_ == 14 ? (mi) this.stat_ : mi.getDefaultInstance();
    }

    public mk getConversationFunctionHandlingCompleted() {
        return this.statCase_ == 13 ? (mk) this.stat_ : mk.getDefaultInstance();
    }

    public mm getConversationFunctionHandlingStarted() {
        return this.statCase_ == 12 ? (mm) this.stat_ : mm.getDefaultInstance();
    }

    public ms getConversationInterrupted() {
        return this.statCase_ == 3 ? (ms) this.stat_ : ms.getDefaultInstance();
    }

    public mv getConversationMessageSent() {
        return this.statCase_ == 9 ? (mv) this.stat_ : mv.getDefaultInstance();
    }

    public my getConversationReaction() {
        return this.statCase_ == 1 ? (my) this.stat_ : my.getDefaultInstance();
    }

    public nb getConversationResponseChunkReceived() {
        return this.statCase_ == 10 ? (nb) this.stat_ : nb.getDefaultInstance();
    }

    public ne getConversationStarted() {
        return this.statCase_ == 2 ? (ne) this.stat_ : ne.getDefaultInstance();
    }

    public nj getConversationUserFeedbackShown() {
        return this.statCase_ == 15 ? (nj) this.stat_ : nj.getDefaultInstance();
    }

    public nl getConversationUserRecordingEnded() {
        return this.statCase_ == 6 ? (nl) this.stat_ : nl.getDefaultInstance();
    }

    public nn getConversationUserRecordingStarted() {
        return this.statCase_ == 5 ? (nn) this.stat_ : nn.getDefaultInstance();
    }

    public ng getStatCase() {
        switch (this.statCase_) {
            case 0:
                return ng.p;
            case 1:
                return ng.f55137a;
            case 2:
                return ng.f55138b;
            case 3:
                return ng.f55139c;
            case 4:
                return ng.f55140d;
            case 5:
                return ng.f55141e;
            case 6:
                return ng.f55142f;
            case 7:
                return ng.f55143g;
            case 8:
                return ng.f55144h;
            case 9:
                return ng.f55145i;
            case 10:
                return ng.f55146j;
            case 11:
                return ng.f55147k;
            case 12:
                return ng.f55148l;
            case 13:
                return ng.m;
            case 14:
                return ng.n;
            case 15:
                return ng.o;
            default:
                return null;
        }
    }

    public boolean hasConversationAgentResponsePlayingEnded() {
        return this.statCase_ == 8;
    }

    public boolean hasConversationAgentResponsePlayingStarted() {
        return this.statCase_ == 7;
    }

    public boolean hasConversationAgentResponseStreamCompleted() {
        return this.statCase_ == 11;
    }

    public boolean hasConversationEnded() {
        return this.statCase_ == 4;
    }

    public boolean hasConversationError() {
        return this.statCase_ == 14;
    }

    public boolean hasConversationFunctionHandlingCompleted() {
        return this.statCase_ == 13;
    }

    public boolean hasConversationFunctionHandlingStarted() {
        return this.statCase_ == 12;
    }

    public boolean hasConversationInterrupted() {
        return this.statCase_ == 3;
    }

    public boolean hasConversationMessageSent() {
        return this.statCase_ == 9;
    }

    public boolean hasConversationReaction() {
        return this.statCase_ == 1;
    }

    public boolean hasConversationResponseChunkReceived() {
        return this.statCase_ == 10;
    }

    public boolean hasConversationStarted() {
        return this.statCase_ == 2;
    }

    public boolean hasConversationUserFeedbackShown() {
        return this.statCase_ == 15;
    }

    public boolean hasConversationUserRecordingEnded() {
        return this.statCase_ == 6;
    }

    public boolean hasConversationUserRecordingStarted() {
        return this.statCase_ == 5;
    }

    public static nf newBuilder(nh nhVar) {
        return (nf) DEFAULT_INSTANCE.createBuilder(nhVar);
    }

    public static nh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nh parseFrom(com.google.v.z zVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nh parseFrom(InputStream inputStream) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nh parseFrom(ByteBuffer byteBuffer) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nh parseFrom(byte[] bArr) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
