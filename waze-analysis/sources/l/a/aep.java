package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aep extends com.google.v.du<aep, aen> implements com.google.v.fj {
    private static final aep DEFAULT_INSTANCE;
    public static final int INSIGHT_ACTIVITY_FIELD_NUMBER = 7;
    public static final int INSIGHT_CHANGED_FIELD_NUMBER = 6;
    public static final int INSIGHT_COMPONENT_CHANGED_FIELD_NUMBER = 4;
    public static final int INSIGHT_COMPONENT_CHANGED_STATE_FIELD_NUMBER = 3;
    public static final int INSIGHT_COMPONENT_CLICKED_FIELD_NUMBER = 2;
    public static final int INSIGHT_COMPONENT_ENGAGED_FIELD_NUMBER = 5;
    public static final int INSIGHT_COMPONENT_SHOWN_FIELD_NUMBER = 1;
    public static final int INSIGHT_SEGMENT_LIFECYCLE_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<aep> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        aep aepVar = new aep();
        DEFAULT_INSTANCE = aepVar;
        com.google.v.du.registerDefaultInstance(aep.class, aepVar);
    }

    private aep() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightActivity() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightChanged() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentChanged() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentChangedState() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentEngaged() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightSegmentLifecycle() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static aep getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightActivity(adj adjVar) {
        Objects.requireNonNull(adjVar);
        if (this.statCase_ == 7 && this.stat_ != adj.getDefaultInstance()) {
            adh adhVarNewBuilder = adj.newBuilder((adj) this.stat_);
            adhVarNewBuilder.mergeFrom((adh) adjVar);
            adjVar = adhVarNewBuilder.buildPartial();
        }
        this.stat_ = adjVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightChanged(ads adsVar) {
        Objects.requireNonNull(adsVar);
        if (this.statCase_ == 6 && this.stat_ != ads.getDefaultInstance()) {
            adr adrVarNewBuilder = ads.newBuilder((ads) this.stat_);
            adrVarNewBuilder.mergeFrom((adr) adsVar);
            adsVar = adrVarNewBuilder.buildPartial();
        }
        this.stat_ = adsVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightComponentChanged(adv advVar) {
        Objects.requireNonNull(advVar);
        if (this.statCase_ == 4 && this.stat_ != adv.getDefaultInstance()) {
            adt adtVarNewBuilder = adv.newBuilder((adv) this.stat_);
            adtVarNewBuilder.mergeFrom((adt) advVar);
            advVar = adtVarNewBuilder.buildPartial();
        }
        this.stat_ = advVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightComponentChangedState(ady adyVar) {
        Objects.requireNonNull(adyVar);
        if (this.statCase_ == 3 && this.stat_ != ady.getDefaultInstance()) {
            adw adwVarNewBuilder = ady.newBuilder((ady) this.stat_);
            adwVarNewBuilder.mergeFrom((adw) adyVar);
            adyVar = adwVarNewBuilder.buildPartial();
        }
        this.stat_ = adyVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightComponentClicked(aec aecVar) {
        Objects.requireNonNull(aecVar);
        if (this.statCase_ == 2 && this.stat_ != aec.getDefaultInstance()) {
            aea aeaVarNewBuilder = aec.newBuilder((aec) this.stat_);
            aeaVarNewBuilder.mergeFrom((aea) aecVar);
            aecVar = aeaVarNewBuilder.buildPartial();
        }
        this.stat_ = aecVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightComponentEngaged(aef aefVar) {
        Objects.requireNonNull(aefVar);
        if (this.statCase_ == 5 && this.stat_ != aef.getDefaultInstance()) {
            aee aeeVarNewBuilder = aef.newBuilder((aef) this.stat_);
            aeeVarNewBuilder.mergeFrom((aee) aefVar);
            aefVar = aeeVarNewBuilder.buildPartial();
        }
        this.stat_ = aefVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightComponentShown(ael aelVar) {
        Objects.requireNonNull(aelVar);
        if (this.statCase_ == 1 && this.stat_ != ael.getDefaultInstance()) {
            aek aekVarNewBuilder = ael.newBuilder((ael) this.stat_);
            aekVarNewBuilder.mergeFrom((aek) aelVar);
            aelVar = aekVarNewBuilder.buildPartial();
        }
        this.stat_ = aelVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightSegmentLifecycle(aet aetVar) {
        Objects.requireNonNull(aetVar);
        if (this.statCase_ == 8 && this.stat_ != aet.getDefaultInstance()) {
            aeq aeqVarNewBuilder = aet.newBuilder((aet) this.stat_);
            aeqVarNewBuilder.mergeFrom((aeq) aetVar);
            aetVar = aeqVarNewBuilder.buildPartial();
        }
        this.stat_ = aetVar;
        this.statCase_ = 8;
    }

    public static aen newBuilder() {
        return (aen) DEFAULT_INSTANCE.createBuilder();
    }

    public static aep parseDelimitedFrom(InputStream inputStream) {
        return (aep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aep parseFrom(com.google.v.v vVar) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aep> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightActivity(adj adjVar) {
        Objects.requireNonNull(adjVar);
        this.stat_ = adjVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightChanged(ads adsVar) {
        Objects.requireNonNull(adsVar);
        this.stat_ = adsVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentChanged(adv advVar) {
        Objects.requireNonNull(advVar);
        this.stat_ = advVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentChangedState(ady adyVar) {
        Objects.requireNonNull(adyVar);
        this.stat_ = adyVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentClicked(aec aecVar) {
        Objects.requireNonNull(aecVar);
        this.stat_ = aecVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentEngaged(aef aefVar) {
        Objects.requireNonNull(aefVar);
        this.stat_ = aefVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentShown(ael aelVar) {
        Objects.requireNonNull(aelVar);
        this.stat_ = aelVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightSegmentLifecycle(aet aetVar) {
        Objects.requireNonNull(aetVar);
        this.stat_ = aetVar;
        this.statCase_ = 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"stat_", "statCase_", ael.class, aec.class, ady.class, adv.class, aef.class, ads.class, adj.class, aet.class});
        }
        if (iOrdinal == 3) {
            return new aep();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aen(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aep> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aep.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public adj getInsightActivity() {
        return this.statCase_ == 7 ? (adj) this.stat_ : adj.getDefaultInstance();
    }

    public ads getInsightChanged() {
        return this.statCase_ == 6 ? (ads) this.stat_ : ads.getDefaultInstance();
    }

    @Deprecated
    public adv getInsightComponentChanged() {
        return this.statCase_ == 4 ? (adv) this.stat_ : adv.getDefaultInstance();
    }

    @Deprecated
    public ady getInsightComponentChangedState() {
        return this.statCase_ == 3 ? (ady) this.stat_ : ady.getDefaultInstance();
    }

    @Deprecated
    public aec getInsightComponentClicked() {
        return this.statCase_ == 2 ? (aec) this.stat_ : aec.getDefaultInstance();
    }

    @Deprecated
    public aef getInsightComponentEngaged() {
        return this.statCase_ == 5 ? (aef) this.stat_ : aef.getDefaultInstance();
    }

    @Deprecated
    public ael getInsightComponentShown() {
        return this.statCase_ == 1 ? (ael) this.stat_ : ael.getDefaultInstance();
    }

    public aet getInsightSegmentLifecycle() {
        return this.statCase_ == 8 ? (aet) this.stat_ : aet.getDefaultInstance();
    }

    public aeo getStatCase() {
        switch (this.statCase_) {
            case 0:
                return aeo.f52378i;
            case 1:
                return aeo.f52370a;
            case 2:
                return aeo.f52371b;
            case 3:
                return aeo.f52372c;
            case 4:
                return aeo.f52373d;
            case 5:
                return aeo.f52374e;
            case 6:
                return aeo.f52375f;
            case 7:
                return aeo.f52376g;
            case 8:
                return aeo.f52377h;
            default:
                return null;
        }
    }

    public boolean hasInsightActivity() {
        return this.statCase_ == 7;
    }

    public boolean hasInsightChanged() {
        return this.statCase_ == 6;
    }

    @Deprecated
    public boolean hasInsightComponentChanged() {
        return this.statCase_ == 4;
    }

    @Deprecated
    public boolean hasInsightComponentChangedState() {
        return this.statCase_ == 3;
    }

    @Deprecated
    public boolean hasInsightComponentClicked() {
        return this.statCase_ == 2;
    }

    @Deprecated
    public boolean hasInsightComponentEngaged() {
        return this.statCase_ == 5;
    }

    @Deprecated
    public boolean hasInsightComponentShown() {
        return this.statCase_ == 1;
    }

    public boolean hasInsightSegmentLifecycle() {
        return this.statCase_ == 8;
    }

    public static aen newBuilder(aep aepVar) {
        return (aen) DEFAULT_INSTANCE.createBuilder(aepVar);
    }

    public static aep parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aep) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aep parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aep parseFrom(com.google.v.z zVar) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aep parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aep parseFrom(InputStream inputStream) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aep parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aep parseFrom(ByteBuffer byteBuffer) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aep parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aep parseFrom(byte[] bArr) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aep parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aep) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
