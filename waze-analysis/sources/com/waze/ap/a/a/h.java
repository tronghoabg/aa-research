package com.waze.ap.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h extends du<h, g> implements i {
    private static final h DEFAULT_INSTANCE;
    public static final int INSIGHT_ANSWER_FIELD_NUMBER = 100;
    private static volatile fo<h> PARSER = null;
    public static final int VALIDATION_ANSWER_FIELD_NUMBER = 101;
    private int answerContentCase_ = 0;
    private Object answerContent_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswerContent() {
        this.answerContentCase_ = 0;
        this.answerContent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightAnswer() {
        if (this.answerContentCase_ == 100) {
            this.answerContentCase_ = 0;
            this.answerContent_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidationAnswer() {
        if (this.answerContentCase_ == 101) {
            this.answerContentCase_ = 0;
            this.answerContent_ = null;
        }
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightAnswer(p pVar) {
        Objects.requireNonNull(pVar);
        if (this.answerContentCase_ == 100 && this.answerContent_ != p.getDefaultInstance()) {
            m mVarNewBuilder = p.newBuilder((p) this.answerContent_);
            mVarNewBuilder.mergeFrom((m) pVar);
            pVar = mVarNewBuilder.buildPartial();
        }
        this.answerContent_ = pVar;
        this.answerContentCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidationAnswer(ap apVar) {
        Objects.requireNonNull(apVar);
        if (this.answerContentCase_ == 101 && this.answerContent_ != ap.getDefaultInstance()) {
            an anVarNewBuilder = ap.newBuilder((ap) this.answerContent_);
            anVarNewBuilder.mergeFrom((an) apVar);
            apVar = anVarNewBuilder.buildPartial();
        }
        this.answerContent_ = apVar;
        this.answerContentCase_ = 101;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(com.google.v.v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightAnswer(p pVar) {
        Objects.requireNonNull(pVar);
        this.answerContent_ = pVar;
        this.answerContentCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidationAnswer(ap apVar) {
        Objects.requireNonNull(apVar);
        this.answerContent_ = apVar;
        this.answerContentCase_ = 101;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000de\u0002\u0000\u0000\u0000d<\u0000e<\u0000", new Object[]{"answerContent_", "answerContentCase_", p.class, ap.class});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public f getAnswerContentCase() {
        int i2 = this.answerContentCase_;
        if (i2 == 0) {
            return f.f14946c;
        }
        if (i2 == 100) {
            return f.f14944a;
        }
        if (i2 != 101) {
            return null;
        }
        return f.f14945b;
    }

    public p getInsightAnswer() {
        return this.answerContentCase_ == 100 ? (p) this.answerContent_ : p.getDefaultInstance();
    }

    public ap getValidationAnswer() {
        return this.answerContentCase_ == 101 ? (ap) this.answerContent_ : ap.getDefaultInstance();
    }

    public boolean hasInsightAnswer() {
        return this.answerContentCase_ == 100;
    }

    public boolean hasValidationAnswer() {
        return this.answerContentCase_ == 101;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(com.google.v.v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(com.google.v.z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(com.google.v.z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
