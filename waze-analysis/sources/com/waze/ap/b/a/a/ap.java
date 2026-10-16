package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ap extends com.google.v.du<ap, ao> implements fj {
    private static final ap DEFAULT_INSTANCE;
    private static volatile fo<ap> PARSER = null;
    public static final int TRIGGER_QUESTION_POLICY_FIELD_NUMBER = 1;
    private int bitField0_;
    private dm triggerQuestionPolicy_;

    static {
        ap apVar = new ap();
        DEFAULT_INSTANCE = apVar;
        com.google.v.du.registerDefaultInstance(ap.class, apVar);
    }

    private ap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerQuestionPolicy() {
        this.triggerQuestionPolicy_ = null;
        this.bitField0_ &= -2;
    }

    public static ap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTriggerQuestionPolicy(dm dmVar) {
        Objects.requireNonNull(dmVar);
        dm dmVar2 = this.triggerQuestionPolicy_;
        if (dmVar2 != null && dmVar2 != dm.getDefaultInstance()) {
            dl dlVarNewBuilder = dm.newBuilder(dmVar2);
            dlVarNewBuilder.mergeFrom((dl) dmVar);
            dmVar = dlVarNewBuilder.buildPartial();
        }
        this.triggerQuestionPolicy_ = dmVar;
        this.bitField0_ |= 1;
    }

    public static ao newBuilder() {
        return (ao) DEFAULT_INSTANCE.createBuilder();
    }

    public static ap parseDelimitedFrom(InputStream inputStream) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(com.google.v.v vVar) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ap> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerQuestionPolicy(dm dmVar) {
        Objects.requireNonNull(dmVar);
        this.triggerQuestionPolicy_ = dmVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "triggerQuestionPolicy_"});
        }
        if (iOrdinal == 3) {
            return new ap();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ao(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ap> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ap.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dm getTriggerQuestionPolicy() {
        dm dmVar = this.triggerQuestionPolicy_;
        return dmVar == null ? dm.getDefaultInstance() : dmVar;
    }

    public boolean hasTriggerQuestionPolicy() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ao newBuilder(ap apVar) {
        return (ao) DEFAULT_INSTANCE.createBuilder(apVar);
    }

    public static ap parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ap parseFrom(com.google.v.z zVar) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ap parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ap parseFrom(InputStream inputStream) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(ByteBuffer byteBuffer) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ap parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ap parseFrom(byte[] bArr) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ap parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ap) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
