package i.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends du<c, a> implements fj {
    private static final c DEFAULT_INSTANCE;
    private static volatile fo<c> PARSER = null;
    public static final int POLYLINE_FIELD_NUMBER = 4;
    public static final int S2_COMPRESSED_POINTS_FIELD_NUMBER = 3;
    public static final int WKB_FIELD_NUMBER = 2;
    public static final int WKT_FIELD_NUMBER = 1;
    private int geometryCase_ = 0;
    private Object geometry_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometry() {
        this.geometryCase_ = 0;
        this.geometry_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolyline() {
        if (this.geometryCase_ == 4) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearS2CompressedPoints() {
        if (this.geometryCase_ == 3) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWkb() {
        if (this.geometryCase_ == 2) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWkt() {
        if (this.geometryCase_ == 1) {
            this.geometryCase_ = 0;
            this.geometry_ = null;
        }
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolyline(e eVar) {
        Objects.requireNonNull(eVar);
        if (this.geometryCase_ == 4 && this.geometry_ != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder((e) this.geometry_);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.geometry_ = eVar;
        this.geometryCase_ = 4;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(com.google.v.v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolyline(e eVar) {
        Objects.requireNonNull(eVar);
        this.geometry_ = eVar;
        this.geometryCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setS2CompressedPoints(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.geometryCase_ = 3;
        this.geometry_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWkb(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.geometryCase_ = 2;
        this.geometry_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWkt(String str) {
        Objects.requireNonNull(str);
        this.geometryCase_ = 1;
        this.geometry_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWktBytes(com.google.v.v vVar) {
        this.geometry_ = vVar.u();
        this.geometryCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001;\u0000\u0002=\u0000\u0003=\u0000\u0004<\u0000", new Object[]{"geometry_", "geometryCase_", e.class});
        }
        if (iOrdinal == 3) {
            return new c();
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

    public b getGeometryCase() {
        int i2 = this.geometryCase_;
        if (i2 == 0) {
            return b.f48312e;
        }
        if (i2 == 1) {
            return b.f48308a;
        }
        if (i2 == 2) {
            return b.f48309b;
        }
        if (i2 == 3) {
            return b.f48310c;
        }
        if (i2 != 4) {
            return null;
        }
        return b.f48311d;
    }

    public e getPolyline() {
        return this.geometryCase_ == 4 ? (e) this.geometry_ : e.getDefaultInstance();
    }

    public com.google.v.v getS2CompressedPoints() {
        return this.geometryCase_ == 3 ? (com.google.v.v) this.geometry_ : com.google.v.v.f13054a;
    }

    public com.google.v.v getWkb() {
        return this.geometryCase_ == 2 ? (com.google.v.v) this.geometry_ : com.google.v.v.f13054a;
    }

    public String getWkt() {
        return this.geometryCase_ == 1 ? (String) this.geometry_ : "";
    }

    public com.google.v.v getWktBytes() {
        return com.google.v.v.s(this.geometryCase_ == 1 ? (String) this.geometry_ : "");
    }

    public boolean hasPolyline() {
        return this.geometryCase_ == 4;
    }

    public boolean hasS2CompressedPoints() {
        return this.geometryCase_ == 3;
    }

    public boolean hasWkb() {
        return this.geometryCase_ == 2;
    }

    public boolean hasWkt() {
        return this.geometryCase_ == 1;
    }

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
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
