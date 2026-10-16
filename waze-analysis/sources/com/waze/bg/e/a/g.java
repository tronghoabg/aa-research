package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends com.google.v.du<g, e> implements com.google.v.fj {
    private static final g DEFAULT_INSTANCE;
    public static final int NEXT_UPDATE_SCHEDULE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<g> PARSER = null;
    public static final int ROUTE_GROUPS_FIELD_NUMBER = 4;
    public static final int ROUTING_UPDATE_FIELD_NUMBER = 1;
    public static final int SILENT_REROUTE_SUGGESTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private gh nextUpdateSchedule_;
    private Object routeUpdate_;
    private int routeUpdateCase_ = 0;
    private com.google.v.eo<gw> routeGroups_ = emptyProtobufList();

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        com.google.v.du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteGroups(Iterable<? extends gw> iterable) {
        ensureRouteGroupsIsMutable();
        com.google.v.c.addAll(iterable, this.routeGroups_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteGroups(int i2, gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensureRouteGroupsIsMutable();
        this.routeGroups_.add(i2, gwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextUpdateSchedule() {
        this.nextUpdateSchedule_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteGroups() {
        this.routeGroups_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUpdate() {
        this.routeUpdateCase_ = 0;
        this.routeUpdate_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingUpdate() {
        if (this.routeUpdateCase_ == 1) {
            this.routeUpdateCase_ = 0;
            this.routeUpdate_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilentRerouteSuggestion() {
        if (this.routeUpdateCase_ == 2) {
            this.routeUpdateCase_ = 0;
            this.routeUpdate_ = null;
        }
    }

    private void ensureRouteGroupsIsMutable() {
        com.google.v.eo<gw> eoVar = this.routeGroups_;
        if (eoVar.c()) {
            return;
        }
        this.routeGroups_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingUpdate(az azVar) {
        Objects.requireNonNull(azVar);
        if (this.routeUpdateCase_ == 1 && this.routeUpdate_ != az.getDefaultInstance()) {
            ay ayVarNewBuilder = az.newBuilder((az) this.routeUpdate_);
            ayVarNewBuilder.mergeFrom((ay) azVar);
            azVar = ayVarNewBuilder.buildPartial();
        }
        this.routeUpdate_ = azVar;
        this.routeUpdateCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSilentRerouteSuggestion(bx bxVar) {
        Objects.requireNonNull(bxVar);
        if (this.routeUpdateCase_ == 2 && this.routeUpdate_ != bx.getDefaultInstance()) {
            bm bmVarNewBuilder = bx.newBuilder((bx) this.routeUpdate_);
            bmVarNewBuilder.mergeFrom((bm) bxVar);
            bxVar = bmVarNewBuilder.buildPartial();
        }
        this.routeUpdate_ = bxVar;
        this.routeUpdateCase_ = 2;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(com.google.v.v vVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRouteGroups(int i2) {
        ensureRouteGroupsIsMutable();
        this.routeGroups_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextUpdateSchedule(gh ghVar) {
        Objects.requireNonNull(ghVar);
        this.nextUpdateSchedule_ = ghVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteGroups(int i2, gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensureRouteGroupsIsMutable();
        this.routeGroups_.set(i2, gwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingUpdate(az azVar) {
        Objects.requireNonNull(azVar);
        this.routeUpdate_ = azVar;
        this.routeUpdateCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilentRerouteSuggestion(bx bxVar) {
        Objects.requireNonNull(bxVar);
        this.routeUpdate_ = bxVar;
        this.routeUpdateCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004\u001b", new Object[]{"routeUpdate_", "routeUpdateCase_", "bitField0_", az.class, bx.class, "nextUpdateSchedule_", "routeGroups_", gw.class});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gh getNextUpdateSchedule() {
        gh ghVar = this.nextUpdateSchedule_;
        return ghVar == null ? gh.getDefaultInstance() : ghVar;
    }

    public gw getRouteGroups(int i2) {
        return this.routeGroups_.get(i2);
    }

    public int getRouteGroupsCount() {
        return this.routeGroups_.size();
    }

    public List<gw> getRouteGroupsList() {
        return this.routeGroups_;
    }

    public gx getRouteGroupsOrBuilder(int i2) {
        return this.routeGroups_.get(i2);
    }

    public List<? extends gx> getRouteGroupsOrBuilderList() {
        return this.routeGroups_;
    }

    public f getRouteUpdateCase() {
        int i2 = this.routeUpdateCase_;
        if (i2 == 0) {
            return f.f16697c;
        }
        if (i2 == 1) {
            return f.f16695a;
        }
        if (i2 != 2) {
            return null;
        }
        return f.f16696b;
    }

    public az getRoutingUpdate() {
        return this.routeUpdateCase_ == 1 ? (az) this.routeUpdate_ : az.getDefaultInstance();
    }

    public bx getSilentRerouteSuggestion() {
        return this.routeUpdateCase_ == 2 ? (bx) this.routeUpdate_ : bx.getDefaultInstance();
    }

    public boolean hasNextUpdateSchedule() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoutingUpdate() {
        return this.routeUpdateCase_ == 1;
    }

    public boolean hasSilentRerouteSuggestion() {
        return this.routeUpdateCase_ == 2;
    }

    public static e newBuilder(g gVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(com.google.v.z zVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteGroups(gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensureRouteGroupsIsMutable();
        this.routeGroups_.add(gwVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
