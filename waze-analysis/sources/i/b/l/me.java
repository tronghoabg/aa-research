package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class me extends com.google.v.du<me, mc> implements com.google.v.fj {
    public static final int DANGER_AREAS_FIELD_NUMBER = 11;
    private static final me DEFAULT_INSTANCE;
    public static final int ETA_DIFF_FROM_CURRENT_ROUTE_FIELD_NUMBER = 6;
    public static final int ETA_MINUTES_FIELD_NUMBER = 3;
    public static final int ETA_NOW_VS_TYPICAL_ETA_DIFF_MINUTES_FIELD_NUMBER = 7;
    public static final int ETA_NOW_VS_TYPICAL_ETA_FIELD_NUMBER = 5;
    public static final int EVENT_ON_ROUTE_FIELD_NUMBER = 8;
    public static final int GOING_VIA_FIELD_NUMBER = 1;
    public static final int IS_USUAL_ROUTE_OF_USER_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<me> PARSER = null;
    public static final int RESTRICTED_AREAS_FIELD_NUMBER = 10;
    public static final int TOLL_PRICE_FIELD_NUMBER = 9;
    public static final int TYPICAL_ETA_MINUTES_FIELD_NUMBER = 4;
    private int bitField0_;
    private int etaDiffFromCurrentRoute_;
    private int etaMinutes_;
    private int etaNowVsTypicalEtaDiffMinutes_;
    private int etaNowVsTypicalEta_;
    private lq eventOnRoute_;
    private boolean isUsualRouteOfUser_;
    private int tollPrice_;
    private int typicalEtaMinutes_;
    private String goingVia_ = "";
    private com.google.v.eo<String> restrictedAreas_ = emptyProtobufList();
    private com.google.v.eo<String> dangerAreas_ = emptyProtobufList();

    static {
        me meVar = new me();
        DEFAULT_INSTANCE = meVar;
        com.google.v.du.registerDefaultInstance(me.class, meVar);
    }

    private me() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDangerAreas(Iterable<String> iterable) {
        ensureDangerAreasIsMutable();
        com.google.v.c.addAll(iterable, this.dangerAreas_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestrictedAreas(Iterable<String> iterable) {
        ensureRestrictedAreasIsMutable();
        com.google.v.c.addAll(iterable, this.restrictedAreas_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDangerAreas(String str) {
        Objects.requireNonNull(str);
        ensureDangerAreasIsMutable();
        this.dangerAreas_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDangerAreasBytes(com.google.v.v vVar) {
        ensureDangerAreasIsMutable();
        this.dangerAreas_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestrictedAreas(String str) {
        Objects.requireNonNull(str);
        ensureRestrictedAreasIsMutable();
        this.restrictedAreas_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestrictedAreasBytes(com.google.v.v vVar) {
        ensureRestrictedAreasIsMutable();
        this.restrictedAreas_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDangerAreas() {
        this.dangerAreas_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaDiffFromCurrentRoute() {
        this.bitField0_ &= -33;
        this.etaDiffFromCurrentRoute_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaMinutes() {
        this.bitField0_ &= -5;
        this.etaMinutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaNowVsTypicalEta() {
        this.bitField0_ &= -17;
        this.etaNowVsTypicalEta_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaNowVsTypicalEtaDiffMinutes() {
        this.bitField0_ &= -65;
        this.etaNowVsTypicalEtaDiffMinutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventOnRoute() {
        this.eventOnRoute_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoingVia() {
        this.bitField0_ &= -2;
        this.goingVia_ = getDefaultInstance().getGoingVia();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsUsualRouteOfUser() {
        this.bitField0_ &= -3;
        this.isUsualRouteOfUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictedAreas() {
        this.restrictedAreas_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPrice() {
        this.bitField0_ &= -257;
        this.tollPrice_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypicalEtaMinutes() {
        this.bitField0_ &= -9;
        this.typicalEtaMinutes_ = 0;
    }

    private void ensureDangerAreasIsMutable() {
        com.google.v.eo<String> eoVar = this.dangerAreas_;
        if (eoVar.c()) {
            return;
        }
        this.dangerAreas_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRestrictedAreasIsMutable() {
        com.google.v.eo<String> eoVar = this.restrictedAreas_;
        if (eoVar.c()) {
            return;
        }
        this.restrictedAreas_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static me getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventOnRoute(lq lqVar) {
        Objects.requireNonNull(lqVar);
        lq lqVar2 = this.eventOnRoute_;
        if (lqVar2 != null && lqVar2 != lq.getDefaultInstance()) {
            lo loVarNewBuilder = lq.newBuilder(lqVar2);
            loVarNewBuilder.mergeFrom((lo) lqVar);
            lqVar = loVarNewBuilder.buildPartial();
        }
        this.eventOnRoute_ = lqVar;
        this.bitField0_ |= 128;
    }

    public static mc newBuilder() {
        return (mc) DEFAULT_INSTANCE.createBuilder();
    }

    public static me parseDelimitedFrom(InputStream inputStream) {
        return (me) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static me parseFrom(com.google.v.v vVar) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<me> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDangerAreas(int i2, String str) {
        Objects.requireNonNull(str);
        ensureDangerAreasIsMutable();
        this.dangerAreas_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaDiffFromCurrentRoute(int i2) {
        this.bitField0_ |= 32;
        this.etaDiffFromCurrentRoute_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaMinutes(int i2) {
        this.bitField0_ |= 4;
        this.etaMinutes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaNowVsTypicalEta(md mdVar) {
        this.etaNowVsTypicalEta_ = mdVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaNowVsTypicalEtaDiffMinutes(int i2) {
        this.bitField0_ |= 64;
        this.etaNowVsTypicalEtaDiffMinutes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventOnRoute(lq lqVar) {
        Objects.requireNonNull(lqVar);
        this.eventOnRoute_ = lqVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoingVia(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.goingVia_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoingViaBytes(com.google.v.v vVar) {
        this.goingVia_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUsualRouteOfUser(boolean z) {
        this.bitField0_ |= 2;
        this.isUsualRouteOfUser_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictedAreas(int i2, String str) {
        Objects.requireNonNull(str);
        ensureRestrictedAreasIsMutable();
        this.restrictedAreas_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPrice(int i2) {
        this.bitField0_ |= 256;
        this.tollPrice_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypicalEtaMinutes(int i2) {
        this.bitField0_ |= 8;
        this.typicalEtaMinutes_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005᠌\u0004\u0006င\u0005\u0007င\u0006\bဉ\u0007\tင\b\n\u001a\u000b\u001a", new Object[]{"bitField0_", "goingVia_", "isUsualRouteOfUser_", "etaMinutes_", "typicalEtaMinutes_", "etaNowVsTypicalEta_", hf.p, "etaDiffFromCurrentRoute_", "etaNowVsTypicalEtaDiffMinutes_", "eventOnRoute_", "tollPrice_", "restrictedAreas_", "dangerAreas_"});
        }
        if (iOrdinal == 3) {
            return new me();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<me> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (me.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDangerAreas(int i2) {
        return this.dangerAreas_.get(i2);
    }

    public com.google.v.v getDangerAreasBytes(int i2) {
        return com.google.v.v.s(this.dangerAreas_.get(i2));
    }

    public int getDangerAreasCount() {
        return this.dangerAreas_.size();
    }

    public List<String> getDangerAreasList() {
        return this.dangerAreas_;
    }

    public int getEtaDiffFromCurrentRoute() {
        return this.etaDiffFromCurrentRoute_;
    }

    public int getEtaMinutes() {
        return this.etaMinutes_;
    }

    public md getEtaNowVsTypicalEta() {
        md mdVarA = md.a(this.etaNowVsTypicalEta_);
        return mdVarA == null ? md.UNSPECIFIED : mdVarA;
    }

    public int getEtaNowVsTypicalEtaDiffMinutes() {
        return this.etaNowVsTypicalEtaDiffMinutes_;
    }

    public lq getEventOnRoute() {
        lq lqVar = this.eventOnRoute_;
        return lqVar == null ? lq.getDefaultInstance() : lqVar;
    }

    public String getGoingVia() {
        return this.goingVia_;
    }

    public com.google.v.v getGoingViaBytes() {
        return com.google.v.v.s(this.goingVia_);
    }

    public boolean getIsUsualRouteOfUser() {
        return this.isUsualRouteOfUser_;
    }

    public String getRestrictedAreas(int i2) {
        return this.restrictedAreas_.get(i2);
    }

    public com.google.v.v getRestrictedAreasBytes(int i2) {
        return com.google.v.v.s(this.restrictedAreas_.get(i2));
    }

    public int getRestrictedAreasCount() {
        return this.restrictedAreas_.size();
    }

    public List<String> getRestrictedAreasList() {
        return this.restrictedAreas_;
    }

    public int getTollPrice() {
        return this.tollPrice_;
    }

    public int getTypicalEtaMinutes() {
        return this.typicalEtaMinutes_;
    }

    public boolean hasEtaDiffFromCurrentRoute() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasEtaMinutes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEtaNowVsTypicalEta() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEtaNowVsTypicalEtaDiffMinutes() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasEventOnRoute() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasGoingVia() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsUsualRouteOfUser() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTollPrice() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTypicalEtaMinutes() {
        return (this.bitField0_ & 8) != 0;
    }

    public static mc newBuilder(me meVar) {
        return (mc) DEFAULT_INSTANCE.createBuilder(meVar);
    }

    public static me parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (me) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static me parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static me parseFrom(com.google.v.z zVar) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static me parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static me parseFrom(InputStream inputStream) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static me parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static me parseFrom(ByteBuffer byteBuffer) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static me parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static me parseFrom(byte[] bArr) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static me parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (me) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
