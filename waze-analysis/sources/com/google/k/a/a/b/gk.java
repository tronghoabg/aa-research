package com.google.k.a.a.b;

import com.google.k.a.a.nl;
import com.google.k.a.a.np;
import com.google.k.a.a.oa;
import com.google.k.a.a.oc;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gk extends com.google.v.du<gk, gd> implements gl {
    public static final int AUTONOMOUS_DRIVING_PRODUCTS_FIELD_NUMBER = 11;
    private static final gk DEFAULT_INSTANCE;
    public static final int INTERSECTION_GROUP_FIELD_NUMBER = 7;
    public static final int IS_VARIABLE_FIELD_NUMBER = 15;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<gk> PARSER = null;
    public static final int RESTRICTION_GROUP_FIELD_NUMBER = 9;
    public static final int RESTRICTION_ID_FIELD_NUMBER = 13;
    public static final int RESTRICTION_TOKEN_FIELD_NUMBER = 12;
    public static final int SCHEDULE_FIELD_NUMBER = 5;
    public static final int SCOPE_FIELD_NUMBER = 8;
    public static final int STYLE_FIELD_NUMBER = 4;
    public static final int SUBPATH_FIELD_NUMBER = 1;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 6;
    public static final int TIME_APPLICABILITY_FIELD_NUMBER = 16;
    public static final int TRAVEL_MODE_FIELD_NUMBER = 3;
    public static final int TRAVEL_PATTERN_FIELD_NUMBER = 14;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VEHICLE_ATTRIBUTE_FILTER_FIELD_NUMBER = 10;
    private int bitField0_;
    private bw intersectionGroup_;
    private boolean isVariable_;
    private ce metadata_;
    private bw restrictionGroup_;
    private long restrictionId_;
    private Object restrictionTiming_;
    private int scope_;
    private int style_;
    private com.google.w.n.a.b temporaryData_;
    private np travelPattern_;
    private oc vehicleAttributeFilter_;
    private static final com.google.v.el<gj> travelMode_converter_ = new ee(2);
    private static final com.google.v.el<com.google.k.a.a.i> autonomousDrivingProducts_converter_ = new ee(3);
    private int restrictionTimingCase_ = 0;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<bw> subpath_ = emptyProtobufList();
    private int type_ = 17;
    private com.google.v.ek travelMode_ = emptyIntList();
    private com.google.v.ek autonomousDrivingProducts_ = emptyIntList();
    private String restrictionToken_ = "";

    static {
        gk gkVar = new gk();
        DEFAULT_INSTANCE = gkVar;
        com.google.v.du.registerDefaultInstance(gk.class, gkVar);
    }

    private gk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAutonomousDrivingProducts(Iterable<? extends com.google.k.a.a.i> iterable) {
        ensureAutonomousDrivingProductsIsMutable();
        Iterator<? extends com.google.k.a.a.i> it = iterable.iterator();
        while (it.hasNext()) {
            this.autonomousDrivingProducts_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubpath(Iterable<? extends bw> iterable) {
        ensureSubpathIsMutable();
        com.google.v.c.addAll(iterable, this.subpath_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTravelMode(Iterable<? extends gj> iterable) {
        ensureTravelModeIsMutable();
        Iterator<? extends gj> it = iterable.iterator();
        while (it.hasNext()) {
            this.travelMode_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAutonomousDrivingProducts(com.google.k.a.a.i iVar) {
        Objects.requireNonNull(iVar);
        ensureAutonomousDrivingProductsIsMutable();
        this.autonomousDrivingProducts_.i(iVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpath(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSubpathIsMutable();
        this.subpath_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTravelMode(gj gjVar) {
        Objects.requireNonNull(gjVar);
        ensureTravelModeIsMutable();
        this.travelMode_.i(gjVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutonomousDrivingProducts() {
        this.autonomousDrivingProducts_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntersectionGroup() {
        this.intersectionGroup_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVariable() {
        this.bitField0_ &= -257;
        this.isVariable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictionGroup() {
        this.restrictionGroup_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictionId() {
        this.bitField0_ &= -2;
        this.restrictionId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictionTiming() {
        this.restrictionTimingCase_ = 0;
        this.restrictionTiming_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictionToken() {
        this.bitField0_ &= -513;
        this.restrictionToken_ = getDefaultInstance().getRestrictionToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchedule() {
        if (this.restrictionTimingCase_ == 5) {
            this.restrictionTimingCase_ = 0;
            this.restrictionTiming_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScope() {
        this.bitField0_ &= -17;
        this.scope_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.bitField0_ &= -5;
        this.style_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubpath() {
        this.subpath_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeApplicability() {
        if (this.restrictionTimingCase_ == 16) {
            this.restrictionTimingCase_ = 0;
            this.restrictionTiming_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelMode() {
        this.travelMode_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelPattern() {
        this.travelPattern_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleAttributeFilter() {
        this.vehicleAttributeFilter_ = null;
        this.bitField0_ &= -65;
    }

    private void ensureAutonomousDrivingProductsIsMutable() {
        com.google.v.ek ekVar = this.autonomousDrivingProducts_;
        if (ekVar.c()) {
            return;
        }
        this.autonomousDrivingProducts_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureSubpathIsMutable() {
        com.google.v.eo<bw> eoVar = this.subpath_;
        if (eoVar.c()) {
            return;
        }
        this.subpath_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTravelModeIsMutable() {
        com.google.v.ek ekVar = this.travelMode_;
        if (ekVar.c()) {
            return;
        }
        this.travelMode_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static gk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntersectionGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.intersectionGroup_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.intersectionGroup_ = bwVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestrictionGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.restrictionGroup_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.restrictionGroup_ = bwVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchedule(kj kjVar) {
        Objects.requireNonNull(kjVar);
        if (this.restrictionTimingCase_ == 5 && this.restrictionTiming_ != kj.getDefaultInstance()) {
            ki kiVarNewBuilder = kj.newBuilder((kj) this.restrictionTiming_);
            kiVarNewBuilder.mergeFrom((ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.restrictionTiming_ = kjVar;
        this.restrictionTimingCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.temporaryData_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.temporaryData_ = bVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTravelPattern(np npVar) {
        Objects.requireNonNull(npVar);
        np npVar2 = this.travelPattern_;
        if (npVar2 != null && npVar2 != np.getDefaultInstance()) {
            nl nlVarNewBuilder = np.newBuilder(npVar2);
            nlVarNewBuilder.mergeFrom((nl) npVar);
            npVar = nlVarNewBuilder.buildPartial();
        }
        this.travelPattern_ = npVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVehicleAttributeFilter(oc ocVar) {
        Objects.requireNonNull(ocVar);
        oc ocVar2 = this.vehicleAttributeFilter_;
        if (ocVar2 != null && ocVar2 != oc.getDefaultInstance()) {
            oa oaVarNewBuilder = oc.newBuilder(ocVar2);
            oaVarNewBuilder.mergeFrom((oa) ocVar);
            ocVar = oaVarNewBuilder.buildPartial();
        }
        this.vehicleAttributeFilter_ = ocVar;
        this.bitField0_ |= 64;
    }

    public static gd newBuilder() {
        return (gd) DEFAULT_INSTANCE.createBuilder();
    }

    public static gk parseDelimitedFrom(InputStream inputStream) {
        return (gk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gk parseFrom(com.google.v.v vVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubpath(int i2) {
        ensureSubpathIsMutable();
        this.subpath_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutonomousDrivingProducts(int i2, com.google.k.a.a.i iVar) {
        Objects.requireNonNull(iVar);
        ensureAutonomousDrivingProductsIsMutable();
        this.autonomousDrivingProducts_.e(i2, iVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntersectionGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.intersectionGroup_ = bwVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVariable(boolean z) {
        this.bitField0_ |= 256;
        this.isVariable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictionGroup(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.restrictionGroup_ = bwVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictionId(long j2) {
        this.bitField0_ |= 1;
        this.restrictionId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictionToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.restrictionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictionTokenBytes(com.google.v.v vVar) {
        this.restrictionToken_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchedule(kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.restrictionTiming_ = kjVar;
        this.restrictionTimingCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScope(ge geVar) {
        this.scope_ = geVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(gf gfVar) {
        this.style_ = gfVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubpath(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSubpathIsMutable();
        this.subpath_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeApplicability(gi giVar) {
        this.restrictionTiming_ = Integer.valueOf(giVar.getNumber());
        this.restrictionTimingCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelMode(int i2, gj gjVar) {
        Objects.requireNonNull(gjVar);
        ensureTravelModeIsMutable();
        this.travelMode_.e(i2, gjVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelPattern(np npVar) {
        Objects.requireNonNull(npVar);
        this.travelPattern_ = npVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(gh ghVar) {
        this.type_ = ghVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleAttributeFilter(oc ocVar) {
        Objects.requireNonNull(ocVar);
        this.vehicleAttributeFilter_ = ocVar;
        this.bitField0_ |= 64;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0001\u0001\u0001Ǵ\u0011\u0000\u0003\u0004\u0001Л\u0002᠌\u0001\u0003ࠞ\u0004᠌\u0002\u0005<\u0000\u0006ᐉ\n\u0007ᐉ\u0003\b᠌\u0004\tᐉ\u0005\nဉ\u0006\u000bࠞ\fဈ\t\rဃ\u0000\u000eဉ\u0007\u000fဇ\b\u0010\u083f\u0000Ǵဉ\u000b", new Object[]{"restrictionTiming_", "restrictionTimingCase_", "bitField0_", "subpath_", bw.class, "type_", dq.f11280l, "travelMode_", dq.n, "style_", dq.f11279k, kj.class, "temporaryData_", "intersectionGroup_", "scope_", dq.f11278j, "restrictionGroup_", "vehicleAttributeFilter_", "autonomousDrivingProducts_", com.google.k.a.a.i.b(), "restrictionToken_", "restrictionId_", "travelPattern_", "isVariable_", dq.m, "metadata_"});
            case 3:
                return new gk();
            case 4:
                return new gd(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gk> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gk.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public com.google.k.a.a.i getAutonomousDrivingProducts(int i2) {
        com.google.k.a.a.i iVarA = com.google.k.a.a.i.a(this.autonomousDrivingProducts_.d(i2));
        return iVarA == null ? com.google.k.a.a.i.UNKNOWN : iVarA;
    }

    public int getAutonomousDrivingProductsCount() {
        return this.autonomousDrivingProducts_.size();
    }

    public List<com.google.k.a.a.i> getAutonomousDrivingProductsList() {
        return new com.google.v.em(this.autonomousDrivingProducts_, autonomousDrivingProducts_converter_);
    }

    public bw getIntersectionGroup() {
        bw bwVar = this.intersectionGroup_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public boolean getIsVariable() {
        return this.isVariable_;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public bw getRestrictionGroup() {
        bw bwVar = this.restrictionGroup_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public long getRestrictionId() {
        return this.restrictionId_;
    }

    public gg getRestrictionTimingCase() {
        int i2 = this.restrictionTimingCase_;
        if (i2 == 0) {
            return gg.f11379c;
        }
        if (i2 == 5) {
            return gg.f11377a;
        }
        if (i2 != 16) {
            return null;
        }
        return gg.f11378b;
    }

    public String getRestrictionToken() {
        return this.restrictionToken_;
    }

    public com.google.v.v getRestrictionTokenBytes() {
        return com.google.v.v.s(this.restrictionToken_);
    }

    public kj getSchedule() {
        return this.restrictionTimingCase_ == 5 ? (kj) this.restrictionTiming_ : kj.getDefaultInstance();
    }

    public ge getScope() {
        ge geVarA = ge.a(this.scope_);
        return geVarA == null ? ge.SCOPE_DIRECTION : geVarA;
    }

    public gf getStyle() {
        gf gfVarA = gf.a(this.style_);
        return gfVarA == null ? gf.STYLE_CONTIGUOUS : gfVarA;
    }

    public bw getSubpath(int i2) {
        return this.subpath_.get(i2);
    }

    public int getSubpathCount() {
        return this.subpath_.size();
    }

    public List<bw> getSubpathList() {
        return this.subpath_;
    }

    public bx getSubpathOrBuilder(int i2) {
        return this.subpath_.get(i2);
    }

    public List<? extends bx> getSubpathOrBuilderList() {
        return this.subpath_;
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public gi getTimeApplicability() {
        gi giVarA;
        return (this.restrictionTimingCase_ != 16 || (giVarA = gi.a(((Integer) this.restrictionTiming_).intValue())) == null) ? gi.TIME_APPLICABILITY_UNSPECIFIED : giVarA;
    }

    public gj getTravelMode(int i2) {
        gj gjVarA = gj.a(this.travelMode_.d(i2));
        return gjVarA == null ? gj.TRAVEL_ANY : gjVarA;
    }

    public int getTravelModeCount() {
        return this.travelMode_.size();
    }

    public List<gj> getTravelModeList() {
        return new com.google.v.em(this.travelMode_, travelMode_converter_);
    }

    public np getTravelPattern() {
        np npVar = this.travelPattern_;
        return npVar == null ? np.getDefaultInstance() : npVar;
    }

    public gh getType() {
        gh ghVarA = gh.a(this.type_);
        return ghVarA == null ? gh.RESTRICTION_TRAVEL_RESTRICTED : ghVarA;
    }

    public oc getVehicleAttributeFilter() {
        oc ocVar = this.vehicleAttributeFilter_;
        return ocVar == null ? oc.getDefaultInstance() : ocVar;
    }

    public boolean hasIntersectionGroup() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsVariable() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasRestrictionGroup() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRestrictionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRestrictionToken() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasSchedule() {
        return this.restrictionTimingCase_ == 5;
    }

    public boolean hasScope() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasStyle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTimeApplicability() {
        return this.restrictionTimingCase_ == 16;
    }

    public boolean hasTravelPattern() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVehicleAttributeFilter() {
        return (this.bitField0_ & 64) != 0;
    }

    public static gd newBuilder(gk gkVar) {
        return (gd) DEFAULT_INSTANCE.createBuilder(gkVar);
    }

    public static gk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gk parseFrom(com.google.v.z zVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubpath(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureSubpathIsMutable();
        this.subpath_.add(bwVar);
    }

    public static gk parseFrom(InputStream inputStream) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gk parseFrom(ByteBuffer byteBuffer) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gk parseFrom(byte[] bArr) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
