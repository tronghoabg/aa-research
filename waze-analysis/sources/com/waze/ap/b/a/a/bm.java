package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bm extends com.google.v.du<bm, bl> implements fj {
    private static final bm DEFAULT_INSTANCE;
    public static final int INSIGHT_FEEDBACK_QUESTION_FIELD_NUMBER = 3;
    private static volatile fo<bm> PARSER = null;
    public static final int QUESTION_TOKEN_FIELD_NUMBER = 2;
    public static final int TRIGGER_QUESTION_POLICY_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.waze.ap.a.a.ad insightFeedbackQuestion_;
    private String questionToken_ = "";
    private dm triggerQuestionPolicy_;

    static {
        bm bmVar = new bm();
        DEFAULT_INSTANCE = bmVar;
        com.google.v.du.registerDefaultInstance(bm.class, bmVar);
    }

    private bm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightFeedbackQuestion() {
        this.insightFeedbackQuestion_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionToken() {
        this.bitField0_ &= -3;
        this.questionToken_ = getDefaultInstance().getQuestionToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerQuestionPolicy() {
        this.triggerQuestionPolicy_ = null;
        this.bitField0_ &= -2;
    }

    public static bm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightFeedbackQuestion(com.waze.ap.a.a.ad adVar) {
        Objects.requireNonNull(adVar);
        com.waze.ap.a.a.ad adVar2 = this.insightFeedbackQuestion_;
        if (adVar2 != null && adVar2 != com.waze.ap.a.a.ad.getDefaultInstance()) {
            com.waze.ap.a.a.ab abVarNewBuilder = com.waze.ap.a.a.ad.newBuilder(adVar2);
            abVarNewBuilder.mergeFrom((com.waze.ap.a.a.ab) adVar);
            adVar = abVarNewBuilder.buildPartial();
        }
        this.insightFeedbackQuestion_ = adVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTriggerQuestionPolicy(dm dmVar) {
        Objects.requireNonNull(dmVar);
        dm dmVar2 = this.triggerQuestionPolicy_;
        if (dmVar2 != null && dmVar2 != dm.getDefaultInstance()) {
            dl dlVarNewBuilder = dm.newBuilder(dmVar2);
            dlVarNewBuilder.mergeFrom((dl) dmVar);
            dmVar = dlVarNewBuilder.buildPartial();
        }
        this.triggerQuestionPolicy_ = dmVar;
        this.bitField0_ |= 1;
    }

    public static bl newBuilder() {
        return (bl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bm parseDelimitedFrom(InputStream inputStream) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(com.google.v.v vVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightFeedbackQuestion(com.waze.ap.a.a.ad adVar) {
        Objects.requireNonNull(adVar);
        this.insightFeedbackQuestion_ = adVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.questionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionTokenBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.questionToken_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerQuestionPolicy(dm dmVar) {
        Objects.requireNonNull(dmVar);
        this.triggerQuestionPolicy_ = dmVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "triggerQuestionPolicy_", "questionToken_", "insightFeedbackQuestion_"});
        }
        if (iOrdinal == 3) {
            return new bm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.ap.a.a.ad getInsightFeedbackQuestion() {
        com.waze.ap.a.a.ad adVar = this.insightFeedbackQuestion_;
        return adVar == null ? com.waze.ap.a.a.ad.getDefaultInstance() : adVar;
    }

    public String getQuestionToken() {
        return this.questionToken_;
    }

    public com.google.v.v getQuestionTokenBytes() {
        return com.google.v.v.s(this.questionToken_);
    }

    public dm getTriggerQuestionPolicy() {
        dm dmVar = this.triggerQuestionPolicy_;
        return dmVar == null ? dm.getDefaultInstance() : dmVar;
    }

    public boolean hasInsightFeedbackQuestion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasQuestionToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTriggerQuestionPolicy() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bl newBuilder(bm bmVar) {
        return (bl) DEFAULT_INSTANCE.createBuilder(bmVar);
    }

    public static bm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bm parseFrom(com.google.v.z zVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bm parseFrom(InputStream inputStream) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(ByteBuffer byteBuffer) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bm parseFrom(byte[] bArr) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
