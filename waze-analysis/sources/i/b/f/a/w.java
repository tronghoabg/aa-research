package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends du<w, v> implements fj {
    public static final int CLAIMABLE_FIELD_NUMBER = 13;
    private static final w DEFAULT_INSTANCE;
    public static final int ELIGIBILITY_FIELD_NUMBER = 3;
    public static final int ELIGIBLE_FIELD_NUMBER = 15;
    public static final int HIDDEN_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile fo<w> PARSER = null;
    public static final int POINTS_REWARD_FIELD_NUMBER = 8;
    public static final int PREVIOUS_STATUS_FIELD_NUMBER = 11;
    public static final int SERIES_FIELD_NUMBER = 5;
    public static final int SERIES_ORDINAL_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 10;
    public static final int TARGET_FIELD_NUMBER = 4;
    public static final int TRIGGER_FIELD_NUMBER = 14;
    public static final int TRIGGER_TO_BE_REMOVED_FIELD_NUMBER = 12;
    public static final int TYPE_DEFINITION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean claimable_;
    private y eligibility_;
    private boolean hidden_;
    private ao pointsReward_;
    private int seriesOrdinal_;
    private int status_;
    private y target_;
    private y triggerToBeRemoved_;
    private bq trigger_;
    private bs typeDefinition_;
    private String id_ = "";
    private String series_ = "";
    private eo<bb> previousStatus_ = emptyProtobufList();
    private boolean eligible_ = true;

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPreviousStatus(Iterable<? extends bb> iterable) {
        ensurePreviousStatusIsMutable();
        com.google.v.c.addAll(iterable, this.previousStatus_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviousStatus(int i2, bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePreviousStatusIsMutable();
        this.previousStatus_.add(i2, bbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClaimable() {
        this.bitField0_ &= -1025;
        this.claimable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligibility() {
        this.eligibility_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligible() {
        this.bitField0_ &= -4097;
        this.eligible_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidden() {
        this.bitField0_ &= -65;
        this.hidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointsReward() {
        this.pointsReward_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviousStatus() {
        this.previousStatus_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeries() {
        this.bitField0_ &= -17;
        this.series_ = getDefaultInstance().getSeries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeriesOrdinal() {
        this.bitField0_ &= -33;
        this.seriesOrdinal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -257;
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrigger() {
        this.trigger_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerToBeRemoved() {
        this.triggerToBeRemoved_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeDefinition() {
        this.typeDefinition_ = null;
        this.bitField0_ &= -3;
    }

    private void ensurePreviousStatusIsMutable() {
        eo<bb> eoVar = this.previousStatus_;
        if (eoVar.c()) {
            return;
        }
        this.previousStatus_ = du.mutableCopy(eoVar);
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEligibility(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.eligibility_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.eligibility_ = yVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointsReward(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.pointsReward_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            an anVarNewBuilder = ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.pointsReward_ = aoVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTarget(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.target_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.target_ = yVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrigger(bq bqVar) {
        Objects.requireNonNull(bqVar);
        bq bqVar2 = this.trigger_;
        if (bqVar2 != null && bqVar2 != bq.getDefaultInstance()) {
            bp bpVarNewBuilder = bq.newBuilder(bqVar2);
            bpVarNewBuilder.mergeFrom((bp) bqVar);
            bqVar = bpVarNewBuilder.buildPartial();
        }
        this.trigger_ = bqVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTriggerToBeRemoved(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.triggerToBeRemoved_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.triggerToBeRemoved_ = yVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTypeDefinition(bs bsVar) {
        Objects.requireNonNull(bsVar);
        bs bsVar2 = this.typeDefinition_;
        if (bsVar2 != null && bsVar2 != bs.getDefaultInstance()) {
            br brVarNewBuilder = bs.newBuilder(bsVar2);
            brVarNewBuilder.mergeFrom((br) bsVar);
            bsVar = brVarNewBuilder.buildPartial();
        }
        this.typeDefinition_ = bsVar;
        this.bitField0_ |= 2;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePreviousStatus(int i2) {
        ensurePreviousStatusIsMutable();
        this.previousStatus_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClaimable(boolean z) {
        this.bitField0_ |= 1024;
        this.claimable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEligibility(y yVar) {
        Objects.requireNonNull(yVar);
        this.eligibility_ = yVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEligible(boolean z) {
        this.bitField0_ |= 4096;
        this.eligible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidden(boolean z) {
        this.bitField0_ |= 64;
        this.hidden_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsReward(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.pointsReward_ = aoVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousStatus(int i2, bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePreviousStatusIsMutable();
        this.previousStatus_.set(i2, bbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeries(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.series_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeriesBytes(com.google.v.v vVar) {
        this.series_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeriesOrdinal(int i2) {
        this.bitField0_ |= 32;
        this.seriesOrdinal_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ab abVar) {
        this.status_ = abVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(y yVar) {
        Objects.requireNonNull(yVar);
        this.target_ = yVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrigger(bq bqVar) {
        Objects.requireNonNull(bqVar);
        this.trigger_ = bqVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerToBeRemoved(y yVar) {
        Objects.requireNonNull(yVar);
        this.triggerToBeRemoved_ = yVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeDefinition(bs bsVar) {
        Objects.requireNonNull(bsVar);
        this.typeDefinition_ = bsVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဇ\u0006\bဉ\u0007\n᠌\b\u000b\u001b\fဉ\t\rဇ\n\u000eဉ\u000b\u000fဇ\f", new Object[]{"bitField0_", "id_", "typeDefinition_", "eligibility_", "target_", "series_", "seriesOrdinal_", "hidden_", "pointsReward_", "status_", bn.f48431b, "previousStatus_", bb.class, "triggerToBeRemoved_", "claimable_", "trigger_", "eligible_"});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getClaimable() {
        return this.claimable_;
    }

    public y getEligibility() {
        y yVar = this.eligibility_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public boolean getEligible() {
        return this.eligible_;
    }

    public boolean getHidden() {
        return this.hidden_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public ao getPointsReward() {
        ao aoVar = this.pointsReward_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public bb getPreviousStatus(int i2) {
        return this.previousStatus_.get(i2);
    }

    public int getPreviousStatusCount() {
        return this.previousStatus_.size();
    }

    public List<bb> getPreviousStatusList() {
        return this.previousStatus_;
    }

    public bc getPreviousStatusOrBuilder(int i2) {
        return this.previousStatus_.get(i2);
    }

    public List<? extends bc> getPreviousStatusOrBuilderList() {
        return this.previousStatus_;
    }

    public String getSeries() {
        return this.series_;
    }

    public com.google.v.v getSeriesBytes() {
        return com.google.v.v.s(this.series_);
    }

    public int getSeriesOrdinal() {
        return this.seriesOrdinal_;
    }

    public ab getStatus() {
        ab abVarA = ab.a(this.status_);
        return abVarA == null ? ab.UNKNOWN : abVarA;
    }

    public y getTarget() {
        y yVar = this.target_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public bq getTrigger() {
        bq bqVar = this.trigger_;
        return bqVar == null ? bq.getDefaultInstance() : bqVar;
    }

    @Deprecated
    public y getTriggerToBeRemoved() {
        y yVar = this.triggerToBeRemoved_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public bs getTypeDefinition() {
        bs bsVar = this.typeDefinition_;
        return bsVar == null ? bs.getDefaultInstance() : bsVar;
    }

    public boolean hasClaimable() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasEligibility() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEligible() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasHidden() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPointsReward() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSeries() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSeriesOrdinal() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTarget() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTrigger() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Deprecated
    public boolean hasTriggerToBeRemoved() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasTypeDefinition() {
        return (this.bitField0_ & 2) != 0;
    }

    public static v newBuilder(w wVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(com.google.v.z zVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(com.google.v.z zVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviousStatus(bb bbVar) {
        Objects.requireNonNull(bbVar);
        ensurePreviousStatusIsMutable();
        this.previousStatus_.add(bbVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
