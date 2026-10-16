package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ys extends com.google.v.du<ys, yr> implements com.google.v.fj {
    private static final ys DEFAULT_INSTANCE;
    public static final int DETOUR_TIME_MINUTES_FIELD_NUMBER = 2;
    public static final int GOOGLE_AD_INFORMATION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ys> PARSER;
    private int bitField0_;
    private float detourTimeMinutes_;
    private zh googleAdInformation_;

    static {
        ys ysVar = new ys();
        DEFAULT_INSTANCE = ysVar;
        com.google.v.du.registerDefaultInstance(ys.class, ysVar);
    }

    private ys() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourTimeMinutes() {
        this.detourTimeMinutes_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformation() {
        this.googleAdInformation_ = null;
        this.bitField0_ &= -2;
    }

    public static ys getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        zh zhVar2 = this.googleAdInformation_;
        if (zhVar2 != null && zhVar2 != zh.getDefaultInstance()) {
            zg zgVarNewBuilder = zh.newBuilder(zhVar2);
            zgVarNewBuilder.mergeFrom((zg) zhVar);
            zhVar = zgVarNewBuilder.buildPartial();
        }
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 1;
    }

    public static yr newBuilder() {
        return (yr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ys parseDelimitedFrom(InputStream inputStream) {
        return (ys) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ys parseFrom(com.google.v.v vVar) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ys> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourTimeMinutes(float f2) {
        this.detourTimeMinutes_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0001", new Object[]{"bitField0_", "googleAdInformation_", "detourTimeMinutes_"});
        }
        if (iOrdinal == 3) {
            return new ys();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new yr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ys> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ys.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getDetourTimeMinutes() {
        return this.detourTimeMinutes_;
    }

    public zh getGoogleAdInformation() {
        zh zhVar = this.googleAdInformation_;
        return zhVar == null ? zh.getDefaultInstance() : zhVar;
    }

    public boolean hasGoogleAdInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static yr newBuilder(ys ysVar) {
        return (yr) DEFAULT_INSTANCE.createBuilder(ysVar);
    }

    public static ys parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ys) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ys parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ys parseFrom(com.google.v.z zVar) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ys parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ys parseFrom(InputStream inputStream) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ys parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ys parseFrom(ByteBuffer byteBuffer) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ys parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ys parseFrom(byte[] bArr) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ys parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ys) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
