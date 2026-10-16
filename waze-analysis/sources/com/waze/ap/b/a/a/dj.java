package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dj extends com.google.v.du<dj, di> implements fj {
    public static final int CAPPING_CONFIGURATION_FIELD_NUMBER = 2;
    private static final dj DEFAULT_INSTANCE;
    public static final int DISABLE_INSIGHT_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int GROUPING_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int INSIGHT_FEEDBACK_QUESTION_TRIGGER_POLICY_FIELD_NUMBER = 4;
    private static volatile fo<dj> PARSER;
    private int bitField0_;
    private n cappingConfiguration_;
    private z disableInsightConfiguration_;
    private ar groupingConfiguration_;
    private bm insightFeedbackQuestionTriggerPolicy_;

    static {
        dj djVar = new dj();
        DEFAULT_INSTANCE = djVar;
        com.google.v.du.registerDefaultInstance(dj.class, djVar);
    }

    private dj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCappingConfiguration() {
        this.cappingConfiguration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableInsightConfiguration() {
        this.disableInsightConfiguration_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupingConfiguration() {
        this.groupingConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightFeedbackQuestionTriggerPolicy() {
        this.insightFeedbackQuestionTriggerPolicy_ = null;
        this.bitField0_ &= -9;
    }

    public static dj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.cappingConfiguration_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            m mVarNewBuilder = n.newBuilder(nVar2);
            mVarNewBuilder.mergeFrom((m) nVar);
            nVar = mVarNewBuilder.buildPartial();
        }
        this.cappingConfiguration_ = nVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisableInsightConfiguration(z zVar) {
        Objects.requireNonNull(zVar);
        z zVar2 = this.disableInsightConfiguration_;
        if (zVar2 != null && zVar2 != z.getDefaultInstance()) {
            y yVarNewBuilder = z.newBuilder(zVar2);
            yVarNewBuilder.mergeFrom((y) zVar);
            zVar = yVarNewBuilder.buildPartial();
        }
        this.disableInsightConfiguration_ = zVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroupingConfiguration(ar arVar) {
        Objects.requireNonNull(arVar);
        ar arVar2 = this.groupingConfiguration_;
        if (arVar2 != null && arVar2 != ar.getDefaultInstance()) {
            aq aqVarNewBuilder = ar.newBuilder(arVar2);
            aqVarNewBuilder.mergeFrom((aq) arVar);
            arVar = aqVarNewBuilder.buildPartial();
        }
        this.groupingConfiguration_ = arVar;
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 8;
    }

    public static di newBuilder() {
        return (di) DEFAULT_INSTANCE.createBuilder();
    }

    public static dj parseDelimitedFrom(InputStream inputStream) {
        return (dj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dj parseFrom(com.google.v.v vVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        this.cappingConfiguration_ = nVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableInsightConfiguration(z zVar) {
        Objects.requireNonNull(zVar);
        this.disableInsightConfiguration_ = zVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupingConfiguration(ar arVar) {
        Objects.requireNonNull(arVar);
        this.groupingConfiguration_ = arVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightFeedbackQuestionTriggerPolicy(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.insightFeedbackQuestionTriggerPolicy_ = bmVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "groupingConfiguration_", "cappingConfiguration_", "disableInsightConfiguration_", "insightFeedbackQuestionTriggerPolicy_"});
        }
        if (iOrdinal == 3) {
            return new dj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new di(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public n getCappingConfiguration() {
        n nVar = this.cappingConfiguration_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public z getDisableInsightConfiguration() {
        z zVar = this.disableInsightConfiguration_;
        return zVar == null ? z.getDefaultInstance() : zVar;
    }

    public ar getGroupingConfiguration() {
        ar arVar = this.groupingConfiguration_;
        return arVar == null ? ar.getDefaultInstance() : arVar;
    }

    public bm getInsightFeedbackQuestionTriggerPolicy() {
        bm bmVar = this.insightFeedbackQuestionTriggerPolicy_;
        return bmVar == null ? bm.getDefaultInstance() : bmVar;
    }

    public boolean hasCappingConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDisableInsightConfiguration() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGroupingConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInsightFeedbackQuestionTriggerPolicy() {
        return (this.bitField0_ & 8) != 0;
    }

    public static di newBuilder(dj djVar) {
        return (di) DEFAULT_INSTANCE.createBuilder(djVar);
    }

    public static dj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dj parseFrom(com.google.v.z zVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dj parseFrom(InputStream inputStream) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dj parseFrom(ByteBuffer byteBuffer) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dj parseFrom(byte[] bArr) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
