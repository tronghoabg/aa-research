package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gb;
import com.google.v.gc;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab extends du<ab, z> implements fj {
    public static final int AVAILABILITY_END_TIMESTAMP_FIELD_NUMBER = 6;
    public static final int AVAILABILITY_START_TIMESTAMP_FIELD_NUMBER = 5;
    private static final ab DEFAULT_INSTANCE;
    public static final int KNOWLEDGE_PANEL_SYNDICATION_POLICY_METADATA_FIELD_NUMBER = 22;
    public static final int LEGAL_ALLOWED_REGIONS_FIELD_NUMBER = 4;
    public static final int LEGAL_REMOVAL_REGIONS_FIELD_NUMBER = 1;
    public static final int LLM_POLICY_METADATA_FIELD_NUMBER = 21;
    public static final int LMS_POLICY_METADATA_FIELD_NUMBER = 18;
    private static volatile fo<ab> PARSER = null;
    public static final int POLICY_DATA_SCOPE_KEYS_FIELD_NUMBER = 19;
    public static final int POLICY_SOURCE_TYPE_FIELD_NUMBER = 7;
    public static final int RWJ_POLICY_METADATA_FIELD_NUMBER = 20;
    public static final int UMP_POLICY_METADATA_FIELD_NUMBER = 17;
    private gc availabilityEndTimestamp_;
    private gc availabilityStartTimestamp_;
    private int bitField0_;
    private u knowledgePanelSyndicationPolicyMetadata_;
    private w llmPolicyMetadata_;
    private y lmsPolicyMetadata_;
    private int policySourceType_;
    private ad rwjPolicyMetadata_;
    private af umpPolicyMetadata_;
    private int policyDataScopeKeysMemoizedSerializedSize = -1;
    private eo<com.google.w.i.a.c> legalRemovalRegions_ = emptyProtobufList();
    private eo<com.google.w.i.a.c> legalAllowedRegions_ = emptyProtobufList();
    private ek policyDataScopeKeys_ = emptyIntList();

    static {
        ab abVar = new ab();
        DEFAULT_INSTANCE = abVar;
        du.registerDefaultInstance(ab.class, abVar);
    }

    private ab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLegalAllowedRegions(Iterable<? extends com.google.w.i.a.c> iterable) {
        ensureLegalAllowedRegionsIsMutable();
        com.google.v.c.addAll(iterable, this.legalAllowedRegions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLegalRemovalRegions(Iterable<? extends com.google.w.i.a.c> iterable) {
        ensureLegalRemovalRegionsIsMutable();
        com.google.v.c.addAll(iterable, this.legalRemovalRegions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolicyDataScopeKeys(Iterable<? extends Integer> iterable) {
        ensurePolicyDataScopeKeysIsMutable();
        com.google.v.c.addAll(iterable, this.policyDataScopeKeys_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLegalAllowedRegions(int i2, com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureLegalAllowedRegionsIsMutable();
        this.legalAllowedRegions_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLegalRemovalRegions(int i2, com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureLegalRemovalRegionsIsMutable();
        this.legalRemovalRegions_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolicyDataScopeKeys(int i2) {
        ensurePolicyDataScopeKeysIsMutable();
        this.policyDataScopeKeys_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityEndTimestamp() {
        this.availabilityEndTimestamp_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityStartTimestamp() {
        this.availabilityStartTimestamp_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKnowledgePanelSyndicationPolicyMetadata() {
        this.knowledgePanelSyndicationPolicyMetadata_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegalAllowedRegions() {
        this.legalAllowedRegions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegalRemovalRegions() {
        this.legalRemovalRegions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLlmPolicyMetadata() {
        this.llmPolicyMetadata_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLmsPolicyMetadata() {
        this.lmsPolicyMetadata_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolicyDataScopeKeys() {
        this.policyDataScopeKeys_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolicySourceType() {
        this.bitField0_ &= -129;
        this.policySourceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRwjPolicyMetadata() {
        this.rwjPolicyMetadata_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUmpPolicyMetadata() {
        this.umpPolicyMetadata_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureLegalAllowedRegionsIsMutable() {
        eo<com.google.w.i.a.c> eoVar = this.legalAllowedRegions_;
        if (eoVar.c()) {
            return;
        }
        this.legalAllowedRegions_ = du.mutableCopy(eoVar);
    }

    private void ensureLegalRemovalRegionsIsMutable() {
        eo<com.google.w.i.a.c> eoVar = this.legalRemovalRegions_;
        if (eoVar.c()) {
            return;
        }
        this.legalRemovalRegions_ = du.mutableCopy(eoVar);
    }

    private void ensurePolicyDataScopeKeysIsMutable() {
        ek ekVar = this.policyDataScopeKeys_;
        if (ekVar.c()) {
            return;
        }
        this.policyDataScopeKeys_ = du.mutableCopy(ekVar);
    }

    public static ab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailabilityEndTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.availabilityEndTimestamp_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.availabilityEndTimestamp_ = gcVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailabilityStartTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.availabilityStartTimestamp_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.availabilityStartTimestamp_ = gcVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKnowledgePanelSyndicationPolicyMetadata(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.knowledgePanelSyndicationPolicyMetadata_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.knowledgePanelSyndicationPolicyMetadata_ = uVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLlmPolicyMetadata(w wVar) {
        Objects.requireNonNull(wVar);
        w wVar2 = this.llmPolicyMetadata_;
        if (wVar2 != null && wVar2 != w.getDefaultInstance()) {
            v vVarNewBuilder = w.newBuilder(wVar2);
            vVarNewBuilder.mergeFrom((v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.llmPolicyMetadata_ = wVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLmsPolicyMetadata(y yVar) {
        Objects.requireNonNull(yVar);
        y yVar2 = this.lmsPolicyMetadata_;
        if (yVar2 != null && yVar2 != y.getDefaultInstance()) {
            x xVarNewBuilder = y.newBuilder(yVar2);
            xVarNewBuilder.mergeFrom((x) yVar);
            yVar = xVarNewBuilder.buildPartial();
        }
        this.lmsPolicyMetadata_ = yVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRwjPolicyMetadata(ad adVar) {
        Objects.requireNonNull(adVar);
        ad adVar2 = this.rwjPolicyMetadata_;
        if (adVar2 != null && adVar2 != ad.getDefaultInstance()) {
            ac acVarNewBuilder = ad.newBuilder(adVar2);
            acVarNewBuilder.mergeFrom((ac) adVar);
            adVar = acVarNewBuilder.buildPartial();
        }
        this.rwjPolicyMetadata_ = adVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUmpPolicyMetadata(af afVar) {
        Objects.requireNonNull(afVar);
        af afVar2 = this.umpPolicyMetadata_;
        if (afVar2 != null && afVar2 != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder(afVar2);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.umpPolicyMetadata_ = afVar;
        this.bitField0_ |= 4;
    }

    public static z newBuilder() {
        return (z) DEFAULT_INSTANCE.createBuilder();
    }

    public static ab parseDelimitedFrom(InputStream inputStream) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(com.google.v.v vVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLegalAllowedRegions(int i2) {
        ensureLegalAllowedRegionsIsMutable();
        this.legalAllowedRegions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLegalRemovalRegions(int i2) {
        ensureLegalRemovalRegionsIsMutable();
        this.legalRemovalRegions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityEndTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.availabilityEndTimestamp_ = gcVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityStartTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.availabilityStartTimestamp_ = gcVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKnowledgePanelSyndicationPolicyMetadata(u uVar) {
        Objects.requireNonNull(uVar);
        this.knowledgePanelSyndicationPolicyMetadata_ = uVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegalAllowedRegions(int i2, com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureLegalAllowedRegionsIsMutable();
        this.legalAllowedRegions_.set(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegalRemovalRegions(int i2, com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureLegalRemovalRegionsIsMutable();
        this.legalRemovalRegions_.set(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLlmPolicyMetadata(w wVar) {
        Objects.requireNonNull(wVar);
        this.llmPolicyMetadata_ = wVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLmsPolicyMetadata(y yVar) {
        Objects.requireNonNull(yVar);
        this.lmsPolicyMetadata_ = yVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolicyDataScopeKeys(int i2, int i3) {
        ensurePolicyDataScopeKeysIsMutable();
        this.policyDataScopeKeys_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolicySourceType(aa aaVar) {
        this.policySourceType_ = aaVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRwjPolicyMetadata(ad adVar) {
        Objects.requireNonNull(adVar);
        this.rwjPolicyMetadata_ = adVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUmpPolicyMetadata(af afVar) {
        Objects.requireNonNull(afVar);
        this.umpPolicyMetadata_ = afVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0003\u0000\u0001\u001b\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007᠌\u0007\u0011ဉ\u0002\u0012ဉ\u0003\u0013'\u0014ဉ\u0004\u0015ဉ\u0005\u0016ဉ\u0006", new Object[]{"bitField0_", "legalRemovalRegions_", com.google.w.i.a.c.class, "legalAllowedRegions_", com.google.w.i.a.c.class, "availabilityStartTimestamp_", "availabilityEndTimestamp_", "policySourceType_", d.f13495e, "umpPolicyMetadata_", "lmsPolicyMetadata_", "policyDataScopeKeys_", "rwjPolicyMetadata_", "llmPolicyMetadata_", "knowledgePanelSyndicationPolicyMetadata_"});
        }
        if (iOrdinal == 3) {
            return new ab();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new z(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ab> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ab.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gc getAvailabilityEndTimestamp() {
        gc gcVar = this.availabilityEndTimestamp_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public gc getAvailabilityStartTimestamp() {
        gc gcVar = this.availabilityStartTimestamp_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public u getKnowledgePanelSyndicationPolicyMetadata() {
        u uVar = this.knowledgePanelSyndicationPolicyMetadata_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public com.google.w.i.a.c getLegalAllowedRegions(int i2) {
        return this.legalAllowedRegions_.get(i2);
    }

    public int getLegalAllowedRegionsCount() {
        return this.legalAllowedRegions_.size();
    }

    public List<com.google.w.i.a.c> getLegalAllowedRegionsList() {
        return this.legalAllowedRegions_;
    }

    public com.google.w.i.a.d getLegalAllowedRegionsOrBuilder(int i2) {
        return this.legalAllowedRegions_.get(i2);
    }

    public List<? extends com.google.w.i.a.d> getLegalAllowedRegionsOrBuilderList() {
        return this.legalAllowedRegions_;
    }

    public com.google.w.i.a.c getLegalRemovalRegions(int i2) {
        return this.legalRemovalRegions_.get(i2);
    }

    public int getLegalRemovalRegionsCount() {
        return this.legalRemovalRegions_.size();
    }

    public List<com.google.w.i.a.c> getLegalRemovalRegionsList() {
        return this.legalRemovalRegions_;
    }

    public com.google.w.i.a.d getLegalRemovalRegionsOrBuilder(int i2) {
        return this.legalRemovalRegions_.get(i2);
    }

    public List<? extends com.google.w.i.a.d> getLegalRemovalRegionsOrBuilderList() {
        return this.legalRemovalRegions_;
    }

    public w getLlmPolicyMetadata() {
        w wVar = this.llmPolicyMetadata_;
        return wVar == null ? w.getDefaultInstance() : wVar;
    }

    public y getLmsPolicyMetadata() {
        y yVar = this.lmsPolicyMetadata_;
        return yVar == null ? y.getDefaultInstance() : yVar;
    }

    public int getPolicyDataScopeKeys(int i2) {
        return this.policyDataScopeKeys_.d(i2);
    }

    public int getPolicyDataScopeKeysCount() {
        return this.policyDataScopeKeys_.size();
    }

    public List<Integer> getPolicyDataScopeKeysList() {
        return this.policyDataScopeKeys_;
    }

    public aa getPolicySourceType() {
        aa aaVarA = aa.a(this.policySourceType_);
        return aaVarA == null ? aa.UNKNOWN : aaVarA;
    }

    public ad getRwjPolicyMetadata() {
        ad adVar = this.rwjPolicyMetadata_;
        return adVar == null ? ad.getDefaultInstance() : adVar;
    }

    public af getUmpPolicyMetadata() {
        af afVar = this.umpPolicyMetadata_;
        return afVar == null ? af.getDefaultInstance() : afVar;
    }

    public boolean hasAvailabilityEndTimestamp() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAvailabilityStartTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasKnowledgePanelSyndicationPolicyMetadata() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLlmPolicyMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLmsPolicyMetadata() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPolicySourceType() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasRwjPolicyMetadata() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUmpPolicyMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    public static z newBuilder(ab abVar) {
        return (z) DEFAULT_INSTANCE.createBuilder(abVar);
    }

    public static ab parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(com.google.v.v vVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ab parseFrom(com.google.v.z zVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ab parseFrom(com.google.v.z zVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLegalAllowedRegions(com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureLegalAllowedRegionsIsMutable();
        this.legalAllowedRegions_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLegalRemovalRegions(com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureLegalRemovalRegionsIsMutable();
        this.legalRemovalRegions_.add(cVar);
    }

    public static ab parseFrom(InputStream inputStream) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(InputStream inputStream, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(ByteBuffer byteBuffer) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ab parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ab parseFrom(byte[] bArr) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ab parseFrom(byte[] bArr, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
