package com.waze.bg.e;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends du<c, b> implements fj {
    public static final int ADMINISTRATIVE_REGIONS_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int DESTINATION_NAME_FIELD_NUMBER = 2;
    public static final int ORIGIN_NAME_FIELD_NUMBER = 1;
    private static volatile fo<c> PARSER = null;
    public static final int PREDOMINANT_DIRECTION_FIELD_NUMBER = 4;
    public static final int SECTIONS_FIELD_NUMBER = 5;
    public static final int SHORT_NAME_FIELD_NUMBER = 7;
    public static final int WAY_POINT_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private int predominantDirection_;
    private String originName_ = "";
    private String destinationName_ = "";
    private String wayPointName_ = "";
    private eo<e> sections_ = emptyProtobufList();
    private eo<String> administrativeRegions_ = emptyProtobufList();
    private String shortName_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdministrativeRegions(String str) {
        Objects.requireNonNull(str);
        ensureAdministrativeRegionsIsMutable();
        this.administrativeRegions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdministrativeRegionsBytes(v vVar) {
        ensureAdministrativeRegionsIsMutable();
        this.administrativeRegions_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdministrativeRegions(Iterable<String> iterable) {
        ensureAdministrativeRegionsIsMutable();
        com.google.v.c.addAll(iterable, this.administrativeRegions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSections(Iterable<? extends e> iterable) {
        ensureSectionsIsMutable();
        com.google.v.c.addAll(iterable, this.sections_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSections(int i2, e eVar) {
        Objects.requireNonNull(eVar);
        ensureSectionsIsMutable();
        this.sections_.add(i2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdministrativeRegions() {
        this.administrativeRegions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationName() {
        this.bitField0_ &= -3;
        this.destinationName_ = getDefaultInstance().getDestinationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginName() {
        this.bitField0_ &= -2;
        this.originName_ = getDefaultInstance().getOriginName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredominantDirection() {
        this.bitField0_ &= -9;
        this.predominantDirection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSections() {
        this.sections_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortName() {
        this.bitField0_ &= -17;
        this.shortName_ = getDefaultInstance().getShortName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWayPointName() {
        this.bitField0_ &= -5;
        this.wayPointName_ = getDefaultInstance().getWayPointName();
    }

    private void ensureAdministrativeRegionsIsMutable() {
        eo<String> eoVar = this.administrativeRegions_;
        if (eoVar.c()) {
            return;
        }
        this.administrativeRegions_ = du.mutableCopy(eoVar);
    }

    private void ensureSectionsIsMutable() {
        eo<e> eoVar = this.sections_;
        if (eoVar.c()) {
            return;
        }
        this.sections_ = du.mutableCopy(eoVar);
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSections(int i2) {
        ensureSectionsIsMutable();
        this.sections_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdministrativeRegions(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAdministrativeRegionsIsMutable();
        this.administrativeRegions_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.destinationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationNameBytes(v vVar) {
        this.destinationName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.originName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginNameBytes(v vVar) {
        this.originName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredominantDirection(a aVar) {
        this.predominantDirection_ = aVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSections(int i2, e eVar) {
        Objects.requireNonNull(eVar);
        ensureSectionsIsMutable();
        this.sections_.set(i2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.shortName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortNameBytes(v vVar) {
        this.shortName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWayPointName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.wayPointName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWayPointNameBytes(v vVar) {
        this.wayPointName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005\u001b\u0006\u001a\u0007ဈ\u0004", new Object[]{"bitField0_", "originName_", "destinationName_", "wayPointName_", "predominantDirection_", g.f16741b, "sections_", e.class, "administrativeRegions_", "shortName_"});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAdministrativeRegions(int i2) {
        return this.administrativeRegions_.get(i2);
    }

    public v getAdministrativeRegionsBytes(int i2) {
        return v.s(this.administrativeRegions_.get(i2));
    }

    public int getAdministrativeRegionsCount() {
        return this.administrativeRegions_.size();
    }

    public List<String> getAdministrativeRegionsList() {
        return this.administrativeRegions_;
    }

    public String getDestinationName() {
        return this.destinationName_;
    }

    public v getDestinationNameBytes() {
        return v.s(this.destinationName_);
    }

    public String getOriginName() {
        return this.originName_;
    }

    public v getOriginNameBytes() {
        return v.s(this.originName_);
    }

    public a getPredominantDirection() {
        a aVarA = a.a(this.predominantDirection_);
        return aVarA == null ? a.UNSPECIFIED_DIRECTION : aVarA;
    }

    public e getSections(int i2) {
        return this.sections_.get(i2);
    }

    public int getSectionsCount() {
        return this.sections_.size();
    }

    public List<e> getSectionsList() {
        return this.sections_;
    }

    public f getSectionsOrBuilder(int i2) {
        return this.sections_.get(i2);
    }

    public List<? extends f> getSectionsOrBuilderList() {
        return this.sections_;
    }

    public String getShortName() {
        return this.shortName_;
    }

    public v getShortNameBytes() {
        return v.s(this.shortName_);
    }

    public String getWayPointName() {
        return this.wayPointName_;
    }

    public v getWayPointNameBytes() {
        return v.s(this.wayPointName_);
    }

    public boolean hasDestinationName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOriginName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPredominantDirection() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasShortName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasWayPointName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSections(e eVar) {
        Objects.requireNonNull(eVar);
        ensureSectionsIsMutable();
        this.sections_.add(eVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
