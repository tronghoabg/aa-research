package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dd extends com.google.v.du<dd, dc> implements fj {
    public static final int COMBO_PRIORITY_FIELD_NUMBER = 1;
    private static final dd DEFAULT_INSTANCE;
    public static final int INSIGHT_FEEDBACK_QUESTION_TRIGGER_POLICY_FIELD_NUMBER = 6;
    private static volatile fo<dd> PARSER;
    private int bitField0_;
    private int comboPriority_;
    private bm insightFeedbackQuestionTriggerPolicy_;

    static {
        dd ddVar = new dd();
        DEFAULT_INSTANCE = ddVar;
        com.google.v.du.registerDefaultInstance(dd.class, ddVar);
    }

    private dd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComboPriority() {
        this.bitField0_ &= -2;
        this.comboPriority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightFeedbackQuestionTriggerPolicy() {
        this.insightFeedbackQuestionTriggerPolicy_ = null;
        this.bitField0_ &= -3;
    }

    public static dd getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static dc newBuilder() {
        return (dc) DEFAULT_INSTANCE.createBuilder();
    }

    public static dd parseDelimitedFrom(InputStream inputStream) {
        return (dd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dd parseFrom(com.google.v.v vVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComboPriority(int i2) {
        this.bitField0_ |= 1;
        this.comboPriority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightFeedbackQuestionTriggerPolicy(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.insightFeedbackQuestionTriggerPolicy_ = bmVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001င\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "comboPriority_", "insightFeedbackQuestionTriggerPolicy_"});
        }
        if (iOrdinal == 3) {
            return new dd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getComboPriority() {
        return this.comboPriority_;
    }

    public bm getInsightFeedbackQuestionTriggerPolicy() {
        bm bmVar = this.insightFeedbackQuestionTriggerPolicy_;
        return bmVar == null ? bm.getDefaultInstance() : bmVar;
    }

    public boolean hasComboPriority() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInsightFeedbackQuestionTriggerPolicy() {
        return (this.bitField0_ & 2) != 0;
    }

    public static dc newBuilder(dd ddVar) {
        return (dc) DEFAULT_INSTANCE.createBuilder(ddVar);
    }

    public static dd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dd parseFrom(com.google.v.z zVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dd parseFrom(InputStream inputStream) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dd parseFrom(ByteBuffer byteBuffer) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dd parseFrom(byte[] bArr) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
