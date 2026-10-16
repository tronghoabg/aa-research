package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ge extends com.google.v.du<ge, gd> implements com.google.v.fj {
    private static final ge DEFAULT_INSTANCE;
    public static final int HAS_NORMAL_TEXTURE_FIELD_NUMBER = 1;
    public static final int HAS_SHARE_TEXTURE_FIELD_NUMBER = 3;
    public static final int HAS_TAXI_TEXTURE_FIELD_NUMBER = 2;
    public static final int LIGHTING_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<ge> PARSER = null;
    public static final int SCALE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean hasNormalTexture_;
    private boolean hasShareTexture_;
    private boolean hasTaxiTexture_;
    private gg lighting_;
    private float scale_ = 1.0f;

    static {
        ge geVar = new ge();
        DEFAULT_INSTANCE = geVar;
        com.google.v.du.registerDefaultInstance(ge.class, geVar);
    }

    private ge() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasNormalTexture() {
        this.bitField0_ &= -2;
        this.hasNormalTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasShareTexture() {
        this.bitField0_ &= -5;
        this.hasShareTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasTaxiTexture() {
        this.bitField0_ &= -3;
        this.hasTaxiTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLighting() {
        this.lighting_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.bitField0_ &= -9;
        this.scale_ = 1.0f;
    }

    public static ge getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLighting(gg ggVar) {
        Objects.requireNonNull(ggVar);
        gg ggVar2 = this.lighting_;
        if (ggVar2 != null && ggVar2 != gg.getDefaultInstance()) {
            gf gfVarNewBuilder = gg.newBuilder(ggVar2);
            gfVarNewBuilder.mergeFrom((gf) ggVar);
            ggVar = gfVarNewBuilder.buildPartial();
        }
        this.lighting_ = ggVar;
        this.bitField0_ |= 16;
    }

    public static gd newBuilder() {
        return (gd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ge parseDelimitedFrom(InputStream inputStream) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(com.google.v.v vVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ge> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasNormalTexture(boolean z) {
        this.bitField0_ |= 1;
        this.hasNormalTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasShareTexture(boolean z) {
        this.bitField0_ |= 4;
        this.hasShareTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasTaxiTexture(boolean z) {
        this.bitField0_ |= 2;
        this.hasTaxiTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLighting(gg ggVar) {
        Objects.requireNonNull(ggVar);
        this.lighting_ = ggVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f2) {
        this.bitField0_ |= 8;
        this.scale_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "hasNormalTexture_", "hasTaxiTexture_", "hasShareTexture_", "scale_", "lighting_"});
        }
        if (iOrdinal == 3) {
            return new ge();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ge> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ge.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getHasNormalTexture() {
        return this.hasNormalTexture_;
    }

    public boolean getHasShareTexture() {
        return this.hasShareTexture_;
    }

    public boolean getHasTaxiTexture() {
        return this.hasTaxiTexture_;
    }

    public gg getLighting() {
        gg ggVar = this.lighting_;
        return ggVar == null ? gg.getDefaultInstance() : ggVar;
    }

    public float getScale() {
        return this.scale_;
    }

    public boolean hasHasNormalTexture() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHasShareTexture() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasHasTaxiTexture() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLighting() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasScale() {
        return (this.bitField0_ & 8) != 0;
    }

    public static gd newBuilder(ge geVar) {
        return (gd) DEFAULT_INSTANCE.createBuilder(geVar);
    }

    public static ge parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ge parseFrom(com.google.v.z zVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ge parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ge parseFrom(InputStream inputStream) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ge parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ge parseFrom(ByteBuffer byteBuffer) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ge parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ge parseFrom(byte[] bArr) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ge parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ge) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
