package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qu extends com.google.v.du<qu, qt> implements qv {
    private static final qu DEFAULT_INSTANCE;
    public static final int MTE_DISPLAY_LABEL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<qu> PARSER = null;
    public static final int POLYGON_ENCODED_S2_POINTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private sz mteDisplayLabel_;
    private com.google.v.v polygonEncodedS2Points_ = com.google.v.v.f13054a;

    static {
        qu quVar = new qu();
        DEFAULT_INSTANCE = quVar;
        com.google.v.du.registerDefaultInstance(qu.class, quVar);
    }

    private qu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMteDisplayLabel() {
        this.mteDisplayLabel_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygonEncodedS2Points() {
        this.bitField0_ &= -2;
        this.polygonEncodedS2Points_ = getDefaultInstance().getPolygonEncodedS2Points();
    }

    public static qu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMteDisplayLabel(sz szVar) {
        Objects.requireNonNull(szVar);
        sz szVar2 = this.mteDisplayLabel_;
        if (szVar2 != null && szVar2 != sz.getDefaultInstance()) {
            sy syVarNewBuilder = sz.newBuilder(szVar2);
            syVarNewBuilder.mergeFrom((sy) szVar);
            szVar = syVarNewBuilder.buildPartial();
        }
        this.mteDisplayLabel_ = szVar;
        this.bitField0_ |= 2;
    }

    public static qt newBuilder() {
        return (qt) DEFAULT_INSTANCE.createBuilder();
    }

    public static qu parseDelimitedFrom(InputStream inputStream) {
        return (qu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qu parseFrom(com.google.v.v vVar) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteDisplayLabel(sz szVar) {
        Objects.requireNonNull(szVar);
        this.mteDisplayLabel_ = szVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonEncodedS2Points(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 1;
        this.polygonEncodedS2Points_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "polygonEncodedS2Points_", "mteDisplayLabel_"});
        }
        if (iOrdinal == 3) {
            return new qu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public sz getMteDisplayLabel() {
        sz szVar = this.mteDisplayLabel_;
        return szVar == null ? sz.getDefaultInstance() : szVar;
    }

    public com.google.v.v getPolygonEncodedS2Points() {
        return this.polygonEncodedS2Points_;
    }

    public boolean hasMteDisplayLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPolygonEncodedS2Points() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qt newBuilder(qu quVar) {
        return (qt) DEFAULT_INSTANCE.createBuilder(quVar);
    }

    public static qu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qu parseFrom(com.google.v.z zVar) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qu parseFrom(InputStream inputStream) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qu parseFrom(ByteBuffer byteBuffer) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qu parseFrom(byte[] bArr) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
