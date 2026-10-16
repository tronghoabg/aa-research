package i.b.n.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class j extends du<j, a> implements fj {
    public static final int COORDINATE_FIELD_NUMBER = 2;
    private static final j DEFAULT_INSTANCE;
    public static final int MAX_DISTANCE_METERS_FIELD_NUMBER = 4;
    private static volatile fo<j> PARSER = null;
    public static final int POLYGON_FIELD_NUMBER = 6;
    public static final int ROUTE_FIELD_NUMBER = 3;
    public static final int SESSION_BASED_GEOMETRY_FIELD_NUMBER = 1;
    public static final int VENUE_LOCATION_FIELD_NUMBER = 7;
    public static final int VIEWPORT_FIELD_NUMBER = 8;
    private int bitField0_;
    private int geometryCase_ = 0;
    private Object geometry_;
    private int maxDistanceMeters_;
    private d viewport_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        if (this.geometryCase_ == 2) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometry() {
        this.geometryCase_ = 0;
        this.geometry_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDistanceMeters() {
        this.bitField0_ &= -3;
        this.maxDistanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygon() {
        if (this.geometryCase_ == 6) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoute() {
        if (this.geometryCase_ == 3) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionBasedGeometry() {
        if (this.geometryCase_ == 1) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueLocation() {
        if (this.geometryCase_ == 7) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewport() {
        this.viewport_ = null;
        this.bitField0_ &= -2;
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinate(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        if (this.geometryCase_ == 2 && this.geometry_ != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder((i.b.s) this.geometry_);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.geometry_ = sVar;
        this.geometryCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygon(d dVar) {
        Objects.requireNonNull(dVar);
        if (this.geometryCase_ == 6 && this.geometry_ != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder((d) this.geometry_);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.geometry_ = dVar;
        this.geometryCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoute(f fVar) {
        Objects.requireNonNull(fVar);
        if (this.geometryCase_ == 3 && this.geometry_ != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder((f) this.geometry_);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.geometry_ = fVar;
        this.geometryCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueLocation(i iVar) {
        Objects.requireNonNull(iVar);
        if (this.geometryCase_ == 7 && this.geometry_ != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder((i) this.geometry_);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.geometry_ = iVar;
        this.geometryCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewport(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.viewport_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.viewport_ = dVar;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(com.google.v.v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.geometry_ = sVar;
        this.geometryCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDistanceMeters(int i2) {
        this.bitField0_ |= 2;
        this.maxDistanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygon(d dVar) {
        Objects.requireNonNull(dVar);
        this.geometry_ = dVar;
        this.geometryCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoute(f fVar) {
        Objects.requireNonNull(fVar);
        this.geometry_ = fVar;
        this.geometryCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionBasedGeometry(g gVar) {
        this.geometry_ = Integer.valueOf(gVar.getNumber());
        this.geometryCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueLocation(i iVar) {
        Objects.requireNonNull(iVar);
        this.geometry_ = iVar;
        this.geometryCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewport(d dVar) {
        Objects.requireNonNull(dVar);
        this.viewport_ = dVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u083f\u0000\u0002<\u0000\u0003<\u0000\u0004င\u0001\u0006<\u0000\u0007<\u0000\bဉ\u0000", new Object[]{"geometry_", "geometryCase_", "bitField0_", af.f49100b, i.b.s.class, f.class, "maxDistanceMeters_", d.class, i.class, "viewport_"});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getCoordinate() {
        return this.geometryCase_ == 2 ? (i.b.s) this.geometry_ : i.b.s.getDefaultInstance();
    }

    public b getGeometryCase() {
        int i2 = this.geometryCase_;
        if (i2 == 0) {
            return b.f49128f;
        }
        if (i2 == 1) {
            return b.f49123a;
        }
        if (i2 == 2) {
            return b.f49124b;
        }
        if (i2 == 3) {
            return b.f49125c;
        }
        if (i2 == 6) {
            return b.f49126d;
        }
        if (i2 != 7) {
            return null;
        }
        return b.f49127e;
    }

    public int getMaxDistanceMeters() {
        return this.maxDistanceMeters_;
    }

    @Deprecated
    public d getPolygon() {
        return this.geometryCase_ == 6 ? (d) this.geometry_ : d.getDefaultInstance();
    }

    public f getRoute() {
        return this.geometryCase_ == 3 ? (f) this.geometry_ : f.getDefaultInstance();
    }

    public g getSessionBasedGeometry() {
        g gVarA;
        return (this.geometryCase_ != 1 || (gVarA = g.a(((Integer) this.geometry_).intValue())) == null) ? g.UNKNOWN_SESSION_BASED_GEOMETRY : gVarA;
    }

    public i getVenueLocation() {
        return this.geometryCase_ == 7 ? (i) this.geometry_ : i.getDefaultInstance();
    }

    public d getViewport() {
        d dVar = this.viewport_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public boolean hasCoordinate() {
        return this.geometryCase_ == 2;
    }

    public boolean hasMaxDistanceMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasPolygon() {
        return this.geometryCase_ == 6;
    }

    public boolean hasRoute() {
        return this.geometryCase_ == 3;
    }

    public boolean hasSessionBasedGeometry() {
        return this.geometryCase_ == 1;
    }

    public boolean hasVenueLocation() {
        return this.geometryCase_ == 7;
    }

    public boolean hasViewport() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(j jVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(com.google.v.v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(com.google.v.z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(com.google.v.z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
