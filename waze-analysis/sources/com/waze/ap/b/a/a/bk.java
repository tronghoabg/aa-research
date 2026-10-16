package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk extends com.google.v.du<bk, bj> implements fj {
    private static final bk DEFAULT_INSTANCE;
    public static final int INTERACTION_CAPPING_CONFIGURATION_FIELD_NUMBER = 2;
    private static volatile fo<bk> PARSER = null;
    public static final int PER_INSIGHT_INTERACTION_CAPPING_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int PER_INSIGHT_SHOWN_CAPPING_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int SHOWN_CAPPING_CONFIGURATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private n interactionCappingConfiguration_;
    private n perInsightInteractionCappingConfiguration_;
    private n perInsightShownCappingConfiguration_;
    private n shownCappingConfiguration_;

    static {
        bk bkVar = new bk();
        DEFAULT_INSTANCE = bkVar;
        com.google.v.du.registerDefaultInstance(bk.class, bkVar);
    }

    private bk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteractionCappingConfiguration() {
        this.interactionCappingConfiguration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerInsightInteractionCappingConfiguration() {
        this.perInsightInteractionCappingConfiguration_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerInsightShownCappingConfiguration() {
        this.perInsightShownCappingConfiguration_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShownCappingConfiguration() {
        this.shownCappingConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static bk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInteractionCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.interactionCappingConfiguration_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            m mVarNewBuilder = n.newBuilder(nVar2);
            mVarNewBuilder.mergeFrom((m) nVar);
            nVar = mVarNewBuilder.buildPartial();
        }
        this.interactionCappingConfiguration_ = nVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePerInsightInteractionCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.perInsightInteractionCappingConfiguration_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            m mVarNewBuilder = n.newBuilder(nVar2);
            mVarNewBuilder.mergeFrom((m) nVar);
            nVar = mVarNewBuilder.buildPartial();
        }
        this.perInsightInteractionCappingConfiguration_ = nVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePerInsightShownCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.perInsightShownCappingConfiguration_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            m mVarNewBuilder = n.newBuilder(nVar2);
            mVarNewBuilder.mergeFrom((m) nVar);
            nVar = mVarNewBuilder.buildPartial();
        }
        this.perInsightShownCappingConfiguration_ = nVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShownCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.shownCappingConfiguration_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            m mVarNewBuilder = n.newBuilder(nVar2);
            mVarNewBuilder.mergeFrom((m) nVar);
            nVar = mVarNewBuilder.buildPartial();
        }
        this.shownCappingConfiguration_ = nVar;
        this.bitField0_ |= 1;
    }

    public static bj newBuilder() {
        return (bj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bk parseDelimitedFrom(InputStream inputStream) {
        return (bk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bk parseFrom(com.google.v.v vVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteractionCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        this.interactionCappingConfiguration_ = nVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerInsightInteractionCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        this.perInsightInteractionCappingConfiguration_ = nVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerInsightShownCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        this.perInsightShownCappingConfiguration_ = nVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShownCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        this.shownCappingConfiguration_ = nVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "shownCappingConfiguration_", "interactionCappingConfiguration_", "perInsightShownCappingConfiguration_", "perInsightInteractionCappingConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new bk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public n getInteractionCappingConfiguration() {
        n nVar = this.interactionCappingConfiguration_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public n getPerInsightInteractionCappingConfiguration() {
        n nVar = this.perInsightInteractionCappingConfiguration_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public n getPerInsightShownCappingConfiguration() {
        n nVar = this.perInsightShownCappingConfiguration_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public n getShownCappingConfiguration() {
        n nVar = this.shownCappingConfiguration_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public boolean hasInteractionCappingConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPerInsightInteractionCappingConfiguration() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPerInsightShownCappingConfiguration() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasShownCappingConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bj newBuilder(bk bkVar) {
        return (bj) DEFAULT_INSTANCE.createBuilder(bkVar);
    }

    public static bk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bk parseFrom(com.google.v.z zVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bk parseFrom(InputStream inputStream) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bk parseFrom(ByteBuffer byteBuffer) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bk parseFrom(byte[] bArr) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
