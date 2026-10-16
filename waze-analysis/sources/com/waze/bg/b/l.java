package com.waze.bg.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.bg.a.a.o;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends du<l, j> implements fj {
    private static final l DEFAULT_INSTANCE;
    public static final int ENRICH_ALERT_QUESTION_FIELD_NUMBER = 3;
    public static final int ENTITY_ID_FIELD_NUMBER = 2;
    private static volatile fo<l> PARSER = null;
    public static final int QUESTION_KEY_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object question_;
    private int questionCase_ = 0;
    private String questionKey_ = "";
    private String entityId_ = "";

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnrichAlertQuestion() {
        if (this.questionCase_ == 3) {
            this.questionCase_ = 0;
            this.question_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntityId() {
        this.bitField0_ &= -3;
        this.entityId_ = getDefaultInstance().getEntityId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestion() {
        this.questionCase_ = 0;
        this.question_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionKey() {
        this.bitField0_ &= -2;
        this.questionKey_ = getDefaultInstance().getQuestionKey();
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnrichAlertQuestion(o oVar) {
        Objects.requireNonNull(oVar);
        if (this.questionCase_ == 3 && this.question_ != o.getDefaultInstance()) {
            com.waze.bg.a.a.l lVarNewBuilder = o.newBuilder((o) this.question_);
            lVarNewBuilder.mergeFrom((com.waze.bg.a.a.l) oVar);
            oVar = lVarNewBuilder.buildPartial();
        }
        this.question_ = oVar;
        this.questionCase_ = 3;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnrichAlertQuestion(o oVar) {
        Objects.requireNonNull(oVar);
        this.question_ = oVar;
        this.questionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.entityId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityIdBytes(v vVar) {
        this.entityId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.questionKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionKeyBytes(v vVar) {
        this.questionKey_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003<\u0000", new Object[]{"question_", "questionCase_", "bitField0_", "questionKey_", "entityId_", o.class});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public o getEnrichAlertQuestion() {
        return this.questionCase_ == 3 ? (o) this.question_ : o.getDefaultInstance();
    }

    public String getEntityId() {
        return this.entityId_;
    }

    public v getEntityIdBytes() {
        return v.s(this.entityId_);
    }

    public k getQuestionCase() {
        int i2 = this.questionCase_;
        if (i2 == 0) {
            return k.f16583b;
        }
        if (i2 != 3) {
            return null;
        }
        return k.f16582a;
    }

    public String getQuestionKey() {
        return this.questionKey_;
    }

    public v getQuestionKeyBytes() {
        return v.s(this.questionKey_);
    }

    public boolean hasEnrichAlertQuestion() {
        return this.questionCase_ == 3;
    }

    public boolean hasEntityId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasQuestionKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public static j newBuilder(l lVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
