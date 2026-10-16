package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at extends com.google.v.du<at, as> implements fj {
    private static final at DEFAULT_INSTANCE;
    public static final int ENRICH_INSIGHT_QUESTION_TRIGGER_POLICY_FIELD_NUMBER = 1;
    private static volatile fo<at> PARSER = null;
    public static final int SEGMENTATION_CONFIGURATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private ap enrichInsightQuestionTriggerPolicy_;
    private cu segmentationConfiguration_;

    static {
        at atVar = new at();
        DEFAULT_INSTANCE = atVar;
        com.google.v.du.registerDefaultInstance(at.class, atVar);
    }

    private at() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnrichInsightQuestionTriggerPolicy() {
        this.enrichInsightQuestionTriggerPolicy_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentationConfiguration() {
        this.segmentationConfiguration_ = null;
        this.bitField0_ &= -3;
    }

    public static at getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnrichInsightQuestionTriggerPolicy(ap apVar) {
        Objects.requireNonNull(apVar);
        ap apVar2 = this.enrichInsightQuestionTriggerPolicy_;
        if (apVar2 != null && apVar2 != ap.getDefaultInstance()) {
            ao aoVarNewBuilder = ap.newBuilder(apVar2);
            aoVarNewBuilder.mergeFrom((ao) apVar);
            apVar = aoVarNewBuilder.buildPartial();
        }
        this.enrichInsightQuestionTriggerPolicy_ = apVar;
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 2;
    }

    public static as newBuilder() {
        return (as) DEFAULT_INSTANCE.createBuilder();
    }

    public static at parseDelimitedFrom(InputStream inputStream) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(com.google.v.v vVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<at> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnrichInsightQuestionTriggerPolicy(ap apVar) {
        Objects.requireNonNull(apVar);
        this.enrichInsightQuestionTriggerPolicy_ = apVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentationConfiguration(cu cuVar) {
        Objects.requireNonNull(cuVar);
        this.segmentationConfiguration_ = cuVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "enrichInsightQuestionTriggerPolicy_", "segmentationConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new at();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new as(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<at> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (at.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ap getEnrichInsightQuestionTriggerPolicy() {
        ap apVar = this.enrichInsightQuestionTriggerPolicy_;
        return apVar == null ? ap.getDefaultInstance() : apVar;
    }

    public cu getSegmentationConfiguration() {
        cu cuVar = this.segmentationConfiguration_;
        return cuVar == null ? cu.getDefaultInstance() : cuVar;
    }

    public boolean hasEnrichInsightQuestionTriggerPolicy() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSegmentationConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    public static as newBuilder(at atVar) {
        return (as) DEFAULT_INSTANCE.createBuilder(atVar);
    }

    public static at parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (at) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static at parseFrom(com.google.v.z zVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static at parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static at parseFrom(InputStream inputStream) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static at parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static at parseFrom(ByteBuffer byteBuffer) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static at parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static at parseFrom(byte[] bArr) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static at parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (at) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
