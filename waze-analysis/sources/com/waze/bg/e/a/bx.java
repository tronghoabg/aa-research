package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bx extends com.google.v.du<bx, bm> implements com.google.v.fj {
    private static final bx DEFAULT_INSTANCE;
    public static final int DETOURS_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<bx> PARSER = null;
    public static final int PROMPT_REROUTE_FIELD_NUMBER = 5;
    public static final int ROUTE_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int ROUTE_FIELD_NUMBER = 1;
    public static final int SILENT_REROUTE_FIELD_NUMBER = 4;
    public static final int SPLIT_POINT_INDEX_FIELD_NUMBER = 2;
    public static final int START_NAVIGATION_INFO_FIELD_NUMBER = 6;
    private int bitField0_;
    private Object rerouteVisibility_;
    private gu routeDescription_;
    private ec route_;
    private int splitPointIndex_;
    private hm startNavigationInfo_;
    private int rerouteVisibilityCase_ = 0;
    private com.google.v.eo<da> detours_ = emptyProtobufList();

    static {
        bx bxVar = new bx();
        DEFAULT_INSTANCE = bxVar;
        com.google.v.du.registerDefaultInstance(bx.class, bxVar);
    }

    private bx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetours(Iterable<? extends da> iterable) {
        ensureDetoursIsMutable();
        com.google.v.c.addAll(iterable, this.detours_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetours(int i2, da daVar) {
        Objects.requireNonNull(daVar);
        ensureDetoursIsMutable();
        this.detours_.add(i2, daVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetours() {
        this.detours_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptReroute() {
        if (this.rerouteVisibilityCase_ == 5) {
            this.rerouteVisibilityCase_ = 0;
            this.rerouteVisibility_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteVisibility() {
        this.rerouteVisibilityCase_ = 0;
        this.rerouteVisibility_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoute() {
        this.route_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDescription() {
        this.routeDescription_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilentReroute() {
        if (this.rerouteVisibilityCase_ == 4) {
            this.rerouteVisibilityCase_ = 0;
            this.rerouteVisibility_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSplitPointIndex() {
        this.bitField0_ &= -3;
        this.splitPointIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartNavigationInfo() {
        this.startNavigationInfo_ = null;
        this.bitField0_ &= -9;
    }

    private void ensureDetoursIsMutable() {
        com.google.v.eo<da> eoVar = this.detours_;
        if (eoVar.c()) {
            return;
        }
        this.detours_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePromptReroute(bp bpVar) {
        Objects.requireNonNull(bpVar);
        if (this.rerouteVisibilityCase_ == 5 && this.rerouteVisibility_ != bp.getDefaultInstance()) {
            bn bnVarNewBuilder = bp.newBuilder((bp) this.rerouteVisibility_);
            bnVarNewBuilder.mergeFrom((bn) bpVar);
            bpVar = bnVarNewBuilder.buildPartial();
        }
        this.rerouteVisibility_ = bpVar;
        this.rerouteVisibilityCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoute(ec ecVar) {
        Objects.requireNonNull(ecVar);
        ec ecVar2 = this.route_;
        if (ecVar2 != null && ecVar2 != ec.getDefaultInstance()) {
            eb ebVarNewBuilder = ec.newBuilder(ecVar2);
            ebVarNewBuilder.mergeFrom((eb) ecVar);
            ecVar = ebVarNewBuilder.buildPartial();
        }
        this.route_ = ecVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteDescription(gu guVar) {
        Objects.requireNonNull(guVar);
        gu guVar2 = this.routeDescription_;
        if (guVar2 != null && guVar2 != gu.getDefaultInstance()) {
            gt gtVarNewBuilder = gu.newBuilder(guVar2);
            gtVarNewBuilder.mergeFrom((gt) guVar);
            guVar = gtVarNewBuilder.buildPartial();
        }
        this.routeDescription_ = guVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSilentReroute(bw bwVar) {
        Objects.requireNonNull(bwVar);
        if (this.rerouteVisibilityCase_ == 4 && this.rerouteVisibility_ != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder((bw) this.rerouteVisibility_);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.rerouteVisibility_ = bwVar;
        this.rerouteVisibilityCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartNavigationInfo(hm hmVar) {
        Objects.requireNonNull(hmVar);
        hm hmVar2 = this.startNavigationInfo_;
        if (hmVar2 != null && hmVar2 != hm.getDefaultInstance()) {
            hl hlVarNewBuilder = hm.newBuilder(hmVar2);
            hlVarNewBuilder.mergeFrom((hl) hmVar);
            hmVar = hlVarNewBuilder.buildPartial();
        }
        this.startNavigationInfo_ = hmVar;
        this.bitField0_ |= 8;
    }

    public static bm newBuilder() {
        return (bm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bx parseDelimitedFrom(InputStream inputStream) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(com.google.v.v vVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetours(int i2) {
        ensureDetoursIsMutable();
        this.detours_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetours(int i2, da daVar) {
        Objects.requireNonNull(daVar);
        ensureDetoursIsMutable();
        this.detours_.set(i2, daVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptReroute(bp bpVar) {
        Objects.requireNonNull(bpVar);
        this.rerouteVisibility_ = bpVar;
        this.rerouteVisibilityCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoute(ec ecVar) {
        Objects.requireNonNull(ecVar);
        this.route_ = ecVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDescription(gu guVar) {
        Objects.requireNonNull(guVar);
        this.routeDescription_ = guVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilentReroute(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.rerouteVisibility_ = bwVar;
        this.rerouteVisibilityCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSplitPointIndex(int i2) {
        this.bitField0_ |= 2;
        this.splitPointIndex_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartNavigationInfo(hm hmVar) {
        Objects.requireNonNull(hmVar);
        this.startNavigationInfo_ = hmVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004<\u0000\u0005<\u0000\u0006ဉ\u0003\u0007\u001b", new Object[]{"rerouteVisibility_", "rerouteVisibilityCase_", "bitField0_", "route_", "splitPointIndex_", "routeDescription_", bw.class, bp.class, "startNavigationInfo_", "detours_", da.class});
        }
        if (iOrdinal == 3) {
            return new bx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public da getDetours(int i2) {
        return this.detours_.get(i2);
    }

    @Deprecated
    public int getDetoursCount() {
        return this.detours_.size();
    }

    @Deprecated
    public List<da> getDetoursList() {
        return this.detours_;
    }

    @Deprecated
    public dd getDetoursOrBuilder(int i2) {
        return this.detours_.get(i2);
    }

    @Deprecated
    public List<? extends dd> getDetoursOrBuilderList() {
        return this.detours_;
    }

    public bp getPromptReroute() {
        return this.rerouteVisibilityCase_ == 5 ? (bp) this.rerouteVisibility_ : bp.getDefaultInstance();
    }

    public bu getRerouteVisibilityCase() {
        int i2 = this.rerouteVisibilityCase_;
        if (i2 == 0) {
            return bu.f16633c;
        }
        if (i2 == 4) {
            return bu.f16631a;
        }
        if (i2 != 5) {
            return null;
        }
        return bu.f16632b;
    }

    @Deprecated
    public ec getRoute() {
        ec ecVar = this.route_;
        return ecVar == null ? ec.getDefaultInstance() : ecVar;
    }

    public gu getRouteDescription() {
        gu guVar = this.routeDescription_;
        return guVar == null ? gu.getDefaultInstance() : guVar;
    }

    public bw getSilentReroute() {
        return this.rerouteVisibilityCase_ == 4 ? (bw) this.rerouteVisibility_ : bw.getDefaultInstance();
    }

    public int getSplitPointIndex() {
        return this.splitPointIndex_;
    }

    public hm getStartNavigationInfo() {
        hm hmVar = this.startNavigationInfo_;
        return hmVar == null ? hm.getDefaultInstance() : hmVar;
    }

    public boolean hasPromptReroute() {
        return this.rerouteVisibilityCase_ == 5;
    }

    @Deprecated
    public boolean hasRoute() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRouteDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSilentReroute() {
        return this.rerouteVisibilityCase_ == 4;
    }

    public boolean hasSplitPointIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStartNavigationInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public static bm newBuilder(bx bxVar) {
        return (bm) DEFAULT_INSTANCE.createBuilder(bxVar);
    }

    public static bx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bx parseFrom(com.google.v.z zVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetours(da daVar) {
        Objects.requireNonNull(daVar);
        ensureDetoursIsMutable();
        this.detours_.add(daVar);
    }

    public static bx parseFrom(InputStream inputStream) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(ByteBuffer byteBuffer) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bx parseFrom(byte[] bArr) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
