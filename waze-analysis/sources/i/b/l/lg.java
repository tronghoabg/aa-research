package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class lg extends com.google.v.du<lg, lf> implements com.google.v.fj {
    private static final lg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<lg> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 1;
    public static final int RADIUS_METERS_FIELD_NUMBER = 2;
    private int bitField0_;
    private i.b.s position_;
    private int radiusMeters_;

    static {
        lg lgVar = new lg();
        DEFAULT_INSTANCE = lgVar;
        com.google.v.du.registerDefaultInstance(lg.class, lgVar);
    }

    private lg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadiusMeters() {
        this.bitField0_ &= -3;
        this.radiusMeters_ = 0;
    }

    public static lg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.position_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.position_ = sVar;
        this.bitField0_ |= 1;
    }

    public static lf newBuilder() {
        return (lf) DEFAULT_INSTANCE.createBuilder();
    }

    public static lg parseDelimitedFrom(InputStream inputStream) {
        return (lg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lg parseFrom(com.google.v.v vVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.position_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadiusMeters(int i2) {
        this.bitField0_ |= 2;
        this.radiusMeters_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"bitField0_", "position_", "radiusMeters_"});
        }
        if (iOrdinal == 3) {
            return new lg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getPosition() {
        i.b.s sVar = this.position_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public int getRadiusMeters() {
        return this.radiusMeters_;
    }

    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRadiusMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public static lf newBuilder(lg lgVar) {
        return (lf) DEFAULT_INSTANCE.createBuilder(lgVar);
    }

    public static lg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lg parseFrom(com.google.v.z zVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lg parseFrom(InputStream inputStream) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lg parseFrom(ByteBuffer byteBuffer) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lg parseFrom(byte[] bArr) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
