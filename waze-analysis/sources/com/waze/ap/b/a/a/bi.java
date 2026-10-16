package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bi extends com.google.v.du<bi, bh> implements fj {
    private static final bi DEFAULT_INSTANCE;
    private static volatile fo<bi> PARSER = null;
    public static final int TRIGGER_QUESTION_POLICY_FIELD_NUMBER = 1;
    private int bitField0_;
    private dm triggerQuestionPolicy_;

    static {
        bi biVar = new bi();
        DEFAULT_INSTANCE = biVar;
        com.google.v.du.registerDefaultInstance(bi.class, biVar);
    }

    private bi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerQuestionPolicy() {
        this.triggerQuestionPolicy_ = null;
        this.bitField0_ &= -2;
    }

    public static bi getDefaultInstance() {
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

    public static bh newBuilder() {
        return (bh) DEFAULT_INSTANCE.createBuilder();
    }

    public static bi parseDelimitedFrom(InputStream inputStream) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(com.google.v.v vVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bi> parser() {
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
            return new bi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bi.class) {
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

    public static bh newBuilder(bi biVar) {
        return (bh) DEFAULT_INSTANCE.createBuilder(biVar);
    }

    public static bi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bi parseFrom(com.google.v.z zVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bi parseFrom(InputStream inputStream) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(ByteBuffer byteBuffer) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bi parseFrom(byte[] bArr) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
