package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bt extends com.google.v.du<bt, bq> implements bu {
    public static final int CURVATURE_STATUS_FIELD_NUMBER = 3;
    private static final bt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bt> PARSER = null;
    public static final int RADIANS_PER_METER_FIELD_NUMBER = 2;
    public static final int START_POINT_FRACTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private int curvatureValueCase_ = 0;
    private Object curvatureValue_;
    private float startPointFraction_;

    static {
        bt btVar = new bt();
        DEFAULT_INSTANCE = btVar;
        com.google.v.du.registerDefaultInstance(bt.class, btVar);
    }

    private bt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurvatureStatus() {
        if (this.curvatureValueCase_ == 3) {
            this.curvatureValueCase_ = 0;
            this.curvatureValue_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurvatureValue() {
        this.curvatureValueCase_ = 0;
        this.curvatureValue_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadiansPerMeter() {
        if (this.curvatureValueCase_ == 2) {
            this.curvatureValueCase_ = 0;
            this.curvatureValue_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartPointFraction() {
        this.bitField0_ &= -2;
        this.startPointFraction_ = 0.0f;
    }

    public static bt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bq newBuilder() {
        return (bq) DEFAULT_INSTANCE.createBuilder();
    }

    public static bt parseDelimitedFrom(InputStream inputStream) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(com.google.v.v vVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurvatureStatus(br brVar) {
        this.curvatureValue_ = Integer.valueOf(brVar.getNumber());
        this.curvatureValueCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadiansPerMeter(float f2) {
        this.curvatureValueCase_ = 2;
        this.curvatureValue_ = Float.valueOf(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartPointFraction(float f2) {
        this.bitField0_ |= 1;
        this.startPointFraction_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u00024\u0000\u0003\u083f\u0000", new Object[]{"curvatureValue_", "curvatureValueCase_", "bitField0_", "startPointFraction_", h.f11877f});
        }
        if (iOrdinal == 3) {
            return new bt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public br getCurvatureStatus() {
        br brVarA;
        return (this.curvatureValueCase_ != 3 || (brVarA = br.a(((Integer) this.curvatureValue_).intValue())) == null) ? br.CURVATURE_UNSPECIFIED : brVarA;
    }

    public bs getCurvatureValueCase() {
        int i2 = this.curvatureValueCase_;
        if (i2 == 0) {
            return bs.f11738c;
        }
        if (i2 == 2) {
            return bs.f11736a;
        }
        if (i2 != 3) {
            return null;
        }
        return bs.f11737b;
    }

    public float getRadiansPerMeter() {
        if (this.curvatureValueCase_ == 2) {
            return ((Float) this.curvatureValue_).floatValue();
        }
        return 0.0f;
    }

    public float getStartPointFraction() {
        return this.startPointFraction_;
    }

    public boolean hasCurvatureStatus() {
        return this.curvatureValueCase_ == 3;
    }

    public boolean hasRadiansPerMeter() {
        return this.curvatureValueCase_ == 2;
    }

    public boolean hasStartPointFraction() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bq newBuilder(bt btVar) {
        return (bq) DEFAULT_INSTANCE.createBuilder(btVar);
    }

    public static bt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bt parseFrom(com.google.v.z zVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bt parseFrom(InputStream inputStream) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(ByteBuffer byteBuffer) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bt parseFrom(byte[] bArr) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
