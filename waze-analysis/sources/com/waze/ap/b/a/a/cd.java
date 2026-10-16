package com.waze.ap.b.a.a;

import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cd extends com.google.v.du<cd, cb> implements ce {
    private static final cd DEFAULT_INSTANCE;
    public static final int ENRICH_INSIGHT_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int INSIGHT_FEEDBACK_CONFIGURATION_FIELD_NUMBER = 2;
    private static volatile fo<cd> PARSER;
    private int questionTypeConfigurationCase_ = 0;
    private Object questionTypeConfiguration_;

    static {
        cd cdVar = new cd();
        DEFAULT_INSTANCE = cdVar;
        com.google.v.du.registerDefaultInstance(cd.class, cdVar);
    }

    private cd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnrichInsightConfiguration() {
        if (this.questionTypeConfigurationCase_ == 1) {
            this.questionTypeConfigurationCase_ = 0;
            this.questionTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightFeedbackConfiguration() {
        if (this.questionTypeConfigurationCase_ == 2) {
            this.questionTypeConfigurationCase_ = 0;
            this.questionTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionTypeConfiguration() {
        this.questionTypeConfigurationCase_ = 0;
        this.questionTypeConfiguration_ = null;
    }

    public static cd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnrichInsightConfiguration(an anVar) {
        Objects.requireNonNull(anVar);
        if (this.questionTypeConfigurationCase_ == 1 && this.questionTypeConfiguration_ != an.getDefaultInstance()) {
            am amVarNewBuilder = an.newBuilder((an) this.questionTypeConfiguration_);
            amVarNewBuilder.mergeFrom((am) anVar);
            anVar = amVarNewBuilder.buildPartial();
        }
        this.questionTypeConfiguration_ = anVar;
        this.questionTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightFeedbackConfiguration(bk bkVar) {
        Objects.requireNonNull(bkVar);
        if (this.questionTypeConfigurationCase_ == 2 && this.questionTypeConfiguration_ != bk.getDefaultInstance()) {
            bj bjVarNewBuilder = bk.newBuilder((bk) this.questionTypeConfiguration_);
            bjVarNewBuilder.mergeFrom((bj) bkVar);
            bkVar = bjVarNewBuilder.buildPartial();
        }
        this.questionTypeConfiguration_ = bkVar;
        this.questionTypeConfigurationCase_ = 2;
    }

    public static cb newBuilder() {
        return (cb) DEFAULT_INSTANCE.createBuilder();
    }

    public static cd parseDelimitedFrom(InputStream inputStream) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(com.google.v.v vVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnrichInsightConfiguration(an anVar) {
        Objects.requireNonNull(anVar);
        this.questionTypeConfiguration_ = anVar;
        this.questionTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightFeedbackConfiguration(bk bkVar) {
        Objects.requireNonNull(bkVar);
        this.questionTypeConfiguration_ = bkVar;
        this.questionTypeConfigurationCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"questionTypeConfiguration_", "questionTypeConfigurationCase_", an.class, bk.class});
        }
        if (iOrdinal == 3) {
            return new cd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public an getEnrichInsightConfiguration() {
        return this.questionTypeConfigurationCase_ == 1 ? (an) this.questionTypeConfiguration_ : an.getDefaultInstance();
    }

    public bk getInsightFeedbackConfiguration() {
        return this.questionTypeConfigurationCase_ == 2 ? (bk) this.questionTypeConfiguration_ : bk.getDefaultInstance();
    }

    public cc getQuestionTypeConfigurationCase() {
        int i2 = this.questionTypeConfigurationCase_;
        if (i2 == 0) {
            return cc.f15039c;
        }
        if (i2 == 1) {
            return cc.f15037a;
        }
        if (i2 != 2) {
            return null;
        }
        return cc.f15038b;
    }

    public boolean hasEnrichInsightConfiguration() {
        return this.questionTypeConfigurationCase_ == 1;
    }

    public boolean hasInsightFeedbackConfiguration() {
        return this.questionTypeConfigurationCase_ == 2;
    }

    public static cb newBuilder(cd cdVar) {
        return (cb) DEFAULT_INSTANCE.createBuilder(cdVar);
    }

    public static cd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cd parseFrom(com.google.v.z zVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cd parseFrom(InputStream inputStream) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cd parseFrom(ByteBuffer byteBuffer) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cd parseFrom(byte[] bArr) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
