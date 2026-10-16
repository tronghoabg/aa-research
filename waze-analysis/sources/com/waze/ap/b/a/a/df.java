package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class df extends com.google.v.du<df, de> implements fj {
    public static final int CAPPING_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int COMBO_PRIORITY_FIELD_NUMBER = 1;
    private static final df DEFAULT_INSTANCE;
    public static final int DISABLE_INSIGHT_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int GROUPING_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int INSIGHT_FEEDBACK_QUESTION_TRIGGER_POLICY_FIELD_NUMBER = 5;
    private static volatile fo<df> PARSER;
    private int bitField0_;
    private n cappingConfiguration_;
    private int comboPriority_;
    private z disableInsightConfiguration_;
    private ar groupingConfiguration_;
    private bm insightFeedbackQuestionTriggerPolicy_;

    static {
        df dfVar = new df();
        DEFAULT_INSTANCE = dfVar;
        com.google.v.du.registerDefaultInstance(df.class, dfVar);
    }

    private df() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCappingConfiguration() {
        this.cappingConfiguration_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComboPriority() {
        this.bitField0_ &= -2;
        this.comboPriority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableInsightConfiguration() {
        this.disableInsightConfiguration_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupingConfiguration() {
        this.groupingConfiguration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightFeedbackQuestionTriggerPolicy() {
        this.insightFeedbackQuestionTriggerPolicy_ = null;
        this.bitField0_ &= -17;
    }

    public static df getDefaultInstance() {
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
        this.bitField0_ |= 4;
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
        this.bitField0_ |= 8;
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
        this.bitField0_ |= 2;
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
        this.bitField0_ |= 16;
    }

    public static de newBuilder() {
        return (de) DEFAULT_INSTANCE.createBuilder();
    }

    public static df parseDelimitedFrom(InputStream inputStream) {
        return (df) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static df parseFrom(com.google.v.v vVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<df> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        this.cappingConfiguration_ = nVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComboPriority(int i2) {
        this.bitField0_ |= 1;
        this.comboPriority_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableInsightConfiguration(z zVar) {
        Objects.requireNonNull(zVar);
        this.disableInsightConfiguration_ = zVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupingConfiguration(ar arVar) {
        Objects.requireNonNull(arVar);
        this.groupingConfiguration_ = arVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightFeedbackQuestionTriggerPolicy(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.insightFeedbackQuestionTriggerPolicy_ = bmVar;
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "comboPriority_", "groupingConfiguration_", "cappingConfiguration_", "disableInsightConfiguration_", "insightFeedbackQuestionTriggerPolicy_"});
        }
        if (iOrdinal == 3) {
            return new df();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new de(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<df> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (df.class) {
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

    public int getComboPriority() {
        return this.comboPriority_;
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
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasComboPriority() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDisableInsightConfiguration() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasGroupingConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasInsightFeedbackQuestionTriggerPolicy() {
        return (this.bitField0_ & 16) != 0;
    }

    public static de newBuilder(df dfVar) {
        return (de) DEFAULT_INSTANCE.createBuilder(dfVar);
    }

    public static df parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (df) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static df parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static df parseFrom(com.google.v.z zVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static df parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static df parseFrom(InputStream inputStream) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static df parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static df parseFrom(ByteBuffer byteBuffer) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static df parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static df parseFrom(byte[] bArr) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static df parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (df) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
