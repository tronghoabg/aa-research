package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hm extends com.google.v.du<hm, hl> implements com.google.v.fj {
    private static final hm DEFAULT_INSTANCE;
    public static final int DETOURS_FIELD_NUMBER = 2;
    public static final int HOV_ALTERNATIVE_INFO_FIELD_NUMBER = 4;
    public static final int NEXT_UPDATE_SCHEDULE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<hm> PARSER = null;
    public static final int ROUTE_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.v.eo<da> detours_ = emptyProtobufList();
    private ee hovAlternativeInfo_;
    private gh nextUpdateSchedule_;
    private ec route_;

    static {
        hm hmVar = new hm();
        DEFAULT_INSTANCE = hmVar;
        com.google.v.du.registerDefaultInstance(hm.class, hmVar);
    }

    private hm() {
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
    public void clearHovAlternativeInfo() {
        this.hovAlternativeInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextUpdateSchedule() {
        this.nextUpdateSchedule_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoute() {
        this.route_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureDetoursIsMutable() {
        com.google.v.eo<da> eoVar = this.detours_;
        if (eoVar.c()) {
            return;
        }
        this.detours_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHovAlternativeInfo(ee eeVar) {
        Objects.requireNonNull(eeVar);
        ee eeVar2 = this.hovAlternativeInfo_;
        if (eeVar2 != null && eeVar2 != ee.getDefaultInstance()) {
            ed edVarNewBuilder = ee.newBuilder(eeVar2);
            edVarNewBuilder.mergeFrom((ed) eeVar);
            eeVar = edVarNewBuilder.buildPartial();
        }
        this.hovAlternativeInfo_ = eeVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNextUpdateSchedule(gh ghVar) {
        Objects.requireNonNull(ghVar);
        gh ghVar2 = this.nextUpdateSchedule_;
        if (ghVar2 != null && ghVar2 != gh.getDefaultInstance()) {
            gg ggVarNewBuilder = gh.newBuilder(ghVar2);
            ggVarNewBuilder.mergeFrom((gg) ghVar);
            ghVar = ggVarNewBuilder.buildPartial();
        }
        this.nextUpdateSchedule_ = ghVar;
        this.bitField0_ |= 2;
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

    public static hl newBuilder() {
        return (hl) DEFAULT_INSTANCE.createBuilder();
    }

    public static hm parseDelimitedFrom(InputStream inputStream) {
        return (hm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hm parseFrom(com.google.v.v vVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hm> parser() {
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
    public void setHovAlternativeInfo(ee eeVar) {
        Objects.requireNonNull(eeVar);
        this.hovAlternativeInfo_ = eeVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextUpdateSchedule(gh ghVar) {
        Objects.requireNonNull(ghVar);
        this.nextUpdateSchedule_ = ghVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoute(ec ecVar) {
        Objects.requireNonNull(ecVar);
        this.route_ = ecVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "route_", "detours_", da.class, "nextUpdateSchedule_", "hovAlternativeInfo_"});
        }
        if (iOrdinal == 3) {
            return new hm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public da getDetours(int i2) {
        return this.detours_.get(i2);
    }

    public int getDetoursCount() {
        return this.detours_.size();
    }

    public List<da> getDetoursList() {
        return this.detours_;
    }

    public dd getDetoursOrBuilder(int i2) {
        return this.detours_.get(i2);
    }

    public List<? extends dd> getDetoursOrBuilderList() {
        return this.detours_;
    }

    public ee getHovAlternativeInfo() {
        ee eeVar = this.hovAlternativeInfo_;
        return eeVar == null ? ee.getDefaultInstance() : eeVar;
    }

    public gh getNextUpdateSchedule() {
        gh ghVar = this.nextUpdateSchedule_;
        return ghVar == null ? gh.getDefaultInstance() : ghVar;
    }

    public ec getRoute() {
        ec ecVar = this.route_;
        return ecVar == null ? ec.getDefaultInstance() : ecVar;
    }

    public boolean hasHovAlternativeInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNextUpdateSchedule() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoute() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hl newBuilder(hm hmVar) {
        return (hl) DEFAULT_INSTANCE.createBuilder(hmVar);
    }

    public static hm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hm parseFrom(com.google.v.z zVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetours(da daVar) {
        Objects.requireNonNull(daVar);
        ensureDetoursIsMutable();
        this.detours_.add(daVar);
    }

    public static hm parseFrom(InputStream inputStream) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hm parseFrom(ByteBuffer byteBuffer) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hm parseFrom(byte[] bArr) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
