package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bkq extends com.google.v.du<bkq, bkp> implements com.google.v.fj {
    private static final bkq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bkq> PARSER = null;
    public static final int POLYGON_VIEWPORT_RATIO_FIELD_NUMBER = 1;
    private int bitField0_;
    private float polygonViewportRatio_;

    static {
        bkq bkqVar = new bkq();
        DEFAULT_INSTANCE = bkqVar;
        com.google.v.du.registerDefaultInstance(bkq.class, bkqVar);
    }

    private bkq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygonViewportRatio() {
        this.bitField0_ &= -2;
        this.polygonViewportRatio_ = 0.0f;
    }

    public static bkq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bkp newBuilder() {
        return (bkp) DEFAULT_INSTANCE.createBuilder();
    }

    public static bkq parseDelimitedFrom(InputStream inputStream) {
        return (bkq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkq parseFrom(com.google.v.v vVar) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bkq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonViewportRatio(float f2) {
        this.bitField0_ |= 1;
        this.polygonViewportRatio_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "polygonViewportRatio_"});
        }
        if (iOrdinal == 3) {
            return new bkq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bkp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bkq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bkq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getPolygonViewportRatio() {
        return this.polygonViewportRatio_;
    }

    public boolean hasPolygonViewportRatio() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bkp newBuilder(bkq bkqVar) {
        return (bkp) DEFAULT_INSTANCE.createBuilder(bkqVar);
    }

    public static bkq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bkq parseFrom(com.google.v.z zVar) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bkq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bkq parseFrom(InputStream inputStream) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkq parseFrom(ByteBuffer byteBuffer) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bkq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bkq parseFrom(byte[] bArr) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bkq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bkq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
