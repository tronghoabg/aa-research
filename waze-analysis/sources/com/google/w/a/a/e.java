package com.google.w.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends du<e, a> implements fj {
    private static final e DEFAULT_INSTANCE;
    public static final int DISABLE_INTEGRATION_FIELD_NUMBER = 1;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int IS_TRUNK_STABLE_STUDY_FIELD_NUMBER = 4;
    public static final int MATCH_TYPE_FIELD_NUMBER = 5;
    public static final int OPERATION_GROUP_CONFIG_FIELD_NUMBER = 6;
    private static volatile fo<e> PARSER = null;
    public static final int WORKFLOW_TEMPLATE_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean disableIntegration_;
    private boolean isTrunkStableStudy_;
    private int matchType_;
    private d operationGroupConfig_;
    private String workflowTemplateType_ = "";
    private String displayName_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableIntegration() {
        this.bitField0_ &= -2;
        this.disableIntegration_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.bitField0_ &= -5;
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTrunkStableStudy() {
        this.bitField0_ &= -9;
        this.isTrunkStableStudy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatchType() {
        this.bitField0_ &= -17;
        this.matchType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationGroupConfig() {
        this.operationGroupConfig_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkflowTemplateType() {
        this.bitField0_ &= -3;
        this.workflowTemplateType_ = getDefaultInstance().getWorkflowTemplateType();
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOperationGroupConfig(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.operationGroupConfig_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.operationGroupConfig_ = dVar;
        this.bitField0_ |= 32;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableIntegration(boolean z) {
        this.bitField0_ |= 1;
        this.disableIntegration_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(v vVar) {
        this.displayName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTrunkStableStudy(boolean z) {
        this.bitField0_ |= 8;
        this.isTrunkStableStudy_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchType(b bVar) {
        this.matchType_ = bVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchTypeValue(int i2) {
        this.bitField0_ |= 16;
        this.matchType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationGroupConfig(d dVar) {
        Objects.requireNonNull(dVar);
        this.operationGroupConfig_ = dVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowTemplateType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.workflowTemplateType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowTemplateTypeBytes(v vVar) {
        this.workflowTemplateType_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "disableIntegration_", "workflowTemplateType_", "displayName_", "isTrunkStableStudy_", "matchType_", "operationGroupConfig_"});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getDisableIntegration() {
        return this.disableIntegration_;
    }

    public String getDisplayName() {
        return this.displayName_;
    }

    public v getDisplayNameBytes() {
        return v.s(this.displayName_);
    }

    public boolean getIsTrunkStableStudy() {
        return this.isTrunkStableStudy_;
    }

    public b getMatchType() {
        int i2 = this.matchType_;
        b bVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : b.GANTRY_MATCH_STAGELESS : b.GANTRY_MATCH_STATIC_ROLLBACK_WORKFLOW : b.GANTRY_MATCH_PARAMETERIZED_WORKFLOW_WITH_STATIC_STAGES : b.GANTRY_MATCH_PARAMETERIZED_WORKFLOW : b.GANTRY_MATCH_STATIC_WORKFLOW : b.GANTRY_MATCH_UNSPECIFIED;
        return bVar == null ? b.UNRECOGNIZED : bVar;
    }

    public int getMatchTypeValue() {
        return this.matchType_;
    }

    public d getOperationGroupConfig() {
        d dVar = this.operationGroupConfig_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public String getWorkflowTemplateType() {
        return this.workflowTemplateType_;
    }

    public v getWorkflowTemplateTypeBytes() {
        return v.s(this.workflowTemplateType_);
    }

    public boolean hasDisableIntegration() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDisplayName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsTrunkStableStudy() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMatchType() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasOperationGroupConfig() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasWorkflowTemplateType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(e eVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
