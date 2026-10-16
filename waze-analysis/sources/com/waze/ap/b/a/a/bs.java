package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bs extends com.google.v.du<bs, br> implements fj {
    public static final int CAPPING_CONFIGURATION_FIELD_NUMBER = 2;
    private static final bs DEFAULT_INSTANCE;
    public static final int DISABLE_INSIGHT_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int GROUPING_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int INSIGHT_FEEDBACK_QUESTION_TRIGGER_POLICY_FIELD_NUMBER = 5;
    private static volatile fo<bs> PARSER = null;
    public static final int SEGMENTATION_CONFIGURATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private n cappingConfiguration_;
    private z disableInsightConfiguration_;
    private ar groupingConfiguration_;
    private bm insightFeedbackQuestionTriggerPolicy_;
    private cu segmentationConfiguration_;

    static {
        bs bsVar = new bs();
        DEFAULT_INSTANCE = bsVar;
        com.google.v.du.registerDefaultInstance(bs.class, bsVar);
    }

    private bs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCappingConfiguration() {
        this.cappingConfiguration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableInsightConfiguration() {
        this.disableInsightConfiguration_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupingConfiguration() {
        this.groupingConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightFeedbackQuestionTriggerPolicy() {
        this.insightFeedbackQuestionTriggerPolicy_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentationConfiguration() {
        this.segmentationConfiguration_ = null;
        this.bitField0_ &= -5;
    }

    public static bs getDefaultInstance() {
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
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentationConfiguration(cu cuVar) {
        Objects.requireNonNull(cuVar);
        cu cuVar2 = this.segmentationConfiguration_;
        if (cuVar2 != null && cuVar2 != cu.getDefaultInstance()) {
            ct ctVarNewBuilder = cu.newBuilder(cuVar2);
            ctVarNewBuilder.mergeFrom((ct) cuVar);
            cuVar = ctVarNewBuilder.buildPartial();
        }
        this.segmentationConfiguration_ = cuVar;
        this.bitField0_ |= 4;
    }

    public static br newBuilder() {
        return (br) DEFAULT_INSTANCE.createBuilder();
    }

    public static bs parseDelimitedFrom(InputStream inputStream) {
        return (bs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bs parseFrom(com.google.v.v vVar) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bs> parser() {
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
        this.bitField0_ |= 8;
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
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentationConfiguration(cu cuVar) {
        Objects.requireNonNull(cuVar);
        this.segmentationConfiguration_ = cuVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "groupingConfiguration_", "cappingConfiguration_", "segmentationConfiguration_", "disableInsightConfiguration_", "insightFeedbackQuestionTriggerPolicy_"});
        }
        if (iOrdinal == 3) {
            return new bs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new br(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bs.class) {
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

    public cu getSegmentationConfiguration() {
        cu cuVar = this.segmentationConfiguration_;
        return cuVar == null ? cu.getDefaultInstance() : cuVar;
    }

    public boolean hasCappingConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDisableInsightConfiguration() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasGroupingConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInsightFeedbackQuestionTriggerPolicy() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSegmentationConfiguration() {
        return (this.bitField0_ & 4) != 0;
    }

    public static br newBuilder(bs bsVar) {
        return (br) DEFAULT_INSTANCE.createBuilder(bsVar);
    }

    public static bs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bs parseFrom(com.google.v.z zVar) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bs parseFrom(InputStream inputStream) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bs parseFrom(ByteBuffer byteBuffer) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bs parseFrom(byte[] bArr) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
