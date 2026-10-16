package i.b.n.a;

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
/* loaded from: classes8.dex */
public final class ah extends du<ah, ae> implements fj {
    private static final ah DEFAULT_INSTANCE;
    public static final int MERGE_USER_UPDATES_FIELD_NUMBER = 4;
    public static final int ORIGIN_FIELD_NUMBER = 6;
    public static final int PAGE_SIZE_FIELD_NUMBER = 5;
    private static volatile fo<ah> PARSER = null;
    public static final int SEARCH_AREA_FIELD_NUMBER = 1;
    public static final int SEARCH_FILTERS_FIELD_NUMBER = 2;
    public static final int VENUE_PREFERENCE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int origin_;
    private j searchArea_;
    private az venuePreference_;
    private eo<ac> searchFilters_ = emptyProtobufList();
    private boolean mergeUserUpdates_ = true;
    private int pageSize_ = 20;

    static {
        ah ahVar = new ah();
        DEFAULT_INSTANCE = ahVar;
        du.registerDefaultInstance(ah.class, ahVar);
    }

    private ah() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSearchFilters(Iterable<? extends ac> iterable) {
        ensureSearchFiltersIsMutable();
        com.google.v.c.addAll(iterable, this.searchFilters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSearchFilters(int i2, ac acVar) {
        Objects.requireNonNull(acVar);
        ensureSearchFiltersIsMutable();
        this.searchFilters_.add(i2, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergeUserUpdates() {
        this.bitField0_ &= -5;
        this.mergeUserUpdates_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigin() {
        this.bitField0_ &= -17;
        this.origin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.bitField0_ &= -9;
        this.pageSize_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchArea() {
        this.searchArea_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchFilters() {
        this.searchFilters_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenuePreference() {
        this.venuePreference_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureSearchFiltersIsMutable() {
        eo<ac> eoVar = this.searchFilters_;
        if (eoVar.c()) {
            return;
        }
        this.searchFilters_ = du.mutableCopy(eoVar);
    }

    public static ah getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchArea(j jVar) {
        Objects.requireNonNull(jVar);
        j jVar2 = this.searchArea_;
        if (jVar2 != null && jVar2 != j.getDefaultInstance()) {
            a aVarNewBuilder = j.newBuilder(jVar2);
            aVarNewBuilder.mergeFrom((a) jVar);
            jVar = aVarNewBuilder.buildPartial();
        }
        this.searchArea_ = jVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenuePreference(az azVar) {
        Objects.requireNonNull(azVar);
        az azVar2 = this.venuePreference_;
        if (azVar2 != null && azVar2 != az.getDefaultInstance()) {
            ay ayVarNewBuilder = az.newBuilder(azVar2);
            ayVarNewBuilder.mergeFrom((ay) azVar);
            azVar = ayVarNewBuilder.buildPartial();
        }
        this.venuePreference_ = azVar;
        this.bitField0_ |= 2;
    }

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static ah parseDelimitedFrom(InputStream inputStream) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(com.google.v.v vVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ah> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSearchFilters(int i2) {
        ensureSearchFiltersIsMutable();
        this.searchFilters_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergeUserUpdates(boolean z) {
        this.bitField0_ |= 4;
        this.mergeUserUpdates_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(ag agVar) {
        this.origin_ = agVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageSize(int i2) {
        this.bitField0_ |= 8;
        this.pageSize_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchArea(j jVar) {
        Objects.requireNonNull(jVar);
        this.searchArea_ = jVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchFilters(int i2, ac acVar) {
        Objects.requireNonNull(acVar);
        ensureSearchFiltersIsMutable();
        this.searchFilters_.set(i2, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenuePreference(az azVar) {
        Objects.requireNonNull(azVar);
        this.venuePreference_ = azVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဇ\u0002\u0005င\u0003\u0006᠌\u0004", new Object[]{"bitField0_", "searchArea_", "searchFilters_", ac.class, "venuePreference_", "mergeUserUpdates_", "pageSize_", "origin_", af.f49099a});
        }
        if (iOrdinal == 3) {
            return new ah();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ah> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ah.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getMergeUserUpdates() {
        return this.mergeUserUpdates_;
    }

    public ag getOrigin() {
        ag agVarA = ag.a(this.origin_);
        return agVarA == null ? ag.UNKNOWN_ORIGIN : agVarA;
    }

    public int getPageSize() {
        return this.pageSize_;
    }

    public j getSearchArea() {
        j jVar = this.searchArea_;
        return jVar == null ? j.getDefaultInstance() : jVar;
    }

    public ac getSearchFilters(int i2) {
        return this.searchFilters_.get(i2);
    }

    public int getSearchFiltersCount() {
        return this.searchFilters_.size();
    }

    public List<ac> getSearchFiltersList() {
        return this.searchFilters_;
    }

    public ad getSearchFiltersOrBuilder(int i2) {
        return this.searchFilters_.get(i2);
    }

    public List<? extends ad> getSearchFiltersOrBuilderList() {
        return this.searchFilters_;
    }

    @Deprecated
    public az getVenuePreference() {
        az azVar = this.venuePreference_;
        return azVar == null ? az.getDefaultInstance() : azVar;
    }

    public boolean hasMergeUserUpdates() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOrigin() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPageSize() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSearchArea() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasVenuePreference() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ae newBuilder(ah ahVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(ahVar);
    }

    public static ah parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(com.google.v.v vVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ah parseFrom(com.google.v.z zVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ah parseFrom(com.google.v.z zVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSearchFilters(ac acVar) {
        Objects.requireNonNull(acVar);
        ensureSearchFiltersIsMutable();
        this.searchFilters_.add(acVar);
    }

    public static ah parseFrom(InputStream inputStream) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(InputStream inputStream, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(ByteBuffer byteBuffer) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ah parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ah parseFrom(byte[] bArr) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ah parseFrom(byte[] bArr, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
