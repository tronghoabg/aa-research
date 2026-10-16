package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class av extends com.google.v.du<av, at> implements fj {
    private static final av DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int MAP_ISSUE_TYPE_FIELD_NUMBER = 1;
    private static volatile fo<av> PARSER = null;
    public static final int REPORTING_MANNER_FIELD_NUMBER = 5;
    public static final int UR_DISCLAIMER_SHOWN_FIELD_NUMBER = 4;
    public static final int USER_POSITION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String description_ = "";
    private int mapIssueType_;
    private int reportingManner_;
    private boolean urDisclaimerShown_;
    private com.waze.bg.d.d userPosition_;

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        com.google.v.du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -5;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapIssueType() {
        this.bitField0_ &= -2;
        this.mapIssueType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingManner() {
        this.bitField0_ &= -17;
        this.reportingManner_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrDisclaimerShown() {
        this.bitField0_ &= -9;
        this.urDisclaimerShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPosition() {
        this.userPosition_ = null;
        this.bitField0_ &= -3;
    }

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPosition(com.waze.bg.d.d dVar) {
        Objects.requireNonNull(dVar);
        com.waze.bg.d.d dVar2 = this.userPosition_;
        if (dVar2 != null && dVar2 != com.waze.bg.d.d.getDefaultInstance()) {
            com.waze.bg.d.c cVarNewBuilder = com.waze.bg.d.d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((com.waze.bg.d.c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.userPosition_ = dVar;
        this.bitField0_ |= 2;
    }

    public static at newBuilder() {
        return (at) DEFAULT_INSTANCE.createBuilder();
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
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapIssueType(cd cdVar) {
        this.mapIssueType_ = cdVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingManner(au auVar) {
        this.reportingManner_ = auVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrDisclaimerShown(boolean z) {
        this.bitField0_ |= 8;
        this.urDisclaimerShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPosition(com.waze.bg.d.d dVar) {
        Objects.requireNonNull(dVar);
        this.userPosition_ = dVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "mapIssueType_", cc.f16509a, "userPosition_", "description_", "urDisclaimerShown_", "reportingManner_", o.f16558d});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new at(bArr);
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

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public cd getMapIssueType() {
        cd cdVarB = cd.b(this.mapIssueType_);
        return cdVarB == null ? cd.MAP_ISSUE_UNSPECIFIED : cdVarB;
    }

    public au getReportingManner() {
        au auVarA = au.a(this.reportingManner_);
        return auVarA == null ? au.REPORTING_MANNER_UNSPECIFIED : auVarA;
    }

    public boolean getUrDisclaimerShown() {
        return this.urDisclaimerShown_;
    }

    public com.waze.bg.d.d getUserPosition() {
        com.waze.bg.d.d dVar = this.userPosition_;
        return dVar == null ? com.waze.bg.d.d.getDefaultInstance() : dVar;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMapIssueType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReportingManner() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUrDisclaimerShown() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUserPosition() {
        return (this.bitField0_ & 2) != 0;
    }

    public static at newBuilder(av avVar) {
        return (at) DEFAULT_INSTANCE.createBuilder(avVar);
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
