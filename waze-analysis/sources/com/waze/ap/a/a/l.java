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
public final class l extends du<l, j> implements fj {
    public static final int ANSWERS_FIELD_NUMBER = 2;
    private static final l DEFAULT_INSTANCE;
    private static volatile fo<l> PARSER = null;
    public static final int TITLE_TYPE_FIELD_NUMBER = 1;
    private eo<h> answers_ = emptyProtobufList();
    private int bitField0_;
    private int titleType_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnswers(Iterable<? extends h> iterable) {
        ensureAnswersIsMutable();
        com.google.v.c.addAll(iterable, this.answers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureAnswersIsMutable();
        this.answers_.add(i2, hVar);
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
        eo<h> eoVar = this.answers_;
        if (eoVar.c()) {
            return;
        }
        this.answers_ = du.mutableCopy(eoVar);
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnswers(int i2) {
        ensureAnswersIsMutable();
        this.answers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswers(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureAnswersIsMutable();
        this.answers_.set(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleType(k kVar) {
        this.titleType_ = kVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"bitField0_", "titleType_", "answers_", h.class});
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

    public h getAnswers(int i2) {
        return this.answers_.get(i2);
    }

    public int getAnswersCount() {
        return this.answers_.size();
    }

    public List<h> getAnswersList() {
        return this.answers_;
    }

    public i getAnswersOrBuilder(int i2) {
        return this.answers_.get(i2);
    }

    public List<? extends i> getAnswersOrBuilderList() {
        return this.answers_;
    }

    public k getTitleType() {
        int i2 = this.titleType_;
        k kVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : k.QUESTION_TITLE_TYPE_IS_LANE_CLOSED : k.QUESTION_TITLE_TYPE_WHAT_DO_YOU_SEE : k.QUESTION_TITLE_TYPE_UNSPECIFIED;
        return kVar == null ? k.UNRECOGNIZED : kVar;
    }

    public int getTitleTypeValue() {
        return this.titleType_;
    }

    public boolean hasTitleType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static j newBuilder(l lVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(com.google.v.z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(com.google.v.z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswers(h hVar) {
        Objects.requireNonNull(hVar);
        ensureAnswersIsMutable();
        this.answers_.add(hVar);
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
