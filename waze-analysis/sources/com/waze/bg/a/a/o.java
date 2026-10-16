package com.waze.bg.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o extends du<o, l> implements fj {
    public static final int ANSWERS_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE;
    private static volatile fo<o> PARSER = null;
    public static final int QUESTION_TITLE_TYPE_FIELD_NUMBER = 1;
    private eo<j> answers_ = emptyProtobufList();
    private int bitField0_;
    private int questionTitleType_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnswers(Iterable<? extends j> iterable) {
        ensureAnswersIsMutable();
        com.google.v.c.addAll(iterable, this.answers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(int i2, j jVar) {
        Objects.requireNonNull(jVar);
        ensureAnswersIsMutable();
        this.answers_.add(i2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswers() {
        this.answers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionTitleType() {
        this.bitField0_ &= -2;
        this.questionTitleType_ = 0;
    }

    private void ensureAnswersIsMutable() {
        eo<j> eoVar = this.answers_;
        if (eoVar.c()) {
            return;
        }
        this.answers_ = du.mutableCopy(eoVar);
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnswers(int i2) {
        ensureAnswersIsMutable();
        this.answers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswers(int i2, j jVar) {
        Objects.requireNonNull(jVar);
        ensureAnswersIsMutable();
        this.answers_.set(i2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionTitleType(n nVar) {
        this.questionTitleType_ = nVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"bitField0_", "questionTitleType_", m.f16311a, "answers_", j.class});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public j getAnswers(int i2) {
        return this.answers_.get(i2);
    }

    public int getAnswersCount() {
        return this.answers_.size();
    }

    public List<j> getAnswersList() {
        return this.answers_;
    }

    public k getAnswersOrBuilder(int i2) {
        return this.answers_.get(i2);
    }

    public List<? extends k> getAnswersOrBuilderList() {
        return this.answers_;
    }

    public n getQuestionTitleType() {
        n nVarA = n.a(this.questionTitleType_);
        return nVarA == null ? n.QUESTION_TITLE_TYPE_UNSPECIFIED : nVarA;
    }

    public boolean hasQuestionTitleType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static l newBuilder(o oVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(j jVar) {
        Objects.requireNonNull(jVar);
        ensureAnswersIsMutable();
        this.answers_.add(jVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
