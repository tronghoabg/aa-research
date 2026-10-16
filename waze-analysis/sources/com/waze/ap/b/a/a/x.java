package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x extends com.google.v.du<x, w> implements fj {
    private static final x DEFAULT_INSTANCE;
    public static final int INSIGHT_FEEDBACK_QUESTION_TRIGGER_POLICY_FIELD_NUMBER = 1;
    private static volatile fo<x> PARSER;
    private int bitField0_;
    private bm insightFeedbackQuestionTriggerPolicy_;

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        com.google.v.du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightFeedbackQuestionTriggerPolicy() {
        this.insightFeedbackQuestionTriggerPolicy_ = null;
        this.bitField0_ &= -2;
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightFeedbackQuestionTriggerPolicy(bm bmVar) {
        Objects.requireNonNull(bmVar);
        bm bmVar2 = this.insightFeedbackQuestionTriggerPolicy_;
        if (bmVar2 != null && bmVar2 != bm.getDefaultInstance()) {
            bl blVarNewBuilder = bm.newBuilder(bmVar2);
            blVarNewBuilder.mergeFrom((bl) bmVar);
            bmVar = blVarNewBuilder.buildPartial();
        }
        this.insightFeedbackQuestionTriggerPolicy_ = bmVar;
        this.bitField0_ |= 1;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightFeedbackQuestionTriggerPolicy(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.insightFeedbackQuestionTriggerPolicy_ = bmVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "insightFeedbackQuestionTriggerPolicy_"});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new w(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bm getInsightFeedbackQuestionTriggerPolicy() {
        bm bmVar = this.insightFeedbackQuestionTriggerPolicy_;
        return bmVar == null ? bm.getDefaultInstance() : bmVar;
    }

    public boolean hasInsightFeedbackQuestionTriggerPolicy() {
        return (this.bitField0_ & 1) != 0;
    }

    public static w newBuilder(x xVar) {
        return (w) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
