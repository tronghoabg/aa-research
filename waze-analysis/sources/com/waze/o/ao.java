package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.waze.bg.e.a.Cif;
import com.waze.bg.e.a.dv;
import com.waze.bg.e.a.dx;
import com.waze.bg.e.a.ie;
import com.waze.bg.e.a.ik;
import com.waze.bg.e.a.il;
import i.b.l.rk;
import i.b.l.rl;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao extends du<ao, an> implements fj {
    public static final int ALT_DESCRIPTION_FIELD_NUMBER = 3;
    private static final ao DEFAULT_INSTANCE;
    public static final int EVENTS_ON_ROUTE_FIELD_NUMBER = 7;
    public static final int EXPLAINABILITY_HINT_FIELD_NUMBER = 6;
    public static final int EXTRA_INFO_LABEL_FIELD_NUMBER = 11;
    private static volatile fo<ao> PARSER = null;
    public static final int ROUTE_ATTRIBUTES_FIELD_NUMBER = 4;
    public static final int ROUTE_DESCRIPTION_EXPANDED_FIELD_NUMBER = 12;
    public static final int ROUTE_TYPES_FIELD_NUMBER = 9;
    public static final int TOLL_PRICE_INFO_FIELD_NUMBER = 10;
    public static final int TOTAL_LENGTH_METERS_FIELD_NUMBER = 1;
    public static final int TOTAL_SECONDS_FIELD_NUMBER = 2;
    public static final int TRAFFIC_JAMS_FIELD_NUMBER = 8;
    private static final el<i.c.a.a.c> routeAttributes_converter_ = new am(1);
    private static final el<i.c.a.a.d> routeTypes_converter_ = new am(0);
    private int bitField0_;
    private dx explainabilityHint_;
    private rl extraInfoLabel_;
    private com.waze.bg.e.c routeDescriptionExpanded_;
    private bi tollPriceInfo_;
    private long totalLengthMeters_;
    private long totalSeconds_;
    private String altDescription_ = "";
    private ek routeAttributes_ = emptyIntList();
    private eo<ie> eventsOnRoute_ = emptyProtobufList();
    private eo<ik> trafficJams_ = emptyProtobufList();
    private ek routeTypes_ = emptyIntList();

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEventsOnRoute(Iterable<? extends ie> iterable) {
        ensureEventsOnRouteIsMutable();
        com.google.v.c.addAll(iterable, this.eventsOnRoute_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteAttributes(Iterable<? extends i.c.a.a.c> iterable) {
        ensureRouteAttributesIsMutable();
        Iterator<? extends i.c.a.a.c> it = iterable.iterator();
        while (it.hasNext()) {
            this.routeAttributes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteTypes(Iterable<? extends i.c.a.a.d> iterable) {
        ensureRouteTypesIsMutable();
        Iterator<? extends i.c.a.a.d> it = iterable.iterator();
        while (it.hasNext()) {
            this.routeTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrafficJams(Iterable<? extends ik> iterable) {
        ensureTrafficJamsIsMutable();
        com.google.v.c.addAll(iterable, this.trafficJams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEventsOnRoute(int i2, ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureEventsOnRouteIsMutable();
        this.eventsOnRoute_.add(i2, ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteAttributes(i.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureRouteAttributesIsMutable();
        this.routeAttributes_.i(cVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteTypes(i.c.a.a.d dVar) {
        Objects.requireNonNull(dVar);
        ensureRouteTypesIsMutable();
        this.routeTypes_.i(dVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficJams(int i2, ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.add(i2, ikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltDescription() {
        this.bitField0_ &= -5;
        this.altDescription_ = getDefaultInstance().getAltDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventsOnRoute() {
        this.eventsOnRoute_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExplainabilityHint() {
        this.explainabilityHint_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraInfoLabel() {
        this.extraInfoLabel_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteAttributes() {
        this.routeAttributes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDescriptionExpanded() {
        this.routeDescriptionExpanded_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteTypes() {
        this.routeTypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPriceInfo() {
        this.tollPriceInfo_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalLengthMeters() {
        this.bitField0_ &= -2;
        this.totalLengthMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSeconds() {
        this.bitField0_ &= -3;
        this.totalSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficJams() {
        this.trafficJams_ = emptyProtobufList();
    }

    private void ensureEventsOnRouteIsMutable() {
        eo<ie> eoVar = this.eventsOnRoute_;
        if (eoVar.c()) {
            return;
        }
        this.eventsOnRoute_ = du.mutableCopy(eoVar);
    }

    private void ensureRouteAttributesIsMutable() {
        ek ekVar = this.routeAttributes_;
        if (ekVar.c()) {
            return;
        }
        this.routeAttributes_ = du.mutableCopy(ekVar);
    }

    private void ensureRouteTypesIsMutable() {
        ek ekVar = this.routeTypes_;
        if (ekVar.c()) {
            return;
        }
        this.routeTypes_ = du.mutableCopy(ekVar);
    }

    private void ensureTrafficJamsIsMutable() {
        eo<ik> eoVar = this.trafficJams_;
        if (eoVar.c()) {
            return;
        }
        this.trafficJams_ = du.mutableCopy(eoVar);
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExplainabilityHint(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.explainabilityHint_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.explainabilityHint_ = dxVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtraInfoLabel(rl rlVar) {
        Objects.requireNonNull(rlVar);
        rl rlVar2 = this.extraInfoLabel_;
        if (rlVar2 != null && rlVar2 != rl.getDefaultInstance()) {
            rk rkVarNewBuilder = rl.newBuilder(rlVar2);
            rkVarNewBuilder.mergeFrom((rk) rlVar);
            rlVar = rkVarNewBuilder.buildPartial();
        }
        this.extraInfoLabel_ = rlVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteDescriptionExpanded(com.waze.bg.e.c cVar) {
        Objects.requireNonNull(cVar);
        com.waze.bg.e.c cVar2 = this.routeDescriptionExpanded_;
        if (cVar2 != null && cVar2 != com.waze.bg.e.c.getDefaultInstance()) {
            com.waze.bg.e.b bVarNewBuilder = com.waze.bg.e.c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((com.waze.bg.e.b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.routeDescriptionExpanded_ = cVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollPriceInfo(bi biVar) {
        Objects.requireNonNull(biVar);
        bi biVar2 = this.tollPriceInfo_;
        if (biVar2 != null && biVar2 != bi.getDefaultInstance()) {
            bh bhVarNewBuilder = bi.newBuilder(biVar2);
            bhVarNewBuilder.mergeFrom((bh) biVar);
            biVar = bhVarNewBuilder.buildPartial();
        }
        this.tollPriceInfo_ = biVar;
        this.bitField0_ |= 16;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEventsOnRoute(int i2) {
        ensureEventsOnRouteIsMutable();
        this.eventsOnRoute_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrafficJams(int i2) {
        ensureTrafficJamsIsMutable();
        this.trafficJams_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.altDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltDescriptionBytes(com.google.v.v vVar) {
        this.altDescription_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventsOnRoute(int i2, ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureEventsOnRouteIsMutable();
        this.eventsOnRoute_.set(i2, ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExplainabilityHint(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.explainabilityHint_ = dxVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraInfoLabel(rl rlVar) {
        Objects.requireNonNull(rlVar);
        this.extraInfoLabel_ = rlVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteAttributes(int i2, i.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureRouteAttributesIsMutable();
        this.routeAttributes_.e(i2, cVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDescriptionExpanded(com.waze.bg.e.c cVar) {
        Objects.requireNonNull(cVar);
        this.routeDescriptionExpanded_ = cVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteTypes(int i2, i.c.a.a.d dVar) {
        Objects.requireNonNull(dVar);
        ensureRouteTypesIsMutable();
        this.routeTypes_.e(i2, dVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPriceInfo(bi biVar) {
        Objects.requireNonNull(biVar);
        this.tollPriceInfo_ = biVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalLengthMeters(long j2) {
        this.bitField0_ |= 1;
        this.totalLengthMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSeconds(long j2) {
        this.bitField0_ |= 2;
        this.totalSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficJams(int i2, ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.set(i2, ikVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ࠞ\u0006ဉ\u0003\u0007\u001b\b\u001b\tࠞ\nဉ\u0004\u000bဉ\u0005\fဉ\u0006", new Object[]{"bitField0_", "totalLengthMeters_", "totalSeconds_", "altDescription_", "routeAttributes_", i.c.a.a.c.a(), "explainabilityHint_", "eventsOnRoute_", ie.class, "trafficJams_", ik.class, "routeTypes_", i.c.a.a.d.a(), "tollPriceInfo_", "extraInfoLabel_", "routeDescriptionExpanded_"});
        }
        if (iOrdinal == 3) {
            return new ao();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAltDescription() {
        return this.altDescription_;
    }

    public com.google.v.v getAltDescriptionBytes() {
        return com.google.v.v.s(this.altDescription_);
    }

    public ie getEventsOnRoute(int i2) {
        return this.eventsOnRoute_.get(i2);
    }

    public int getEventsOnRouteCount() {
        return this.eventsOnRoute_.size();
    }

    public List<ie> getEventsOnRouteList() {
        return this.eventsOnRoute_;
    }

    public Cif getEventsOnRouteOrBuilder(int i2) {
        return this.eventsOnRoute_.get(i2);
    }

    public List<? extends Cif> getEventsOnRouteOrBuilderList() {
        return this.eventsOnRoute_;
    }

    public dx getExplainabilityHint() {
        dx dxVar = this.explainabilityHint_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    public rl getExtraInfoLabel() {
        rl rlVar = this.extraInfoLabel_;
        return rlVar == null ? rl.getDefaultInstance() : rlVar;
    }

    public i.c.a.a.c getRouteAttributes(int i2) {
        i.c.a.a.c cVarB = i.c.a.a.c.b(this.routeAttributes_.d(i2));
        return cVarB == null ? i.c.a.a.c.UNKNOWN : cVarB;
    }

    public int getRouteAttributesCount() {
        return this.routeAttributes_.size();
    }

    public List<i.c.a.a.c> getRouteAttributesList() {
        return new em(this.routeAttributes_, routeAttributes_converter_);
    }

    public com.waze.bg.e.c getRouteDescriptionExpanded() {
        com.waze.bg.e.c cVar = this.routeDescriptionExpanded_;
        return cVar == null ? com.waze.bg.e.c.getDefaultInstance() : cVar;
    }

    public i.c.a.a.d getRouteTypes(int i2) {
        i.c.a.a.d dVarB = i.c.a.a.d.b(this.routeTypes_.d(i2));
        return dVarB == null ? i.c.a.a.d.UNKNOWN : dVarB;
    }

    public int getRouteTypesCount() {
        return this.routeTypes_.size();
    }

    public List<i.c.a.a.d> getRouteTypesList() {
        return new em(this.routeTypes_, routeTypes_converter_);
    }

    public bi getTollPriceInfo() {
        bi biVar = this.tollPriceInfo_;
        return biVar == null ? bi.getDefaultInstance() : biVar;
    }

    public long getTotalLengthMeters() {
        return this.totalLengthMeters_;
    }

    public long getTotalSeconds() {
        return this.totalSeconds_;
    }

    public ik getTrafficJams(int i2) {
        return this.trafficJams_.get(i2);
    }

    public int getTrafficJamsCount() {
        return this.trafficJams_.size();
    }

    public List<ik> getTrafficJamsList() {
        return this.trafficJams_;
    }

    public il getTrafficJamsOrBuilder(int i2) {
        return this.trafficJams_.get(i2);
    }

    public List<? extends il> getTrafficJamsOrBuilderList() {
        return this.trafficJams_;
    }

    public boolean hasAltDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasExplainabilityHint() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasExtraInfoLabel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRouteDescriptionExpanded() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTollPriceInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTotalLengthMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTotalSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public static an newBuilder(ao aoVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEventsOnRoute(ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureEventsOnRouteIsMutable();
        this.eventsOnRoute_.add(ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficJams(ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.add(ikVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
