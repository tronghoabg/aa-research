package com.waze.ap.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ai extends du<ai, ag> implements fj {
    private static final ai DEFAULT_INSTANCE;
    public static final int ENRICH_INSIGHT_QUESTION_FIELD_NUMBER = 100;
    public static final int INSIGHT_DIMENSION_QUESTION_FIELD_NUMBER = 102;
    public static final int INSIGHT_FEEDBACK_QUESTION_FIELD_NUMBER = 101;
    private static volatile fo<ai> PARSER = null;
    public static final int QUESTION_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private int questionCase_ = 0;
    private String questionToken_ = "";
    private Object question_;

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnrichInsightQuestion() {
        if (this.questionCase_ == 100) {
            this.questionCase_ = 0;
            this.question_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightDimensionQuestion() {
        if (this.questionCase_ == 102) {
            this.questionCase_ = 0;
            this.question_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightFeedbackQuestion() {
        if (this.questionCase_ == 101) {
            this.questionCase_ = 0;
            this.question_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestion() {
        this.questionCase_ = 0;
        this.question_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionToken() {
        this.bitField0_ &= -2;
        this.questionToken_ = getDefaultInstance().getQuestionToken();
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnrichInsightQuestion(l lVar) {
        Objects.requireNonNull(lVar);
        if (this.questionCase_ == 100 && this.question_ != l.getDefaultInstance()) {
            j jVarNewBuilder = l.newBuilder((l) this.question_);
            jVarNewBuilder.mergeFrom((j) lVar);
            lVar = jVarNewBuilder.buildPartial();
        }
        this.question_ = lVar;
        this.questionCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightDimensionQuestion(w wVar) {
        Objects.requireNonNull(wVar);
        if (this.questionCase_ == 102 && this.question_ != w.getDefaultInstance()) {
            u uVarNewBuilder = w.newBuilder((w) this.question_);
            uVarNewBuilder.mergeFrom((u) wVar);
            wVar = uVarNewBuilder.buildPartial();
        }
        this.question_ = wVar;
        this.questionCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightFeedbackQuestion(ad adVar) {
        Objects.requireNonNull(adVar);
        if (this.questionCase_ == 101 && this.question_ != ad.getDefaultInstance()) {
            ab abVarNewBuilder = ad.newBuilder((ad) this.question_);
            abVarNewBuilder.mergeFrom((ab) adVar);
            adVar = abVarNewBuilder.buildPartial();
        }
        this.question_ = adVar;
        this.questionCase_ = 101;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnrichInsightQuestion(l lVar) {
        Objects.requireNonNull(lVar);
        this.question_ = lVar;
        this.questionCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightDimensionQuestion(w wVar) {
        Objects.requireNonNull(wVar);
        this.question_ = wVar;
        this.questionCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightFeedbackQuestion(ad adVar) {
        Objects.requireNonNull(adVar);
        this.question_ = adVar;
        this.questionCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.questionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionTokenBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.questionToken_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001f\u0004\u0000\u0000\u0000\u0001ለ\u0000d<\u0000e<\u0000f<\u0000", new Object[]{"question_", "questionCase_", "bitField0_", "questionToken_", l.class, ad.class, w.class});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public l getEnrichInsightQuestion() {
        return this.questionCase_ == 100 ? (l) this.question_ : l.getDefaultInstance();
    }

    public w getInsightDimensionQuestion() {
        return this.questionCase_ == 102 ? (w) this.question_ : w.getDefaultInstance();
    }

    public ad getInsightFeedbackQuestion() {
        return this.questionCase_ == 101 ? (ad) this.question_ : ad.getDefaultInstance();
    }

    public ah getQuestionCase() {
        int i2 = this.questionCase_;
        if (i2 == 0) {
            return ah.f14921d;
        }
        switch (i2) {
            case 100:
                return ah.f14918a;
            case 101:
                return ah.f14919b;
            case 102:
                return ah.f14920c;
            default:
                return null;
        }
    }

    public String getQuestionToken() {
        return this.questionToken_;
    }

    public com.google.v.v getQuestionTokenBytes() {
        return com.google.v.v.s(this.questionToken_);
    }

    public boolean hasEnrichInsightQuestion() {
        return this.questionCase_ == 100;
    }

    public boolean hasInsightDimensionQuestion() {
        return this.questionCase_ == 102;
    }

    public boolean hasInsightFeedbackQuestion() {
        return this.questionCase_ == 101;
    }

    public boolean hasQuestionToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ag newBuilder(ai aiVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
