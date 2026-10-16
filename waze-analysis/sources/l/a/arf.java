package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class arf extends com.google.v.du<arf, arc> implements com.google.v.fj {
    private static final arf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<arf> PARSER = null;
    public static final int POLYGON_RENDERER_TYPE_FIELD_NUMBER = 4;
    public static final int RENDER_ERROR_TYPE_FIELD_NUMBER = 3;
    public static final int TILE_ID_FIELD_NUMBER = 1;
    public static final int TILE_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int polygonRendererType_;
    private int renderErrorType_;
    private long tileId_;
    private long tileTimestampMs_;

    static {
        arf arfVar = new arf();
        DEFAULT_INSTANCE = arfVar;
        com.google.v.du.registerDefaultInstance(arf.class, arfVar);
    }

    private arf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygonRendererType() {
        this.polygonRendererType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderErrorType() {
        this.renderErrorType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.bitField0_ &= -2;
        this.tileId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileTimestampMs() {
        this.bitField0_ &= -3;
        this.tileTimestampMs_ = 0L;
    }

    public static arf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static arc newBuilder() {
        return (arc) DEFAULT_INSTANCE.createBuilder();
    }

    public static arf parseDelimitedFrom(InputStream inputStream) {
        return (arf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arf parseFrom(com.google.v.v vVar) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<arf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonRendererType(ard ardVar) {
        this.polygonRendererType_ = ardVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonRendererTypeValue(int i2) {
        this.polygonRendererType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderErrorType(are areVar) {
        this.renderErrorType_ = areVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderErrorTypeValue(int i2) {
        this.renderErrorType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(long j2) {
        this.bitField0_ |= 1;
        this.tileId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileTimestampMs(long j2) {
        this.bitField0_ |= 2;
        this.tileTimestampMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\f\u0004\f", new Object[]{"bitField0_", "tileId_", "tileTimestampMs_", "renderErrorType_", "polygonRendererType_"});
        }
        if (iOrdinal == 3) {
            return new arf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new arc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<arf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (arf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ard getPolygonRendererType() {
        int i2 = this.polygonRendererType_;
        ard ardVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ard.GODOT_RENDERER : ard.LEGACY_RENDERER : ard.RENDERER_TYPE_UNSPECIFIED;
        return ardVar == null ? ard.UNRECOGNIZED : ardVar;
    }

    public int getPolygonRendererTypeValue() {
        return this.polygonRendererType_;
    }

    public are getRenderErrorType() {
        are areVar;
        switch (this.renderErrorType_) {
            case 0:
                areVar = are.RENDER_ERROR_TYPE_UNSPECIFIED;
                break;
            case 1:
                areVar = are.MISSING_BEGIN_POLYGON;
                break;
            case 2:
                areVar = are.MISSING_END_POLYGON;
                break;
            case 3:
                areVar = are.MISSING_BEGIN_CONTOUR;
                break;
            case 4:
                areVar = are.MISSING_END_CONTOUR;
                break;
            case 5:
                areVar = are.COORD_TOO_LARGE;
                break;
            case 6:
                areVar = are.NEED_COMBINE_CALLBACK;
                break;
            default:
                areVar = null;
                break;
        }
        return areVar == null ? are.UNRECOGNIZED : areVar;
    }

    public int getRenderErrorTypeValue() {
        return this.renderErrorType_;
    }

    public long getTileId() {
        return this.tileId_;
    }

    public long getTileTimestampMs() {
        return this.tileTimestampMs_;
    }

    public boolean hasTileId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTileTimestampMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static arc newBuilder(arf arfVar) {
        return (arc) DEFAULT_INSTANCE.createBuilder(arfVar);
    }

    public static arf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static arf parseFrom(com.google.v.z zVar) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static arf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static arf parseFrom(InputStream inputStream) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arf parseFrom(ByteBuffer byteBuffer) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static arf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static arf parseFrom(byte[] bArr) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static arf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (arf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
