package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ba extends com.google.v.du<ba, az> implements fj {
    private static final ba DEFAULT_INSTANCE;
    public static final int INSIGHT_DIMENSION_QUESTION_TRIGGER_POLICY_FIELD_NUMBER = 1;
    private static volatile fo<ba> PARSER;
    private int bitField0_;
    private bi insightDimensionQuestionTriggerPolicy_;

    static {
        ba baVar = new ba();
        DEFAULT_INSTANCE = baVar;
        com.google.v.du.registerDefaultInstance(ba.class, baVar);
    }

    private ba() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightDimensionQuestionTriggerPolicy() {
        this.insightDimensionQuestionTriggerPolicy_ = null;
        this.bitField0_ &= -2;
    }

    public static ba getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightDimensionQuestionTriggerPolicy(bi biVar) {
        Objects.requireNonNull(biVar);
        bi biVar2 = this.insightDimensionQuestionTriggerPolicy_;
        if (biVar2 != null && biVar2 != bi.getDefaultInstance()) {
            bh bhVarNewBuilder = bi.newBuilder(biVar2);
            bhVarNewBuilder.mergeFrom((bh) biVar);
            biVar = bhVarNewBuilder.buildPartial();
        }
        this.insightDimensionQuestionTriggerPolicy_ = biVar;
        this.bitField0_ |= 1;
    }

    public static az newBuilder() {
        return (az) DEFAULT_INSTANCE.createBuilder();
    }

    public static ba parseDelimitedFrom(InputStream inputStream) {
        return (ba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ba parseFrom(com.google.v.v vVar) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ba> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightDimensionQuestionTriggerPolicy(bi biVar) {
        Objects.requireNonNull(biVar);
        this.insightDimensionQuestionTriggerPolicy_ = biVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "insightDimensionQuestionTriggerPolicy_"});
        }
        if (iOrdinal == 3) {
            return new ba();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new az(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ba> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ba.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bi getInsightDimensionQuestionTriggerPolicy() {
        bi biVar = this.insightDimensionQuestionTriggerPolicy_;
        return biVar == null ? bi.getDefaultInstance() : biVar;
    }

    public boolean hasInsightDimensionQuestionTriggerPolicy() {
        return (this.bitField0_ & 1) != 0;
    }

    public static az newBuilder(ba baVar) {
        return (az) DEFAULT_INSTANCE.createBuilder(baVar);
    }

    public static ba parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ba parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ba parseFrom(com.google.v.z zVar) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ba parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ba parseFrom(InputStream inputStream) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ba parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ba parseFrom(ByteBuffer byteBuffer) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ba parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ba parseFrom(byte[] bArr) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ba parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ba) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
