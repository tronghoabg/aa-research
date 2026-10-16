package com.waze.ap.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w extends du<w, u> implements fj {
    public static final int ANSWERS_FIELD_NUMBER = 2;
    private static final w DEFAULT_INSTANCE;
    private static volatile fo<w> PARSER = null;
    public static final int TITLE_TYPE_FIELD_NUMBER = 1;
    private eo<s> answers_ = emptyProtobufList();
    private int bitField0_;
    private int titleType_;

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnswers(Iterable<? extends s> iterable) {
        ensureAnswersIsMutable();
        com.google.v.c.addAll(iterable, this.answers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(int i2, s sVar) {
        Objects.requireNonNull(sVar);
        ensureAnswersIsMutable();
        this.answers_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswers() {
        this.answers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleType() {
        this.bitField0_ &= -2;
        this.titleType_ = 0;
    }

    private void ensureAnswersIsMutable() {
        eo<s> eoVar = this.answers_;
        if (eoVar.c()) {
            return;
        }
        this.answers_ = du.mutableCopy(eoVar);
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnswers(int i2) {
        ensureAnswersIsMutable();
        this.answers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswers(int i2, s sVar) {
        Objects.requireNonNull(sVar);
        ensureAnswersIsMutable();
        this.answers_.set(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleType(v vVar) {
        this.titleType_ = vVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleTypeValue(int i2) {
        this.bitField0_ |= 1;
        this.titleType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"bitField0_", "titleType_", "answers_", s.class});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new u(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public s getAnswers(int i2) {
        return this.answers_.get(i2);
    }

    public int getAnswersCount() {
        return this.answers_.size();
    }

    public List<s> getAnswersList() {
        return this.answers_;
    }

    public t getAnswersOrBuilder(int i2) {
        return this.answers_.get(i2);
    }

    public List<? extends t> getAnswersOrBuilderList() {
        return this.answers_;
    }

    public v getTitleType() {
        int i2 = this.titleType_;
        v vVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : v.QUESTION_TITLE_TYPE_ARE_PEOPLE_PRESENT : v.QUESTION_TITLE_TYPE_IS_CLEARLY_MARKED : v.QUESTION_TITLE_TYPE_IS_NEAR_LANE : v.QUESTION_TITLE_TYPE_UNSPECIFIED;
        return vVar == null ? v.UNRECOGNIZED : vVar;
    }

    public int getTitleTypeValue() {
        return this.titleType_;
    }

    public boolean hasTitleType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static u newBuilder(w wVar) {
        return (u) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(com.google.v.z zVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(com.google.v.z zVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(s sVar) {
        Objects.requireNonNull(sVar);
        ensureAnswersIsMutable();
        this.answers_.add(sVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
