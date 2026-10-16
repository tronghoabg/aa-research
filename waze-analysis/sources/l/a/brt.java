package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class brt extends com.google.v.du<brt, brs> implements bru {
    private static final brt DEFAULT_INSTANCE;
    public static final int FEEDBACK_ANSWER_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<brt> PARSER = null;
    public static final int UGC_SUBYPE_FIELD_NUMBER = 1;
    public static final int VALIDATION_FIELD_NUMBER = 2;
    private int answerCase_ = 0;
    private Object answer_;

    static {
        brt brtVar = new brt();
        DEFAULT_INSTANCE = brtVar;
        com.google.v.du.registerDefaultInstance(brt.class, brtVar);
    }

    private brt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswer() {
        this.answerCase_ = 0;
        this.answer_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackAnswer() {
        if (this.answerCase_ == 3) {
            this.answerCase_ = 0;
            this.answer_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcSubype() {
        if (this.answerCase_ == 1) {
            this.answerCase_ = 0;
            this.answer_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidation() {
        if (this.answerCase_ == 2) {
            this.answerCase_ = 0;
            this.answer_ = null;
        }
    }

    public static brt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedbackAnswer(brx brxVar) {
        Objects.requireNonNull(brxVar);
        if (this.answerCase_ == 3 && this.answer_ != brx.getDefaultInstance()) {
            brw brwVarNewBuilder = brx.newBuilder((brx) this.answer_);
            brwVarNewBuilder.mergeFrom((brw) brxVar);
            brxVar = brwVarNewBuilder.buildPartial();
        }
        this.answer_ = brxVar;
        this.answerCase_ = 3;
    }

    public static brs newBuilder() {
        return (brs) DEFAULT_INSTANCE.createBuilder();
    }

    public static brt parseDelimitedFrom(InputStream inputStream) {
        return (brt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brt parseFrom(com.google.v.v vVar) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<brt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackAnswer(brx brxVar) {
        Objects.requireNonNull(brxVar);
        this.answer_ = brxVar;
        this.answerCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcSubype(boa boaVar) {
        this.answer_ = Integer.valueOf(boaVar.getNumber());
        this.answerCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcSubypeValue(int i2) {
        this.answerCase_ = 1;
        this.answer_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidation(brq brqVar) {
        this.answer_ = Integer.valueOf(brqVar.getNumber());
        this.answerCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidationValue(int i2) {
        this.answerCase_ = 2;
        this.answer_ = Integer.valueOf(i2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003<\u0000", new Object[]{"answer_", "answerCase_", brx.class});
        }
        if (iOrdinal == 3) {
            return new brt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new brs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<brt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (brt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public brr getAnswerCase() {
        int i2 = this.answerCase_;
        if (i2 == 0) {
            return brr.f54597d;
        }
        if (i2 == 1) {
            return brr.f54594a;
        }
        if (i2 == 2) {
            return brr.f54595b;
        }
        if (i2 != 3) {
            return null;
        }
        return brr.f54596c;
    }

    public brx getFeedbackAnswer() {
        return this.answerCase_ == 3 ? (brx) this.answer_ : brx.getDefaultInstance();
    }

    public boa getUgcSubype() {
        if (this.answerCase_ != 1) {
            return boa.UGC_SUBTYPE_UNSPECIFIED;
        }
        boa boaVarA = boa.a(((Integer) this.answer_).intValue());
        return boaVarA == null ? boa.UNRECOGNIZED : boaVarA;
    }

    public int getUgcSubypeValue() {
        if (this.answerCase_ == 1) {
            return ((Integer) this.answer_).intValue();
        }
        return 0;
    }

    public brq getValidation() {
        if (this.answerCase_ != 2) {
            return brq.VALIDATION_ANSWER_UNSPECIFIED;
        }
        int iIntValue = ((Integer) this.answer_).intValue();
        brq brqVar = iIntValue != 0 ? iIntValue != 1 ? null : brq.VALIDATION_THUMBS_DOWN : brq.VALIDATION_ANSWER_UNSPECIFIED;
        return brqVar == null ? brq.UNRECOGNIZED : brqVar;
    }

    public int getValidationValue() {
        if (this.answerCase_ == 2) {
            return ((Integer) this.answer_).intValue();
        }
        return 0;
    }

    public boolean hasFeedbackAnswer() {
        return this.answerCase_ == 3;
    }

    public boolean hasUgcSubype() {
        return this.answerCase_ == 1;
    }

    public boolean hasValidation() {
        return this.answerCase_ == 2;
    }

    public static brs newBuilder(brt brtVar) {
        return (brs) DEFAULT_INSTANCE.createBuilder(brtVar);
    }

    public static brt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static brt parseFrom(com.google.v.z zVar) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static brt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static brt parseFrom(InputStream inputStream) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brt parseFrom(ByteBuffer byteBuffer) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static brt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static brt parseFrom(byte[] bArr) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static brt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (brt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
