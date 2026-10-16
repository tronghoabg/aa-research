package com.waze.bg.e.a;

import i.b.l.pd;
import i.b.l.pe;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp extends com.google.v.du<bp, bn> implements com.google.v.fj {
    public static final int CAUSING_ALERT_FIELD_NUMBER = 3;
    public static final int DEFAULT_ACTION_FIELD_NUMBER = 1;
    private static final bp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bp> PARSER = null;
    public static final int PROMPT_DESCRIPTION_FIELD_NUMBER = 2;
    public static final int REROUTE_DATA_FIELD_NUMBER = 4;
    private int bitField0_;
    private ie causingAlert_;
    private int defaultAction_ = 1;
    private pe promptDescription_;
    private br rerouteData_;

    static {
        bp bpVar = new bp();
        DEFAULT_INSTANCE = bpVar;
        com.google.v.du.registerDefaultInstance(bp.class, bpVar);
    }

    private bp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCausingAlert() {
        this.causingAlert_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultAction() {
        this.bitField0_ &= -2;
        this.defaultAction_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptDescription() {
        this.promptDescription_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteData() {
        this.rerouteData_ = null;
        this.bitField0_ &= -3;
    }

    public static bp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCausingAlert(ie ieVar) {
        Objects.requireNonNull(ieVar);
        ie ieVar2 = this.causingAlert_;
        if (ieVar2 != null && ieVar2 != ie.getDefaultInstance()) {
            id idVarNewBuilder = ie.newBuilder(ieVar2);
            idVarNewBuilder.mergeFrom((id) ieVar);
            ieVar = idVarNewBuilder.buildPartial();
        }
        this.causingAlert_ = ieVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromptDescription(pe peVar) {
        Objects.requireNonNull(peVar);
        pe peVar2 = this.promptDescription_;
        if (peVar2 != null && peVar2 != pe.getDefaultInstance()) {
            pd pdVarNewBuilder = pe.newBuilder(peVar2);
            pdVarNewBuilder.mergeFrom((pd) peVar);
            peVar = pdVarNewBuilder.buildPartial();
        }
        this.promptDescription_ = peVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteData(br brVar) {
        Objects.requireNonNull(brVar);
        br brVar2 = this.rerouteData_;
        if (brVar2 != null && brVar2 != br.getDefaultInstance()) {
            bq bqVarNewBuilder = br.newBuilder(brVar2);
            bqVarNewBuilder.mergeFrom((bq) brVar);
            brVar = bqVarNewBuilder.buildPartial();
        }
        this.rerouteData_ = brVar;
        this.bitField0_ |= 2;
    }

    public static bn newBuilder() {
        return (bn) DEFAULT_INSTANCE.createBuilder();
    }

    public static bp parseDelimitedFrom(InputStream inputStream) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(com.google.v.v vVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCausingAlert(ie ieVar) {
        Objects.requireNonNull(ieVar);
        this.causingAlert_ = ieVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultAction(bo boVar) {
        this.defaultAction_ = boVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptDescription(pe peVar) {
        Objects.requireNonNull(peVar);
        this.promptDescription_ = peVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteData(br brVar) {
        Objects.requireNonNull(brVar);
        this.rerouteData_ = brVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0001", new Object[]{"bitField0_", "defaultAction_", ci.f16636b, "promptDescription_", "causingAlert_", "rerouteData_"});
        }
        if (iOrdinal == 3) {
            return new bp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ie getCausingAlert() {
        ie ieVar = this.causingAlert_;
        return ieVar == null ? ie.getDefaultInstance() : ieVar;
    }

    public bo getDefaultAction() {
        bo boVarA = bo.a(this.defaultAction_);
        return boVarA == null ? bo.DEFAULT_ACTION_UNSPECIFIED : boVarA;
    }

    public pe getPromptDescription() {
        pe peVar = this.promptDescription_;
        return peVar == null ? pe.getDefaultInstance() : peVar;
    }

    public br getRerouteData() {
        br brVar = this.rerouteData_;
        return brVar == null ? br.getDefaultInstance() : brVar;
    }

    public boolean hasCausingAlert() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDefaultAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPromptDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRerouteData() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bn newBuilder(bp bpVar) {
        return (bn) DEFAULT_INSTANCE.createBuilder(bpVar);
    }

    public static bp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bp parseFrom(com.google.v.z zVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bp parseFrom(InputStream inputStream) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(ByteBuffer byteBuffer) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bp parseFrom(byte[] bArr) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
