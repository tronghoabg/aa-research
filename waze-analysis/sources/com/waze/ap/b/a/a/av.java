package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class av extends com.google.v.du<av, au> implements fj {
    private static final av DEFAULT_INSTANCE;
    public static final int ENRICH_INSIGHT_QUESTION_TRIGGER_POLICY_FIELD_NUMBER = 1;
    private static volatile fo<av> PARSER;
    private int bitField0_;
    private ap enrichInsightQuestionTriggerPolicy_;

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        com.google.v.du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnrichInsightQuestionTriggerPolicy() {
        this.enrichInsightQuestionTriggerPolicy_ = null;
        this.bitField0_ &= -2;
    }

    public static av getDefaultInstance() {
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

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static av parseDelimitedFrom(InputStream inputStream) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(com.google.v.v vVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<av> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnrichInsightQuestionTriggerPolicy(ap apVar) {
        Objects.requireNonNull(apVar);
        this.enrichInsightQuestionTriggerPolicy_ = apVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "enrichInsightQuestionTriggerPolicy_"});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<av> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (av.class) {
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

    public boolean hasEnrichInsightQuestionTriggerPolicy() {
        return (this.bitField0_ & 1) != 0;
    }

    public static au newBuilder(av avVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(avVar);
    }

    public static av parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static av parseFrom(com.google.v.z zVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static av parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static av parseFrom(InputStream inputStream) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(ByteBuffer byteBuffer) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static av parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static av parseFrom(byte[] bArr) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static av parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
