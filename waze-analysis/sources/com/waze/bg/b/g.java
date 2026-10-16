package com.waze.bg.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.ap.a.a.ao;
import com.waze.ap.a.a.o;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends du<g, e> implements fj {
    public static final int CONFIRMATION_ANSWER_TYPE_FIELD_NUMBER = 5;
    private static final g DEFAULT_INSTANCE;
    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    public static final int INSIGHT_ANSWER_TYPE_FIELD_NUMBER = 3;
    private static volatile fo<g> PARSER = null;
    public static final int QUESTION_TOKEN_FIELD_NUMBER = 2;
    public static final int VALIDATION_ANSWER_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object chosenAnswer_;
    private int chosenAnswerCase_ = 0;
    private String entityId_ = "";
    private String questionToken_ = "";

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChosenAnswer() {
        this.chosenAnswerCase_ = 0;
        this.chosenAnswer_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfirmationAnswerType() {
        if (this.chosenAnswerCase_ == 5) {
            this.chosenAnswerCase_ = 0;
            this.chosenAnswer_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntityId() {
        this.bitField0_ &= -2;
        this.entityId_ = getDefaultInstance().getEntityId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightAnswerType() {
        if (this.chosenAnswerCase_ == 3) {
            this.chosenAnswerCase_ = 0;
            this.chosenAnswer_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionToken() {
        this.bitField0_ &= -3;
        this.questionToken_ = getDefaultInstance().getQuestionToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidationAnswerType() {
        if (this.chosenAnswerCase_ == 4) {
            this.chosenAnswerCase_ = 0;
            this.chosenAnswer_ = null;
        }
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfirmationAnswerType(com.waze.ap.a.a.d dVar) {
        this.chosenAnswer_ = Integer.valueOf(dVar.getNumber());
        this.chosenAnswerCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.entityId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityIdBytes(v vVar) {
        this.entityId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightAnswerType(o oVar) {
        this.chosenAnswer_ = Integer.valueOf(oVar.getNumber());
        this.chosenAnswerCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.questionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionTokenBytes(v vVar) {
        this.questionToken_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidationAnswerType(ao aoVar) {
        this.chosenAnswer_ = Integer.valueOf(aoVar.getNumber());
        this.chosenAnswerCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u083f\u0000\u0004\u083f\u0000\u0005\u083f\u0000", new Object[]{"chosenAnswer_", "chosenAnswerCase_", "bitField0_", "entityId_", "questionToken_", o.a(), ao.a(), com.waze.ap.a.a.d.a()});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public f getChosenAnswerCase() {
        int i2 = this.chosenAnswerCase_;
        if (i2 == 0) {
            return f.f16580d;
        }
        if (i2 == 3) {
            return f.f16577a;
        }
        if (i2 == 4) {
            return f.f16578b;
        }
        if (i2 != 5) {
            return null;
        }
        return f.f16579c;
    }

    public com.waze.ap.a.a.d getConfirmationAnswerType() {
        com.waze.ap.a.a.d dVarB;
        return (this.chosenAnswerCase_ != 5 || (dVarB = com.waze.ap.a.a.d.b(((Integer) this.chosenAnswer_).intValue())) == null) ? com.waze.ap.a.a.d.CONFIRMATION_UNSPECIFIED : dVarB;
    }

    public String getEntityId() {
        return this.entityId_;
    }

    public v getEntityIdBytes() {
        return v.s(this.entityId_);
    }

    public o getInsightAnswerType() {
        o oVarB;
        return (this.chosenAnswerCase_ != 3 || (oVarB = o.b(((Integer) this.chosenAnswer_).intValue())) == null) ? o.INSIGHT_ANSWER_TYPE_UNSPECIFIED : oVarB;
    }

    public String getQuestionToken() {
        return this.questionToken_;
    }

    public v getQuestionTokenBytes() {
        return v.s(this.questionToken_);
    }

    public ao getValidationAnswerType() {
        ao aoVarB;
        return (this.chosenAnswerCase_ != 4 || (aoVarB = ao.b(((Integer) this.chosenAnswer_).intValue())) == null) ? ao.VALIDATION_UNSPECIFIED : aoVarB;
    }

    public boolean hasConfirmationAnswerType() {
        return this.chosenAnswerCase_ == 5;
    }

    public boolean hasEntityId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInsightAnswerType() {
        return this.chosenAnswerCase_ == 3;
    }

    public boolean hasQuestionToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValidationAnswerType() {
        return this.chosenAnswerCase_ == 4;
    }

    public static e newBuilder(g gVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(v vVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(z zVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
